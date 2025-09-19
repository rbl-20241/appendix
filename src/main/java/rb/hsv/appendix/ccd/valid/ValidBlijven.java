package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBlijven {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "achterblijven" -> isAchterblijven(curFile, vs);
            case "afblijven" -> isAfblijven(curFile, vs);
            case "in leven blijven" -> isInLevenBlijven(curFile, vs, keyArg, arg);
            case "overblijven" -> isOverblijven(curFile, vs);
            case "staande blijven" -> isStaandeBlijven(curFile, vs);
            case "uitblijven" -> isUitblijven(curFile, vs);
            case "wegblijven" -> isWegblijven(curFile, vs);
            case "blijven" -> isBlijven(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAchterblijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-32.html#vs24")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs3", 5)
                || isValidVerse(curFile, vs, "1Sam-30.html#vs9", 10)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs21")
                || isValidVerse(curFile, vs, "Isa-14.html#vs31")
                || isValidVerse(curFile, vs, "Dan-10.html#vs8")
                || isValidVerse(curFile, vs, "Luke-02.html#vs43")
                || isValidVerse(curFile, vs, "Acts-17.html#vs14")
                || isValidVerse(curFile, vs, "Heb-04.html#vs1");
    } // isAchterblijven

    public static boolean isAfblijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-18.html#vs17");
    } // isAfblijven

    public static boolean isInLevenBlijven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-19.html#vs20")
                || isValidVerse(curFile, vs, "Gen-20.html#vs7")
                || isValidVerse(curFile, vs, "Gen-31.html#vs32")
                || isValidVerse(curFile, vs, "Gen-42.html#vs2", 18)
                || isValidVerse(curFile, vs, "Gen-43.html#vs8")
                || isValidVerse(curFile, vs, "Gen-47.html#vs19")
                || isValidVerse(curFile, vs, "Exod-33.html#vs20")
                || isValidVerse(curFile, vs, "Lev-25.html#vs35", 36)
                || isValidVerse(curFile, vs, "Num-04.html#vs19")
                || isValidVerse(curFile, vs, "Num-14.html#vs38")
                || isValidVerse(curFile, vs, "Num-21.html#vs8", 9)
                || isValidVerse(curFile, vs, "Deut-04.html#vs42")
                || isValidVerse(curFile, vs, "Deut-05.html#vs24", 26)
                || isValidVerse(curFile, vs, "Deut-19.html#vs4", 5)
                || isValidVerse(curFile, vs, "Josh-06.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs22")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs19")
                || isValidVerse(curFile, vs, "Neh-05.html#vs2")
                || isValidVerse(curFile, vs, "Neh-06.html#vs11")
                || isValidVerse(curFile, vs, "Esth-04.html#vs11")
                || isValidVerse(curFile, vs, "Jer-21.html#vs9")
                || isValidVerse(curFile, vs, "Jer-38.html#vs2", 17)
                || isValidVerse(curFile, vs, "Ezek-03.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs9", 13, 17, 19, 21, 24, 28)
                || isValidVerse(curFile, vs, "Ezek-33.html#vs12", 13, 15, 16, 19);
    } // isInLevenBlijven

    public static boolean isOverblijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs23")
                || isValidVerse(curFile, vs, "Exod-08.html#vs31")
                || isValidVerse(curFile, vs, "Exod-10.html#vs19")
                || isValidVerse(curFile, vs, "Exod-14.html#vs28")
                || isValidVerse(curFile, vs, "Exod-36.html#vs7")
                || isValidVerse(curFile, vs, "Num-09.html#vs8")
                || isValidVerse(curFile, vs, "Josh-11.html#vs11", 22)
                || isValidVerse(curFile, vs, "Josh-18.html#vs2")
                || isValidVerse(curFile, vs, "Judg-04.html#vs16")
                || isValidVerse(curFile, vs, "Judg-09.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs20")
                || isValidVerse(curFile, vs, "Job-19.html#vs20")
                || isValidVerse(curFile, vs, "Job-20.html#vs21")
                || isValidVerse(curFile, vs, "Job-21.html#vs34")
                || isValidVerse(curFile, vs, "Ps-106.html#vs11")
                || isValidVerse(curFile, vs, "Isa-10.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-07.html#vs11")
                || isValidVerse(curFile, vs, "Dan-10.html#vs8")
                || isValidVerse(curFile, vs, "Heb-04.html#vs9")
                || isValidVerse(curFile, vs, "Heb-10.html#vs26");
    } // isOverblijven

    public static boolean isStaandeBlijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-18.html#vs23")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs15")
                || isValidVerse(curFile, vs, "Job-08.html#vs15")
                || isValidVerse(curFile, vs, "Job-41.html#vs1")
                || isValidVerse(curFile, vs, "Ps-001.html#vs5")
                || isValidVerse(curFile, vs, "Ps-005.html#vs6")
                || isValidVerse(curFile, vs, "Ps-020.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs5")
                || isValidVerse(curFile, vs, "Amos-2.html#vs15")
                || isValidVerse(curFile, vs, "Amos-7.html#vs2", 5)
                || isValidVerse(curFile, vs, "Phil-4.html#vs1")
                || isValidVerse(curFile, vs, "1Thess-3.html#vs8")
                || isValidVerse(curFile, vs, "Rev-06.html#vs17");
    } // isStaandeBlijven

    public static boolean isUitblijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-05.html#vs28");
    } // isUitblijven

    public static boolean isWegblijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-20.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs6")
                || isValidVerse(curFile, vs, "Job-19.html#vs14")
                || isValidVerse(curFile, vs, "Ps-022.html#vs20")
                || isValidVerse(curFile, vs, "Matt-24.html#vs48")
                || isValidVerse(curFile, vs, "Luke-12.html#vs45");
    } // isWegblijven

    public static boolean isBlijven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAchterblijven(curFile, vs)
                && !isAfblijven(curFile, vs)
                && !isInLevenBlijven(curFile, vs, keyArg, arg)
                && !isOverblijven(curFile, vs)
                && !isStaandeBlijven(curFile, vs)
                && !isUitblijven(curFile, vs)
                && !isWegblijven(curFile, vs);
    }  // isVoeren

}
