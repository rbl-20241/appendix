package rb.hsv.appendix.ccd;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import rb.hsv.appendix.TextOnly;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

import static rb.hsv.appendix.Constants.*;
import static rb.hsv.appendix.Util.*;
import static rb.hsv.appendix.ccd.Debug.isDebug;
import static rb.hsv.appendix.ccd.Ref.*;
import static rb.hsv.appendix.ccd.Util.*;
import static rb.hsv.appendix.ccd.valid.util.Valid.*;

public class CreateConcordantie {

    private static final Boolean IS_CCD_DEV = false;
    private static final Boolean IS_SHOW_ALL_SAMENGESTELD_WERKWOORD = true;

    private static final String NORMAL_DIVIDER = " - ";
    private static final String VERB_DIVIDER = " # ";
    private static final int MAX_COUNT = IS_CCD_DEV ? 50000 : 500;

    private static final String CONCORDANTIE_PATH =
            IS_CCD_DEV ? CONCORDANTIE_DEV : CONCORDANTIE;
    private BufferedWriter writer;
    private ArrayList<File> htmlFiles;
    private ArrayList<File> textOnlyFiles;
    private ArrayList<String> notFound;
    private ArrayList<String> duplicates;
    private ArrayList<String> tooMuch;
    private SortedMap<String, Ref> foundRefs;
    private Map<Integer, StringBuilder> map;
    private StringBuilder sb;
    private int count;

    public void run() {
        var startTime = LocalDateTime.now();
        init();

        cleanDirectories();
        findDoubles();

        var textOnly = new TextOnly();
        textOnly.run();

        htmlFiles = findFiles(ROOT);
        textOnlyFiles = findFiles(TEXTONLY_DIR);
        for (int i = 0; i < 26; i++) {
            createFile((char) (97 + i));
        }

        showResult();
        printDuration(startTime);
    }

    private void init() {
        duplicates = new ArrayList<>();
        notFound = new ArrayList<>();
        tooMuch = new ArrayList<>();
        resetLineCount();
    }

    private void printDuration(final LocalDateTime startTime) {
        var endTime = LocalDateTime.now();

        var dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        logln("start : " + dtf.format(startTime), false);
        logln("einde : " + dtf.format(endTime), false);
        logln("duur  : " + getDuration(startTime, endTime), false);
    }

    private void cleanDirectories() {
        logln("Begin cleanDirectories", false);

        try {
            var textOnlyDir = new File(TEXTONLY_DIR);
            var concordantieDir = new File(CCD_CONTENT_DIR);
            var origDir = new File(CONTENT_DIR);
            FileUtils.cleanDirectory(textOnlyDir);
            FileUtils.cleanDirectory(concordantieDir);
            FileUtils.copyDirectory(origDir, concordantieDir);
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }

        logln("End cleanDirectories", false);
    }

    private void createFile(final char letter) {
        String filename = "concordantie-" + letter + ".html";
        try {
            String path = Paths.get(CCD_OPS_DIR, filename).toString();
            File newFile = new File(path);
            FileOutputStream fos = new FileOutputStream(newFile);
            writer = new BufferedWriter(new OutputStreamWriter(fos));

            createHeader(letter);
            createConcordantie(letter);
            createFooter();

            writer.close();
            fos.close();
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }
    }

    private void createHeader(char letter) throws IOException {
        String capital = Character.toString(letter).toUpperCase();
        writeLine("<?xml version='1.0' encoding='utf-8'?>");
        writeLine("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:epub=\"http://www.idpf.org/2007/ops\" lang=\"nl\" xml:lang=\"nl\">");
        writeLine("<head>");
        writeLine(1, "<title>Concordantie</title>");
        writeLine(1, "<meta content=\"urn:uuid:dee850af-ae62-4582-8c16-ba4169bc1e74\" name=\"Adept.expected.resource\"/>");
        writeLine(1, "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
        writeLine(1, "<link href=\"../stylesheet.css\" rel=\"stylesheet\" type=\"text/css\"/>");
        writeLine(1, "<link href=\"../page_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>");
        writeLine("</head>");
        writeLine("<body>");
        writeLine(1, "<div class=\"chapnavcontainer\"><a id=\"top\"/>");
        writeLine(2, "<div class=\"index\"><a href=\"inhoud.html\">Inhoudsopgave</a></div>");
        writeLine(2, "<p class=\"bookname\">Concordantie</p>");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            createLink(ch, capital);
        }
        writeLine(1, "</div>");
        writeLine();
    }

