package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVangen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "gevangen" -> isGevangen(curFile, vs, keyArg);
            case "opvangen" -> isOpvangen(curFile, vs);
            case "vangen" -> isVangen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isGevangen(final File curFile, final String vs, final String keyArg) {
        return ValidGevangen.isValid(keyArg, curFile, vs);
    } // isGevangen

    public static boolean isOpvangen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-33.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs22")
                || isValidVerse(curFile, vs, "Isa-22.html#vs9")
                || isValidVerse(curFile, vs, "Luke-11.html#vs54");
    } // isOpvangen

    public static boolean isVangen(final File curFile, final String vs) {
        return !isOpvangen(curFile, vs);
    }  // isVangen

}
