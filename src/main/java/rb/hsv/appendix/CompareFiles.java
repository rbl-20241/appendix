package rb.hsv.appendix;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

import static rb.hsv.appendix.Constants.EXTENSIONS;
import static rb.hsv.appendix.Constants.TEXTONLY_DIR;
import static rb.hsv.appendix.Util.getLineSeparator;

public class CompareFiles {

    private final String ORGDIR = "C:\\Temp\\hsv met bijlagen\\textOnly.org";
    private final String RESULT = "C:\\Temp\\hsv met bijlagen\\filecompare.txt";

    private ArrayList<File> files;

    public void run() {
        findFiles();
        compareFiles();
    }

    private void findFiles() {
        files = new ArrayList<>();
        File dir = new File(ORGDIR);
        Collection<File> col = FileUtils.listFiles(dir, EXTENSIONS, false);

        files.addAll(col);
    }

    private void compareFiles() {
        try {
            File resultFile = new File(RESULT);
            FileOutputStream fos = new FileOutputStream(resultFile);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (File orgFile: files) {
                String orgFilename = orgFile.getAbsolutePath();
                String newFilename = Paths.get(TEXTONLY_DIR, orgFile.getName()).toString();
                BufferedReader orgReader = new BufferedReader(new FileReader(orgFilename));
                BufferedReader newReader = new BufferedReader(new FileReader(newFilename));
                String orgLine = orgReader.readLine();
                String newLine = newReader.readLine();
                boolean areEqual = true;
                while (orgLine != null || newLine != null) {
                    if(orgLine == null || newLine == null) {
                        areEqual = false;
                        break;
                    }
                    else if(!orgLine.equals(newLine)) {
                        areEqual = false;
                        break;
                    }

                    orgLine = orgReader.readLine();
                    newLine = newReader.readLine();
                }


                System.out.println(orgFile.getName() + (areEqual ? " geen verschil" : " VERSCHILLEN GEVONDEN"));
                bw.write(orgFile.getName() + (areEqual ? " geen verschil" : " VERSCHILLEN GEVONDEN"));
                bw.write(getLineSeparator());
            }

            bw.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
