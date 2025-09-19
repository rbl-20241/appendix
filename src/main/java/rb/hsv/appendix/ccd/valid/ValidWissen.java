package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWissen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwissen" -> isAfwissen(curFile, vs);
            case "uitwissen" -> isUitwissen(curFile, vs);
            case "wissen" -> isWissen();
            default -> true;
        };
    }

    public static boolean isAfwissen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-30.html#vs20");
    } // isAfwissen

    public static boolean isUitwissen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-13.html#vs14")
                || isValidVerse(curFile, vs, "Col-2.html#vs14");
    } // isUitwissen

    public static boolean isWissen() {
        return false;
    } // isWissen
}