    private void createLink(char ch, String capital) throws IOException {
        String chUC = Character.toString(ch).toUpperCase();
        if (chUC.equals(capital)) {
            writeLine(2, "<strong> " + chUC + " </strong>");
        } else {
            writeLine(2, "<a class=\"tocchapterlink\" href=\"concordantie-" + ch + ".html\">[" + chUC + "]</a>");
        }
    }

    private void createConcordantie(final char letter) throws IOException {
        List<String> argList;
        try (Stream<String> args = Files.lines(Paths.get(CONCORDANTIE_PATH))) {
            argList = new ArrayList<>();
            args.forEach(argLine -> {
                        if (!argLine.startsWith("//")) {
                            argList.add(createSortKey(argLine, false) + createArgLine(argLine));
                        }
                    }
            );
        }
        Stream<String> argLines = argList.stream();

        argLines.sorted().forEach(argLine -> {
            try {
                findInFiles(letter, argLine);
            } catch (IOException e) {
                logln(e.getMessage(), true);
            }
        });
    }

    private String createSortKey(final String args, final boolean isCaseSensitive) {
        String[] a = getArgs(args);
        String key = isCaseSensitive ? a[0].trim() : a[0].trim().toLowerCase();
        key = convertHighAscii(key);
        key = key
                .replaceAll("&#201;", "E")
                .replaceAll("&#228;", "a")
                .replaceAll("&#233;", "e")
                .replaceAll("&#235;", "e")
                .replaceAll("&#237;", "i")
                .replaceAll("&#239;", "i")
                .replaceAll("&#243;", "o")
                .replaceAll("&#252;", "u");
        return key + " $ ";
    }

    private String createArgLine(final String args) {
        var newArgs = args;

        if (args.contains("(") && args.contains(")")) {
            newArgs = args.substring(0, args.indexOf("(") - 1) + args.substring(args.indexOf(")") + 1);
        }

        return newArgs;
    }

    private String convertHighAscii(String argLine) {
        return argLine
                .replaceAll("É", "&#201;")
                .replaceAll("Ï", "&#207;")
                .replaceAll("ä", "&#228;")
                .replaceAll("è", "&#232;")
                .replaceAll("é", "&#233;")
                .replaceAll("ë", "&#235;")
                .replaceAll("í", "&#237;")
                .replaceAll("ï", "&#239;")
                .replaceAll("ó", "&#243;")
                .replaceAll("ü", "&#252;")
                .replaceAll("’", "&#8217;");
    }

    private String convertHtmlCodes(final String argument) {
        return argument
                .replaceAll("&#201;", "É")
                .replaceAll("&#207;", "Ï")
                .replaceAll("&#228;", "ä")
                .replaceAll("&#232;", "è")
                .replaceAll("&#233;", "é")
                .replaceAll("&#235;", "ë")
                .replaceAll("&#237;", "í")
                .replaceAll("&#239;", "ï")
                .replaceAll("&#243;", "ó")
                .replaceAll("&#252;", "ü")
                .replaceAll("&#8217;", "’");
    }

    private void findInFiles(final char letter, final String argLine) throws IOException {
        // boolean isCaseSensitive = Character.isUpperCase(argLine.charAt(argLine.indexOf(" $ ") + 3));
        var isCaseSensitive = isArgCaseSensitive(argLine);
        var isSamengesteldWerkwoord = isSamengesteldWerkwoord(argLine);
        var searchChar = isCaseSensitive ? Character.toString(letter) : Character.toString(letter).toLowerCase();
        var line = convertHighAscii(argLine);
        var keyArg = getKeyArgument(argLine);
        foundRefs = new TreeMap<>();
        map = new TreeMap<>();
        count = 0;
        sb = new StringBuilder();
        String searchLine = isCaseSensitive ? line : line.toLowerCase();

        if (searchLine.startsWith(searchChar)) {
            ArrayList<String> args = splitArguments(line);
            if (args.size() > 1 && Util.isZieBijlage(args.get(1))) {
                searchBijlageArgs(args.get(1), line);
            } else {
                isBijlage = false;
                args.forEach(arg -> searchArgument(arg, line, isCaseSensitive, isSamengesteldWerkwoord));
            }
            map = sortRefs();
            if (count <= MAX_COUNT) {
                if (count > 0) {
                    saveResult(map, keyArg, args);
                }
            } else {
                addTooMuch(keyArg + " (" + count + ")", argLine);
            }

            if (DEV_MODE) {
                var addConSpan = new AddConSpan();
                addConSpan.markFoundRefs(foundRefs, isCaseSensitive);
            }
            delay(100);
        }
    }

