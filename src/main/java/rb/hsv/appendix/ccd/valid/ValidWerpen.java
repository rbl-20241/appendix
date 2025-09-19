package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWerpen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwerpen" -> isAfwerpen(curFile, vs);
            case "buitenwerpen" -> isBuitenwerpen(curFile, vs);
            case "lot werpen" -> isLotWerpen(curFile, vs);
            case "neerwerpen" -> isNeerwerpen(curFile, vs);
            case "omverwerpen" -> isOmverwerpen();
            case "opwerpen" -> isOpwerpen(curFile, vs);
            case "toewerpen" -> isToewerpen(curFile, vs);
            case "uitwerpen" -> isUitwerpen(curFile, vs);
            case "wegwerpen" -> isWegwerpen(curFile, vs);
            case "werpen (baren)" -> isWerpen_Baren(curFile, vs);
            case "werpen (gooien)" -> isWerpen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-25.html#vs12")
                || isValidVerse(curFile, vs, "Job-30.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs31")
                || isValidVerse(curFile, vs, "Mark-10.html#vs50")
                || isValidVerse(curFile, vs, "Luke-04.html#vs29");
    } // isAfwerpen

    public static boolean isBuitenwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-14.html#vs40")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs15")
                || isValidVerse(curFile, vs, "Matt-21.html#vs39")
                || isValidVerse(curFile, vs, "Luke-20.html#vs15");
    } // isBuitenwerpen

    public static boolean isLotWerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-16.html#vs8")
                || isValidVerse(curFile, vs, "Josh-18.html#vs6", 8, 10)
                || isValidVerse(curFile, vs, "1Sam-14.html#vs42")
                || isValidVerse(curFile, vs, "1Chr-24.html#vs31")
                || isValidVerse(curFile, vs, "1Chr-25.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-26.html#vs13", 14)
                || isValidVerse(curFile, vs, "Neh-10.html#vs34")
                || isValidVerse(curFile, vs, "Neh-11.html#vs1")
                || isValidVerse(curFile, vs, "Esth-03.html#vs7")
                || isValidVerse(curFile, vs, "Esth-09.html#vs24")
                || isValidVerse(curFile, vs, "Job-06.html#vs27")
                || isValidVerse(curFile, vs, "Ps-022.html#vs19")
                || isValidVerse(curFile, vs, "Prov-01.html#vs14")
                || isValidVerse(curFile, vs, "Isa-34.html#vs17")
                || isValidVerse(curFile, vs, "Joel-3.html#vs3")
                || isValidVerse(curFile, vs, "Obad-1.html#vs11")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs7")
                || isValidVerse(curFile, vs, "Nah-3.html#vs10")
                || isValidVerse(curFile, vs, "Matt-27.html#vs35")
                || isValidVerse(curFile, vs, "Mark-15.html#vs24")
                || isValidVerse(curFile, vs, "Luke-23.html#vs34")
                || isValidVerse(curFile, vs, "John-19.html#vs24")
                || isValidVerse(curFile, vs, "Acts-01.html#vs26");
    } // isLotWerpen

    public static boolean isNeerwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-07.html#vs9", 10, 12)
                || isValidVerse(curFile, vs, "Deut-09.html#vs18", 25)
                || isValidVerse(curFile, vs, "Josh-07.html#vs23")
                || isValidVerse(curFile, vs, "Josh-08.html#vs29")
                || isValidVerse(curFile, vs, "Job-18.html#vs7")
                || isValidVerse(curFile, vs, "Ps-059.html#vs12")
                || isValidVerse(curFile, vs, "Isa-26.html#vs5")
                || isValidVerse(curFile, vs, "Isa-45.html#vs1")
                || isValidVerse(curFile, vs, "Isa-51.html#vs23")
                || isValidVerse(curFile, vs, "Dan-09.html#vs18")
                || isValidVerse(curFile, vs, "Zech-01.html#vs21")
                || isValidVerse(curFile, vs, "Mark-05.html#vs22", 33)
                || isValidVerse(curFile, vs, "Rev-04.html#vs10")
                || isValidVerse(curFile, vs, "Rev-05.html#vs8", 14)
                || isValidVerse(curFile, vs, "Rev-07.html#vs11")
                || isValidVerse(curFile, vs, "Rev-19.html#vs4");
    } // isNeerwerpen

    public static boolean isOmverwerpen() {
        return false;
    } // isOmverwerpen

    public static boolean isOpwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-20.html#vs15")
                || isValidVerse(curFile, vs, "Jer-06.html#vs6")
                || isValidVerse(curFile, vs, "Jer-48.html#vs32")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs22")
                || isValidVerse(curFile, vs, "Acts-20.html#vs10");
    } // isOpwerpen

    public static boolean isToewerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Zech-11.html#vs13");
    } // isToewerpen

    public static boolean isUitwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-11.html#vs1")
                || isValidVerse(curFile, vs, "Matt-17.html#vs27")
                || isValidVerse(curFile, vs, "Matt-22.html#vs13")
                || isValidVerse(curFile, vs, "Mark-09.html#vs47")
                || isValidVerse(curFile, vs, "Luke-05.html#vs4")
                || isValidVerse(curFile, vs, "John-09.html#vs22", 34, 35)
                || isValidVerse(curFile, vs, "John-12.html#vs42")
                || isValidVerse(curFile, vs, "John-16.html#vs2")
                || isValidVerse(curFile, vs, "John-21.html#vs6")
                || isValidVerse(curFile, vs, "Acts-07.html#vs58")
                || isValidVerse(curFile, vs, "Acts-16.html#vs37")
                || isValidVerse(curFile, vs, "Acts-27.html#vs28", 29);
    } // isUitwerpen

    public static boolean isWegwerpen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-09.html#vs17")
                || isValidVerse(curFile, vs, "Ps-050.html#vs17")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs5", 6)
                || isValidVerse(curFile, vs, "Isa-22.html#vs17")
                || isValidVerse(curFile, vs, "Jer-07.html#vs29")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs8")
                || isValidVerse(curFile, vs, "Amos-8.html#vs3")
                || isValidVerse(curFile, vs, "Matt-05.html#vs29", 30)
                || isValidVerse(curFile, vs, "Mark-12.html#vs8")
                || isValidVerse(curFile, vs, "Heb-10.html#vs35");
    } // isWegwerpen

    public static boolean isWerpen_Baren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-30.html#vs39")
                || isValidVerse(curFile, vs, "Gen-31.html#vs8")
                || isValidVerse(curFile, vs, "Job-39.html#vs4", 6)
                || isValidVerse(curFile, vs, "Ps-029.html#vs9")
                || isValidVerse(curFile, vs, "Ps-144.html#vs13")
                || isValidVerse(curFile, vs, "Song-4.html#vs2")
                || isValidVerse(curFile, vs, "Song-6.html#vs6")
                || isValidVerse(curFile, vs, "Jer-14.html#vs5");
    } // isWerpen_Baren

    private static boolean isWerpen(final File curFile, final String vs) {
        return !isAfwerpen(curFile, vs)
                && !isWerpen_Baren(curFile, vs)
                && !isBuitenwerpen(curFile, vs)
                && !isLotWerpen(curFile, vs)
                && !isNeerwerpen(curFile, vs)
                && !isOmverwerpen()
                && !isOpwerpen(curFile, vs)
                && !isToewerpen(curFile, vs)
                && !isUitwerpen(curFile, vs)
                && !isWegwerpen(curFile, vs);
    }  // isWerpen

}
