package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStal {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "stelen" -> isStelen(curFile, vs, keyArg, arg);
            case "uitstallen" -> IS_NOT_FOUND;
            case "stal" -> isStal(curFile, vs);
            default -> true;
        };
    }

    public static boolean isStelen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("stelen", keyArg) && !isEqual("stal", arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-31.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs6");
    } // isStelen

    public static boolean isStal(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-09.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs28")
                || isValidVerse(curFile, vs, "Amos-6.html#vs4")
                || isValidVerse(curFile, vs, "Hab-3.html#vs17")
                || isValidVerse(curFile, vs, "Mal-4.html#vs2");
    } // isStal

}
