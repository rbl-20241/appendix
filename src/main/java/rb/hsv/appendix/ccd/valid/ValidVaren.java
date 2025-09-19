package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVaren {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opvaren" -> isOpvaren(curFile, vs);
            case "overvaren" -> isOvervaren(curFile, vs);
            case "uitvaren tegen" -> isUitvarenTegen(curFile, vs);
            case "wegvaren" -> isWegvaren(curFile, vs);
            case "vaart zetten" -> isVaartZetten(curFile, vs);
            case "varen" -> isVaren(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isOpvaren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-17.html#vs22")
                || isValidVerse(curFile, vs, "Gen-35.html#vs13")
                || isValidVerse(curFile, vs, "Ps-047.html#vs6")
                || isValidVerse(curFile, vs, "John-20.html#vs17");
    } // isOpvaren

    public static boolean isOvervaren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-09.html#vs1");
    } // isOvervaren

    public static boolean isUitvarenTegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Tim-5.html#vs1");
    } // isUitvarenTegen

    public static boolean isVaartZetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-05.html#vs19");
    } // isVaartZetten

    public static boolean isVarenVerledenTijd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-02.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs21")
                || isValidVerse(curFile, vs, "Matt-09.html#vs1")
                || isValidVerse(curFile, vs, "Luke-08.html#vs23", 26)
                || isValidVerse(curFile, vs, "Luke-22.html#vs3")
                || isValidVerse(curFile, vs, "John-06.html#vs21")
                || isValidVerse(curFile, vs, "John-13.html#vs27")
                || isValidVerse(curFile, vs, "Acts-13.html#vs4")
                || isValidVerse(curFile, vs, "Acts-14.html#vs26")
                || isValidVerse(curFile, vs, "Acts-20.html#vs15")
                || isValidVerse(curFile, vs, "Acts-21.html#vs3")
                || isValidVerse(curFile, vs, "Acts-27.html#vs4", 6, 7)
                || isValidVerse(curFile, vs, "Acts-28.html#vs13");
    } // isVarenVerledenTijd

    public static boolean isWegvaren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mark-08.html#vs13")
                || isValidVerse(curFile, vs, "Luke-08.html#vs22")
                || isValidVerse(curFile, vs, "Acts-13.html#vs13")
                || isValidVerse(curFile, vs, "Acts-16.html#vs11")
                || isValidVerse(curFile, vs, "Acts-18.html#vs21")
                || isValidVerse(curFile, vs, "Acts-20.html#vs13")
                || isValidVerse(curFile, vs, "Acts-21.html#vs2")
                || isValidVerse(curFile, vs, "Acts-27.html#vs2", 12, 21)
                || isValidVerse(curFile, vs, "Acts-28.html#vs10", 11);
    } // isWegvaren

    public static boolean isVaren(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("voer") || arg.equals("voeren")) {
            return isVarenVerledenTijd(curFile, vs);
        }
        return !isOpvaren(curFile, vs)
                && !isOvervaren(curFile, vs)
                && !isUitvarenTegen(curFile, vs)
                && !isVaartZetten(curFile, vs)
                && !isWegvaren(curFile, vs);
    }  // isVaren

}
