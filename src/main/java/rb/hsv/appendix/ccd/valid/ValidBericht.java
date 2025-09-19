package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBericht {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        var isValid = false;

        if (keyArg.equals("bericht")) {
            isValid = !isWerkwoord(curFile, vs)
                    || isValidVerse(curFile, vs, "Acts-16.html#vs36");
        } else if (keyArg.equals("berichten")) {
            isValid = isWerkwoord(curFile, vs);
        }

        return isValid;
    }

    private static boolean isWerkwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-02.html#vs8")
                || isValidVerse(curFile, vs, "Matt-11.html#vs4")
                || isValidVerse(curFile, vs, "Matt-28.html#vs8")
                || isValidVerse(curFile, vs, "Matt-28.html#vs10")
                || isValidVerse(curFile, vs, "Mark-05.html#vs19")
                || isValidVerse(curFile, vs, "Mark-16.html#vs13")
                || isValidVerse(curFile, vs, "Luke-07.html#vs22")
                || isValidVerse(curFile, vs, "Acts-23.html#vs17")
                || isValidVerse(curFile, vs, "Acts-23.html#vs19");
    }

}
