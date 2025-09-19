package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVellen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "neervellen" -> isNeervellen(curFile, vs);
            case "oordeel vellen" -> isOordeelVellen(curFile, vs);
            case "vel" -> isVel(curFile, vs);
            case "veld" -> isVeld(curFile, vs, keyArg, arg);
            case "vonnis vellen" -> isVonnisVellen(curFile, vs);
            case "vellen" -> isVellen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isNeervellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-32.html#vs21")
                || isValidVerse(curFile, vs, "Ps-017.html#vs13")
                || isValidVerse(curFile, vs, "Ps-037.html#vs14")
                || isValidVerse(curFile, vs, "Ps-078.html#vs31");
    } // isNeervellen

    public static boolean isOordeelVellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-03.html#vs28")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs21")
                || isValidVerse(curFile, vs, "Zech-07.html#vs9")
                || isValidVerse(curFile, vs, "John-05.html#vs27")
                || isValidVerse(curFile, vs, "John-07.html#vs24")
                || isValidVerse(curFile, vs, "Acts-24.html#vs6")
                || isValidVerse(curFile, vs, "1Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "Jude-1.html#vs15")
                || isValidVerse(curFile, vs, "Rev-16.html#vs5");
    } // isOordeelVellen

    public static boolean isVel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs16");
    } // isVel

    public static boolean isVeld(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("veld", keyArg) && isEqual("veld", arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "Exod-08.html#vs13")
                || isValidVerse(curFile, vs, "Deut-32.html#vs32")
                || isValidVerse(curFile, vs, "Judg-05.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs19")
                || isValidVerse(curFile, vs, "Neh-05.html#vs3", 4, 5, 11)
                || isValidVerse(curFile, vs, "Neh-12.html#vs29", 44)
                || isValidVerse(curFile, vs, "Job-05.html#vs10")
                || isValidVerse(curFile, vs, "Ps-065.html#vs14")
                || isValidVerse(curFile, vs, "Ps-132.html#vs6")
                || isValidVerse(curFile, vs, "Ps-144.html#vs13")
                || isValidVerse(curFile, vs, "Prov-08.html#vs26")
                || isValidVerse(curFile, vs, "Isa-10.html#vs18")
                || isValidVerse(curFile, vs, "Isa-16.html#vs8")
                || isValidVerse(curFile, vs, "Jer-04.html#vs17")
                || isValidVerse(curFile, vs, "Jer-31.html#vs40")
                || isValidVerse(curFile, vs, "Lam-4.html#vs9")
                || isValidVerse(curFile, vs, "Hos-12.html#vs12")
                || isValidVerse(curFile, vs, "Hab-3.html#vs17")
                || isValidVerse(curFile, vs, "Luke-21.html#vs21")
                || isValidVerse(curFile, vs, "John-04.html#vs35")
                || isValidVerse(curFile, vs, "Jas-5.html#vs4");
    } // isVeld

    public static boolean isVonnisVellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-20.html#vs40")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs11");
    } // isVonnisVellen

    public static boolean isVellen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isNeervellen(curFile, vs)
                && !isOordeelVellen(curFile, vs)
                && !isVel(curFile, vs)
                && !isVonnisVellen(curFile, vs)
                && !isVeld(curFile, vs, keyArg, arg);
    } // isVellen


}
