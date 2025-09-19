package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWassen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwassen" -> isAfwassen(curFile, vs);
            case "schoonwassen" -> isSchoonwassen(curFile, vs);
            case "was" -> isWas(curFile, vs);
            case "wassen" -> isWassen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfwassen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-04.html#vs14");
    } // isAfwassen

    public static boolean isSchoonwassen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-051.html#vs4");
    } // isSchoonwassen

    public static boolean isWas(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-022.html#vs15")
                || isValidVerse(curFile, vs, "Ps-068.html#vs3")
                || isValidVerse(curFile, vs, "Ps-097.html#vs5")
                || isValidVerse(curFile, vs, "Mic-1.html#vs4");
    } // isWas

    public static boolean isWassen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs4")
                || isValidVerse(curFile, vs, "Gen-19.html#vs2")
                || isValidVerse(curFile, vs, "Gen-24.html#vs32")
                || isValidVerse(curFile, vs, "Gen-43.html#vs24", 31)
                || isValidVerse(curFile, vs, "Gen-49.html#vs11")
                || isValidVerse(curFile, vs, "Exod-02.html#vs5")
                || isValidVerse(curFile, vs, "Exod-19.html#vs10", 14)
                || isValidVerse(curFile, vs, "Exod-29.html#vs4", 17)
                || isValidVerse(curFile, vs, "Exod-30.html#vs18", 19, 20, 21)
                || isValidVerse(curFile, vs, "Exod-40.html#vs12", 30, 31, 32)
                || isValidVerse(curFile, vs, "Lev-01.html#vs9", 13)
                || isValidVerse(curFile, vs, "Lev-06.html#vs")
                || isValidVerse(curFile, vs, "Lev-08.html#vs6", 21)
                || isValidVerse(curFile, vs, "Lev-09.html#vs14")
                || isValidVerse(curFile, vs, "Lev-11.html#vs25", 28, 40)
                || isValidVerse(curFile, vs, "Lev-13.html#vs6", 34, 54, 55, 56, 58)
                || isValidVerse(curFile, vs, "Lev-14.html#vs8",9, 47)
                || isValidVerse(curFile, vs, "Lev-15.html#vs5", 6, 7, 8, 10, 11, 13, 17, 18, 21, 22, 27)
                || isValidVerse(curFile, vs, "Lev-16.html#vs4", 24, 26, 28)
                || isValidVerse(curFile, vs, "Lev-17.html#vs15", 16)
                || isValidVerse(curFile, vs, "Lev-22.html#vs6")
                || isValidVerse(curFile, vs, "Num-08.html#vs7", 21)
                || isValidVerse(curFile, vs, "Num-19.html#vs7", 8, 10, 19, 21)
                || isValidVerse(curFile, vs, "Num-31.html#vs24")
                || isValidVerse(curFile, vs, "Deut-21.html#vs6")
                || isValidVerse(curFile, vs, "Deut-23.html#vs11")
                || isValidVerse(curFile, vs, "Judg-19.html#vs21")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs41")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs24")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs38")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs10", 12, 13)
                || isValidVerse(curFile, vs, "2Chr-04.html#vs6")
                || isValidVerse(curFile, vs, "Job-09.html#vs30")
                || isValidVerse(curFile, vs, "Ps-026.html#vs6")
                || isValidVerse(curFile, vs, "Ps-051.html#vs4", 9)
                || isValidVerse(curFile, vs, "Ps-058.html#vs11")
                || isValidVerse(curFile, vs, "Ps-073.html#vs13")
                || isValidVerse(curFile, vs, "Prov-30.html#vs12")
                || isValidVerse(curFile, vs, "Song-5.html#vs3")
                || isValidVerse(curFile, vs, "Isa-01.html#vs16")
                || isValidVerse(curFile, vs, "Jer-02.html#vs22")
                || isValidVerse(curFile, vs, "Jer-04.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs40")
                || isValidVerse(curFile, vs, "Matt-06.html#vs17")
                || isValidVerse(curFile, vs, "Matt-15.html#vs2")
                || isValidVerse(curFile, vs, "Mark-07.html#vs3", 4, 8)
                || isValidVerse(curFile, vs, "John-09.html#vs7", 11)
                || isValidVerse(curFile, vs, "Luke-11.html#vs38")
                || isValidVerse(curFile, vs, "John-13.html#vs5", 6, 8, 10, 12, 14)
                || isValidVerse(curFile, vs, "Acts-09.html#vs37")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs10")
                || isValidVerse(curFile, vs, "Heb-10.html#vs22")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs22")
                || isValidVerse(curFile, vs, "Rev-01.html#vs5")
                || isValidVerse(curFile, vs, "Rev-07.html#vs14");
    } // isWassen
}
