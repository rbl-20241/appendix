package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidBrengen.isTenUitvoerBrengen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVoeren {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanvoeren" -> isAanvoeren(curFile, vs);
            case "afvoeren" -> isAfvoeren(curFile, vs);
            case "bevel voeren" -> isBevelVoeren(curFile, vs);
            case "heerschappij voeren" -> isHeerschappijVoeren(curFile, vs);
            case "het woord voeren" -> isHetWoordVoeren(curFile, vs, keyArg, arg);
            case "in ballingschap voeren" -> isInBallingschapVoeren(curFile, vs, keyArg, arg);
            case "meevoeren" -> isMeevoeren(curFile, vs);
            case "oorlog voeren" -> isOorlogVoeren(curFile, vs);
            case "overleg voeren" -> isOverlegVoeren(curFile, vs);
            case "rechtszaak voeren" -> isRechtszaakVoeren(curFile, vs);
            case "strijd voeren" -> isStrijdVoeren(curFile, vs);
            case "uitvoeren" -> isUitvoeren(curFile, vs);
            case "voer" -> isVoer(curFile, vs);
            case "wegvoeren" -> isWegvoeren(curFile, vs);
            case "voeren" -> isVoeren(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAanvoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs31")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs17")
                || isValidVerse(curFile, vs, "Ps-078.html#vs26")
                || isValidVerse(curFile, vs, "Acts-19.html#vs40");
    } // isAanvoeren

    public static boolean isAfvoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-16.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs40")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs12")
                || isValidVerse(curFile, vs, "Jer-50.html#vs27");
    } // isAfvoeren

    public static boolean isBevelVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-12.html#vs4");
    } // isBevelVoeren

    public static boolean isHeerschappijVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-20.html#vs25")
                || isValidVerse(curFile, vs, "Mark-10.html#vs42")
                || isValidVerse(curFile, vs, "Rom-15.html#vs12")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs3")
                || isValidVerse(curFile, vs, "Rev-17.html#vs18");
    } // isHeerschappijVoeren

    public static boolean isHetWoordVoeren(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Acts-14.html#vs12");
    } // isHetWoordVoeren

    public static boolean isInBallingschapVoeren(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Judg-18.html#vs30")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs14", 15, 16)
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs11")
                || isValidVerse(curFile, vs, "1Chr-05.html#vs6", 26)
                || isValidVerse(curFile, vs, "1Chr-06.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-02.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs10")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs12")
                || isValidVerse(curFile, vs, "Neh-07.html#vs6")
                || isValidVerse(curFile, vs, "Esth-02.html#vs6")
                || isValidVerse(curFile, vs, "Jer-20.html#vs4")
                || isValidVerse(curFile, vs, "Jer-22.html#vs12")
                || isValidVerse(curFile, vs, "Jer-24.html#vs1")
                || isValidVerse(curFile, vs, "Jer-27.html#vs20")
                || isValidVerse(curFile, vs, "Jer-29.html#vs1", 4, 7, 14)
                || isValidVerse(curFile, vs, "Jer-39.html#vs9")
                || isValidVerse(curFile, vs, "Jer-43.html#vs3")
                || isValidVerse(curFile, vs, "Jer-52.html#vs15", 28, 30)
                || isValidVerse(curFile, vs, "Lam-4.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs28")
                || isValidVerse(curFile, vs, "Amos-1.html#vs6")
                || isValidVerse(curFile, vs, "Amos-5.html#vs27")
                || isValidVerse(curFile, vs, "Amos-7.html#vs11", 17);
    } // isInBallingschapVoeren

    public static boolean isMeevoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs18")
                || isValidVerse(curFile, vs, "Judg-15.html#vs13")
                || isValidVerse(curFile, vs, "Judg-16.html#vs31")
                || isValidVerse(curFile, vs, "Job-15.html#vs12")
                || isValidVerse(curFile, vs, "Eccl-10.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs13");
    } // isMeevoeren

    public static boolean isOorlogVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-14.html#vs2")
                || isValidVerse(curFile, vs, "Deut-20.html#vs12", 20)
                || isValidVerse(curFile, vs, "1Sam-08.html#vs20")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs46")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs28")
                || isValidVerse(curFile, vs, "1Chr-05.html#vs10", 19)
                || isValidVerse(curFile, vs, "1Chr-22.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs21")
                || isValidVerse(curFile, vs, "Ps-120.html#vs7")
                || isValidVerse(curFile, vs, "Ps-144.html#vs1")
                || isValidVerse(curFile, vs, "Prov-20.html#vs18")
                || isValidVerse(curFile, vs, "Prov-24.html#vs6")
                || isValidVerse(curFile, vs, "Isa-02.html#vs4")
                || isValidVerse(curFile, vs, "Isa-07.html#vs1")
                || isValidVerse(curFile, vs, "Dan-07.html#vs21")
                || isValidVerse(curFile, vs, "Dan-11.html#vs11")
                || isValidVerse(curFile, vs, "Mic-4.html#vs3")
                || isValidVerse(curFile, vs, "Rev-02.html#vs16")
                || isValidVerse(curFile, vs, "Rev-11.html#vs7")
                || isValidVerse(curFile, vs, "Rev-12.html#vs7", 17)
                || isValidVerse(curFile, vs, "Rev-13.html#vs4", 7)
                || isValidVerse(curFile, vs, "Rev-17.html#vs14")
                || isValidVerse(curFile, vs, "Rev-19.html#vs11", 19);
    } // isOorlogVoeren

    public static boolean isOverlegVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-01.html#vs7");
    } // isOverlegVoeren

    public static boolean isRechtszaakVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-13.html#vs8", 19)
                || isValidVerse(curFile, vs, "Job-23.html#vs6")
                || isValidVerse(curFile, vs, "Job-39.html#vs35")
                || isValidVerse(curFile, vs, "Ps-035.html#vs23")
                || isValidVerse(curFile, vs, "Ps-043.html#vs1")
                || isValidVerse(curFile, vs, "Ps-074.html#vs22")
                || isValidVerse(curFile, vs, "Ps-119.html#vs154")
                || isValidVerse(curFile, vs, "Prov-22.html#vs23")
                || isValidVerse(curFile, vs, "Prov-23.html#vs11")
                || isValidVerse(curFile, vs, "Prov-25.html#vs9")
                || isValidVerse(curFile, vs, "Prov-29.html#vs9")
                || isValidVerse(curFile, vs, "Isa-01.html#vs18")
                || isValidVerse(curFile, vs, "Isa-03.html#vs13")
                || isValidVerse(curFile, vs, "Isa-27.html#vs8")
                || isValidVerse(curFile, vs, "Isa-43.html#vs26")
                || isValidVerse(curFile, vs, "Isa-50.html#vs8")
                || isValidVerse(curFile, vs, "Isa-51.html#vs22")
                || isValidVerse(curFile, vs, "Isa-59.html#vs4")
                || isValidVerse(curFile, vs, "Isa-66.html#vs16")
                || isValidVerse(curFile, vs, "Jer-02.html#vs35")
                || isValidVerse(curFile, vs, "Jer-12.html#vs1")
                || isValidVerse(curFile, vs, "Jer-25.html#vs31")
                || isValidVerse(curFile, vs, "Jer-50.html#vs34")
                || isValidVerse(curFile, vs, "Jer-51.html#vs36")
                || isValidVerse(curFile, vs, "Lam-3.html#vs58")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs35", 36)
                || isValidVerse(curFile, vs, "Ezek-38.html#vs22")
                || isValidVerse(curFile, vs, "Hos-04.html#vs4")
                || isValidVerse(curFile, vs, "Joel-3.html#vs2")
                || isValidVerse(curFile, vs, "Amos-7.html#vs4")
                || isValidVerse(curFile, vs, "Mic-6.html#vs2")
                || isValidVerse(curFile, vs, "Mic-7.html#vs9");
    } // isRechtszaakVoeren

    public static boolean isStrijdVoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-30.html#vs8")
                || isValidVerse(curFile, vs, "Josh-11.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs10")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs10")
                || isValidVerse(curFile, vs, "Job-07.html#vs1")
                || isValidVerse(curFile, vs, "Isa-41.html#vs12")
                || isValidVerse(curFile, vs, "Rom-07.html#vs23")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs3")
                || isValidVerse(curFile, vs, "Col-2.html#vs1")
                || isValidVerse(curFile, vs, "Jas-4.html#vs1", 2)
                || isValidVerse(curFile, vs, "1Pet-2.html#vs11");
    } // isStrijdVoeren

    public static boolean isUitvoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-41.html#vs32")
                || isValidVerse(curFile, vs, "Exod-31.html#vs4")
                || isValidVerse(curFile, vs, "Exod-35.html#vs32")
                || isValidVerse(curFile, vs, "Deut-33.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-01.html#vs17")
                || isValidVerse(curFile, vs, "Esth-09.html#vs1")
                || isValidVerse(curFile, vs, "Prov-16.html#vs30")
                || isValidVerse(curFile, vs, "Isa-13.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs21")
                || isValidVerse(curFile, vs, "Rev-17.html#vs17");
    } // isUitvoeren

    public static boolean isVoer(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs25", 32)
                || isValidVerse(curFile, vs, "Gen-42.html#vs27")
                || isValidVerse(curFile, vs, "Gen-43.html#vs24")
                || isValidVerse(curFile, vs, "Judg-19.html#vs19", 21)
                || isValidVerse(curFile, vs, "Job-06.html#vs5")
                || isValidVerse(curFile, vs, "Job-24.html#vs6")
                || isValidVerse(curFile, vs, "Isa-30.html#vs24")
                || isValidVerse(curFile, vs, "Hos-11.html#vs4");
    } // isVoer

    public static boolean isWegvoeren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-34.html#vs29")
                || isValidVerse(curFile, vs, "Num-21.html#vs1")
                || isValidVerse(curFile, vs, "Num-31.html#vs9")
                || isValidVerse(curFile, vs, "Judg-21.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs13", 15)
                || isValidVerse(curFile, vs, "1Chr-05.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-08.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs6", 20)
                || isValidVerse(curFile, vs, "Job-12.html#vs17", 19)
                || isValidVerse(curFile, vs, "Isa-64.html#vs6")
                || isValidVerse(curFile, vs, "Jer-41.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs14")
                || isValidVerse(curFile, vs, "Dan-02.html#vs35")
                || isValidVerse(curFile, vs, "Joel-3.html#vs6")
                || isValidVerse(curFile, vs, "Luke-22.html#vs54")
                || isValidVerse(curFile, vs, "Acts-24.html#vs7")
                || isValidVerse(curFile, vs, "Rev-21.html#vs10");
    } // isWegvoeren

    public static boolean isVoeren(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return (!isAanvoeren(curFile, vs)
                && !isAfvoeren(curFile, vs)
                && !isBevelVoeren(curFile, vs)
                && !isHeerschappijVoeren(curFile, vs)
                && !isHetWoordVoeren(curFile, vs, keyArg, arg)
                && !isInBallingschapVoeren(curFile, vs, keyArg, arg)
                && !isMeevoeren(curFile, vs)
                && !isOorlogVoeren(curFile, vs)
                && !isOverlegVoeren(curFile, vs)
                && !isRechtszaakVoeren(curFile, vs)
                && !isStrijdVoeren(curFile, vs)
                && !isTenUitvoerBrengen(curFile, vs, arg)
                && !isUitvoeren(curFile, vs)
                && !isVoer(curFile, vs)
                && !isWegvoeren(curFile, vs))
                || isValidVerse(curFile, vs, "Deut-04.html#vs27")
                || isValidVerse(curFile, vs, "Deut-28.html#vs37")
                || isValidVerse(curFile, vs, "Josh-07.html#vs24")
                || isValidVerse(curFile, vs, "Judg-20.html#vs31")
                || isValidVerse(curFile, vs, "Judg-21.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs11")
                || isValidVerse(curFile, vs, "Job-13.html#vs8", 19)
                || isValidVerse(curFile, vs, "Prov-12.html#vs28")
                || isValidVerse(curFile, vs, "Prov-15.html#vs24")
                || isValidVerse(curFile, vs, "Jer-52.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs24")
                || isValidVerse(curFile, vs, "Hos-10.html#vs6")
                || isValidVerse(curFile, vs, "Luke-24.html#vs17")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs14")
                || isValidVerse(curFile, vs, "Rev-13.html#vs10");
    }  // isVoeren

}
