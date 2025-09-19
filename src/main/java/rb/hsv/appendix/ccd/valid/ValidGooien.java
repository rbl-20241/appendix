package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGooien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "weggooien" -> isWeggooien(curFile, vs);
            case "gooien" -> isGooien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isWeggooien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-13.html#vs48")
                || isValidVerse(curFile, vs, "Luke-14.html#vs35");
    } // isWeggooien

    public static boolean isGooien(final File curFile, final String vs) {
        return !isWeggooien(curFile, vs);
    } // isGooien
}
