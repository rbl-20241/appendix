package rb.hsv.appendix.ccd;

import org.jetbrains.annotations.NotNull;
import rb.hsv.appendix.TextOnly;

import java.io.File;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.apache.commons.io.FileUtils.listFiles;
import static rb.hsv.appendix.Constants.EXTENSIONS;
import static rb.hsv.appendix.Util.getBookIndex;
import static rb.hsv.appendix.ccd.Ref.*;
import static rb.hsv.appendix.ccd.valid.util.Valid.isValidNextWord;
import static rb.hsv.appendix.ccd.valid.util.Valid.isValidVariant;

public class Util {

    public static Boolean isBijlage;
    public static @NotNull ArrayList<File> findFiles(final String map, final boolean recursive) {
        File dir = new File(map);
        var col = listFiles(dir, EXTENSIONS, recursive);

        return new ArrayList<>(col);
    }

    public static @NotNull ArrayList<File> findFiles(final String map) {
        return findFiles(map, false);
    }

    public static @NotNull String getBookIndexForConcordantie(String bookRef) {
        int i = getBookIndex(bookRef);
        return i < 10 ? "0" + i : "" + i;
    }

    private static boolean isTextBeforeIsVerseId(final @NotNull String before) {
        return before.startsWith("<a id=\"") && before.length() < 16 && before.endsWith(">");
    }

    private static boolean isValidArgument(final @NotNull String arg, final String before, final String after) {
        if (arg.equals(SPAN)) {
            if (before.endsWith(OPEN_TAG) || before.endsWith(CLOSE_TAG)) {
                return false;
            }
        }

//        if (before.endsWith(OPEN_CON_SPAN)) {
//            return false;
//        } else
        if (before.endsWith(OPEN_ITALIC) && after.startsWith(CLOSE_ITALIC)) {
            var newBefore = before.substring(0, before.length()-OPEN_ITALIC.length());
            var newAfter = after.substring(CLOSE_ITALIC.length());

            return isTextBeforeArgumentOk(newBefore) && isTextAfterArgumentOk(newAfter);
        } else if (before.endsWith(OPEN_CON_SPAN) && after.startsWith(CLOSE_CON_SPAN))  {
            return true;
        } else if (before.endsWith(OPEN_ITALIC) && isTextAfterArgumentOk(after))  {
            return true;
        } else if (after.startsWith(CLOSE_ITALIC) && isTextBeforeArgumentOk(before))  {
            return true;
        } else if (before.endsWith(OPEN_A_TAG) && after.startsWith(CLOSE_A_TAG)) {
            return true;
        } else if (isTextBeforeArgumentOk(before) && after.startsWith(HREF_IS_NOTE)) {
            return true;
        } else if (isTextBeforeArgumentOk(before) && after.startsWith(CLOSE_P_TAG)) {
            return true;
        } else if (before.endsWith(CLOSE_SUP_TAG) && isTextAfterArgumentOk(after)) {
            return true;
        } else if (isTextBeforeIsVerseId(before) && isTextAfterArgumentOk(after)) {
            return true;
        } else if (before.endsWith(HREF)) {
            return false;
        } else if (before.endsWith(NEW_LINE) && isTextAfterArgumentOk(after)) {
            return true;
        } else if (isTextBeforeArgumentOk(before) && after.startsWith(NEW_LINE)) {
            return true;
        } else if (before.endsWith(POETRY) && isTextAfterArgumentOk(after)) {
            return true;
        } else if (before.endsWith(QUOTE_OPEN) && after.startsWith(QUOTE_CLOSE)) {
            return true;
        } else if (before.endsWith(QUOTE_OPEN) && isTextAfterArgumentOk(after)) {
            return true;
        } else if (isTextBeforeArgumentOk(before) && after.startsWith(QUOTE_CLOSE)) {
            return true;
        } else {
            return isTextBeforeArgumentOk(before)
                    && isTextAfterArgumentOk(after);
        }
    }

