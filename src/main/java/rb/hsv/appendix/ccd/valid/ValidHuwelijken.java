package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHuwelijken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uithuwelijken" -> isUithuwlijken(curFile, vs);
            case "huwelijk" -> isHuwelijk(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUithuwlijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-12.html#vs9");
    } // isUithuwlijken

    public static boolean isHuwelijk(final File curFile, final String vs) {
        return !isUithuwlijken(curFile, vs);
    } // isHuwelijk
}
