package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWerken {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwerken" -> isAfwerken();
            case "goed werk" -> isGoedWerk(curFile, vs);
            case "samenwerken" -> isSamenwerken();
            case "te werk gaan" -> isTeWerkGaan(curFile, vs, keyArg, arg);
            case "werk" -> isWerk(curFile, vs, keyArg, arg);
            case "werken van de wet" -> isWerkenVanDeWet(curFile, vs);
            case "werken" -> isWerken_Werkwoord(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAfwerken() {
        return false;
    } // isAfwerken

    public static boolean isGoedWerk(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-05.html#vs16")
                || isValidVerse(curFile, vs, "Matt-26.html#vs10")
                || isValidVerse(curFile, vs, "Mark-14.html#vs6")
                || isValidVerse(curFile, vs, "John-10.html#vs32", 33)
                || isValidVerse(curFile, vs, "Acts-09.html#vs36")
                || isValidVerse(curFile, vs, "Rom-13.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs8")
                || isValidVerse(curFile, vs, "Eph-2.html#vs10")
                || isValidVerse(curFile, vs, "Eph-4.html#vs28")
                || isValidVerse(curFile, vs, "Phil-1.html#vs6")
                || isValidVerse(curFile, vs, "Col-1.html#vs10")
                || isValidVerse(curFile, vs, "1Tim-2.html#vs10")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs10", 25)
                || isValidVerse(curFile, vs, "1Tim-6.html#vs18")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs21")
                || isValidVerse(curFile, vs, "2Tim-3.html#vs17")
                || isValidVerse(curFile, vs, "Titus-1.html#vs16")
                || isValidVerse(curFile, vs, "Titus-2.html#vs7", 14)
                || isValidVerse(curFile, vs, "Titus-3.html#vs1", 8, 14)
                || isValidVerse(curFile, vs, "Heb-10.html#vs24")
                || isValidVerse(curFile, vs, "Heb-13.html#vs21")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs12");
    } // isGoedWerk

    public static boolean isSamenwerken() {
        return false;
    } // isSamenwerken

    public static boolean isTeWerkGaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("te werk gaan", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Josh-09.html#vs4")
                    || isValidVerse(curFile, vs, "1Sam-23.html#vs22")
                    || isValidVerse(curFile, vs, "Prov-21.html#vs24")
                    || isValidVerse(curFile, vs, "2Cor-03.html#vs12")
                    || isValidVerse(curFile, vs, "Jude-1.html#vs22");
        }

        return false;
    } // isTeWerkGaan

    public static boolean isWerkenVanDeWet(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-03.html#vs20", 28)
                || isValidVerse(curFile, vs, "Rom-09.html#vs32")
                || isValidVerse(curFile, vs, "Gal-2.html#vs16")
                || isValidVerse(curFile, vs, "Gal-3.html#vs2", 5, 10);
    } // isWerkenVanDeWet

    public static boolean isWerken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-29.html#vs15", 18)
                || isValidVerse(curFile, vs, "Gen-30.html#vs30")
                || isValidVerse(curFile, vs, "Exod-01.html#vs13")
                || isValidVerse(curFile, vs, "Exod-06.html#vs4")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs8", 22)
                || isValidVerse(curFile, vs, "1Sam-14.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-08.html#vs8")
                || isValidVerse(curFile, vs, "Neh-04.html#vs6")
                || isValidVerse(curFile, vs, "Neh-10.html#vs37")
                || isValidVerse(curFile, vs, "Prov-21.html#vs25")
                || isValidVerse(curFile, vs, "Isa-43.html#vs13")
                || isValidVerse(curFile, vs, "Jer-22.html#vs13")
                || isValidVerse(curFile, vs, "Hag-2.html#vs5")
                || isValidVerse(curFile, vs, "Matt-06.html#vs28")
                || isValidVerse(curFile, vs, "Matt-21.html#vs28")
                || isValidVerse(curFile, vs, "Luke-12.html#vs27")
                || isValidVerse(curFile, vs, "Luke-13.html#vs14")
                || isValidVerse(curFile, vs, "John-05.html#vs17")
                || isValidVerse(curFile, vs, "John-06.html#vs27")
                || isValidVerse(curFile, vs, "John-09.html#vs3")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs12")
                || isValidVerse(curFile, vs, "1Cor-09.html#vs6")
                || isValidVerse(curFile, vs, "Phil-2.html#vs12")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs11")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs10", 11)
                || isValidVerse(curFile, vs, "Heb-13.html#vs21")
                || isValidVerse(curFile, vs, "Didache-12.html#vs3");
    } // isWerken

    public static boolean isWerken_Werkwoord(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("werken", keyArg)) {
            if (isEqual("werk", arg) || isEqual("werken", arg)) {
                return isWerken(curFile, vs);
            } else {
                return true;
            }
        }

        return false;
    }

    public static boolean isWerk(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAfwerken()
                || isWerken(curFile, vs)
                || isGoedWerk(curFile, vs)
                || isTeWerkGaan(curFile, vs, keyArg, arg)
                || isWerkenVanDeWet(curFile, vs)
                || isValidVerse(curFile, vs, "John-09.html#vs3");
    } // isWerk

}