    private static boolean isValidWbArgument(final String line, final @NotNull String before, final String after) {
        return before.endsWith(BEFORE_WB)
                && after.startsWith(AFTER_WB)
                && !line.startsWith(FOOTNOTE);
    }

    private static boolean isFoundArgument(final String foundString, final String arg, final boolean isCaseSensitive) {
        var argument = isCaseSensitive ? arg : arg.toLowerCase();
        var str = isCaseSensitive ? foundString : foundString.toLowerCase();
        return argument.equals(str);
    }

    private static boolean isTextBeforeArgumentOk(final @NotNull String before) {
        if (before.isBlank() || before.isEmpty()) {
            return true;
        }

        var possibleStrings = new HashSet<>(Arrays.asList(" ", ",", ".", ">", "\"", "'", "(", ")", String.valueOf((char) 160), QUOTE_OPEN));
        for (var possibleString: possibleStrings) {
            if (before.endsWith(possibleString)) {
                return true;
            }
        }

        return false;

//        Set<Character> validChars = new HashSet<>(Arrays.asList(' ', ',', '.', '?', '!', '<', ';', ':', '\"', '\'', '(', ')', (char) 160, (char) 8216));
//        var lastChar = before.charAt(before.length()-1);
//        return validChars.contains(lastChar);
    }

//    private static boolean isFootNote(final String line) {
//        return line.startsWith(FOOTNOTE);
//    }

    private static boolean isTextAfterArgumentOk(final @NotNull String after) {
        if (after.isBlank() || after.isEmpty()) {
            return true;
        }
        var possibleStrings = new HashSet<>(Arrays.asList(" ", ",", ".", "?", "!", "<", ";", ":", "\"", "'",  "(", ")", String.valueOf((char) 160), QUOTE_CLOSE));
        for (var possibleString: possibleStrings) {
            if (after.startsWith(possibleString)) {
                return true;
            }
        }

        return false;

//        Set<Character> validChars = new HashSet<>(Arrays.asList(' ', ',', '.', '?', '!', '>', ';', ':', '\"', '\'', '(', ')', (char) 160, (char) 8217));
//        if (after.isBlank() || after.isEmpty()) {
//            return true;
//        }
//
//        var firstChar = after.charAt(0);
//        return validChars.contains(firstChar);
    }

    public static boolean isValidArgument(final @NotNull String line, final int startPos, final int endPos, final String keyArg, final String arg, final boolean isCaseSensitive, final File thisFile, final String vs, final boolean isSamengesteldWerkwoord) {
        var argument = line.substring(startPos, endPos);
        var before = line.substring(0, startPos);
        var after = line.substring(endPos);

        return isFoundArgument(argument, arg, isCaseSensitive)
                && isValidArgument(arg, before, after)
                && isValidNextWord(arg, line, thisFile, vs)
                && isValidVariant(keyArg, arg, thisFile, vs, isSamengesteldWerkwoord);
    }

    public static boolean isValidWbArgument(final @NotNull String line, final int startPos, final int endPos, final String arg) {
        var argument = line.substring(startPos, endPos);
        var before = line.substring(0, startPos);
        var after = line.substring(endPos);

        return isFoundArgument(argument, arg, false)
                && isValidWbArgument(line, before, after);
    }

    public static HashSet<String> getEndOfLineIndicators() {
        return new HashSet<>(Arrays.asList(".", "?", "!", ":"));  // ; moet eigenlijk ook
    }

    public static boolean isNearEnough(final String line, final int startPos1, final int startPos2, final File curFile, final String vs, final String arg1, final String arg2) {
        if (isValidNearEnough(curFile, vs, arg1, arg2)) {
            return true;
        }
        var pos1 = Math.min(startPos1, startPos2);
        var pos2 = Math.max(startPos1, startPos2);

        var tmpLine = line.substring(pos1, pos2);
        var isNearEnough = !hasLineDivider(tmpLine);

        if (!isNearEnough) {
            var tmpLine2 = line.substring(pos1);
            var lineDivider = lineDivider(tmpLine2);
            var posLineDivider = tmpLine2.indexOf(lineDivider);
            var tmpLine3 = tmpLine2.substring(posLineDivider);
            var startPos1a = tmpLine3.indexOf(arg1);
            var startPos2a = tmpLine3.indexOf(arg2);
            if (startPos1a > 0 && startPos2a > 0) {
                pos1 = Math.min(startPos1a, startPos2a);
                pos2 = Math.max(startPos1a, startPos2a);

                tmpLine = tmpLine3.substring(pos1, pos2);
                isNearEnough = !hasLineDivider(tmpLine);
            }
        }

        return isNearEnough;
    }

