package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZijn {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bij machte zijn" -> isBijMachteZijn(curFile, vs, arg);
            case "bijeenzijn" -> isBijeenzijn(curFile, vs);
            case "in leven zijn" -> isInLevenZijn(curFile, vs, arg);
            case "in verwarring zijn" -> isInVerwarringZijn(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isBijMachteZijn(final File curFile, final String vs, final String arg) {
        if (arg.equals("bij machte zijn")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-28.html#vs32")
                || isValidVerse(curFile, vs, "Mic-2.html#vs1")
                || isValidVerse(curFile, vs, "Luke-14.html#vs31")
                || isValidVerse(curFile, vs, "Acts-11.html#vs17")
                || isValidVerse(curFile, vs, "Acts-20.html#vs32")
                || isValidVerse(curFile, vs, "Rom-14.html#vs4")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs8")
                || isValidVerse(curFile, vs, "Eph-3.html#vs20")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs12")
                || isValidVerse(curFile, vs, "Titus-1.html#vs9")
                || isValidVerse(curFile, vs, "Heb-11.html#vs18")
                || isValidVerse(curFile, vs, "Jas-3.html#vs2")
                || isValidVerse(curFile, vs, "Jude-1.html#vs24");
    } // isBijMachteZijn

    public static boolean isBijeenzijn(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-22.html#vs41")
                || isValidVerse(curFile, vs, "Matt-27.html#vs17")
                || isValidVerse(curFile, vs, "Mark-08.html#vs1")
                || isValidVerse(curFile, vs, "John-20.html#vs19")
                || isValidVerse(curFile, vs, "John-21.html#vs2")
                || isValidVerse(curFile, vs, "Acts-01.html#vs15")
                || isValidVerse(curFile, vs, "Acts-02.html#vs1", 44)
                || isValidVerse(curFile, vs, "Acts-04.html#vs31")
                || isValidVerse(curFile, vs, "Acts-05.html#vs12")
                || isValidVerse(curFile, vs, "Acts-12.html#vs12")
                || isValidVerse(curFile, vs, "Acts-20.html#vs8");
    } // isBijeenzijn

    public static boolean isInLevenZijn(final File curFile, final String vs, final String arg) {
        if (arg.equals("in leven zijn")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lev-18.html#vs18")
                || isValidVerse(curFile, vs, "Deut-04.html#vs4")
                || isValidVerse(curFile, vs, "Deut-05.html#vs3")
                || isValidVerse(curFile, vs, "Deut-31.html#vs27")
                || isValidVerse(curFile, vs, "Ps-038.html#vs20")
                || isValidVerse(curFile, vs, "Eccl-04.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-07.html#vs13")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs6");
    } // isInLevenZijn

    public static boolean isInVerwarringZijn(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in verwarring zijn")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Esth-03.html#vs15")
                || isValidVerse(curFile, vs, "Joel-1.html#vs18")
                || isValidVerse(curFile, vs, "Luke-24.html#vs38")
                || isValidVerse(curFile, vs, "Acts-21.html#vs31");
    } // isInVerwarringZijn

}
