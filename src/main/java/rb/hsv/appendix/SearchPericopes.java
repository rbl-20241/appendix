package rb.hsv.appendix;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static rb.hsv.appendix.Constants.*;
import static rb.hsv.appendix.Util.*;

public class SearchPericopes {

    private BufferedWriter writer;
    private ArrayList<File> files;
    private Map<Integer, StringBuilder> map; // = new TreeMap<>();
    private int count;

    public void run() {
        try {
            count = 0;
            writer = new BufferedWriter(new FileWriter(RESULT));
            findFiles();
            readFiles();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findFiles() {
        files = new ArrayList<>();
        File dir = new File(ROOT);
        Collection<File> col = FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, FalseFileFilter.INSTANCE);

        files.addAll(col);
    }

    private void readFiles() {
        List<String> lines = new ArrayList<>();
        String bookRef = "";
        String oldBookRef = "";
        StringBuilder sb = new StringBuilder();
        boolean isEndOfVerses = false;
        map = new TreeMap<>();

        for (File thisFile : files) {
            isEndOfVerses = false;
            if (checkFile(thisFile.getName())) {
                bookRef = getBookRef(thisFile.getName());

                if (bookRef != null) {
                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {
                        lines = br.lines().collect(Collectors.toList());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    int vs = 0;
                    String bookName = getBookName(thisFile.getName());
                    String chapter1 = getChapter(thisFile.getName(), false);
                    String chapter2 = getChapter(thisFile.getName(), true);
                    for (int l = 0; l < lines.size(); l++) {
                        String line = lines.get(l);

                        if (line.contains("class=\"footnote1")) {
                            isEndOfVerses = true;
                        }

                        if (!isEndOfVerses) {
                            if (line.contains("id=\"vs")) {
                                vs = getVerseNumberAsInt(line);
                            }

                            if (line.contains(PERICOPE_TAG)) {
                                String href =  thisFile.getName() + "#vs" + (vs + 1);
                                int startIndex = PERICOPE_TAG.length();
                                int endIndex = line.indexOf("<span", startIndex)-1;
                                if (endIndex > startIndex) {
                                    StringBuilder pericope = new StringBuilder();
                                    pericope.append(line.substring(startIndex, endIndex));
                                    StringBuilder text = new StringBuilder();
                                    text.append(" (")
                                            .append(bookRef).append(chapter2).append(":").append(vs + 1)
                                            .append(")");
                                    sb = new StringBuilder();
                                    sb.append("\t\t\t<li>")
                                            .append(HREF_PERICOPE).append(href).append("\">")
                                            .append(pericope)
                                            .append(text)
                                            .append("</a>")
                                            .append("</li>");

                                    map.put(count, sb);
                                    count++;
                                }


//                                if (newBook) {
//                                    sb.append("\t\t\t").append("<b>").append(bookRef).append("</b>");
//                                    newBook = false;
//                                } else {
//                                    sb.append("; ");
//                                }
//
//                                if (isOneChapterBook(bookRef)) {
//                                    sb.append("<a href=\"")
//                                            .append(bookName)
//                                            .append("-")
//                                            .append(chapter1)
//                                            .append(".html#vs")
//                                            .append(vs)
//                                            .append("\">vs ")
//                                            .append(vs)
//                                            .append("</a>");
//                                } else {
//                                    sb.append("<a href=\"")
//                                            .append(bookName)
//                                            .append("-")
//                                            .append(chapter1)
//                                            .append(".html#vs")
//                                            .append(vs)
//                                            .append("\">")
//                                            .append(chapter2)
//                                            .append(":")
//                                            .append(vs)
//                                            .append("</a>");
//                                }
                            } // if (line.contains(id))
                        } // for lines

                        oldBookRef = bookRef;
                    } // if (bookRef != null)
                } // if (checkFile(thisFile.getName()))
            }
        } // for (int i = 0; i < files.size(); i++)
//        if (sb.length() > 0) {
//            int index = getBookIndex(bookRef);
//            map.put(index, sb);
//        }

        saveResult(map);
    }

    private <K, V> void saveResult(Map<K, V> map) {
        try {
            writer.write(getLineSeparator());
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println(entry.getValue());
                System.out.println("");
                writer.write(entry.getValue().toString());
                writer.write(getLineSeparator());
            }
            System.out.println("");
            System.out.println("===============================================================================");
            System.out.println("");
            writer.write(getLineSeparator());
            writer.write(getLineSeparator());
            writer.write("===============================================================================");
            writer.write(getLineSeparator());
            writer.write(getLineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
