package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRijzen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "oprijzen" -> isOprijzen(curFile, vs);
            case "te berge rijzen" -> isTeBergeRijzen(curFile, vs, keyArg, arg);
            case "rijzen" -> isRijzen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isOprijzen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-104.html#vs8")
                || isValidVerse(curFile, vs, "Ps-107.html#vs26")
                || isValidVerse(curFile, vs, "Dan-07.html#vs8")
                || isValidVerse(curFile, vs, "Nah-1.html#vs5");
    } // isOprijzen

    public static boolean isTeBergeRijzen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("te berge rijzen", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Job-04.html#vs15")
                    || isValidVerse(curFile, vs, "Ps-119.html#vs120")
                    || isValidVerse(curFile, vs, "Ezek-27.html#vs35")
                    || isValidVerse(curFile, vs, "Ezek-32.html#vs10");
        }
        return false;
    } // isTeBergeRijzen

    private static boolean isRijzen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isOprijzen(curFile, vs)
                && !isTeBergeRijzen(curFile, vs, keyArg, arg);
    }  // isRijzen

}
