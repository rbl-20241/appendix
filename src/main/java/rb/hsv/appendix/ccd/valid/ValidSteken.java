package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidLaten.isInDeSteekLaten;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSteken {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {

        return switch (keyArg) {
            case "aansteken" -> isAansteken(curFile, vs);
            case "doodsteek" -> isDoodsteek(curFile, vs);
            case "doodsteken" -> isDoodsteken(curFile, vs);
            case "doorsteken" -> isDoorsteken();
            case "in brand steken" -> isInBrandSteken(curFile, vs, arg);
            case "insteken" -> isInsteken();
            case "neersteken" -> isNeersteken(curFile, vs);
            case "omhoogsteken" -> isOmhoogsteken(curFile, vs);
            case "opsteken" -> isOpsteken(curFile, vs);
            case "oversteken" -> isOversteken(curFile, vs);
            case "staak" -> isStaak(curFile, vs);
            case "staken" -> isStaken(curFile, vs);
            case "uitsteken" -> isUitsteken(curFile, vs);
            case "steken" -> !isAansteken(curFile, vs)
                    && !isDoodsteek(curFile, vs)
                    && !isDoodsteken(curFile, vs)
                    && !isDoorsteken()
                    && !isInBrandSteken(curFile, vs, arg)
                    && !isInDeSteekLaten(curFile, vs, arg)
                    && !isInsteken()
                    && !isNeersteken(curFile, vs)
                    && !isOmhoogsteken(curFile, vs)
                    && !isOpsteken(curFile, vs)
                    && !isOversteken(curFile, vs)
                    && !isStaak(curFile, vs)
                    && !isStaken(curFile, vs)
                    && !isUitsteken(curFile, vs);
            default -> true;
        };
    }

    private static boolean isAansteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-40.html#vs25")
                || isValidVerse(curFile, vs, "Num-08.html#vs3")
                || isValidVerse(curFile, vs, "Judg-15.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs11")
                || isValidVerse(curFile, vs, "Isa-09.html#vs17")
                || isValidVerse(curFile, vs, "Isa-27.html#vs11")
                || isValidVerse(curFile, vs, "Isa-44.html#vs15")
                || isValidVerse(curFile, vs, "Jer-07.html#vs18")
                || isValidVerse(curFile, vs, "Lam-4.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs10")
                || isValidVerse(curFile, vs, "Matt-05.html#vs15")
                || isValidVerse(curFile, vs, "Luke-15.html#vs8")
                || isValidVerse(curFile, vs, "Acts-28.html#vs2");
    }  // isAansteken

    private static boolean isDoodsteek(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-042.html#vs11");
    } // isDoodsteek

    private static boolean isDoodsteken(final File curFile, final String vs) {
        if (isDoodsteek(curFile, vs)) {
            return false;
        }

        return isValidVerse(curFile, vs, "Judg-08.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs17", 18)
                || isValidVerse(curFile, vs, "2Sam-01.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs29", 31);
    } // isDoodsteken

    private static boolean isDoorsteken() {
        return false;
    } // isDoorsteken

    private static boolean isInBrandSteken(final File curFile, final String vs, final String arg) {
        if (arg.equals("in brand steken")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Josh-08.html#vs8", 19)
                || isValidVerse(curFile, vs, "Judg-01.html#vs8")
                || isValidVerse(curFile, vs, "Judg-09.html#vs49", 52)
                || isValidVerse(curFile, vs, "Judg-15.html#vs5")
                || isValidVerse(curFile, vs, "Judg-20.html#vs48")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs30", 31)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs12")
                || isValidVerse(curFile, vs, "Ps-074.html#vs7")
                || isValidVerse(curFile, vs, "Isa-42.html#vs25")
                || isValidVerse(curFile, vs, "Jer-51.html#vs30")
                || isValidVerse(curFile, vs, "Matt-22.html#vs7");
    } // isInBrandSteken

    private static boolean isInsteken() {
        return false;
    } // isInsteken

    private static boolean isNeersteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-01.html#vs15")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs25", 34, 46);
    } // isNeersteken

    private static boolean isOmhoogsteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-083.html#vs3")
                || isValidVerse(curFile, vs, "Isa-62.html#vs10");
    } // isOmhoogsteken

    private static boolean isOpsteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs31")
                || isValidVerse(curFile, vs, "Mark-04.html#vs37");
    } // isOpsteken

    private static boolean isOversteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs21")
                || isValidVerse(curFile, vs, "Gen-32.html#vs16", 21, 22)
                || isValidVerse(curFile, vs, "Num-32.html#vs7")
                || isValidVerse(curFile, vs, "Num-33.html#vs8")
                || isValidVerse(curFile, vs, "Deut-02.html#vs13")
                || isValidVerse(curFile, vs, "Josh-01.html#vs2")
                || isValidVerse(curFile, vs, "Josh-02.html#vs23")
                || isValidVerse(curFile, vs, "Josh-03.html#vs14", 16, 17)
                || isValidVerse(curFile, vs, "Josh-04.html#vs10", 12, 13, 22)
                || isValidVerse(curFile, vs, "Josh-22.html#vs19")
                || isValidVerse(curFile, vs, "Judg-08.html#vs4")
                || isValidVerse(curFile, vs, "Judg-10.html#vs9")
                || isValidVerse(curFile, vs, "Judg-12.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs4", 8)
                || isValidVerse(curFile, vs, "2Sam-02.html#vs15", 29)
                || isValidVerse(curFile, vs, "2Sam-10.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs22", 23)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs16", 21, 22)
                || isValidVerse(curFile, vs, "2Sam-19.html#vs17", 31, 33)
                || isValidVerse(curFile, vs, "2Sam-24.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs17")
                || isValidVerse(curFile, vs, "Isa-23.html#vs6", 12)
                || isValidVerse(curFile, vs, "Jer-02.html#vs10")
                || isValidVerse(curFile, vs, "Jer-41.html#vs10")
                || isValidVerse(curFile, vs, "John-06.html#vs17");
    } // isOversteken

    private static boolean isStaak(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-21.html#vs8", 9)
                || isValidVerse(curFile, vs, "Isa-28.html#vs27");
    } // isStaak

    private static boolean isStaken(final File curFile, final String vs) {
        if (isStaak(curFile, vs)) {
            return false;
        }

        return isValidVerse(curFile, vs, "1Sam-14.html#vs46")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs5")
                || isValidVerse(curFile, vs, "Lam-5.html#vs14");
    } // isStaken

    private static boolean isUitsteken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-08.html#vs9")
                || isValidVerse(curFile, vs, "Gen-19.html#vs10")
                || isValidVerse(curFile, vs, "Gen-22.html#vs12")
                || isValidVerse(curFile, vs, "Gen-48.html#vs14")
                || isValidVerse(curFile, vs, "Exod-04.html#vs4")
                || isValidVerse(curFile, vs, "Exod-25.html#vs33", 35)
                || isValidVerse(curFile, vs, "Exod-27.html#vs7")
                || isValidVerse(curFile, vs, "Exod-37.html#vs18", 19, 21)
                || isValidVerse(curFile, vs, "Judg-06.html#vs21")
                || isValidVerse(curFile, vs, "Judg-15.html#vs15")
                || isValidVerse(curFile, vs, "Judg-16.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs27")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs15")
                || isValidVerse(curFile, vs, "Esth-09.html#vs10", 15, 16)
                || isValidVerse(curFile, vs, "Job-01.html#vs11")
                || isValidVerse(curFile, vs, "Job-02.html#vs5")
                || isValidVerse(curFile, vs, "Job-33.html#vs21")
                || isValidVerse(curFile, vs, "Ps-018.html#vs17")
                || isValidVerse(curFile, vs, "Ps-144.html#vs7")
                || isValidVerse(curFile, vs, "Ps-144.html#vs7")
                || isValidVerse(curFile, vs, "Prov-31.html#vs19")
                || isValidVerse(curFile, vs, "Isa-57.html#vs4")
                || isValidVerse(curFile, vs, "Jer-01.html#vs9")
                || isValidVerse(curFile, vs, "Matt-08.html#vs3")
                || isValidVerse(curFile, vs, "Matt-12.html#vs13")
                || isValidVerse(curFile, vs, "Matt-14.html#vs31")
                || isValidVerse(curFile, vs, "Matt-26.html#vs51")
                || isValidVerse(curFile, vs, "Mark-01.html#vs41")
                || isValidVerse(curFile, vs, "Mark-03.html#vs5")
                || isValidVerse(curFile, vs, "Luke-05.html#vs13")
                || isValidVerse(curFile, vs, "Luke-06.html#vs10");
    } // isUitsteken

}
