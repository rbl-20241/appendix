package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTrekken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aantrekken" -> isAantrekken(curFile, vs);
            case "aftrekken" -> isAftrekken(curFile, vs);
            case "binnentrekken" -> isBinnentrekken(curFile, vs);
            case "doortrekken" -> isDoortrekken(curFile, vs);
            case "heentrekken" -> isHeentrekken(curFile, vs);
            case "intrek" -> isIntrek(curFile, vs);
            case "intrekken" -> isIntrekken(curFile, vs);
            case "lostrekken" -> isLostrekken(curFile, vs);
            case "meetrekken" -> isMeetrekken(curFile, vs);
            case "omhoogtrekken" -> isOmhoogtrekken(curFile, vs);
            case "optrekken" -> isOptrekken(curFile, vs);
            case "overtrekken" -> isOvertrekken();
            case "rondtrekken" -> isRondtrekken(curFile, vs);
            case "terugtrekken" -> isTerugtrekken(curFile, vs);
            case "uittrekken" -> isUittrekken(curFile, vs);
            case "verdertrekken" -> isVerdertrekken(curFile, vs);
            case "voorbijtrekken" -> isVoorbijtrekken(curFile, vs);
            case "voortrekken" -> isVoortrekken(curFile, vs);
            case "wegtrekken" -> isWegtrekken(curFile, vs);
            case "trekken" -> (!isAantrekken(curFile, vs)
                    && !isAftrekken(curFile, vs)
                    && !isBinnentrekken(curFile, vs)
                    && !isDoortrekken(curFile, vs)
                    && !isHeentrekken(curFile, vs)
                    && !isIntrek(curFile, vs)
                    && !isIntrekken(curFile, vs)
                    && !isLostrekken(curFile, vs)
                    && !isMeetrekken(curFile, vs)
                    && !isOmhoogtrekken(curFile, vs)
                    && !isOptrekken(curFile, vs)
                    && !isOvertrekken()
                    && !isRondtrekken(curFile, vs)
                    && !isTerugtrekken(curFile, vs)
                    && !isUittrekken(curFile, vs)
                    && !isVerdertrekken(curFile, vs)
                    && !isVoorbijtrekken(curFile, vs)
                    && !isVoortrekken(curFile, vs)
                    && !isWegtrekken(curFile, vs))
                    || isValidVerse(curFile, vs, "Judg-21.html#vs24")
                    || isValidVerse(curFile, vs, "Num-10.html#vs33")
                    || isValidVerse(curFile, vs, "Judg-11.html#vs29")
                    || isValidVerse(curFile, vs, "Judg-20.html#vs28")
                    || isValidVerse(curFile, vs, "Judg-21.html#vs24")
                    || isValidVerse(curFile, vs, "1Kgs-22.html#vs30")
                    || isValidVerse(curFile, vs, "2Kgs-17.html#vs5")
                    || isValidVerse(curFile, vs, "2Chr-20.html#vs1")
                    || isValidVerse(curFile, vs, "2Chr-35.html#vs20")
                    || isValidVerse(curFile, vs, "Job-34.html#vs19")
                    || isValidVerse(curFile, vs, "Mic-2.html#vs13");
            default -> true;
        };
    }

    private static boolean isAantrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs15")
                || isValidVerse(curFile, vs, "Gen-28.html#vs20")
                || isValidVerse(curFile, vs, "Gen-38.html#vs19")
                || isValidVerse(curFile, vs, "Lev-08.html#vs7")
                || isValidVerse(curFile, vs, "Lev-21.html#vs10")
                || isValidVerse(curFile, vs, "Num-20.html#vs26", 28)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs31")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs2")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs30")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs29")
                || isValidVerse(curFile, vs, "Esth-04.html#vs4")
                || isValidVerse(curFile, vs, "Isa-52.html#vs1")
                || isValidVerse(curFile, vs, "Isa-59.html#vs17")
                || isValidVerse(curFile, vs, "Jer-46.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs10")
                || isValidVerse(curFile, vs, "Jonah-3.html#vs5")
                || isValidVerse(curFile, vs, "Zech-03.html#vs5")
                || isValidVerse(curFile, vs, "Matt-27.html#vs31")
                || isValidVerse(curFile, vs, "Mark-15.html#vs20")
                || isValidVerse(curFile, vs, "Luke-10.html#vs40")
                || isValidVerse(curFile, vs, "Luke-15.html#vs22")
                || isValidVerse(curFile, vs, "Acts-12.html#vs21")
                || isValidVerse(curFile, vs, "Acts-18.html#vs17");
    }  // isAantrekken

    public static boolean isAftrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-10.html#vs6")
                || isValidVerse(curFile, vs, "Job-36.html#vs7");
    } // isAftrekken

    private static boolean isBinnentrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs29")
                || isValidVerse(curFile, vs, "Judg-18.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs40")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs1")
                || isValidVerse(curFile, vs, "Obad-1.html#vs13");
    }  // isBinnentrekken

    public static boolean isDoortrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs6")
                || isValidVerse(curFile, vs, "Gen-41.html#vs46")
                || isValidVerse(curFile, vs, "Exod-12.html#vs12")
                || isValidVerse(curFile, vs, "Num-20.html#vs17", 18, 21)
                || isValidVerse(curFile, vs, "Num-21.html#vs22", 23)
                || isValidVerse(curFile, vs, "Deut-02.html#vs4", 27, 28, 30)
                || isValidVerse(curFile, vs, "Deut-29.html#vs16")
                || isValidVerse(curFile, vs, "Josh-08.html#vs13")
                || isValidVerse(curFile, vs, "Josh-14.html#vs10")
                || isValidVerse(curFile, vs, "Josh-18.html#vs8")
                || isValidVerse(curFile, vs, "Judg-11.html#vs16", 17, 18, 19, 20, 29)
                || isValidVerse(curFile, vs, "1Sam-09.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs29")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs5")
                || isValidVerse(curFile, vs, "Isa-10.html#vs28", 29)
                || isValidVerse(curFile, vs, "Isa-60.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs4", 5)
                || isValidVerse(curFile, vs, "Ezek-14.html#vs15", 17)
                || isValidVerse(curFile, vs, "Ezek-39.html#vs14", 15)
                || isValidVerse(curFile, vs, "Amos-5.html#vs17")
                || isValidVerse(curFile, vs, "Mic-2.html#vs13")
                || isValidVerse(curFile, vs, "Nah-1.html#vs15")
                || isValidVerse(curFile, vs, "Luke-13.html#vs22")
                || isValidVerse(curFile, vs, "Luke-17.html#vs11")
                || isValidVerse(curFile, vs, "Acts-08.html#vs4");
    } // isDoortrekken

    public static boolean isHeentrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs28");
    } // isHeentrekken

    private static boolean isIntrek(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs1")
                || isValidVerse(curFile, vs, "Luke-19.html#vs7")
                || isValidVerse(curFile, vs, "John-14.html#vs23");
    }  // isIntrek

    private static boolean isIntrekken(final File curFile, final String vs) {
        if (isIntrek(curFile, vs)) {
            return false;
        }
        
        return isValidVerse(curFile, vs, "2Sam-18.html#vs6")
                || isValidVerse(curFile, vs, "Jer-06.html#vs25")
                || isValidVerse(curFile, vs, "Joel-2.html#vs10");
    }  // isIntrekken

    private static boolean isLostrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-16.html#vs3", 14);
    }  // isLostrekken

    private static boolean isMeetrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-12.html#vs38")
                || isValidVerse(curFile, vs, "Judg-01.html#vs17")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs28")
                || isValidVerse(curFile, vs, "Song-1.html#vs4")
                || isValidVerse(curFile, vs, "Luke-14.html#vs25");
    }  // isMeetrekken

    private static boolean isOmhoogtrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-36.html#vs27")
                || isValidVerse(curFile, vs, "Jer-38.html#vs10", 13)
                || isValidVerse(curFile, vs, "Jonah-2.html#vs6");
    }  // isOmhoogtrekken

    private static boolean isOptrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-14.html#vs3")
                || isValidVerse(curFile, vs, "Exod-17.html#vs9")
                || isValidVerse(curFile, vs, "Num-32.html#vs9")
                || isValidVerse(curFile, vs, "Deut-01.html#vs21", 42)
                || isValidVerse(curFile, vs, "Deut-03.html#vs1")
                || isValidVerse(curFile, vs, "Deut-09.html#vs23")
                || isValidVerse(curFile, vs, "Josh-07.html#vs2", 4)
                || isValidVerse(curFile, vs, "Josh-08.html#vs1", 3, 10, 11)
                || isValidVerse(curFile, vs, "Josh-10.html#vs5", 7, 29, 33, 36)
                || isValidVerse(curFile, vs, "Judg-01.html#vs3", 4, 10, 11, 16, 22)
                || isValidVerse(curFile, vs, "Judg-04.html#vs6", 10)
                || isValidVerse(curFile, vs, "Judg-06.html#vs3", 5, 35)
                || isValidVerse(curFile, vs, "Judg-08.html#vs8")
                || isValidVerse(curFile, vs, "Judg-11.html#vs29", 32)
                || isValidVerse(curFile, vs, "Judg-12.html#vs3")
                || isValidVerse(curFile, vs, "Judg-15.html#vs9")
                || isValidVerse(curFile, vs, "Judg-18.html#vs12")
                || isValidVerse(curFile, vs, "Judg-20.html#vs23", 26, 28, 30, 37)
                || isValidVerse(curFile, vs, "Judg-21.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-05.html#vs6", 22)
                || isValidVerse(curFile, vs, "2Sam-22.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs1", 26)
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs12", 29)
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs3", 5)
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs13", 17, 25)
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs8", 10)
                || isValidVerse(curFile, vs, "1Chr-27.html#vs32")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs2", 11, 14, 28)
                || isValidVerse(curFile, vs, "2Chr-20.html#vs1", 17)
                || isValidVerse(curFile, vs, "2Chr-21.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs6")
                || isValidVerse(curFile, vs, "Ezra-01.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs6", 7)
                || isValidVerse(curFile, vs, "Ps-018.html#vs17")
                || isValidVerse(curFile, vs, "Ps-022.html#vs8")
                || isValidVerse(curFile, vs, "Ps-122.html#vs4")
                || isValidVerse(curFile, vs, "Prov-30.html#vs27")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs14")
                || isValidVerse(curFile, vs, "Isa-21.html#vs2")
                || isValidVerse(curFile, vs, "Isa-36.html#vs10")
                || isValidVerse(curFile, vs, "Hos-12.html#vs1")
                || isValidVerse(curFile, vs, "Mic-2.html#vs13")
                || isValidVerse(curFile, vs, "Nah-2.html#vs1");
    }  // isOptrekken

    private static boolean isOvertrekken() {
        return false;
    }  // isOvertrekken

    private static boolean isRondtrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-34.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs2")
                || isValidVerse(curFile, vs, "Ps-059.html#vs7")
                || isValidVerse(curFile, vs, "Jer-05.html#vs1")
                || isValidVerse(curFile, vs, "Jer-14.html#vs18")
                || isValidVerse(curFile, vs, "Amos-8.html#vs12")
                || isValidVerse(curFile, vs, "Matt-04.html#vs23")
                || isValidVerse(curFile, vs, "Matt-09.html#vs35")
                || isValidVerse(curFile, vs, "Mark-06.html#vs6")
                || isValidVerse(curFile, vs, "John-07.html#vs1");
    }  // isRondtrekken

    private static boolean isTerugtrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-07.html#vs1")
                || isValidVerse(curFile, vs, "Num-11.html#vs30")
                || isValidVerse(curFile, vs, "Num-16.html#vs24", 27, 45)
                || isValidVerse(curFile, vs, "Josh-08.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs16")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs15")
                || isValidVerse(curFile, vs, "Ps-074.html#vs11")
                || isValidVerse(curFile, vs, "Ps-104.html#vs22")
                || isValidVerse(curFile, vs, "Eccl-11.html#vs6")
                || isValidVerse(curFile, vs, "John-06.html#vs15", 66)
                || isValidVerse(curFile, vs, "Gal-2.html#vs12");
    }  // isTerugtrekken

    private static boolean isUittrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs14")
                || isValidVerse(curFile, vs, "Gen-50.html#vs24")
                || isValidVerse(curFile, vs, "Exod-02.html#vs10")
                || isValidVerse(curFile, vs, "Exod-04.html#vs7")
                || isValidVerse(curFile, vs, "Exod-13.html#vs18")
                || isValidVerse(curFile, vs, "Exod-17.html#vs5")
                || isValidVerse(curFile, vs, "Num-10.html#vs33")
                || isValidVerse(curFile, vs, "Num-20.html#vs26", 28)
                || isValidVerse(curFile, vs, "Num-21.html#vs33")
                || isValidVerse(curFile, vs, "Num-22.html#vs5", 11)
                || isValidVerse(curFile, vs, "Deut-02.html#vs32")
                || isValidVerse(curFile, vs, "Deut-03.html#vs1")
                || isValidVerse(curFile, vs, "Deut-16.html#vs3", 6)
                || isValidVerse(curFile, vs, "Deut-24.html#vs9")
                || isValidVerse(curFile, vs, "Deut-29.html#vs7")
                || isValidVerse(curFile, vs, "Josh-05.html#vs4", 5, 6)
                || isValidVerse(curFile, vs, "Josh-06.html#vs8")
                || isValidVerse(curFile, vs, "Josh-11.html#vs4")
                || isValidVerse(curFile, vs, "Josh-15.html#vs15")
                || isValidVerse(curFile, vs, "Josh-19.html#vs47")
                || isValidVerse(curFile, vs, "Judg-03.html#vs10")
                || isValidVerse(curFile, vs, "Judg-09.html#vs29", 38, 39, 43)
                || isValidVerse(curFile, vs, "Judg-11.html#vs13")
                || isValidVerse(curFile, vs, "Judg-20.html#vs1", 21, 31)
                || isValidVerse(curFile, vs, "Ruth-4.html#vs7", 8)
                || isValidVerse(curFile, vs, "1Sam-11.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs24")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs8", 16)
                || isValidVerse(curFile, vs, "2Sam-13.html#vs39")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs4", 6)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs16", 17, 19, 21)
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs7")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs9", 16)
                || isValidVerse(curFile, vs, "2Chr-14.html#vs9", 10)
                || isValidVerse(curFile, vs, "Neh-04.html#vs23")
                || isValidVerse(curFile, vs, "Neh-13.html#vs25")
                || isValidVerse(curFile, vs, "Job-24.html#vs5")
                || isValidVerse(curFile, vs, "Job-39.html#vs24")
                || isValidVerse(curFile, vs, "Ps-022.html#vs10")
                || isValidVerse(curFile, vs, "Ps-114.html#vs1")
                || isValidVerse(curFile, vs, "Isa-32.html#vs11")
                || isValidVerse(curFile, vs, "Zech-03.html#vs4")
                || isValidVerse(curFile, vs, "Zech-06.html#vs6", 7)
                || isValidVerse(curFile, vs, "Matt-27.html#vs31")
                || isValidVerse(curFile, vs, "Mark-15.html#vs20")
                || isValidVerse(curFile, vs, "Rev-06.html#vs2", 4);
    }  // isUittrekken

    public static boolean isVerdertrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs9")
                || isValidVerse(curFile, vs, "Exod-13.html#vs21")
                || isValidVerse(curFile, vs, "Num-11.html#vs35")
                || isValidVerse(curFile, vs, "Num-14.html#vs25")
                || isValidVerse(curFile, vs, "Deut-02.html#vs8")
                || isValidVerse(curFile, vs, "Josh-06.html#vs7")
                || isValidVerse(curFile, vs, "Josh-09.html#vs17")
                || isValidVerse(curFile, vs, "Josh-10.html#vs29", 31, 34)
                || isValidVerse(curFile, vs, "Josh-18.html#vs3")
                || isValidVerse(curFile, vs, "Judg-08.html#vs11")
                || isValidVerse(curFile, vs, "Judg-11.html#vs18")
                || isValidVerse(curFile, vs, "Judg-18.html#vs13", 21)
                || isValidVerse(curFile, vs, "Judg-19.html#vs11", 14)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs9")
                || isValidVerse(curFile, vs, "Isa-31.html#vs9")
                || isValidVerse(curFile, vs, "Isa-41.html#vs3")
                || isValidVerse(curFile, vs, "Jer-41.html#vs17");
    } // isVerdertrekken

    private static boolean isVoorbijtrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-04.html#vs15")
                || isValidVerse(curFile, vs, "Isa-28.html#vs18")
                || isValidVerse(curFile, vs, "Isa-30.html#vs32")
                || isValidVerse(curFile, vs, "Jer-18.html#vs16")
                || isValidVerse(curFile, vs, "Jer-19.html#vs8")
                || isValidVerse(curFile, vs, "Jer-49.html#vs17")
                || isValidVerse(curFile, vs, "Jer-50.html#vs13")
                || isValidVerse(curFile, vs, "Mic-1.html#vs11");
    }  // isVoorbijtrekken

    private static boolean isVoortrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-34.html#vs19")
                || isValidVerse(curFile, vs, "Prov-18.html#vs5");
    }  // isVoortrekken

    private static boolean isWegtrekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs1")
                || isValidVerse(curFile, vs, "Gen-14.html#vs11", 12)
                || isValidVerse(curFile, vs, "Gen-45.html#vs25")
                || isValidVerse(curFile, vs, "Judg-21.html#vs23", 24)
                || isValidVerse(curFile, vs, "Ruth-1.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs36")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs4")
                || isValidVerse(curFile, vs, "Isa-37.html#vs37")
                || isValidVerse(curFile, vs, "Jer-37.html#vs5")
                || isValidVerse(curFile, vs, "Lam-1.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs12")
                || isValidVerse(curFile, vs, "Acts-20.html#vs30");
    }  // isWegtrekken

}
