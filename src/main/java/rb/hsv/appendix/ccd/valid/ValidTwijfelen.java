package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTwijfelen {
    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "twijfel" -> isTwijfel(curFile, vs);
            case "twijfelen" -> isTwijfelen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isTwijfel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-22.html#vs12")
                || isValidVerse(curFile, vs, "Luke-24.html#vs4")
                || isValidVerse(curFile, vs, "John-13.html#vs22")
                || isValidVerse(curFile, vs, "Acts-25.html#vs20")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs8")
                || isValidVerse(curFile, vs, "Gal-4.html#vs20")
                || isValidVerse(curFile, vs, "1Tim-3.html#vs16");
    } // isTwijfel

    public static boolean isTwijfelen(final File curFile, final String vs) {
        return !isTwijfel(curFile, vs);
    } // isTwijfelen
}
