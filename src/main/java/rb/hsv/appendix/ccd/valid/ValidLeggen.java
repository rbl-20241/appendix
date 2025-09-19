package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLeggen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final @NotNull File curFile, final String vs) {
        return switch (keyArg) {
            case "aanleggen" -> isAanleggen(curFile, vs);
            case "afleggen" -> isAfleggen(curFile, vs);
            case "beslag leggen" -> isBeslagLeggen(curFile, vs);
            case "blootleggen" -> isBlootleggen(curFile, vs);
            case "droogleggen" -> isDroogleggen();
            case "eed afleggen" -> isEedAfleggen(curFile, vs);
            case "gelofte afleggen" -> isGelofteAfleggen(curFile, vs);
            case "getuigenis afleggen" -> isGetuigenisAfleggen(curFile, vs);
            case "in de mond leggen" -> isInDeMondLeggen(curFile, vs, arg);
            case "klaarleggen" -> isKlaarleggen(curFile, vs);
            case "neerleggen" -> isNeerleggen(curFile, vs);
            case "opleggen" -> isOpleggen(curFile, vs);
            case "opzijleggen" -> isOpzijleggen();
            case "overleg" -> isOverleg(curFile, vs);
            case "overleggen" -> isOverleggen(curFile, vs, arg);
            case "te ruste leggen" -> isTeRusteLeggen(curFile, vs, arg);
            case "te slapen leggen" -> isTeSlapenLeggen(curFile, vs, arg);
            case "ten grondslag leggen" -> isTenGrondslagLeggen(curFile, vs, arg);
            case "ten laste leggen" -> isTenLasteLeggen(curFile, vs, arg);
            case "terugleggen" -> isTerugleggen(curFile, vs);
            case "toeleggen" -> isToeleggen(curFile, vs);
            case "uitleg" -> isUitleg(curFile, vs);
            case "uitleggen" -> isUitleggen(curFile, vs, arg);
            case "vastleggen" -> isVastleggen(curFile, vs);
            case "verantwoording afleggen" -> isVerantwoordingAfleggen(curFile, vs);
            case "voorleggen" -> isVoorleggen(curFile, vs);
            case "weerleggen" -> isWeerleggen();
            case "wegleggen" -> isWegleggen(curFile, vs);
            case "leggen" -> isLeggen(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAanleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-13.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs7")
                || isValidVerse(curFile, vs, "Ps-058.html#vs8")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs5", 6)
                || isValidVerse(curFile, vs, "Jer-29.html#vs5", 28)
                || isValidVerse(curFile, vs, "Ezek-30.html#vs21")
                || isValidVerse(curFile, vs, "Mark-06.html#vs53")
                || isValidVerse(curFile, vs, "Acts-20.html#vs15");
    } // isAanleggen

    public static boolean isAfleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-28.html#vs20")
                || isValidVerse(curFile, vs, "Gen-31.html#vs53")
                || isValidVerse(curFile, vs, "Gen-35.html#vs16")
                || isValidVerse(curFile, vs, "Gen-38.html#vs19")
                || isValidVerse(curFile, vs, "Lev-06.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs29")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs14")
                || isValidVerse(curFile, vs, "Esth-04.html#vs4")
                || isValidVerse(curFile, vs, "Job-33.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs2")
                || isValidVerse(curFile, vs, "Isa-10.html#vs28")
                || isValidVerse(curFile, vs, "Jer-05.html#vs2")
                || isValidVerse(curFile, vs, "Jer-52.html#vs33")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs16")
                || isValidVerse(curFile, vs, "Jonah-3.html#vs6")
                || isValidVerse(curFile, vs, "Mark-14.html#vs56", 57)
                || isValidVerse(curFile, vs, "John-13.html#vs4")
                || isValidVerse(curFile, vs, "Acts-02.html#vs40")
                || isValidVerse(curFile, vs, "Acts-04.html#vs33")
                || isValidVerse(curFile, vs, "Acts-05.html#vs6")
                || isValidVerse(curFile, vs, "Acts-07.html#vs58")
                || isValidVerse(curFile, vs, "Eph-4.html#vs25")
                || isValidVerse(curFile, vs, "Col-3.html#vs8")
                || isValidVerse(curFile, vs, "Heb-04.html#vs13")
                || isValidVerse(curFile, vs, "Jas-1.html#vs21")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs1");
    } // isAfleggen

    public static boolean isBeslagLeggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-19.html#vs41")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs6")
                || isValidVerse(curFile, vs, "Ps-109.html#vs11");
    } // isBeslagLeggen

    public static boolean isBlootleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mic-1.html#vs6")
                || isValidVerse(curFile, vs, "Hab-3.html#vs13");
    } // isBlootleggen

    public static boolean isDroogleggen() {
        return false;
    } // isDroogleggen

    public static boolean isEedAfleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs53")
                || isValidVerse(curFile, vs, "Lev-06.html#vs3", 5)
                || isValidVerse(curFile, vs, "Lev-19.html#vs12")
                || isValidVerse(curFile, vs, "Judg-21.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs2")
                || isValidVerse(curFile, vs, "Jer-05.html#vs2")
                || isValidVerse(curFile, vs, "Zech-05.html#vs3", 4);
    } // isEedAfleggen

    public static boolean isGelofteAfleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-28.html#vs20")
                || isValidVerse(curFile, vs, "Lev-27.html#vs2", 8)
                || isValidVerse(curFile, vs, "Num-06.html#vs2")
                || isValidVerse(curFile, vs, "Num-30.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs7", 8)
                || isValidVerse(curFile, vs, "Jer-44.html#vs25")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs16");
    } // isGelofteAfleggen

    public static boolean isGetuigenisAfleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-12.html#vs3")
                || isValidVerse(curFile, vs, "Prov-25.html#vs18")
                || isValidVerse(curFile, vs, "Matt-19.html#vs18")
                || isValidVerse(curFile, vs, "Mark-10.html#vs19")
                || isValidVerse(curFile, vs, "Mark-14.html#vs56", 57)
                || isValidVerse(curFile, vs, "Luke-16.html#vs28")
                || isValidVerse(curFile, vs, "Luke-18.html#vs20")
                || isValidVerse(curFile, vs, "Acts-02.html#vs40")
                || isValidVerse(curFile, vs, "Acts-04.html#vs33")
                || isValidVerse(curFile, vs, "Didache-02.html#vs3");
    } // isGetuigenisAfleggen

    public static boolean isInDeMondLeggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in de mond leggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-04.html#vs15")
                || isValidVerse(curFile, vs, "Num-22.html#vs38")
                || isValidVerse(curFile, vs, "Num-23.html#vs5", 12, 16)
                || isValidVerse(curFile, vs, "Deut-31.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs3", 19)
                || isValidVerse(curFile, vs, "Ezra-08.html#vs17")
                || isValidVerse(curFile, vs, "Ps-040.html#vs4")
                || isValidVerse(curFile, vs, "Isa-51.html#vs16")
                || isValidVerse(curFile, vs, "Isa-59.html#vs21");
    } // isInDeMondLeggen

    public static boolean isKlaarleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-07.html#vs23");
    } // isKlaarleggen

    public static boolean isNeerleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs37")
                || isValidVerse(curFile, vs, "Num-17.html#vs7")
                || isValidVerse(curFile, vs, "Num-24.html#vs9")
                || isValidVerse(curFile, vs, "Josh-04.html#vs3", 8)
                || isValidVerse(curFile, vs, "1Sam-21.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs19")
                || isValidVerse(curFile, vs, "Ps-005.html#vs4")
                || isValidVerse(curFile, vs, "Ps-104.html#vs22")
                || isValidVerse(curFile, vs, "Ps-132.html#vs3")
                || isValidVerse(curFile, vs, "Ps-139.html#vs8")
                || isValidVerse(curFile, vs, "Isa-51.html#vs23")
                || isValidVerse(curFile, vs, "Jer-02.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-04.html#vs1")
                || isValidVerse(curFile, vs, "Luke-05.html#vs18")
                || isValidVerse(curFile, vs, "Rev-02.html#vs14");
    } // isNeerleggen

    public static boolean isOpleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-23.html#vs33", 35)
                || isValidVerse(curFile, vs, "2Chr-36.html#vs3")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs24")
                || isValidVerse(curFile, vs, "Neh-10.html#vs32")
                || isValidVerse(curFile, vs, "Esth-10.html#vs1")
                || isValidVerse(curFile, vs, "Job-34.html#vs23")
                || isValidVerse(curFile, vs, "Ps-105.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-04.html#vs5", 6)
                || isValidVerse(curFile, vs, "Luke-11.html#vs46")
                || isValidVerse(curFile, vs, "Acts-15.html#vs28")
                || isValidVerse(curFile, vs, "1Tim-1.html#vs18");
    } // isOpleggen

    public static boolean isOpzijleggen() {
        return false;
    } // isOpzijleggen

    public static boolean isOverleg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs6", 8, 28)
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs6", 8)
                || isValidVerse(curFile, vs, "2Chr-20.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs2", 23)
                || isValidVerse(curFile, vs, "2Chr-32.html#vs3")
                || isValidVerse(curFile, vs, "Neh-06.html#vs7")
                || isValidVerse(curFile, vs, "Prov-15.html#vs22")
                || isValidVerse(curFile, vs, "Prov-20.html#vs18")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs10");
    } // isOverleg

    public static boolean isOverleggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("overleg")) {
            return !isOverleg(curFile, vs);
        }
        return false;
    } // isOverleggen

    public static boolean isTeRusteLeggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te ruste leggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Judg-19.html#vs9");
    } // isTeRusteLeggen

    public static boolean isTeSlapenLeggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te slapen leggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-19.html#vs4")
                || isValidVerse(curFile, vs, "Gen-28.html#vs11")
                || isValidVerse(curFile, vs, "Josh-02.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-03.html#vs3")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs9")
                || isValidVerse(curFile, vs, "Job-07.html#vs4")
                || isValidVerse(curFile, vs, "Job-27.html#vs19")
                || isValidVerse(curFile, vs, "Job-40.html#vs16");
    } // isTeSlapenLeggen

    public static boolean isTenGrondslagLeggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ten grondslag leggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-28.html#vs16");
    } // isTenGrondslagLeggen

    public static boolean isTenLasteLeggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ten laste leggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-22.html#vs14", 17)
                || isValidVerse(curFile, vs, "Job-04.html#vs18");
    } // isTenLasteLeggen

    public static boolean isTerugleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-42.html#vs25");
    } // isTerugleggen

    public static boolean isToeleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-01.html#vs13", 17)
                || isValidVerse(curFile, vs, "Rom-12.html#vs13");
    } // isToeleggen

    public static boolean isUitleg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-40.html#vs8", 12, 16, 18)
                || isValidVerse(curFile, vs, "Judg-07.html#vs15")
                || isValidVerse(curFile, vs, "Neh-08.html#vs9")
                || isValidVerse(curFile, vs, "Dan-02.html#vs4", 5, 6, 7, 9, 16, 24, 25, 26, 30, 36, 45)
                || isValidVerse(curFile, vs, "Dan-04.html#vs6", 7, 9, 18, 19, 24)
                || isValidVerse(curFile, vs, "Dan-05.html#vs7", 8, 12, 15, 16, 26)
                || isValidVerse(curFile, vs, "Dan-07.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-12.html#vs10")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs20");
    } // isUitleg

    public static boolean isUitleggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("uitleg")) {
            return !isUitleg(curFile, vs);
        }
        return isValidVerse(curFile, vs, "Gen-41.html#vs12")
                || isValidVerse(curFile, vs, "Deut-01.html#vs5")
                || isValidVerse(curFile, vs, "Judg-14.html#vs15", 17)
                || isValidVerse(curFile, vs, "Dan-05.html#vs12")
                || isValidVerse(curFile, vs, "Luke-24.html#vs27")
                || isValidVerse(curFile, vs, "Acts-18.html#vs26")
                || isValidVerse(curFile, vs, "Acts-28.html#vs23")
                || isValidVerse(curFile, vs, "Heb-05.html#vs11");
    } // isUitleggen

    public static boolean isVastleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-09.html#vs21");
    } // isVastleggen

    public static boolean isVerantwoordingAfleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-33.html#vs13")
                || isValidVerse(curFile, vs, "Dan-06.html#vs3");
    } // isVerantwoordingAfleggen

    public static boolean isVoorleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-24.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs3")
                || isValidVerse(curFile, vs, "Gal-2.html#vs2");
    } // isVoorleggen

    public static boolean isWeerleggen() {
        return false;
    } // isWeerleggen

    public static boolean isWegleggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-36.html#vs20");
    } // isWegleggen

    public static boolean isLeggen(final File curFile, final String vs, final String arg) {
        return !isAanleggen(curFile, vs)
                && !isAfleggen(curFile, vs)
                && !isBeslagLeggen(curFile, vs)
                && !isBlootleggen(curFile, vs)
                && !isDroogleggen()
                && !isEedAfleggen(curFile, vs)
                && !isGelofteAfleggen(curFile, vs)
                && !isGetuigenisAfleggen(curFile, vs)
                && !isKlaarleggen(curFile, vs)
                && !isNeerleggen(curFile, vs)
                && !isOpleggen(curFile, vs)
                && !isOpzijleggen()
                && !isOverleg(curFile, vs)
                && !isOverleggen(curFile, vs, arg)
                && !isTerugleggen(curFile, vs)
                && !isToeleggen(curFile, vs)
                && !isUitleg(curFile, vs)
                && !isUitleggen(curFile, vs, arg)
                && !isVastleggen(curFile, vs)
                && !isVerantwoordingAfleggen(curFile, vs)
                && !isVoorleggen(curFile, vs)
                && !isWeerleggen()
                && !isWegleggen(curFile, vs);
    }  // isLeggen

}
