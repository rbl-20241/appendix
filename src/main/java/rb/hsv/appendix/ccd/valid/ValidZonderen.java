package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZonderen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afzonderen" -> isAfzonderen(curFile, vs);
            case "uitzonderen" -> isUitzonderen();
            case "zonder enig gebrek" -> isZonderEnigGebrek(keyArg);
            case "zonder ophouden" -> isZonderOphouden(keyArg);
            case "zonder opzet" -> isZonderOpzet(keyArg);
            case "zonder" -> isZonder(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfzonderen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-30.html#vs35")
                || isValidVerse(curFile, vs, "Lev-13.html#vs11")
                || isValidVerse(curFile, vs, "Num-11.html#vs25")
                || isValidVerse(curFile, vs, "Num-16.html#vs21")
                || isValidVerse(curFile, vs, "Deut-04.html#vs41")
                || isValidVerse(curFile, vs, "Deut-10.html#vs8")
                || isValidVerse(curFile, vs, "Josh-20.html#vs7")
                || isValidVerse(curFile, vs, "1Chr-25.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs10")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs17")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs24")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs16")
                || isValidVerse(curFile, vs, "Neh-09.html#vs2")
                || isValidVerse(curFile, vs, "Hos-04.html#vs14")
                || isValidVerse(curFile, vs, "Acts-19.html#vs9")
                || isValidVerse(curFile, vs, "Gal-2.html#vs12");
    } // isAfzonderen

    public static boolean isUitzonderen() {
        return false;
    } // isUitzonderen

    public static boolean isZonderEnigGebrek(final @NotNull String keyArg) {
        return isEqual("zonder enig gebrek", keyArg);
    } // isZonderEnigGebrek

    public static boolean isZonderOphouden(final @NotNull String keyArg) {
        return isEqual("zonder ophouden", keyArg);
    } // isZonderHouden

    public static boolean isZonderOpzet(final @NotNull String keyArg) {
        return isEqual("zonder opzet", keyArg);
    } // isZonderOpzet

    private static boolean isZonder(final File curFile, final String vs) {
        return !isAfzonderen(curFile, vs)
                && !isUitzonderen();
    }  // isZonder

}
