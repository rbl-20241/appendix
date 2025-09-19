package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDwalende {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        if (keyArg.equals("dwalend")) {
            return isBijvoegelijkNaamwoord(curFile, vs);
        } else {
            return !isBijvoegelijkNaamwoord(curFile, vs);
        }
    }

    private static boolean isBijvoegelijkNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Pet-2.html#vs25");
    }
}
