package rb.hsv.appendix;

import lombok.Data;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import static rb.hsv.appendix.Constants.*;
import static rb.hsv.appendix.Util.getLineSeparator;
import static rb.hsv.appendix.ccd.Debug.isDebug;

@Data
public class TextOnly {

    private ArrayList<File> files;
    private boolean isEof;
    private boolean isToelichting;
    private String versTag;
    private final String SRCDIR = "C:\\Temp\\hsv met bijlagen\\textToConvert";
    private boolean isEersteVersGevonden;

    public void run() {
        findFiles();
        transformFiles();
    }

    private void findFiles() {
        files = new ArrayList<>();
        File dir = new File(SRCDIR);
        Collection<File> col = FileUtils.listFiles(dir, EXTENSIONS, false);

        if (col.size() == 0) {
            dir = new File(ROOT);
            col = FileUtils.listFiles(dir, EXTENSIONS, false);
        }

        files.addAll(col);
    }

    private void transformFiles() {
        File dir = new File(TEXTONLY_DIR);
        if (!dir.exists()) {
            dir.mkdir();
        }

        for (File file : files) {
            if (Util.getBookRef(file.getName()) != null) {
                String newFilename = Paths.get(TEXTONLY_DIR, file.getName()).toString();

                if (isDebug(file)) {
                    System.out.println("");
                }

                try {
                    //System.out.println(newFilename);
                    isEof = false;
                    isToelichting = false;
                    isEersteVersGevonden = false;
                    File newFile = new File(newFilename);
                    FileOutputStream fos = new FileOutputStream(newFile);
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
                    Stream<String> lines = Files.lines(Paths.get(file.getAbsolutePath()));
                    lines.filter(line -> !ignoreLine(line)).map(this::convertLine).forEach(newLine -> {
                        try {
                            bw.write(newLine);
                            bw.write(getLineSeparator());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        //System.out.println(newLine);
                    });
                    bw.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean ignoreLine(String line) {
        String l = line.trim();
        isEof = forceEof(line, isEof);
        checkToelichting(line);
        checkEersteVersGevonden(line);

        return !isEersteVersGevonden
                || l.equals("")
                || l.startsWith("<?xml")
                || l.startsWith("<html")
                || l.startsWith("<head>")
                || l.startsWith("<title>")
                || l.startsWith("<meta")
                || l.startsWith("<link")
                || l.startsWith("</head>")
                || l.startsWith("<body>")
                || l.startsWith("<div class=\"chapnavcontainer\">")
                || l.startsWith("<div class=\"index\">")
                || l.startsWith("<div><a class=\"index\" ")
                || l.startsWith("<p class=\"bookname\">")
                || l.startsWith("<a class=\"tocchapterlink\"")
                || l.startsWith("<strong>")
                || l.startsWith("</div>")
                || l.startsWith("<h2")
                || l.startsWith("<h3")
                || l.startsWith("<p class=\"footnote")
                || l.startsWith("</body>")
                || l.startsWith("</html>")
                || l.startsWith("<br /> <strong>")
                || l.startsWith("<div><br />")
                || l.startsWith("<p class=\"poetry-r\">")
//               || l.startsWith("")
//               || l.startsWith("")
//               || l.startsWith("")
//               || l.startsWith("")
//               || l.startsWith("")
//               || l.startsWith("")
                || isToelichting
                || isEof;
    }

    private boolean forceEof(String line, boolean isAlreadyEof) {
        return line.startsWith("<p class=\"footnote1") || isAlreadyEof;
    }

    private void checkToelichting(String line) {
        if (isToelichting) {
            isToelichting = !line.equals("</p>");
        } else if (line.contains("<p class=\"info\"><a id=\"toelichting\"/>")) {
            isToelichting = true;
        }
    }

    private void checkEersteVersGevonden(String line) {
        if (!isEersteVersGevonden) {
            isEersteVersGevonden = line.contains("<a id=\"vs1\"/>");
        }
    }

    public String convertLine(String line) {
        String newLine = line.trim();
        newLine = newLine.replaceAll("<br>", " ");
        newLine = newLine.replaceAll("<br/>", " ");
        newLine = newLine.replaceAll("<br />", " ");
        //newLine = newLine.replaceAll("" + (char) 160, " ");
        while (newLine.contains("<")) {
            int pos1 = newLine.indexOf("<");
            int pos2 = newLine.indexOf(">");
            if (newLine.startsWith("<a id=\"vs")) {
                versTag = newLine.substring(0, pos2 + 1);
            }
            if (newLine.indexOf("sup") == (pos1 + 1)) {
                pos2 = newLine.indexOf("</sup>") + 5;
            }
            if (newLine.indexOf("a href=\"#note\"") == (pos1 + 1)) {
                pos2 = newLine.indexOf("</a>") + 3;
            }
            try {
                newLine = newLine.substring(0, pos1) + newLine.substring(pos2 + 1);
            } catch (OutOfMemoryError e) {
                System.out.println(newLine + " - " + pos1 + " - " + pos2);
                System.out.println("OutOfMemoryError: " + e.getMessage());
            }

        }

        return versTag + newLine;
    }

}
