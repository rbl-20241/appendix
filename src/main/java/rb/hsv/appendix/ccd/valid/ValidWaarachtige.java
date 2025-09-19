package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWaarachtige {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        if (keyArg.equals("waarachtig")) {
            return isWaarachtig(curFile, vs, arg);
        }
        if (arg.equals("Waarachtige")) {
            return isWaarachtige_Hoofdletter(curFile, vs);
        }
        if (arg.equals("waarachtige")) {
            return isWaarachtige(curFile, vs);
        }
        return true;
    }

    public static boolean isWaarachtig(final File curFile, final String vs, final String arg) {
        if (isEqual("waarachtig", arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "Prov-12.html#vs19")
                || isValidVerse(curFile, vs, "John-01.html#vs9")
                || isValidVerse(curFile, vs, "John-17.html#vs3")
                || isValidVerse(curFile, vs, "1Thess-1.html#vs9")
                || isValidVerse(curFile, vs, "1John-5.html#vs20")
                || isValidVerse(curFile, vs, "Rev-03.html#vs14")
                || isValidVerse(curFile, vs, "Rev-06.html#vs10")
                || isValidVerse(curFile, vs, "Rev-19.html#vs9")
                || isValidVerse(curFile, vs, "Didache-13.html#vs1");
    } // isWaarachtig

    public static boolean isWaarachtige_Hoofdletter(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1John-5.html#vs20")
                || isValidVerse(curFile, vs, "Rev-03.html#vs7");
    } // isWaarachtige_Hoofdletter

    public static boolean isWaarachtige(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-06.html#vs8");
    } // isWaarachtige
}