    private static boolean hasLineDivider(final @NotNull String line) {
        return line.contains(".")
                || (line.contains(";") && tmpLineContainsUnicode(line))
                || line.contains(":")
                || line.contains("?")
                || line.contains("!");
    }

    private static String lineDivider(final @NotNull String line) {
        var posPoint = line.indexOf(".");
        var posColon = line.indexOf(":");
        var posSemicolon = line.indexOf(";");
        var posQuestionMark = line.indexOf("?");
        var posExclamationMark = line.indexOf("!");
        var firstPos = 0;
        var divider = "";
        if (posPoint > 0) {
            firstPos = posPoint;
            divider = ".";
        }
        if (posColon > 0 && posColon < firstPos) {
            firstPos = posColon;
            divider = ":";
        }
        if ((posSemicolon > 0 && tmpLineContainsUnicode(line)) && posSemicolon < firstPos) {
            firstPos = posSemicolon;
            divider = ";";
        }
        if (posQuestionMark > 0 && posQuestionMark < firstPos) {
            firstPos = posQuestionMark;
            divider = "?";
        }
        if (posExclamationMark > 0 && posExclamationMark < firstPos) {
            divider = "!";
        }

        return divider;
//        return line.contains(".") ? "."
//                : (line.contains(";") && tmpLineContainsUnicode(line)) ? ";"
//                : line.contains(":") ? ":"
//                : line.contains("?") ? "?"
//                : line.contains("!") ? "!"
//                : "";
    }

    private static boolean isValidNearEnough(final @NotNull File curFile, final String vs, final String arg1, final String arg2) {
        return curFile.getAbsolutePath().endsWith("2Sam-20.html")
                && vs.equals("021")
                && argumentsFound("lever", "uit", arg1, arg2);
    }

    private static boolean argumentsFound(final @NotNull String arg1, final String arg2, final String curArg1, final String curArg2) {
        return (arg1.equals(curArg1) || arg1.equals(curArg2))
                && (arg2.equals(curArg1) || arg2.equals(curArg2));
    }

    private static boolean tmpLineContainsUnicode(final @NotNull String tmpLine) {
        var posSemiColon = tmpLine.indexOf(";");
        return posSemiColon > 5 && (tmpLine.indexOf("&#") == posSemiColon - 4);
    }

    public static @NotNull String getVerseNumberForConcordantie(final @NotNull String line) {
        String t1 = line.substring(line.indexOf("id=\"vs") + 6);
        StringBuilder vsNumber = new StringBuilder(t1.substring(0, t1.indexOf("\"")));

        while (vsNumber.length() < 3) {
            vsNumber.insert(0, "0");
        }

        return vsNumber.toString();
    }


    public static String getTextOnlyLine(final String line, final @NotNull TextOnly textOnly) {
        if (!textOnly.ignoreLine(line)) {
            return textOnly.convertLine(line);
        }

        return line;
    }

    public static boolean isZieBijlage(final @NotNull String arg) {
        isBijlage = arg.startsWith(ZIE_BF)
                || arg.startsWith(ZIE_GD)
                || arg.startsWith(ZIE_MD)
                || arg.startsWith(ZIE_MG)
                || arg.startsWith(ZIE_CM)
                || arg.startsWith(ZIE_ML)
                || arg.startsWith(ZIE_MM)
                || arg.startsWith(ZIE_MS)
                || arg.startsWith(ZIE_OF)
                || arg.startsWith(ZIE_WB);

        return isBijlage;
    }

