package rb.hsv.appendix.ccd;

import rb.hsv.appendix.TextOnly;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import static rb.hsv.appendix.Util.getLineSeparator;
import static rb.hsv.appendix.ccd.Debug.isDebug;
import static rb.hsv.appendix.ccd.Ref.*;
import static rb.hsv.appendix.ccd.Ref.CLOSE_CON_SPAN;
import static rb.hsv.appendix.ccd.Util.*;
import static rb.hsv.appendix.ccd.valid.util.Valid.*;

public class AddConSpan {

    public void markFoundRefs(final SortedMap<String, Ref> foundRefs, final boolean isCaseSensitive) {
        foundRefs.forEach((key, ref) -> {
            var keyArg = ref.getKeyArg();
            ref.getArgList().forEach(currentArgument -> {
                try {
                    var textOnly = new TextOnly();
                    textOnly.setEersteVersGevonden(false);
                    File refFile = ref.getFile();
                    String orgFile = refFile.getAbsolutePath() + ".org";
                    Files.move(Paths.get(refFile.getAbsolutePath()),
                            Paths.get(orgFile),
                            StandardCopyOption.REPLACE_EXISTING);

                    File f = new File(orgFile);
                    Stream<String> lines = Files.lines(Paths.get(f.getAbsolutePath()));
                    File newFile = new File(ref.getFile().getAbsolutePath());
                    FileOutputStream fos = new FileOutputStream(newFile);
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
                    AtomicReference<String> lineVerse = new AtomicReference<>("");

                    if (isDebug(refFile, currentArgument)) {
                        System.out.print("");
                    }

                    lines.forEach(opsLine -> {
                        try {
                            if (opsLine.contains("id=\"vs")) {
                                textOnly.setEersteVersGevonden(true);
                                lineVerse.set(getVerseNumberForConcordantie(opsLine));
                            }

                            var isVerseWithArg = lineVerse.get().equals(ref.getVerse());
                            if (isDebug(refFile) && isVerseWithArg && lineVerse.get().equals("010")) {
                                System.out.print("");
                            }
                            var isSamengesteldWerkwoordArgument = ref.isSamengesteldWerkwoord() && currentArgument.contains(" ");
                            var textOnlyLine = getTextOnlyLine(opsLine, textOnly);

                            boolean textOnlyLineContainsArgument = false;
                            boolean textOnlyLineContainsArguments = false;
                            var currentArgument1 = "";
                            var currentArgument2 = "";
                            if (isSamengesteldWerkwoordArgument) {
                                currentArgument1 = currentArgument.substring(0, currentArgument.indexOf(" "));
                                currentArgument2 = currentArgument.substring(currentArgument.indexOf(" ")+1);
                                textOnlyLineContainsArguments = isCaseSensitive ?
                                        (textOnlyLine.contains(currentArgument1) && textOnlyLine.contains(currentArgument2)) :
                                        (textOnlyLine.toLowerCase().contains(currentArgument1) && textOnlyLine.toLowerCase().contains(currentArgument2));

                            } else {
                                textOnlyLineContainsArgument = isCaseSensitive ?
                                        textOnlyLine.contains(currentArgument) :
                                        textOnlyLine.toLowerCase().contains(currentArgument);
                            }
                            var isBijlageArg = isBijlageArgument(currentArgument);

                            if (isVerseWithArg && (textOnlyLineContainsArgument || isBijlageArg)) {
                                //String newLine = addConcordantieSpan(keyArg, currentArgument, ref.getNrOfArgsInLine(), opsLine, textOnlyLine, isCaseSensitive, ref.getFile(), ref.getVerse(), ref.isSamengesteldWerkwoord());
                                String newLine = addConcordantieSpan(keyArg, currentArgument, ref.getNrOfArgsInLine(), opsLine, textOnlyLine, isCaseSensitive, ref.getFile(), ref.getVerse(), currentArgument.contains(" "));
                                writer.write(newLine);
                            } else if (isVerseWithArg && textOnlyLineContainsArguments) {
                                String newLine = addConcordantieSpanSamengesteldWerkwoord(keyArg, currentArgument1, currentArgument2, ref.getNrOfArgsInLine(), opsLine, textOnlyLine, ref.getFile(), ref.getVerse());
                                writer.write(newLine);
                            } else {
                                writer.write(opsLine);
                            }
                            writer.write(getLineSeparator());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

                    Files.delete(Paths.get(orgFile));

                    writer.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        });
    }

    private String addConcordantieSpan(final String keyArg, final String argument, final int nrOfArguments, final String opsLine, final String textOnlyLine, final boolean isCaseSensitive, final File curFile, final String curVerse, final boolean isSamengesteldWerkwoord) {
        if (isNotValidLine(opsLine)) {
            return opsLine;
        }

        if (isDebug(curFile, Integer.parseInt(curVerse), argument)) {
            log("", false);
        }

        var newLine = new StringBuilder();
        var tmpOpsLine = opsLine;
        int nrOfFoundArgs;
        var isBijlageArg = isBijlageArgument(argument);
        var opsArg = argument;
        if (opsArg.contains("HEERE")) {
            opsArg = opsArg.replace("HEERE", "<small>HEERE</small>");
        }
        else if (opsArg.contains("SPRUIT")) {
            opsArg = opsArg.replace("SPRUIT", "<small>SPRUIT</small>");
        }

        var textOnlyLineTmp = isCaseSensitive ? textOnlyLine : textOnlyLine.toLowerCase();
        try {
            for (nrOfFoundArgs = 0; nrOfFoundArgs < nrOfArguments; nrOfFoundArgs++) {
                var isTmpOpsLineContainsArg = isCaseSensitive ? tmpOpsLine.contains(opsArg) : tmpOpsLine.toLowerCase().contains(opsArg);
                if (isBijlageArg) {
                    var startPos = tmpOpsLine.indexOf(opsArg) + opsArg.length() + AFTER_WB.length();
                    var endPos = tmpOpsLine.indexOf(CLOSE_A_TAG, startPos);
                    var str = tmpOpsLine.substring(startPos, endPos);
                    while (startPos > (opsArg.length() + AFTER_WB.length())) {
                        newLine.append(tmpOpsLine, 0, startPos).append(OPEN_CON_SPAN).append(str).append(CLOSE_CON_SPAN);

                        tmpOpsLine = tmpOpsLine.substring(endPos);
                        startPos = tmpOpsLine.indexOf(opsArg) + opsArg.length() + AFTER_WB.length();
                        endPos = tmpOpsLine.indexOf(CLOSE_A_TAG, startPos);

                        nrOfFoundArgs++;
                    }

                } else if (!isTmpOpsLineContainsArg && !textOnlyLineTmp.contains(argument)) {
                    newLine.append(tmpOpsLine);
                } else if (isTmpOpsLineContainsArg) {
                    int startPos = isCaseSensitive ? searchArg(tmpOpsLine, opsArg) : searchArg(tmpOpsLine.toLowerCase(), opsArg);
                    int endPos = startPos + opsArg.length();

                    while (startPos > 0) {
                        if (isDebug(curFile, Integer.parseInt(curVerse), argument)) {
                            log("", false);
                        }

                        var isValidArgument = isValidArgument(tmpOpsLine, startPos, endPos, keyArg, opsArg, isCaseSensitive, curFile, curVerse, isSamengesteldWerkwoord)
                                && isValidWerkwoord(keyArg, opsArg, curFile, curVerse)
                                && isSameArgumentInCurrentVerse(keyArg, opsArg, curFile, curVerse);
                        if (!isValidArgument || (tmpOpsLine.contains(OPEN_CON_SPAN) && tmpOpsLine.indexOf(OPEN_CON_SPAN) == (startPos - OPEN_CON_SPAN.length()))) {
                            newLine.append(tmpOpsLine, 0, endPos);
                        } else {
                            var argWithSameCase = tmpOpsLine.substring(startPos, endPos);
                            newLine.append(tmpOpsLine, 0, startPos).append(OPEN_CON_SPAN).append(argWithSameCase).append(CLOSE_CON_SPAN);
                        }

                        if (isValidArgument) {
                            nrOfFoundArgs++;
                        }
                        tmpOpsLine = tmpOpsLine.substring(endPos);
                        startPos = searchArg(tmpOpsLine, opsArg);
                        endPos = startPos + opsArg.length();
                    }
                } else if (textOnlyLineTmp.contains(argument)) {
                    int startOpenTag = 0;
                    int endOpenTag;
                    int startCloseTag = 0;
                    int endCloseTag;
                    while (startOpenTag > -1) {
                        int lengthStartTag = 3;
                        int lengthEndTag = 4;
                        //startOpenTag = tmpOpsLine.indexOf(OPEN_ITALIC, startCloseTag);
                        startOpenTag = tmpOpsLine.indexOf(OPEN_ITALIC);
                        if (startOpenTag > -1) {
                            startCloseTag = tmpOpsLine.indexOf(CLOSE_ITALIC, startOpenTag);
                            endOpenTag = startOpenTag + lengthStartTag;
                            endCloseTag = startCloseTag + lengthEndTag;
                            StringBuilder tLine = new StringBuilder();
//                            var append = tLine.append(tmpOpsLine, 0, startOpenTag)
//                                    .append(tmpOpsLine, endOpenTag, startCloseTag)
//                                    .append(tmpOpsLine.substring(endCloseTag));
                            int startPosArg = tLine.indexOf(argument);
                            if (startPosArg >= 0) {
                                int endPos = startPosArg + lengthStartTag + lengthEndTag + argument.length();
                                if (startPosArg == startOpenTag) {
                                    newLine.append(tmpOpsLine, 0, startOpenTag)
                                            .append(OPEN_CON_SPAN)
                                            .append(OPEN_ITALIC)
                                            .append(tmpOpsLine, endOpenTag, startCloseTag)
                                            .append(CLOSE_ITALIC)
                                            .append(tmpOpsLine, endCloseTag, endPos)
                                            .append(CLOSE_CON_SPAN);
                                } else {
                                    newLine.append(tmpOpsLine, 0, startPosArg)
                                            .append(OPEN_CON_SPAN)
                                            .append(tmpOpsLine, startPosArg, startOpenTag)
                                            .append(OPEN_ITALIC)
                                            .append(tmpOpsLine, endOpenTag, startCloseTag)
                                            .append(CLOSE_ITALIC)
                                            .append(CLOSE_CON_SPAN);
                                }

                                if (startPosArg >= 0) {
                                    nrOfFoundArgs++;
                                    tmpOpsLine = tmpOpsLine.substring(endPos);
                                }
                            } else {
                                newLine.append(tmpOpsLine, 0, startOpenTag)
                                        .append(OPEN_ITALIC)
                                        .append(tmpOpsLine, endOpenTag, startCloseTag)
                                        .append(CLOSE_ITALIC);

                                int endPos = startCloseTag + lengthEndTag;
                                tmpOpsLine = tmpOpsLine.substring(endPos);
                            }
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return opsLine;
        } catch (Exception e) {
            return opsLine;
        }


        if (nrOfFoundArgs < nrOfArguments) {
            newLine = findArgument(opsArg, newLine.toString());
        }

        newLine.append(tmpOpsLine);

        return newLine.toString();
    }

    private String addConcordantieSpanSamengesteldWerkwoord(final String keyArg, final String argument1, final String argument2, final int nrOfArguments, final String opsLine, final String textOnlyLine, final File curFile, final String curVerse) {
        if (isNotValidLine(opsLine)) {
            return opsLine;
        }

        var newLine = new StringBuilder();
        var tmpOpsLine = opsLine;
        int nrOfFoundArgs;
        var opsArg1 = argument1;
        var opsArg2 = argument2;

        if (isDebug(curFile, Integer.parseInt(curVerse), opsArg1, opsArg2)) {
            log("", false);
        }

        var textOnlyLineTmp = textOnlyLine.toLowerCase();
        try {
            for (nrOfFoundArgs = 0; nrOfFoundArgs < nrOfArguments; nrOfFoundArgs++) {
                var isTmpOpsLineContainsArgs = tmpOpsLine.toLowerCase().contains(opsArg1) && tmpOpsLine.toLowerCase().contains(opsArg2);
                if (!isTmpOpsLineContainsArgs && !(textOnlyLineTmp.contains(argument1) || textOnlyLineTmp.contains(argument2))) {
                    newLine.append(tmpOpsLine);
                } else if (isTmpOpsLineContainsArgs) {
                    var startPos1 = searchArg(tmpOpsLine.toLowerCase(), opsArg1);
                    var startPos2 = searchArg(tmpOpsLine.toLowerCase(), opsArg2);

                    while ((startPos1 > 0) && (startPos2 > 0)) {
                        var endPos1 = startPos1 + opsArg1.length();
                        var endPos2 = startPos2 + opsArg2.length();

                        if (startPos1 > startPos2) {
                            var tmpPos = startPos1;
                            startPos1 = startPos2;
                            startPos2 = tmpPos;
                            tmpPos = endPos1;
                            endPos1 = endPos2;
                            endPos2 = tmpPos;
                            var tmpArg = opsArg1;
                            opsArg1 = opsArg2;
                            opsArg2 = tmpArg;
                        }

                        var firstChangeLine = new StringBuilder();
//                        var isValidArguments = isValidArgument(tmpOpsLine, startPos1, endPos1, keyArg, opsArg1, false, curFile, curVerse, true)
//                                && isValidArgument(tmpOpsLine, startPos2, endPos2, keyArg, opsArg2, false, curFile, curVerse, true)
//                                && isValidSamengesteldWerkwoord(opsArg1, opsArg2, curFile, curVerse, true);
                        var isValidArg1 = isValidArgument(tmpOpsLine, startPos1, endPos1, keyArg, opsArg1, false, curFile, curVerse, true)
                                && isSameArgumentsInCurrentVerse(opsArg1, opsArg2, curFile, curVerse);
                        var isValidArg2 = isValidArgument(tmpOpsLine, startPos2, endPos2, keyArg, opsArg2, false, curFile, curVerse, true)
                                && isSameArgumentsInCurrentVerse(opsArg1, opsArg2, curFile, curVerse);
                        var isArg1AlreadyConSpan = tmpOpsLine.contains(OPEN_CON_SPAN) && (tmpOpsLine.indexOf(OPEN_CON_SPAN) == (startPos1 - OPEN_CON_SPAN.length()));
                        var isArg2AlreadyConSpan = tmpOpsLine.contains(OPEN_CON_SPAN) && (tmpOpsLine.indexOf(OPEN_CON_SPAN) == (startPos2 - OPEN_CON_SPAN.length()));
                        var isValidArgs = isValidArg1 && isValidArg2;
                        if (!isValidArg1) {
                            newLine.append(tmpOpsLine, 0, endPos1);
                        } else if (!isValidArg2 ) {
                            newLine.append(tmpOpsLine, 0, endPos2);
                        }

                        if (isValidArgs) {
                            if (!isArg1AlreadyConSpan) {
                                var endString = tmpOpsLine.substring(endPos1);
                                var argWithSameCase1 = tmpOpsLine.substring(startPos1, endPos1);
                                firstChangeLine.append(tmpOpsLine, 0, startPos1).append(OPEN_CON_SPAN).append(argWithSameCase1).append(CLOSE_CON_SPAN);
                                firstChangeLine.append(endString);
                                tmpOpsLine = firstChangeLine.toString();
                            }

                            startPos2 = searchArg(tmpOpsLine.toLowerCase(), opsArg2);
                            endPos2 = startPos2 + opsArg2.length();
                            if (!isArg2AlreadyConSpan) {
                                var argWithSameCase2 = tmpOpsLine.substring(startPos2, endPos2);
                                newLine.append(tmpOpsLine, 0, startPos2).append(OPEN_CON_SPAN).append(argWithSameCase2).append(CLOSE_CON_SPAN);
                            } else {
                                newLine.append(tmpOpsLine, 0, endPos2);
                            }
                        }

                        if (isValidArgs) {
                            nrOfFoundArgs++;

                            if (isDebug(curFile, Integer.parseInt(curVerse), opsArg1, opsArg2)) {
                                log("", false);
                            }

                            tmpOpsLine = tmpOpsLine.substring(endPos2);
                            startPos1 = searchArg(tmpOpsLine.toLowerCase(), opsArg1);
                            startPos2 = searchArg(tmpOpsLine.toLowerCase(), opsArg2);
                        } else {
                            tmpOpsLine = tmpOpsLine.substring(endPos1);
                            startPos1 = searchArg(tmpOpsLine.toLowerCase(), opsArg1);
                            startPos2 = searchArg(tmpOpsLine.toLowerCase(), opsArg2);
                        }

                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            return opsLine;
        } catch (Exception e) {
            return opsLine;
        }

        newLine.append(tmpOpsLine);

        return newLine.toString();

    }

//    private String addConcordantieSpanSamengesteldWerkwoord-2023-12-27(final String keyArg, final String argument1, final String argument2, final int nrOfArguments, final String opsLine, final String textOnlyLine, final File curFile, final String curVerse) {
//        if (isNotValidLine(opsLine)) {
//            return opsLine;
//        }
//
//        var newLine = new StringBuilder();
//        var tmpOpsLine = opsLine;
//        int nrOfFoundArgs;
//        var opsArg1 = argument1;
//        var opsArg2 = argument2;
//
//        var textOnlyLineTmp = textOnlyLine.toLowerCase();
//        try {
//            for (nrOfFoundArgs = 0; nrOfFoundArgs < nrOfArguments; nrOfFoundArgs++) {
//                var isTmpOpsLineContainsArgs = tmpOpsLine.toLowerCase().contains(opsArg1) && tmpOpsLine.toLowerCase().contains(opsArg2);
//                if (!isTmpOpsLineContainsArgs && !(textOnlyLineTmp.contains(argument1) || textOnlyLineTmp.contains(argument2))) {
//                    newLine.append(tmpOpsLine);
//                } else if (isTmpOpsLineContainsArgs) {
//                    int startPos1 = tmpOpsLine.toLowerCase().indexOf(opsArg1);
//                    int endPos1 = startPos1 + opsArg1.length();
//                    int startPos2 = tmpOpsLine.toLowerCase().indexOf(opsArg2);
//                    int endPos2 = startPos2 + opsArg2.length();
//
//                    if (startPos1 > startPos2) {
//                        var tmpPos = startPos1;
//                        startPos1 = startPos2;
//                        startPos2 = tmpPos;
//                        tmpPos = endPos1;
//                        endPos1 = endPos2;
//                        endPos2 = tmpPos;
//                        var tmpArg = opsArg1;
//                        opsArg1 = opsArg2;
//                        opsArg2 = tmpArg;
//                    }
//
//                    while ((startPos1 > 0) && (startPos2 > 0)) {
//                        var firstChangeLine = new StringBuilder();
//                        var isValidArguments = isValidArgument(tmpOpsLine, startPos1, endPos1, keyArg, opsArg1, false, curFile, curVerse, true)
//                                && isValidArgument(tmpOpsLine, startPos2, endPos2, keyArg, opsArg2, false, curFile, curVerse, true);
//                        if (!isValidArguments || (tmpOpsLine.contains(OPEN_CON_SPAN) && tmpOpsLine.indexOf(OPEN_CON_SPAN) == (startPos1 - OPEN_CON_SPAN.length()))) {
//                            newLine.append(tmpOpsLine, 0, endPos1);
//                        } else if (!isValidArguments || (tmpOpsLine.contains(OPEN_CON_SPAN) && tmpOpsLine.indexOf(OPEN_CON_SPAN) == (startPos2 - OPEN_CON_SPAN.length()))) {
//                            newLine.append(tmpOpsLine, 0, endPos2);
//                        } else {
//                            var endString = tmpOpsLine.substring(endPos1);
//                            var argWithSameCase1 = tmpOpsLine.substring(startPos1, endPos1);
//                            firstChangeLine.append(tmpOpsLine, 0, startPos1).append(OPEN_CON_SPAN).append(argWithSameCase1).append(CLOSE_CON_SPAN);
//                            firstChangeLine.append(endString);
//                            tmpOpsLine = firstChangeLine.toString();
//
//                            startPos2 = tmpOpsLine.indexOf(opsArg2);
//                            endPos2 = startPos2 + opsArg2.length();
//                            var argWithSameCase2 = tmpOpsLine.substring(startPos2, endPos2);
//                            newLine.append(tmpOpsLine, 0, startPos2).append(OPEN_CON_SPAN).append(argWithSameCase2).append(CLOSE_CON_SPAN);
//                        }
//
//                        if (isValidArguments) {
//                            nrOfFoundArgs++;
//
//                            tmpOpsLine = tmpOpsLine.substring(endPos2);
//                            startPos1 = tmpOpsLine.indexOf(opsArg1);
//                            endPos1 = startPos1 + opsArg1.length();
//                            startPos2 = tmpOpsLine.indexOf(opsArg2);
//                            endPos2 = startPos2 + opsArg2.length();
//                        } else {
//                            tmpOpsLine = tmpOpsLine.substring(endPos1);
//                            startPos1 = tmpOpsLine.indexOf(opsArg1);
//                            endPos1 = startPos1 + opsArg1.length();
//                            startPos2 = tmpOpsLine.indexOf(opsArg2);
//                            endPos2 = startPos2 + opsArg2.length();
//                        }
//
//                    }
//                }
//            }
//        } catch (IndexOutOfBoundsException e) {
//            return opsLine;
//        } catch (Exception e) {
//            return opsLine;
//        }
//
//        newLine.append(tmpOpsLine);
//
//        return newLine.toString();
//
//    }

    private StringBuilder findArgument(final String arg, final String line) {
        StringBuilder newLine = new StringBuilder();

        // Eerst naar italic zoeken
        int pos1 = line.indexOf(OPEN_ITALIC);
        while (pos1 > 0) {
            int pos2 = line.indexOf(CLOSE_ITALIC, pos1);
            if (pos2 > pos1) {
                String text = line.substring(pos1 + OPEN_ITALIC.length(), pos2);

                if (arg.contains(text)) {
                    newLine = new StringBuilder();
                    if (arg.startsWith(text)) {
                        String str = line.substring(pos1, line.indexOf(" ", pos1));
                        String tmp1 = line.substring(0, pos1);
                        String tmp2 = OPEN_CON_SPAN + str + CLOSE_CON_SPAN;
                        String tmp3 = line.substring(pos1 + OPEN_ITALIC.length() + arg.length() + CLOSE_ITALIC.length());
                        newLine.append(tmp1).append(tmp2).append(tmp3);
                    } else if (arg.endsWith(text)) {
                        int lengthFirstPart = arg.length() - text.length();
                        String str = line.substring(pos1 - lengthFirstPart, line.indexOf(" ", pos1));
                        String tmp1 = line.substring(0, pos1 - lengthFirstPart);
                        String tmp2 = OPEN_CON_SPAN + str + CLOSE_CON_SPAN;
                        String tmp3 = line.substring(pos2 + CLOSE_ITALIC.length());
                        newLine.append(tmp1).append(tmp2).append(tmp3);
                    } else {
                        newLine.append(line);
                    }
                }
                //tmpLine = tmpLine.substring(pos2 + CLOSE_ITALIC.length());
                pos1 = line.indexOf(OPEN_ITALIC, pos2);
            } else {
                pos1 = -1;
            }
        }

        return newLine;
    }

}