    private boolean isArgCaseSensitive(final String argLine) {
        var arg = argLine.substring(argLine.indexOf(" $ ") + 3);
        var firstArg = getFirstArg(arg);
        var isCaseSensitive = false;

        for (int i = 0; i < firstArg.length() && !isCaseSensitive; i++) {
            isCaseSensitive = Character.isUpperCase(firstArg.charAt(i));
        }

        return isCaseSensitive;
    }

    private boolean isSamengesteldWerkwoord(final String argLine) {
        return argLine.contains(VERB_DIVIDER);
    }

    private String[] getArgs(final String args) {
        if (args.contains(NORMAL_DIVIDER)) {
            return args.split(NORMAL_DIVIDER);
        }

        if (args.contains(VERB_DIVIDER)) {
            return args.split(VERB_DIVIDER);
        }

        return new String[] {args};
    }

    private String getFirstArg(final String args) {
        return getArgs(args)[0];
    }

    private void searchBijlageArgs(final String argument, final String argLine) {
        var arg = argument.substring(4);
        var keyArg = getKeyArgument(argLine);
        List<String> lines = new ArrayList<>();
        String bookRef;

        log(convertHtmlCodes(arg), true);
        var totalArgs = 0;
        for (File thisFile : htmlFiles) {
            if (checkFile(thisFile.getName())) {
                bookRef = getBookRef(thisFile.getName());
                if (isDebug(arg)) {
                    log("", false);
                }

                if (bookRef != null) {
                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {
                        lines = br.lines().toList();
                    } catch (IOException e) {
                        logln(e.getMessage(), true);
                    }

                    var vs = "";
                    var bookName = getBookName(thisFile.getName());
                    var bookIndex = getBookIndexForConcordantie(bookRef);
                    var chapter = getChapter(thisFile.getName(), false);
                    for (String line : lines) {
                        var firstArgInLine = true;

                        if (line.contains("id=\"vs")) {
                            vs = getVerseNumberForConcordantie(line);
                        }

                        if (line.contains(arg)) {
                            var tmpLine = line;
                            var nrOfArgsInLine = 0;
                            while (tmpLine.contains(arg)) {
                                int startPos = tmpLine.indexOf(arg);
                                int endPos = startPos + arg.length();

                                if (startPos > 0) {
                                    var isValidWbArgument = isValidWbArgument(tmpLine, startPos, endPos, arg);
                                    if (isValidWbArgument) {
                                        nrOfArgsInLine++;
                                        totalArgs++;
                                        count++;
                                    }
                                }

                                tmpLine = tmpLine.substring(endPos);
                            }

                            for (int c = 0; c < nrOfArgsInLine; c++) {
                                String filename = bookName + "-" + chapter + ".html";
                                String index = bookIndex + " @ " + filename + "-" + vs;

                                if (isDebug(thisFile, arg)) {
                                    log("", false);
                                }
                                if (foundRefs.get(index) != null) {
                                    var newNrOfArgsInLine = foundRefs.get(index).getNrOfArgsInLine() + (firstArgInLine ? nrOfArgsInLine : 0);
                                    foundRefs.get(index).setNrOfArgsInLine(newNrOfArgsInLine);
                                    var argList = foundRefs.get(index).getArgList();
                                    if (!argList.contains(arg)) {
                                        argList.add(arg);
                                        foundRefs.get(index).setArgList(argList);
                                    }
                                } else {
                                    var argList = new ArrayList<String>();
                                    argList.add(arg);
                                    foundRefs.put(index, new Ref(keyArg, arg, filename, vs, 0, nrOfArgsInLine, false, argList));
                                    firstArgInLine = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (totalArgs == 0) {
            if (isDebug(arg)) {
                log("", false);
            }
            addNotFound(arg, argLine);
            logln(" ======> niet gevonden", false);
//        } else if (totalArgs >= MAX_COUNT) {
//            addTooMuch(keyArg + " (" + totalArgs + ")", argLine);
        } else {
            logln("", false);
        }
    }

    private void searchArgument(final String argument, final String argLine, final boolean isCaseSensitive, final boolean isSamengesteldWerkwoord) {
        var arg = argument.trim();
        var keyArg = getKeyArgument(argLine);
        arg = arg.replaceAll("" + (char) 160, " ").trim();
        if (arg.length() > 1) {
            if (arg.charAt(arg.length() - 1) == 160) {
                arg = arg.substring(0, arg.length() - 1);
            }

            List<String> lines = new ArrayList<>();
            String bookRef;

            log(convertHtmlCodes(arg), true);
            var totalArgs = 0;
            for (File thisFile : textOnlyFiles) {
                if (checkFile(thisFile.getName())) {
                    bookRef = getBookRef(thisFile.getName());
                    if (isDebug(thisFile, arg)) {
                        log("", false);
                    }

                    if (bookRef != null) {
                        try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {
                            lines = br.lines().toList();
                        } catch (IOException e) {
                            logln(e.getMessage(), true);
                        }

                        var vs = "";
                        var bookName = getBookName(thisFile.getName());
                        var bookIndex = getBookIndexForConcordantie(bookRef);
                        var chapter = getChapter(thisFile.getName(), false);
                        for (String line : lines) {
                            if (!isSlaOver(keyArg, arg, line)) {
                                var firstArgInLine = true;
                                if (!isCaseSensitive) {
                                    line = line.toLowerCase();
                                }

                                if (line.contains("id=\"vs")) {
                                    vs = getVerseNumberForConcordantie(line);
                                }

                                if (isSamengesteldWerkwoord) {
                                    totalArgs = searchSamengesteldWerkwoordInLine(keyArg, arg, totalArgs, thisFile, vs, bookName, bookIndex, chapter, line, firstArgInLine);
                                } else {
                                    totalArgs = searchArgumentsInLine(isCaseSensitive, keyArg, arg, totalArgs, thisFile, vs, bookName, bookIndex, chapter, line, firstArgInLine, false);
                                }
                            }
                        }
                    }
                }
            }

            if (totalArgs == 0) {
                if (isDebug(arg)) {
                    log("", false);
                }
                addNotFound(arg, argLine);
                logln(" ======> niet gevonden", false);
//            } else if (totalArgs >= MAX_COUNT) {
//                addTooMuch(keyArg + " (" + totalArgs + ")", argLine);
            } else {
                logln("", false);
            }
}
    }

    private int searchArgumentsInLine(final boolean isCaseSensitive, final String keyArg, String arg, int totalArgs, File thisFile, String vs, String bookName, String bookIndex, String chapter, String line, boolean firstArgInLine, boolean isSamengesteldWerkwoord) {
        if (line.contains(arg)) {
            var tmpLine = line;
            var nrOfArgsInLine = 0;
            var startPos = searchArg(tmpLine, arg);
            // while (tmpLine.contains(arg)) {
            while (startPos > 0) {
                if (isDebug(thisFile, arg)) {
                    log("", false);
                }
                // var startPos = getStartPos(tmpLine, arg);
                int endPos = startPos + arg.length();

                // if (startPos > 0) {
                var isValidArgument = isValidArgument(tmpLine, startPos, endPos, keyArg, arg, isCaseSensitive, thisFile, vs, false) &&
                        isValidWerkwoord(keyArg, arg, thisFile, vs)
                            && isSameArgumentInCurrentVerse(keyArg, arg, thisFile, vs);
                if (isValidArgument) {
                    nrOfArgsInLine++;
                    totalArgs++;
                    count++;
                }
                // }

                tmpLine = tmpLine.substring(endPos);
                startPos = searchArg(tmpLine, arg);
            }

            for (int c = 0; c < nrOfArgsInLine; c++) {
                String filename = bookName + "-" + chapter + ".html";
                String index = bookIndex + " @ " + filename + "-" + vs;

                if (isDebug(thisFile, arg)) {
                    log("", false);
                }
                if (foundRefs.get(index) != null) {
                    var newNrOfArgsInLine = foundRefs.get(index).getNrOfArgsInLine() + (firstArgInLine ? nrOfArgsInLine : 0);
                    foundRefs.get(index).setNrOfArgsInLine(newNrOfArgsInLine);
                    var argList = foundRefs.get(index).getArgList();
                    if (!argList.contains(arg)) {
                        argList.add(arg);
                        foundRefs.get(index).setArgList(argList);
                    }
                } else {
                    var argList = new ArrayList<String>();
                    argList.add(arg);
                    foundRefs.put(index, new Ref(keyArg, arg, filename, vs, 0, nrOfArgsInLine, isSamengesteldWerkwoord, argList));
                    firstArgInLine = false;
                }
            }
        }
        return totalArgs;
    }

    private int searchSamengesteldWerkwoordInLine(final String keyArg, String arg, int totalArgs, File thisFile, String vs, String bookName, String bookIndex, String chapter, String line, boolean firstArgInLine) {
        if (isDebug(thisFile, Integer.parseInt(vs), keyArg)) {
            log("", false);
        }

        if (isArgMetMeerdereSpaties(arg)) {
            return 0;
        } else if (!arg.contains(" ") && !isShowAllWhenSamengesteldWerkwoord()) {
            return 0;
        } else if (!arg.contains(" ")) {
            return searchArgumentsInLine(false, keyArg, arg, totalArgs, thisFile, vs, bookName, bookIndex, chapter, line, firstArgInLine, true);
        }
        else {
            var a1 = arg.substring(arg.indexOf(" ")+1);
            var a2 = arg.substring(0, arg.indexOf(" "));
            if (line.contains(a1) && line.contains(a2)) {
                var tmpLine = line;
                var nrOfArgsInLine = 0;
                var startPos1 = searchArg(tmpLine, a1);
                var startPos2 = searchArg(tmpLine, a2);
//                while (tmpLine.contains(a1) && tmpLine.contains(a2)) {
                while (startPos1 >= 0 && startPos2 >= 0) {
                    //var startPos1 = getStartPos(tmpLine, a1);;
                    var endPos1 = startPos1 + a1.length();
                    //var startPos2 = getStartPos(tmpLine, a2);;
                    var endPos2 = startPos2 + a2.length();

                    // if (startPos1 > 0 && startPos2 > 0) {
                    if (isDebug(thisFile, vs, arg)) {
                        log("", false);
                    }

                    var minStart = Math.min(startPos1, startPos2);
                    var maxStart = Math.max(startPos1, startPos2);
                    var textBetweenArgs = tmpLine.substring(minStart, maxStart);
                    if (containsEndOfLineIndicator(textBetweenArgs)) {
                        var posLineEnd = getPosEndOfLineIndicator(tmpLine);
                        var tmpLine2 = tmpLine.substring(posLineEnd);
                        if (tmpLine2.contains(a1) && tmpLine2.contains(a2)) {
                            // startPos1 = getStartPos(tmpLine2, a1) + posLineEnd;
                            startPos1 = searchArg(tmpLine2, a1) + posLineEnd;
                            endPos1 = startPos1 + a1.length();
                            // startPos2 = getStartPos(tmpLine2, a2) + posLineEnd;
                            startPos2 = searchArg(tmpLine2, a2) + posLineEnd;
                            endPos2 = startPos2 + a2.length();
                        }
                    }

                    var isValidArguments = isValidArgument(tmpLine, startPos1, endPos1, keyArg, a1, false, thisFile, vs, true)
                            && isValidArgument(tmpLine, startPos2, endPos2, keyArg, a2, false, thisFile, vs, true)
                            && isSameArgumentsInCurrentVerse(a1, a2, thisFile, vs);
                    if (isValidArguments) {
                        var isNearEnough = isNearEnough(tmpLine, startPos1, startPos2, thisFile, vs, a1, a2);
                        if (isNearEnough) {
                            nrOfArgsInLine++;
                            totalArgs++;
                            count++;
                        }
                    }
                    // }

                    tmpLine = tmpLine.substring(Math.max(endPos1, endPos2));
                    startPos1 = searchArg(tmpLine, a1);
                    startPos2 = searchArg(tmpLine, a2);
                }

                for (int c = 0; c < nrOfArgsInLine; c++) {
                    String filename = bookName + "-" + chapter + ".html";
                    String index = bookIndex + " @ " + filename + "-" + vs;

                    if (isDebug(thisFile, arg)) {
                        log("", false);
                    }
                    if (foundRefs.get(index) != null) {
                        var newNrOfArgsInLine = foundRefs.get(index).getNrOfArgsInLine() + (firstArgInLine ? nrOfArgsInLine : 0);
                        foundRefs.get(index).setNrOfArgsInLine(newNrOfArgsInLine);
                        var argList = foundRefs.get(index).getArgList();
                        if (!argList.contains(arg)) {
                            argList.add(arg);
                            foundRefs.get(index).setArgList(argList);
                        }
                    } else {
                        var argList = new ArrayList<String>();
                        argList.add(arg);
                        foundRefs.put(index, new Ref(keyArg, arg, filename, vs, 0, nrOfArgsInLine, true, argList));
                        firstArgInLine = false;
                    }
                }
            }
            return totalArgs;
        }
    }

    private boolean containsEndOfLineIndicator(final String line) {
        var result = false;
        for (var indicator: getEndOfLineIndicators()) {
            if (line.contains(indicator)) {
                result = true;
                break;
            }
        }

        return result;
    }

    private int getPosEndOfLineIndicator(final String line) {
        var pos = -1;
        for (var indicator: getEndOfLineIndicators()) {
            var index = line.indexOf(indicator, pos);
            if (index > -1) {
                pos = index;
            }
        }

        return pos;
    }

    private void addNotFound(final String arg, final String argLine) {
        var args = getArgs(argLine);
        var isFirstArg = args.length > 1 && (argLine.contains("$ " + arg + NORMAL_DIVIDER) || argLine.contains("$ " + arg + VERB_DIVIDER));

        if (!isFirstArg && !isZieBijlage(args)) {
            notFound.add(arg);
        }
    }

    private void addTooMuch(final String keyArg, final String argLine) {
        var args = getArgs(argLine);

        if (!isZieBijlage(args)) {
            tooMuch.add(keyArg);
        }
    }

    private void showResult() {
        try {
            writer = new BufferedWriter(new FileWriter(RESULT_CCD));
            writeDoubles();
            writeTooMuch();
            writeNotFound();
            writer.close();

            printDoubles();
            printTooMuch();
            printNotFound();
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }
    }

    private void writeDoubles() {
        try {
            writeLine("DUPLICATEN:");
            for (String duplicate : duplicates) {
                writeLine(duplicate);
            }
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }
    }

    private void printDoubles() {
        logln("", false);
        logln("", false);
        logln("DUPLICATEN:", false);
        for (String duplicate : duplicates) {
            logln(duplicate, false);
        }
    }

    private void writeNotFound() {
        try {
            writeLine();
            writeLine("NIET GEVONDEN:");
            for (String s : notFound) {
                writeLine(s);
            }
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }
    }

    private void printNotFound() {
        logln("", false);
        logln("NIET GEVONDEN:", false);
        for (String s : notFound) {
            logln(s, false);
        }
    }
    private void writeTooMuch() {
        try {
            writeLine();
            writeLine("TEVEEL VOORKOMENS:");
            for (String s : tooMuch) {
                writeLine(s);
            }
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }
    }

    private void printTooMuch() {
        logln("", false);
        logln("TEVEEL VOORKOMENS:", false);
        for (String s : tooMuch) {
            logln(s, false);
        }
    }





    private static String curBookRef;
    private static String oldBookRef;

    private Map<Integer, StringBuilder> sortRefs() {
        oldBookRef = "";
        foundRefs.forEach((key, ref) -> {
            String foundRef = ref.getFileRef();
            String bookName = getBookName(foundRef);
            curBookRef = getBookRef(bookName);

            assert curBookRef != null;
            if (!curBookRef.equals(oldBookRef)) {
                if (!sb.isEmpty()) {
                    int index = getBookIndex(oldBookRef);
                    map.put(index, sb);
                }
                sb = new StringBuilder();
                sb.append("\t\t\t").append("<b>").append(curBookRef).append("</b>");
            } else {
                sb.append("; ");
            }

            String tmp1 = "";
            if (ref.getNrOfArgsInLine() > 1) {
                tmp1 = " (" + ref.getNrOfArgsInLine() + "x)";
            }
            sb.append("<a href=\"").append(foundRef).append("\">").
                    append(ref.getTextRef()).append(tmp1).append("</a>");

            oldBookRef = curBookRef;
        });

        if (!sb.isEmpty()) {
            int index = getBookIndex(curBookRef);
            map.put(index, sb);
        }

        return map;
    }

    private void createFooter() throws IOException {
        writeLine("</body>");
        writeLine("</html>");
    }

    private void writeLine() throws IOException {
        writer.write(getLineSeparator());
    }

    private void writeLine(String s) throws IOException {
        writeLine(0, s);
    }

    private void writeLine(int nrOfTabs, String s) throws IOException {
        writer.write("\t".repeat(Math.max(0, nrOfTabs)) + s);
        writer.write(getLineSeparator());
    }

    private String getKeyArgument(final String argLine) {
        return argLine.substring(0, argLine.indexOf("$")-1).trim();
    }

    private ArrayList<String> splitArguments(String line) {
        ArrayList<String> result = new ArrayList<>();
        int i = line.indexOf("$");
        var argsLine = line.substring(i + 1).trim();
        var args = getArgs(argsLine);

        result.add(args[0].trim());

        if (args.length > 1) {
            String[] otherArgs = args[1].split(",");
            for (String otherArg : otherArgs) {
                result.add(otherArg.trim());
            }
        }

        return result;
    }

    private <K, V> void saveResult(final Map<K, V> map, final String keyArg, final ArrayList<String> args) throws IOException {
        var formattedKeyArg = new StringBuilder();
        if (keyArg.contains("(") && keyArg.contains(")")) {
            var i1 = keyArg.indexOf("(");
            var i2 = keyArg.indexOf(")") + 1;
            formattedKeyArg.append(args.get(0));
            formattedKeyArg.append(" <span class=\"sub-arg\">");
            formattedKeyArg.append(keyArg, i1, i2);
            formattedKeyArg.append("</span>");
        } else {
            formattedKeyArg.append(args.get(0));
        }
        StringBuilder argsLine = new StringBuilder(formattedKeyArg);
        var isZieBijlage = args.size() > 1 && isZieBijlage(args);
        if (!isZieBijlage) {
            argsLine.append(" (").append(count).append(")");
        }
        if (args.size() > 1) {
            if (isZieBijlage) {
                var link = createBijlageLink(args.get(1));
                argsLine.append("<span class=\"appendix-subname\">");
                argsLine.append(" - ");
                argsLine.append(link);
                argsLine.append("</span>");
            } else if (SHOW_ARG_LINE) {
                argsLine.append("<span class=\"appendix-subname\">");
                argsLine.append(" - ");
                for (int i = 1; i < args.size(); i++) {
                    argsLine.append(args.get(i));
                    if (i != args.size() - 1) {
                        argsLine.append(", ");
                    }
                }
                argsLine.append("</span>");
            }
        }

        StringBuilder newLine = new StringBuilder();
        writeLine(1, "<div class=\"appendix\">");

        newLine.append("<div class=\"appendix-header\">")
                .append("<span class=\"appendix-name\">")
                .append(argsLine)
                .append("</span>")
                .append("</div>");
        writeLine(2, newLine.toString());

        if (!isZieBijlage || (isZieBijlage && SHOW_BIJLAGE_LINKS)) {
            int i = 0;
            writeLine(2, "<div class=\"appendix-link\">");
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (i > 0) {
                    writeLine(";&#160;");
                }
                writer.write(entry.getValue().toString());
                i++;
            }
            writeLine();
            writeLine(2, "</div>");
        }

        writeLine(1, "</div>");
        writeLine();
    }

    private Bijlage getSoortBijlage(final String str) {
        var id = str.substring(("zie ").length());

        if (str.startsWith(ZIE_WB)) {
            var tmp1 = str.substring(ZIE_WB.length());
            var firstChar = tmp1.toLowerCase().charAt(0);

            return Bijlage.builder()
                    .link("woordenboek-" +
                            firstChar +
                            ".html#" +
                            id)
                    .naam("Woordenboek")
                    .build();
        } else {
            var link = "";
            var naam = "";
            if (str.startsWith(ZIE_BF)) {
                link = "feesten.html#" + id;
                naam = "Feesten";
            } else if (str.startsWith(ZIE_GD)) {
                link = "goden.html#" + id;
                naam = "Goden";
            } else if (str.startsWith(ZIE_MD)) {
                link = "maanden.html#" + id;
                naam = "Maanden";
            } else if (str.startsWith(ZIE_MG)) {
                link = "gewichten.html#" + id;
                naam = "Gewichten";
            } else if (str.startsWith(ZIE_CM)) {
                link = "inhoudsmaten.html#" + id;
                naam = "Inhoudsmaten";
            } else if (str.startsWith(ZIE_ML)) {
                link = "lengtematen.html#" + id;
                naam = "Lengtematen";
            } else if (str.startsWith(ZIE_MM)) {
                link = "munten.html#" + id;
                naam = "Munten";
            } else if (str.startsWith(ZIE_MS)) {
                link = "oppervlaktematen.html#" + id;
                naam = "Oppervlaktematen";
            } else if (str.startsWith(ZIE_OF)) {
                link = "offers.html#" + id;
                naam = "Offers";
            }

            return Bijlage.builder()
                    .link(link)
                    .naam(naam)
                    .build();
        }
    }

    private String createBijlageLink(final String str) {
        var bijlage = getSoortBijlage(str);
        return "zie "
                + "<a class=\"appendix\" href=\"" + bijlage.getLink() + "\">"
                + bijlage.getNaam()
                + "</a>";
    }

//    private String createWoordenboekLink(final String str) {
//        var tmp1 = str.substring(ZIE_WB.length());
//        var id = str.substring(("zie ").length());
//        var firstChar = tmp1.toLowerCase().charAt(0);
//        return  "zie " +
//                "<a class=\"appendix\" href=\"woordenboek-" +
//                firstChar +
//                ".html#" +
//                id +
//                "\">Woordenboek</a>";
//    }

    private void findDoubles() {
        try {
            List<String> argList;
            try (Stream<String> args = Files.lines(Paths.get(CONCORDANTIE_PATH))) {
                argList = new ArrayList<>();
                args.forEach(argLine ->
                        argList.add(createSortKey(argLine, true))
                );
            }
            var previousArg = "";
            for (String currentArg : argList) {
                if (previousArg.equals(currentArg)) {
                    duplicates.add(currentArg);
                }

                previousArg = currentArg;
            }

            //Stream<String> argLines = argList.stream();
        } catch (IOException e) {
            logln(e.getMessage(), true);
        }

    }

    private boolean isShowAllWhenSamengesteldWerkwoord() {
        if (IS_CCD_DEV) {
            return IS_SHOW_ALL_SAMENGESTELD_WERKWOORD;
        }

        return true;
    }

    private boolean isSlaOver(final @NotNull String keyArg, final @NotNull String arg, final @NotNull String line) {
        if (IS_CCD_DEV) {
            if (isSlaOverArguementen(keyArg, arg)) {
                return StringUtils.contains(line, "Zie,")
                        || StringUtils.contains(line, ", zie,")
                        || StringUtils.contains(line, "; zie,")
                        || StringUtils.containsIgnoreCase(line, "zie toch,")
                        || StringUtils.containsIgnoreCase(line, "maar zie,")
                        || StringUtils.containsIgnoreCase(line, "want zie,")
                        || StringUtils.containsIgnoreCase(line, "en zie,");
            }
        }

        return false;
    }

    private static boolean isSlaOverArguementen(final @NotNull String keyArg, final @NotNull String arg) {
        if ((keyArg.equals("zien")
                || keyArg.equals("ziend"))
                && arg.equals("zie")) {
            return true;
        }

        return keyArg.equals("aanzien (werkwoord)");
    }

}

