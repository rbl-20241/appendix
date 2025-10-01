package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSlaan {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afslaan" -> isAfslaan();
            case "alarm slaan" -> isAlarmSlaan(curFile, vs);
            case "bres slaan" -> isBresSlaan(curFile, vs);
            case "doodslaan" -> isDoodslaan(curFile, vs);
            case "gadeslaan" -> isGadeslaan(curFile, vs);
            case "hand slaan aan" -> isHandSlaanAan(curFile, vs, arg);
            case "in stukken slaan" -> isInStukkenSlaan(curFile, vs, arg);
            case "kamp opslaan" -> isKampOpslaan(curFile, vs);
            case "losslaan" -> isLosslaan();
            case "met de ban slaan" -> isMetDeBanSlaan(curFile, vs, arg);
            case "neerslaan" -> isNeerslaan(curFile, vs);
            case "oog opslaan" -> isOogOpslaan(curFile, vs);
            case "openslaan" -> isOpenslaan(curFile, vs);
            case "opslaan" -> isOpslaan(curFile, vs);
            case "overslaan" -> isOverslaan();
            case "platslaan" -> isPlatslaan();
            case "stukslaan" -> isStukslaan(curFile, vs);
            case "toeslaan" -> isToeslaan(curFile, vs);
            case "slaan" -> isSlaan(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAfslaan() {
        return false;
    } // isAfslaan

    public static boolean isAlarmSlaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-13.html#vs12", 15)
                || isValidVerse(curFile, vs, "Isa-15.html#vs4")
                || isValidVerse(curFile, vs, "Hos-05.html#vs8")
                || isValidVerse(curFile, vs, "Joel-2.html#vs1")
                || isValidVerse(curFile, vs, "Mic-4.html#vs9");
    } // isAlarmSlaan

    public static boolean isBresSlaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs29")
                || isValidVerse(curFile, vs, "Judg-21.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs5")
                || isValidVerse(curFile, vs, "Neh-01.html#vs3")
                || isValidVerse(curFile, vs, "Neh-02.html#vs13")
                || isValidVerse(curFile, vs, "Ps-080.html#vs13")
                || isValidVerse(curFile, vs, "Ps-089.html#vs41")
                || isValidVerse(curFile, vs, "Isa-05.html#vs5");
    } // isBresSlaan

    public static boolean isDoodslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-02.html#vs12")
                || isValidVerse(curFile, vs, "Judg-14.html#vs19")
                || isValidVerse(curFile, vs, "Judg-15.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs25")
                || isValidVerse(curFile, vs, "Jer-41.html#vs2")
                || isValidVerse(curFile, vs, "Luke-19.html#vs27")
                || isValidVerse(curFile, vs, "Acts-07.html#vs24")
                || isValidVerse(curFile, vs, "1John-3.html#vs12");
    } // isDoodslaan

    public static boolean isGadeslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs21")
                || isValidVerse(curFile, vs, "Prov-15.html#vs3");
    } // isGadeSlaan

    public static boolean isHandSlaanAan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("hand slaan aan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-37.html#vs22", 27)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs9", 11)
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs15")
                || isValidVerse(curFile, vs, "Neh-13.html#vs21")
                || isValidVerse(curFile, vs, "Esth-02.html#vs21")
                || isValidVerse(curFile, vs, "Esth-03.html#vs6")
                || isValidVerse(curFile, vs, "Esth-06.html#vs2")
                || isValidVerse(curFile, vs, "Esth-08.html#vs7")
                || isValidVerse(curFile, vs, "Esth-09.html#vs2")
                || isValidVerse(curFile, vs, "Job-28.html#vs9")
                || isValidVerse(curFile, vs, "Ps-055.html#vs21")
                || isValidVerse(curFile, vs, "Matt-26.html#vs50")
                || isValidVerse(curFile, vs, "Mark-14.html#vs46")
                || isValidVerse(curFile, vs, "Luke-09.html#vs62")
                || isValidVerse(curFile, vs, "Luke-20.html#vs19")
                || isValidVerse(curFile, vs, "Luke-21.html#vs12")
                || isValidVerse(curFile, vs, "John-07.html#vs30", 44)
                || isValidVerse(curFile, vs, "Acts-04.html#vs3")
                || isValidVerse(curFile, vs, "Acts-05.html#vs18")
                || isValidVerse(curFile, vs, "Acts-12.html#vs1")
                || isValidVerse(curFile, vs, "Acts-18.html#vs10")
                || isValidVerse(curFile, vs, "Acts-21.html#vs27");
    } // isHandSlaanAan

    public static boolean isInStukkenSlaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in stukken slaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-23.html#vs24")
                || isValidVerse(curFile, vs, "Exod-32.html#vs19")
                || isValidVerse(curFile, vs, "Exod-34.html#vs13")
                || isValidVerse(curFile, vs, "Deut-07.html#vs5")
                || isValidVerse(curFile, vs, "Deut-12.html#vs3")
                || isValidVerse(curFile, vs, "Judg-07.html#vs19")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs4")
                || isValidVerse(curFile, vs, "Ps-002.html#vs9")
                || isValidVerse(curFile, vs, "Ps-046.html#vs10")
                || isValidVerse(curFile, vs, "Ps-074.html#vs6");
    } // isStukkenSlaan

    public static boolean isKampOpslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-26.html#vs17")
                || isValidVerse(curFile, vs, "Exod-13.html#vs20")
                || isValidVerse(curFile, vs, "Exod-14.html#vs2", 9)
                || isValidVerse(curFile, vs, "Exod-15.html#vs27")
                || isValidVerse(curFile, vs, "Exod-17.html#vs1")
                || isValidVerse(curFile, vs, "Exod-18.html#vs5")
                || isValidVerse(curFile, vs, "Exod-19.html#vs2")
                || isValidVerse(curFile, vs, "Num-01.html#vs50", 52, 53)
                || isValidVerse(curFile, vs, "Num-02.html#vs2", 3, 5, 12, 17, 18, 20, 25, 27, 34)
                || isValidVerse(curFile, vs, "Num-03.html#vs23", 29, 35, 38)
                || isValidVerse(curFile, vs, "Num-09.html#vs17", 18, 23)
                || isValidVerse(curFile, vs, "Num-10.html#vs5", 6, 31)
                || isValidVerse(curFile, vs, "Num-12.html#vs16")
                || isValidVerse(curFile, vs, "Num-21.html#vs10", 11, 12, 13)
                || isValidVerse(curFile, vs, "Num-22.html#vs1")
                || isValidVerse(curFile, vs, "Num-31.html#vs19", 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                || isValidVerse(curFile, vs, "Num-33.html#vs5", 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                || isValidVerse(curFile, vs, "Num-33.html#vs21", 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34)
                || isValidVerse(curFile, vs, "Num-33.html#vs35", 36, 37, 41, 42, 43, 44, 45, 46, 47, 48, 49)
                || isValidVerse(curFile, vs, "Josh-04.html#vs19")
                || isValidVerse(curFile, vs, "Josh-05.html#vs10")
                || isValidVerse(curFile, vs, "Josh-08.html#vs11")
                || isValidVerse(curFile, vs, "Josh-10.html#vs5")
                || isValidVerse(curFile, vs, "Josh-11.html#vs5")
                || isValidVerse(curFile, vs, "Judg-06.html#vs4", 33)
                || isValidVerse(curFile, vs, "Judg-07.html#vs1")
                || isValidVerse(curFile, vs, "Judg-09.html#vs50")
                || isValidVerse(curFile, vs, "Judg-10.html#vs17")
                || isValidVerse(curFile, vs, "Judg-11.html#vs18", 20)
                || isValidVerse(curFile, vs, "Judg-15.html#vs9")
                || isValidVerse(curFile, vs, "Judg-18.html#vs12")
                || isValidVerse(curFile, vs, "Judg-20.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs5", 16)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs1", 2)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs3", 5)
                || isValidVerse(curFile, vs, "1Sam-28.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-17.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs5")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs27")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs15");
    } // isKampOpslaan

    public static boolean isLosslaan() {
        return IS_NOT_FOUND;
    } // isLosslaan

    public static boolean isMetDeBanSlaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("met de ban slaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-22.html#vs20")
                || isValidVerse(curFile, vs, "Num-21.html#vs2", 3)
                || isValidVerse(curFile, vs, "Deut-02.html#vs34")
                || isValidVerse(curFile, vs, "Deut-03.html#vs6")
                || isValidVerse(curFile, vs, "Deut-07.html#vs2")
                || isValidVerse(curFile, vs, "Deut-13.html#vs15")
                || isValidVerse(curFile, vs, "Deut-20.html#vs17")
                || isValidVerse(curFile, vs, "Josh-02.html#vs10")
                || isValidVerse(curFile, vs, "Josh-06.html#vs18", 21)
                || isValidVerse(curFile, vs, "Josh-08.html#vs26")
                || isValidVerse(curFile, vs, "Josh-10.html#vs1", 28, 35, 37, 39, 40)
                || isValidVerse(curFile, vs, "Josh-11.html#vs11", 12, 20, 21)
                || isValidVerse(curFile, vs, "Judg-01.html#vs17")
                || isValidVerse(curFile, vs, "Judg-21.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs3", 8, 9, 15, 18, 20)
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs42")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs11")
                || isValidVerse(curFile, vs, "1Chr-04.html#vs41")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs14")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs8")
                || isValidVerse(curFile, vs, "Isa-11.html#vs15")
                || isValidVerse(curFile, vs, "Isa-34.html#vs2", 5)
                || isValidVerse(curFile, vs, "Isa-37.html#vs11")
                || isValidVerse(curFile, vs, "Jer-25.html#vs9")
                || isValidVerse(curFile, vs, "Jer-50.html#vs21", 26)
                || isValidVerse(curFile, vs, "Jer-51.html#vs3")
                || isValidVerse(curFile, vs, "Dan-11.html#vs44")
                || isValidVerse(curFile, vs, "Mic-4.html#vs13")
                || isValidVerse(curFile, vs, "Mal-4.html#vs6");
    } // isMetDeBanSlaan

    public static boolean isNeerslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs25")
                || isValidVerse(curFile, vs, "Josh-10.html#vs26")
                || isValidVerse(curFile, vs, "Judg-20.html#vs42")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs35")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs16", 17)
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs10")
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs20", 21)
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs10", 25, 30)
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs15")
                || isValidVerse(curFile, vs, "Job-34.html#vs26")
                || isValidVerse(curFile, vs, "Isa-37.html#vs36")
                || isValidVerse(curFile, vs, "Isa-66.html#vs3");
    } // isNeerslaan

    public static boolean isOogOpslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs10", 14)
                || isValidVerse(curFile, vs, "Gen-18.html#vs2")
                || isValidVerse(curFile, vs, "Gen-22.html#vs4", 13)
                || isValidVerse(curFile, vs, "Gen-24.html#vs63", 64)
                || isValidVerse(curFile, vs, "Gen-31.html#vs10", 12)
                || isValidVerse(curFile, vs, "Gen-33.html#vs1", 5)
                || isValidVerse(curFile, vs, "Gen-37.html#vs25")
                || isValidVerse(curFile, vs, "Gen-43.html#vs29")
                || isValidVerse(curFile, vs, "Gen-44.html#vs21")
                || isValidVerse(curFile, vs, "Exod-14.html#vs10")
                || isValidVerse(curFile, vs, "Num-24.html#vs2")
                || isValidVerse(curFile, vs, "Deut-03.html#vs27")
                || isValidVerse(curFile, vs, "Deut-04.html#vs19")
                || isValidVerse(curFile, vs, "Josh-05.html#vs13")
                || isValidVerse(curFile, vs, "Judg-19.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs24")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs16")
                || isValidVerse(curFile, vs, "Job-02.html#vs12")
                || isValidVerse(curFile, vs, "Ps-121.html#vs1")
                || isValidVerse(curFile, vs, "Ps-123.html#vs1")
                || isValidVerse(curFile, vs, "Isa-38.html#vs14")
                || isValidVerse(curFile, vs, "Isa-40.html#vs26")
                || isValidVerse(curFile, vs, "Isa-49.html#vs18")
                || isValidVerse(curFile, vs, "Isa-51.html#vs6")
                || isValidVerse(curFile, vs, "Isa-60.html#vs4")
                || isValidVerse(curFile, vs, "Jer-03.html#vs2")
                || isValidVerse(curFile, vs, "Jer-13.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-08.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs6", 12, 15)
                || isValidVerse(curFile, vs, "Ezek-23.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs25")
                || isValidVerse(curFile, vs, "Dan-04.html#vs34")
                || isValidVerse(curFile, vs, "Dan-08.html#vs3")
                || isValidVerse(curFile, vs, "Dan-10.html#vs5")
                || isValidVerse(curFile, vs, "Zech-01.html#vs18")
                || isValidVerse(curFile, vs, "Zech-02.html#vs1")
                || isValidVerse(curFile, vs, "Zech-05.html#vs1", 5, 9)
                || isValidVerse(curFile, vs, "Zech-06.html#vs1")
                || isValidVerse(curFile, vs, "Matt-17.html#vs8")
                || isValidVerse(curFile, vs, "Luke-06.html#vs20")
                || isValidVerse(curFile, vs, "Luke-16.html#vs23")
                || isValidVerse(curFile, vs, "John-04.html#vs35")
                || isValidVerse(curFile, vs, "John-06.html#vs5")
                || isValidVerse(curFile, vs, "John-17.html#vs1");
    } // isOgenOpslaan

    public static boolean isOpenslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-57.html#vs8");
    } // isOpenslaan

    public static boolean isOpslaan(final File curFile, final String vs) {
        return isOogOpslaan(curFile, vs)
                || isKampOpslaan(curFile, vs)
                || isValidVerse(curFile, vs, "Gen-41.html#vs48", 49)
                || isValidVerse(curFile, vs, "Luke-12.html#vs17");
    } // isOpslaan

    public static boolean isOverslaan() {
        return IS_NOT_FOUND;
    } // isOverslaan

    public static boolean isPlatslaan() {
        return IS_NOT_FOUND;
    } // isPlatslaan

    public static boolean isStukslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-15.html#vs8")
                || isValidVerse(curFile, vs, "Dan-12.html#vs7");
    } // isStukslaan

    public static boolean isToeslaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-09.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs28");
    } // isToeslaan

    public static boolean isSlaan(final File curFile, final String vs, final String arg) {
        return !isAfslaan()
                && !isAlarmSlaan(curFile, vs)
                && !isBresSlaan(curFile, vs)
                && !isDoodslaan(curFile, vs)
                && !isGadeslaan(curFile, vs)
                && !isHandSlaanAan(curFile, vs, arg)
                && !isInStukkenSlaan(curFile, vs, arg)
                && !isKampOpslaan(curFile, vs)
                && !isLosslaan()
                && !isMetDeBanSlaan(curFile, vs, arg)
                && !isNeerslaan(curFile, vs)
                && !isOogOpslaan(curFile, vs)
                && !isOpenslaan(curFile, vs)
                && !isOpslaan(curFile, vs)
                && !isOverslaan()
                && !isPlatslaan()
                && !isStukslaan(curFile, vs)
                && !isToeslaan(curFile, vs);
    } // isSlaan
}
