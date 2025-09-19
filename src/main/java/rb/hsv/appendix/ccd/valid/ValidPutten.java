package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPutten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "put" -> isPut(curFile, vs, arg);
            case "put van de afgrond" -> isPutVanDeAfgrond(curFile, vs, keyArg, arg);
            case "put van het verderf" -> isPutVanHetVerderf(curFile, vs, keyArg, arg);
            case "uitputten" -> isUitputten();
            case "putten" -> isPutten(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isPutVanDeAfgrond(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Rev-09.html#vs1", 2);
    } // isPutVanDeAfgrond

    public static boolean isPutVanHetVerderf(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Ps-055.html#vs24");
    } // isPutVanHetVerderf

    public static boolean isPut(final File curFile, final String vs, final String arg) {
        return isValidVerse(curFile, vs, "Gen-16.html#vs14")
                || isValidVerse(curFile, vs, "Gen-21.html#vs30")
                || (isValidVerse(curFile, vs, "Gen-24.html#vs11", 62) && arg.equals("put"))
                || isValidVerse(curFile, vs, "Gen-25.html#vs11")
                || isValidVerse(curFile, vs, "Gen-26.html#vs15", 19, 20, 21, 22, 25, 32)
                || isValidVerse(curFile, vs, "Gen-29.html#vs2", 3, 8, 10)
                || isValidVerse(curFile, vs, "Gen-37.html#vs20", 22, 24, 28, 29)
                || isValidVerse(curFile, vs, "Exod-02.html#vs15")
                || isValidVerse(curFile, vs, "Exod-21.html#vs33", 34)
                || isValidVerse(curFile, vs, "Lev-11.html#vs36")
                || isValidVerse(curFile, vs, "Num-20.html#vs17")
                || isValidVerse(curFile, vs, "Num-21.html#vs17", 18, 22)
                || isValidVerse(curFile, vs, "Deut-06.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-17.html#vs18", 19, 21)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs31")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs10")
                || isValidVerse(curFile, vs, "Job-09.html#vs31")
                || isValidVerse(curFile, vs, "Ps-055.html#vs24")
                || isValidVerse(curFile, vs, "Ps-069.html#vs16")
                || isValidVerse(curFile, vs, "Prov-05.html#vs15")
                || isValidVerse(curFile, vs, "Prov-23.html#vs27")
                || isValidVerse(curFile, vs, "Song-4.html#vs15")
                || isValidVerse(curFile, vs, "Isa-36.html#vs16")
                || isValidVerse(curFile, vs, "Isa-51.html#vs1", 14)
                || isValidVerse(curFile, vs, "Jer-38.html#vs6", 7, 9, 10, 11, 13)
                || isValidVerse(curFile, vs, "Jer-41.html#vs7", 9)
                || isValidVerse(curFile, vs, "Lam-3.html#vs53", 55)
                || isValidVerse(curFile, vs, "Zeph-2.html#vs6")
                || isValidVerse(curFile, vs, "Zech-09.html#vs11")
                || isValidVerse(curFile, vs, "Luke-14.html#vs5")
                || isValidVerse(curFile, vs, "John-04.html#vs11", 12)
                || isValidVerse(curFile, vs, "Rev-09.html#vs1", 2);
    } // isPut

    public static boolean isPut_naam(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-10.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-01.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs5")
                || isValidVerse(curFile, vs, "Nah-3.html#vs9");
    } // isPut

    public static boolean isUitputten() {
        return false;
    } // isUitputten

    public static boolean isPutten(final File curFile, final String vs, final String keyArg, final String arg) {
        return !isPut(curFile, vs, arg)
                && !isPut_naam(curFile, vs)
                && !isPutVanDeAfgrond(curFile, vs, keyArg, arg)
                && !isPutVanHetVerderf(curFile, vs, keyArg, arg)
                && !isUitputten();
    }  // isPutten

}
