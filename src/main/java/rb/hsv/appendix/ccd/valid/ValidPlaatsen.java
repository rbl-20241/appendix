package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_TOO_MUCH;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPlaatsen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "plaats" -> isPlaats();
            case "plaatsen" -> isPlaatsen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isPlaats() {
        return IS_TOO_MUCH;
    } // isPlaats

    public static boolean isPlaatsen(final File curFile, final String vs, final String keyArg, final String arg) {
        if (isEqual("plaatsen", keyArg)) {
            if (isEqual("plaats", arg) || isEqual("plaatsen", arg)) {
                return isValidVerse(curFile, vs, "Gen-02.html#vs8")
                        || isValidVerse(curFile, vs, "Gen-06.html#vs16")
                        || isValidVerse(curFile, vs, "Gen-33.html#vs15")
                        || isValidVerse(curFile, vs, "Exod-26.html#vs35")
                        || isValidVerse(curFile, vs, "Exod-27.html#vs5")
                        || isValidVerse(curFile, vs, "Exod-30.html#vs6", 18)
                        || isValidVerse(curFile, vs, "Exod-40.html#vs5", 6, 7)
                        || isValidVerse(curFile, vs, "Lev-14.html#vs11")
                        || isValidVerse(curFile, vs, "Lev-16.html#vs7")
                        || isValidVerse(curFile, vs, "Lev-26.html#vs11")
                        || isValidVerse(curFile, vs, "Lev-27.html#vs8", 11)
                        || isValidVerse(curFile, vs, "Num-03.html#vs6")
                        || isValidVerse(curFile, vs, "Num-05.html#vs16", 18, 30)
                        || isValidVerse(curFile, vs, "Num-08.html#vs13")
                        || isValidVerse(curFile, vs, "Num-27.html#vs19")
                        || isValidVerse(curFile, vs, "Deut-16.html#vs21")
                        || isValidVerse(curFile, vs, "2Sam-11.html#vs15")
                        || isValidVerse(curFile, vs, "1Kgs-06.html#vs19")
                        || isValidVerse(curFile, vs, "1Kgs-07.html#vs16")
                        || isValidVerse(curFile, vs, "2Chr-35.html#vs3")
                        || isValidVerse(curFile, vs, "Job-05.html#vs11")
                        || isValidVerse(curFile, vs, "Job-30.html#vs1")
                        || isValidVerse(curFile, vs, "Isa-41.html#vs19")
                        || isValidVerse(curFile, vs, "Ezek-21.html#vs19")
                        || isValidVerse(curFile, vs, "Ezek-25.html#vs4")
                        || isValidVerse(curFile, vs, "Amos-7.html#vs8")
                        || isValidVerse(curFile, vs, "Eph-5.html#vs27")
                        || isValidVerse(curFile, vs, "Col-1.html#vs22");
            }

            return true;
        }

        return false;
    } // isPlaatsen

}
