package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWeg {
    public static boolean isValid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-14.html#vs6")
                || isValidVerse(curFile, vs, "Acts-09.html#vs2")
                || isValidVerse(curFile, vs, "Acts-22.html#vs4")
                || isValidVerse(curFile, vs, "Acts-24.html#vs14")
                || isValidVerse(curFile, vs, "Acts-24.html#vs22");
    }

}
