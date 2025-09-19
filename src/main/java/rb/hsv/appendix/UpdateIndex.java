package rb.hsv.appendix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateIndex {

    private final static String ADD_FILES = "c:\\data\\source\\appendix\\src\\main\\resources\\text\\addFiles.txt";
    private final static String REMOVE_FILES = "c:\\data\\source\\appendix\\src\\main\\resources\\text\\removeFiles.txt";
    private final static String TOC = "C:\\Temp\\hsv met bijlagen\\content\\toc.ncx";
    private final static String TOC_BUP = "C:\\Temp\\hsv met bijlagen\\toc.bak";
    private final static String TOC_TMP = "C:\\Temp\\hsv met bijlagen\\content\\toc.tmp";
    private final static String CHAPTER = "class=\"chapter\"";
    private final static String TEXT_TAG = "<text>";
    private final static String CONTENT = "C:\\Temp\\hsv met bijlagen\\content\\content.opf";
    private final static String CONTENT_BUP = "C:\\Temp\\hsv met bijlagen\\content.bak";
    private final static String CONTENT_TMP = "C:\\Temp\\hsv met bijlagen\\content\\content.tmp";

    private String updateFrom;
    private List<String> addFiles;
    private List<String> removeFiles;
    private List<String> removeIds;

    private int playOrder;
    private int id;
    private int indexUpdate;

    public void run(final boolean isTitlePage) {
        addFiles = new ArrayList<>();
        removeFiles = new ArrayList<>();

        indexUpdate = 0;
        readAddFiles();
        readRemoveFiles();
        if (addFiles.size() > 0 || removeFiles.size() > 0) {
            updateToc(isTitlePage);
            updateContent(isTitlePage);
        }
    }

    private void readAddFiles() {
        List<String> lines = new ArrayList<>();
        updateFrom = "";

        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(ADD_FILES));
            lines = br.lines().collect(Collectors.toList());
            for (int i = 0; i < lines.size(); i++) {
                if (i == 0) {
                    updateFrom = lines.get(0);
                }
                else if (!fileExists(lines.get(i)) && lines.get(i).trim().length() > 0) {
                    addFiles.add(lines.get(i));
                }
            }

            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readRemoveFiles() {
        List<String> lines = new ArrayList<>();

        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(REMOVE_FILES));
            lines = br.lines().collect(Collectors.toList());
            for (int i = 0; i < lines.size(); i++) {
                if (fileExists(lines.get(i)) && lines.get(i).trim().length() > 0) {
                    removeFiles.add(lines.get(i));
                }
            }

            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean fileExists(String fileName) {
        boolean found = false;
        List<String> lines = new ArrayList<>();

        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(TOC));
            lines = br.lines().collect(Collectors.toList());
            for (int i = 0; i < lines.size() && !found; i++) {
                found = lines.get(i).contains(fileName);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return found;
    }

    private void updateToc(final boolean isTitlePage) {
        List<String> lines = new ArrayList<>();
        String text = "";
        boolean isUpdating = false;
        boolean isRemoving = false;
        boolean hasAddingFiles = false;
        int nrOfRemovedLines = 0;

        try {
            Files.copy(Paths.get(TOC), Paths.get(TOC_BUP), StandardCopyOption.REPLACE_EXISTING);
            BufferedReader br = Files.newBufferedReader(Paths.get(TOC));
            lines = br.lines().collect(Collectors.toList());

            if (Files.exists(Paths.get(TOC_TMP))) {
                Files.delete(Paths.get(TOC_TMP));
            }
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(TOC_TMP));
            for (String line: lines) {
                String newLine;
                readIdAndPlayOrder(line);
                if (line.contains(TEXT_TAG)) {
                    text = readText(line);
                }

                if (isRemoving) {
                    nrOfRemovedLines++;
                    if (nrOfRemovedLines == 6) {
                        isRemoving = false;
                    }
                }
                else if (!updateFrom.equals("") && line.contains(updateFrom)) {
                    isUpdating = true;
                    newLine = line;
                    bw.write(newLine + "\n");
                }
                else if (isUpdating && !hasAddingFiles) {
                    if (line.contains("</navPoint>")) {
                        newLine = line;
                        bw.write(newLine + "\n");
                    }

                    for (int i = 0; i < addFiles.size(); i++) {
                        String line1 = addLine1(i+1);
                        String line2 = addLine2();
                        String line3 = addLine3(text);
                        String line4 = addLine4();
                        String line5 = addLine5(addFiles.get(i));
                        String line6 = addLine6();

                        bw.write(line1 + "\n");
                        bw.write(line2 + "\n");
                        bw.write(line3 + "\n");
                        bw.write(line4 + "\n");
                        bw.write(line5 + "\n");
                        bw.write(line6 + "\n");
                        indexUpdate++;
                    }

                    hasAddingFiles = true;
                }
                else if (indexUpdate != 0 && line.contains(CHAPTER)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getIndention(line));
                    sb.append("<navPoint class=\"chapter\" id=\"toc");
                    sb.append(id+indexUpdate);
                    sb.append("\" playOrder=\"");
                    sb.append(playOrder+indexUpdate);
                    sb.append("\">");
                    newLine = sb.toString();
                    bw.write(newLine + "\n");
                }
                else if (lineContainsRemoveFile(line)) {
                    isRemoving = true;
                    nrOfRemovedLines = 1;
                    indexUpdate--;
                }
                else {
                    newLine = line;
                    bw.write(newLine + "\n");
                }
            }
            bw.close();
            br.close();

            Files.move(Paths.get(TOC_TMP), Paths.get(TOC), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readIdAndPlayOrder(String line) {
        if (line.contains(CHAPTER)) {
            String str = "id=\"toc";
            int pos1 = line.indexOf(str) + str.length();
            int pos2 = line.indexOf("\"", pos1);
            // id = new Integer(line.substring(pos1, pos2));
            id = Integer.getInteger(line.substring(pos1, pos2));

            str = "playOrder=\"";
            pos1 = line.indexOf(str) + str.length();
            pos2 = line.indexOf("\"", pos1);
            // playOrder = new Integer(line.substring(pos1, pos2));
            playOrder = Integer.getInteger(line.substring(pos1, pos2));
        }
    }

    private String getIndention(String line) {
        String str = "<navPoint";
        int pos = line.indexOf(str);
        return line.substring(0, pos);
    }

    private String readText(String line) {
        int pos1 = line.indexOf(TEXT_TAG) + TEXT_TAG.length();
        int pos2 = line.indexOf("</text>");
        return line.substring(pos1, pos2);
    }

    private String addLine1(int idxUpdate) {
        StringBuilder sb = new StringBuilder();
        sb.append("        <navPoint class=\"chapter\" id=\"toc");
        sb.append(id+idxUpdate);
        sb.append("\" playOrder=\"");
        sb.append(playOrder+idxUpdate);
        sb.append("\">");
        return sb.toString();
    }

    private String addLine2() {
        return "          <navLabel>";
    }

    private String addLine3(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append("            <text>");
        sb.append(text);
        sb.append("</text>");
        return sb.toString();
    }

    private String addLine4() {
        return "          </navLabel>";
    }

    private String addLine5(String fileName) {
        StringBuilder sb = new StringBuilder();
        sb.append("          <content src=\"");
        sb.append(fileName);
        sb.append("\"/>");
        return sb.toString();
    }

    private boolean lineContainsRemoveFile(String line) {
        boolean found = false;

        for (int i = 0; i < removeFiles.size() && !found; i++) {
            found = line.contains(removeFiles.get(i));
        }

        return found;
    }

    private String addLine6() {
        return "        </navPoint>";
    }

    private void updateContent(final boolean isTitlePage) {
        List<String> lines = new ArrayList<>();

        try {
            Files.copy(Paths.get(CONTENT), Paths.get(CONTENT_BUP), StandardCopyOption.REPLACE_EXISTING);
            BufferedReader br = Files.newBufferedReader(Paths.get(CONTENT));
            lines = br.lines().collect(Collectors.toList());

            if (Files.exists(Paths.get(CONTENT_TMP))) {
                Files.delete(Paths.get(CONTENT_TMP));
            }
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(CONTENT_TMP));
            String searchIdRef = getId(updateFrom);
            readRemoveIds();
            for (String line: lines) {
                String newLine;
                if (lineContainsRemoveId(line)) {
                    // do nothing
                }
                else if (!updateFrom.equals("") && line.contains(updateFrom)) {
                    newLine = line;
                    bw.write(newLine + "\n");

                    for (int i = 0; i < addFiles.size(); i++) {
                        String pathName = addFiles.get(i);
                        String idName = getId(pathName);

                        StringBuilder sb = new StringBuilder();
                        sb.append("    <item href=\"");
                        sb.append(pathName);
                        sb.append("\" id=\"");
                        sb.append(idName);
                        sb.append("\" media-type=\"application/xhtml+xml\"/>");

                        bw.write(sb.toString() + "\n");
                    }
                }
                else if (!updateFrom.equals("") && line.contains(searchIdRef)) {
                    newLine = line;
                    bw.write(newLine + "\n");

                    for (int i = 0; i < addFiles.size(); i++) {
                        String pathName = addFiles.get(i);
                        String idName = getId(pathName);

                        StringBuilder sb = new StringBuilder();
                        sb.append("    <itemref idref=\"");
                        sb.append(idName);
                        sb.append("\"/>");

                        bw.write(sb.toString() + "\n");
                    }
                }
                else {
                    newLine = line;
                    bw.write(newLine + "\n");
                }
            }
            bw.close();
            br.close();

            Files.move(Paths.get(CONTENT_TMP), Paths.get(CONTENT), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readRemoveIds() {
        removeIds = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(CONTENT));
            for (String line: lines) {
                for (String removeFile: removeFiles) {
                    if (line.contains(removeFile)) {
                        removeIds.add(getId(removeFile));
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean lineContainsRemoveId(String line) {
        boolean found = false;

        for (int i = 0; i < removeIds.size() && !found; i++) {
            found = line.contains(removeIds.get(i));
        }

        return found;
    }

    private String getId(String pathName) {
        if (pathName.equals("")) {
            return "";
        }

        String str = "OPS\\";
        int pos1 = pathName.indexOf(str) + str.length() + 1;
        int pos2 = pathName.indexOf(".html", pos1);
        return pathName.substring(pos1, pos2);
    }

    private String getSearchIdRef(String pathName) {
        String str = "id=\"";
        int pos1 = pathName.indexOf(str) + str.length();
        int pos2 = pathName.indexOf("\"", pos1);
        return pathName.substring(pos1, pos2);
    }

}
