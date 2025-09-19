package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSluiten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aansluiten" -> isAansluiten(curFile, vs);
            case "afsluiten" -> isAfsluiten(curFile, vs);
            case "gesloten (bijvoeglijk naamwoord)" -> isGesloten(curFile, vs);
            case "insluiten" -> isInsluiten(curFile, vs);
            case "ogen sluiten" -> isOgenSluiten(curFile, vs);
            case "opsluiten" -> isOpsluiten(curFile, vs);
            case "toesluiten" -> isToesluiten(curFile, vs);
            case "uitsluiten" -> isUitsluiten();
            case "verbond sluiten" -> isVerbondSluiten(curFile, vs);
            case "verdrag sluiten" -> isVerdragSluiten(curFile, vs);
            case "vrede sluiten" -> isVredeSluiten(curFile, vs);
            case "sluiten" -> isSluiten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAansluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-30.html#vs7")
                || isValidVerse(curFile, vs, "Acts-05.html#vs13")
                || isValidVerse(curFile, vs, "Acts-09.html#vs26")
                || isValidVerse(curFile, vs, "Acts-17.html#vs4", 34);
    } // isAansluiten

    public static boolean isAfsluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-035.html#vs3");
    } // isAfsluiten

    public static boolean isGesloten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-12.html#vs38")
                || isValidVerse(curFile, vs, "Prov-30.html#vs16")
                || isValidVerse(curFile, vs, "Song-4.html#vs12");
    } // isGesloten

    public static boolean isInsluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-139.html#vs5");
    } // isInsluiten

    public static boolean isOgenSluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-46.html#vs4")
                || isValidVerse(curFile, vs, "Lev-20.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs3")
                || isValidVerse(curFile, vs, "Isa-06.html#vs10")
                || isValidVerse(curFile, vs, "Isa-29.html#vs10")
                || isValidVerse(curFile, vs, "Isa-33.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs26")
                || isValidVerse(curFile, vs, "Luke-24.html#vs16");
    } // isOgenSluiten

    public static boolean isOpsluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-06.html#vs10")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs4")
                || isValidVerse(curFile, vs, "Job-12.html#vs14")
                || isValidVerse(curFile, vs, "Job-24.html#vs16")
                || isValidVerse(curFile, vs, "Ps-033.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs24")
                || isValidVerse(curFile, vs, "Rev-20.html#vs3");
    } // isOpsluiten

    public static boolean isToesluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-02.html#vs21")
                || isValidVerse(curFile, vs, "Gen-07.html#vs16");
    } // isToesluiten

    public static boolean isUitsluiten() {
        return false;
    } // isUitsluiten

    public static boolean isVerbondSluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs18")
                || isValidVerse(curFile, vs, "Gen-17.html#vs2")
                || isValidVerse(curFile, vs, "Gen-21.html#vs27", 32)
                || isValidVerse(curFile, vs, "Gen-26.html#vs28")
                || isValidVerse(curFile, vs, "Gen-31.html#vs44")
                || isValidVerse(curFile, vs, "Exod-06.html#vs3")
                || isValidVerse(curFile, vs, "Exod-23.html#vs32")
                || isValidVerse(curFile, vs, "Exod-24.html#vs8")
                || isValidVerse(curFile, vs, "Exod-34.html#vs10", 12, 15, 27)
                || isValidVerse(curFile, vs, "Deut-04.html#vs23", 31)
                || isValidVerse(curFile, vs, "Deut-05.html#vs2", 3)
                || isValidVerse(curFile, vs, "Deut-07.html#vs2")
                || isValidVerse(curFile, vs, "Deut-08.html#vs18")
                || isValidVerse(curFile, vs, "Deut-09.html#vs9")
                || isValidVerse(curFile, vs, "Deut-29.html#vs1", 12, 14, 25)
                || isValidVerse(curFile, vs, "Deut-31.html#vs16")
                || isValidVerse(curFile, vs, "Josh-09.html#vs6", 7, 11, 15, 16)
                || isValidVerse(curFile, vs, "Josh-24.html#vs25")
                || isValidVerse(curFile, vs, "Judg-02.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs1", 2)
                || isValidVerse(curFile, vs, "1Sam-18.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs12", 13, 21)
                || isValidVerse(curFile, vs, "2Sam-05.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs9", 21)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs34")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs4", 17)
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs15", 35, 38)
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs3", 16)
                || isValidVerse(curFile, vs, "2Chr-29.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs31")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs3")
                || isValidVerse(curFile, vs, "Neh-09.html#vs8")
                || isValidVerse(curFile, vs, "Job-31.html#vs1")
                || isValidVerse(curFile, vs, "Job-40.html#vs23")
                || isValidVerse(curFile, vs, "Ps-050.html#vs5")
                || isValidVerse(curFile, vs, "Ps-083.html#vs6")
                || isValidVerse(curFile, vs, "Ps-089.html#vs4")
                || isValidVerse(curFile, vs, "Ps-105.html#vs9")
                || isValidVerse(curFile, vs, "Isa-28.html#vs15")
                || isValidVerse(curFile, vs, "Isa-55.html#vs3")
                || isValidVerse(curFile, vs, "Isa-61.html#vs8")
                || isValidVerse(curFile, vs, "Jer-31.html#vs31", 32, 33)
                || isValidVerse(curFile, vs, "Jer-32.html#vs40")
                || isValidVerse(curFile, vs, "Jer-34.html#vs8", 13, 15)
                || isValidVerse(curFile, vs, "Ezek-17.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs26")
                || isValidVerse(curFile, vs, "Hos-02.html#vs17")
                || isValidVerse(curFile, vs, "Hos-10.html#vs4")
                || isValidVerse(curFile, vs, "Hos-12.html#vs2")
                || isValidVerse(curFile, vs, "Hag-2.html#vs6")
                || isValidVerse(curFile, vs, "Acts-03.html#vs25")
                || isValidVerse(curFile, vs, "Heb-08.html#vs8", 9, 10)
                || isValidVerse(curFile, vs, "Heb-10.html#vs16");
    } // isVerbondSluiten

    public static boolean isVerdragSluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-30.html#vs1");
    } // isVerdragSluiten

    public static boolean isVredeSluiten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-20.html#vs12")
                || isValidVerse(curFile, vs, "Josh-09.html#vs15")
                || isValidVerse(curFile, vs, "Josh-10.html#vs1", 4)
                || isValidVerse(curFile, vs, "Josh-11.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs45")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs19")
                || isValidVerse(curFile, vs, "Prov-16.html#vs7")
                || isValidVerse(curFile, vs, "Isa-27.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs26");
    } // isVredeSluiten

    public static boolean isSluiten(final File curFile, final String vs) {
        return !isAansluiten(curFile, vs)
                && !isAfsluiten(curFile, vs)
                && !isInsluiten(curFile, vs)
                && !isGesloten(curFile, vs)
                && !isOpsluiten(curFile, vs)
                && !isToesluiten(curFile, vs)
                && !isUitsluiten()
                && !isVerbondSluiten(curFile, vs)
                && !isVerdragSluiten(curFile, vs)
                && !isVredeSluiten(curFile, vs);
    } // isSluiten


}
