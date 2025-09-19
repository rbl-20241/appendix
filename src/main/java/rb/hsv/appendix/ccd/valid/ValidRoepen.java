package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRoepen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanroepen" -> isAanroepen(curFile, vs);
            case "afroepen" -> isAfroepen(curFile, vs);
            case "bijeenroepen" -> isBijeenroepen(curFile, vs);
            case "naroepen" -> isNaroepen(curFile, vs);
            case "oproepen" -> isOproepen(curFile, vs);
            case "samenroepen" -> isSamenroepen(curFile, vs);
            case "uitroepen" -> isUitroepen(curFile, vs);
            case "roep" -> isRoep(curFile, vs);
            case "roepen" -> (!isAanroepen(curFile, vs)
                    && !isAfroepen(curFile, vs)
                    && !isBijeenroepen(curFile, vs)
                    && !isNaroepen(curFile, vs)
                    && !isOproepen(curFile, vs)
                    && !isRoep(curFile, vs)
                    && !isSamenroepen(curFile, vs)
                    && !isUitroepen(curFile, vs))
                    || isValidVerse(curFile, vs, "Exod-22.html#vs23")
                    || isValidVerse(curFile, vs, "2Sam-22.html#vs7")
                    || isValidVerse(curFile, vs, "Ps-018.html#vs7")
                    || isValidVerse(curFile, vs, "Ps-141.html#vs1")
                    || isValidVerse(curFile, vs, "Isa-12.html#vs4")
                    || isValidVerse(curFile, vs, "Eph-4.html#vs1")
                    || isValidVerse(curFile, vs, "1Thess-2.html#vs12");
            default -> true;
        };
    }

    public static boolean isAanroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-04.html#vs26")
                || isValidVerse(curFile, vs, "Gen-12.html#vs8")
                || isValidVerse(curFile, vs, "Gen-13.html#vs4")
                || isValidVerse(curFile, vs, "Gen-21.html#vs33")
                || isValidVerse(curFile, vs, "Gen-26.html#vs25")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs4", 7)
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs20", 21)
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs24", 26)
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs11")
                || isValidVerse(curFile, vs, "1Chr-04.html#vs10")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs8")
                || isValidVerse(curFile, vs, "Ps-014.html#vs4")
                || isValidVerse(curFile, vs, "Ps-018.html#vs4", 7)
                || isValidVerse(curFile, vs, "Ps-031.html#vs18")
                || isValidVerse(curFile, vs, "Ps-050.html#vs15")
                || isValidVerse(curFile, vs, "Ps-053.html#vs5")
                || isValidVerse(curFile, vs, "Ps-086.html#vs7")
                || isValidVerse(curFile, vs, "Ps-105.html#vs1")
                || isValidVerse(curFile, vs, "Ps-116.html#vs4")
                || isValidVerse(curFile, vs, "Ps-141.html#vs1")
                || isValidVerse(curFile, vs, "Isa-12.html#vs4")
                || isValidVerse(curFile, vs, "Isa-55.html#vs6")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs6", 14)
                || isValidVerse(curFile, vs, "2Cor-01.html#vs23");
    } // isAanroepen

    public static boolean isAfroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-105.html#vs16");
    } // isAfroepen

    public static boolean isBijeenroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-12.html#vs21")
                || isValidVerse(curFile, vs, "Lev-08.html#vs3")
                || isValidVerse(curFile, vs, "Num-01.html#vs18")
                || isValidVerse(curFile, vs, "Num-20.html#vs8", 10)
                || isValidVerse(curFile, vs, "Deut-04.html#vs10")
                || isValidVerse(curFile, vs, "Deut-05.html#vs1")
                || isValidVerse(curFile, vs, "Deut-29.html#vs2")
                || isValidVerse(curFile, vs, "Deut-31.html#vs12")
                || isValidVerse(curFile, vs, "Josh-22.html#vs1")
                || isValidVerse(curFile, vs, "Judg-04.html#vs10", 13)
                || isValidVerse(curFile, vs, "Judg-12.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs4", 5)
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs18")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-15.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-28.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs6")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs28")
                || isValidVerse(curFile, vs, "Joel-2.html#vs15")
                || isValidVerse(curFile, vs, "Mark-15.html#vs16")
                || isValidVerse(curFile, vs, "Luke-09.html#vs1")
                || isValidVerse(curFile, vs, "Luke-15.html#vs6", 9)
                || isValidVerse(curFile, vs, "John-11.html#vs47")
                || isValidVerse(curFile, vs, "Acts-05.html#vs21")
                || isValidVerse(curFile, vs, "Acts-14.html#vs27")
                || isValidVerse(curFile, vs, "Acts-19.html#vs25");
    } // isBijeenroepen

    public static boolean isNaroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-17.html#vs11")
                || isValidVerse(curFile, vs, "Jer-12.html#vs6")
                || isValidVerse(curFile, vs, "Matt-15.html#vs23");
    } // isNaroepen

    public static boolean isOproepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-15.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs8", 11)
                || isValidVerse(curFile, vs, "Jer-25.html#vs29")
                || isValidVerse(curFile, vs, "Jer-51.html#vs27")
                || isValidVerse(curFile, vs, "Amos-5.html#vs16")
                || isValidVerse(curFile, vs, "Acts-19.html#vs31")
                || isValidVerse(curFile, vs, "Acts-27.html#vs22")
                || isValidVerse(curFile, vs, "Rom-12.html#vs1")
                || isValidVerse(curFile, vs, "Rom-15.html#vs30")
                || isValidVerse(curFile, vs, "Rom-16.html#vs17")
                || isValidVerse(curFile, vs, "1Cor-01.html#vs10")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-16.html#vs15")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs1")
                || isValidVerse(curFile, vs, "Eph-4.html#vs1")
                || isValidVerse(curFile, vs, "Phil-4.html#vs2")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs12")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs1", 10)
                || isValidVerse(curFile, vs, "1Thess-5.html#vs14")
                || isValidVerse(curFile, vs, "1Tim-2.html#vs1")
                || isValidVerse(curFile, vs, "Heb-13.html#vs19", 22)
                || isValidVerse(curFile, vs, "1Pet-2.html#vs11")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs1");
    } // isOproepen

    public static boolean isRoep(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs20", 21)
                || isValidVerse(curFile, vs, "Gen-19.html#vs13")
                || isValidVerse(curFile, vs, "Exod-22.html#vs23")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs36")
                || isValidVerse(curFile, vs, "Luke-04.html#vs37");
    } // isRoep

    public static boolean isSamenroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-31.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs17");
    } // isSamenroepen

    public static boolean isUitroepen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-34.html#vs5")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs9", 12)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs3")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs21")
                || isValidVerse(curFile, vs, "Neh-06.html#vs7")
                || isValidVerse(curFile, vs, "Esth-06.html#vs11")
                || isValidVerse(curFile, vs, "Ps-084.html#vs3")
                || isValidVerse(curFile, vs, "Prov-12.html#vs23")
                || isValidVerse(curFile, vs, "Prov-20.html#vs6")
                || isValidVerse(curFile, vs, "Isa-30.html#vs7")
                || isValidVerse(curFile, vs, "Isa-61.html#vs1", 2)
                || isValidVerse(curFile, vs, "Joel-3.html#vs9")
                || isValidVerse(curFile, vs, "Amos-7.html#vs4")
                || isValidVerse(curFile, vs, "Jonah-3.html#vs5")
                || isValidVerse(curFile, vs, "Hag-1.html#vs11")
                || isValidVerse(curFile, vs, "Acts-12.html#vs22")
                || isValidVerse(curFile, vs, "Rom-09.html#vs27");
    } // isUitroepen

}
