package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLikken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "oplikken" -> isOplikken(curFile, vs);
            case "likken" -> isLikken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOplikken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-07.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs38")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs38");
    } // isOplikken

    public static boolean isLikken(final File curFile, final String vs) {
        return !isOplikken(curFile, vs);
    } // isLikken

}
