package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidToevallen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "toeval" -> isToeval(curFile, vs);
            case "toevallen" -> isToevallen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isToeval(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-09.html#vs11");
    } // isToeval

    public static boolean isToevallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-17.html#vs5")
                || isValidVerse(curFile, vs, "Josh-21.html#vs5", 6, 7);
    } // isToevallen
}
