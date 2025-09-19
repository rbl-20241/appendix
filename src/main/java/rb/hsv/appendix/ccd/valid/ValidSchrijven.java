package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidDoden.isTenDodeOpschrijven;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSchrijven {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "geschreven (bijvoeglijk naamwoord)" -> isGeschreven(curFile, vs);
            case "inschrijven" -> isInschrijven(curFile, vs);
            case "opschrijven" -> isOpschrijven(curFile, vs, arg);
            case "schrijven (zelfstandig naamwoord)" -> isSchrijven_ZelfstandigNaamwoord(curFile, vs);
            case "toeschrijven" -> isToeschrijven(curFile, vs);
            case "voorschrijven" -> isVoorschrijven(curFile, vs);
            case "schrijven (werkwoord)" -> isSchrijven_Werkwoord(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isGeschreven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-21.html#vs25");
    } // isGeschreven

    public static boolean isInschrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-07.html#vs5")
                || isValidVerse(curFile, vs, "Jer-22.html#vs30");
    } // isInschrijven

    public static boolean isOpschrijven(final File curFile, final String vs, final String arg) {
        if (isTenDodeOpschrijven(curFile, vs, arg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-24.html#vs4")
                || isValidVerse(curFile, vs, "Exod-34.html#vs27")
                || isValidVerse(curFile, vs, "Num-33.html#vs2")
                || isValidVerse(curFile, vs, "Deut-31.html#vs9", 19)
                || isValidVerse(curFile, vs, "Judg-08.html#vs14")
                || isValidVerse(curFile, vs, "1Chr-24.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs11")
                || isValidVerse(curFile, vs, "Dan-07.html#vs1")
                || isValidVerse(curFile, vs, "Hab-2.html#vs2")
                || isValidVerse(curFile, vs, "Rev-01.html#vs19")
                || isValidVerse(curFile, vs, "Rev-10.html#vs4");
    } // isOpschrijven

    public static boolean isSchrijven_ZelfstandigNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-21.html#vs12")
                || isValidVerse(curFile, vs, "Esth-08.html#vs5");
    } // isSchrijven_ZelfstandigNaamwoord

    public static boolean isToeschrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-01.html#vs22");
    } // isToeschrijven

    public static boolean isVoorschrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Cor-07.html#vs17");
    } // isVoorschrijven

    public static boolean isSchrijven_Werkwoord(final File curFile, final String vs, final String arg) {
        return !isGeschreven(curFile, vs)
                && !isInschrijven(curFile, vs)
                && !isOpschrijven(curFile, vs, arg)
                && !isSchrijven_ZelfstandigNaamwoord(curFile, vs)
                && !isTenDodeOpschrijven(curFile, vs, arg)
                && !isToeschrijven(curFile, vs)
                && !isVoorschrijven(curFile, vs);
    } // isSchrijven


}
