package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidOntvangen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "onderwijs ontvangen" -> isOnderwijsOntvangen(curFile, vs);
            case "ontvangen" -> isOntvangen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOnderwijsOntvangen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-50.html#vs4");
    } // isInwijden

    private static boolean isOntvangen(final File curFile, final String vs) {
        return !isOnderwijsOntvangen(curFile, vs);
    }  // isOntvangen

}
