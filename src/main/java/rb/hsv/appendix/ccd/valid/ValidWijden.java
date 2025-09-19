package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWijden {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "door de ban wijden" -> isDoorDeBanWijden(curFile, vs, keyArg, arg);
            case "inwijden" -> isInwijden(curFile, vs);
            case "met de ban wijden" -> isMetDeBanWijden(curFile, vs, keyArg, arg);
            case "wijd" -> isWijd(curFile, vs);
            case "wijd en zijd" -> isWijdEnZijd(curFile, vs);
            case "wijden" -> isWijden(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isDoorDeBanWijden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("door de ban wijden", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Lev-27.html#vs28", 29)
                    || isValidVerse(curFile, vs, "Josh-07.html#vs1", 11)
                    || isValidVerse(curFile, vs, "Josh-22.html#vs20")
                    || isValidVerse(curFile, vs, "1Chr-02.html#vs7");
        }

        return false;
    } // isDoorDeBanWijden

    public static boolean isInwijden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-08.html#vs63")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs5");
    } // isInwijden

    public static boolean isMetDeBanWijden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual(keyArg, arg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Josh-06.html#vs17", 18)
                || isValidVerse(curFile, vs, "Josh-07.html#vs11");
    } // isMetDeBanWijden

    public static boolean isWijd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs32")
                || isValidVerse(curFile, vs, "Deut-15.html#vs8", 11)
                || isValidVerse(curFile, vs, "1Sam-02.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs15")
                || isValidVerse(curFile, vs, "Neh-07.html#vs4")
                || isValidVerse(curFile, vs, "Job-30.html#vs14")
                || isValidVerse(curFile, vs, "Ps-025.html#vs17")
                || isValidVerse(curFile, vs, "Ps-035.html#vs21")
                || isValidVerse(curFile, vs, "Ps-037.html#vs35")
                || isValidVerse(curFile, vs, "Ps-081.html#vs11")
                || isValidVerse(curFile, vs, "Ps-104.html#vs25")
                || isValidVerse(curFile, vs, "Isa-05.html#vs14")
                || isValidVerse(curFile, vs, "Isa-22.html#vs18")
                || isValidVerse(curFile, vs, "Isa-30.html#vs23", 33)
                || isValidVerse(curFile, vs, "Isa-33.html#vs17")
                || isValidVerse(curFile, vs, "Isa-54.html#vs2")
                || isValidVerse(curFile, vs, "Isa-57.html#vs4", 8)
                || isValidVerse(curFile, vs, "Ezek-23.html#vs32")
                || isValidVerse(curFile, vs, "Nah-3.html#vs13")
                || isValidVerse(curFile, vs, "Hab-2.html#vs5")
                || isValidVerse(curFile, vs, "Matt-07.html#vs13")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs11", 13);
    } // isWijd

    public static boolean isWijdEnZijd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-26.html#vs15");
    } // isWijdEnZijd

    private static boolean isWijden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isMetDeBanWijden(curFile, vs, keyArg, arg)
                && !isDoorDeBanWijden(curFile, vs, keyArg, arg)
                && !isInwijden(curFile, vs)
                && !isWijd(curFile, vs)
                && !isWijdEnZijd(curFile, vs);
    }  // isWijden

}
