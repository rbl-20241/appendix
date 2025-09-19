package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidAchten.isAchtGeven;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGeven {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanleiding geven" -> isAanleidingGeven(curFile, vs);
            case "aanstoot geven" -> isAanstootGeven(curFile, vs);
            case "aanzien geven" -> isAanzienGeven(curFile, vs);
            case "antwoord geven" -> isAntwoordGeven(curFile, vs);
            case "bevel geven" -> isBevelGeven(curFile, vs);
            case "de borst geven" -> isDeBorstGeven(curFile, vs, keyArg, arg);
            case "de geest geven" -> isDeGeestGeven(curFile, vs, keyArg, arg);
            case "doorgeven" -> isDoorgeven(curFile, vs);
            case "eer geven" -> isEerGeven(curFile, vs);
            case "gaaf" -> isGaaf(arg);
            case "gave" -> isGave(curFile, vs);
            case "gehoor geven" -> isGehoorGeven(curFile, vs);
            case "genade geven" -> isGenadeGeven(curFile, vs);
            case "getuigenis geven" -> isGetuigenisGeven(curFile, vs);
            case "in bewaring geven" -> isInBewaringGeven(curFile, vs, keyArg, arg);
            case "inzicht geven" -> isInzichtGeven(curFile, vs);
            case "leiding geven" -> isLeidingGeven(curFile, vs);
            case "licht geven" -> isLichtGeven(curFile, vs);
            case "meegeven" -> isMeegeven(curFile, vs);
            case "onderricht geven" -> isOnderrichtGeven(curFile, vs);
            case "onderwijs geven" -> isOnderwijsGeven(curFile, vs);
            case "opdracht geven" -> isOpdrachtGeven(curFile, vs);
            case "opgeven" -> isOpgeven(curFile, vs);
            case "overgeven" -> isOvergeven(curFile, vs);
            case "prijsgeven" -> isPrijsgeven(curFile, vs);
            case "raad geven" -> isRaadGeven(curFile, vs);
            case "ruimte geven" -> isRuimteGeven(curFile, vs);
            case "rust geven" -> isRustGeven(curFile, vs);
            case "te kennen geven" -> isTeKennenGeven(curFile, vs, keyArg, arg);
            case "ten huwelijk geven" -> isTenHuwelijkGeven(curFile, vs, keyArg, arg);
            case "teruggeven" -> isTeruggeven(curFile, vs);
            case "uitleg geven" -> isUitlegGeven(curFile, vs);
            case "vrucht geven" -> isVruchtGeven(curFile, vs);
            case "weggeven" -> isWeggeven(curFile, vs);
            case "zegen geven" -> isZegenGeven(curFile, vs);
            case "geven" -> isGeven(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAanleidingGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-05.html#vs12")
                || isValidVerse(curFile, vs, "Gal-5.html#vs13")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs14");
    } // isAanleidingGeven

    public static boolean isAanstootGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-17.html#vs27")
                || isValidVerse(curFile, vs, "Rom-14.html#vs13", 20)
                || isValidVerse(curFile, vs, "1Cor-10.html#vs32")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs3")
                || isValidVerse(curFile, vs, "Phil-1.html#vs10");
    } // isAanstootGeven

    public static boolean isAanzienGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-28.html#vs2", 40)
                || isValidVerse(curFile, vs, "Ezra-07.html#vs27")
                || isValidVerse(curFile, vs, "Ps-149.html#vs4")
                || isValidVerse(curFile, vs, "Isa-60.html#vs7", 13);
    } // isAanzienGeven

    public static boolean isAntwoordGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-45.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs27", 30)
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs7", 13, 16)
                || isValidVerse(curFile, vs, "2Chr-10.html#vs13", 16)
                || isValidVerse(curFile, vs, "Ezra-05.html#vs11")
                || isValidVerse(curFile, vs, "Neh-02.html#vs20")
                || isValidVerse(curFile, vs, "Job-09.html#vs3", 15, 32)
                || isValidVerse(curFile, vs, "Job-16.html#vs3")
                || isValidVerse(curFile, vs, "Job-32.html#vs14")
                || isValidVerse(curFile, vs, "Job-35.html#vs4")
                || isValidVerse(curFile, vs, "Isa-41.html#vs28")
                || isValidVerse(curFile, vs, "Isa-50.html#vs2")
                || isValidVerse(curFile, vs, "Isa-66.html#vs4")
                || isValidVerse(curFile, vs, "Jer-44.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-14.html#vs4", 7)
                || isValidVerse(curFile, vs, "Dan-03.html#vs16")
                || isValidVerse(curFile, vs, "Luke-14.html#vs6")
                || isValidVerse(curFile, vs, "John-01.html#vs22")
                || isValidVerse(curFile, vs, "John-19.html#vs9");
    } // isAntwoordGeven

    public static boolean isBevelGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs19")
                || isValidVerse(curFile, vs, "Gen-49.html#vs33")
                || isValidVerse(curFile, vs, "Exod-05.html#vs6")
                || isValidVerse(curFile, vs, "Exod-36.html#vs6")
                || isValidVerse(curFile, vs, "Deut-03.html#vs28")
                || isValidVerse(curFile, vs, "Deut-31.html#vs14")
                || isValidVerse(curFile, vs, "Josh-08.html#vs29")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs5", 12)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs46")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs21")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs3", 9, 13, 17)
                || isValidVerse(curFile, vs, "Ezra-06.html#vs1", 3, 8, 11, 12)
                || isValidVerse(curFile, vs, "Ezra-07.html#vs13", 21)
                || isValidVerse(curFile, vs, "Ezra-08.html#vs17")
                || isValidVerse(curFile, vs, "Neh-07.html#vs2")
                || isValidVerse(curFile, vs, "Ps-071.html#vs3")
                || isValidVerse(curFile, vs, "Ps-091.html#vs11")
                || isValidVerse(curFile, vs, "Isa-10.html#vs6")
                || isValidVerse(curFile, vs, "Isa-23.html#vs11")
                || isValidVerse(curFile, vs, "Isa-45.html#vs11", 12)
                || isValidVerse(curFile, vs, "Jer-34.html#vs22")
                || isValidVerse(curFile, vs, "Jer-36.html#vs26")
                || isValidVerse(curFile, vs, "Jer-37.html#vs21")
                || isValidVerse(curFile, vs, "Jer-39.html#vs11")
                || isValidVerse(curFile, vs, "Dan-03.html#vs10")
                || isValidVerse(curFile, vs, "Dan-04.html#vs6")
                || isValidVerse(curFile, vs, "Dan-06.html#vs17", 27)
                || isValidVerse(curFile, vs, "Matt-04.html#vs6")
                || isValidVerse(curFile, vs, "Matt-08.html#vs18")
                || isValidVerse(curFile, vs, "Matt-14.html#vs9", 28)
                || isValidVerse(curFile, vs, "Matt-27.html#vs58", 64)
                || isValidVerse(curFile, vs, "Mark-01.html#vs27")
                || isValidVerse(curFile, vs, "Luke-04.html#vs10", 36)
                || isValidVerse(curFile, vs, "Luke-08.html#vs25")
                || isValidVerse(curFile, vs, "Acts-04.html#vs18")
                || isValidVerse(curFile, vs, "Acts-12.html#vs19")
                || isValidVerse(curFile, vs, "Acts-16.html#vs22")
                || isValidVerse(curFile, vs, "Acts-21.html#vs33", 34)
                || isValidVerse(curFile, vs, "Acts-22.html#vs30")
                || isValidVerse(curFile, vs, "Acts-23.html#vs3", 10, 35)
                || isValidVerse(curFile, vs, "Acts-24.html#vs8")
                || isValidVerse(curFile, vs, "Acts-25.html#vs6", 17)
                || isValidVerse(curFile, vs, "Acts-27.html#vs43")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs2");
    } // isBevelGeven

    public static boolean isDeBorstGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-21.html#vs7")
                || isValidVerse(curFile, vs, "Exod-02.html#vs7", 9)
                || isValidVerse(curFile, vs, "Hos-01.html#vs8");
    } // isDeBorstGeven

    public static boolean isDeGeestGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-06.html#vs17")
                || isValidVerse(curFile, vs, "Gen-07.html#vs21")
                || isValidVerse(curFile, vs, "Gen-25.html#vs8", 17)
                || isValidVerse(curFile, vs, "Gen-35.html#vs29")
                || isValidVerse(curFile, vs, "Gen-49.html#vs33")
                || isValidVerse(curFile, vs, "Num-17.html#vs12", 13)
                || isValidVerse(curFile, vs, "Num-20.html#vs3", 29)
                || isValidVerse(curFile, vs, "Job-03.html#vs11")
                || isValidVerse(curFile, vs, "Job-10.html#vs18")
                || isValidVerse(curFile, vs, "Job-13.html#vs19")
                || isValidVerse(curFile, vs, "Job-14.html#vs10")
                || isValidVerse(curFile, vs, "Job-27.html#vs5")
                || isValidVerse(curFile, vs, "Job-29.html#vs18")
                || isValidVerse(curFile, vs, "Job-34.html#vs15")
                || isValidVerse(curFile, vs, "Job-36.html#vs3")
                || isValidVerse(curFile, vs, "Ps-104.html#vs29")
                || isValidVerse(curFile, vs, "Lam-1.html#vs19")
                || isValidVerse(curFile, vs, "Zech-13.html#vs8")
                || isValidVerse(curFile, vs, "Matt-27.html#vs50")
                || isValidVerse(curFile, vs, "Mark-15.html#vs37", 39)
                || isValidVerse(curFile, vs, "Luke-23.html#vs46")
                || isValidVerse(curFile, vs, "John-19.html#vs30")
                || isValidVerse(curFile, vs, "Acts-05.html#vs5", 10)
                || isValidVerse(curFile, vs, "Acts-12.html#vs23");
    } // isDeGeestGeven

    public static boolean isDoorgeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-019.html#vs3")
                || isValidVerse(curFile, vs, "Acts-07.html#vs38");
    } // isDoorgeven

    public static boolean isEerGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-07.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs28", 29)
                || isValidVerse(curFile, vs, "2Chr-01.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs11")
                || isValidVerse(curFile, vs, "Ps-029.html#vs1", 2)
                || isValidVerse(curFile, vs, "Ps-066.html#vs2")
                || isValidVerse(curFile, vs, "Ps-084.html#vs12")
                || isValidVerse(curFile, vs, "Ps-096.html#vs7", 8)
                || isValidVerse(curFile, vs, "Ps-115.html#vs1")
                || isValidVerse(curFile, vs, "Prov-26.html#vs8")
                || isValidVerse(curFile, vs, "Eccl-06.html#vs2")
                || isValidVerse(curFile, vs, "Isa-42.html#vs8", 12)
                || isValidVerse(curFile, vs, "Isa-48.html#vs11")
                || isValidVerse(curFile, vs, "Jer-13.html#vs16")
                || isValidVerse(curFile, vs, "Dan-02.html#vs37")
                || isValidVerse(curFile, vs, "Dan-05.html#vs18")
                || isValidVerse(curFile, vs, "Dan-07.html#vs14")
                || isValidVerse(curFile, vs, "Mal-2.html#vs2")
                || isValidVerse(curFile, vs, "Luke-17.html#vs18")
                || isValidVerse(curFile, vs, "Luke-18.html#vs43")
                || isValidVerse(curFile, vs, "John-09.html#vs24")
                || isValidVerse(curFile, vs, "Acts-12.html#vs23")
                || isValidVerse(curFile, vs, "Rom-04.html#vs20")
                || isValidVerse(curFile, vs, "1Cor-12.html#vs24")
                || isValidVerse(curFile, vs, "Heb-05.html#vs5")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs7")
                || isValidVerse(curFile, vs, "Rev-11.html#vs13")
                || isValidVerse(curFile, vs, "Rev-14.html#vs7")
                || isValidVerse(curFile, vs, "Rev-16.html#vs9");
    } // isEerGeven

    public static boolean isGaaf(final @NotNull String arg) {
        return arg.equals("gaaf");
    } // isGaaf

    public static boolean isGave(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-28.html#vs38")
                || isValidVerse(curFile, vs, "Exod-35.html#vs29")
                || isValidVerse(curFile, vs, "Exod-36.html#vs3")
                || isValidVerse(curFile, vs, "Lev-07.html#vs16")
                || isValidVerse(curFile, vs, "Lev-22.html#vs2", 3, 4, 6, 7, 10, 12, 14, 15, 16, 18, 21, 23)
                || isValidVerse(curFile, vs, "Lev-23.html#vs20", 38)
                || isValidVerse(curFile, vs, "Num-05.html#vs9", 10)
                || isValidVerse(curFile, vs, "Num-08.html#vs19")
                || isValidVerse(curFile, vs, "Num-15.html#vs3")
                || isValidVerse(curFile, vs, "Num-18.html#vs8", 11, 19, 29, 32)
                || isValidVerse(curFile, vs, "Num-29.html#vs39")
                || isValidVerse(curFile, vs, "Deut-12.html#vs6", 17, 26)
                || isValidVerse(curFile, vs, "Deut-16.html#vs10")
                || isValidVerse(curFile, vs, "Deut-18.html#vs3")
                || isValidVerse(curFile, vs, "Deut-23.html#vs23")
                || isValidVerse(curFile, vs, "Judg-05.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs51")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs4", 18)
                || isValidVerse(curFile, vs, "1Chr-26.html#vs20", 26)
                || isValidVerse(curFile, vs, "1Chr-28.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs6", 12, 14)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-01.html#vs4")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs16")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs28")
                || isValidVerse(curFile, vs, "Neh-10.html#vs33")
                || isValidVerse(curFile, vs, "Esth-09.html#vs22")
                || isValidVerse(curFile, vs, "Ps-036.html#vs9")
                || isValidVerse(curFile, vs, "Ps-068.html#vs19")
                || isValidVerse(curFile, vs, "Ps-119.html#vs108")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs40")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs8", 26)
                || isValidVerse(curFile, vs, "Ezek-46.html#vs5", 11, 12)
                || isValidVerse(curFile, vs, "Amos-4.html#vs5")
                || isValidVerse(curFile, vs, "Zech-06.html#vs10")
                || isValidVerse(curFile, vs, "Matt-05.html#vs23", 24)
                || isValidVerse(curFile, vs, "Matt-07.html#vs11")
                || isValidVerse(curFile, vs, "Matt-08.html#vs4")
                || isValidVerse(curFile, vs, "Matt-23.html#vs18", 19)
                || isValidVerse(curFile, vs, "Mark-07.html#vs11")
                || isValidVerse(curFile, vs, "Luke-01.html#vs53")
                || isValidVerse(curFile, vs, "Luke-11.html#vs13")
                || isValidVerse(curFile, vs, "Luke-21.html#vs1")
                || isValidVerse(curFile, vs, "John-04.html#vs10")
                || isValidVerse(curFile, vs, "Acts-02.html#vs38")
                || isValidVerse(curFile, vs, "Acts-08.html#vs20")
                || isValidVerse(curFile, vs, "Acts-10.html#vs45")
                || isValidVerse(curFile, vs, "Acts-11.html#vs17")
                || isValidVerse(curFile, vs, "Rom-05.html#vs15", 16, 17)
                || isValidVerse(curFile, vs, "1Cor-12.html#vs1", 28)
                || isValidVerse(curFile, vs, "1Cor-13.html#vs2")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs1", 12)
                || isValidVerse(curFile, vs, "1Cor-16.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs15")
                || isValidVerse(curFile, vs, "Eph-2.html#vs8")
                || isValidVerse(curFile, vs, "Eph-3.html#vs7")
                || isValidVerse(curFile, vs, "Eph-4.html#vs7", 8)
                || isValidVerse(curFile, vs, "Phil-4.html#vs17")
                || isValidVerse(curFile, vs, "Heb-02.html#vs4")
                || isValidVerse(curFile, vs, "Heb-05.html#vs1")
                || isValidVerse(curFile, vs, "Heb-06.html#vs4")
                || isValidVerse(curFile, vs, "Heb-08.html#vs3", 4)
                || isValidVerse(curFile, vs, "Heb-09.html#vs9")
                || isValidVerse(curFile, vs, "Heb-11.html#vs4")
                || isValidVerse(curFile, vs, "Jas-1.html#vs17")
                || isValidVerse(curFile, vs, "Didache-01.html#vs5", 6)
                || isValidVerse(curFile, vs, "Didache-15.html#vs4");
    } // isGave

    public static boolean isGaven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs33", 35)
                || isValidVerse(curFile, vs, "Gen-35.html#vs4")
                || isValidVerse(curFile, vs, "Exod-12.html#vs36")
                || isValidVerse(curFile, vs, "Num-17.html#vs6")
                || isValidVerse(curFile, vs, "Num-32.html#vs38")
                || isValidVerse(curFile, vs, "Deut-26.html#vs6")
                || isValidVerse(curFile, vs, "Josh-14.html#vs4")
                || isValidVerse(curFile, vs, "Josh-19.html#vs49", 50)
                || isValidVerse(curFile, vs, "Josh-21.html#vs3", 8, 9, 11, 12, 13, 21, 27)
                || isValidVerse(curFile, vs, "Judg-01.html#vs20")
                || isValidVerse(curFile, vs, "Judg-02.html#vs5")
                || isValidVerse(curFile, vs, "Judg-03.html#vs6")
                || isValidVerse(curFile, vs, "Judg-09.html#vs4")
                || isValidVerse(curFile, vs, "Judg-18.html#vs29")
                || isValidVerse(curFile, vs, "Judg-21.html#vs14")
                || isValidVerse(curFile, vs, "Ruth-4.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-30.html#vs11", 12)
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs11", 14, 15)
                || isValidVerse(curFile, vs, "1Chr-06.html#vs55", 56, 57, 64, 65, 67)
                || isValidVerse(curFile, vs, "1Chr-14.html#vs11")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs6", 7, 8, 9, 24)
                || isValidVerse(curFile, vs, "2Chr-20.html#vs26")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-27.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs9", 10, 11)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-02.html#vs68", 69)
                || isValidVerse(curFile, vs, "Ezra-03.html#vs7")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs36")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs19")
                || isValidVerse(curFile, vs, "Neh-07.html#vs71")
                || isValidVerse(curFile, vs, "Job-42.html#vs11")
                || isValidVerse(curFile, vs, "Joel-3.html#vs3")
                || isValidVerse(curFile, vs, "Matt-14.html#vs19")
                || isValidVerse(curFile, vs, "Matt-15.html#vs36")
                || isValidVerse(curFile, vs, "Matt-27.html#vs29", 34)
                || isValidVerse(curFile, vs, "Mark-14.html#vs65")
                || isValidVerse(curFile, vs, "Mark-15.html#vs23")
                || isValidVerse(curFile, vs, "Luke-24.html#vs42")
                || isValidVerse(curFile, vs, "John-19.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-08.html#vs3", 5)
                || isValidVerse(curFile, vs, "Gal-2.html#vs9")
                || isValidVerse(curFile, vs, "Rev-20.html#vs13");
    } // isGaven

    public static boolean isGehoorGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-42.html#vs21")
                || isValidVerse(curFile, vs, "Deut-12.html#vs28")
                || isValidVerse(curFile, vs, "Judg-11.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs3")
                || isValidVerse(curFile, vs, "Jer-34.html#vs10")
                || isValidVerse(curFile, vs, "John-18.html#vs37");
    } // isGehoorGeven

    public static boolean isGenadeGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-39.html#vs21")
                || isValidVerse(curFile, vs, "Exod-03.html#vs21")
                || isValidVerse(curFile, vs, "Exod-11.html#vs3")
                || isValidVerse(curFile, vs, "Exod-12.html#vs36")
                || isValidVerse(curFile, vs, "Ps-084.html#vs12")
                || isValidVerse(curFile, vs, "Prov-03.html#vs34")
                || isValidVerse(curFile, vs, "Dan-01.html#vs9")
                || isValidVerse(curFile, vs, "Acts-07.html#vs10")
                || isValidVerse(curFile, vs, "Rom-12.html#vs3", 6)
                || isValidVerse(curFile, vs, "Rom-15.html#vs15")
                || isValidVerse(curFile, vs, "1Cor-01.html#vs4")
                || isValidVerse(curFile, vs, "1Cor-03.html#vs10")
                || isValidVerse(curFile, vs, "2Cor-08.html#vs1")
                || isValidVerse(curFile, vs, "Gal-2.html#vs9")
                || isValidVerse(curFile, vs, "Eph-3.html#vs2", 7, 8)
                || isValidVerse(curFile, vs, "Eph-4.html#vs7", 29)
                || isValidVerse(curFile, vs, "Jas-4.html#vs6")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs5");
    } // isGenadeGeven

    public static boolean isGetuigenisGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-03.html#vs26")
                || isValidVerse(curFile, vs, "Acts-06.html#vs3")
                || isValidVerse(curFile, vs, "Acts-10.html#vs22")
                || isValidVerse(curFile, vs, "Acts-13.html#vs22")
                || isValidVerse(curFile, vs, "Acts-14.html#vs3")
                || isValidVerse(curFile, vs, "Acts-15.html#vs8")
                || isValidVerse(curFile, vs, "Rom-13.html#vs9")
                || isValidVerse(curFile, vs, "Heb-02.html#vs4")
                || isValidVerse(curFile, vs, "3John-1.html#vs12");
    } // isGetuigenisGeven

    public static boolean isInBewaringGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-22.html#vs7", 10)
                || isValidVerse(curFile, vs, "Lev-06.html#vs2", 4)
                || isValidVerse(curFile, vs, "Luke-19.html#vs23");
    } // isInBewaringGeven

    public static boolean isInzichtGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-36.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs29")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs12")
                || isValidVerse(curFile, vs, "Job-38.html#vs36")
                || isValidVerse(curFile, vs, "Ps-119.html#vs27", 34, 73, 125, 144, 169)
                || isValidVerse(curFile, vs, "Isa-40.html#vs14")
                || isValidVerse(curFile, vs, "Dan-01.html#vs17")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs7");
    } // isInzichtGeven

    public static boolean isLeidingGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-03.html#vs10")
                || isValidVerse(curFile, vs, "Judg-04.html#vs4")
                || isValidVerse(curFile, vs, "Judg-10.html#vs2", 3)
                || isValidVerse(curFile, vs, "Judg-12.html#vs7",8, 9, 11, 13, 14)
                || isValidVerse(curFile, vs, "Judg-15.html#vs20")
                || isValidVerse(curFile, vs, "Judg-16.html#vs31")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs6", 15, 16, 17)
                || isValidVerse(curFile, vs, "1Sam-08.html#vs5", 6, 20)
                || isValidVerse(curFile, vs, "1Sam-19.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs12", 13)
                || isValidVerse(curFile, vs, "Neh-13.html#vs13")
                || isValidVerse(curFile, vs, "Dan-09.html#vs12")
                || isValidVerse(curFile, vs, "Luke-22.html#vs26")
                || isValidVerse(curFile, vs, "Rom-12.html#vs8")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs12")
                || isValidVerse(curFile, vs, "1Tim-3.html#vs4", 5, 12)
                || isValidVerse(curFile, vs, "1Tim-5.html#vs17");
    } // isLeidingGeven

    public static boolean isLichtGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs15", 17)
                || isValidVerse(curFile, vs, "Exod-13.html#vs21")
                || isValidVerse(curFile, vs, "Ps-119.html#vs130")
                || isValidVerse(curFile, vs, "Jer-31.html#vs35");
    } // isLichtGeven

    public static boolean isMeegeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-21.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs6");
    } // isMeegeven

    public static boolean isOnderrichtGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-17.html#vs7", 9)
                || isValidVerse(curFile, vs, "Prov-09.html#vs9");
    } // isOnderrichtGeven

    public static boolean isOnderwijsGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-04.html#vs23")
                || isValidVerse(curFile, vs, "Matt-09.html#vs35")
                || isValidVerse(curFile, vs, "Matt-11.html#vs1")
                || isValidVerse(curFile, vs, "Matt-21.html#vs23")
                || isValidVerse(curFile, vs, "Matt-26.html#vs55")
                || isValidVerse(curFile, vs, "Mark-01.html#vs21")
                || isValidVerse(curFile, vs, "Mark-04.html#vs1")
                || isValidVerse(curFile, vs, "Mark-06.html#vs6")
                || isValidVerse(curFile, vs, "Mark-09.html#vs31")
                || isValidVerse(curFile, vs, "Mark-11.html#vs17")
                || isValidVerse(curFile, vs, "Mark-12.html#vs35")
                || isValidVerse(curFile, vs, "Mark-14.html#vs49")
                || isValidVerse(curFile, vs, "Luke-04.html#vs15")
                || isValidVerse(curFile, vs, "Luke-05.html#vs17")
                || isValidVerse(curFile, vs, "Luke-06.html#vs6")
                || isValidVerse(curFile, vs, "Luke-13.html#vs10", 22, 26)
                || isValidVerse(curFile, vs, "Luke-19.html#vs47")
                || isValidVerse(curFile, vs, "Luke-20.html#vs21")
                || isValidVerse(curFile, vs, "Luke-21.html#vs37")
                || isValidVerse(curFile, vs, "Luke-23.html#vs5")
                || isValidVerse(curFile, vs, "John-06.html#vs59")
                || isValidVerse(curFile, vs, "John-07.html#vs14", 28)
                || isValidVerse(curFile, vs, "John-08.html#vs20")
                || isValidVerse(curFile, vs, "Acts-05.html#vs21", 42)
                || isValidVerse(curFile, vs, "Acts-18.html#vs11")
                || isValidVerse(curFile, vs, "Acts-21.html#vs28")
                || isValidVerse(curFile, vs, "Acts-28.html#vs31")
                || isValidVerse(curFile, vs, "Gal-6.html#vs6")
                || isValidVerse(curFile, vs, "1Tim-2.html#vs12");
    } // isOnderwijsGeven

    public static boolean isOpdrachtGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs20")
                || isValidVerse(curFile, vs, "Gen-42.html#vs25")
                || isValidVerse(curFile, vs, "Gen-50.html#vs16")
                || isValidVerse(curFile, vs, "Lev-14.html#vs4", 5, 36, 40)
                || isValidVerse(curFile, vs, "Num-32.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs6", 17)
                || isValidVerse(curFile, vs, "2Kgs-22.html#vs12")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs20")
                || isValidVerse(curFile, vs, "Neh-05.html#vs14")
                || isValidVerse(curFile, vs, "Esth-04.html#vs5", 8, 10)
                || isValidVerse(curFile, vs, "Isa-13.html#vs3")
                || isValidVerse(curFile, vs, "Jer-14.html#vs14")
                || isValidVerse(curFile, vs, "Jer-23.html#vs32")
                || isValidVerse(curFile, vs, "Jer-32.html#vs13")
                || isValidVerse(curFile, vs, "Jer-47.html#vs7")
                || isValidVerse(curFile, vs, "Jer-51.html#vs59")
                || isValidVerse(curFile, vs, "Amos-9.html#vs3", 4, 9)
                || isValidVerse(curFile, vs, "Matt-11.html#vs1")
                || isValidVerse(curFile, vs, "Matt-14.html#vs19")
                || isValidVerse(curFile, vs, "Matt-15.html#vs35")
                || isValidVerse(curFile, vs, "Matt-18.html#vs25")
                || isValidVerse(curFile, vs, "Luke-08.html#vs55")
                || isValidVerse(curFile, vs, "John-11.html#vs57")
                || isValidVerse(curFile, vs, "Acts-01.html#vs2")
                || isValidVerse(curFile, vs, "Acts-05.html#vs34")
                || isValidVerse(curFile, vs, "Acts-15.html#vs24")
                || isValidVerse(curFile, vs, "Acts-24.html#vs23")
                || isValidVerse(curFile, vs, "Acts-25.html#vs21")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs34")
                || isValidVerse(curFile, vs, "Heb-11.html#vs22");
    } // isOpdrachtGeven

    public static boolean isOpgeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-14.html#vs13")
                || isValidVerse(curFile, vs, "Ps-046.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs2")
                || isValidVerse(curFile, vs, "Acts-27.html#vs15");
    } // isOpgeven

    public static boolean isOvergeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-02.html#vs33")
                || isValidVerse(curFile, vs, "Deut-23.html#vs14")
                || isValidVerse(curFile, vs, "Judg-02.html#vs14", 23)
                || isValidVerse(curFile, vs, "Judg-06.html#vs1")
                || isValidVerse(curFile, vs, "Judg-13.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs31")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs14")
                || isValidVerse(curFile, vs, "Neh-04.html#vs4")
                || isValidVerse(curFile, vs, "Neh-09.html#vs28")
                || isValidVerse(curFile, vs, "Ps-027.html#vs12")
                || isValidVerse(curFile, vs, "Ps-037.html#vs33")
                || isValidVerse(curFile, vs, "Ps-041.html#vs3")
                || isValidVerse(curFile, vs, "Ps-044.html#vs12")
                || isValidVerse(curFile, vs, "Ps-074.html#vs19")
                || isValidVerse(curFile, vs, "Ps-078.html#vs61")
                || isValidVerse(curFile, vs, "Ps-081.html#vs13")
                || isValidVerse(curFile, vs, "Ps-119.html#vs121")
                || isValidVerse(curFile, vs, "Isa-36.html#vs16")
                || isValidVerse(curFile, vs, "Isa-47.html#vs6")
                || isValidVerse(curFile, vs, "Jer-18.html#vs21")
                || isValidVerse(curFile, vs, "Jer-39.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-15.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs28", 46)
                || isValidVerse(curFile, vs, "Hos-04.html#vs18")
                || isValidVerse(curFile, vs, "Joel-2.html#vs17")
                || isValidVerse(curFile, vs, "Matt-18.html#vs34")
                || isValidVerse(curFile, vs, "Matt-27.html#vs26")
                || isValidVerse(curFile, vs, "Acts-07.html#vs10")
                || isValidVerse(curFile, vs, "Acts-12.html#vs4")
                || isValidVerse(curFile, vs, "Acts-27.html#vs1")
                || isValidVerse(curFile, vs, "1Cor-05.html#vs5");
    } // isOvergeven

    public static boolean isPrijsgeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-27.html#vs40");
    } // isPrijsgeven

    public static boolean isRaadGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-18.html#vs19")
                || isValidVerse(curFile, vs, "Num-24.html#vs14")
                || isValidVerse(curFile, vs, "Judg-20.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs20", 23)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs7", 11)
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs8", 13)
                || isValidVerse(curFile, vs, "Job-26.html#vs3")
                || isValidVerse(curFile, vs, "Ps-016.html#vs7")
                || isValidVerse(curFile, vs, "Ps-032.html#vs8")
                || isValidVerse(curFile, vs, "Prov-13.html#vs10")
                || isValidVerse(curFile, vs, "Jer-18.html#vs18")
                || isValidVerse(curFile, vs, "Jer-38.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs2")
                || isValidVerse(curFile, vs, "John-18.html#vs14");
    } // isRaadGeven

    public static boolean isRuimteGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-33.html#vs20")
                || isValidVerse(curFile, vs, "Judg-20.html#vs36")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs37")
                || isValidVerse(curFile, vs, "Ps-018.html#vs37");
    } // isRuimteGeven

    public static boolean isRustGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-03.html#vs20")
                || isValidVerse(curFile, vs, "Deut-12.html#vs10")
                || isValidVerse(curFile, vs, "Deut-25.html#vs19")
                || isValidVerse(curFile, vs, "Josh-01.html#vs13", 15)
                || isValidVerse(curFile, vs, "Josh-21.html#vs44")
                || isValidVerse(curFile, vs, "Josh-22.html#vs4")
                || isValidVerse(curFile, vs, "Josh-23.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-07.html#vs1", 11)
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs56")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs9", 18)
                || isValidVerse(curFile, vs, "1Chr-23.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs6", 7)
                || isValidVerse(curFile, vs, "2Chr-15.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs30")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs22")
                || isValidVerse(curFile, vs, "Ps-094.html#vs13")
                || isValidVerse(curFile, vs, "Prov-29.html#vs17")
                || isValidVerse(curFile, vs, "Isa-14.html#vs3")
                || isValidVerse(curFile, vs, "Isa-28.html#vs12")
                || isValidVerse(curFile, vs, "Isa-62.html#vs7")
                || isValidVerse(curFile, vs, "Isa-63.html#vs14")
                || isValidVerse(curFile, vs, "Matt-11.html#vs28");
    } // isRustGeven

    public static boolean isTeKennenGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Sam-09.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs13")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs16")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs10")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs24")
                || isValidVerse(curFile, vs, "Job-15.html#vs5", 17)
                || isValidVerse(curFile, vs, "Jer-24.html#vs7")
                || isValidVerse(curFile, vs, "Dan-02.html#vs4", 6, 7, 9, 10, 11, 16, 24, 27)
                || isValidVerse(curFile, vs, "Dan-04.html#vs2")
                || isValidVerse(curFile, vs, "Dan-05.html#vs7", 12, 15)
                || isValidVerse(curFile, vs, "Luke-20.html#vs37")
                || isValidVerse(curFile, vs, "John-11.html#vs57")
                || isValidVerse(curFile, vs, "Acts-11.html#vs28")
                || isValidVerse(curFile, vs, "Acts-23.html#vs30")
                || isValidVerse(curFile, vs, "Acts-25.html#vs27")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs28")
                || isValidVerse(curFile, vs, "Rev-01.html#vs1");
    } // isTeKennenGeven

    public static boolean isTenHuwelijkGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-29.html#vs26")
                || isValidVerse(curFile, vs, "Matt-22.html#vs30")
                || isValidVerse(curFile, vs, "Matt-24.html#vs38")
                || isValidVerse(curFile, vs, "Mark-12.html#vs25")
                || isValidVerse(curFile, vs, "Luke-17.html#vs27")
                || isValidVerse(curFile, vs, "Luke-20.html#vs34", 35)
                || isValidVerse(curFile, vs, "1Cor-07.html#vs38")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs2");
    } // isTenHuwelijkGeven

    public static boolean isTeruggeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-20.html#vs7", 14)
                || isValidVerse(curFile, vs, "Deut-22.html#vs2")
                || isValidVerse(curFile, vs, "Judg-11.html#vs13")
                || isValidVerse(curFile, vs, "Judg-17.html#vs3", 4)
                || isValidVerse(curFile, vs, "Neh-05.html#vs11")
                || isValidVerse(curFile, vs, "Ps-051.html#vs14")
                || isValidVerse(curFile, vs, "Isa-42.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs15")
                || isValidVerse(curFile, vs, "Luke-09.html#vs42")
                || isValidVerse(curFile, vs, "Luke-19.html#vs8");
    } // isTeruggeven

    public static boolean isUitlegGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-40.html#vs16")
                || isValidVerse(curFile, vs, "Neh-08.html#vs9");
    } // isUitlegGeven

    public static boolean isVruchtGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-25.html#vs19")
                || isValidVerse(curFile, vs, "Lev-26.html#vs4", 20)
                || isValidVerse(curFile, vs, "Ps-001.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs27")
                || isValidVerse(curFile, vs, "Zech-08.html#vs12")
                || isValidVerse(curFile, vs, "Matt-13.html#vs8")
                || isValidVerse(curFile, vs, "Matt-21.html#vs41")
                || isValidVerse(curFile, vs, "Mark-04.html#vs7", 8)
                || isValidVerse(curFile, vs, "Rev-22.html#vs2");
    } // isVruchtGeven

    public static boolean isWeggeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-12.html#vs33")
                || isValidVerse(curFile, vs, "Didache-13.html#vs5", 7);
    } // isWeggeven

    public static boolean isZegenGeven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-28.html#vs4")
                || isValidVerse(curFile, vs, "Exod-32.html#vs29")
                || isValidVerse(curFile, vs, "Josh-15.html#vs19")
                || isValidVerse(curFile, vs, "Judg-01.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs26");
    } // isZegenGeven

    public static boolean isGeven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals("gaven")) {
            return isGaven(curFile, vs);
        }
        return !isAanleidingGeven(curFile, vs)
                && !isAanstootGeven(curFile, vs)
                && !isAanzienGeven(curFile, vs)
                && !isAchtGeven(curFile, vs)
                && !isAntwoordGeven(curFile, vs)
                && !isBevelGeven(curFile, vs)
                && !isDeBorstGeven(curFile, vs, keyArg, arg)
                && !isDeGeestGeven(curFile, vs, keyArg, arg)
                && !isDoorgeven(curFile, vs)
                && !isEerGeven(curFile, vs)
                && !isGaaf(arg)
                && !isGave(curFile, vs)
                && !isGehoorGeven(curFile, vs)
                && !isGenadeGeven(curFile, vs)
                && !isGetuigenisGeven(curFile, vs)
                && !isInBewaringGeven(curFile, vs, keyArg, arg)
                && !isInzichtGeven(curFile, vs)
                && !isLeidingGeven(curFile, vs)
                && !isLichtGeven(curFile, vs)
                && !isMeegeven(curFile, vs)
                && !isOnderrichtGeven(curFile, vs)
                && !isOnderwijsGeven(curFile, vs)
                && !isOpdrachtGeven(curFile, vs)
                && !isOpgeven(curFile, vs)
                && !isOvergeven(curFile, vs)
                && !isPrijsgeven(curFile, vs)
                && !isRaadGeven(curFile, vs)
                && !isRuimteGeven(curFile, vs)
                && !isRustGeven(curFile, vs)
                && !isTeKennenGeven(curFile, vs, keyArg, arg)
                && !isTenHuwelijkGeven(curFile, vs, keyArg, arg)
                && !isTeruggeven(curFile, vs)
                && !isUitlegGeven(curFile, vs)
                && !isVruchtGeven(curFile, vs)
                && !isWeggeven(curFile, vs)
                && !isZegenGeven(curFile, vs);
    }  // isGeven

}
