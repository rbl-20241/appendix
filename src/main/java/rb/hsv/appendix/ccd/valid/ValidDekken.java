package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDekken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afdekken" -> isAfdekken(curFile, vs);
            case "overdekken" -> isOverdekken();
            case "toedekken" -> isToedekken(curFile, vs);
            case "dekken" -> isDekken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfdekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-26.html#vs13");
    } // isAfdekken

    public static boolean isOverdekken() {
        return IS_NOT_FOUND;
    } // isOverdekken

    public static boolean isToedekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-04.html#vs18", 19)
                || isValidVerse(curFile, vs, "1Sam-19.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs1")
                || isValidVerse(curFile, vs, "Job-13.html#vs4");
    } // isToedekken

    public static boolean isDekken(final File curFile, final String vs) {
        return !isAfdekken(curFile, vs)
                && !isOverdekken()
                && !isToedekken(curFile, vs);
    }  // isDekken

}
