package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVerwijten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "verwijt" -> isVerwijt(curFile, vs);
            case "verwijten" -> isVerwijten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isVerwijt(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-01.html#vs6")
                || isValidVerse(curFile, vs, "Jas-1.html#vs5");
    } // isVerwijt

    public static boolean isVerwijten(final File curFile, final String vs) {
        return !isVerwijt(curFile, vs);
    } // isVerwijten
}
