package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStoten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "neerstoten" -> isNeerstoten(curFile, vs);
            case "uitstoten" -> isUitstoten(curFile, vs);
            case "wegstoten" -> isWegstoten(curFile, vs);
            case "stoten" -> isStoten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isNeerstoten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-044.html#vs6");
    } // isNeerstoten

    public static boolean isUitstoten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "3John-1.html#vs10");
    } // isUitstoten

    public static boolean isWegstoten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-30.html#vs12")
                || isValidVerse(curFile, vs, "Ps-140.html#vs5")
                || isValidVerse(curFile, vs, "Prov-10.html#vs3");
    } // isWegstoten

    public static boolean isStoten(final File curFile, final String vs) {
        return !isNeerstoten(curFile, vs)
                && !isUitstoten(curFile, vs)
                && !isWegstoten(curFile, vs);
    } // isStoten


}
