package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHandelen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afhandelen" -> isAfhandelen(curFile, vs);
            case "handel" -> isHandel(curFile, vs);
            case "handelen" -> isHandelen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfhandelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-20.html#vs18")
                || isValidVerse(curFile, vs, "Rom-09.html#vs28");
    } // isAfhandelen

    public static boolean isHandel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-20.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs9", 15, 23, 27)
                || isValidVerse(curFile, vs, "Ezek-28.html#vs5", 16, 18);
    } // isHandel

    public static boolean isHandelen(final File curFile, final String vs) {
        return !isAfhandelen(curFile, vs)
                && !isHandel(curFile, vs);
    } // isHandelen
}
