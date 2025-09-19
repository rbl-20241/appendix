package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVoeden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opvoeden" -> isOpvoeden(curFile, vs);
            case "voeden" -> isVoeden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpvoeden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-19.html#vs3")
                || isValidVerse(curFile, vs, "Dan-01.html#vs5")
                || isValidVerse(curFile, vs, "Acts-07.html#vs21")
                || isValidVerse(curFile, vs, "Eph-6.html#vs4")
                || isValidVerse(curFile, vs, "2Tim-3.html#vs16");
    } // isOpvoeden

    public static boolean isVoeden(final File curFile, final String vs) {
        return !isOpvoeden(curFile, vs);
    } // isVoeden


}
