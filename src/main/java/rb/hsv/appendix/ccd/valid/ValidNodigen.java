package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidNodigen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "nodigen" -> isNodigen(curFile, vs);
            case "uitnodigen" -> isUitnodigen(curFile, vs);
            case "nodig" -> isNodig(curFile, vs);
            default -> true;
        };
    }

    public static boolean isNodigen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-14.html#vs13", 16, 24)
                || isValidVerse(curFile, vs, "Luke-12.html#vs37");
    } // isNodigen

    public static boolean isUitnodigen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs54")
                || isValidVerse(curFile, vs, "Num-25.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs9", 10)
                || isValidVerse(curFile, vs, "Job-01.html#vs4")
                || isValidVerse(curFile, vs, "Matt-22.html#vs9")
                || isValidVerse(curFile, vs, "Matt-22.html#vs9");
    } // isUitnodigen

    public static boolean isNodig(final File curFile, final String vs) {
        return !isNodigen(curFile, vs)
                && !isUitnodigen(curFile, vs);
    } // isNodig



}
