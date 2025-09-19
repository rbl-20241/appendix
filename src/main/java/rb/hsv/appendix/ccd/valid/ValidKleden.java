package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKleden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "kleed" -> isKleed(curFile, vs);
            case "uitkleden" -> isUitkleden();
            case "kleden" -> isKleden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isKleed(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-09.html#vs23")
                || isValidVerse(curFile, vs, "Gen-39.html#vs12", 13, 15, 16, 18)
                || isValidVerse(curFile, vs, "Exod-22.html#vs26")
                || isValidVerse(curFile, vs, "Exod-26.html#vs7", 12, 13)
                || isValidVerse(curFile, vs, "Exod-27.html#vs9", 11, 12, 14, 15)
                || isValidVerse(curFile, vs, "Exod-35.html#vs17")
                || isValidVerse(curFile, vs, "Exod-36.html#vs14")
                || isValidVerse(curFile, vs, "Exod-38.html#vs9", 11, 12, 13, 14, 15, 16, 18)
                || isValidVerse(curFile, vs, "Exod-39.html#vs40")
                || isValidVerse(curFile, vs, "Lev-06.html#vs10")
                || isValidVerse(curFile, vs, "Num-03.html#vs26")
                || isValidVerse(curFile, vs, "Num-04.html#vs6", 7, 8, 9, 11, 12, 13, 26)
                || isValidVerse(curFile, vs, "Deut-22.html#vs17", 30)
                || isValidVerse(curFile, vs, "Deut-24.html#vs13", 17)
                || isValidVerse(curFile, vs, "Deut-27.html#vs20")
                || isValidVerse(curFile, vs, "Judg-08.html#vs25")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-21.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs29", 30)
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs39")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs3", 5)
                || isValidVerse(curFile, vs, "Esth-01.html#vs6")
                || isValidVerse(curFile, vs, "Job-13.html#vs28")
                || isValidVerse(curFile, vs, "Job-30.html#vs18")
                || isValidVerse(curFile, vs, "Job-38.html#vs14")
                || isValidVerse(curFile, vs, "Ps-069.html#vs12")
                || isValidVerse(curFile, vs, "Ps-102.html#vs27")
                || isValidVerse(curFile, vs, "Ps-109.html#vs19")
                || isValidVerse(curFile, vs, "Prov-20.html#vs16")
                || isValidVerse(curFile, vs, "Prov-27.html#vs13")
                || isValidVerse(curFile, vs, "Prov-30.html#vs4")
                || isValidVerse(curFile, vs, "Isa-21.html#vs5")
                || isValidVerse(curFile, vs, "Isa-50.html#vs9")
                || isValidVerse(curFile, vs, "Isa-51.html#vs6", 8)
                || isValidVerse(curFile, vs, "Isa-64.html#vs6")
                || isValidVerse(curFile, vs, "Jer-43.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs24")
                || isValidVerse(curFile, vs, "Mark-14.html#vs51", 52)
                || isValidVerse(curFile, vs, "John-19.html#vs24")
                || isValidVerse(curFile, vs, "Acts-12.html#vs21");
    } // isKleed

    public static boolean isUitkleden() {
        return false;
    } // isUitkleden

    public static boolean isKleden(final File curFile, final String vs) {
        return !isKleed(curFile, vs)
                && !isUitkleden();
    }  // isKleden

}
