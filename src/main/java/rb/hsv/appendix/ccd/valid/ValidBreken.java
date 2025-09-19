package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBreken {

    public static boolean isValid(final @NotNull String keyArg, @NotNull final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanbreken" -> isAanbreken(curFile, vs);
            case "afbreken" -> isAfbreken(curFile, vs);
            case "doorbreken" -> isDoorbreken(curFile, vs);
            case "in stukken breken" -> isInStukkenBreken(curFile, vs, arg);
            case "inbreken" -> isInbreken(curFile, vs);
            case "losbreken" -> IS_NOT_FOUND;
            case "opbreken" -> isOpbreken(curFile, vs);
            case "openbreken" -> isOpenbreken(curFile, vs);
            case "stukbreken" -> isStukbreken(curFile, vs);
            case "uitbreken" -> isUitbreken(curFile, vs);
            case "breken" -> isBreken(curFile, vs, arg);
            default -> true;
        };
    }

    private static boolean isBreken(final File curFile, final String vs, final String arg) {
        return (!isAanbreken(curFile, vs)
                && !isAfbreken(curFile, vs)
                && !isDoorbreken(curFile, vs)
                && !isInStukkenBreken(curFile, vs, arg)
                && !isInbreken(curFile, vs)
                && !isOpbreken(curFile, vs)
                && !isOpenbreken(curFile, vs)
                && !isStukbreken(curFile, vs)
                && !isUitbreken(curFile, vs))
                || isValidVerse(curFile, vs, "2Chr-23.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs4")
                || isValidVerse(curFile, vs, "Ps-058.html#vs7");
    }

    private static boolean isAanbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-22.html#vs7")
                || isValidVerse(curFile, vs, "Luke-23.html#vs54");
    }

    private static boolean isAfbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-06.html#vs25")
                || isValidVerse(curFile, vs, "Judg-08.html#vs17")
                || isValidVerse(curFile, vs, "Judg-09.html#vs45")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs27")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs7", 8, 12, 15)
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs4", 7)
                || isValidVerse(curFile, vs, "2Chr-36.html#vs19")
                || isValidVerse(curFile, vs, "Job-12.html#vs14")
                || isValidVerse(curFile, vs, "Job-30.html#vs13")
                || isValidVerse(curFile, vs, "Prov-14.html#vs1")
                || isValidVerse(curFile, vs, "Prov-14.html#vs1")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs3")
                || isValidVerse(curFile, vs, "Isa-22.html#vs10")
                || isValidVerse(curFile, vs, "Jer-01.html#vs10")
                || isValidVerse(curFile, vs, "Jer-18.html#vs7")
                || isValidVerse(curFile, vs, "Jer-31.html#vs28")
                || isValidVerse(curFile, vs, "Jer-39.html#vs8")
                || isValidVerse(curFile, vs, "Jer-52.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs9")
                || isValidVerse(curFile, vs, "Dan-08.html#vs8")
                || isValidVerse(curFile, vs, "John-02.html#vs19")
                || isValidVerse(curFile, vs, "Rom-14.html#vs20")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs5")
                || isValidVerse(curFile, vs, "Eph-2.html#vs14")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs18");
    }

    private static boolean isDoorbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-08.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs5", 7, 12);
    }

    public static boolean isInStukkenBreken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in stukken breken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-34.html#vs1")
                || isValidVerse(curFile, vs, "Lev-02.html#vs6")
                || isValidVerse(curFile, vs, "Deut-09.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs4")
                || isValidVerse(curFile, vs, "Ps-105.html#vs33")
                || isValidVerse(curFile, vs, "Ezek-06.html#vs4", 6)
                || isValidVerse(curFile, vs, "Amos-1.html#vs5");
    } // isInStukkenBreken

    private static boolean isInbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Hos-07.html#vs1");
    }

    private static boolean isOpbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs8")
                || isValidVerse(curFile, vs, "Gen-26.html#vs22")
                || isValidVerse(curFile, vs, "Gen-35.html#vs5", 16, 21)
                || isValidVerse(curFile, vs, "Gen-46.html#vs1")
                || isValidVerse(curFile, vs, "Exod-13.html#vs20")
                || isValidVerse(curFile, vs, "Exod-16.html#vs1")
                || isValidVerse(curFile, vs, "Exod-17.html#vs1")
                || isValidVerse(curFile, vs, "Exod-19.html#vs2")
                || isValidVerse(curFile, vs, "Exod-40.html#vs36", 37)
                || isValidVerse(curFile, vs, "Num-02.html#vs34")
                || isValidVerse(curFile, vs, "Num-09.html#vs17", 18, 19, 20, 21, 22, 23)
                || isValidVerse(curFile, vs, "Num-10.html#vs12", 13, 14, 17, 18, 21, 22, 25)
                || isValidVerse(curFile, vs, "Num-12.html#vs15", 16)
                || isValidVerse(curFile, vs, "Num-20.html#vs22")
                || isValidVerse(curFile, vs, "Num-21.html#vs10", 11, 12, 13)
                || isValidVerse(curFile, vs, "Num-22.html#vs1")
                || isValidVerse(curFile, vs, "Num-33.html#vs3", 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 44, 45, 46, 47, 48)
                || isValidVerse(curFile, vs, "Deut-01.html#vs7", 19)
                || isValidVerse(curFile, vs, "Deut-02.html#vs24")
                || isValidVerse(curFile, vs, "Deut-10.html#vs6", 7)
                || isValidVerse(curFile, vs, "Josh-03.html#vs1")
                || isValidVerse(curFile, vs, "Judg-18.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs27")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs36")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs31")
                || isValidVerse(curFile, vs, "Isa-37.html#vs37");
    }

    private static boolean isOpenbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs1");
    }

    private static boolean isStukbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-10.html#vs27")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs4", 7)
                || isValidVerse(curFile, vs, "Ps-048.html#vs8")
                || isValidVerse(curFile, vs, "Ps-058.html#vs7")
                || isValidVerse(curFile, vs, "Jer-52.html#vs17")
                || isValidVerse(curFile, vs, "Amos-9.html#vs1")
                || isValidVerse(curFile, vs, "Zech-11.html#vs10");
    }

    private static boolean isUitbreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-027.html#vs3")
                || isValidVerse(curFile, vs, "Ps-098.html#vs4")
                || isValidVerse(curFile, vs, "Isa-14.html#vs7")
                || isValidVerse(curFile, vs, "Isa-44.html#vs23")
                || isValidVerse(curFile, vs, "Isa-49.html#vs13")
                || isValidVerse(curFile, vs, "Isa-52.html#vs9")
                || isValidVerse(curFile, vs, "Isa-54.html#vs1")
                || isValidVerse(curFile, vs, "Rev-12.html#vs7");
    }

}
