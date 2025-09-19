package rb.hsv.appendix.ccd;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static rb.hsv.appendix.ccd.Ref.CCD_CONTENT_DIR;
import static rb.hsv.appendix.ccd.Ref.CONTENT_DIR;
import static rb.hsv.appendix.ccd.Util.findFiles;

public class RemoveConSpan {

    public void run() {
        //var formattedFiles = findFiles(CCD_CONTENT_DIR, true);
        System.out.println("Begin reset");
        cleanDirectory();
        System.out.println("End reset");
    }

    private void cleanDirectory() {
        try {
            var concordantieDir = new File(CCD_CONTENT_DIR);
            var origDir = new File(CONTENT_DIR);
            FileUtils.cleanDirectory(concordantieDir);
            FileUtils.copyDirectory(origDir, concordantieDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void removeConSpanInFiles(final ArrayList<File> formattedFiles) {
//        SortedMap<String, Ref> foundRefs = new TreeMap<>();
//
//        List<String> lines = new ArrayList<>();
//        String bookRef = "";
//
//        for (File thisFile : formattedFiles) {
//            if (checkFile(thisFile.getName())) {
//                bookRef = getBookRef(thisFile.getName());
//
//                if (bookRef != null) {
//                    System.out.println(bookRef);
//
//                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {
//                        lines = br.lines().collect(Collectors.toList());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                    var bookName = getBookName(thisFile.getName());
//                    var chapter = getChapter(thisFile.getName(), false);
//                    var currentVerse = "";
//                    var prevVerse = "";
//                    var indexLine = 1;
//
//                    for (String line: lines) {
//                        if (line.contains("id=\"vs")) {
//                            currentVerse = getVerseNumber(line);
//                        }
//
//                        if (currentVerse.equals(prevVerse)) {
//                            indexLine++;
//                        }
//                        else {
//                            indexLine = 1;
//                        }
//
//                        if (line.contains(OPEN_SPAN)) {
//                            int nrOfArgsInLine = countConSpanInLine(line);
//                            String bookIndex = getBookIndexForConcordantie(bookRef);
//
//                            for (int c = 0; c < nrOfArgsInLine; c++) {
//                                String filename = bookName + "-" + chapter + ".html";
//                                String index = bookIndex + " @ " + filename + "-" + currentVerse + " # " + indexLine;
//
//                                foundRefs.put(index, new Ref(OPEN_SPAN, filename, currentVerse, indexLine, nrOfArgsInLine));
//                            }
//                        }
//
//                        prevVerse = currentVerse;
//                    }
//                }
//            }
//        }
//
//        unMarkFoundRefs(foundRefs);
//        delay(100);
//    }
//
//    private String removeConcordantieSpan(final int nrOfArguments, final String line) {
//        StringBuilder newLine = new StringBuilder();
//        String tmpLine = line;
//        for (int i = 0; i < nrOfArguments; i++) {
//            if (!tmpLine.contains(OPEN_SPAN)) {
//                newLine.append(tmpLine);
//            } else if (tmpLine.contains(OPEN_SPAN)) {
//                int startPosOpen = tmpLine.indexOf(OPEN_SPAN);
//                int endPosOpen = startPosOpen + OPEN_SPAN.length();
//
//                if (startPosOpen > 0) {
//                    newLine.append(tmpLine, 0, startPosOpen);
//                    tmpLine = tmpLine.substring(endPosOpen);
//                    var startPosClose = tmpLine.indexOf(CLOSE_SPAN);
//                    var endPosClose = startPosClose + CLOSE_SPAN.length();
//                    newLine.append(tmpLine, 0, startPosClose);
//                    tmpLine = tmpLine.substring(endPosClose);
//                }
//            }
//        }
//
////        if (nrOfFoundArgs < nrOfArguments) {
////            newLine = findArgument(arg, newLine.toString());
////        }
//
//        newLine.append(tmpLine);
//
//        return newLine.toString();
//    }
//
//    private void unMarkFoundRefs(final SortedMap<String, Ref> foundRefs) {
//        foundRefs.forEach((key, ref) -> {
//            try {
//                File refFile = ref.getFile();
//                String bupFile = refFile.getAbsolutePath() + ".bup";
//                Files.move(Paths.get(refFile.getAbsolutePath()),
//                        Paths.get(bupFile),
//                        StandardCopyOption.REPLACE_EXISTING);
//
//                var f = new File(bupFile);
//                Stream<String> lines = Files.lines(Paths.get(f.getAbsolutePath()));
//                File newFile = new File(ref.getFile().getAbsolutePath());
//                FileOutputStream fos = new FileOutputStream(newFile);
//                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
//
//                var obj = new Object() {
//                    String currentVerse = "";
//                    String prevVerse = "";
//                    int indexLine = 1;
//                };
//
//                lines.forEach(line -> {
//                    try {
//                        if (line.contains("id=\"vs")) {
//                            obj.currentVerse = getVerseNumber(line);
//                        }
//
//                        if (obj.currentVerse.equals(obj.prevVerse)) {
//                            obj.indexLine++;
//                        }
//                        else {
//                            obj.indexLine = 1;
//                        }
//
//                        //var isVerseWithArg = obj.currentVerse.equals(ref.getVerse());
//                        var isLineWithArg = obj.currentVerse.equals(ref.getVerse()) && obj.indexLine == ref.getIndexLine();
//                        if (refFile.getName().endsWith("Deut-32.html") && obj.currentVerse.equals("20") && isLineWithArg) {
//                            System.out.println("check this");
//                        }
//                        if (isLineWithArg && line.contains(ref.getArgument())) {
//                            String newLine = removeConcordantieSpan(ref.getNrOfArgsInLine(), line);
//                            writer.write(newLine);
//                        } else {
//                            writer.write(line);
//                        }
//                        writer.write(getLineSeparator());
//
//                        obj.prevVerse = obj.currentVerse;
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                });
//
//                Files.delete(Paths.get(bupFile));
//
//                writer.close();
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//
//    private int countConSpanInLine(final String line) {
//        int c = 0;
//
//        var tmpLine = line;
//        while (tmpLine.contains(OPEN_SPAN)) {
//            c++;
//            int index = tmpLine.indexOf(OPEN_SPAN);
//            tmpLine = tmpLine.substring(index + OPEN_SPAN.length());
//        }
//
//        return c;
//
//    }
//
//
}
