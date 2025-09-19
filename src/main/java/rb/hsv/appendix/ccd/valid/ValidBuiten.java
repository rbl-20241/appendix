package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidStaan.isBuitenstaan;
import static rb.hsv.appendix.ccd.valid.ValidWerpen.isBuitenwerpen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBuiten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "buit" -> isBuit(curFile, vs);
            case "buiten zinnen" -> isBuitenZinnen(curFile, vs);
            case "uitbuiten" -> isUitbuiten(curFile, vs);
            case "buiten" -> isBuiten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBuit(final File curFile, final String vs) {
        return !isValidVerse(curFile, vs, "Jer-22.html#vs3")
                && !isValidVerse(curFile, vs, "Eph-5.html#vs16")
                && !isValidVerse(curFile, vs, "Col-4.html#vs5");
    } // isBuit

    public static boolean isBuitenZinnen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-10.html#vs20")
                || isValidVerse(curFile, vs, "Acts-12.html#vs15")
                || isValidVerse(curFile, vs, "Acts-26.html#vs24", 25)
                || isValidVerse(curFile, vs, "1Cor-14.html#vs23");
    } // isBuitenZinnen

    public static boolean isUitbuiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-22.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs7", 16)
                || isValidVerse(curFile, vs, "Ezek-22.html#vs29")
                || isValidVerse(curFile, vs, "Eph-5.html#vs16")
                || isValidVerse(curFile, vs, "Col-4.html#vs5");
    } // isUitbuiten

    private static boolean isBuiten(final File curFile, final String vs) {
        return (!isBuitenZinnen(curFile, vs)
                && !isBuitenstaan(curFile, vs)
                && !isBuitenwerpen(curFile, vs)
                && !isUitbuiten(curFile, vs))
                || isValidVerse(curFile, vs, "Col-4.html#vs5");
    }  // isBuiten

}
