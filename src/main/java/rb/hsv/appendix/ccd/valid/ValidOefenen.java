package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidRichten.isGerichtOefenen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidOefenen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitoefenen" -> isUitoefenen(curFile, vs);
            case "wraak oefenen" -> isWraakOefenen(curFile, vs);
            case "oefenen" -> isOefenen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitoefenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-13.html#vs12");
    } // isUitoefenen

    public static boolean isWraakOefenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-099.html#vs8")
                || isValidVerse(curFile, vs, "Ps-149.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-25.html#vs17")
                || isValidVerse(curFile, vs, "2Thess-1.html#vs8");
    } // isWraakOefenen

    public static boolean isOefenen(final File curFile, final String vs) {
        return !isGerichtOefenen(curFile, vs)
                && !isUitoefenen(curFile, vs)
                && !isWraakOefenen(curFile, vs);
    } // isOefenen


}
