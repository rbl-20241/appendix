package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKnielen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "geknield" -> isGeknield(curFile, vs);
            case "neerknielen" -> isNeerknielen(curFile, vs);
            case "knielen" -> isKnielen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isGeknield(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-08.html#vs54");
    } // isGeknield

    public static boolean isNeerknielen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-06.html#vs13")
                || isValidVerse(curFile, vs, "Isa-44.html#vs15", 17)
                || isValidVerse(curFile, vs, "Matt-08.html#vs2")
                || isValidVerse(curFile, vs, "Matt-15.html#vs25")
                || isValidVerse(curFile, vs, "Matt-18.html#vs26")
                || isValidVerse(curFile, vs, "Matt-20.html#vs20")
                || isValidVerse(curFile, vs, "Luke-22.html#vs41")
                || isValidVerse(curFile, vs, "Acts-09.html#vs40")
                || isValidVerse(curFile, vs, "Acts-20.html#vs36")
                || isValidVerse(curFile, vs, "Acts-21.html#vs5");
    } // isNeerknielen

    private static boolean isKnielen(final File curFile, final String vs) {
        return !isGeknield(curFile, vs)
                && !isNeerknielen(curFile, vs);
    }  // isKnielen

}
