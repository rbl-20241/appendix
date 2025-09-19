package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWikkelen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "in strijd gewikkeld" -> isInStrijdGewikkeld(curFile, vs, keyArg, arg);
            case "inwikkelen" -> isInwikkelen(curFile, vs);
            case "omwikkelen" -> isOmwikkelen(curFile, vs);
            case "wikkelen" -> isWikkelen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isInStrijdGewikkeld(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in strijd gewikkeld", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "1Sam-17.html#vs19")
                    || isValidVerse(curFile, vs, "1Sam-31.html#vs1")
                    || isValidVerse(curFile, vs, "2Kgs-19.html#vs8")
                    || isValidVerse(curFile, vs, "Isa-37.html#vs8");
        }
        return false;
    } // isInStrijdGewikkeld

    public static boolean isInwikkelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-21.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs4")
                || isValidVerse(curFile, vs, "Matt-27.html#vs59")
                || isValidVerse(curFile, vs, "Mark-15.html#vs46")
                || isValidVerse(curFile, vs, "Luke-02.html#vs7", 12)
                || isValidVerse(curFile, vs, "Luke-23.html#vs53")
                || isValidVerse(curFile, vs, "John-19.html#vs40");
    } // isInwikkelen

    public static boolean isOmwikkelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-08.html#vs13")
                || isValidVerse(curFile, vs, "Lev-16.html#vs4");
    } // isOmwikkelen

    public static boolean isWikkelen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isOmwikkelen(curFile, vs)
                && !isInStrijdGewikkeld(curFile, vs, keyArg, arg);
    }  // isWikkelen

}
