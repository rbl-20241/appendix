package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRukken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afrukken" -> isAfrukken(curFile, vs);
            case "losrukken" -> isLosrukken(curFile, vs);
            case "oprukken" -> isOprukken(curFile, vs);
            case "uiteenrukken" -> isUiteenrukken();
            case "uitrukken" -> isUitrukken(curFile, vs);
            case "wegrukken" -> isWegrukken(curFile, vs);
            case "rukken" -> isRukken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfrukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-32.html#vs2", 3)
                || isValidVerse(curFile, vs, "Mic-2.html#vs8")
                || isValidVerse(curFile, vs, "Acts-16.html#vs22");
    } // isAfrukken

    public static boolean isLosrukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-23.html#vs17", 18);
    } // isLosrukken

    public static boolean isOprukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-46.html#vs11")
                || isValidVerse(curFile, vs, "Jer-49.html#vs28", 31)
                || isValidVerse(curFile, vs, "Jer-50.html#vs3", 21);
    } // isOprukken

    public static boolean isUiteenrukken() {
        return false;
    } // isUiteenrukken

    public static boolean isUitrukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs44")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs23")
                || isValidVerse(curFile, vs, "Job-18.html#vs14")
                || isValidVerse(curFile, vs, "Job-29.html#vs17")
                || isValidVerse(curFile, vs, "Jer-12.html#vs14")
                || isValidVerse(curFile, vs, "Matt-05.html#vs29")
                || isValidVerse(curFile, vs, "Matt-18.html#vs9")
                || isValidVerse(curFile, vs, "John-10.html#vs28", 29)
                || isValidVerse(curFile, vs, "Jude-1.html#vs23");
    } // isUitrukken

    public static boolean isWegrukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-028.html#vs3")
                || isValidVerse(curFile, vs, "Jer-01.html#vs10")
                || isValidVerse(curFile, vs, "Jer-12.html#vs3", 14)
                || isValidVerse(curFile, vs, "Jer-18.html#vs7")
                || isValidVerse(curFile, vs, "Jer-31.html#vs28")
                || isValidVerse(curFile, vs, "Hos-02.html#vs8")
                || isValidVerse(curFile, vs, "Matt-13.html#vs19")
                || isValidVerse(curFile, vs, "Acts-23.html#vs10");
    } // isWegrukken

    private static boolean isRukken(final File curFile, final String vs) {
        return !isAfrukken(curFile, vs)
                && !isLosrukken(curFile, vs)
                && !isOprukken(curFile, vs)
                && !isUiteenrukken()
                && !isUitrukken(curFile, vs)
                && !isWegrukken(curFile, vs);
    }  // isRukken

}
