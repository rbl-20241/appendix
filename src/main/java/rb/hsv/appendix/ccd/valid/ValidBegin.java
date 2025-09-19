package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBegin {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        var isValid = false;

        if (keyArg.equals("begin")) {
            isValid = !isWerkwoord(curFile, vs);
        } else if (keyArg.equals("beginnen")) {
            isValid = isWerkwoord(curFile, vs);
        }

        return isValid;
    }

    private static boolean isWerkwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-02.html#vs24")
                || isValidVerse(curFile, vs, "Deut-02.html#vs31")
                || isValidVerse(curFile, vs, "Jer-25.html#vs29")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs6")
                || isValidVerse(curFile, vs, "Luke-03.html#vs8");
    }

}
