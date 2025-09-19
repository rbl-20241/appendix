package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidHebben.isDeelhebben;
import static rb.hsv.appendix.ccd.valid.ValidKrijgen.isDeelKrijgen;
import static rb.hsv.appendix.ccd.valid.ValidNemen.isDeelnemen;
import static rb.hsv.appendix.ccd.valid.ValidVallen.isTenDeelVallen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDelen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "delen" -> isDelen(curFile, vs);
            case "indelen" -> isIndelen(curFile, vs);
            case "meedelen" -> isMeedelen(curFile, vs);
            case "toedelen" -> isToedelen();
            case "uitdelen" -> isUitdelen(curFile, vs);
            case "deel" -> isDeel(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isDelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs10")
                || isValidVerse(curFile, vs, "Exod-15.html#vs9")
                || isValidVerse(curFile, vs, "Exod-21.html#vs35")
                || isValidVerse(curFile, vs, "Lev-09.html#vs13")
                || isValidVerse(curFile, vs, "Josh-22.html#vs8")
                || isValidVerse(curFile, vs, "Judg-19.html#vs29")
                || isValidVerse(curFile, vs, "Judg-20.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs29")
                || isValidVerse(curFile, vs, "Ps-136.html#vs13")
                || isValidVerse(curFile, vs, "Prov-14.html#vs10")
                || isValidVerse(curFile, vs, "Prov-16.html#vs19")
                || isValidVerse(curFile, vs, "Prov-17.html#vs2")
                || isValidVerse(curFile, vs, "Prov-29.html#vs24")
                || isValidVerse(curFile, vs, "Isa-58.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs17")
                || isValidVerse(curFile, vs, "Mic-2.html#vs4")
                || isValidVerse(curFile, vs, "Matt-24.html#vs51")
                || isValidVerse(curFile, vs, "Luke-12.html#vs13", 46)
                || isValidVerse(curFile, vs, "Rom-01.html#vs11")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs15")
                || isValidVerse(curFile, vs, "Gal-6.html#vs6")
                || isValidVerse(curFile, vs, "Eph-4.html#vs28")
                || isValidVerse(curFile, vs, "Phil-4.html#vs14")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs8")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs18")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs6")
                || isValidVerse(curFile, vs, "Heb-10.html#vs33")
                || isValidVerse(curFile, vs, "Didache-04.html#vs8");
    } // isDelen

    public static boolean isIndelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-24.html#vs3", 5);
    } // isIndelen

    public static boolean isMeedelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-36.html#vs18");
    } // isMeedelen

    public static boolean isToedelen() {
        return IS_NOT_FOUND;
    } // isToedelen

    public static boolean isUitdelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs27")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs19")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs14", 18)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs13")
                || isValidVerse(curFile, vs, "Neh-08.html#vs11", 13)
                || isValidVerse(curFile, vs, "Job-17.html#vs5")
                || isValidVerse(curFile, vs, "Ps-068.html#vs13", 19)
                || isValidVerse(curFile, vs, "Ps-112.html#vs9")
                || isValidVerse(curFile, vs, "Mic-2.html#vs4")
                || isValidVerse(curFile, vs, "Luke-18.html#vs22")
                || isValidVerse(curFile, vs, "John-06.html#vs11");
    } // isUitdelen

    public static boolean isDeel(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isDelen(curFile, vs)
                && !isDeelhebben(curFile, vs)
                && !isDeelKrijgen(curFile, vs)
                && !isDeelnemen(curFile, vs)
                && !isIndelen(curFile, vs)
                && !isMeedelen(curFile, vs)
                && !isTenDeelVallen(curFile, vs, keyArg, arg)
                && !isToedelen()
                && !isUitdelen(curFile, vs);
    }  // isDeel

}
