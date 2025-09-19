package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGrijpen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aangrijpen" -> isAangrijpen(curFile, vs);
            case "greep" -> isGreep(curFile, vs);
            case "ingrijpen" -> isIngrijpen(curFile, vs);
            case "moed grijpen" -> isMoedGrijpen(curFile, vs);
            case "vastgrijpen" -> isVastgrijpen(curFile, vs);
            case "grijpen" -> isGrijpen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAangrijpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-15.html#vs15")
                || isValidVerse(curFile, vs, "Job-21.html#vs6")
                || isValidVerse(curFile, vs, "Job-30.html#vs16")
                || isValidVerse(curFile, vs, "Ps-048.html#vs7")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs3")
                || isValidVerse(curFile, vs, "Jer-50.html#vs43")
                || isValidVerse(curFile, vs, "Luke-05.html#vs26")
                || isValidVerse(curFile, vs, "Luke-07.html#vs16");
    } // isAangrijpen

    public static boolean isGreep(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-049.html#vs16")
                || isValidVerse(curFile, vs, "Ps-089.html#vs49")
                || isValidVerse(curFile, vs, "Prov-06.html#vs3")
                || isValidVerse(curFile, vs, "Isa-47.html#vs14")
                || isValidVerse(curFile, vs, "Isa-64.html#vs7")
                || isValidVerse(curFile, vs, "Jer-15.html#vs21")
                || isValidVerse(curFile, vs, "Hab-2.html#vs9");
    } // isGreep

    public static boolean isIngrijpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-06.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs32", 39)
                || isValidVerse(curFile, vs, "2Chr-06.html#vs23");
    } // isIngrijpen

    public static boolean isMoedGrijpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-02.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs21")
                || isValidVerse(curFile, vs, "Neh-02.html#vs18")
                || isValidVerse(curFile, vs, "Zech-08.html#vs9", 13);
    } // isMoedGrijpen

    public static boolean isVastgrijpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-04.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs50")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs28")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs27")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs9")
                || isValidVerse(curFile, vs, "Job-38.html#vs13")
                || isValidVerse(curFile, vs, "Prov-07.html#vs13")
                || isValidVerse(curFile, vs, "Song-3.html#vs4")
                || isValidVerse(curFile, vs, "Isa-64.html#vs7")
                || isValidVerse(curFile, vs, "Jer-06.html#vs23")
                || isValidVerse(curFile, vs, "Jer-37.html#vs14")
                || isValidVerse(curFile, vs, "Matt-14.html#vs31")
                || isValidVerse(curFile, vs, "Luke-14.html#vs4");
    } // isVastgrijpen

    public static boolean isGrijpen(final File curFile, final String vs) {
        return !isAangrijpen(curFile, vs)
                && !isGreep(curFile, vs)
                && !isIngrijpen(curFile, vs)
                && !isMoedGrijpen(curFile, vs)
                && !isVastgrijpen(curFile, vs);
    } // isGrijpen


}
