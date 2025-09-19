package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKussen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "kus" -> isKus(curFile, vs);
            case "kussen (zelfstandig naamwoord)" -> isKussen_ZelfstandingNaamwoord(curFile, vs);
            case "kust" -> isKust(curFile, vs);
            case "kussen (werkwoord)" -> isKussen_Werkwoord(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isKus(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-27.html#vs6")
                || isValidVerse(curFile, vs, "Song-1.html#vs2")
                || isValidVerse(curFile, vs, "Luke-07.html#vs45")
                || isValidVerse(curFile, vs, "Luke-22.html#vs48")
                || isValidVerse(curFile, vs, "Rom-16.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-16.html#vs20")
                || isValidVerse(curFile, vs, "2Cor-13.html#vs12")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs26")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs14");
    } // isKus

    public static boolean isKussen_ZelfstandingNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Amos-3.html#vs12");
    } // isKussen_ZelfstandingNaamwoord

    public static boolean isKust(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs13")
                || isValidVerse(curFile, vs, "Num-24.html#vs24")
                || isValidVerse(curFile, vs, "Josh-09.html#vs1")
                || isValidVerse(curFile, vs, "Judg-05.html#vs17");
    } // isKust

    public static boolean isKussen_Werkwoord(final File curFile, final String vs, final String arg) {
        return (isValidVerse(curFile, vs, "Luke-07.html#vs45") && arg.equals("kussen"))
                || (!isKus(curFile, vs)
                && !isKussen_ZelfstandingNaamwoord(curFile, vs)
                && !isKust(curFile, vs));
    } // isKussen_Werkwoord
}
