package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDagen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "op dagen komen" -> isOpDagenKomen(curFile, vs);
            case "opdagen" -> false;
            case "Oude van dagen" -> isOudeVanDagen(curFile, vs);
            case "uitdagen" -> false;
            case "dagen (werkwoord)" -> isDagen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpDagenKomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs11")
                || isValidVerse(curFile, vs, "Gen-24.html#vs1")
                || isValidVerse(curFile, vs, "Josh-13.html#vs1")
                || isValidVerse(curFile, vs, "Josh-23.html#vs1", 2)
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs1");
    } // isOpDagenKomen

    public static boolean isOudeVanDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-07.html#vs9", 13, 22);
    } // isOudeVanDagen

    public static boolean isDagen (final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-05.html#vs40");
    }

}
