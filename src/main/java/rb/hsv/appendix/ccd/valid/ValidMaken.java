package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidTeSchande.isTeSchandeMaken;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMaken {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bekendmaken" -> isBekendmaken(curFile, vs);
            case "bekwaam maken" -> isBekwaamMaken(curFile, vs);
            case "beschaamd maken" -> isBeschaamdMaken(curFile, vs);
            case "duidelijk maken" -> isDuidelijkMaken(curFile, vs);
            case "einde maken aan" -> isEindeMakenAan(curFile, vs);
            case "gebruikmaken" -> isGebruikmaken(curFile, vs);
            case "gelijkmaken" -> isGelijkmaken(curFile, vs);
            case "gereedmaken" -> isGereedmaken(curFile, vs);
            case "gezond maken" -> isGezondMaken(curFile, vs);
            case "goedmaken" -> isGoedmaken(curFile, vs);
            case "grootmaken" -> isGrootmaken(curFile, vs);
            case "haast maken" -> isHaastMaken(curFile, vs);
            case "klaarmaken" -> isKlaarmaken(curFile, vs);
            case "leegmaken" -> isLeegmaken(curFile, vs);
            case "levend maken" -> isLevendMaken(curFile, vs);
            case "losmaken" -> isLosmaken(curFile, vs);
            case "met de grond gelijkmaken" -> isMetDeGrondGelijkmaken(curFile, vs, arg);
            case "naam maken" -> isNaamMaken(curFile, vs);
            case "natmaken" -> isNatmaken(curFile, vs);
            case "onderscheid maken" -> isOnderscheidMaken(curFile, vs);
            case "openbaar maken" -> isOpenbaarMaken(curFile, vs);
            case "opmaken" -> isOpmaken(curFile, vs);
            case "overvloedig maken" -> isOvervloedigMaken(curFile, vs);
            case "plaatsmaken" -> isPlaatsmaken(curFile, vs);
            case "rechtmaken" -> isRechtmaken(curFile, vs);
            case "ruzie maken" -> isRuzieMaken(curFile, vs);
            case "sterk maken" -> isSterkMaken(curFile, vs);
            case "te gelde maken" -> isTeGeldeMaken(curFile, vs, arg);
            case "tot leugenaar maken" -> isTotLeugenaarMaken(curFile, vs, arg);
            case "tot slaaf maken" -> isTotSlaafMaken(curFile, vs, arg);
            case "tot zonde maken" -> isTotZondeMaken(curFile, vs, arg);
            case "vastmaken" -> isVastmaken(curFile, vs);
            case "volkomen maken" -> isVolkomenMaken(curFile, vs);
            case "vrijmaken" -> isVrijmaken();
            case "zalig maken" -> isZaligMaken(curFile, vs);
            case "maken" -> isMaken(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isBekendmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs1")
                || isValidVerse(curFile, vs, "Exod-18.html#vs16")
                || isValidVerse(curFile, vs, "Exod-19.html#vs9")
                || isValidVerse(curFile, vs, "Exod-33.html#vs13")
                || isValidVerse(curFile, vs, "Lev-23.html#vs44")
                || isValidVerse(curFile, vs, "Num-12.html#vs6")
                || isValidVerse(curFile, vs, "Deut-04.html#vs13")
                || isValidVerse(curFile, vs, "Deut-05.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-03.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs9", 10)
                || isValidVerse(curFile, vs, "1Sam-11.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs18")
                || isValidVerse(curFile, vs, "Neh-08.html#vs13")
                || isValidVerse(curFile, vs, "Job-11.html#vs6")
                || isValidVerse(curFile, vs, "Job-13.html#vs23")
                || isValidVerse(curFile, vs, "Job-33.html#vs23")
                || isValidVerse(curFile, vs, "Job-36.html#vs9")
                || isValidVerse(curFile, vs, "Job-37.html#vs19")
                || isValidVerse(curFile, vs, "Job-38.html#vs3", 4, 18)
                || isValidVerse(curFile, vs, "Job-40.html#vs2")
                || isValidVerse(curFile, vs, "Job-42.html#vs4")
                || isValidVerse(curFile, vs, "Ps-016.html#vs11")
                || isValidVerse(curFile, vs, "Ps-025.html#vs4", 14)
                || isValidVerse(curFile, vs, "Ps-032.html#vs5")
                || isValidVerse(curFile, vs, "Ps-038.html#vs19")
                || isValidVerse(curFile, vs, "Ps-039.html#vs5")
                || isValidVerse(curFile, vs, "Ps-051.html#vs8")
                || isValidVerse(curFile, vs, "Ps-078.html#vs5")
                || isValidVerse(curFile, vs, "Ps-105.html#vs1")
                || isValidVerse(curFile, vs, "Ps-106.html#vs8")
                || isValidVerse(curFile, vs, "Ps-142.html#vs3")
                || isValidVerse(curFile, vs, "Ps-143.html#vs8")
                || isValidVerse(curFile, vs, "Ps-145.html#vs12")
                || isValidVerse(curFile, vs, "Ps-147.html#vs19")
                || isValidVerse(curFile, vs, "Prov-12.html#vs17")
                || isValidVerse(curFile, vs, "Prov-22.html#vs19", 21)
                || isValidVerse(curFile, vs, "Prov-29.html#vs24")
                || isValidVerse(curFile, vs, "Eccl-10.html#vs20")
                || isValidVerse(curFile, vs, "Song-1.html#vs7")
                || isValidVerse(curFile, vs, "Isa-03.html#vs9")
                || isValidVerse(curFile, vs, "Isa-12.html#vs4")
                || isValidVerse(curFile, vs, "Isa-41.html#vs22", 23)
                || isValidVerse(curFile, vs, "Isa-45.html#vs21")
                || isValidVerse(curFile, vs, "Isa-64.html#vs2")
                || isValidVerse(curFile, vs, "Jer-04.html#vs5")
                || isValidVerse(curFile, vs, "Jer-05.html#vs20")
                || isValidVerse(curFile, vs, "Jer-20.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs19")
                || isValidVerse(curFile, vs, "Jer-36.html#vs13", 17, 20)
                || isValidVerse(curFile, vs, "Jer-38.html#vs25", 27)
                || isValidVerse(curFile, vs, "Jer-42.html#vs4", 20)
                || isValidVerse(curFile, vs, "Jer-48.html#vs20")
                || isValidVerse(curFile, vs, "Jer-51.html#vs31")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs4", 5, 11)
                || isValidVerse(curFile, vs, "Ezek-23.html#vs36")
                || isValidVerse(curFile, vs, "Ezek-40.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs11")
                || isValidVerse(curFile, vs, "Dan-02.html#vs2")
                || isValidVerse(curFile, vs, "Hos-05.html#vs9")
                || isValidVerse(curFile, vs, "Mic-1.html#vs10")
                || isValidVerse(curFile, vs, "Hab-3.html#vs2")
                || isValidVerse(curFile, vs, "Matt-09.html#vs31")
                || isValidVerse(curFile, vs, "Matt-12.html#vs16")
                || isValidVerse(curFile, vs, "Matt-28.html#vs9")
                || isValidVerse(curFile, vs, "Mark-01.html#vs45")
                || isValidVerse(curFile, vs, "Mark-03.html#vs12")
                || isValidVerse(curFile, vs, "Luke-02.html#vs17")
                || isValidVerse(curFile, vs, "Acts-21.html#vs26")
                || isValidVerse(curFile, vs, "Rom-09.html#vs23")
                || isValidVerse(curFile, vs, "1Cor-12.html#vs3")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-08.html#vs1")
                || isValidVerse(curFile, vs, "Gal-1.html#vs11")
                || isValidVerse(curFile, vs, "Eph-6.html#vs19")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs14")
                || isValidVerse(curFile, vs, "Didache-09.html#vs2", 3);
    } // isBekendmaken

    public static boolean isBekwaamMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-03.html#vs6")
                || isValidVerse(curFile, vs, "Col-1.html#vs12");
    } // isBekwaamMaken

    public static boolean isBeschaamdMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-11.html#vs3")
                || isValidVerse(curFile, vs, "Ps-044.html#vs8")
                || isValidVerse(curFile, vs, "Prov-10.html#vs5")
                || isValidVerse(curFile, vs, "Prov-12.html#vs4")
                || isValidVerse(curFile, vs, "Prov-14.html#vs35")
                || isValidVerse(curFile, vs, "Prov-17.html#vs2")
                || isValidVerse(curFile, vs, "Prov-19.html#vs26")
                || isValidVerse(curFile, vs, "Prov-29.html#vs15")
                || isValidVerse(curFile, vs, "Zech-10.html#vs5")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs16")
                || isValidVerse(curFile, vs, "1John-2.html#vs28");
    } // isBeschaamdMaken

    public static boolean isDuidelijkMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-22.html#vs26")
                || isValidVerse(curFile, vs, "1Cor-03.html#vs13")
                || isValidVerse(curFile, vs, "Heb-09.html#vs8")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs14");
    } // isDuidelijkMaken

    public static boolean isEindeMakenAan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-17.html#vs10")
                || isValidVerse(curFile, vs, "Job-06.html#vs9")
                || isValidVerse(curFile, vs, "Job-18.html#vs2")
                || isValidVerse(curFile, vs, "Isa-38.html#vs12", 13)
                || isValidVerse(curFile, vs, "Jer-04.html#vs27")
                || isValidVerse(curFile, vs, "Jer-05.html#vs10", 18)
                || isValidVerse(curFile, vs, "Jer-09.html#vs16")
                || isValidVerse(curFile, vs, "Jer-10.html#vs25")
                || isValidVerse(curFile, vs, "Jer-14.html#vs12")
                || isValidVerse(curFile, vs, "Jer-30.html#vs11")
                || isValidVerse(curFile, vs, "Jer-46.html#vs28")
                || isValidVerse(curFile, vs, "Jer-49.html#vs37")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs13", 17)
                || isValidVerse(curFile, vs, "Ezek-22.html#vs15", 31)
                || isValidVerse(curFile, vs, "Dan-05.html#vs26")
                || isValidVerse(curFile, vs, "Dan-11.html#vs18")
                || isValidVerse(curFile, vs, "Dan-12.html#vs6")
                || isValidVerse(curFile, vs, "Nah-1.html#vs8", 9)
                || isValidVerse(curFile, vs, "Nah-3.html#vs9")
                || isValidVerse(curFile, vs, "Zeph-1.html#vs18");
    } // isEindeMakenAan

    public static boolean isGebruikmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-27.html#vs17")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs21")
                || isValidVerse(curFile, vs, "1Cor-09.html#vs12", 15, 18);
    } // isGebruikmaken

    public static boolean isGelijkmaken(final File curFile, final String vs) {
        return isMetDeGrondGelijkmaken(curFile, vs, "met de grond")
                || isValidVerse(curFile, vs, "John-05.html#vs18");
    } // isGelijkmaken

    public static boolean isGereedmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-43.html#vs25")
                || isValidVerse(curFile, vs, "Josh-18.html#vs8")
                || isValidVerse(curFile, vs, "Josh-24.html#vs9")
                || isValidVerse(curFile, vs, "Judg-06.html#vs2")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs23", 31)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs9", 14)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs21", 22, 23)
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs26")
                || isValidVerse(curFile, vs, "1Chr-15.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs3",5)
                || isValidVerse(curFile, vs, "2Chr-02.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs4")
                || isValidVerse(curFile, vs, "Ps-023.html#vs5")
                || isValidVerse(curFile, vs, "Ps-059.html#vs5")
                || isValidVerse(curFile, vs, "Ps-068.html#vs11")
                || isValidVerse(curFile, vs, "Ps-078.html#vs19")
                || isValidVerse(curFile, vs, "Prov-06.html#vs8")
                || isValidVerse(curFile, vs, "Prov-24.html#vs27")
                || isValidVerse(curFile, vs, "Isa-14.html#vs21")
                || isValidVerse(curFile, vs, "Isa-21.html#vs5")
                || isValidVerse(curFile, vs, "Jer-46.html#vs3", 14)
                || isValidVerse(curFile, vs, "Jer-50.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs7")
                || isValidVerse(curFile, vs, "Amos-4.html#vs12")
                || isValidVerse(curFile, vs, "Matt-03.html#vs3")
                || isValidVerse(curFile, vs, "Matt-11.html#vs10")
                || isValidVerse(curFile, vs, "Matt-26.html#vs19")
                || isValidVerse(curFile, vs, "Mark-01.html#vs2", 3)
                || isValidVerse(curFile, vs, "Mark-14.html#vs15", 16)
                || isValidVerse(curFile, vs, "Luke-01.html#vs17", 76)
                || isValidVerse(curFile, vs, "Luke-03.html#vs4")
                || isValidVerse(curFile, vs, "Luke-07.html#vs27")
                || isValidVerse(curFile, vs, "Luke-22.html#vs8", 12, 13)
                || isValidVerse(curFile, vs, "Luke-23.html#vs56")
                || isValidVerse(curFile, vs, "John-14.html#vs2")
                || isValidVerse(curFile, vs, "Acts-21.html#vs15")
                || isValidVerse(curFile, vs, "Acts-23.html#vs23")
                || isValidVerse(curFile, vs, "Phlm-1.html#vs22");
    } // isGereedmaken

    public static boolean isGezondMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-02.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs5", 8)
                || isValidVerse(curFile, vs, "Isa-38.html#vs16")
                || isValidVerse(curFile, vs, "Mark-06.html#vs13")
                || isValidVerse(curFile, vs, "Luke-07.html#vs3")
                || isValidVerse(curFile, vs, "Luke-09.html#vs11")
                || isValidVerse(curFile, vs, "Luke-14.html#vs3")
                || isValidVerse(curFile, vs, "John-04.html#vs47")
                || isValidVerse(curFile, vs, "John-05.html#vs11", 15)
                || isValidVerse(curFile, vs, "John-07.html#vs23")
                || isValidVerse(curFile, vs, "Acts-09.html#vs34")
                || isValidVerse(curFile, vs, "Acts-28.html#vs8");
    } // isGezondMaken

    public static boolean isGoedmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-18.html#vs")
                || isValidVerse(curFile, vs, "Jer-26.html#vs13");
    } // isGoedmaken

    public static boolean isGrootmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-03.html#vs16")
                || isValidVerse(curFile, vs, "Gen-12.html#vs2")
                || isValidVerse(curFile, vs, "Gen-34.html#vs12")
                || isValidVerse(curFile, vs, "Num-26.html#vs54")
                || isValidVerse(curFile, vs, "Num-33.html#vs54")
                || isValidVerse(curFile, vs, "Josh-03.html#vs7")
                || isValidVerse(curFile, vs, "Josh-04.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs36")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs12", 25)
                || isValidVerse(curFile, vs, "Esth-03.html#vs1")
                || isValidVerse(curFile, vs, "Job-07.html#vs17")
                || isValidVerse(curFile, vs, "Job-12.html#vs23")
                || isValidVerse(curFile, vs, "Job-36.html#vs24")
                || isValidVerse(curFile, vs, "Ps-018.html#vs36")
                || isValidVerse(curFile, vs, "Ps-034.html#vs4")
                || isValidVerse(curFile, vs, "Ps-069.html#vs31")
                || isValidVerse(curFile, vs, "Ps-070.html#vs5")
                || isValidVerse(curFile, vs, "Ps-138.html#vs2")
                || isValidVerse(curFile, vs, "Isa-09.html#vs2")
                || isValidVerse(curFile, vs, "Isa-42.html#vs21")
                || isValidVerse(curFile, vs, "Isa-44.html#vs14")
                || isValidVerse(curFile, vs, "Jer-46.html#vs16")
                || isValidVerse(curFile, vs, "Jer-48.html#vs26", 42)
                || isValidVerse(curFile, vs, "Lam-1.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs9")
                || isValidVerse(curFile, vs, "Dan-08.html#vs4", 8, 11)
                || isValidVerse(curFile, vs, "Dan-11.html#vs36", 37)
                || isValidVerse(curFile, vs, "Matt-23.html#vs5")
                || isValidVerse(curFile, vs, "Luke-01.html#vs46")
                || isValidVerse(curFile, vs, "Acts-19.html#vs17");
    } // isGrootmaken

    public static boolean isHaastMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-45.html#vs9")
                || isValidVerse(curFile, vs, "Esth-05.html#vs5")
                || isValidVerse(curFile, vs, "Isa-05.html#vs19");
    } // isHaastMaken

    public static boolean isKlaarmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs4", 7, 14, 31)
                || isValidVerse(curFile, vs, "Josh-01.html#vs11")
                || isValidVerse(curFile, vs, "Judg-06.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs25", 26)
                || isValidVerse(curFile, vs, "1Chr-09.html#vs32");
    } // isKlaarmaken

    public static boolean isLeegmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-24.html#vs1");
    } // isLeegmaken

    public static boolean isLevendMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-32.html#vs39")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs7")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs1")
                || isValidVerse(curFile, vs, "Job-33.html#vs4")
                || isValidVerse(curFile, vs, "Ps-071.html#vs20")
                || isValidVerse(curFile, vs, "Ps-085.html#vs7")
                || isValidVerse(curFile, vs, "Ps-119.html#vs25", 37, 40, 50, 88, 93, 107, 149, 154, 156, 159)
                || isValidVerse(curFile, vs, "Ps-138.html#vs7")
                || isValidVerse(curFile, vs, "Ps-143.html#vs11")
                || isValidVerse(curFile, vs, "Isa-57.html#vs15")
                || isValidVerse(curFile, vs, "Hos-06.html#vs2")
                || isValidVerse(curFile, vs, "John-05.html#vs21")
                || isValidVerse(curFile, vs, "John-06.html#vs63")
                || isValidVerse(curFile, vs, "Rom-04.html#vs17")
                || isValidVerse(curFile, vs, "Rom-08.html#vs11")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs22")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs6")
                || isValidVerse(curFile, vs, "Gal-3.html#vs21")
                || isValidVerse(curFile, vs, "Eph-2.html#vs1", 5)
                || isValidVerse(curFile, vs, "Col-2.html#vs13")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs13")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs18");
    } // isLevendMaken

    public static boolean isLosmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-12.html#vs21")
                || isValidVerse(curFile, vs, "Ps-102.html#vs21")
                || isValidVerse(curFile, vs, "Ps-146.html#vs7")
                || isValidVerse(curFile, vs, "Isa-20.html#vs2")
                || isValidVerse(curFile, vs, "Isa-52.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs9")
                || isValidVerse(curFile, vs, "Matt-21.html#vs2")
                || isValidVerse(curFile, vs, "Mark-01.html#vs7")
                || isValidVerse(curFile, vs, "Mark-11.html#vs2", 4)
                || isValidVerse(curFile, vs, "Luke-03.html#vs16")
                || isValidVerse(curFile, vs, "Luke-13.html#vs15")
                || isValidVerse(curFile, vs, "Luke-19.html#vs30", 31, 33)
                || isValidVerse(curFile, vs, "John-01.html#vs27")
                || isValidVerse(curFile, vs, "John-11.html#vs44")
                || isValidVerse(curFile, vs, "Acts-07.html#vs33")
                || isValidVerse(curFile, vs, "Acts-13.html#vs25")
                || isValidVerse(curFile, vs, "Acts-22.html#vs30")
                || isValidVerse(curFile, vs, "Rev-09.html#vs14")
                || isValidVerse(curFile, vs, "Didache-16.html#vs1");
    } // isLosmaken

    public static boolean isMetDeGrondGelijkmaken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("met de grond gelijkmaken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-11.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs1")
                || isValidVerse(curFile, vs, "Luke-19.html#vs44");
    } // isMetDeGrondGelijkmaken

    public static boolean isNaamMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-11.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs9", 23)
                || isValidVerse(curFile, vs, "2Sam-08.html#vs13")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs8", 21)
                || isValidVerse(curFile, vs, "Neh-09.html#vs10")
                || isValidVerse(curFile, vs, "Isa-63.html#vs12", 14)
                || isValidVerse(curFile, vs, "Jer-32.html#vs20")
                || isValidVerse(curFile, vs, "Dan-09.html#vs15");
    } // isNaamMaken

    public static boolean isNatmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-006.html#vs7")
                || isValidVerse(curFile, vs, "Luke-07.html#vs38", 44);
    } // isNatmaken

    public static boolean isOnderscheidMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs4")
                || isValidVerse(curFile, vs, "Exod-11.html#vs7")
                || isValidVerse(curFile, vs, "Lev-10.html#vs10")
                || isValidVerse(curFile, vs, "Lev-11.html#vs47")
                || isValidVerse(curFile, vs, "Lev-20.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs9")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-42.html#vs20")
                || isValidVerse(curFile, vs, "Acts-15.html#vs9")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs7")
                || isValidVerse(curFile, vs, "Jas-2.html#vs4");
    } // isOnderscheidMaken

    public static boolean isOpenbaarMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-03.html#vs14")
                || isValidVerse(curFile, vs, "Esth-08.html#vs13")
                || isValidVerse(curFile, vs, "Prov-25.html#vs9")
                || isValidVerse(curFile, vs, "John-07.html#vs4")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-02.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs2")
                || isValidVerse(curFile, vs, "Eph-5.html#vs13")
                || isValidVerse(curFile, vs, "Heb-09.html#vs8");
    } // isOpenbaarMaken

    public static boolean isOpmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-09.html#vs34");
    } // isOpmaken

    public static boolean isOvervloedigMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-10.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-01.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-35.html#vs13")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs8")
                || isValidVerse(curFile, vs, "1Thess-3.html#vs12");
    } // isOvervloedigMaken

    public static boolean isPlaatsmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-49.html#vs20");
    } // isPlaatsmaken

    public static boolean isRechtmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-005.html#vs9")
                || isValidVerse(curFile, vs, "Prov-11.html#vs5")
                || isValidVerse(curFile, vs, "Isa-40.html#vs3")
                || isValidVerse(curFile, vs, "Matt-03.html#vs3")
                || isValidVerse(curFile, vs, "Mark-01.html#vs3")
                || isValidVerse(curFile, vs, "Luke-03.html#vs4")
                || isValidVerse(curFile, vs, "John-01.html#vs23");
    } // isRechtmaken

    public static boolean isRuzieMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-26.html#vs20")
                || isValidVerse(curFile, vs, "Gen-45.html#vs24")
                || isValidVerse(curFile, vs, "Isa-58.html#vs4")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs24")
                || isValidVerse(curFile, vs, "Jas-4.html#vs2");
    } // isRuzieMaken

    public static boolean isSterkMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-03.html#vs12")
                || isValidVerse(curFile, vs, "Judg-16.html#vs28")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs7", 8)
                || isValidVerse(curFile, vs, "Neh-05.html#vs16")
                || isValidVerse(curFile, vs, "Neh-06.html#vs9")
                || isValidVerse(curFile, vs, "Job-04.html#vs4")
                || isValidVerse(curFile, vs, "Ps-009.html#vs20")
                || isValidVerse(curFile, vs, "Ps-027.html#vs14")
                || isValidVerse(curFile, vs, "Ps-031.html#vs25")
                || isValidVerse(curFile, vs, "Ps-064.html#vs6")
                || isValidVerse(curFile, vs, "Ps-080.html#vs16", 18)
                || isValidVerse(curFile, vs, "Ps-089.html#vs22")
                || isValidVerse(curFile, vs, "Ps-147.html#vs13")
                || isValidVerse(curFile, vs, "Prov-08.html#vs28")
                || isValidVerse(curFile, vs, "Prov-31.html#vs17")
                || isValidVerse(curFile, vs, "Isa-47.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs21", 24, 25)
                || isValidVerse(curFile, vs, "Dan-10.html#vs21")
                || isValidVerse(curFile, vs, "Hos-07.html#vs15")
                || isValidVerse(curFile, vs, "Acts-03.html#vs16");
    } // isSterkMaken

    public static boolean isTeGeldeMaken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te gelde maken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-14.html#vs25")
                || isValidVerse(curFile, vs, "Luke-15.html#vs13");
    } // isTeGeldeMaken

    public static boolean isTotLeugenaarMaken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot leugenaar maken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "1John-1.html#vs10")
                || isValidVerse(curFile, vs, "1John-5.html#vs10");
    } // isTotLeugenaarMaken

    public static boolean isTotSlaafMaken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot slaaf maken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Acts-07.html#vs6")
                || isValidVerse(curFile, vs, "1Cor-09.html#vs19")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs20")
                || isValidVerse(curFile, vs, "Gal-2.html#vs4");
    } // isTotSlaafMaken

    public static boolean isTotZondeMaken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot zonde maken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Cor-05.html#vs21");
    } // isTotZondeMaken

    public static boolean isVastmaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-26.html#vs3", 6, 9, 11)
                || isValidVerse(curFile, vs, "Exod-36.html#vs10", 13, 16, 18)
                || isValidVerse(curFile, vs, "Exod-38.html#vs28")
                || isValidVerse(curFile, vs, "Exod-39.html#vs16", 17, 18, 20, 25, 31)
                || isValidVerse(curFile, vs, "Exod-40.html#vs18")
                || isValidVerse(curFile, vs, "Lev-08.html#vs7")
                || isValidVerse(curFile, vs, "Judg-15.html#vs4")
                || isValidVerse(curFile, vs, "Judg-16.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-03.html#vs16")
                || isValidVerse(curFile, vs, "Ps-040.html#vs3")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs10");
    } // isVastmaken

    public static boolean isVolkomenMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-018.html#vs33")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs4", 11)
                || isValidVerse(curFile, vs, "Phil-2.html#vs2");
    } // isVolkomenMaken

    public static boolean isVrijmaken() {
        return false;
    } // isVrijmaken

    public static boolean isZaligMaken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-01.html#vs21")
                || isValidVerse(curFile, vs, "Matt-18.html#vs11")
                || isValidVerse(curFile, vs, "Luke-19.html#vs10")
                || isValidVerse(curFile, vs, "John-12.html#vs47")
                || isValidVerse(curFile, vs, "1Cor-01.html#vs21")
                || isValidVerse(curFile, vs, "1Tim-1.html#vs15")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs9")
                || isValidVerse(curFile, vs, "Titus-3.html#vs5")
                || isValidVerse(curFile, vs, "Heb-07.html#vs25")
                || isValidVerse(curFile, vs, "Jas-1.html#vs21")
                || isValidVerse(curFile, vs, "Jas-2.html#vs14")
                || isValidVerse(curFile, vs, "Jas-4.html#vs12");
    } // isZaligMaken

    public static boolean isMaken(final File curFile, final String vs, final String keyArg, final String arg) {
        return !isBekendmaken(curFile, vs)
                && !isBekwaamMaken(curFile, vs)
                && !isBeschaamdMaken(curFile, vs)
                && !isDuidelijkMaken(curFile, vs)
                && !isEindeMakenAan(curFile, vs)
                && !isGebruikmaken(curFile, vs)
                && !isGelijkmaken(curFile, vs)
                && !isGereedmaken(curFile, vs)
                && !isGezondMaken(curFile, vs)
                && !isGoedmaken(curFile, vs)
                && !isGrootmaken(curFile, vs)
                && !isHaastMaken(curFile, vs)
                && !isKlaarmaken(curFile, vs)
                && !isLeegmaken(curFile, vs)
                && !isLevendMaken(curFile, vs)
                && !isLosmaken(curFile, vs)
                && !isMetDeGrondGelijkmaken(curFile, vs, arg)
                && !isNaamMaken(curFile, vs)
                && !isNatmaken(curFile, vs)
                && !isOnderscheidMaken(curFile, vs)
                && !isOpenbaarMaken(curFile, vs)
                && !isOpmaken(curFile, vs)
                && !isOvervloedigMaken(curFile, vs)
                && !isPlaatsmaken(curFile, vs)
                && !isRechtmaken(curFile, vs)
                && !isRuzieMaken(curFile, vs)
                && !isSterkMaken(curFile, vs)
                && !isTeGeldeMaken(curFile, vs, arg)
                && !isTeSchandeMaken(curFile, vs, keyArg, arg)
                && !isTotLeugenaarMaken(curFile, vs, arg)
                && !isTotSlaafMaken(curFile, vs, arg)
                && !isTotZondeMaken(curFile, vs, arg)
                && !isVastmaken(curFile, vs)
                && !isVolkomenMaken(curFile, vs)
                && !isVrijmaken()
                && !isZaligMaken(curFile, vs);
    } // isMaken
}
