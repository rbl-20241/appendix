package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidUitDeWeg {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uit de weg gaan" -> isUitDeWegGaan(curFile, vs, keyArg, arg);
            case "uit de weg ruimen" -> isUitDeWegRuimen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isUitDeWegGaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("uit de weg gaan", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Prov-14.html#vs7")
                    || isValidVerse(curFile, vs, "")
                    || isValidVerse(curFile, vs, "")
                    || isValidVerse(curFile, vs, "");
        }
        return false;
    } // isUitDeWegGaan

    public static boolean isUitDeWegRuimen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("uit de weg ruimen", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "2Sam-14.html#vs7", 11, 16)
                    || isValidVerse(curFile, vs, "")
                    || isValidVerse(curFile, vs, "")
                    || isValidVerse(curFile, vs, "");
        }
        return false;
    } // isUitDeWegRuimen
}
