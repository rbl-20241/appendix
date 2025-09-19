package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPlukken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afplukken" -> isAfplukken(curFile, vs);
            case "leegplukken" -> isLeegplukken(curFile, vs);
            case "uitplukken" -> isUitplukken();
            case "plukken" -> isPlukken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfplukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-17.html#vs4");
    } // isAfplukken

    public static boolean isLeegplukken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-09.html#vs27");
    } // isLeegplukken

    public static boolean isUitplukken() {
        return IS_NOT_FOUND;
    } // isUitplukken

    public static boolean isPlukken(final File curFile, final String vs) {
        return !isAfplukken(curFile, vs)
                && !isLeegplukken(curFile, vs)
                && !isUitplukken();
    } // isPlukken
}
