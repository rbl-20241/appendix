package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKiezen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitkiezen" -> isUitkiezen(curFile, vs);
            case "kiezen" -> isKiezen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitkiezen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-12.html#vs21")
                || isValidVerse(curFile, vs, "Exod-17.html#vs9")
                || isValidVerse(curFile, vs, "Josh-08.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs10")
                || isValidVerse(curFile, vs, "Ps-047.html#vs5")
                || isValidVerse(curFile, vs, "Luke-06.html#vs13");
    } // isUitkiezen

    public static boolean isKiezen(final File curFile, final String vs) {
        return !isUitkiezen(curFile, vs);
    } // isKiezen


}
