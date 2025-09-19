package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLichten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        if (arg.equals("Licht")) {
            return isHetLicht(curFile, vs);
        }

        return switch (keyArg) {
            case "anker lichten" -> isAnkerLichten(curFile, vs);
            case "inlichten" -> isInlichten(curFile, vs);
            case "licht (niet donker)" -> isLicht(curFile, vs);
            case "licht (niet zwaar)" -> isLicht_Gewicht(curFile, vs);
            case "oplichten" -> isOplichten(curFile, vs);
            case "lichten" -> isLichten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAnkerLichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-27.html#vs13");
    } // isAnkerLichten

    public static boolean isHetLicht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-10.html#vs17")
                || isValidVerse(curFile, vs, "Isa-49.html#vs6")
                || isValidVerse(curFile, vs, "John-08.html#vs12")
                || isValidVerse(curFile, vs, "John-09.html#vs5");
    } // isHetLicht

    public static boolean isInlichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-15.html#vs28");
    } // isInlichten

    public static boolean isLicht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs3", 4, 5, 14, 15, 16, 17, 18)
                || isValidVerse(curFile, vs, "Gen-44.html#vs3", 16)
                || isValidVerse(curFile, vs, "Exod-10.html#vs23")
                || isValidVerse(curFile, vs, "Exod-13.html#vs21")
                || isValidVerse(curFile, vs, "Exod-25.html#vs37")
                || isValidVerse(curFile, vs, "Exod-27.html#vs20")
                || isValidVerse(curFile, vs, "Exod-35.html#vs14")
                || isValidVerse(curFile, vs, "Exod-39.html#vs37")
                || isValidVerse(curFile, vs, "Lev-24.html#vs2")
                || isValidVerse(curFile, vs, "Num-04.html#vs9", 16)
                || isValidVerse(curFile, vs, "Num-08.html#vs2")
                || isValidVerse(curFile, vs, "Judg-19.html#vs26")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs36")
                || isValidVerse(curFile, vs, "1Sam-29.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs32")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs4")
                || isValidVerse(curFile, vs, "Esth-08.html#vs16")
                || isValidVerse(curFile, vs, "Job-03.html#vs9", 16)
                || isValidVerse(curFile, vs, "Job-10.html#vs3", 22)
                || isValidVerse(curFile, vs, "Job-12.html#vs22", 25)
                || isValidVerse(curFile, vs, "Job-17.html#vs12")
                || isValidVerse(curFile, vs, "Job-18.html#vs5", 6, 18)
                || isValidVerse(curFile, vs, "Job-22.html#vs28")
                || isValidVerse(curFile, vs, "Job-24.html#vs13", 14, 16)
                || isValidVerse(curFile, vs, "Job-25.html#vs3")
                || isValidVerse(curFile, vs, "Job-26.html#vs10")
                || isValidVerse(curFile, vs, "Job-28.html#vs11")
                || isValidVerse(curFile, vs, "Job-29.html#vs3", 24)
                || isValidVerse(curFile, vs, "Job-30.html#vs26")
                || isValidVerse(curFile, vs, "Job-33.html#vs28", 30)
                || isValidVerse(curFile, vs, "Job-36.html#vs30", 32)
                || isValidVerse(curFile, vs, "Job-37.html#vs3", 11, 15, 21)
                || isValidVerse(curFile, vs, "Job-38.html#vs15", 19, 24)
                || isValidVerse(curFile, vs, "Job-41.html#vs9")
                || isValidVerse(curFile, vs, "Ps-004.html#vs7")
                || isValidVerse(curFile, vs, "Ps-027.html#vs1")
                || isValidVerse(curFile, vs, "Ps-036.html#vs10")
                || isValidVerse(curFile, vs, "Ps-038.html#vs11")
                || isValidVerse(curFile, vs, "Ps-043.html#vs3")
                || isValidVerse(curFile, vs, "Ps-044.html#vs4")
                || isValidVerse(curFile, vs, "Ps-049.html#vs20")
                || isValidVerse(curFile, vs, "Ps-056.html#vs14")
                || isValidVerse(curFile, vs, "Ps-074.html#vs16")
                || isValidVerse(curFile, vs, "Ps-080.html#vs4", 8, 20)
                || isValidVerse(curFile, vs, "Ps-089.html#vs16")
                || isValidVerse(curFile, vs, "Ps-090.html#vs8")
                || isValidVerse(curFile, vs, "Ps-097.html#vs11")
                || isValidVerse(curFile, vs, "Ps-104.html#vs2")
                || isValidVerse(curFile, vs, "Ps-112.html#vs4")
                || isValidVerse(curFile, vs, "Ps-118.html#vs27")
                || isValidVerse(curFile, vs, "Ps-119.html#vs105", 130)
                || isValidVerse(curFile, vs, "Ps-136.html#vs7")
                || isValidVerse(curFile, vs, "Ps-139.html#vs11", 12)
                || isValidVerse(curFile, vs, "Prov-04.html#vs18")
                || isValidVerse(curFile, vs, "Prov-06.html#vs23")
                || isValidVerse(curFile, vs, "Prov-13.html#vs9")
                || isValidVerse(curFile, vs, "Prov-15.html#vs30")
                || isValidVerse(curFile, vs, "Prov-16.html#vs15")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-11.html#vs7")
                || isValidVerse(curFile, vs, "Eccl-12.html#vs2")
                || isValidVerse(curFile, vs, "Isa-02.html#vs5")
                || isValidVerse(curFile, vs, "Isa-05.html#vs20", 30)
                || isValidVerse(curFile, vs, "Isa-09.html#vs1")
                || isValidVerse(curFile, vs, "Isa-10.html#vs17")
                || isValidVerse(curFile, vs, "Isa-13.html#vs10")
                || isValidVerse(curFile, vs, "Isa-24.html#vs15")
                || isValidVerse(curFile, vs, "Isa-26.html#vs21")
                || isValidVerse(curFile, vs, "Isa-30.html#vs26")
                || isValidVerse(curFile, vs, "Isa-42.html#vs6", 16)
                || isValidVerse(curFile, vs, "Isa-45.html#vs7")
                || isValidVerse(curFile, vs, "Isa-49.html#vs6")
                || isValidVerse(curFile, vs, "Isa-50.html#vs10")
                || isValidVerse(curFile, vs, "Isa-51.html#vs4")
                || isValidVerse(curFile, vs, "Isa-58.html#vs8", 10)
                || isValidVerse(curFile, vs, "Isa-59.html#vs9")
                || isValidVerse(curFile, vs, "Isa-60.html#vs1", 3, 19, 20)
                || isValidVerse(curFile, vs, "Jer-04.html#vs23")
                || isValidVerse(curFile, vs, "Jer-13.html#vs16")
                || isValidVerse(curFile, vs, "Jer-25.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs35")
                || isValidVerse(curFile, vs, "Lam-3.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs7", 8)
                || isValidVerse(curFile, vs, "Dan-02.html#vs22")
                || isValidVerse(curFile, vs, "Dan-05.html#vs11", 14)
                || isValidVerse(curFile, vs, "Dan-06.html#vs20")
                || isValidVerse(curFile, vs, "Hos-06.html#vs5")
                || isValidVerse(curFile, vs, "Joel-2.html#vs10")
                || isValidVerse(curFile, vs, "Amos-5.html#vs18", 20)
                || isValidVerse(curFile, vs, "Mic-2.html#vs1")
                || isValidVerse(curFile, vs, "Mic-7.html#vs8", 9)
                || isValidVerse(curFile, vs, "Hab-3.html#vs11")
                || isValidVerse(curFile, vs, "Zeph-2.html#vs2")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs5")
                || isValidVerse(curFile, vs, "Zech-14.html#vs6", 7)
                || isValidVerse(curFile, vs, "Matt-04.html#vs16")
                || isValidVerse(curFile, vs, "Matt-05.html#vs14", 16)
                || isValidVerse(curFile, vs, "Matt-06.html#vs23")
                || isValidVerse(curFile, vs, "Matt-10.html#vs27")
                || isValidVerse(curFile, vs, "Matt-28.html#vs1")
                || isValidVerse(curFile, vs, "Luke-02.html#vs32")
                || isValidVerse(curFile, vs, "Luke-08.html#vs16")
                || isValidVerse(curFile, vs, "Luke-11.html#vs33", 35, 36)
                || isValidVerse(curFile, vs, "Luke-12.html#vs3")
                || isValidVerse(curFile, vs, "Luke-16.html#vs8")
                || isValidVerse(curFile, vs, "John-01.html#vs4", 5, 7, 8, 9)
                || isValidVerse(curFile, vs, "John-03.html#vs19", 20, 21)
                || isValidVerse(curFile, vs, "John-05.html#vs35")
                || isValidVerse(curFile, vs, "John-08.html#vs12")
                || isValidVerse(curFile, vs, "John-09.html#vs5")
                || isValidVerse(curFile, vs, "John-11.html#vs9", 10)
                || isValidVerse(curFile, vs, "John-12.html#vs35", 36, 46)
                || isValidVerse(curFile, vs, "Acts-09.html#vs3")
                || isValidVerse(curFile, vs, "Acts-12.html#vs7")
                || isValidVerse(curFile, vs, "Acts-13.html#vs47")
                || isValidVerse(curFile, vs, "Acts-16.html#vs29")
                || isValidVerse(curFile, vs, "Acts-22.html#vs6", 9, 11)
                || isValidVerse(curFile, vs, "Acts-26.html#vs13", 18, 23)
                || isValidVerse(curFile, vs, "Rom-02.html#vs19")
                || isValidVerse(curFile, vs, "Rom-13.html#vs12")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs6")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs14")
                || isValidVerse(curFile, vs, "Eph-5.html#vs8", 13)
                || isValidVerse(curFile, vs, "Phil-2.html#vs15")
                || isValidVerse(curFile, vs, "Col-1.html#vs12")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs5")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs16")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs10")
                || isValidVerse(curFile, vs, "Jas-1.html#vs17")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs9")
                || isValidVerse(curFile, vs, "1John-1.html#vs5", 7)
                || isValidVerse(curFile, vs, "1John-2.html#vs8", 9, 10)
                || isValidVerse(curFile, vs, "Rev-08.html#vs12")
                || isValidVerse(curFile, vs, "Rev-21.html#vs24");
    } // isLicht

    public static boolean isLicht_Gewicht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-05.html#vs27")
                || isValidVerse(curFile, vs, "Matt-11.html#vs30")
                || isValidVerse(curFile, vs, "Matt-17.html#vs2")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs17");
    } // isLicht_Gewicht

    public static boolean isOplichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-139.html#vs12");
    } // isOplichten

    private static boolean isLichten(final File curFile, final String vs) {
        return !isAnkerLichten(curFile, vs)
                && !isHetLicht(curFile, vs)
                && !isInlichten(curFile, vs)
                && !isLicht(curFile, vs)
                && !isLicht_Gewicht(curFile, vs)
                && !isOplichten(curFile, vs);
    }  // isLichten (Num-06.html#vs25, Ps-031.html#vs17, Luke-17.html#vs24)

}
