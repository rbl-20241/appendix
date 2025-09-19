package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.ValidBrengen.isTerDoodBrengen;
import static rb.hsv.appendix.ccd.valid.ValidSlaan.isDoodslaan;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDoden {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "dode" -> isDode(curFile, vs);
            case "dood (bijvoeglijk naamwoord)" -> isDood_BijvoeglijkNaamwoord(curFile, vs, arg);
            case "dood (zelfstandig naamwoord)" -> isDood_ZelfstandigNaamwoord(curFile, vs);
            case "doodslaan" -> isDoodslaan(curFile, vs);
            case "poorten van de dood" -> isPoortenVanDeDood(curFile, vs);
            case "rijk van de dood" -> isRijkVanDeDood(arg);
            case "schaduw van de dood" -> isSchaduwVanDeDood(arg);
            case "ten dode opschrijven" -> isTenDodeOpschrijven(curFile, vs, arg);
            case "ter dood brengen" -> isTerDoodBrengen(curFile, vs, arg);
            case "ter dood veroordelen" -> isTerDoodVeroordelen(curFile, vs, arg);
            case "tweede dood" -> isTweedeDood(arg);
            case "doden" -> isDoden(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isDode(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-23.html#vs3", 4, 6, 8, 11, 13, 15)
                || isValidVerse(curFile, vs, "Exod-12.html#vs30")
                || isValidVerse(curFile, vs, "Lev-19.html#vs28")
                || isValidVerse(curFile, vs, "Lev-20.html#vs27")
                || isValidVerse(curFile, vs, "Lev-21.html#vs1", 11)
                || isValidVerse(curFile, vs, "Num-05.html#vs2")
                || isValidVerse(curFile, vs, "Num-06.html#vs6", 11)
                || isValidVerse(curFile, vs, "Num-19.html#vs11", 13, 16, 18)
                || isValidVerse(curFile, vs, "Deut-14.html#vs1")
                || isValidVerse(curFile, vs, "Deut-26.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs22", 23)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs5")
                || isValidVerse(curFile, vs, "Ps-031.html#vs13")
                || isValidVerse(curFile, vs, "Ps-079.html#vs11")
                || isValidVerse(curFile, vs, "Ps-102.html#vs21")
                || isValidVerse(curFile, vs, "Jer-22.html#vs10")
                || isValidVerse(curFile, vs, "Mark-09.html#vs26")
                || isValidVerse(curFile, vs, "Luke-07.html#vs12", 15)
                || isValidVerse(curFile, vs, "Rev-16.html#vs3");
    } // isDode

    public static boolean isDood_BijvoeglijkNaamwoord(final File curFile, final String vs, final String arg) {
        if (arg.equals("dode")) {
            return isValidVerse(curFile, vs, "Exod-21.html#vs34", 35, 36)
                    || isValidVerse(curFile, vs, "Lev-26.html#vs30")
                    || isValidVerse(curFile, vs, "Num-09.html#vs6", 7)
                    || isValidVerse(curFile, vs, "Num-14.html#vs29", 32, 33)
                    || isValidVerse(curFile, vs, "Num-19.html#vs13")
                    || isValidVerse(curFile, vs, "Deut-21.html#vs23")
                    || isValidVerse(curFile, vs, "Deut-28.html#vs26")
                    || isValidVerse(curFile, vs, "Josh-08.html#vs29")
                    || isValidVerse(curFile, vs, "1Sam-17.html#vs46")
                    || isValidVerse(curFile, vs, "1Sam-24.html#vs15")
                    || isValidVerse(curFile, vs, "2Sam-09.html#vs8")
                    || isValidVerse(curFile, vs, "2Sam-16.html#vs9")
                    || isValidVerse(curFile, vs, "1Kgs-03.html#vs20")
                    || isValidVerse(curFile, vs, "1Kgs-13.html#vs22", 24, 25, 28, 29, 30)
                    || isValidVerse(curFile, vs, "2Kgs-09.html#vs37")
                    || isValidVerse(curFile, vs, "2Kgs-19.html#vs35")
                    || isValidVerse(curFile, vs, "2Chr-20.html#vs24")
                    || isValidVerse(curFile, vs, "Ps-079.html#vs2")
                    || isValidVerse(curFile, vs, "Ps-110.html#vs6")
                    || isValidVerse(curFile, vs, "Eccl-09.html#vs4")
                    || isValidVerse(curFile, vs, "Eccl-10.html#vs1")
                    || isValidVerse(curFile, vs, "Isa-05.html#vs25")
                    || isValidVerse(curFile, vs, "Isa-34.html#vs3")
                    || isValidVerse(curFile, vs, "Isa-37.html#vs36")
                    || isValidVerse(curFile, vs, "Isa-66.html#vs24")
                    || isValidVerse(curFile, vs, "Jer-07.html#vs33")
                    || isValidVerse(curFile, vs, "Jer-09.html#vs22")
                    || isValidVerse(curFile, vs, "Jer-16.html#vs4", 18)
                    || isValidVerse(curFile, vs, "Jer-19.html#vs7")
                    || isValidVerse(curFile, vs, "Jer-26.html#vs23")
                    || isValidVerse(curFile, vs, "Jer-31.html#vs40")
                    || isValidVerse(curFile, vs, "Jer-33.html#vs5")
                    || isValidVerse(curFile, vs, "Jer-34.html#vs20")
                    || isValidVerse(curFile, vs, "Jer-36.html#vs30")
                    || isValidVerse(curFile, vs, "Jer-41.html#vs9")
                    || isValidVerse(curFile, vs, "Ezek-06.html#vs5")
                    || isValidVerse(curFile, vs, "Ezek-24.html#vs17")
                    || isValidVerse(curFile, vs, "Ezek-43.html#vs7", 9)
                    || isValidVerse(curFile, vs, "Amos-8.html#vs3")
                    || isValidVerse(curFile, vs, "Nah-3.html#vs3")
                    || isValidVerse(curFile, vs, "Matt-24.html#vs28")
                    || isValidVerse(curFile, vs, "Mark-06.html#vs29")
                    || isValidVerse(curFile, vs, "Heb-06.html#vs1")
                    || isValidVerse(curFile, vs, "Heb-09.html#vs14")
                    || isValidVerse(curFile, vs, "Rev-11.html#vs8", 9)
                    || isValidVerse(curFile, vs, "Didache-06.html#vs3");

        } else {
            return isValidVerse(curFile, vs, "Lev-07.html#vs24")
                    || isValidVerse(curFile, vs, "Lev-22.html#vs4")
                    || isValidVerse(curFile, vs, "Num-09.html#vs10")
                    || isValidVerse(curFile, vs, "Num-19.html#vs11")
                    || isValidVerse(curFile, vs, "Isa-26.html#vs19")
                    || isValidVerse(curFile, vs, "Ezek-44.html#vs25")
                    || isValidVerse(curFile, vs, "Hag-2.html#vs14");
        }
    } // isDood_BijvoeglijkNaamwoord

    public static boolean isDood_ZelfstandigNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs67")
                || isValidVerse(curFile, vs, "Gen-25.html#vs11")
                || isValidVerse(curFile, vs, "Gen-26.html#vs18")
                || isValidVerse(curFile, vs, "Gen-27.html#vs2", 7, 10)
                || isValidVerse(curFile, vs, "Gen-42.html#vs38")
                || isValidVerse(curFile, vs, "Gen-44.html#vs20")
                || isValidVerse(curFile, vs, "Gen-50.html#vs15", 16)
                || isValidVerse(curFile, vs, "Exod-02.html#vs12")
                || isValidVerse(curFile, vs, "Exod-14.html#vs30")
                || isValidVerse(curFile, vs, "Exod-21.html#vs29")
                || isValidVerse(curFile, vs, "Lev-11.html#vs31", 32)
                || isValidVerse(curFile, vs, "Lev-16.html#vs1")
                || isValidVerse(curFile, vs, "Lev-20.html#vs4", 11, 12, 13, 16, 27)
                || isValidVerse(curFile, vs, "Lev-24.html#vs16", 21)
                || isValidVerse(curFile, vs, "Num-01.html#vs51")
                || isValidVerse(curFile, vs, "Num-03.html#vs10", 38)
                || isValidVerse(curFile, vs, "Num-18.html#vs7")
                || isValidVerse(curFile, vs, "Num-23.html#vs10")
                || isValidVerse(curFile, vs, "Num-35.html#vs25", 28, 32)
                || isValidVerse(curFile, vs, "Deut-13.html#vs9")
                || isValidVerse(curFile, vs, "Deut-22.html#vs26")
                || isValidVerse(curFile, vs, "Deut-24.html#vs16")
                || isValidVerse(curFile, vs, "Deut-30.html#vs15", 19)
                || isValidVerse(curFile, vs, "Deut-31.html#vs27", 29)
                || isValidVerse(curFile, vs, "Deut-33.html#vs1")
                || isValidVerse(curFile, vs, "Josh-01.html#vs1")
                || isValidVerse(curFile, vs, "Josh-02.html#vs13")
                || isValidVerse(curFile, vs, "Judg-01.html#vs1")
                || isValidVerse(curFile, vs, "Judg-03.html#vs25")
                || isValidVerse(curFile, vs, "Judg-04.html#vs22")
                || isValidVerse(curFile, vs, "Judg-05.html#vs18")
                || isValidVerse(curFile, vs, "Judg-08.html#vs21")
                || isValidVerse(curFile, vs, "Judg-09.html#vs55")
                || isValidVerse(curFile, vs, "Judg-13.html#vs7")
                || isValidVerse(curFile, vs, "Judg-14.html#vs19")
                || isValidVerse(curFile, vs, "Judg-15.html#vs15")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs17")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs32", 35)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs51")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs17", 19)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs39")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs5", 7)
                || isValidVerse(curFile, vs, "2Sam-01.html#vs1", 4, 5, 15, 23)
                || isValidVerse(curFile, vs, "2Sam-03.html#vs30")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs7", 10)
                || isValidVerse(curFile, vs, "2Sam-06.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs21", 24, 26)
                || isValidVerse(curFile, vs, "2Sam-12.html#vs18", 19, 23)
                || isValidVerse(curFile, vs, "2Sam-13.html#vs32", 33, 39)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs3")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs5", 6)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs24", 26, 29, 31)
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs11", 21)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs14", 15, 16)
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs32", 40)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs1", 2)
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs6", 17)
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-02.html#vs24")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs5", 7)
                || isValidVerse(curFile, vs, "1Chr-22.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs4", 10, 11)
                || isValidVerse(curFile, vs, "2Chr-23.html#vs7", 14)
                || isValidVerse(curFile, vs, "2Chr-24.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs4", 25)
                || isValidVerse(curFile, vs, "2Chr-26.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs33")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs26")
                || isValidVerse(curFile, vs, "Esth-09.html#vs5")
                || isValidVerse(curFile, vs, "Job-03.html#vs5", 21)
                || isValidVerse(curFile, vs, "Job-05.html#vs20")
                || isValidVerse(curFile, vs, "Job-07.html#vs15")
                || isValidVerse(curFile, vs, "Job-10.html#vs21", 22)
                || isValidVerse(curFile, vs, "Job-12.html#vs22")
                || isValidVerse(curFile, vs, "Job-16.html#vs16")
                || isValidVerse(curFile, vs, "Job-18.html#vs13")
                || isValidVerse(curFile, vs, "Job-24.html#vs17")
                || isValidVerse(curFile, vs, "Job-27.html#vs15")
                || isValidVerse(curFile, vs, "Job-28.html#vs3", 22)
                || isValidVerse(curFile, vs, "Job-30.html#vs23")
                || isValidVerse(curFile, vs, "Job-34.html#vs22")
                || isValidVerse(curFile, vs, "Job-38.html#vs17")
                || isValidVerse(curFile, vs, "Ps-006.html#vs6")
                || isValidVerse(curFile, vs, "Ps-009.html#vs1", 14)
                || isValidVerse(curFile, vs, "Ps-013.html#vs4")
                || isValidVerse(curFile, vs, "Ps-018.html#vs5", 6)
                || isValidVerse(curFile, vs, "Ps-022.html#vs16")
                || isValidVerse(curFile, vs, "Ps-023.html#vs4")
                || isValidVerse(curFile, vs, "Ps-033.html#vs19")
                || isValidVerse(curFile, vs, "Ps-034.html#vs22")
                || isValidVerse(curFile, vs, "Ps-044.html#vs20")
                || isValidVerse(curFile, vs, "Ps-048.html#vs15")
                || isValidVerse(curFile, vs, "Ps-049.html#vs15")
                || isValidVerse(curFile, vs, "Ps-055.html#vs16")
                || isValidVerse(curFile, vs, "Ps-056.html#vs14")
                || isValidVerse(curFile, vs, "Ps-068.html#vs21")
                || isValidVerse(curFile, vs, "Ps-073.html#vs4")
                || isValidVerse(curFile, vs, "Ps-078.html#vs50")
                || isValidVerse(curFile, vs, "Ps-089.html#vs49")
                || isValidVerse(curFile, vs, "Ps-107.html#vs10", 14, 18)
                || isValidVerse(curFile, vs, "Ps-116.html#vs3", 8, 15)
                || isValidVerse(curFile, vs, "Ps-118.html#vs18")
                || isValidVerse(curFile, vs, "Ps-143.html#vs3")
                || isValidVerse(curFile, vs, "Prov-02.html#vs18")
                || isValidVerse(curFile, vs, "Prov-05.html#vs5")
                || isValidVerse(curFile, vs, "Prov-07.html#vs27")
                || isValidVerse(curFile, vs, "Prov-08.html#vs36")
                || isValidVerse(curFile, vs, "Prov-10.html#vs2")
                || isValidVerse(curFile, vs, "Prov-11.html#vs4", 19)
                || isValidVerse(curFile, vs, "Prov-12.html#vs28")
                || isValidVerse(curFile, vs, "Prov-13.html#vs14")
                || isValidVerse(curFile, vs, "Prov-14.html#vs12", 27, 32)
                || isValidVerse(curFile, vs, "Prov-16.html#vs14", 25)
                || isValidVerse(curFile, vs, "Prov-18.html#vs21")
                || isValidVerse(curFile, vs, "Prov-21.html#vs6")
                || isValidVerse(curFile, vs, "Eccl-07.html#vs1", 26)
                || isValidVerse(curFile, vs, "Eccl-08.html#vs8")
                || isValidVerse(curFile, vs, "Song-8.html#vs6")
                || isValidVerse(curFile, vs, "Isa-09.html#vs1")
                || isValidVerse(curFile, vs, "Isa-14.html#vs9", 15)
                || isValidVerse(curFile, vs, "Isa-25.html#vs8")
                || isValidVerse(curFile, vs, "Isa-28.html#vs15", 18)
                || isValidVerse(curFile, vs, "Isa-38.html#vs18")
                || isValidVerse(curFile, vs, "Isa-53.html#vs9", 12)
                || isValidVerse(curFile, vs, "Jer-02.html#vs6")
                || isValidVerse(curFile, vs, "Jer-08.html#vs3")
                || isValidVerse(curFile, vs, "Jer-09.html#vs21")
                || isValidVerse(curFile, vs, "Jer-13.html#vs16")
                || isValidVerse(curFile, vs, "Jer-15.html#vs2")
                || isValidVerse(curFile, vs, "Jer-21.html#vs8")
                || isValidVerse(curFile, vs, "Jer-26.html#vs19", 21, 24)
                || isValidVerse(curFile, vs, "Jer-38.html#vs4", 15, 16, 25)
                || isValidVerse(curFile, vs, "Jer-41.html#vs2", 4, 8)
                || isValidVerse(curFile, vs, "Jer-43.html#vs3", 11)
                || isValidVerse(curFile, vs, "Jer-52.html#vs11", 34)
                || isValidVerse(curFile, vs, "Lam-1.html#vs20")
                || isValidVerse(curFile, vs, "Lam-3.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs23", 32)
                || isValidVerse(curFile, vs, "Ezek-28.html#vs8", 10)
                || isValidVerse(curFile, vs, "Ezek-31.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs21", 27)
                || isValidVerse(curFile, vs, "Ezek-33.html#vs11")
                || isValidVerse(curFile, vs, "Dan-02.html#vs13", 14)
                || isValidVerse(curFile, vs, "Hos-13.html#vs14")
                || isValidVerse(curFile, vs, "Amos-5.html#vs8")
                || isValidVerse(curFile, vs, "Jonah-4.html#vs9")
                || isValidVerse(curFile, vs, "Hab-2.html#vs5")
                || isValidVerse(curFile, vs, "Matt-02.html#vs15")
                || isValidVerse(curFile, vs, "Matt-04.html#vs16")
                || isValidVerse(curFile, vs, "Matt-16.html#vs28")
                || isValidVerse(curFile, vs, "Matt-20.html#vs18")
                || isValidVerse(curFile, vs, "Matt-21.html#vs41")
                || isValidVerse(curFile, vs, "Matt-26.html#vs38", 66)
                || isValidVerse(curFile, vs, "Mark-09.html#vs1")
                || isValidVerse(curFile, vs, "Mark-10.html#vs33")
                || isValidVerse(curFile, vs, "Mark-13.html#vs12")
                || isValidVerse(curFile, vs, "Mark-14.html#vs34", 64)
                || isValidVerse(curFile, vs, "Luke-01.html#vs79")
                || isValidVerse(curFile, vs, "Luke-02.html#vs26")
                || isValidVerse(curFile, vs, "Luke-09.html#vs27")
                || isValidVerse(curFile, vs, "Luke-15.html#vs24", 32)
                || isValidVerse(curFile, vs, "Luke-22.html#vs33")
                || isValidVerse(curFile, vs, "Luke-23.html#vs15", 22, 32)
                || isValidVerse(curFile, vs, "Luke-24.html#vs20")
                || isValidVerse(curFile, vs, "John-05.html#vs24")
                || isValidVerse(curFile, vs, "John-08.html#vs51", 52)
                || isValidVerse(curFile, vs, "John-11.html#vs4", 13)
                || isValidVerse(curFile, vs, "John-12.html#vs33")
                || isValidVerse(curFile, vs, "John-18.html#vs32")
                || isValidVerse(curFile, vs, "John-21.html#vs19")
                || isValidVerse(curFile, vs, "Acts-02.html#vs24")
                || isValidVerse(curFile, vs, "Acts-05.html#vs10")
                || isValidVerse(curFile, vs, "Acts-08.html#vs1")
                || isValidVerse(curFile, vs, "Acts-13.html#vs28")
                || isValidVerse(curFile, vs, "Acts-14.html#vs19")
                || isValidVerse(curFile, vs, "Acts-20.html#vs9")
                || isValidVerse(curFile, vs, "Acts-22.html#vs4", 20)
                || isValidVerse(curFile, vs, "Acts-23.html#vs29")
                || isValidVerse(curFile, vs, "Acts-25.html#vs11", 16, 25)
                || isValidVerse(curFile, vs, "Acts-26.html#vs31")
                || isValidVerse(curFile, vs, "Acts-28.html#vs6")
                || isValidVerse(curFile, vs, "Rom-01.html#vs32")
                || isValidVerse(curFile, vs, "Rom-05.html#vs10", 12, 14, 17, 21)
                || isValidVerse(curFile, vs, "Rom-06.html#vs3", 4, 5, 9, 11, 16, 21, 23)
                || isValidVerse(curFile, vs, "Rom-07.html#vs5", 8, 10, 13, 24)
                || isValidVerse(curFile, vs, "Rom-08.html#vs2", 6, 10, 38)
                || isValidVerse(curFile, vs, "1Cor-03.html#vs22")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs9")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs26")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs21", 26, 54, 55, 56)
                || isValidVerse(curFile, vs, "2Cor-02.html#vs16")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs7")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs11", 12)
                || isValidVerse(curFile, vs, "2Cor-07.html#vs10")
                || isValidVerse(curFile, vs, "Eph-2.html#vs1", 5)
                || isValidVerse(curFile, vs, "Phil-1.html#vs20")
                || isValidVerse(curFile, vs, "Phil-2.html#vs8", 27, 30)
                || isValidVerse(curFile, vs, "Phil-3.html#vs10")
                || isValidVerse(curFile, vs, "Col-1.html#vs22")
                || isValidVerse(curFile, vs, "Col-2.html#vs13")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs6")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs10")
                || isValidVerse(curFile, vs, "Heb-02.html#vs9", 14, 15)
                || isValidVerse(curFile, vs, "Heb-05.html#vs7")
                || isValidVerse(curFile, vs, "Heb-07.html#vs23")
                || isValidVerse(curFile, vs, "Heb-09.html#vs15", 16, 17)
                || isValidVerse(curFile, vs, "Heb-11.html#vs5", 35, 37)
                || isValidVerse(curFile, vs, "Jas-1.html#vs15")
                || isValidVerse(curFile, vs, "Jas-2.html#vs17", 20, 26)
                || isValidVerse(curFile, vs, "Jas-5.html#vs20")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs24")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs18")
                || isValidVerse(curFile, vs, "1John-3.html#vs12", 14)
                || isValidVerse(curFile, vs, "1John-5.html#vs16", 17)
                || isValidVerse(curFile, vs, "Rev-01.html#vs17", 18)
                || isValidVerse(curFile, vs, "Rev-02.html#vs8", 23)
                || isValidVerse(curFile, vs, "Rev-03.html#vs1")
                || isValidVerse(curFile, vs, "Rev-06.html#vs8")
                || isValidVerse(curFile, vs, "Rev-09.html#vs6")
                || isValidVerse(curFile, vs, "Rev-12.html#vs11")
                || isValidVerse(curFile, vs, "Rev-18.html#vs8")
                || isValidVerse(curFile, vs, "Rev-20.html#vs13", 14)
                || isValidVerse(curFile, vs, "Rev-21.html#vs4")
                || isValidVerse(curFile, vs, "Didache-01.html#vs1")
                || isValidVerse(curFile, vs, "Didache-05.html#vs1");
    } // isDood_ZelfstandigNaamwoord

    private static boolean isDood_Werkwoord(final File curFile, final String vs, final @NotNull String keyArg, final String arg) {
        if (isEqual("doden", keyArg)) {
            if (!isEqual("dood", arg)) {
                return true;
            }
        }
        return isValidVerse(curFile, vs, "1Sam-22.html#vs17", 19);
    } // isDood_Werkwoord (1Kgs-03.html#vs26)

    public static boolean isPoortenVanDeDood(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-38.html#vs17")
                || isValidVerse(curFile, vs, "Ps-009.html#vs14")
                || isValidVerse(curFile, vs, "Ps-107.html#vs18");
    } // isPoortenVanDeDood

    public static boolean isRijkVanDeDood(final @NotNull String arg) {
        return arg.equals("rijk van de dood");
    } // isRijkVanDeDood

    public static boolean isSchaduwVanDeDood(final @NotNull String arg) {
        return arg.equals("schaduw van de dood");
    } // isSchaduwVanDeDood

    public static boolean isTenDodeOpschrijven(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ten dode opschrijven")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-19.html#vs28")
                || isValidVerse(curFile, vs, "Ps-079.html#vs11")
                || isValidVerse(curFile, vs, "Ps-102.html#vs21");
    } // isTenDodeOpschrijven

    public static boolean isTerDoodVeroordelen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter dood veroordelen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Matt-20.html#vs18")
                || isValidVerse(curFile, vs, "Mark-10.html#vs33")
                || isValidVerse(curFile, vs, "Luke-24.html#vs20")
                || isValidVerse(curFile, vs, "1Cor-04.html#vs9");
    } // isTerDoodVeroordelen

    public static boolean isTweedeDood(final @NotNull String arg) {
        return arg.equals("tweede dood");
    } // isTweedeDood

    public static boolean isDoden(final File curFile, final String vs, final @NotNull String keyArg, final String arg) {
        return isDood_Werkwoord(curFile, vs, keyArg, arg)
                || (!isDode(curFile, vs)
                && !isDood_BijvoeglijkNaamwoord(curFile, vs, arg)
                && !isDood_ZelfstandigNaamwoord(curFile, vs)
                && !isDoodslaan(curFile, vs)
                && !isPoortenVanDeDood(curFile, vs)
                && !isRijkVanDeDood(arg)
                && !isSchaduwVanDeDood(arg)
                && !isTenDodeOpschrijven(curFile, vs, arg)
                && !isTerDoodBrengen(curFile, vs, arg)
                && !isTerDoodVeroordelen(curFile, vs, arg)
                && !isTweedeDood(arg));
    } // isDoden
}
