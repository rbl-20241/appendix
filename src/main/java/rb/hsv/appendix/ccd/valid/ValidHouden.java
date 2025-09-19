package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidVoorOgen.isVoorOgenHouden;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHouden {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanhouden" -> isAanhouden(curFile, vs);
            case "achterhouden" -> isAchterhouden(curFile, vs);
            case "afhouden" -> isAfhouden(curFile, vs);
            case "bezighouden" -> isBezighouden(curFile, vs);
            case "bijeenhouden" -> isBijeenhouden(curFile, vs);
            case "de wacht houden" -> isDeWachtHouden(curFile, vs, arg);
            case "geheim houden" -> isGeheimHouden(curFile, vs);
            case "gereedhouden" -> isGereedhouden(curFile, vs);
            case "gevangen houden" -> isGevangenHouden(curFile, vs);
            case "houden aan" -> isHoudenAan(curFile, vs);
            case "in bedwang houden" -> isInBedwangHouden(curFile, vs, arg);
            case "in bewaring houden" -> isInBewaringHouden(curFile, vs, arg);
            case "in ere houden" -> isInEreHouden(curFile, vs, arg);
            case "in gedachten houden" -> isInGedachtenHouden(curFile, vs, arg);
            case "in het oog houden" -> isInHetOogHouden(curFile, vs, arg);
            case "in leven houden" -> isInLevenHouden(curFile, vs, arg);
            case "in stand houden" -> isInStandHouden(curFile, vs, arg);
            case "in toom houden" -> isInToomHouden(curFile, vs, arg);
            case "inhoud" -> isInhoud(curFile, vs);
            case "inhouden" -> isInhouden(curFile, vs);
            case "oog gericht houden op" -> isOogGerichtHoudenOp(curFile, vs, arg);
            case "ophouden" -> isOphouden(curFile, vs);
            case "overhouden" -> isOverhouden(curFile, vs);
            case "rekening houden met" -> isRekeningHoudenMet(curFile, vs, arg);
            case "staande houden" -> isStaandeHouden(curFile, vs);
            case "standhouden" -> isStandhouden(curFile, vs);
            case "tegenhouden" -> isTegenhouden(curFile, vs);
            case "toezicht houden" -> isToezichtHouden(curFile, vs);
            case "vasthouden" -> isVasthouden(curFile, vs);
            case "ver houden van" -> isVerHoudenVan(curFile, vs, arg);
            case "volhouden" -> isVolhouden(curFile, vs);
            case "voor [iets] houden" -> isVoorIetsHouden(curFile, vs);
            case "voorhouden" -> isVoorhouden(curFile, vs);
            case "woord houden" -> isWoordHouden(curFile, vs);
            case "zitting houden" -> isZittingHouden(curFile, vs);
            case "houden" -> isHouden(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAanhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-08.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs25")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs24");
    } // isAanhouden

    public static boolean isAchterhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-21.html#vs26")
                || isValidVerse(curFile, vs, "Acts-05.html#vs2");
    } // isAchterhouden

    public static boolean isAfhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-05.html#vs4")
                || isValidVerse(curFile, vs, "Job-33.html#vs18")
                || isValidVerse(curFile, vs, "Hos-12.html#vs8")
                || isValidVerse(curFile, vs, "Acts-13.html#vs8");
    } // isAfhouden

    public static boolean isBezighouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Tim-1.html#vs4");
    } // isBezighouden

    public static boolean isBijeenhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-14.html#vs17");
    } // isBijeenhouden

    public static boolean isGeheimHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-05.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs3")
                || isValidVerse(curFile, vs, "Dan-08.html#vs26")
                || isValidVerse(curFile, vs, "Dan-12.html#vs4");
    } // isGeheimHouden

    public static boolean isDeWachtHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("de wacht houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-31.html#vs49")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs34")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs23")
                || isValidVerse(curFile, vs, "Neh-11.html#vs19")
                || isValidVerse(curFile, vs, "Neh-12.html#vs25")
                || isValidVerse(curFile, vs, "Ps-066.html#vs7")
                || isValidVerse(curFile, vs, "Luke-02.html#vs8");
    } // isDeWachtHouden

    public static boolean isGereedhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-08.html#vs4")
                || isValidVerse(curFile, vs, "Prov-02.html#vs7");
    } // isGereedhouden

    public static boolean isGevangenHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-137.html#vs3")
                || isValidVerse(curFile, vs, "Isa-14.html#vs2");
    } // isGevangenHouden

    public static boolean isHoudenAan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-34.html#vs11")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs24", 25)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs15")
                || isValidVerse(curFile, vs, "Job-22.html#vs15")
                || isValidVerse(curFile, vs, "Job-23.html#vs11")
                || isValidVerse(curFile, vs, "Ps-018.html#vs22")
                || isValidVerse(curFile, vs, "Ps-037.html#vs34")
                || isValidVerse(curFile, vs, "Ps-105.html#vs45")
                || isValidVerse(curFile, vs, "Ps-106.html#vs3")
                || isValidVerse(curFile, vs, "Ps-119.html#vs34", 101, 146, 158)
                || isValidVerse(curFile, vs, "Prov-29.html#vs18")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs2")
                || isValidVerse(curFile, vs, "Eccl-12.html#vs13")
                || isValidVerse(curFile, vs, "Dan-09.html#vs4")
                || isValidVerse(curFile, vs, "Hos-12.html#vs7")
                || isValidVerse(curFile, vs, "Mic-6.html#vs16")
                || isValidVerse(curFile, vs, "Mark-07.html#vs3", 8, 9)
                || isValidVerse(curFile, vs, "Acts-08.html#vs6")
                || isValidVerse(curFile, vs, "Gal-4.html#vs10")
                || isValidVerse(curFile, vs, "Eph-4.html#vs15")
                || isValidVerse(curFile, vs, "Col-2.html#vs19")
                || isValidVerse(curFile, vs, "Col-4.html#vs2")
                || isValidVerse(curFile, vs, "2Thess-2.html#vs15")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs3")
                || isValidVerse(curFile, vs, "2Tim-1.html#vs13")
                || isValidVerse(curFile, vs, "Titus-1.html#vs9")
                || isValidVerse(curFile, vs, "Heb-02.html#vs1")
                || isValidVerse(curFile, vs, "Rev-02.html#vs14", 15);
    } // isHoudenAan

    public static boolean isInBedwangHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in bedwang houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Prov-25.html#vs28")
                || isValidVerse(curFile, vs, "Mark-05.html#vs4");
    } // isInBedwangHouden

    public static boolean isInEreHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in ere houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Rom-14.html#vs6")
                || isValidVerse(curFile, vs, "Phil-2.html#vs29")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs3")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs17");
    } // isInEreHouden

    public static boolean isInBewaringHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in bewaring houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-12.html#vs6")
                || isValidVerse(curFile, vs, "Luke-08.html#vs29");
    } // isInBewaringHouden

    public static boolean isInGedachtenHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in gedachten houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-37.html#vs11")
                || isValidVerse(curFile, vs, "Deut-05.html#vs15")
                || isValidVerse(curFile, vs, "Deut-08.html#vs2", 18)
                || isValidVerse(curFile, vs, "Deut-09.html#vs7")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs2")
                || isValidVerse(curFile, vs, "Hos-07.html#vs2")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs8")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs15");
    } // isInGedachtenHouden

    public static boolean isInHetOogHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in het oog houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Sam-18.html#vs9")
                || isValidVerse(curFile, vs, "Prov-31.html#vs27")
                || isValidVerse(curFile, vs, "Nah-2.html#vs1")
                || isValidVerse(curFile, vs, "Luke-20.html#vs20")
                || isValidVerse(curFile, vs, "Rom-16.html#vs17")
                || isValidVerse(curFile, vs, "Gal-6.html#vs1");
    } // isInHetOogHouden

    public static boolean isInLevenHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in leven houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-06.html#vs19", 20)
                || isValidVerse(curFile, vs, "Gen-07.html#vs3")
                || isValidVerse(curFile, vs, "Gen-19.html#vs19")
                || isValidVerse(curFile, vs, "Gen-45.html#vs7")
                || isValidVerse(curFile, vs, "Gen-47.html#vs25")
                || isValidVerse(curFile, vs, "Gen-50.html#vs20")
                || isValidVerse(curFile, vs, "Deut-06.html#vs24")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs5")
                || isValidVerse(curFile, vs, "Jer-38.html#vs17");
    } // isInLevenHouden

    public static boolean isInStandHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in stand houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-25.html#vs7")
                || isValidVerse(curFile, vs, "Ruth-4.html#vs5", 10)
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs4")
                || isValidVerse(curFile, vs, "Prov-29.html#vs4");
    } // isInStandHouden

    public static boolean isInToomHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("in toom houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Ps-032.html#vs9")
                || isValidVerse(curFile, vs, "Prov-29.html#vs11")
                || isValidVerse(curFile, vs, "Jas-1.html#vs26")
                || isValidVerse(curFile, vs, "Jas-3.html#vs2");
    } // isInToomHouden

    public static boolean isInhoud(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-18.html#vs27")
                || isValidVerse(curFile, vs, "Deut-32.html#vs47")
                || isValidVerse(curFile, vs, "Esth-03.html#vs14")
                || isValidVerse(curFile, vs, "Esth-08.html#vs13")
                || isValidVerse(curFile, vs, "Ps-002.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs23")
                || isValidVerse(curFile, vs, "Luke-11.html#vs41")
                || isValidVerse(curFile, vs, "John-02.html#vs6")
                || isValidVerse(curFile, vs, "Acts-23.html#vs25")
                || isValidVerse(curFile, vs, "Rom-04.html#vs14")
                || isValidVerse(curFile, vs, "1Cor-01.html#vs17")
                || isValidVerse(curFile, vs, "1Cor-09.html#vs15")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs3");
    } // isInhoud

    public static boolean isInhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-29.html#vs9")
                || isValidVerse(curFile, vs, "Prov-17.html#vs27")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs8")
                || isValidVerse(curFile, vs, "Isa-58.html#vs1")
                || isValidVerse(curFile, vs, "Isa-63.html#vs15")
                || isValidVerse(curFile, vs, "Jer-06.html#vs11")
                || isValidVerse(curFile, vs, "Jer-20.html#vs9")
                || isValidVerse(curFile, vs, "1John-4.html#vs18");
    } // isInhouden

    public static boolean isOogGerichtHoudenOp(final File curFile, final String vs, final String arg) {
        if (arg.equals("oog gericht houden op")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Jer-24.html#vs6")
                || isValidVerse(curFile, vs, "Jer-39.html#vs12")
                || isValidVerse(curFile, vs, "Jer-40.html#vs4")
                || isValidVerse(curFile, vs, "Acts-01.html#vs10")
                || isValidVerse(curFile, vs, "Acts-03.html#vs5")
                || isValidVerse(curFile, vs, "Acts-06.html#vs15")
                || isValidVerse(curFile, vs, "Acts-07.html#vs55")
                || isValidVerse(curFile, vs, "Acts-10.html#vs4")
                || isValidVerse(curFile, vs, "Acts-11.html#vs6")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs7", 13)
                || isValidVerse(curFile, vs, "2Cor-04.html#vs18")
                || isValidVerse(curFile, vs, "Phil-3.html#vs17")
                || isValidVerse(curFile, vs, "Heb-12.html#vs2");
    } // isOogGerichtHoudenOp

    public static boolean isOphouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-11.html#vs8")
                || isValidVerse(curFile, vs, "Gen-24.html#vs56")
                || isValidVerse(curFile, vs, "Gen-29.html#vs35")
                || isValidVerse(curFile, vs, "Exod-09.html#vs33")
                || isValidVerse(curFile, vs, "Josh-05.html#vs12")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs18")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs16")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs21", 24)
                || isValidVerse(curFile, vs, "Job-03.html#vs17")
                || isValidVerse(curFile, vs, "Job-10.html#vs20")
                || isValidVerse(curFile, vs, "Job-32.html#vs1")
                || isValidVerse(curFile, vs, "Ps-077.html#vs9")
                || isValidVerse(curFile, vs, "Prov-19.html#vs27")
                || isValidVerse(curFile, vs, "Prov-26.html#vs20")
                || isValidVerse(curFile, vs, "Isa-01.html#vs16")
                || isValidVerse(curFile, vs, "Isa-14.html#vs4")
                || isValidVerse(curFile, vs, "Isa-17.html#vs1")
                || isValidVerse(curFile, vs, "Isa-24.html#vs8")
                || isValidVerse(curFile, vs, "Jer-17.html#vs8")
                || isValidVerse(curFile, vs, "Jer-51.html#vs30")
                || isValidVerse(curFile, vs, "Amos-7.html#vs5")
                || isValidVerse(curFile, vs, "Nah-3.html#vs1")
                || isValidVerse(curFile, vs, "Matt-27.html#vs49")
                || isValidVerse(curFile, vs, "Mark-15.html#vs36")
                || isValidVerse(curFile, vs, "Luke-08.html#vs44")
                || isValidVerse(curFile, vs, "Acts-05.html#vs42")
                || isValidVerse(curFile, vs, "Acts-06.html#vs13")
                || isValidVerse(curFile, vs, "Acts-21.html#vs32")
                || isValidVerse(curFile, vs, "Acts-24.html#vs4")
                || isValidVerse(curFile, vs, "Eph-1.html#vs16")
                || isValidVerse(curFile, vs, "Col-1.html#vs9");
    } // isOphouden

    public static boolean isOverhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-2.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs44")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs4");
    } // isOverhouden

    public static boolean isRekeningHoudenMet(final File curFile, final String vs, final String arg) {
        if (arg.equals("rekening houden met")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-12.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs14");
    } // isRekeningHoudenMet

    public static boolean isStaandeHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-22.html#vs35")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs34")
                || isValidVerse(curFile, vs, "Ps-146.html#vs9")
                || isValidVerse(curFile, vs, "Ps-147.html#vs6")
                || isValidVerse(curFile, vs, "Rom-14.html#vs4");
    } // isStaandeHouden

    public static boolean isStandhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-14.html#vs13")
                || isValidVerse(curFile, vs, "Lev-26.html#vs37")
                || isValidVerse(curFile, vs, "Deut-32.html#vs6")
                || isValidVerse(curFile, vs, "Josh-23.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs14")
                || isValidVerse(curFile, vs, "Esth-03.html#vs4")
                || isValidVerse(curFile, vs, "Job-14.html#vs2")
                || isValidVerse(curFile, vs, "Job-15.html#vs29")
                || isValidVerse(curFile, vs, "Job-41.html#vs17")
                || isValidVerse(curFile, vs, "Ps-019.html#vs10")
                || isValidVerse(curFile, vs, "Ps-048.html#vs9")
                || isValidVerse(curFile, vs, "Ps-089.html#vs5", 44)
                || isValidVerse(curFile, vs, "Ps-101.html#vs7")
                || isValidVerse(curFile, vs, "Ps-111.html#vs3", 10)
                || isValidVerse(curFile, vs, "Ps-112.html#vs3", 9)
                || isValidVerse(curFile, vs, "Ps-140.html#vs12")
                || isValidVerse(curFile, vs, "Prov-12.html#vs19")
                || isValidVerse(curFile, vs, "Prov-19.html#vs21")
                || isValidVerse(curFile, vs, "Prov-29.html#vs4")
                || isValidVerse(curFile, vs, "Isa-07.html#vs9")
                || isValidVerse(curFile, vs, "Isa-28.html#vs18")
                || isValidVerse(curFile, vs, "Isa-46.html#vs10")
                || isValidVerse(curFile, vs, "Jer-44.html#vs29")
                || isValidVerse(curFile, vs, "Jer-46.html#vs15", 21)
                || isValidVerse(curFile, vs, "Dan-06.html#vs27")
                || isValidVerse(curFile, vs, "Dan-08.html#vs7")
                || isValidVerse(curFile, vs, "Dan-11.html#vs15", 25)
                || isValidVerse(curFile, vs, "Rom-09.html#vs11")
                || isValidVerse(curFile, vs, "Eph-6.html#vs11", 13, 14);
    } // isStandhouden

    public static boolean isTegenhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-18.html#vs16")
                || isValidVerse(curFile, vs, "Job-12.html#vs15")
                || isValidVerse(curFile, vs, "Ps-035.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs15")
                || isValidVerse(curFile, vs, "Joel-2.html#vs8")
                || isValidVerse(curFile, vs, "Mark-03.html#vs21")
                || isValidVerse(curFile, vs, "Luke-04.html#vs42")
                || isValidVerse(curFile, vs, "Acts-11.html#vs17")
                || isValidVerse(curFile, vs, "Rev-07.html#vs1");
    } // isTegenhouden

    public static boolean isToezichtHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-23.html#vs4")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs8", 9)
                || isValidVerse(curFile, vs, "1Pet-5.html#vs2");
    } // isToezichtHouden

    public static boolean isVasthouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-21.html#vs18")
                || isValidVerse(curFile, vs, "Deut-11.html#vs22")
                || isValidVerse(curFile, vs, "Deut-12.html#vs23")
                || isValidVerse(curFile, vs, "Deut-30.html#vs20")
                || isValidVerse(curFile, vs, "Judg-07.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs6")
                || isValidVerse(curFile, vs, "Neh-04.html#vs17", 21)
                || isValidVerse(curFile, vs, "Job-02.html#vs3", 9)
                || isValidVerse(curFile, vs, "Job-36.html#vs17")
                || isValidVerse(curFile, vs, "Prov-04.html#vs13")
                || isValidVerse(curFile, vs, "Prov-11.html#vs16")
                || isValidVerse(curFile, vs, "Prov-31.html#vs19")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs3")
                || isValidVerse(curFile, vs, "Jer-08.html#vs5")
                || isValidVerse(curFile, vs, "Mark-09.html#vs10")
                || isValidVerse(curFile, vs, "John-20.html#vs17")
                || isValidVerse(curFile, vs, "Rom-12.html#vs9")
                || isValidVerse(curFile, vs, "Phil-2.html#vs16")
                || isValidVerse(curFile, vs, "Heb-06.html#vs18")
                || isValidVerse(curFile, vs, "Rev-02.html#vs13", 25)
                || isValidVerse(curFile, vs, "Rev-03.html#vs3", 11);
    } // isVasthouden

    public static boolean isVerHoudenVan(final File curFile, final String vs, final String arg) {
        if (arg.equals("ver houden van")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-23.html#vs7")
                || isValidVerse(curFile, vs, "Lev-15.html#vs31")
                || isValidVerse(curFile, vs, "Ps-010.html#vs5")
                || isValidVerse(curFile, vs, "Ps-073.html#vs27")
                || isValidVerse(curFile, vs, "Prov-04.html#vs24")
                || isValidVerse(curFile, vs, "Prov-05.html#vs8")
                || isValidVerse(curFile, vs, "Prov-22.html#vs5", 15)
                || isValidVerse(curFile, vs, "Prov-30.html#vs8")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs5")
                || isValidVerse(curFile, vs, "Isa-29.html#vs13")
                || isValidVerse(curFile, vs, "Isa-54.html#vs14")
                || isValidVerse(curFile, vs, "Jer-02.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs10")
                || isValidVerse(curFile, vs, "Matt-15.html#vs8")
                || isValidVerse(curFile, vs, "Mark-07.html#vs6")
                || isValidVerse(curFile, vs, "Acts-05.html#vs38")
                || isValidVerse(curFile, vs, "Acts-15.html#vs29")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs19");
    } // isVerHoudenVan

    public static boolean isVolhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-12.html#vs15");
    } // isVolhouden

    public static boolean isVoorIetsHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs15")
                || isValidVerse(curFile, vs, "Gen-42.html#vs30")
                || isValidVerse(curFile, vs, "Exod-20.html#vs7")
                || isValidVerse(curFile, vs, "Exod-34.html#vs7")
                || isValidVerse(curFile, vs, "Lev-21.html#vs8")
                || isValidVerse(curFile, vs, "Num-14.html#vs18")
                || isValidVerse(curFile, vs, "Deut-05.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs13", 16)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs9")
                || isValidVerse(curFile, vs, "Job-09.html#vs28")
                || isValidVerse(curFile, vs, "Job-10.html#vs14")
                || isValidVerse(curFile, vs, "Job-13.html#vs24")
                || isValidVerse(curFile, vs, "Job-41.html#vs23")
                || isValidVerse(curFile, vs, "Ps-119.html#vs128")
                || isValidVerse(curFile, vs, "Prov-06.html#vs29")
                || isValidVerse(curFile, vs, "Prov-11.html#vs21")
                || isValidVerse(curFile, vs, "Prov-16.html#vs5")
                || isValidVerse(curFile, vs, "Prov-17.html#vs5")
                || isValidVerse(curFile, vs, "Prov-19.html#vs5", 9)
                || isValidVerse(curFile, vs, "Prov-28.html#vs20")
                || isValidVerse(curFile, vs, "Isa-30.html#vs22")
                || isValidVerse(curFile, vs, "Isa-53.html#vs4")
                || isValidVerse(curFile, vs, "Jer-25.html#vs29")
                || isValidVerse(curFile, vs, "Jer-30.html#vs11")
                || isValidVerse(curFile, vs, "Jer-46.html#vs28")
                || isValidVerse(curFile, vs, "Jer-49.html#vs12")
                || isValidVerse(curFile, vs, "Joel-3.html#vs21")
                || isValidVerse(curFile, vs, "Matt-14.html#vs5")
                || isValidVerse(curFile, vs, "Matt-21.html#vs26", 46)
                || isValidVerse(curFile, vs, "Luke-14.html#vs18", 19)
                || isValidVerse(curFile, vs, "Phlm-1.html#vs17");
    } // isVoorIetsHouden

    public static boolean isVoorhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-12.html#vs24")
                || isValidVerse(curFile, vs, "Exod-19.html#vs7")
                || isValidVerse(curFile, vs, "Deut-11.html#vs26")
                || isValidVerse(curFile, vs, "Jer-21.html#vs8")
                || isValidVerse(curFile, vs, "Matt-13.html#vs24", 31);
    } // isVoorhouden

    public static boolean isWoordHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-33.html#vs9")
                || isValidVerse(curFile, vs, "Titus-1.html#vs9");
    } // isWoordHouden

    public static boolean isZittingHouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-18.html#vs13", 14)
                || isValidVerse(curFile, vs, "Ezra-10.html#vs16")
                || isValidVerse(curFile, vs, "Dan-07.html#vs10", 26);
    } // isZittingHouden

    private static boolean isHouden(final File curFile, final String vs, final String arg) {
        return !isAanhouden(curFile, vs)
                && !isAchterhouden(curFile, vs)
                && !isAfhouden(curFile, vs)
                && !isBezighouden(curFile, vs)
                && !isBijeenhouden(curFile, vs)
                && !isDeWachtHouden(curFile, vs, arg)
                && !isGeheimHouden(curFile, vs)
                && !isGereedhouden(curFile, vs)
                && !isGevangenHouden(curFile, vs)
                && !isHoudenAan(curFile, vs)
                && !isInBedwangHouden(curFile, vs, arg)
                && !isInBewaringHouden(curFile, vs, arg)
                && !isInEreHouden(curFile, vs, arg)
                && !isInGedachtenHouden(curFile, vs, arg)
                && !isInHetOogHouden(curFile, vs, arg)
                && !isInLevenHouden(curFile, vs, arg)
                && !isInStandHouden(curFile, vs, arg)
                && !isInToomHouden(curFile, vs, arg)
                && !isInhoud(curFile, vs)
                && !isInhouden(curFile, vs)
                && !isOogGerichtHoudenOp(curFile, vs, arg)
                && !isOphouden(curFile, vs)
                && !isOverhouden(curFile, vs)
                && !isRekeningHoudenMet(curFile, vs, arg)
                && !isStaandeHouden(curFile, vs)
                && !isStandhouden(curFile, vs)
                && !isTegenhouden(curFile, vs)
                && !isToezichtHouden(curFile, vs)
                && !isVasthouden(curFile, vs)
                && !isVerHoudenVan(curFile, vs, arg)
                && !isVolhouden(curFile, vs)
                && !isVoorIetsHouden(curFile, vs)
                && !isVoorOgenHouden(curFile, vs, arg)
                && !isVoorhouden(curFile, vs)
                && !isWoordHouden(curFile, vs)
                && !isZittingHouden(curFile, vs);
    }  // isHouden

}
