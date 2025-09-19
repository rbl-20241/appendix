package rb.hsv.appendix;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static rb.hsv.appendix.Constants.*;
import static rb.hsv.appendix.Util.*;

public class SearchArguments {

    private BufferedWriter writer;
    private ArrayList<File> files;
    private boolean newBook;
    private Map<Integer, StringBuilder> map; // = new TreeMap<>();
    private boolean isSearch;
    private boolean isCount;
    private boolean isName;
    private int count;

    public SearchArguments(boolean isSearch, boolean isCount) {
        this.isCount = isCount;
        this.isSearch = isSearch;
    }

    public void run() {
        try {
            writer = new BufferedWriter(new FileWriter(RESULT));
            Stream<String> lines = Files.lines(Paths.get(VERSES));
            lines.filter(line -> line.startsWith("#"))
                    .forEach(line -> {
                        findFiles();
                        readFiles(line);
                    });
            checkPericopes();
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

    private void readFiles(String id) {
        List<String> lines = new ArrayList<>();
        String bookRef = "";
        String oldBookRef = "";
        StringBuilder sb = new StringBuilder();
        boolean isEndOfVerses = false;
        map = new TreeMap<>();
        count = 0;
        isName = id.startsWith("#nm");

        for (File thisFile : files) {
            isEndOfVerses = false;
            if (checkFile(thisFile.getName())) {
                bookRef = getBookRef(thisFile.getName());

                if (bookRef != null) {
                    if (!bookRef.equals(oldBookRef)) {
                        if (sb.length() > 0) {
                            int index = getBookIndex(oldBookRef);
                            map.put(index, sb);
                        }
                        sb = new StringBuilder();
                        newBook = true;
                    }

                    try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {

                        lines = br.lines().collect(Collectors.toList());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    String vs = "";
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
                                vs = getVerseNumber(line);
                            }

                            if (line.contains(id)) {
                                if (isCount) {
                                    count += countArgumentsInLine(line, id);
                                }
                                if (isSearch) {
                                    if (newBook) {
                                        sb.append("\t\t\t").append("<b>").append(bookRef).append("</b>");
                                        newBook = false;
                                    } else {
                                        sb.append("; ");
                                    }

                                    if (isOneChapterBook(bookRef)) {
                                        sb.append("<a href=\"")
                                                .append(bookName)
                                                .append("-")
                                                .append(chapter1)
                                                .append(".html#vs")
                                                .append(vs)
                                                .append("\">vs ")
                                                .append(vs)
                                                .append("</a>");
                                    } else {
                                        sb.append("<a href=\"")
                                                .append(bookName)
                                                .append("-")
                                                .append(chapter1)
                                                .append(".html#vs")
                                                .append(vs)
                                                .append("\">")
                                                .append(chapter2)
                                                .append(":")
                                                .append(vs)
                                                .append("</a>");
                                    }
                                } // ifs isSearch
                            } // if (line.contains(id))
                        } // for lines

                        oldBookRef = bookRef;
                    } // if (bookRef != null)
                } // if (checkFile(thisFile.getName()))
            }
        } // for (int i = 0; i < files.size(); i++)
        if (sb.length() > 0) {
            int index = getBookIndex(bookRef);
            map.put(index, sb);
        }

        saveResult(map, id);
    }

    private void checkPericopes() {
        StringBuilder hrefInPericope = new StringBuilder();
        List<String> lines = new ArrayList<>();
        map = new TreeMap<>();

        for (int i = 0; i < files.size(); i++) {
            File thisFile = files.get(i);
            try (BufferedReader br = Files.newBufferedReader(Paths.get(thisFile.toURI()))) {

                lines = br.lines().collect(Collectors.toList());

            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int l = 0; l < lines.size(); l++) {
                String line = lines.get(l);
                if (line.contains(PERICOPE) && line.contains(HREF)) {
                    if (hrefInPericope.length() == 0) {
                        hrefInPericope.append("Verwijzingen in pericope").append("\n\n");
                    }
                    hrefInPericope.append(thisFile.getName()).append("\n");
                }
            }
        }

        if (hrefInPericope.length() > 0) {
            map.put(999, hrefInPericope);
        }

        saveResult(map, "");

    }

    private <K, V> void saveResult(Map<K, V> map, String id) {
        System.out.println(id);
        try {
            writer.write(id);
            writer.write(getLineSeparator());
            if (isCount && id.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String cl = isName ? "appendix-count-nm" : "appendix-count";
                sb.append("\t\t")
                        .append("<div class=\"" + cl + "\">")
                        .append("Aantal voorkomens: ")
                        .append(count)
                        .append("</div>");
                System.out.println(sb.toString());
                writer.write(getLineSeparator());
                writer.write(sb.toString());
                writer.write(getLineSeparator());
            }
            if (isSearch) {
                int i = 0;
                if (id.length() > 0) {
                    String cl = isName ? "appendix-link-nm" : "appendix-link";
                    String s = "\t\t<div class=\"" + cl + "\">";
                    System.out.println(s);
                    writer.write(s);
                }
                writer.write(getLineSeparator());
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (i > 0) {
                        writer.write(";&#160;");
                        writer.write(getLineSeparator());
                    }
                    System.out.println(entry.getValue());
                    writer.write(entry.getValue().toString());
                    i++;
                }
                writer.write(getLineSeparator());
                if (id.length() > 0) {
                    String s = "\t\t</div>";
                    System.out.println(s);
                    writer.write(s);
                }
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

    private int countArgumentsInLine(String line, String id) {
        int lastIndex = 0;
        int c = 0;

        while(lastIndex != -1){
            lastIndex = line.indexOf(id,lastIndex);
            if(lastIndex != -1){
                c++;
                lastIndex += id.length();
            }
        }

        return c;
    }
}