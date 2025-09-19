package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZenden {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afzenden" -> isAfzenden(curFile, vs);
            case "meezenden" -> isMeezenden();
            case "uitzenden" -> isUitzenden(curFile, vs);
            case "wegzenden" -> isWegzenden(curFile, vs);
            case "zonde" -> isZonde(curFile, vs, keyArg, arg);
            case "zenden" -> isZenden(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAfzenden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-078.html#vs49")
                || isValidVerse(curFile, vs, "Jer-08.html#vs17");
    } // isAfzenden

    public static boolean isMeezenden() {
        return IS_NOT_FOUND;
    } //

    public static boolean isUitzenden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-104.html#vs30")
                || isValidVerse(curFile, vs, "Ps-107.html#vs20")
                || isValidVerse(curFile, vs, "Matt-10.html#vs5")
                || isValidVerse(curFile, vs, "Matt-21.html#vs1")
                || isValidVerse(curFile, vs, "Mark-03.html#vs14")
                || isValidVerse(curFile, vs, "Mark-06.html#vs7")
                || isValidVerse(curFile, vs, "Mark-11.html#vs1")
                || isValidVerse(curFile, vs, "Luke-10.html#vs1")
                || isValidVerse(curFile, vs, "Acts-11.html#vs22")
                || isValidVerse(curFile, vs, "Gal-4.html#vs4");
    } // isUitzenden

    public static boolean isWegzenden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-03.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs22")
                || isValidVerse(curFile, vs, "Luke-04.html#vs19");
    } // isWegzenden

    public static boolean isZonde(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("zonde", arg)) {
            return true;
        }
        if (isEqual("zonden", arg)) {
            return !isZonden_Werkwoord(curFile, vs, arg);
        } else {
            return isEqual("zonde", keyArg);
        }
    } // isZonde

    public static boolean isZonden_Werkwoord(final File curFile, final String vs, final @NotNull String arg) {
        if (isEqual("zonden", arg)) {
            return isValidVerse(curFile, vs, "Ezra-04.html#vs11")
                    || isValidVerse(curFile, vs, "Ezra-05.html#vs6", 7);
        }

        return false;
    } // isZonden_Werkwoord

    public static boolean isZenden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAfzenden(curFile, vs)
                && !isMeezenden()
                && !isUitzenden(curFile, vs)
                && !isWegzenden(curFile, vs)
                && !isZonde(curFile, vs, keyArg, arg);
    } // isZenden
}
