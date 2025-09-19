package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKlein {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "kleine (zelfstandig naamwoord)" -> isKleine(curFile, vs);
            case "klein" -> isKlein(curFile, vs);
            default -> true;
        };
    }

    public static boolean isKleine(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs17")
                || isValidVerse(curFile, vs, "Deut-25.html#vs13", 14)
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs31")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs30")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs18")
                || isValidVerse(curFile, vs, "Job-03.html#vs19")
                || isValidVerse(curFile, vs, "Ps-068.html#vs28")
                || isValidVerse(curFile, vs, "Ps-115.html#vs13")
                || isValidVerse(curFile, vs, "Jer-16.html#vs6")
                || isValidVerse(curFile, vs, "Zech-13.html#vs7")
                || isValidVerse(curFile, vs, "Matt-10.html#vs42")
                || isValidVerse(curFile, vs, "Matt-18.html#vs6", 10, 14)
                || isValidVerse(curFile, vs, "Mark-09.html#vs42")
                || isValidVerse(curFile, vs, "Mark-15.html#vs40")
                || isValidVerse(curFile, vs, "Luke-17.html#vs2")
                || isValidVerse(curFile, vs, "Luke-18.html#vs16")
                || isValidVerse(curFile, vs, "Rev-11.html#vs18")
                || isValidVerse(curFile, vs, "Rev-13.html#vs16")
                || isValidVerse(curFile, vs, "Rev-19.html#vs5", 18);
    } // isKleine

    public static boolean isKlein(final File curFile, final String vs) {
        return !isKleine(curFile, vs)
                || isValidVerse(curFile, vs, "Luke-18.html#vs16");
    } // isKlein
}
