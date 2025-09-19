package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSlepen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "meeslepen" -> isMeeslepen(curFile, vs);
            case "slijpen" -> isSlijpen(curFile, vs);
            case "wegslepen" -> isWegslepen(curFile, vs);
            case "slepen" -> isSlepen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isMeeslepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-08.html#vs3");
    } // isMeeslepen

    public static boolean isSlijpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-13.html#vs20")
                || isValidVerse(curFile, vs, "Ps-052.html#vs4")
                || isValidVerse(curFile, vs, "Eccl-10.html#vs10")
                || isValidVerse(curFile, vs, "Jer-51.html#vs11");
    } // isSlijpen

    public static boolean isWegslepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-007.html#vs3")
                || isValidVerse(curFile, vs, "Jer-15.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs20")
                || isValidVerse(curFile, vs, "Hos-05.html#vs14");
    } // isWegslepen

    public static boolean isSlepen(final File curFile, final String vs) {
        return !isMeeslepen(curFile, vs)
                && !isSlijpen(curFile, vs)
                && !isWegslepen(curFile, vs);
    } // isSlepen

}
