package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLeren {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "gezonde leer" -> isGezondeLeer(curFile, vs);
            case "leer (onderwijs)" -> isLeer_Onderwijs(curFile, vs);
            case "leer (stof)" -> isLeer_Stof(curFile, vs);
            case "wind van leer" -> isWindVanLeer(curFile, vs);
            case "leren" -> isLeren(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isGezondeLeer(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Tim-1.html#vs10")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs3")
                || isValidVerse(curFile, vs, "Titus-2.html#vs1");
    } // isGezondeLeer

    public static boolean isLeer_Onderwijs(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-32.html#vs2")
                || isValidVerse(curFile, vs, "Mark-01.html#vs27")
                || isValidVerse(curFile, vs, "Acts-02.html#vs42")
                || isValidVerse(curFile, vs, "Acts-05.html#vs28")
                || isValidVerse(curFile, vs, "Acts-13.html#vs12")
                || isValidVerse(curFile, vs, "Acts-17.html#vs19")
                || isValidVerse(curFile, vs, "Rom-06.html#vs17")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs19")
                || isValidVerse(curFile, vs, "Gal-5.html#vs20")
                || isValidVerse(curFile, vs, "Eph-4.html#vs14")
                || isValidVerse(curFile, vs, "1Tim-1.html#vs3", 10)
                || isValidVerse(curFile, vs, "1Tim-4.html#vs6", 16)
                || isValidVerse(curFile, vs, "1Tim-5.html#vs17")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs1", 3)
                || isValidVerse(curFile, vs, "2Tim-4.html#vs3")
                || isValidVerse(curFile, vs, "Titus-1.html#vs9")
                || isValidVerse(curFile, vs, "Titus-2.html#vs1")
                || isValidVerse(curFile, vs, "Heb-06.html#vs2")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs1")
                || isValidVerse(curFile, vs, "2John-1.html#vs9", 10)
                || isValidVerse(curFile, vs, "Rev-02.html#vs14", 15, 24)
                || isValidVerse(curFile, vs, "Didache-11.html#vs2");
    } // isLeer_Onderwijs

    public static boolean isLeer_Stof(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-28.html#vs32")
                || isValidVerse(curFile, vs, "Exod-39.html#vs23")
                || isValidVerse(curFile, vs, "Lev-13.html#vs48", 49, 51, 52, 53, 56, 57, 58, 59)
                || isValidVerse(curFile, vs, "Lev-15.html#vs17")
                || isValidVerse(curFile, vs, "Num-31.html#vs20")
                || isValidVerse(curFile, vs, "Josh-09.html#vs4", 13)
                || isValidVerse(curFile, vs, "Judg-04.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs8")
                || isValidVerse(curFile, vs, "Job-32.html#vs19")
                || isValidVerse(curFile, vs, "Ps-119.html#vs83")
                || isValidVerse(curFile, vs, "Matt-03.html#vs4")
                || isValidVerse(curFile, vs, "Matt-09.html#vs17")
                || isValidVerse(curFile, vs, "Mark-01.html#vs6")
                || isValidVerse(curFile, vs, "Mark-02.html#vs22")
                || isValidVerse(curFile, vs, "Luke-05.html#vs37");
    } // isLeer_Stof

    public static boolean isWindVanLeer(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eph-4.html#vs14");
    } // isWindVanLeer

    public static boolean isLeren(final File curFile, final String vs, final String arg) {
        return (!isGezondeLeer(curFile, vs)
                && !isLeer_Onderwijs(curFile, vs)
                && !isLeer_Stof(curFile, vs)
                && !isWindVanLeer(curFile, vs))
                || (isValidVerse(curFile, vs, "Rev-02.html#vs14") && arg.equals("leerde"))
                || (isValidVerse(curFile, vs, "Rev-02.html#vs24") && arg.equals("leren"));
    } // isLeren
}
