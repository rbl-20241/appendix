package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidEten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opeten" -> isOpeten(curFile, vs);
            case "eten (zelfstandig naamwoord)" -> isEten_ZelfstandigNaamwoord(curFile, vs);
            case "eten (werkwoord)" -> isEten_Werkwoord(curFile, vs);
            default -> true;
        };
    }

    public static boolean isEten_ZelfstandigNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-14.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs7", 10)
                || isValidVerse(curFile, vs, "Ezra-03.html#vs7")
                || isValidVerse(curFile, vs, "Job-24.html#vs5")
                || isValidVerse(curFile, vs, "Job-39.html#vs3")
                || isValidVerse(curFile, vs, "Prov-06.html#vs8")
                || isValidVerse(curFile, vs, "Dan-01.html#vs10")
                || isValidVerse(curFile, vs, "John-21.html#vs5")
                || isValidVerse(curFile, vs, "Acts-10.html#vs10")
                || isValidVerse(curFile, vs, "Acts-27.html#vs21")
                || isValidVerse(curFile, vs, "Didache-13.html#vs1", 2);
    } // isEten_ZelfstandigNaamwoord

    public static boolean isOpeten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs7")
                || isValidVerse(curFile, vs, "Gen-41.html#vs4", 20)
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs28")
                || isValidVerse(curFile, vs, "Job-05.html#vs5")
                || isValidVerse(curFile, vs, "Ps-044.html#vs12")
                || isValidVerse(curFile, vs, "Ps-105.html#vs35")
                || isValidVerse(curFile, vs, "Isa-01.html#vs7")
                || isValidVerse(curFile, vs, "Jer-15.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs3", 6)
                || isValidVerse(curFile, vs, "Ezek-22.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs3")
                || isValidVerse(curFile, vs, "Joel-1.html#vs4")
                || isValidVerse(curFile, vs, "Matt-13.html#vs4")
                || isValidVerse(curFile, vs, "Matt-23.html#vs14")
                || isValidVerse(curFile, vs, "Mark-04.html#vs4")
                || isValidVerse(curFile, vs, "Luke-06.html#vs1")
                || isValidVerse(curFile, vs, "Luke-08.html#vs5")
                || isValidVerse(curFile, vs, "Luke-24.html#vs43")
                || isValidVerse(curFile, vs, "Rev-10.html#vs9", 10);
    } // isOpeten

    public static boolean isEten_Werkwoord(final File curFile, final String vs) {
        return !isEten_ZelfstandigNaamwoord(curFile, vs)
                && !isOpeten(curFile, vs);
    } // isEten_Werkwoord


}
