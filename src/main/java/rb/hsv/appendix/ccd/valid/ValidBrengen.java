package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBrengen {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aan het licht brengen" -> isAanHetLichtBrengen(curFile, vs, arg);
            case "aanbrengen" -> isAanbrengen(curFile, vs);
            case "afbrengen" -> isAfbrengen(curFile, vs);
            case "bij elkaar brengen" -> isBijElkaarBrengen(curFile, vs, arg);
            case "bijbrengen" -> isBijbrengen(curFile, vs);
            case "bijeenbrengen" -> isBijeenbrengen(curFile, vs);
            case "binnenbrengen" -> isBinnenbrengen(curFile, vs);
            case "doorbrengen" -> isDoorbrengen(curFile, vs);
            case "grootbrengen" -> isGrootbrengen(curFile, vs);
            case "in verwarring brengen" -> isInVerwarringBrengen(curFile, vs, arg);
            case "meebrengen" -> isMeebrengen(curFile, vs);
            case "om het leven brengen" -> isOmHetLevenBrengen(curFile, vs, arg);
            case "ombrengen" -> isOmbrengen(curFile, vs);
            case "omkeer brengen" -> isOmkeerBrengen(curFile, vs, arg);
            case "onderbrengen" -> isOnderbrengen(curFile, vs);
            case "opbrengen" -> isOpbrengen(curFile, vs);
            case "overbrengen" -> isOverbrengen(curFile, vs);
            case "ten uitvoer brengen" -> isTenUitvoerBrengen(curFile, vs, arg);
            case "ter dood brengen" -> isTerDoodBrengen(curFile, vs, arg);
            case "terechtbrengen" -> isTerechtbrengen();
            case "terugbrengen" -> isTerugbrengen(curFile, vs);
            case "teweegbrengen" -> isTeweegbrengen(curFile, vs);
            case "toebrengen" -> isToebrengen(curFile, vs);
            case "tot stand brengen" -> isTotStandBrengen(curFile, vs, arg);
            case "tot zwijgen brengen" -> isTotZwijgenBrengen(curFile, vs, arg);
            case "uitbrengen" -> isUitbrengen(curFile, vs);
            case "verslag uitbrengen" -> isVerslagUitbrengen(curFile, vs, arg);
            case "volbrengen" -> isVolbrengen();
            case "voortbrengen" -> isVoortbrengen(curFile, vs);
            case "wegbrengen" -> isWegbrengen(curFile, vs);
            case "brengen" -> isBrengen(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAanHetLichtBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("aan het licht brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-44.html#vs16")
                || isValidVerse(curFile, vs, "Isa-26.html#vs21")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs5")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs5")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs10");
    } // isAanHetLichtBrengen

    public static boolean isAanbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-40.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs29", 32, 35)
                || isValidVerse(curFile, vs, "2Chr-02.html#vs7", 14)
                || isValidVerse(curFile, vs, "2Chr-03.html#vs5", 14)
                || isValidVerse(curFile, vs, "Matt-27.html#vs37");
    } // isAanbrengen

    public static boolean isAfbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-13.html#vs10")
                || isValidVerse(curFile, vs, "Job-33.html#vs17");
    } // isAfbrengen

    public static boolean isBijElkaarBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("bij elkaar brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Neh-13.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs17");
    } // isBijElkaarBrengen

    public static boolean isBijbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-04.html#vs36")
                || isValidVerse(curFile, vs, "Prov-19.html#vs18")
                || isValidVerse(curFile, vs, "Prov-29.html#vs17", 19)
                || isValidVerse(curFile, vs, "Isa-40.html#vs14");
    } // isBijbrengen

    public static boolean isBijeenbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-41.html#vs48")
                || isValidVerse(curFile, vs, "1Sam-05.html#vs8",11)
                || isValidVerse(curFile, vs, "1Sam-28.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-29.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs19",20)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs35")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs5", 9 ,10)
                || isValidVerse(curFile, vs, "Ezra-08.html#vs15")
                || isValidVerse(curFile, vs, "Ps-039.html#vs7")
                || isValidVerse(curFile, vs, "Ps-041.html#vs7")
                || isValidVerse(curFile, vs, "Ps-106.html#vs47")
                || isValidVerse(curFile, vs, "Prov-28.html#vs8")
                || isValidVerse(curFile, vs, "Isa-66.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs10")
                || isValidVerse(curFile, vs, "Joel-2.html#vs16")
                || isValidVerse(curFile, vs, "Hab-1.html#vs15")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs8")
                || isValidVerse(curFile, vs, "Matt-13.html#vs30")
                || isValidVerse(curFile, vs, "Matt-23.html#vs37")
                || isValidVerse(curFile, vs, "Luke-13.html#vs34")
                || isValidVerse(curFile, vs, "John-11.html#vs52")
                || isValidVerse(curFile, vs, "Acts-19.html#vs19")
                || isValidVerse(curFile, vs, "Eph-1.html#vs10");
    } // isBijeenbrengen

    public static boolean isBinnenbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-43.html#vs26")
                || isValidVerse(curFile, vs, "Exod-40.html#vs4")
                || isValidVerse(curFile, vs, "Lev-10.html#vs18")
                || isValidVerse(curFile, vs, "Lev-16.html#vs12", 15)
                || isValidVerse(curFile, vs, "Deut-22.html#vs2")
                || isValidVerse(curFile, vs, "Judg-19.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs28")
                || isValidVerse(curFile, vs, "Jer-17.html#vs21", 24)
                || isValidVerse(curFile, vs, "Hag-1.html#vs6")
                || isValidVerse(curFile, vs, "Luke-05.html#vs18", 19)
                || isValidVerse(curFile, vs, "Luke-14.html#vs21")
                || isValidVerse(curFile, vs, "John-18.html#vs16");
    } // isBinnenbrengen

    public static boolean isDoorbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-17.html#vs2")
                || isValidVerse(curFile, vs, "Ps-090.html#vs9")
                || isValidVerse(curFile, vs, "Dan-06.html#vs19")
                || isValidVerse(curFile, vs, "Titus-3.html#vs12")
                || isValidVerse(curFile, vs, "Jas-4.html#vs3");
    } // isDoorbrengen

    public static boolean isGrootbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-11.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs2")
                || isValidVerse(curFile, vs, "Hos-09.html#vs12");
    } // isGrootbrengen

    public static boolean isInVerwarringBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in verwarring brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-14.html#vs24")
                || isValidVerse(curFile, vs, "Exod-23.html#vs27")
                || isValidVerse(curFile, vs, "Deut-02.html#vs15")
                || isValidVerse(curFile, vs, "Deut-07.html#vs23")
                || isValidVerse(curFile, vs, "Josh-10.html#vs10")
                || isValidVerse(curFile, vs, "Judg-04.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs6")
                || isValidVerse(curFile, vs, "Esth-09.html#vs24")
                || isValidVerse(curFile, vs, "Ps-018.html#vs15")
                || isValidVerse(curFile, vs, "Ps-144.html#vs6")
                || isValidVerse(curFile, vs, "Song-6.html#vs5")
                || isValidVerse(curFile, vs, "Isa-09.html#vs15")
                || isValidVerse(curFile, vs, "Acts-09.html#vs22")
                || isValidVerse(curFile, vs, "Acts-15.html#vs24")
                || isValidVerse(curFile, vs, "Acts-17.html#vs8", 13)
                || isValidVerse(curFile, vs, "Acts-21.html#vs27")
                || isValidVerse(curFile, vs, "Gal-1.html#vs7")
                || isValidVerse(curFile, vs, "Gal-5.html#vs10")
                || isValidVerse(curFile, vs, "1Thess-3.html#vs3")
                || isValidVerse(curFile, vs, "Titus-1.html#vs11")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs14");
    } // isInVerwarringBrengen

    public static boolean isMeebrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs5")
                || isValidVerse(curFile, vs, "Gen-43.html#vs7")
                || isValidVerse(curFile, vs, "Gen-46.html#vs7")
                || isValidVerse(curFile, vs, "Gen-47.html#vs7")
                || isValidVerse(curFile, vs, "Judg-16.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs34")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs10", 24)
                || isValidVerse(curFile, vs, "Ezra-01.html#vs11")
                || isValidVerse(curFile, vs, "Luke-07.html#vs37")
                || isValidVerse(curFile, vs, "Luke-24.html#vs1")
                || isValidVerse(curFile, vs, "John-19.html#vs39")
                || isValidVerse(curFile, vs, "Acts-05.html#vs26")
                || isValidVerse(curFile, vs, "Acts-20.html#vs12")
                || isValidVerse(curFile, vs, "Acts-21.html#vs16")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs11", 13);
    } // isMeebrengen

    public static boolean isOmHetLevenBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("om het leven brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-37.html#vs21")
                || isValidVerse(curFile, vs, "Lev-24.html#vs17", 18)
                || isValidVerse(curFile, vs, "Num-35.html#vs11", 15, 30)
                || isValidVerse(curFile, vs, "Deut-19.html#vs6", 11)
                || isValidVerse(curFile, vs, "Deut-22.html#vs26")
                || isValidVerse(curFile, vs, "Deut-27.html#vs25")
                || isValidVerse(curFile, vs, "Josh-20.html#vs3", 9)
                || isValidVerse(curFile, vs, "Jer-40.html#vs14", 15)
                || isValidVerse(curFile, vs, "Acts-07.html#vs28");
    } // isOmHetLevenBrengen

    public static boolean isOmbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-07.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs9", 15)
                || isValidVerse(curFile, vs, "2Sam-01.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs41")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs19")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs10")
                || isValidVerse(curFile, vs, "Esth-03.html#vs13")
                || isValidVerse(curFile, vs, "Esth-08.html#vs5", 11)
                || isValidVerse(curFile, vs, "Esth-09.html#vs24")
                || isValidVerse(curFile, vs, "Job-05.html#vs2")
                || isValidVerse(curFile, vs, "Job-09.html#vs22")
                || isValidVerse(curFile, vs, "Ps-005.html#vs7")
                || isValidVerse(curFile, vs, "Ps-018.html#vs41")
                || isValidVerse(curFile, vs, "Ps-054.html#vs7")
                || isValidVerse(curFile, vs, "Ps-119.html#vs95")
                || isValidVerse(curFile, vs, "Ps-139.html#vs19")
                || isValidVerse(curFile, vs, "Ps-143.html#vs12")
                || isValidVerse(curFile, vs, "Jer-50.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs27")
                || isValidVerse(curFile, vs, "Dan-02.html#vs12", 24)
                || isValidVerse(curFile, vs, "Matt-02.html#vs13", 16)
                || isValidVerse(curFile, vs, "Matt-12.html#vs14")
                || isValidVerse(curFile, vs, "Matt-22.html#vs7")
                || isValidVerse(curFile, vs, "Mark-03.html#vs6")
                || isValidVerse(curFile, vs, "Mark-09.html#vs22")
                || isValidVerse(curFile, vs, "Mark-11.html#vs18")
                || isValidVerse(curFile, vs, "Luke-17.html#vs29")
                || isValidVerse(curFile, vs, "Luke-19.html#vs47")
                || isValidVerse(curFile, vs, "Luke-22.html#vs2")
                || isValidVerse(curFile, vs, "Acts-26.html#vs21");
    } // isOmbrengen

    public static boolean isOmkeerBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("omkeer brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-30.html#vs3")
                || isValidVerse(curFile, vs, "Job-42.html#vs10")
                || isValidVerse(curFile, vs, "Ps-085.html#vs2")
                || isValidVerse(curFile, vs, "Ps-126.html#vs4")
                || isValidVerse(curFile, vs, "Jer-29.html#vs14")
                || isValidVerse(curFile, vs, "Jer-30.html#vs3", 18)
                || isValidVerse(curFile, vs, "Jer-31.html#vs23")
                || isValidVerse(curFile, vs, "Jer-32.html#vs44")
                || isValidVerse(curFile, vs, "Jer-32.html#vs44")
                || isValidVerse(curFile, vs, "Jer-33.html#vs7", 11, 26)
                || isValidVerse(curFile, vs, "Jer-48.html#vs47")
                || isValidVerse(curFile, vs, "Jer-49.html#vs6", 39)
                || isValidVerse(curFile, vs, "Ezek-16.html#vs53")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs25")
                || isValidVerse(curFile, vs, "Hos-06.html#vs11")
                || isValidVerse(curFile, vs, "Joel-3.html#vs1")
                || isValidVerse(curFile, vs, "Amos-9.html#vs14")
                || isValidVerse(curFile, vs, "Zeph-2.html#vs7")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs20");
    } // isOmkeerBrengen

    public static boolean isOnderbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-18.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-01.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs25");
    } // isOnderbrengen

    public static boolean isOpbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-41.html#vs47")
                || isValidVerse(curFile, vs, "Gen-47.html#vs47")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs20");
    } // isOpbrengen

    public static boolean isOverbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs2")
                || isValidVerse(curFile, vs, "Exod-19.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs51")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs1", 4)
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs20")
                || isValidVerse(curFile, vs, "1Chr-15.html#vs28")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs1", 2, 5)
                || isValidVerse(curFile, vs, "2Chr-25.html#vs28")
                || isValidVerse(curFile, vs, "Acts-16.html#vs4")
                || isValidVerse(curFile, vs, "1Cor-16.html#vs3");
    } // isOverbrengen

    public static boolean isTenUitvoerBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ten uitvoer brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Kgs-09.html#vs1")
                || isValidVerse(curFile, vs, "Job-23.html#vs14")
                || isValidVerse(curFile, vs, "Isa-10.html#vs23")
                || isValidVerse(curFile, vs, "Lam-4.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-05.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-06.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-07.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs8", 21)
                || isValidVerse(curFile, vs, "Dan-11.html#vs17", 28, 30, 32)
                || isValidVerse(curFile, vs, "Hos-11.html#vs9")
                || isValidVerse(curFile, vs, "Joel-2.html#vs11");
    } // isTenUitvoerBrengen

    public static boolean isTerDoodBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter dood brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-21.html#vs29")
                || isValidVerse(curFile, vs, "Lev-20.html#vs4", 11, 12, 13, 16, 27)
                || isValidVerse(curFile, vs, "Lev-24.html#vs16", 21)
                || isValidVerse(curFile, vs, "Num-01.html#vs51")
                || isValidVerse(curFile, vs, "Num-03.html#vs10", 38)
                || isValidVerse(curFile, vs, "Num-18.html#vs7")
                || isValidVerse(curFile, vs, "Deut-13.html#vs9")
                || isValidVerse(curFile, vs, "Deut-24.html#vs16")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs30")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs24", 26)
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs2")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs7", 14)
                || isValidVerse(curFile, vs, "2Chr-25.html#vs4")
                || isValidVerse(curFile, vs, "Jer-26.html#vs19", 21, 24)
                || isValidVerse(curFile, vs, "Jer-38.html#vs4", 15, 16, 25)
                || isValidVerse(curFile, vs, "Jer-41.html#vs2", 4, 8)
                || isValidVerse(curFile, vs, "Jer-43.html#vs3")
                || isValidVerse(curFile, vs, "Dan-02.html#vs13", 14)
                || isValidVerse(curFile, vs, "Luke-23.html#vs32")
                || isValidVerse(curFile, vs, "Heb-11.html#vs37")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs18");
    } // isTerDoodBrengen

    public static boolean isTerechtbrengen() {
        return false;
    } // isTerechtbrengen

    public static boolean isTerugbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-14.html#vs16")
                || isValidVerse(curFile, vs, "Gen-24.html#vs5", 8)
                || isValidVerse(curFile, vs, "Gen-37.html#vs22")
                || isValidVerse(curFile, vs, "Num-17.html#vs10")
                || isValidVerse(curFile, vs, "Deut-33.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-30.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs20", 25, 29)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs40")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs34")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs29")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs13")
                || isValidVerse(curFile, vs, "Job-33.html#vs30")
                || isValidVerse(curFile, vs, "Ps-068.html#vs23")
                || isValidVerse(curFile, vs, "Ps-080.html#vs4", 8, 20)
                || isValidVerse(curFile, vs, "Ps-085.html#vs5")
                || isValidVerse(curFile, vs, "Isa-49.html#vs5", 6)
                || isValidVerse(curFile, vs, "Jer-28.html#vs3", 4, 6)
                || isValidVerse(curFile, vs, "Jer-29.html#vs10")
                || isValidVerse(curFile, vs, "Jer-37.html#vs20")
                || isValidVerse(curFile, vs, "Jer-42.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-47.html#vs1", 6)
                || isValidVerse(curFile, vs, "Jonah-1.html#vs13")
                || isValidVerse(curFile, vs, "Matt-27.html#vs3");
    } // isTerugbrengen

    public static boolean isTeweegbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-23.html#vs10", 12)
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs27")
                || isValidVerse(curFile, vs, "Ps-104.html#vs20")
                || isValidVerse(curFile, vs, "Prov-06.html#vs14")
                || isValidVerse(curFile, vs, "Prov-16.html#vs28")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs2")
                || isValidVerse(curFile, vs, "Isa-28.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs25", 26, 27)
                || isValidVerse(curFile, vs, "Rom-04.html#vs15")
                || isValidVerse(curFile, vs, "Rom-07.html#vs20")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs17")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs10")
                || isValidVerse(curFile, vs, "Jas-1.html#vs20");
    } // isTeweegbrengen

    public static boolean isToebrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs33")
                || isValidVerse(curFile, vs, "Josh-10.html#vs10", 20)
                || isValidVerse(curFile, vs, "1Sam-19.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs17")
                || isValidVerse(curFile, vs, "Rev-06.html#vs6")
                || isValidVerse(curFile, vs, "Rev-07.html#vs2", 3)
                || isValidVerse(curFile, vs, "Rev-09.html#vs10", 19);
    } // isToebrengen

    public static boolean isTotStandBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot stand brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-34.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs36")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs4", 11)
                || isValidVerse(curFile, vs, "Jer-23.html#vs20")
                || isValidVerse(curFile, vs, "Jer-30.html#vs24")
                || isValidVerse(curFile, vs, "Dan-09.html#vs24")
                || isValidVerse(curFile, vs, "Hab-1.html#vs5")
                || isValidVerse(curFile, vs, "Matt-21.html#vs16")
                || isValidVerse(curFile, vs, "Luke-01.html#vs68")
                || isValidVerse(curFile, vs, "Rom-10.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs6")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs16")
                || isValidVerse(curFile, vs, "Heb-01.html#vs3")
                || isValidVerse(curFile, vs, "Heb-11.html#vs3")
                || isValidVerse(curFile, vs, "Jas-5.html#vs16");
    } // isTotStandBrengen

    public static boolean isTotZwijgenBrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot zwijgen brengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-17.html#vs5")
                || isValidVerse(curFile, vs, "Job-11.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs10");
    } // isTotZwijgenBrengen

    public static boolean isUitbrengen(final File curFile, final String vs) {
        return isVerslagUitbrengen(curFile, vs, "verslag")
                || isValidVerse(curFile, vs, "Jude-1.html#vs9");
    } // isUitbrengen

    public static boolean isVerslagUitbrengen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("verslag uitbrengen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-37.html#vs14")
                || isValidVerse(curFile, vs, "Num-13.html#vs26")
                || isValidVerse(curFile, vs, "Num-22.html#vs8")
                || isValidVerse(curFile, vs, "Deut-01.html#vs22", 25)
                || isValidVerse(curFile, vs, "Josh-22.html#vs32")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs30")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-22.html#vs9", 20)
                || isValidVerse(curFile, vs, "2Chr-34.html#vs16", 28)
                || isValidVerse(curFile, vs, "Ezek-09.html#vs11");
    } // isVerslagUitbrengen

    public static boolean isVolbrengen() {
        return false;
    } // isVolbrengen

    public static boolean isVoortbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs12")
                || isValidVerse(curFile, vs, "Gen-40.html#vs10")
                || isValidVerse(curFile, vs, "Exod-08.html#vs18")
                || isValidVerse(curFile, vs, "Num-17.html#vs8")
                || isValidVerse(curFile, vs, "Job-15.html#vs35")
                || isValidVerse(curFile, vs, "Job-38.html#vs28")
                || isValidVerse(curFile, vs, "Job-40.html#vs15")
                || isValidVerse(curFile, vs, "Ps-045.html#vs2")
                || isValidVerse(curFile, vs, "Ps-078.html#vs16")
                || isValidVerse(curFile, vs, "Ps-104.html#vs14")
                || isValidVerse(curFile, vs, "Prov-12.html#vs12")
                || isValidVerse(curFile, vs, "Prov-25.html#vs23")
                || isValidVerse(curFile, vs, "Prov-30.html#vs33")
                || isValidVerse(curFile, vs, "Song-2.html#vs13")
                || isValidVerse(curFile, vs, "Isa-05.html#vs2")
                || isValidVerse(curFile, vs, "Hos-10.html#vs1")
                || isValidVerse(curFile, vs, "Matt-03.html#vs8")
                || isValidVerse(curFile, vs, "Matt-07.html#vs17")
                || isValidVerse(curFile, vs, "Matt-12.html#vs35")
                || isValidVerse(curFile, vs, "Mark-04.html#vs28")
                || isValidVerse(curFile, vs, "Luke-03.html#vs8")
                || isValidVerse(curFile, vs, "Luke-06.html#vs45")
                || isValidVerse(curFile, vs, "Luke-08.html#vs8")
                || isValidVerse(curFile, vs, "Jas-5.html#vs18");
    } // isVoortbrengen

    public static boolean isWegbrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-15.html#vs36")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs34")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs23")
                || isValidVerse(curFile, vs, "Mark-15.html#vs1")
                || isValidVerse(curFile, vs, "Rev-17.html#vs3");
    } // isWegbrengen

    public static boolean isBrengen(final File curFile, final String vs, final String arg) {
        return !isAanHetLichtBrengen(curFile, vs, arg)
                && !isAanbrengen(curFile, vs)
                && !isAfbrengen(curFile, vs)
                && !isBijElkaarBrengen(curFile, vs, arg)
                && !isBijbrengen(curFile, vs)
                && !isBijeenbrengen(curFile, vs)
                && !isBinnenbrengen(curFile, vs)
                && !isDoorbrengen(curFile, vs)
                && !isGrootbrengen(curFile, vs)
                && !isInVerwarringBrengen(curFile, vs, arg)
                && !isMeebrengen(curFile, vs)
                && !isOmHetLevenBrengen(curFile, vs, arg)
                && !isOmbrengen(curFile, vs)
                && !isOmkeerBrengen(curFile, vs, arg)
                && !isOnderbrengen(curFile, vs)
                && !isOpbrengen(curFile, vs)
                && !isOverbrengen(curFile, vs)
                && !isTenUitvoerBrengen(curFile, vs, arg)
                && !isTerDoodBrengen(curFile, vs, arg)
                && !isTerechtbrengen()
                && !isTerugbrengen(curFile, vs)
                && !isTeweegbrengen(curFile, vs)
                && !isToebrengen(curFile, vs)
                && !isTotStandBrengen(curFile, vs, arg)
                && !isTotZwijgenBrengen(curFile, vs, arg)
                && !isUitbrengen(curFile, vs)
                && !isVerslagUitbrengen(curFile, vs, arg)
                && !isVolbrengen()
                && !isVoortbrengen(curFile, vs)
                && !isWegbrengen(curFile, vs);
    } // isBrengen
}
