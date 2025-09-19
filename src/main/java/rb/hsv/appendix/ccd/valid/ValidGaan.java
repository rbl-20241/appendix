package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGaan {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "achternagaan" -> isAchternagaan(curFile, vs);
            case "binnengaan" -> isBinnengaan(curFile, vs);
            case "door het vuur gaan" -> isDoorHetVuurGaan(curFile, vs, arg);
            case "doorgaan" -> isDoorgaan(curFile, vs);
            case "heengaan" -> isHeengaan(curFile, vs);
            case "langsgaan" -> isLangsgaan(curFile, vs);
            case "meegaan" -> isMeegaan(curFile, vs);
            case "nagaan" -> isNagaan(curFile, vs);
            case "omgaan" -> isOmgaan(curFile, vs);
            case "omhooggaan" -> isOmhooggaan(curFile, vs);
            case "omlaaggaan" -> isOmlaaggaan(curFile, vs);
            case "opgaan" -> isOpgaan(curFile, vs);
            case "rondgaan" -> isRondgaan(curFile, vs);
            case "te boven gaan" -> isTeBovenGaan(curFile, vs, arg);
            case "te gronde gaan" -> isTeGrondeGaan(curFile, vs, arg);
            case "te ruste gaan" -> isTeRusteGaan(curFile, vs, arg);
            case "tekeergaan" -> isTekeergaan(curFile, vs);
            case "ten onder gaan" -> isTenOnderGaan(curFile, vs, arg);
            case "teruggaan" -> isTeruggaan(curFile, vs);
            case "verdergaan" -> isVerdergaan(curFile, vs);
            case "voorbijgaan" -> isVoorbijgaan(curFile, vs);
            case "voorgaan" -> isVoorgaan(curFile, vs);
            case "voortgaan" -> isVoortgaan(curFile, vs);
            case "weggaan" -> isWeggaan(curFile, vs);
            case "gaan" -> isGaan(curFile, vs, arg);
            case "gaan (kan weg)" -> isGaan(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAchternagaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs17")
                || isValidVerse(curFile, vs, "Judg-09.html#vs49")
                || isValidVerse(curFile, vs, "Judg-13.html#vs11")
                || isValidVerse(curFile, vs, "Judg-19.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs35")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs17")
                || isValidVerse(curFile, vs, "Jer-07.html#vs6")
                || isValidVerse(curFile, vs, "Jer-08.html#vs2")
                || isValidVerse(curFile, vs, "Jer-16.html#vs11", 12)
                || isValidVerse(curFile, vs, "Jer-35.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs16")
                || isValidVerse(curFile, vs, "Mark-01.html#vs20", 36)
                || isValidVerse(curFile, vs, "Luke-21.html#vs8")
                || isValidVerse(curFile, vs, "Jude-1.html#vs7")
                || isValidVerse(curFile, vs, "Rev-13.html#vs3");
    } // isAchternagaan

    public static boolean isBinnengaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs11")
                || isValidVerse(curFile, vs, "Gen-31.html#vs33")
                || isValidVerse(curFile, vs, "Gen-43.html#vs30")
                || isValidVerse(curFile, vs, "Exod-18.html#vs7")
                || isValidVerse(curFile, vs, "Exod-24.html#vs18")
                || isValidVerse(curFile, vs, "Exod-34.html#vs35")
                || isValidVerse(curFile, vs, "Lev-14.html#vs48")
                || isValidVerse(curFile, vs, "Num-04.html#vs19", 20)
                || isValidVerse(curFile, vs, "Deut-01.html#vs8")
                || isValidVerse(curFile, vs, "Deut-09.html#vs1")
                || isValidVerse(curFile, vs, "Deut-29.html#vs12")
                || isValidVerse(curFile, vs, "Josh-06.html#vs22", 23)
                || isValidVerse(curFile, vs, "Judg-04.html#vs22")
                || isValidVerse(curFile, vs, "Judg-06.html#vs19")
                || isValidVerse(curFile, vs, "Judg-09.html#vs27")
                || isValidVerse(curFile, vs, "Judg-13.html#vs6")
                || isValidVerse(curFile, vs, "Judg-15.html#vs1")
                || isValidVerse(curFile, vs, "Judg-16.html#vs1")
                || isValidVerse(curFile, vs, "Judg-18.html#vs17")
                || isValidVerse(curFile, vs, "Judg-19.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs16", 20)
                || isValidVerse(curFile, vs, "2Sam-14.html#vs3", 31, 33)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs4", 33)
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs34")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs16")
                || isValidVerse(curFile, vs, "1Chr-24.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-27.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs16")
                || isValidVerse(curFile, vs, "Neh-09.html#vs15", 23)
                || isValidVerse(curFile, vs, "Ps-045.html#vs16")
                || isValidVerse(curFile, vs, "Ps-100.html#vs4")
                || isValidVerse(curFile, vs, "Ps-132.html#vs3")
                || isValidVerse(curFile, vs, "Prov-27.html#vs10")
                || isValidVerse(curFile, vs, "Jer-38.html#vs11")
                || isValidVerse(curFile, vs, "Jer-42.html#vs15", 17, 19)
                || isValidVerse(curFile, vs, "Jer-44.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs24")
                || isValidVerse(curFile, vs, "Ezek-08.html#vs9", 10)
                || isValidVerse(curFile, vs, "Ezek-10.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-41.html#vs3")
                || isValidVerse(curFile, vs, "Dan-06.html#vs11")
                || isValidVerse(curFile, vs, "Matt-07.html#vs13")
                || isValidVerse(curFile, vs, "Matt-09.html#vs25")
                || isValidVerse(curFile, vs, "Matt-12.html#vs29")
                || isValidVerse(curFile, vs, "Matt-21.html#vs12")
                || isValidVerse(curFile, vs, "Matt-22.html#vs11")
                || isValidVerse(curFile, vs, "Matt-23.html#vs13")
                || isValidVerse(curFile, vs, "Matt-25.html#vs10")
                || isValidVerse(curFile, vs, "Matt-26.html#vs58")
                || isValidVerse(curFile, vs, "Mark-05.html#vs39", 40)
                || isValidVerse(curFile, vs, "Mark-06.html#vs25")
                || isValidVerse(curFile, vs, "Mark-14.html#vs14")
                || isValidVerse(curFile, vs, "Mark-15.html#vs43")
                || isValidVerse(curFile, vs, "Luke-01.html#vs9")
                || isValidVerse(curFile, vs, "Luke-07.html#vs1")
                || isValidVerse(curFile, vs, "Luke-11.html#vs26", 37)
                || isValidVerse(curFile, vs, "Luke-13.html#vs24")
                || isValidVerse(curFile, vs, "Luke-15.html#vs28")
                || isValidVerse(curFile, vs, "Luke-24.html#vs3", 29)
                || isValidVerse(curFile, vs, "John-10.html#vs2", 9)
                || isValidVerse(curFile, vs, "John-18.html#vs15")
                || isValidVerse(curFile, vs, "John-20.html#vs6", 8)
                || isValidVerse(curFile, vs, "Acts-08.html#vs3")
                || isValidVerse(curFile, vs, "Acts-09.html#vs17")
                || isValidVerse(curFile, vs, "Acts-10.html#vs25", 27, 28)
                || isValidVerse(curFile, vs, "Acts-17.html#vs2")
                || isValidVerse(curFile, vs, "Acts-18.html#vs19")
                || isValidVerse(curFile, vs, "Acts-19.html#vs8")
                || isValidVerse(curFile, vs, "Acts-21.html#vs26")
                || isValidVerse(curFile, vs, "Heb-04.html#vs1", 3, 11)
                || isValidVerse(curFile, vs, "Heb-09.html#vs6", 7);
    } // isBinnengaan

    public static boolean isDoorHetVuurGaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("door het vuur gaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-31.html#vs23")
                || isValidVerse(curFile, vs, "Deut-18.html#vs10")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs6")
                || isValidVerse(curFile, vs, "Isa-43.html#vs2")
                || isValidVerse(curFile, vs, "Jer-32.html#vs35")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs26", 31)
                || isValidVerse(curFile, vs, "Ezek-23.html#vs37");
    } // isDoorHetVuurGaan

    public static boolean isDoorgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs34")
                || isValidVerse(curFile, vs, "Num-22.html#vs15", 25)
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs49")
                || isValidVerse(curFile, vs, "Job-19.html#vs8")
                || isValidVerse(curFile, vs, "Ps-078.html#vs17")
                || isValidVerse(curFile, vs, "Prov-27.html#vs12")
                || isValidVerse(curFile, vs, "Isa-01.html#vs5")
                || isValidVerse(curFile, vs, "Isa-62.html#vs10")
                || isValidVerse(curFile, vs, "Jer-11.html#vs8");
    } // isDoorgaan

    public static boolean isHeengaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-16.html#vs8")
                || isValidVerse(curFile, vs, "Gen-24.html#vs51")
                || isValidVerse(curFile, vs, "Gen-28.html#vs15")
                || isValidVerse(curFile, vs, "Gen-32.html#vs17")
                || isValidVerse(curFile, vs, "Exod-08.html#vs25")
                || isValidVerse(curFile, vs, "Exod-12.html#vs32")
                || isValidVerse(curFile, vs, "Exod-32.html#vs34")
                || isValidVerse(curFile, vs, "Exod-33.html#vs1")
                || isValidVerse(curFile, vs, "Num-32.html#vs41", 42)
                || isValidVerse(curFile, vs, "Josh-01.html#vs9")
                || isValidVerse(curFile, vs, "Josh-02.html#vs5")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs8", 12, 16)
                || isValidVerse(curFile, vs, "Ruth-3.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs47")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs3", 18)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs37")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs6", 14)
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs5", 10)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs8", 11)
                || isValidVerse(curFile, vs, "1Chr-18.html#vs6", 13)
                || isValidVerse(curFile, vs, "2Chr-21.html#vs20")
                || isValidVerse(curFile, vs, "Neh-02.html#vs16")
                || isValidVerse(curFile, vs, "Job-14.html#vs20")
                || isValidVerse(curFile, vs, "Job-42.html#vs9")
                || isValidVerse(curFile, vs, "Ps-042.html#vs8")
                || isValidVerse(curFile, vs, "Ps-109.html#vs23")
                || isValidVerse(curFile, vs, "Prov-03.html#vs28")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs15")
                || isValidVerse(curFile, vs, "Eccl-06.html#vs4")
                || isValidVerse(curFile, vs, "Jer-16.html#vs5")
                || isValidVerse(curFile, vs, "Jer-36.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs12", 20)
                || isValidVerse(curFile, vs, "Ezek-10.html#vs11")
                || isValidVerse(curFile, vs, "Dan-12.html#vs9", 13)
                || isValidVerse(curFile, vs, "Amos-7.html#vs12", 15)
                || isValidVerse(curFile, vs, "Zech-02.html#vs2")
                || isValidVerse(curFile, vs, "Matt-05.html#vs24")
                || isValidVerse(curFile, vs, "Matt-08.html#vs4", 13, 19)
                || isValidVerse(curFile, vs, "Matt-09.html#vs13")
                || isValidVerse(curFile, vs, "Matt-11.html#vs4")
                || isValidVerse(curFile, vs, "Matt-13.html#vs44", 46)
                || isValidVerse(curFile, vs, "Matt-14.html#vs12")
                || isValidVerse(curFile, vs, "Matt-18.html#vs30")
                || isValidVerse(curFile, vs, "Matt-19.html#vs21")
                || isValidVerse(curFile, vs, "Matt-21.html#vs6")
                || isValidVerse(curFile, vs, "Matt-26.html#vs24", 42, 44)
                || isValidVerse(curFile, vs, "Matt-27.html#vs5", 65)
                || isValidVerse(curFile, vs, "Matt-28.html#vs7", 10, 19)
                || isValidVerse(curFile, vs, "Mark-01.html#vs44")
                || isValidVerse(curFile, vs, "Mark-05.html#vs34")
                || isValidVerse(curFile, vs, "Mark-06.html#vs27")
                || isValidVerse(curFile, vs, "Mark-07.html#vs29")
                || isValidVerse(curFile, vs, "Mark-09.html#vs43")
                || isValidVerse(curFile, vs, "Mark-10.html#vs21", 52)
                || isValidVerse(curFile, vs, "Mark-14.html#vs21")
                || isValidVerse(curFile, vs, "Mark-16.html#vs7", 10, 15, 20)
                || isValidVerse(curFile, vs, "Luke-05.html#vs14")
                || isValidVerse(curFile, vs, "Luke-07.html#vs22", 50)
                || isValidVerse(curFile, vs, "Luke-08.html#vs48")
                || isValidVerse(curFile, vs, "Luke-09.html#vs57", 60)
                || isValidVerse(curFile, vs, "Luke-10.html#vs3", 37)
                || isValidVerse(curFile, vs, "Luke-13.html#vs32")
                || isValidVerse(curFile, vs, "Luke-14.html#vs10")
                || isValidVerse(curFile, vs, "Luke-15.html#vs15")
                || isValidVerse(curFile, vs, "Luke-17.html#vs14", 19, 23)
                || isValidVerse(curFile, vs, "Luke-22.html#vs8", 22)
                || isValidVerse(curFile, vs, "John-03.html#vs8")
                || isValidVerse(curFile, vs, "John-04.html#vs16", 50)
                || isValidVerse(curFile, vs, "John-07.html#vs33")
                || isValidVerse(curFile, vs, "John-08.html#vs11", 14, 21)
                || isValidVerse(curFile, vs, "John-09.html#vs7", 11)
                || isValidVerse(curFile, vs, "John-11.html#vs8")
                || isValidVerse(curFile, vs, "John-12.html#vs35")
                || isValidVerse(curFile, vs, "John-13.html#vs33", 36)
                || isValidVerse(curFile, vs, "John-14.html#vs2", 4, 5, 12, 28)
                || isValidVerse(curFile, vs, "John-16.html#vs5", 16, 17, 28)
                || isValidVerse(curFile, vs, "Acts-05.html#vs26")
                || isValidVerse(curFile, vs, "Acts-09.html#vs17")
                || isValidVerse(curFile, vs, "Phil-1.html#vs23")
                || isValidVerse(curFile, vs, "Jas-2.html#vs16")
                || isValidVerse(curFile, vs, "1John-2.html#vs11")
                || isValidVerse(curFile, vs, "Rev-12.html#vs17");
    } // isHeengaan

    public static boolean isLangsgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-21.html#vs22")
                || isValidVerse(curFile, vs, "Josh-15.html#vs3", 4, 6, 7, 10, 11)
                || isValidVerse(curFile, vs, "Josh-16.html#vs2", 6)
                || isValidVerse(curFile, vs, "Josh-18.html#vs13", 18, 19)
                || isValidVerse(curFile, vs, "Josh-19.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs10")
                || isValidVerse(curFile, vs, "Job-09.html#vs11")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs13");
    } // isLangsgaan

    public static boolean isMeegaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs4")
                || isValidVerse(curFile, vs, "Gen-18.html#vs16")
                || isValidVerse(curFile, vs, "Gen-24.html#vs32")
                || isValidVerse(curFile, vs, "Gen-50.html#vs7", 9)
                || isValidVerse(curFile, vs, "Num-10.html#vs29", 30)
                || isValidVerse(curFile, vs, "Num-22.html#vs13", 14, 20, 21, 35, 39)
                || isValidVerse(curFile, vs, "Judg-04.html#vs8")
                || isValidVerse(curFile, vs, "Judg-11.html#vs11")
                || isValidVerse(curFile, vs, "Judg-12.html#vs1")
                || isValidVerse(curFile, vs, "Judg-17.html#vs10")
                || isValidVerse(curFile, vs, "Judg-18.html#vs19")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs7", 18)
                || isValidVerse(curFile, vs, "1Sam-01.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs26")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs16")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs2", 11)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs40")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs3", 4)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-06.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs13")
                || isValidVerse(curFile, vs, "Prov-01.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs16")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs3")
                || isValidVerse(curFile, vs, "Zech-08.html#vs23")
                || isValidVerse(curFile, vs, "Mark-05.html#vs24")
                || isValidVerse(curFile, vs, "Luke-02.html#vs51")
                || isValidVerse(curFile, vs, "Luke-07.html#vs6", 11)
                || isValidVerse(curFile, vs, "Luke-24.html#vs1")
                || isValidVerse(curFile, vs, "John-06.html#vs66")
                || isValidVerse(curFile, vs, "John-21.html#vs3")
                || isValidVerse(curFile, vs, "Acts-09.html#vs39")
                || isValidVerse(curFile, vs, "Acts-10.html#vs23")
                || isValidVerse(curFile, vs, "Acts-11.html#vs12")
                || isValidVerse(curFile, vs, "Acts-16.html#vs3")
                || isValidVerse(curFile, vs, "Acts-21.html#vs16");
    } // isMeegaan

    public static boolean isNagaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-22.html#vs8");
    } // isNagaan

    public static boolean isOmgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-34.html#vs8")
                || isValidVerse(curFile, vs, "Ps-025.html#vs14")
                || isValidVerse(curFile, vs, "Ps-026.html#vs4")
                || isValidVerse(curFile, vs, "Prov-03.html#vs32")
                || isValidVerse(curFile, vs, "Prov-22.html#vs24")
                || isValidVerse(curFile, vs, "Eccl-06.html#vs8")
                || isValidVerse(curFile, vs, "Acts-07.html#vs19");
    } // isOmgaan

    public static boolean isOmhooggaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-28.html#vs13")
                || isValidVerse(curFile, vs, "Rev-11.html#vs12");
    } // isOmhooggaan

    public static boolean isOmlaaggaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-28.html#vs13");
    } // isOmlaaggaan

    public static boolean isOpgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-30.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs23")
                || isValidVerse(curFile, vs, "Job-09.html#vs7")
                || isValidVerse(curFile, vs, "Job-25.html#vs3")
                || isValidVerse(curFile, vs, "Isa-37.html#vs14")
                || isValidVerse(curFile, vs, "Isa-60.html#vs1")
                || isValidVerse(curFile, vs, "Nah-3.html#vs17");
    } // isOpgaan

    public static boolean isRondgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-07.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-17.html#vs9")
                || isValidVerse(curFile, vs, "Prov-06.html#vs12")
                || isValidVerse(curFile, vs, "Isa-23.html#vs16")
                || isValidVerse(curFile, vs, "Jer-06.html#vs28")
                || isValidVerse(curFile, vs, "Jer-09.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs6")
                || isValidVerse(curFile, vs, "Luke-07.html#vs17")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs8");
    } // isRondgaan

    public static boolean isTeBovenGaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te boven gaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-49.html#vs26")
                || isValidVerse(curFile, vs, "Num-03.html#vs46", 48 , 49)
                || isValidVerse(curFile, vs, "Ps-135.html#vs5")
                || isValidVerse(curFile, vs, "Prov-31.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs19")
                || isValidVerse(curFile, vs, "Matt-06.html#vs26")
                || isValidVerse(curFile, vs, "Matt-10.html#vs31")
                || isValidVerse(curFile, vs, "Matt-12.html#vs12")
                || isValidVerse(curFile, vs, "Luke-12.html#vs7", 24)
                || isValidVerse(curFile, vs, "Eph-3.html#vs19")
                || isValidVerse(curFile, vs, "Phil-4.html#vs7");
    } // isTeBovenGaan

    public static boolean isTeGrondeGaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te gronde gaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Dan-02.html#vs44")
                || isValidVerse(curFile, vs, "Dan-06.html#vs27")
                || isValidVerse(curFile, vs, "Dan-07.html#vs14")
                || isValidVerse(curFile, vs, "Matt-05.html#vs29", 30)
                || isValidVerse(curFile, vs, "Eph-4.html#vs22")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs12");
    } // isTeGrondeGaan

    public static boolean isTeRusteGaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te ruste gaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-31.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs10")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs21", 43)
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs20", 31)
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs8", 24)
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs6", 28)
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs40", 51)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs35")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs9", 13)
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs16", 22, 29)
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs7", 22, 38)
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs31")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs2", 23)
                || isValidVerse(curFile, vs, "2Chr-27.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs20");
    } // isTeRusteGaan

    public static boolean isTekeergaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-19.html#vs28")
                || isValidVerse(curFile, vs, "Ps-038.html#vs11")
                || isValidVerse(curFile, vs, "Isa-37.html#vs29")
                || isValidVerse(curFile, vs, "Luke-11.html#vs53");
    } // isTekeergaan

    public static boolean isTenOnderGaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ten onder gaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-24.html#vs20", 24)
                || isValidVerse(curFile, vs, "Deut-20.html#vs20")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs13")
                || isValidVerse(curFile, vs, "Job-19.html#vs10")
                || isValidVerse(curFile, vs, "Jer-48.html#vs46");
    } // isTenOnderGaan

    public static boolean isTeruggaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs56")
                || isValidVerse(curFile, vs, "Gen-43.html#vs13", 14)
                || isValidVerse(curFile, vs, "Exod-18.html#vs27")
                || isValidVerse(curFile, vs, "Num-24.html#vs14")
                || isValidVerse(curFile, vs, "Judg-09.html#vs55")
                || isValidVerse(curFile, vs, "Judg-14.html#vs2")
                || isValidVerse(curFile, vs, "Judg-18.html#vs26")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs20")
                || isValidVerse(curFile, vs, "1Sam-03.html#vs5", 6, 9)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs43")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs9")
                || isValidVerse(curFile, vs, "Neh-02.html#vs15")
                || isValidVerse(curFile, vs, "Isa-38.html#vs8")
                || isValidVerse(curFile, vs, "Jer-41.html#vs14")
                || isValidVerse(curFile, vs, "Luke-18.html#vs14");
    } // isTeruggaan

    public static boolean isVerdergaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-22.html#vs26")
                || isValidVerse(curFile, vs, "Judg-14.html#vs7")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs40")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs22")
                || isValidVerse(curFile, vs, "Neh-02.html#vs14")
                || isValidVerse(curFile, vs, "Job-36.html#vs1")
                || isValidVerse(curFile, vs, "Isa-29.html#vs14")
                || isValidVerse(curFile, vs, "Isa-57.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs14")
                || isValidVerse(curFile, vs, "Mic-2.html#vs3")
                || isValidVerse(curFile, vs, "Matt-04.html#vs21")
                || isValidVerse(curFile, vs, "Matt-09.html#vs9")
                || isValidVerse(curFile, vs, "Matt-26.html#vs39")
                || isValidVerse(curFile, vs, "Mark-02.html#vs14")
                || isValidVerse(curFile, vs, "Mark-14.html#vs35")
                || isValidVerse(curFile, vs, "Luke-24.html#vs28")
                || isValidVerse(curFile, vs, "Acts-12.html#vs3");
    } // isVerdergaan

    public static boolean isVoorbijgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs3")
                || isValidVerse(curFile, vs, "Exod-07.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs11")
                || isValidVerse(curFile, vs, "Job-06.html#vs15")
                || isValidVerse(curFile, vs, "Job-09.html#vs11")
                || isValidVerse(curFile, vs, "Ps-037.html#vs36")
                || isValidVerse(curFile, vs, "Ps-057.html#vs2")
                || isValidVerse(curFile, vs, "Ps-090.html#vs9")
                || isValidVerse(curFile, vs, "Ps-141.html#vs10")
                || isValidVerse(curFile, vs, "Prov-04.html#vs15")
                || isValidVerse(curFile, vs, "Prov-19.html#vs11")
                || isValidVerse(curFile, vs, "Isa-40.html#vs27")
                || isValidVerse(curFile, vs, "Jer-08.html#vs13")
                || isValidVerse(curFile, vs, "Jer-46.html#vs17")
                || isValidVerse(curFile, vs, "Dan-04.html#vs23")
                || isValidVerse(curFile, vs, "Dan-09.html#vs2")
                || isValidVerse(curFile, vs, "Zeph-2.html#vs2")
                || isValidVerse(curFile, vs, "Matt-08.html#vs28")
                || isValidVerse(curFile, vs, "Matt-26.html#vs42")
                || isValidVerse(curFile, vs, "Mark-13.html#vs30")
                || isValidVerse(curFile, vs, "Mark-14.html#vs35")
                || isValidVerse(curFile, vs, "Luke-10.html#vs31", 32)
                || isValidVerse(curFile, vs, "Luke-11.html#vs42")
                || isValidVerse(curFile, vs, "Luke-18.html#vs36")
                || isValidVerse(curFile, vs, "Luke-21.html#vs32")
                || isValidVerse(curFile, vs, "Rom-03.html#vs25")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs31")
                || isValidVerse(curFile, vs, "1John-2.html#vs8", 17);
    } // isVoorbijgaan

    public static boolean isVoorgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-12.html#vs2")
                || isValidVerse(curFile, vs, "Matt-02.html#vs9")
                || isValidVerse(curFile, vs, "Matt-28.html#vs7")
                || isValidVerse(curFile, vs, "Mark-10.html#vs32")
                || isValidVerse(curFile, vs, "Rom-12.html#vs10")
                || isValidVerse(curFile, vs, "Titus-3.html#vs14");
    } // isVoorgaan

    public static boolean isVoortgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-13.html#vs6", 11)
                || isValidVerse(curFile, vs, "Ps-084.html#vs8")
                || isValidVerse(curFile, vs, "Prov-22.html#vs3")
                || isValidVerse(curFile, vs, "Jer-07.html#vs24")
                || isValidVerse(curFile, vs, "Jer-09.html#vs3")
                || isValidVerse(curFile, vs, "Mic-6.html#vs16");
    } // isVoortgaan

    public static boolean isWeggaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-04.html#vs16")
                || isValidVerse(curFile, vs, "Gen-12.html#vs5")
                || isValidVerse(curFile, vs, "Gen-18.html#vs33")
                || isValidVerse(curFile, vs, "Gen-23.html#vs3")
                || isValidVerse(curFile, vs, "Gen-25.html#vs34")
                || isValidVerse(curFile, vs, "Gen-26.html#vs16", 17, 31)
                || isValidVerse(curFile, vs, "Gen-29.html#vs7")
                || isValidVerse(curFile, vs, "Gen-34.html#vs26")
                || isValidVerse(curFile, vs, "Gen-37.html#vs12")
                || isValidVerse(curFile, vs, "Gen-38.html#vs11", 19)
                || isValidVerse(curFile, vs, "Gen-41.html#vs46")
                || isValidVerse(curFile, vs, "Gen-47.html#vs10")
                || isValidVerse(curFile, vs, "Exod-04.html#vs18")
                || isValidVerse(curFile, vs, "Exod-08.html#vs12", 30)
                || isValidVerse(curFile, vs, "Exod-09.html#vs33")
                || isValidVerse(curFile, vs, "Exod-10.html#vs6", 18, 28)
                || isValidVerse(curFile, vs, "Exod-11.html#vs8")
                || isValidVerse(curFile, vs, "Exod-12.html#vs31")
                || isValidVerse(curFile, vs, "Exod-35.html#vs20")
                || isValidVerse(curFile, vs, "Num-12.html#vs9")
                || isValidVerse(curFile, vs, "Num-20.html#vs6")
                || isValidVerse(curFile, vs, "Josh-02.html#vs21", 22)
                || isValidVerse(curFile, vs, "Judg-03.html#vs19")
                || isValidVerse(curFile, vs, "Judg-06.html#vs18")
                || isValidVerse(curFile, vs, "Judg-08.html#vs29")
                || isValidVerse(curFile, vs, "Judg-10.html#vs14")
                || isValidVerse(curFile, vs, "Judg-19.html#vs2", 5, 7, 8, 9)
                || isValidVerse(curFile, vs, "Ruth-1.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs27")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs6", 27)
                || isValidVerse(curFile, vs, "1Sam-20.html#vs43")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs12", 13)
                || isValidVerse(curFile, vs, "1Sam-28.html#vs25")
                || isValidVerse(curFile, vs, "1Sam-29.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs9", 15)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs50")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs5", 24)
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs11", 24)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs14")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs43")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs5")
                || isValidVerse(curFile, vs, "Esth-04.html#vs17")
                || isValidVerse(curFile, vs, "Job-01.html#vs12")
                || isValidVerse(curFile, vs, "Job-02.html#vs7")
                || isValidVerse(curFile, vs, "Job-15.html#vs30")
                || isValidVerse(curFile, vs, "Job-16.html#vs6")
                || isValidVerse(curFile, vs, "Job-39.html#vs7")
                || isValidVerse(curFile, vs, "Ps-006.html#vs9")
                || isValidVerse(curFile, vs, "Ps-119.html#vs115")
                || isValidVerse(curFile, vs, "Ps-139.html#vs19")
                || isValidVerse(curFile, vs, "Ps-146.html#vs4")
                || isValidVerse(curFile, vs, "Isa-48.html#vs20")
                || isValidVerse(curFile, vs, "Isa-52.html#vs11")
                || isValidVerse(curFile, vs, "Jer-50.html#vs")
                || isValidVerse(curFile, vs, "Jer-51.html#vs45")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs7", 18)
                || isValidVerse(curFile, vs, "Matt-04.html#vs10")
                || isValidVerse(curFile, vs, "Matt-07.html#vs23")
                || isValidVerse(curFile, vs, "Matt-09.html#vs31")
                || isValidVerse(curFile, vs, "Matt-12.html#vs14", 45)
                || isValidVerse(curFile, vs, "Matt-13.html#vs25")
                || isValidVerse(curFile, vs, "Matt-16.html#vs4", 23)
                || isValidVerse(curFile, vs, "Matt-19.html#vs22")
                || isValidVerse(curFile, vs, "Matt-22.html#vs22")
                || isValidVerse(curFile, vs, "Matt-24.html#vs1")
                || isValidVerse(curFile, vs, "Matt-25.html#vs16", 18, 41)
                || isValidVerse(curFile, vs, "Matt-27.html#vs60")
                || isValidVerse(curFile, vs, "Matt-28.html#vs8")
                || isValidVerse(curFile, vs, "Mark-01.html#vs24", 25, 26)
                || isValidVerse(curFile, vs, "Mark-05.html#vs17" , 20)
                || isValidVerse(curFile, vs, "Mark-06.html#vs1", 24)
                || isValidVerse(curFile, vs, "Mark-08.html#vs33")
                || isValidVerse(curFile, vs, "Mark-09.html#vs25")
                || isValidVerse(curFile, vs, "Mark-10.html#vs22")
                || isValidVerse(curFile, vs, "Mark-12.html#vs12")
                || isValidVerse(curFile, vs, "Mark-14.html#vs10")
                || isValidVerse(curFile, vs, "Luke-01.html#vs38")
                || isValidVerse(curFile, vs, "Luke-04.html#vs8", 30, 34, 35)
                || isValidVerse(curFile, vs, "Luke-05.html#vs8", 27)
                || isValidVerse(curFile, vs, "Luke-08.html#vs37")
                || isValidVerse(curFile, vs, "Luke-13.html#vs27", 31)
                || isValidVerse(curFile, vs, "Luke-22.html#vs4", 13)
                || isValidVerse(curFile, vs, "Luke-24.html#vs12")
                || isValidVerse(curFile, vs, "John-04.html#vs28")
                || isValidVerse(curFile, vs, "John-05.html#vs15")
                || isValidVerse(curFile, vs, "John-07.html#vs3")
                || isValidVerse(curFile, vs, "John-08.html#vs9", 59)
                || isValidVerse(curFile, vs, "John-11.html#vs28")
                || isValidVerse(curFile, vs, "John-12.html#vs36")
                || isValidVerse(curFile, vs, "Acts-01.html#vs4")
                || isValidVerse(curFile, vs, "Acts-05.html#vs41")
                || isValidVerse(curFile, vs, "Acts-16.html#vs18")
                || isValidVerse(curFile, vs, "Acts-18.html#vs1")
                || isValidVerse(curFile, vs, "Acts-19.html#vs9")
                || isValidVerse(curFile, vs, "Acts-28.html#vs29")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs17")
                || isValidVerse(curFile, vs, "2Cor-12.html#vs8")
                || isValidVerse(curFile, vs, "Heb-11.html#vs8")
                || isValidVerse(curFile, vs, "Rev-18.html#vs4");
    } // isWeggaan

    private static boolean isGaan(final File curFile, final String vs, final String arg) {
        return !isAchternagaan(curFile, vs)
                && !isBinnengaan(curFile, vs)
                && !isDoorHetVuurGaan(curFile, vs, arg)
                && !isDoorgaan(curFile, vs)
                && !isHeengaan(curFile, vs)
                && !isLangsgaan(curFile, vs)
                && !isMeegaan(curFile, vs)
                && !isNagaan(curFile, vs)
                && !isOmgaan(curFile, vs)
                && !isOmhooggaan(curFile, vs)
                && !isOmlaaggaan(curFile, vs)
                && !isOpgaan(curFile, vs)
                && !isRondgaan(curFile, vs)
                && !isTeBovenGaan(curFile, vs, arg)
                && !isTeGrondeGaan(curFile, vs, arg)
                && !isTeRusteGaan(curFile, vs, arg)
                && !isTekeergaan(curFile, vs)
                && !isTenOnderGaan(curFile, vs, arg)
                && !isTeruggaan(curFile, vs)
                && !isVerdergaan(curFile, vs)
                && !isVoorbijgaan(curFile, vs)
                && !isVoorgaan(curFile, vs)
                && !isVoortgaan(curFile, vs)
                && !isWeggaan(curFile, vs);
    }  // isGaan

}
