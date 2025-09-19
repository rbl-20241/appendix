package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDoen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aandoen" -> isAandoen(curFile, vs);
            case "afdoen" -> isAfdoen(curFile, vs);
            case "dichtdoen" -> isDichtdoen(curFile, vs);
            case "dienst doen" -> isDienstDoen(curFile, vs);
            case "doen opstaan" -> isDoenOpstaan(curFile, vs);
            case "gestand doen" -> isGestandDoen(curFile, vs);
            case "goed aan doen" -> isGoedAanDoen(curFile, vs, arg);
            case "goeddoen" -> isGoeddoen(curFile, vs);
            case "goeds doen" -> isGoedsDoen(curFile, vs);
            case "kwaaddoen" -> isKwaaddoen(curFile, vs);
            case "kwaads doen" -> isKwaadsDoen(curFile, vs);
            case "omdoen" -> isOmdoen(curFile, vs);
            case "onrecht doen" -> isOnrechtDoen(curFile, vs);
            case "opendoen" -> isOpendoen(curFile, vs);
            case "recht doen" -> isRechtDoen(curFile, vs);
            case "te goed doen" -> isTeGoedDoen(curFile, vs, arg);
            case "tekortdoen" -> isTekortdoen();
            case "tenietdoen" -> isTenietdoen(curFile, vs);
            case "uitdoen" -> isUitdoen(curFile, vs);
            case "verzoening doen" -> isVerzoeningDoen(curFile, vs);
            case "wegdoen" -> isWegdoen(curFile, vs);
            case "weldoen" -> isWeldoen(curFile, vs);
            case "zaken doen" -> isZakenDoen(curFile, vs);
            case "doen" -> isDoen(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAandoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-23.html#vs11")
                || isValidVerse(curFile, vs, "Deut-32.html#vs6")
                || isValidVerse(curFile, vs, "Josh-23.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs2")
                || isValidVerse(curFile, vs, "Job-35.html#vs6")
                || isValidVerse(curFile, vs, "Ps-078.html#vs66")
                || isValidVerse(curFile, vs, "Prov-26.html#vs10")
                || isValidVerse(curFile, vs, "Isa-03.html#vs9")
                || isValidVerse(curFile, vs, "Jer-02.html#vs17")
                || isValidVerse(curFile, vs, "Jer-07.html#vs19")
                || isValidVerse(curFile, vs, "Jer-18.html#vs8")
                || isValidVerse(curFile, vs, "Jer-22.html#vs3")
                || isValidVerse(curFile, vs, "Jer-26.html#vs3", 19)
                || isValidVerse(curFile, vs, "Jer-31.html#vs28")
                || isValidVerse(curFile, vs, "Jer-36.html#vs3")
                || isValidVerse(curFile, vs, "Lam-3.html#vs51")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs4")
                || isValidVerse(curFile, vs, "Luke-16.html#vs16")
                || isValidVerse(curFile, vs, "John-13.html#vs12")
                || isValidVerse(curFile, vs, "Col-3.html#vs14")
                || isValidVerse(curFile, vs, "Didache-01.html#vs2");
    } // isAandoen

    public static boolean isAfdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-33.html#vs5")
                || isValidVerse(curFile, vs, "Exod-34.html#vs34")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs4")
                || isValidVerse(curFile, vs, "Esth-08.html#vs2")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs14")
                || isValidVerse(curFile, vs, "Jer-26.html#vs2")
                || isValidVerse(curFile, vs, "Didache-04.html#vs13");
    } // isAfdoen

    public static boolean isDichtdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-16.html#vs30");
    } // isDichtdoen

    public static boolean isDienstDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-28.html#vs35")
                || isValidVerse(curFile, vs, "Exod-30.html#vs20")
                || isValidVerse(curFile, vs, "Exod-38.html#vs8")
                || isValidVerse(curFile, vs, "Num-04.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs14")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs37")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs6")
                || isValidVerse(curFile, vs, "Neh-10.html#vs36", 39)
                || isValidVerse(curFile, vs, "Jer-52.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-42.html#vs14")
                || isValidVerse(curFile, vs, "Dan-01.html#vs4")
                || isValidVerse(curFile, vs, "Acts-20.html#vs34")
                || isValidVerse(curFile, vs, "Heb-08.html#vs5");
    } // isDienstDoen

    public static boolean isDoenOpstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs9")
                || isValidVerse(curFile, vs, "Num-24.html#vs9")
                || isValidVerse(curFile, vs, "Deut-18.html#vs15", 18)
                || isValidVerse(curFile, vs, "Judg-02.html#vs16")
                || isValidVerse(curFile, vs, "Judg-03.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs35")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs11")
                || isValidVerse(curFile, vs, "Isa-41.html#vs2", 25)
                || isValidVerse(curFile, vs, "Isa-45.html#vs13")
                || isValidVerse(curFile, vs, "Jer-23.html#vs4", 5)
                || isValidVerse(curFile, vs, "Jer-29.html#vs15")
                || isValidVerse(curFile, vs, "Jer-30.html#vs9")
                || isValidVerse(curFile, vs, "Jer-50.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs23")
                || isValidVerse(curFile, vs, "Hos-06.html#vs2")
                || isValidVerse(curFile, vs, "Amos-2.html#vs11")
                || isValidVerse(curFile, vs, "Amos-6.html#vs14")
                || isValidVerse(curFile, vs, "Mic-5.html#vs4")
                || isValidVerse(curFile, vs, "Zech-11.html#vs16")
                || isValidVerse(curFile, vs, "John-06.html#vs39", 40, 44, 54)
                || isValidVerse(curFile, vs, "Acts-02.html#vs24", 30, 32)
                || isValidVerse(curFile, vs, "Acts-03.html#vs26")
                || isValidVerse(curFile, vs, "Acts-13.html#vs34")
                || isValidVerse(curFile, vs, "Acts-17.html#vs31");
    } // isDoenOpstaan

    public static boolean isGestandDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-26.html#vs3")
                || isValidVerse(curFile, vs, "Num-23.html#vs19")
                || isValidVerse(curFile, vs, "Deut-09.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-03.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs15")
                || isValidVerse(curFile, vs, "Neh-05.html#vs13")
                || isValidVerse(curFile, vs, "Neh-09.html#vs8")
                || isValidVerse(curFile, vs, "Jer-11.html#vs5")
                || isValidVerse(curFile, vs, "Jer-29.html#vs10")
                || isValidVerse(curFile, vs, "Jer-33.html#vs14")
                || isValidVerse(curFile, vs, "Jer-34.html#vs18")
                || isValidVerse(curFile, vs, "Jer-35.html#vs14", 16)
                || isValidVerse(curFile, vs, "Jer-44.html#vs25");
    } // isGestandDoen

    public static boolean isGoedAanDoen(final File curFile, final String vs, final String arg) {
        if (arg.equals("goed aan doen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-12.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs8")
                || isValidVerse(curFile, vs, "Zech-08.html#vs15")
                || isValidVerse(curFile, vs, "Matt-05.html#vs44")
                || isValidVerse(curFile, vs, "Luke-06.html#vs27")
                || isValidVerse(curFile, vs, "Acts-10.html#vs33")
                || isValidVerse(curFile, vs, "Phil-4.html#vs14")
                || isValidVerse(curFile, vs, "Jas-2.html#vs19")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs19");
    } // isGoedAanDoen

    public static boolean isGoeddoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-01.html#vs20")
                || isValidVerse(curFile, vs, "Num-24.html#vs13")
                || isValidVerse(curFile, vs, "Deut-28.html#vs63")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs20")
                || isValidVerse(curFile, vs, "Job-10.html#vs3")
                || isValidVerse(curFile, vs, "Ps-036.html#vs4")
                || isValidVerse(curFile, vs, "Ps-051.html#vs20")
                || isValidVerse(curFile, vs, "Ps-119.html#vs68")
                || isValidVerse(curFile, vs, "Ps-125.html#vs4")
                || isValidVerse(curFile, vs, "Prov-11.html#vs17")
                || isValidVerse(curFile, vs, "Prov-31.html#vs12")
                || isValidVerse(curFile, vs, "Eccl-11.html#vs7")
                || isValidVerse(curFile, vs, "Isa-01.html#vs17")
                || isValidVerse(curFile, vs, "Jer-13.html#vs23")
                || isValidVerse(curFile, vs, "Mic-2.html#vs7")
                || isValidVerse(curFile, vs, "Zeph-1.html#vs12")
                || isValidVerse(curFile, vs, "Matt-12.html#vs12")
                || isValidVerse(curFile, vs, "Matt-25.html#vs21", 23)
                || isValidVerse(curFile, vs, "Mark-03.html#vs4")
                || isValidVerse(curFile, vs, "Luke-06.html#vs9", 35)
                || isValidVerse(curFile, vs, "Luke-19.html#vs17")
                || isValidVerse(curFile, vs, "Acts-14.html#vs17")
                || isValidVerse(curFile, vs, "Gal-6.html#vs9")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs13")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs18")
                || isValidVerse(curFile, vs, "Jas-4.html#vs17")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs15");
    } // isGoeddoen

    public static boolean isGoedsDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-05.html#vs4")
                || isValidVerse(curFile, vs, "Job-24.html#vs21")
                || isValidVerse(curFile, vs, "Matt-19.html#vs16")
                || isValidVerse(curFile, vs, "Rom-09.html#vs11")
                || isValidVerse(curFile, vs, "Eph-6.html#vs8");
    } // isGoedsDoen

    public static boolean isKwaaddoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs7")
                || isValidVerse(curFile, vs, "Gen-26.html#vs29")
                || isValidVerse(curFile, vs, "Gen-31.html#vs7", 29)
                || isValidVerse(curFile, vs, "Gen-39.html#vs9")
                || isValidVerse(curFile, vs, "Gen-43.html#vs6")
                || isValidVerse(curFile, vs, "Gen-50.html#vs17")
                || isValidVerse(curFile, vs, "Exod-05.html#vs22", 23)
                || isValidVerse(curFile, vs, "Num-11.html#vs11")
                || isValidVerse(curFile, vs, "Num-16.html#vs15")
                || isValidVerse(curFile, vs, "Num-20.html#vs15")
                || isValidVerse(curFile, vs, "Num-24.html#vs13")
                || isValidVerse(curFile, vs, "Deut-26.html#vs6")
                || isValidVerse(curFile, vs, "Josh-24.html#vs20")
                || isValidVerse(curFile, vs, "Judg-15.html#vs3")
                || isValidVerse(curFile, vs, "Judg-19.html#vs23")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs17", 19, 20)
                || isValidVerse(curFile, vs, "1Sam-24.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs34")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs32")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs7", 25)
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs22")
                || isValidVerse(curFile, vs, "Neh-06.html#vs2")
                || isValidVerse(curFile, vs, "Neh-13.html#vs27")
                || isValidVerse(curFile, vs, "Job-24.html#vs21")
                || isValidVerse(curFile, vs, "Ps-015.html#vs3")
                || isValidVerse(curFile, vs, "Ps-034.html#vs17")
                || isValidVerse(curFile, vs, "Ps-105.html#vs15")
                || isValidVerse(curFile, vs, "Prov-02.html#vs14")
                || isValidVerse(curFile, vs, "Prov-03.html#vs30")
                || isValidVerse(curFile, vs, "Prov-04.html#vs16")
                || isValidVerse(curFile, vs, "Prov-24.html#vs8")
                || isValidVerse(curFile, vs, "Prov-31.html#vs12")
                || isValidVerse(curFile, vs, "Eccl-04.html#vs17")
                || isValidVerse(curFile, vs, "Isa-01.html#vs16")
                || isValidVerse(curFile, vs, "Isa-11.html#vs9")
                || isValidVerse(curFile, vs, "Isa-56.html#vs2")
                || isValidVerse(curFile, vs, "Isa-65.html#vs25")
                || isValidVerse(curFile, vs, "Jer-02.html#vs13")
                || isValidVerse(curFile, vs, "Jer-10.html#vs5")
                || isValidVerse(curFile, vs, "Jer-13.html#vs23")
                || isValidVerse(curFile, vs, "Jer-16.html#vs12")
                || isValidVerse(curFile, vs, "Jer-25.html#vs6")
                || isValidVerse(curFile, vs, "Jer-39.html#vs12")
                || isValidVerse(curFile, vs, "Dan-11.html#vs27")
                || isValidVerse(curFile, vs, "Mic-3.html#vs4")
                || isValidVerse(curFile, vs, "Mic-7.html#vs3")
                || isValidVerse(curFile, vs, "Zeph-1.html#vs12")
                || isValidVerse(curFile, vs, "Zech-08.html#vs14")
                || isValidVerse(curFile, vs, "Mal-2.html#vs17")
                || isValidVerse(curFile, vs, "Matt-27.html#vs23")
                || isValidVerse(curFile, vs, "Mark-03.html#vs4")
                || isValidVerse(curFile, vs, "Mark-15.html#vs14")
                || isValidVerse(curFile, vs, "Luke-06.html#vs9")
                || isValidVerse(curFile, vs, "Luke-23.html#vs22")
                || isValidVerse(curFile, vs, "John-03.html#vs20")
                || isValidVerse(curFile, vs, "Acts-09.html#vs13")
                || isValidVerse(curFile, vs, "Acts-12.html#vs1")
                || isValidVerse(curFile, vs, "Acts-16.html#vs28")
                || isValidVerse(curFile, vs, "Acts-18.html#vs10")
                || isValidVerse(curFile, vs, "Rom-13.html#vs4", 10)
                || isValidVerse(curFile, vs, "2Cor-13.html#vs7")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs12", 13, 17)
                || isValidVerse(curFile, vs, "3John-1.html#vs11");
    } // isKwaaddoen

    public static boolean isKwaadsDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-05.html#vs4")
                || isValidVerse(curFile, vs, "Rom-09.html#vs11");
    } // isKwaadsDoen

    public static boolean isRechtDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs19", 25)
                || isValidVerse(curFile, vs, "1Sam-24.html#vs16")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs19", 31)
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs26")
                || isValidVerse(curFile, vs, "Ps-007.html#vs9")
                || isValidVerse(curFile, vs, "Ps-009.html#vs17")
                || isValidVerse(curFile, vs, "Ps-010.html#vs18")
                || isValidVerse(curFile, vs, "Ps-026.html#vs1")
                || isValidVerse(curFile, vs, "Ps-035.html#vs23", 24)
                || isValidVerse(curFile, vs, "Ps-043.html#vs1")
                || isValidVerse(curFile, vs, "Ps-058.html#vs12")
                || isValidVerse(curFile, vs, "Ps-072.html#vs4")
                || isValidVerse(curFile, vs, "Ps-082.html#vs3")
                || isValidVerse(curFile, vs, "Ps-099.html#vs4")
                || isValidVerse(curFile, vs, "Ps-119.html#vs121")
                || isValidVerse(curFile, vs, "Ps-146.html#vs7")
                || isValidVerse(curFile, vs, "Prov-21.html#vs3", 7, 15)
                || isValidVerse(curFile, vs, "Prov-29.html#vs14")
                || isValidVerse(curFile, vs, "Isa-01.html#vs17", 23)
                || isValidVerse(curFile, vs, "Isa-11.html#vs4")
                || isValidVerse(curFile, vs, "Jer-05.html#vs1")
                || isValidVerse(curFile, vs, "Jer-07.html#vs5")
                || isValidVerse(curFile, vs, "Jer-09.html#vs24")
                || isValidVerse(curFile, vs, "Jer-22.html#vs3", 15)
                || isValidVerse(curFile, vs, "Jer-23.html#vs5")
                || isValidVerse(curFile, vs, "Jer-33.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs5", 19)
                || isValidVerse(curFile, vs, "Ezek-33.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs24")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs9")
                || isValidVerse(curFile, vs, "Mic-6.html#vs8")
                || isValidVerse(curFile, vs, "Luke-18.html#vs3", 5, 7, 8);
    } // isRechtDoen

    public static boolean isOmdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs34")
                || isValidVerse(curFile, vs, "Exod-33.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs31")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs27")
                || isValidVerse(curFile, vs, "Jer-13.html#vs1", 2)
                || isValidVerse(curFile, vs, "Ezek-16.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs42")
                || isValidVerse(curFile, vs, "Matt-27.html#vs28")
                || isValidVerse(curFile, vs, "Mark-09.html#vs42")
                || isValidVerse(curFile, vs, "Mark-15.html#vs17")
                || isValidVerse(curFile, vs, "Luke-17.html#vs2")
                || isValidVerse(curFile, vs, "Luke-23.html#vs11")
                || isValidVerse(curFile, vs, "John-13.html#vs4")
                || isValidVerse(curFile, vs, "John-19.html#vs2")
                || isValidVerse(curFile, vs, "Acts-12.html#vs8");
    } // isOmdoen

    public static boolean isOnrechtDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-19.html#vs15", 35)
                || isValidVerse(curFile, vs, "Deut-25.html#vs16")
                || isValidVerse(curFile, vs, "Job-18.html#vs21")
                || isValidVerse(curFile, vs, "Job-27.html#vs7")
                || isValidVerse(curFile, vs, "Job-29.html#vs17")
                || isValidVerse(curFile, vs, "Job-36.html#vs23")
                || isValidVerse(curFile, vs, "Ps-037.html#vs1")
                || isValidVerse(curFile, vs, "Isa-53.html#vs9")
                || isValidVerse(curFile, vs, "Jer-09.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs24", 26)
                || isValidVerse(curFile, vs, "Ezek-33.html#vs13", 15, 18)
                || isValidVerse(curFile, vs, "Dan-09.html#vs5")
                || isValidVerse(curFile, vs, "Hab-1.html#vs3")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs5", 13)
                || isValidVerse(curFile, vs, "Matt-20.html#vs13")
                || isValidVerse(curFile, vs, "Acts-07.html#vs26", 27)
                || isValidVerse(curFile, vs, "Acts-25.html#vs10", 11)
                || isValidVerse(curFile, vs, "1Cor-06.html#vs8")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs12")
                || isValidVerse(curFile, vs, "Col-3.html#vs25")
                || isValidVerse(curFile, vs, "Rev-22.html#vs11");
    } // isOnrechtDoen

    public static boolean isOpendoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-03.html#vs25")
                || isValidVerse(curFile, vs, "1Sam-03.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs35")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs17")
                || isValidVerse(curFile, vs, "Job-14.html#vs3")
                || isValidVerse(curFile, vs, "Ps-081.html#vs11")
                || isValidVerse(curFile, vs, "Ps-104.html#vs28")
                || isValidVerse(curFile, vs, "Ps-118.html#vs19")
                || isValidVerse(curFile, vs, "Ps-145.html#vs16")
                || isValidVerse(curFile, vs, "Prov-31.html#vs26")
                || isValidVerse(curFile, vs, "Song-5.html#vs2", 5, 6)
                || isValidVerse(curFile, vs, "Isa-26.html#vs2")
                || isValidVerse(curFile, vs, "Isa-42.html#vs20")
                || isValidVerse(curFile, vs, "Isa-53.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-02.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs2")
                || isValidVerse(curFile, vs, "Matt-17.html#vs27")
                || isValidVerse(curFile, vs, "Matt-25.html#vs11")
                || isValidVerse(curFile, vs, "Luke-12.html#vs36")
                || isValidVerse(curFile, vs, "Luke-13.html#vs25")
                || isValidVerse(curFile, vs, "John-10.html#vs3")
                || isValidVerse(curFile, vs, "Acts-08.html#vs32", 35)
                || isValidVerse(curFile, vs, "Acts-09.html#vs40")
                || isValidVerse(curFile, vs, "Acts-12.html#vs14");
    } // isOpendoen

    public static boolean isTeGoedDoen(final File curFile, final String vs, final String arg) {
        if (arg.equals("te goed doen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Job-24.html#vs20")
                || isValidVerse(curFile, vs, "Ps-049.html#vs19")
                || isValidVerse(curFile, vs, "Jude-1.html#vs12");
    } // isTeGoedDoen

    public static boolean isTekortdoen() {
        return IS_NOT_FOUND;
    } // isTekortdoen

    public static boolean isTenietdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-06.html#vs4", 5)
                || isValidVerse(curFile, vs, "Job-15.html#vs4")
                || isValidVerse(curFile, vs, "Ps-039.html#vs12")
                || isValidVerse(curFile, vs, "Ps-085.html#vs5")
                || isValidVerse(curFile, vs, "Rom-03.html#vs31")
                || isValidVerse(curFile, vs, "1Cor-01.html#vs28")
                || isValidVerse(curFile, vs, "Gal-2.html#vs21")
                || isValidVerse(curFile, vs, "Gal-3.html#vs17")
                || isValidVerse(curFile, vs, "Heb-02.html#vs14")
                || isValidVerse(curFile, vs, "Heb-09.html#vs26");
    } // isTenietdoen

    public static boolean isUitdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-17.html#vs39")
                || isValidVerse(curFile, vs, "Isa-32.html#vs11");
    } // isUitdoen

    public static boolean isVerzoeningDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-29.html#vs33", 36, 37)
                || isValidVerse(curFile, vs, "Exod-30.html#vs10", 15, 16)
                || isValidVerse(curFile, vs, "Lev-04.html#vs26", 31, 35)
                || isValidVerse(curFile, vs, "Lev-05.html#vs6", 10, 13, 16, 18)
                || isValidVerse(curFile, vs, "Lev-06.html#vs7", 30)
                || isValidVerse(curFile, vs, "Lev-07.html#vs7")
                || isValidVerse(curFile, vs, "Lev-08.html#vs15")
                || isValidVerse(curFile, vs, "Lev-09.html#vs7")
                || isValidVerse(curFile, vs, "Lev-10.html#vs17")
                || isValidVerse(curFile, vs, "Lev-12.html#vs7", 8)
                || isValidVerse(curFile, vs, "Lev-14.html#vs18", 19, 20, 21, 29, 31, 53)
                || isValidVerse(curFile, vs, "Lev-15.html#vs15", 30)
                || isValidVerse(curFile, vs, "Lev-16.html#vs6", 10, 11, 16, 17, 18, 24, 27, 30, 32, 33, 34)
                || isValidVerse(curFile, vs, "Lev-17.html#vs11")
                || isValidVerse(curFile, vs, "Lev-19.html#vs22")
                || isValidVerse(curFile, vs, "Lev-23.html#vs28")
                || isValidVerse(curFile, vs, "Num-05.html#vs8")
                || isValidVerse(curFile, vs, "Num-06.html#vs11")
                || isValidVerse(curFile, vs, "Num-08.html#vs12", 19, 21)
                || isValidVerse(curFile, vs, "Num-15.html#vs25", 28)
                || isValidVerse(curFile, vs, "Num-16.html#vs46", 47)
                || isValidVerse(curFile, vs, "Num-28.html#vs22", 30)
                || isValidVerse(curFile, vs, "Num-29.html#vs5")
                || isValidVerse(curFile, vs, "Num-31.html#vs50")
                || isValidVerse(curFile, vs, "Num-35.html#vs33")
                || isValidVerse(curFile, vs, "Deut-21.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-06.html#vs49")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs18")
                || isValidVerse(curFile, vs, "Neh-10.html#vs33")
                || isValidVerse(curFile, vs, "Ps-079.html#vs9")
                || isValidVerse(curFile, vs, "Jer-18.html#vs23")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs63")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs20", 26)
                || isValidVerse(curFile, vs, "Ezek-45.html#vs15", 17, 20);
    } // isVerzoeningDoen

    public static boolean isWegdoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-35.html#vs2")
                || isValidVerse(curFile, vs, "Deut-19.html#vs13")
                || isValidVerse(curFile, vs, "Josh-24.html#vs14", 23)
                || isValidVerse(curFile, vs, "Judg-10.html#vs16")
                || isValidVerse(curFile, vs, "Judg-20.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs3", 4)
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs41")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs33")
                || isValidVerse(curFile, vs, "Job-07.html#vs21")
                || isValidVerse(curFile, vs, "Job-11.html#vs14")
                || isValidVerse(curFile, vs, "Job-13.html#vs21")
                || isValidVerse(curFile, vs, "Job-22.html#vs23")
                || isValidVerse(curFile, vs, "Ps-018.html#vs23")
                || isValidVerse(curFile, vs, "Ps-119.html#vs119")
                || isValidVerse(curFile, vs, "Prov-04.html#vs24")
                || isValidVerse(curFile, vs, "Prov-25.html#vs4", 5)
                || isValidVerse(curFile, vs, "Eccl-11.html#vs10")
                || isValidVerse(curFile, vs, "Isa-01.html#vs16")
                || isValidVerse(curFile, vs, "Isa-06.html#vs12")
                || isValidVerse(curFile, vs, "Jer-04.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs50")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs9")
                || isValidVerse(curFile, vs, "Amos-5.html#vs23")
                || isValidVerse(curFile, vs, "Amos-8.html#vs4")
                || isValidVerse(curFile, vs, "1Cor-05.html#vs2", 13);
    } // isWegdoen

    public static boolean isWeldoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-08.html#vs16")
                || isValidVerse(curFile, vs, "Judg-17.html#vs13");
    } // isWeldoen

    public static boolean isZakenDoen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs18")
                || isValidVerse(curFile, vs, "Isa-47.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs12", 16, 18, 21, 36)
                || isValidVerse(curFile, vs, "Luke-19.html#vs13");
    } // isZakenDoen

    private static boolean isDoen(final File curFile, final String vs, final String arg) {
        return !isAandoen(curFile, vs)
                && !isAfdoen(curFile, vs)
                && !isDienstDoen(curFile, vs)
                && !isDichtdoen(curFile, vs)
                && !isDoenOpstaan(curFile, vs)
                && !isGestandDoen(curFile, vs)
                && !isGoedAanDoen(curFile, vs, arg)
                && !isGoeddoen(curFile, vs)
                && !isGoedsDoen(curFile, vs)
                && !isKwaaddoen(curFile, vs)
                && !isKwaadsDoen(curFile, vs)
                && !isOmdoen(curFile, vs)
                && !isOnrechtDoen(curFile, vs)
                && !isOpendoen(curFile, vs)
                && !isRechtDoen(curFile, vs)
                && !isTeGoedDoen(curFile, vs, arg)
                && !isTenietdoen(curFile, vs)
                && !isUitdoen(curFile, vs)
                && !isVerzoeningDoen(curFile, vs)
                && !isWegdoen(curFile, vs)
                && !isWeldoen(curFile, vs)
                && !isZakenDoen(curFile, vs);
    }  // isDoen

}
