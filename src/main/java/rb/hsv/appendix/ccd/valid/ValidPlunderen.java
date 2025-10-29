package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPlunderen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitplunderen" -> isUitplunderen(curFile, vs);
            case "plunderen" -> isPlunderen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitplunderen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-044.html#vs11");
    } // isUitplunderen

    public static boolean isPlunderen(final File curFile, final String vs) {
        return !isUitplunderen(curFile, vs);
    } // isPlunderen
}
