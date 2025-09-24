package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTonen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aantonen" -> isAantonen(curFile, vs);
            case "toon" -> isToon(curFile, vs);
            case "tonen" -> isTonen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAantonen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-09.html#vs22")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "");
    } // isAantonen

    public static boolean isToon(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-19.html#vs13")
                || isValidVerse(curFile, vs, "Josh-06.html#vs5")
                || isValidVerse(curFile, vs, "Ps-109.html#vs30")
                || isValidVerse(curFile, vs, "Rom-15.html#vs15")
                || isValidVerse(curFile, vs, "Gal-4.html#vs20");
    } // isToon

    public static boolean isTonen(final File curFile, final String vs) {
        return !isToon(curFile, vs);
    } // isTonen

}
