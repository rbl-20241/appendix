package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBarsten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "losbarsten" -> isLosbarsten(curFile, vs);
            case "openbarsten" -> isOpenbarsten(curFile, vs);
            case "barsten" -> isBarsten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isLosbarsten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-18.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs2")
                || isValidVerse(curFile, vs, "Gal-4.html#vs27");
    } // isLosbarsten

    public static boolean isOpenbarsten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-01.html#vs18");
    } // isOpenbarsten

    public static boolean isBarsten(final File curFile, final String vs) {
        return !isLosbarsten(curFile, vs)
                && !isOpenbarsten(curFile, vs);
    }  // isBarsten

}
