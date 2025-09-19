package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVerplichten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "verplicht" -> isVerplicht(curFile, vs);
            case "verplichten" -> isVerplichten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isVerplicht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-04.html#vs3", 30, 35, 39, 43)
                || isValidVerse(curFile, vs, "Num-08.html#vs24")
                || isValidVerse(curFile, vs, "Neh-06.html#vs18")
                || isValidVerse(curFile, vs, "Lam-1.html#vs1")
                || isValidVerse(curFile, vs, "Luke-23.html#vs17")
                || isValidVerse(curFile, vs, "Rom-08.html#vs12")
                || isValidVerse(curFile, vs, "Rom-15.html#vs1",27)
                || isValidVerse(curFile, vs, "Gal-5.html#vs3");
    } // isVerplicht

    public static boolean isVerplichten(final File curFile, final String vs) {
        return !isVerplicht(curFile, vs);
    }  // isVerplichten

}
