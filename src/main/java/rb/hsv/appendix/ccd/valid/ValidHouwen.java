package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHouwen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "in stukken houwen" -> isInStukkenHouwen(curFile, vs, keyArg, arg);
            case "uithouwen" -> isUithouwen(curFile, vs);
            case "houwen" -> isHouwen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isInStukkenHouwen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in stukken houwen", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Dan-02.html#vs5")
                    || isValidVerse(curFile, vs, "Dan-03.html#vs29")
                    || isValidVerse(curFile, vs, "Matt-24.html#vs51")
                    || isValidVerse(curFile, vs, "Luke-12.html#vs46");
        }
        return false;
    } // isInStukkenHouwen

    public static boolean isUithouwen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-34.html#vs1", 4)
                || isValidVerse(curFile, vs, "Deut-10.html#vs1", 3)
                || isValidVerse(curFile, vs, "Isa-22.html#vs16");
    } // isUithouwen

    public static boolean isHouwen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isInStukkenHouwen(curFile, vs, keyArg, arg)
                && !isUithouwen(curFile, vs);
    } // isHouwen
}
