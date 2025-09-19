package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidLeggen.isTeSlapenLeggen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSlapen {

    public static boolean isValid(final String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "in slaap vallen" -> isInSlaapVallen(curFile, vs, keyArg, arg);
            case "slaap" -> isSlaap(curFile, vs);
            case "slapen" -> isSlapen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isInSlaapVallen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-02.html#vs21")
                || isValidVerse(curFile, vs, "Judg-04.html#vs21")
                || isValidVerse(curFile, vs, "Job-04.html#vs13")
                || isValidVerse(curFile, vs, "Ps-076.html#vs7")
                || isValidVerse(curFile, vs, "Prov-19.html#vs15")
                || isValidVerse(curFile, vs, "Dan-08.html#vs18")
                || isValidVerse(curFile, vs, "Dan-10.html#vs9")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs5")
                || isValidVerse(curFile, vs, "Matt-25.html#vs5")
                || isValidVerse(curFile, vs, "Luke-08.html#vs23");
    } // isInSlaapVallen

    public static boolean isSlaap(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-02.html#vs21")
                || isValidVerse(curFile, vs, "Gen-15.html#vs12")
                || isValidVerse(curFile, vs, "Gen-28.html#vs16")
                || isValidVerse(curFile, vs, "Gen-31.html#vs40")
                || isValidVerse(curFile, vs, "Judg-04.html#vs21", 22)
                || isValidVerse(curFile, vs, "Judg-05.html#vs26")
                || isValidVerse(curFile, vs, "Judg-16.html#vs14", 20)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs12")
                || isValidVerse(curFile, vs, "Esth-06.html#vs1")
                || isValidVerse(curFile, vs, "Job-14.html#vs12")
                || isValidVerse(curFile, vs, "Job-33.html#vs15")
                || isValidVerse(curFile, vs, "Ps-090.html#vs5")
                || isValidVerse(curFile, vs, "Ps-127.html#vs2")
                || isValidVerse(curFile, vs, "Ps-132.html#vs4")
                || isValidVerse(curFile, vs, "Prov-03.html#vs24")
                || isValidVerse(curFile, vs, "Prov-04.html#vs16")
                || isValidVerse(curFile, vs, "Prov-06.html#vs4", 9)
                || isValidVerse(curFile, vs, "Prov-20.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs11")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs16")
                || isValidVerse(curFile, vs, "Song-4.html#vs3")
                || isValidVerse(curFile, vs, "Song-6.html#vs7")
                || isValidVerse(curFile, vs, "Isa-29.html#vs10")
                || isValidVerse(curFile, vs, "Jer-09.html#vs26")
                || isValidVerse(curFile, vs, "Jer-25.html#vs23")
                || isValidVerse(curFile, vs, "Jer-31.html#vs26")
                || isValidVerse(curFile, vs, "Jer-48.html#vs45")
                || isValidVerse(curFile, vs, "Jer-49.html#vs32")
                || isValidVerse(curFile, vs, "Jer-51.html#vs39", 57)
                || isValidVerse(curFile, vs, "Dan-02.html#vs1")
                || isValidVerse(curFile, vs, "Dan-06.html#vs19")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs5")
                || isValidVerse(curFile, vs, "Zech-04.html#vs1")
                || isValidVerse(curFile, vs, "Matt-01.html#vs24")
                || isValidVerse(curFile, vs, "Luke-09.html#vs32")
                || isValidVerse(curFile, vs, "John-11.html#vs11", 13)
                || isValidVerse(curFile, vs, "Acts-20.html#vs9")
                || isValidVerse(curFile, vs, "Rom-11.html#vs8")
                || isValidVerse(curFile, vs, "Rom-13.html#vs11")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs27");
    } // isSlaap

    public static boolean isSlapen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isInSlaapVallen(curFile, vs, keyArg, arg)
                && !isSlaap(curFile, vs)
                && !isTeSlapenLeggen(curFile, vs, arg);
    } // isSlapen

}
