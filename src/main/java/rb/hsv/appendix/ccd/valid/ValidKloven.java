package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKloven {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "kloof" -> isKloof(curFile, vs);
            case "kloven" -> isKloven(curFile, vs);
            default -> true;
        };
    }

    public static boolean isKloof(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-33.html#vs22")
                || isValidVerse(curFile, vs, "Judg-15.html#vs8", 11)
                || isValidVerse(curFile, vs, "Song-2.html#vs14")
                || isValidVerse(curFile, vs, "Isa-02.html#vs21")
                || isValidVerse(curFile, vs, "Isa-07.html#vs19")
                || isValidVerse(curFile, vs, "Isa-57.html#vs5")
                || isValidVerse(curFile, vs, "Jer-13.html#vs4")
                || isValidVerse(curFile, vs, "Jer-16.html#vs16")
                || isValidVerse(curFile, vs, "Luke-16.html#vs26");
    } // isKloof

    public static boolean isKloven(final File curFile, final String vs) {
        return !isKloof(curFile, vs);
    } // isKloven

}
