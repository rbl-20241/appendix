package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWijken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwijken" -> isAfwijken(curFile, vs);
            case "terugwijken" -> isTerugwijken(curFile, vs);
            case "uitwijken" -> isUitwijken();
            case "week (7 dagen)" -> isZevenDagen(curFile, vs);
            case "week (toestand)" -> isToestand(curFile, vs);
            case "wijken" -> isWijken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfwijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs2")
                || isValidVerse(curFile, vs, "Num-20.html#vs21")
                || isValidVerse(curFile, vs, "Num-22.html#vs23", 26, 32)
                || isValidVerse(curFile, vs, "Deut-05.html#vs32")
                || isValidVerse(curFile, vs, "Josh-01.html#vs7")
                || isValidVerse(curFile, vs, "Judg-04.html#vs18")
                || isValidVerse(curFile, vs, "Judg-14.html#vs8")
                || isValidVerse(curFile, vs, "Judg-18.html#vs3", 15)
                || isValidVerse(curFile, vs, "Judg-19.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs20", 21)
                || isValidVerse(curFile, vs, "2Sam-22.html#vs23")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs43")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs29", 31)
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs2", 6, 11)
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs9", 18, 24, 28)
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs22")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-22.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-08.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs32")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs2", 33)
                || isValidVerse(curFile, vs, "Ps-119.html#vs157")
                || isValidVerse(curFile, vs, "Prov-04.html#vs5", 15, 27)
                || isValidVerse(curFile, vs, "Prov-05.html#vs7")
                || isValidVerse(curFile, vs, "Isa-30.html#vs11")
                || isValidVerse(curFile, vs, "Dan-09.html#vs5")
                || isValidVerse(curFile, vs, "Joel-2.html#vs7");
    } // isAfwijken

    public static boolean isTerugwijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-01.html#vs22")
                || isValidVerse(curFile, vs, "Isa-50.html#vs5")
                || isValidVerse(curFile, vs, "Jer-38.html#vs22")
                || isValidVerse(curFile, vs, "Rev-06.html#vs14");
    } // isTerugwijken

    public static boolean isUitwijken() {
        return false;
    } // isUitwijken

    public static boolean isZevenDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-12.html#vs5")
                || isValidVerse(curFile, vs, "Lev-23.html#vs15")
                || isValidVerse(curFile, vs, "Deut-16.html#vs9")
                || isValidVerse(curFile, vs, "Jer-05.html#vs24")
                || isValidVerse(curFile, vs, "Dan-09.html#vs24", 25, 26, 27)
                || isValidVerse(curFile, vs, "Dan-10.html#vs2", 3)
                || isValidVerse(curFile, vs, "Matt-28.html#vs1")
                || isValidVerse(curFile, vs, "Mark-16.html#vs2", 9)
                || isValidVerse(curFile, vs, "Luke-18.html#vs12")
                || isValidVerse(curFile, vs, "Luke-24.html#vs1")
                || isValidVerse(curFile, vs, "John-20.html#vs1", 19)
                || isValidVerse(curFile, vs, "Acts-20.html#vs7")
                || isValidVerse(curFile, vs, "1Cor-16.html#vs2");
    } // isZevenDagen

    public static boolean isToestand(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-20.html#vs3", 8)
                || isValidVerse(curFile, vs, "2Kgs-22.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs27")
                || isValidVerse(curFile, vs, "Job-23.html#vs16")
                || isValidVerse(curFile, vs, "Isa-07.html#vs4")
                || isValidVerse(curFile, vs, "Jer-51.html#vs46")
                || isValidVerse(curFile, vs, "Acts-21.html#vs13");
    } // isToestand

    private static boolean isWijken(final File curFile, final String vs) {
        return !isAfwijken(curFile, vs)
                && !isTerugwijken(curFile, vs)
                && !isUitwijken()
                && !isZevenDagen(curFile, vs)
                && !isToestand(curFile, vs);
    }  // isWijken

}
