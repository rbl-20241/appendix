package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidUur {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "half uur" -> isHalfUur(curFile, vs);
            case "een uur" -> isEenUur(curFile, vs);
            case "twee uur" -> isTweeUur(curFile, vs);
            case "drie uur" -> isDrieUur(curFile, vs);
            case "twaalf uur" -> isTwaalfUur(curFile, vs);
            case "derde uur" -> isDerdeUur(curFile, vs);
            case "zesde uur" -> isZesdeUur(curFile, vs);
            case "zevende uur" -> isZevendeUur(curFile, vs);
            case "negende uur" -> isNegendeUur(curFile, vs);
            case "tiende uur" -> isTiendeUur(curFile, vs);
            case "elfde uur" -> isElfdeUur(curFile, vs);
            default -> true;
        };
    }

    public static boolean isHalfUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-08.html#vs1");
    } // isHalfUur

    public static boolean isEenUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-20.html#vs12")
                || isValidVerse(curFile, vs, "Matt-26.html#vs40")
                || isValidVerse(curFile, vs, "Mark-14.html#vs37")
                || isValidVerse(curFile, vs, "Rev-17.html#vs12")
                || isValidVerse(curFile, vs, "Rev-18.html#vs10", 16, 19);
    } // isEenUur

    public static boolean isTweeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-19.html#vs34");
    } // isTweeUur

    public static boolean isDrieUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-05.html#vs7");
    } // isDrieUur

    public static boolean isTwaalfUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-11.html#vs9");
    } // isTwaalfUur

    public static boolean isDerdeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-20.html#vs3")
                || isValidVerse(curFile, vs, "Mark-15.html#vs25")
                || isValidVerse(curFile, vs, "Acts-02.html#vs15")
                || isValidVerse(curFile, vs, "Acts-23.html#vs23");
    } // isDerdeUur

    public static boolean isZesdeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-27.html#vs45")
                || isValidVerse(curFile, vs, "Mark-15.html#vs33")
                || isValidVerse(curFile, vs, "Luke-23.html#vs44")
                || isValidVerse(curFile, vs, "John-04.html#vs6")
                || isValidVerse(curFile, vs, "John-19.html#vs14")
                || isValidVerse(curFile, vs, "Acts-10.html#vs9");
    } // isZesdeUur

    public static boolean isZevendeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-04.html#vs52");
    } // isZevendeUur

    public static boolean isNegendeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-20.html#vs5")
                || isValidVerse(curFile, vs, "Matt-27.html#vs45", 46)
                || isValidVerse(curFile, vs, "Mark-15.html#vs33", 34)
                || isValidVerse(curFile, vs, "Luke-23.html#vs44")
                || isValidVerse(curFile, vs, "Acts-03.html#vs1")
                || isValidVerse(curFile, vs, "Acts-10.html#vs3", 30);
    } // isNegendeUur

    public static boolean isTiendeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-01.html#vs40");
    } // isTiendeUur

    public static boolean isElfdeUur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-20.html#vs9");
    } // isElfdeUur

}
