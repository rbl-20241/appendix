package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVieren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "feestvieren" -> isFeestvieren(curFile, vs);
            case "vieren" -> isVieren(curFile, vs);
            case "vier" -> isGetalVier(curFile, vs);
            default -> true;
        };
    }

    public static boolean isFeestvieren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-32.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs23")
                || isValidVerse(curFile, vs, "Neh-08.html#vs19")
                || isValidVerse(curFile, vs, "Rev-11.html#vs10");
    } // isFeestvieren

    public static boolean isVieren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-05.html#vs1")
                || isValidVerse(curFile, vs, "Exod-12.html#vs14", 14)
                || isValidVerse(curFile, vs, "Exod-23.html#vs14")
                || isValidVerse(curFile, vs, "Lev-23.html#vs32", 39, 41)
                || isValidVerse(curFile, vs, "Num-29.html#vs12")
                || isValidVerse(curFile, vs, "Deut-16.html#vs15")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs32")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs4")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs19", 22)
                || isValidVerse(curFile, vs, "Esth-09.html#vs21", 27, 28)
                || isValidVerse(curFile, vs, "Nah-1.html#vs15")
                || isValidVerse(curFile, vs, "Zech-14.html#vs16", 18, 19)
                || isValidVerse(curFile, vs, "Matt-14.html#vs6")
                || isValidVerse(curFile, vs, "Acts-18.html#vs21");
    } // isVieren

    public static boolean isGetalVier(final File curFile, final String vs) {
        return !isFeestvieren(curFile, vs)
                && !isVieren(curFile, vs);
    } // isGetalVier
}
