package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZin {

    public static boolean isValid(final File curFile, final String vs) {
        return !isWoestijnZin(curFile, vs);
    }

    public static boolean isWoestijnZin(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-13.html#vs21")
                || isValidVerse(curFile, vs, "Num-20.html#vs1")
                || isValidVerse(curFile, vs, "Num-27.html#vs14")
                || isValidVerse(curFile, vs, "Num-33.html#vs36")
                || isValidVerse(curFile, vs, "Num-34.html#vs3", 4)
                || isValidVerse(curFile, vs, "Deut-32.html#vs51")
                || isValidVerse(curFile, vs, "Josh-15.html#vs1", 3);
    } // isWoestijnZin

}
