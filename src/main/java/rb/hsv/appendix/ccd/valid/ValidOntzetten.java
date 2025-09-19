package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidOntzetten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "ontzet" -> isOntzet(curFile, vs);
            case "ontzetten" -> isOntzetten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOntzet(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezra-09.html#vs3", 4)
                || isValidVerse(curFile, vs, "Job-17.html#vs8")
                || isValidVerse(curFile, vs, "Job-18.html#vs20")
                || isValidVerse(curFile, vs, "Job-21.html#vs5")
                || isValidVerse(curFile, vs, "Ps-004.html#vs5")
                || isValidVerse(curFile, vs, "Ps-143.html#vs4")
                || isValidVerse(curFile, vs, "Jer-04.html#vs9")
                || isValidVerse(curFile, vs, "Lam-1.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-04.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs35")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs19");
    } // isOntzet

    public static boolean isOntzetten(final File curFile, final String vs) {
        return !isOntzet(curFile, vs);
    } // isOntzetten
}
