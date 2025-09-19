package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKosten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "kost" -> isKost(curFile, vs);
            case "kosten" -> isKosten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isKost(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-19.html#vs42")
                || isValidVerse(curFile, vs, "Luke-10.html#vs35")
                || isValidVerse(curFile, vs, "Luke-14.html#vs28")
                || isValidVerse(curFile, vs, "Acts-21.html#vs24")
                || isValidVerse(curFile, vs, "2Cor-12.html#vs15")
                || isValidVerse(curFile, vs, "Didache-12.html#vs3");
    } // isKost

    public static boolean isKosten(final File curFile, final String vs) {
        return !isKost(curFile, vs);
    }  // isKosten

}
