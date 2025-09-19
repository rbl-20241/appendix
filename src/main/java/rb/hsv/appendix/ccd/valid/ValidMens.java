package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMens {

    public static boolean isValid(final @NotNull String arg, final File curFile, final String vs) {
        if (arg.equals("Mens")) {
            return isMens(curFile, vs);
        }

        return true;
    }

    public static boolean isMens(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-08.html#vs16")
                || isValidVerse(curFile, vs, "Matt-26.html#vs72", 74)
                || isValidVerse(curFile, vs, "Mark-14.html#vs71")
                || isValidVerse(curFile, vs, "Mark-15.html#vs39")
                || isValidVerse(curFile, vs, "Luke-23.html#vs4", 6, 14, 47)
                || isValidVerse(curFile, vs, "John-05.html#vs12")
                || isValidVerse(curFile, vs, "John-07.html#vs46")
                || isValidVerse(curFile, vs, "John-08.html#vs40")
                || isValidVerse(curFile, vs, "John-09.html#vs11", 16, 24)
                || isValidVerse(curFile, vs, "John-10.html#vs33")
                || isValidVerse(curFile, vs, "John-11.html#vs47")
                || isValidVerse(curFile, vs, "John-18.html#vs14", 17, 29)
                || isValidVerse(curFile, vs, "John-19.html#vs5")
                || isValidVerse(curFile, vs, "Acts-05.html#vs28")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs21");
    } //


}