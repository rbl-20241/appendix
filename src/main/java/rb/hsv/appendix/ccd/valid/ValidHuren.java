package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHuren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "inhuren" -> isInhuren(curFile, vs);
            case "huur" -> isHuur(curFile, vs);
            case "huren" -> isHuren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isInhuren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-09.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs6")
                || isValidVerse(curFile, vs, "Prov-26.html#vs10")
                || isValidVerse(curFile, vs, "Matt-20.html#vs1");
    } // isInhuren

    public static boolean isHuur(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-22.html#vs15");
    }  // isHuur

    public static boolean isHuren(final File curFile, final String vs) {
        return (!isInhuren(curFile, vs)
                && !isHuur(curFile, vs))
                || isValidVerse(curFile, vs, "Exod-22.html#vs15");
    } // isHuren
}
