package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSpannen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs, final boolean isSamengesteldWerkwoord) {
        return switch (keyArg) {
            case "aanspannen" -> isAanspannen(curFile, vs);
            case "gespannen" -> isGespannen(curFile, vs);
            case "ingespannen" -> isIngespannen(curFile, vs);
            case "inspannen" -> isInspannen(curFile, vs, keyArg, arg, isSamengesteldWerkwoord);
            case "omspannen" -> IS_NOT_FOUND;
            case "samenspannen" -> isSamenspannen(curFile, vs);
            case "span" -> isSpan(curFile, vs);
            case "uitspannen" -> isUitspannen(curFile, vs);
            case "spannen" -> isSpannen(curFile, vs, keyArg, arg, isSamengesteldWerkwoord);
            default -> true;
        };
    }

    public static boolean isAanspannen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Cor-06.html#vs6");
    } // isAanspannen

    public static boolean isGespannen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs24")
                || isValidVerse(curFile, vs, "Isa-21.html#vs15");
    } // isGespannen

    public static boolean isIngespannen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs23");
    } // isIngespannen

    public static boolean isInspannen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        if (keyArg.equals("inspannen") && !isSamengesteldWerkwoord) {
            if (arg.equals("ingespannen")) {
                return !isIngespannen(curFile, vs);
            }
            return true;
        }

        return isValidVerse(curFile, vs, "Gen-46.html#vs29")
                || isValidVerse(curFile, vs, "Exod-14.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs44")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs21")
                || isValidVerse(curFile, vs, "Jer-46.html#vs4")
                || isValidVerse(curFile, vs, "Dan-06.html#vs15")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs12")
                || isValidVerse(curFile, vs, "Col-1.html#vs29")
                || isValidVerse(curFile, vs, "1Tim-4.html#vs10");
    } // isInspannen

    public static boolean isSamenspannen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-16.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs10",25)
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs21", 25)
                || isValidVerse(curFile, vs, "2Chr-33.html#vs24")
                || isValidVerse(curFile, vs, "Neh-04.html#vs8")
                || isValidVerse(curFile, vs, "Ps-002.html#vs2")
                || isValidVerse(curFile, vs, "Ps-094.html#vs21")
                || isValidVerse(curFile, vs, "Acts-04.html#vs26");
    } // isSamenspannen

    public static boolean isSpan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-19.html#vs3", 10)
                || isValidVerse(curFile, vs, "1Sam-06.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs19", 21)
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs17")
                || isValidVerse(curFile, vs, "Isa-40.html#vs12")
                || isValidVerse(curFile, vs, "Luke-14.html#vs19")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs14");
    } // isSpan

    public static boolean isUitspannen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-09.html#vs8")
                || isValidVerse(curFile, vs, "Ps-104.html#vs2")
                || isValidVerse(curFile, vs, "Isa-33.html#vs23")
                || isValidVerse(curFile, vs, "Isa-44.html#vs13")
                || isValidVerse(curFile, vs, "Jer-51.html#vs15");
    } // isUitspannen

    private static boolean isSpanMaat(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-28.html#vs16")
                || isValidVerse(curFile, vs, "Exod-39.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs13");
    }

    public static boolean isSpannen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        return !isSpanMaat(curFile, vs)
                && !isAanspannen(curFile, vs)
                && !isGespannen(curFile, vs)
                && !isIngespannen(curFile, vs)
                && !isInspannen(curFile, vs, keyArg, arg, isSamengesteldWerkwoord)
                && !isSamenspannen(curFile, vs)
                && !isSpan(curFile, vs)
                && !isUitspannen(curFile, vs);
    } // isSpannen



}