    public static boolean isBijlageArgument(final String arg) {
        return isBijlage
                && (arg.startsWith("bf")
                || arg.startsWith("gd")
                || arg.startsWith("md")
                || arg.startsWith("mg")
                || arg.startsWith("cm")
                || arg.startsWith("ml")
                || arg.startsWith("mm")
                || arg.startsWith("ms")
                || arg.startsWith("of")
                || arg.startsWith("wb"));
    }

    public static boolean isZieBijlage(final String[] args) {
        var list = Arrays.asList(args);
        return isZieBijlage(list);
    }

    public static boolean isZieBijlage(final @NotNull List<String> list) {
        boolean isBijlage;

        if (list.size() == 1) {
            isBijlage = false;
        } else  {
            isBijlage = isZieBijlage(list.get(1));
        }

        return isBijlage;
    }

//    public static int getStartPosArgInLine(final String line, final String arg, final boolean isCaseSensitive) {
//        return isCaseSensitive ? line.indexOf(arg) : line.toLowerCase().indexOf(arg);
//    }
//
//    public static String getCurrentTime() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        return  dtf.format(now);
//    }

    public static @NotNull String getDuration(final LocalDateTime start, final LocalDateTime end) {
        LocalDateTime tempDateTime = start;

        long hours = tempDateTime.until( end, ChronoUnit.HOURS );
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until( end, ChronoUnit.MINUTES );
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( end, ChronoUnit.SECONDS );

        return (hours < 10 ? "0" + hours : hours)
                + ":"
                + (minutes < 10 ? "0" + minutes : minutes)
                + ":"
                + (seconds < 10 ? "0" + seconds : seconds);
    }

    private static long lineCount;

    public static void resetLineCount() {
        lineCount = 0;
    }

    public static void log(final String line, final boolean isNewLine) {
        if (isNewLine) {
            lineCount++;
            System.out.print(lineCountAsString(lineCount) + " " + line);
        } else {
            System.out.print(line);
        }
    }

    public static void logln(final String line, final boolean isNewLine) {
        if (isNewLine) {
            lineCount++;
            System.out.println(lineCountAsString(lineCount) + " " + line);
        } else {
            System.out.println(line);
        }
    }

    private static @NotNull String lineCountAsString(final long cnt) {
        var result = new StringBuilder(cnt + ".");

        while (result.length() < 7) {
            result.insert(0, " ");
        }

        return result.toString();
    }

    public static boolean isNotValidLine(final @NotNull String line) {
        return line.contains(PERICOPE)
                || line.contains(FOOTNOTE);
    }

    public static int searchArg(final String line, final String arg) {
        return searchArg(line, arg, 0);
    }

    public static int searchArg(final String line, final String arg, final int fromIndex) {

        var argLocation = -1;
        var endPos = fromIndex;

        while (argLocation < 0) {
            var startPos = line.indexOf(arg, endPos);
            if (startPos > -1) {
                endPos = startPos + arg.length();
                var before = line.substring(0, startPos);
                var after = line.substring(endPos);

                if (isTextBeforeArgumentOk(before) && isTextAfterArgumentOk(after)) {
                    argLocation = startPos;
                    break;
                }
            } else {
                break;
            }
        }

        return argLocation;
    }

    public static boolean isArgMetMeerdereSpaties(final @NotNull String arg) {
        return arg.chars().filter(ch -> ch == ' ').count() > 1;
    }


    public static @NotNull String changeHighAscii(final @NotNull String arg) {
        return arg.replaceAll("&#201;", "E")
                .replaceAll("&#228;", "a")
                .replaceAll("&#233;", "e")
                .replaceAll("&#235;", "e")
                .replaceAll("&#237;", "i")
                .replaceAll("&#239;", "i")
                .replaceAll("&#243;", "o")
                .replaceAll("&#252;", "u");
    }

    public static boolean isEqual(final @NotNull String arg1, final String arg2) {
        return arg1.equals(changeHighAscii(arg2));
    }

}
