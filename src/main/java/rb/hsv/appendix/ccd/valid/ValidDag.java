package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDag {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "een dag" -> isEenDag(curFile, vs);
            case "twee dagen" -> isTweeDagen(curFile, vs);
            case "drie dagen" -> isDrieDagen(curFile, vs);
            case "drieenhalve dag" -> isDrieEnHalveDag(curFile, vs);
            case "vier dagen" -> isVierDagen(curFile, vs);
            case "vijf dagen" -> isVijfDagen(curFile, vs);
            case "zes dagen" -> isZesDagen(curFile, vs);
            case "zeven dagen" -> isZevenDagen(curFile, vs);
            case "acht dagen" -> isAchtDagen(curFile, vs);
            case "tien dagen" -> isTienDagen(curFile, vs);
            case "elf dagen" -> isElfDagen(curFile, vs);
            case "twaalf dagen" -> isTwaalfDagen(curFile, vs);
            case "veertien dagen" -> isVeertienDagen(curFile, vs);
            case "vijftien dagen" -> isVijftienDagen(curFile, vs);
            case "twintig dagen" -> isTwintigDagen(curFile, vs);
            case "eenentwintig dagen" -> isEenEnTwingtigDagen(curFile, vs);
            case "dertig dagen" -> isDertigDagen(curFile, vs);
            case "drieendertig dagen" -> isDrieEnDertigDagen(curFile, vs);
            case "veertig dagen" -> isVeertigDagen(curFile, vs);
            case "vijftig dagen" -> isVijftigDagen(curFile, vs);
            case "tweeenvijftig dagen" -> isTweeEnVijftigDagen(curFile, vs);
            case "zesenzestig dagen" -> isZesEnZestigDagen(curFile, vs);
            case "honderdvijftig dagen" -> isHonderdVijftigDagen(curFile, vs);
            case "honderdtachtig dagen" -> isHonderdTachtigDagen(curFile, vs);
            case "driehonderdnegentig dagen" -> isDrieHonderdNegentigDagen(curFile, vs);
            case "twaalfhonderdzestig dagen" -> isTwaalfHonderdZestigDagen(curFile, vs);
            case "duizend tweehonderdnegentig dagen" -> isDuizendTweeHonderdNegentigDagen(curFile, vs);
            case "duizend driehonderdvijfendertig dagen" -> isDuizendDrieHonderdVijfEnDertigDagen(curFile, vs);
            case "eerste dag" -> isEersteDag(curFile, vs, keyArg, arg);
            case "tweede dag" -> isTweedeDag(curFile, vs, keyArg, arg);
            case "derde dag" -> isDerdeDag(curFile, vs);
            case "vierde dag" -> isVierdeDag(curFile, vs);
            case "vijfde dag" -> isVijfdeDag(curFile, vs, keyArg, arg);
            case "zesde dag" -> isZesdeDag(curFile, vs);
            case "zevende dag" -> isZevendeDag(curFile, vs, keyArg, arg);
            case "achtste dag" -> isAchtsteDag(curFile, vs);
            case "negende dag" -> isNegendeDag(curFile, vs, keyArg, arg);
            case "tiende dag" -> isTiendeDag(curFile, vs, keyArg, arg);
            case "elfde dag" -> isElfdeDag(curFile, vs);
            case "twaalfde dag" -> isTwaalfdeDag(curFile, vs, keyArg, arg);
            case "dertiende dag" -> isDertiendeDag(curFile, vs, keyArg, arg);
            case "veertiende dag" -> isVeertiendeDag(curFile, vs, keyArg, arg);
            case "vijftiende dag" -> isVijftiendeDag(curFile, vs, keyArg, arg);
            case "zestiende dag" -> isZestiendeDag(curFile, vs);
            case "zeventiende dag" -> isZeventiendeDag(curFile, vs);
            case "eenentwintigste dag" -> isEenEnTwintigsteDag(curFile, vs, keyArg, arg);
            case "drieentwintigste dag" -> isDrieEnTwintigsteDag(curFile, vs, keyArg, arg);
            case "vierentwintigste dag" -> isVierEnTwintigsteDag(curFile, vs, keyArg, arg);
            case "vijfentwintigste dag" -> isVijfEnTwintigsteDag(curFile, vs, keyArg, arg);
            case "zevenentwintigste dag" -> isZevenEnTwintigsteDag(curFile, vs, keyArg, arg);
            case "dag" -> isDag(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isEenDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs45")
                || isValidVerse(curFile, vs, "Gen-33.html#vs13")
                || isValidVerse(curFile, vs, "Exod-21.html#vs21")
                || isValidVerse(curFile, vs, "Num-11.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs34")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs29")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs6")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs13")
                || isValidVerse(curFile, vs, "Neh-05.html#vs18")
                || isValidVerse(curFile, vs, "Esth-03.html#vs13")
                || isValidVerse(curFile, vs, "Esth-08.html#vs12")
                || isValidVerse(curFile, vs, "Ps-084.html#vs11")
                || isValidVerse(curFile, vs, "Isa-09.html#vs13")
                || isValidVerse(curFile, vs, "Isa-10.html#vs17")
                || isValidVerse(curFile, vs, "Isa-47.html#vs9")
                || isValidVerse(curFile, vs, "Isa-66.html#vs8")
                || isValidVerse(curFile, vs, "Zech-03.html#vs9")
                || isValidVerse(curFile, vs, "Zech-14.html#vs7")
                || isValidVerse(curFile, vs, "Acts-21.html#vs7")
                || isValidVerse(curFile, vs, "Acts-28.html#vs13")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs8")
                || isValidVerse(curFile, vs, "2Pet-3.html#vs8")
                || isValidVerse(curFile, vs, "Rev-18.html#vs8")
                || isValidVerse(curFile, vs, "Didache-07.html#vs4");
    } // isEenDag

    public static boolean isTweeDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-16.html#vs29")
                || isValidVerse(curFile, vs, "Exod-16.html#vs29")
                || isValidVerse(curFile, vs, "Num-09.html#vs22")
                || isValidVerse(curFile, vs, "Num-11.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs1")
                || isValidVerse(curFile, vs, "Esth-09.html#vs27")
                || isValidVerse(curFile, vs, "Hos-06.html#vs2")
                || isValidVerse(curFile, vs, "Matt-26.html#vs2")
                || isValidVerse(curFile, vs, "Mark-14.html#vs1")
                || isValidVerse(curFile, vs, "John-04.html#vs40", 43)
                || isValidVerse(curFile, vs, "John-11.html#vs6")
                || isValidVerse(curFile, vs, "Didache-07.html#vs4");
    } // isTweeDagen

    public static boolean isDrieDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-40.html#vs12", 13, 18, 19)
                || isValidVerse(curFile, vs, "Gen-42.html#vs17")
                || isValidVerse(curFile, vs, "Exod-10.html#vs22", 23)
                || isValidVerse(curFile, vs, "Exod-15.html#vs22")
                || isValidVerse(curFile, vs, "Exod-19.html#vs11", 15)
                || isValidVerse(curFile, vs, "Josh-01.html#vs11")
                || isValidVerse(curFile, vs, "Josh-02.html#vs16", 22)
                || isValidVerse(curFile, vs, "Josh-03.html#vs2")
                || isValidVerse(curFile, vs, "Josh-09.html#vs16")
                || isValidVerse(curFile, vs, "Judg-14.html#vs14")
                || isValidVerse(curFile, vs, "Judg-19.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs20")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-30.html#vs12", 13)
                || isValidVerse(curFile, vs, "2Sam-20.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs17")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs39")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs25")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs15", 32)
                || isValidVerse(curFile, vs, "Ezra-10.html#vs8", 9)
                || isValidVerse(curFile, vs, "Neh-02.html#vs11")
                || isValidVerse(curFile, vs, "Esth-04.html#vs16")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs17")
                || isValidVerse(curFile, vs, "Matt-12.html#vs40")
                || isValidVerse(curFile, vs, "Matt-15.html#vs32")
                || isValidVerse(curFile, vs, "Matt-26.html#vs61")
                || isValidVerse(curFile, vs, "Matt-27.html#vs40", 63)
                || isValidVerse(curFile, vs, "Mark-08.html#vs2", 31)
                || isValidVerse(curFile, vs, "Mark-14.html#vs58")
                || isValidVerse(curFile, vs, "Mark-15.html#vs29")
                || isValidVerse(curFile, vs, "Luke-02.html#vs46")
                || isValidVerse(curFile, vs, "John-02.html#vs19", 20)
                || isValidVerse(curFile, vs, "Acts-09.html#vs9")
                || isValidVerse(curFile, vs, "Acts-25.html#vs1")
                || isValidVerse(curFile, vs, "Acts-28.html#vs7", 12, 17)
                || isValidVerse(curFile, vs, "Didache-11.html#vs5")
                || isValidVerse(curFile, vs, "Didache-12.html#vs2");
    } // isDrieDagen

    public static boolean isDrieEnHalveDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-11.html#vs9", 11);
    } // isDrieEnHalveDag

    public static boolean isVierDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-11.html#vs40")
                || isValidVerse(curFile, vs, "John-11.html#vs17")
                || isValidVerse(curFile, vs, "Acts-10.html#vs30");
    } // isVierDagen

    public static boolean isVijfDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs19")
                || isValidVerse(curFile, vs, "Acts-20.html#vs6")
                || isValidVerse(curFile, vs, "Acts-24.html#vs1");
    } // isVijfDagen

    public static boolean isZesDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-16.html#vs26")
                || isValidVerse(curFile, vs, "Exod-20.html#vs9", 11)
                || isValidVerse(curFile, vs, "Exod-23.html#vs12")
                || isValidVerse(curFile, vs, "Exod-24.html#vs16")
                || isValidVerse(curFile, vs, "Exod-31.html#vs15", 17)
                || isValidVerse(curFile, vs, "Exod-34.html#vs21")
                || isValidVerse(curFile, vs, "Exod-35.html#vs2")
                || isValidVerse(curFile, vs, "Lev-23.html#vs3")
                || isValidVerse(curFile, vs, "Deut-05.html#vs13")
                || isValidVerse(curFile, vs, "Deut-16.html#vs8")
                || isValidVerse(curFile, vs, "Josh-06.html#vs3", 14)
                || isValidVerse(curFile, vs, "Matt-17.html#vs1")
                || isValidVerse(curFile, vs, "Mark-09.html#vs2")
                || isValidVerse(curFile, vs, "Luke-13.html#vs14")
                || isValidVerse(curFile, vs, "John-12.html#vs1");
    } // isZesDagen

    public static boolean isZevenDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs4", 10)
                || isValidVerse(curFile, vs, "Gen-08.html#vs10", 12)
                || isValidVerse(curFile, vs, "Gen-50.html#vs10")
                || isValidVerse(curFile, vs, "Exod-07.html#vs25")
                || isValidVerse(curFile, vs, "Exod-12.html#vs15", 19)
                || isValidVerse(curFile, vs, "Exod-13.html#vs6", 7)
                || isValidVerse(curFile, vs, "Exod-22.html#vs30")
                || isValidVerse(curFile, vs, "Exod-23.html#vs15")
                || isValidVerse(curFile, vs, "Exod-29.html#vs30", 35, 37)
                || isValidVerse(curFile, vs, "Exod-34.html#vs18")
                || isValidVerse(curFile, vs, "Lev-08.html#vs33", 35)
                || isValidVerse(curFile, vs, "Lev-12.html#vs2")
                || isValidVerse(curFile, vs, "Lev-13.html#vs4", 5, 6, 21, 26, 31, 33, 50, 54)
                || isValidVerse(curFile, vs, "Lev-14.html#vs8", 38)
                || isValidVerse(curFile, vs, "Lev-15.html#vs13", 19, 24, 28)
                || isValidVerse(curFile, vs, "Lev-22.html#vs27")
                || isValidVerse(curFile, vs, "Lev-23.html#vs6", 8, 34, 36, 39, 40, 41, 42)
                || isValidVerse(curFile, vs, "Num-12.html#vs14", 15)
                || isValidVerse(curFile, vs, "Num-19.html#vs11", 14, 16)
                || isValidVerse(curFile, vs, "Num-28.html#vs17", 24)
                || isValidVerse(curFile, vs, "Num-29.html#vs12")
                || isValidVerse(curFile, vs, "Num-31.html#vs19")
                || isValidVerse(curFile, vs, "Deut-16.html#vs3", 4, 13, 15)
                || isValidVerse(curFile, vs, "Judg-14.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs65")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs15")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs29")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs8", 9)
                || isValidVerse(curFile, vs, "2Chr-30.html#vs21", 22, 23)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs17")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs22")
                || isValidVerse(curFile, vs, "Neh-08.html#vs19")
                || isValidVerse(curFile, vs, "Esth-01.html#vs5")
                || isValidVerse(curFile, vs, "Job-02.html#vs13")
                || isValidVerse(curFile, vs, "Isa-30.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs15", 16)
                || isValidVerse(curFile, vs, "Ezek-43.html#vs25", 26)
                || isValidVerse(curFile, vs, "Ezek-44.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs21", 23, 25)
                || isValidVerse(curFile, vs, "Acts-20.html#vs6")
                || isValidVerse(curFile, vs, "Acts-21.html#vs4", 27)
                || isValidVerse(curFile, vs, "Acts-28.html#vs14")
                || isValidVerse(curFile, vs, "Heb-11.html#vs30");
    } // isZevenDagen

    public static boolean isAchtDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-17.html#vs12")
                || isValidVerse(curFile, vs, "Gen-21.html#vs4")
                || isValidVerse(curFile, vs, "Lev-22.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs17")
                || isValidVerse(curFile, vs, "Luke-02.html#vs21")
                || isValidVerse(curFile, vs, "Luke-09.html#vs28")
                || isValidVerse(curFile, vs, "John-20.html#vs26");
    } // isAchtDagen

    public static boolean isTienDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs38")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs9")
                || isValidVerse(curFile, vs, "Jer-42.html#vs7")
                || isValidVerse(curFile, vs, "Dan-01.html#vs12", 14, 15)
                || isValidVerse(curFile, vs, "Acts-25.html#vs6")
                || isValidVerse(curFile, vs, "Rev-02.html#vs10");
    } // isTienDagen

    public static boolean isElfDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs2");
    } // isElfDagen

    public static boolean isTwaalfDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-24.html#vs11");
    } // isTwaalfDagen

    public static boolean isVeertienDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-08.html#vs65");
    } // isVeertienDagen

    public static boolean isVijftienDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gal-1.html#vs18");
    } // isVijftienDagen

    public static boolean isTwintigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs8");
    } // isTwintigDagen

    public static boolean isEenEnTwingtigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-10.html#vs13");
    } // isEenEnTwingtigDagen

    public static boolean isDertigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-20.html#vs29")
                || isValidVerse(curFile, vs, "Deut-34.html#vs8")
                || isValidVerse(curFile, vs, "Esth-04.html#vs11")
                || isValidVerse(curFile, vs, "Dan-06.html#vs8", 13);
    } // isDertigDagen

    public static boolean isDrieEnDertigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-12.html#vs4");
    } // isDrieEnDertigDagen

    public static boolean isVeertigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs4", 12, 17)
                || isValidVerse(curFile, vs, "Gen-08.html#vs6")
                || isValidVerse(curFile, vs, "Gen-50.html#vs3")
                || isValidVerse(curFile, vs, "Exod-24.html#vs18")
                || isValidVerse(curFile, vs, "Exod-34.html#vs28")
                || isValidVerse(curFile, vs, "Num-13.html#vs25")
                || isValidVerse(curFile, vs, "Num-14.html#vs34")
                || isValidVerse(curFile, vs, "Deut-09.html#vs9", 11, 18, 25)
                || isValidVerse(curFile, vs, "Deut-10.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-04.html#vs6")
                || isValidVerse(curFile, vs, "Jonah-3.html#vs4")
                || isValidVerse(curFile, vs, "Matt-04.html#vs2")
                || isValidVerse(curFile, vs, "Mark-01.html#vs13")
                || isValidVerse(curFile, vs, "Luke-04.html#vs2")
                || isValidVerse(curFile, vs, "Acts-01.html#vs3");
    } // isVeertigDagen

    public static boolean isVijftigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-23.html#vs16");
    } // isVijftigDagen

    public static boolean isTweeEnVijftigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-06.html#vs15");
    } // isTweeEnVijftigDagen

    public static boolean isZesEnZestigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-12.html#vs5");
    } // isZesenzestigDagen

    public static boolean isHonderdVijftigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs24")
                || isValidVerse(curFile, vs, "Gen-08.html#vs3");
    } // isHonderdvijftigDagen

    public static boolean isHonderdTachtigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-01.html#vs4");
    } // isHonderdtachtigDagen

    public static boolean isDrieHonderdNegentigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-04.html#vs5", 9);
    } // isDrieHonderdNegentig

    public static boolean isTwaalfHonderdZestigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-11.html#vs3")
                || isValidVerse(curFile, vs, "Rev-12.html#vs6");
    } // isTwaalfHonderdZestigDagen

    public static boolean isDuizendTweeHonderdNegentigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-12.html#vs11");
    } // isDuizendTweeHonderdNegentig

    public static boolean isDuizendDrieHonderdVijfEnDertigDagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-12.html#vs12");
    } // isDuizendDrieHonderdVijfEnDertig

    public static boolean isEersteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-01.html#vs5")
                || isValidVerse(curFile, vs, "Gen-08.html#vs5", 13)
                || isValidVerse(curFile, vs, "Exod-12.html#vs15", 16)
                || isValidVerse(curFile, vs, "Exod-40.html#vs2", 17)
                || isValidVerse(curFile, vs, "Lev-23.html#vs7", 24, 35, 39, 40 )
                || isValidVerse(curFile, vs, "Num-01.html#vs1", 18)
                || isValidVerse(curFile, vs, "Num-07.html#vs12")
                || isValidVerse(curFile, vs, "Num-28.html#vs18")
                || isValidVerse(curFile, vs, "Num-29.html#vs1")
                || isValidVerse(curFile, vs, "Deut-01.html#vs3")
                || isValidVerse(curFile, vs, "Deut-16.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs17")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs6")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs9")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs16", 17)
                || isValidVerse(curFile, vs, "Neh-08.html#vs3", 19)
                || isValidVerse(curFile, vs, "Ezek-26.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs18")
                || isValidVerse(curFile, vs, "Dan-10.html#vs12")
                || isValidVerse(curFile, vs, "Hag-1.html#vs1")
                || isValidVerse(curFile, vs, "Matt-26.html#vs17")
                || isValidVerse(curFile, vs, "Matt-28.html#vs1")
                || isValidVerse(curFile, vs, "Mark-14.html#vs12")
                || isValidVerse(curFile, vs, "Mark-16.html#vs2", 9)
                || isValidVerse(curFile, vs, "Luke-24.html#vs1")
                || isValidVerse(curFile, vs, "John-20.html#vs1", 19)
                || isValidVerse(curFile, vs, "Acts-20.html#vs7", 18)
                || isValidVerse(curFile, vs, "1Cor-16.html#vs2")
                || isValidVerse(curFile, vs, "Phil-1.html#vs5");
    } // isEersteDag

    public static boolean isTweedeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-01.html#vs8")
                || isValidVerse(curFile, vs, "Num-07.html#vs18")
                || isValidVerse(curFile, vs, "Num-29.html#vs17")
                || isValidVerse(curFile, vs, "Josh-06.html#vs14")
                || isValidVerse(curFile, vs, "Josh-10.html#vs32")
                || isValidVerse(curFile, vs, "Judg-20.html#vs25")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs27", 34)
                || isValidVerse(curFile, vs, "2Chr-03.html#vs2")
                || isValidVerse(curFile, vs, "Esth-07.html#vs2")
                || isValidVerse(curFile, vs, "Jer-41.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs22")
                || isValidVerse(curFile, vs, "Acts-28.html#vs13");
    } // isTweedeDag

    public static boolean isDerdeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs13")
                || isValidVerse(curFile, vs, "Gen-22.html#vs4")
                || isValidVerse(curFile, vs, "Gen-31.html#vs22")
                || isValidVerse(curFile, vs, "Gen-34.html#vs25")
                || isValidVerse(curFile, vs, "Gen-40.html#vs20")
                || isValidVerse(curFile, vs, "Gen-42.html#vs18")
                || isValidVerse(curFile, vs, "Exod-19.html#vs11", 16)
                || isValidVerse(curFile, vs, "Lev-07.html#vs17", 18)
                || isValidVerse(curFile, vs, "Lev-19.html#vs6", 7)
                || isValidVerse(curFile, vs, "Num-07.html#vs24")
                || isValidVerse(curFile, vs, "Num-19.html#vs12", 19)
                || isValidVerse(curFile, vs, "Num-29.html#vs20")
                || isValidVerse(curFile, vs, "Num-31.html#vs19")
                || isValidVerse(curFile, vs, "Josh-09.html#vs17")
                || isValidVerse(curFile, vs, "Judg-20.html#vs30")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-30.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs2")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs12")
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs5", 8)
                || isValidVerse(curFile, vs, "2Chr-10.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs15")
                || isValidVerse(curFile, vs, "Esth-05.html#vs1")
                || isValidVerse(curFile, vs, "Hos-06.html#vs2")
                || isValidVerse(curFile, vs, "Amos-4.html#vs4")
                || isValidVerse(curFile, vs, "Matt-16.html#vs21")
                || isValidVerse(curFile, vs, "Matt-17.html#vs23")
                || isValidVerse(curFile, vs, "Matt-20.html#vs19")
                || isValidVerse(curFile, vs, "Matt-27.html#vs64")
                || isValidVerse(curFile, vs, "Mark-09.html#vs31")
                || isValidVerse(curFile, vs, "Mark-10.html#vs34")
                || isValidVerse(curFile, vs, "Luke-09.html#vs22")
                || isValidVerse(curFile, vs, "Luke-13.html#vs32")
                || isValidVerse(curFile, vs, "Luke-18.html#vs33")
                || isValidVerse(curFile, vs, "Luke-24.html#vs7", 21, 46)
                || isValidVerse(curFile, vs, "John-02.html#vs1")
                || isValidVerse(curFile, vs, "Acts-10.html#vs40")
                || isValidVerse(curFile, vs, "Acts-27.html#vs19")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs4");
    } // isDerdeDag

    public static boolean isVierdeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs19")
                || isValidVerse(curFile, vs, "Num-07.html#vs30")
                || isValidVerse(curFile, vs, "Num-29.html#vs23")
                || isValidVerse(curFile, vs, "Judg-19.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs26")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs33")
                || isValidVerse(curFile, vs, "John-11.html#vs39");
    } // isVierdeDag

    public static boolean isVijfdeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-01.html#vs23")
                || isValidVerse(curFile, vs, "Num-07.html#vs36")
                || isValidVerse(curFile, vs, "Num-29.html#vs26")
                || isValidVerse(curFile, vs, "Judg-19.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs1", 2)
                || isValidVerse(curFile, vs, "Ezek-08.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs21");
    } // isVijfdeDag

    public static boolean isZesdeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs31")
                || isValidVerse(curFile, vs, "Exod-16.html#vs5", 22, 29)
                || isValidVerse(curFile, vs, "Num-07.html#vs42")
                || isValidVerse(curFile, vs, "Num-29.html#vs29");
    } // isZesdeDag

    public static boolean isZevendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-02.html#vs2", 3)
                || isValidVerse(curFile, vs, "Exod-12.html#vs15", 16)
                || isValidVerse(curFile, vs, "Exod-13.html#vs6")
                || isValidVerse(curFile, vs, "Exod-16.html#vs26", 27, 29, 30)
                || isValidVerse(curFile, vs, "Exod-20.html#vs10", 11)
                || isValidVerse(curFile, vs, "Exod-23.html#vs12")
                || isValidVerse(curFile, vs, "Exod-24.html#vs16")
                || isValidVerse(curFile, vs, "Exod-31.html#vs15", 17)
                || isValidVerse(curFile, vs, "Exod-34.html#vs21")
                || isValidVerse(curFile, vs, "Exod-35.html#vs2")
                || isValidVerse(curFile, vs, "Lev-13.html#vs5", 27, 32, 34, 51)
                || isValidVerse(curFile, vs, "Lev-14.html#vs9", 39)
                || isValidVerse(curFile, vs, "Lev-23.html#vs3", 8)
                || isValidVerse(curFile, vs, "Num-06.html#vs9")
                || isValidVerse(curFile, vs, "Num-07.html#vs48")
                || isValidVerse(curFile, vs, "Num-19.html#vs12", 19)
                || isValidVerse(curFile, vs, "Num-28.html#vs25")
                || isValidVerse(curFile, vs, "Num-29.html#vs32")
                || isValidVerse(curFile, vs, "Num-31.html#vs19", 24)
                || isValidVerse(curFile, vs, "Deut-05.html#vs14")
                || isValidVerse(curFile, vs, "Deut-16.html#vs8")
                || isValidVerse(curFile, vs, "Josh-06.html#vs4", 15)
                || isValidVerse(curFile, vs, "Judg-14.html#vs15", 17, 18)
                || isValidVerse(curFile, vs, "2Sam-12.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs8")
                || isValidVerse(curFile, vs, "Esth-01.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs20")
                || isValidVerse(curFile, vs, "Heb-04.html#vs4");
    } // isZevendeDag

    public static boolean isAchtsteDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-22.html#vs30")
                || isValidVerse(curFile, vs, "Lev-09.html#vs1")
                || isValidVerse(curFile, vs, "Lev-12.html#vs3")
                || isValidVerse(curFile, vs, "Lev-14.html#vs10", 23)
                || isValidVerse(curFile, vs, "Lev-15.html#vs14", 29)
                || isValidVerse(curFile, vs, "Lev-23.html#vs36", 39)
                || isValidVerse(curFile, vs, "Num-06.html#vs10")
                || isValidVerse(curFile, vs, "Num-07.html#vs54")
                || isValidVerse(curFile, vs, "Num-29.html#vs35")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs66")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs17")
                || isValidVerse(curFile, vs, "Neh-08.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs27")
                || isValidVerse(curFile, vs, "Luke-01.html#vs59")
                || isValidVerse(curFile, vs, "Acts-07.html#vs8")
                || isValidVerse(curFile, vs, "Phil-3.html#vs5");
    } // isAchtsteDag

    public static boolean isNegendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lev-23.html#vs32")
                || isValidVerse(curFile, vs, "Num-07.html#vs60")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs3")
                || isValidVerse(curFile, vs, "Jer-39.html#vs2")
                || isValidVerse(curFile, vs, "Jer-52.html#vs6");
    } // isNegendeDag

    public static boolean isTiendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-12.html#vs3")
                || isValidVerse(curFile, vs, "Lev-16.html#vs29")
                || isValidVerse(curFile, vs, "Lev-23.html#vs27")
                || isValidVerse(curFile, vs, "Lev-25.html#vs9")
                || isValidVerse(curFile, vs, "Num-07.html#vs66")
                || isValidVerse(curFile, vs, "Num-29.html#vs7")
                || isValidVerse(curFile, vs, "Josh-04.html#vs19")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs1")
                || isValidVerse(curFile, vs, "Jer-52.html#vs4", 12)
                || isValidVerse(curFile, vs, "Ezek-20.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-40.html#vs1");
    } // isTiendeDag

    public static boolean isElfdeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-07.html#vs72");
    } // isElfdeDag

    public static boolean isTwaalfdeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-07.html#vs78")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs31")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs1");
    } // isTwaalfdeDag

    public static boolean isDertiendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Esth-03.html#vs12", 13)
                || isValidVerse(curFile, vs, "Esth-08.html#vs12")
                || isValidVerse(curFile, vs, "Esth-09.html#vs1", 17, 18);
    } // isDertiendeDag

    public static boolean isVeertiendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-12.html#vs6", 18)
                || isValidVerse(curFile, vs, "Lev-23.html#vs5")
                || isValidVerse(curFile, vs, "Num-09.html#vs3", 5, 11)
                || isValidVerse(curFile, vs, "Num-28.html#vs16")
                || isValidVerse(curFile, vs, "Josh-05.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs19")
                || isValidVerse(curFile, vs, "Esth-09.html#vs15", 17, 18, 19, 21)
                || isValidVerse(curFile, vs, "Ezek-45.html#vs21")
                || isValidVerse(curFile, vs, "Acts-27.html#vs33");
    } // isVeertiendeDag

    public static boolean isVijftiendeDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-16.html#vs1")
                || isValidVerse(curFile, vs, "Lev-23.html#vs6", 34, 39)
                || isValidVerse(curFile, vs, "Num-28.html#vs17")
                || isValidVerse(curFile, vs, "Num-29.html#vs12")
                || isValidVerse(curFile, vs, "Num-33.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs32", 33)
                || isValidVerse(curFile, vs, "Esth-09.html#vs18", 21)
                || isValidVerse(curFile, vs, "Ezek-32.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs25");
    } // isVijftiendeDag

    public static boolean isZestiendeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-29.html#vs17");
    } // isZestiendeDag

    public static boolean isZeventiendeDag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs11")
                || isValidVerse(curFile, vs, "Gen-08.html#vs4");
    } // isZeventiendeDag

    public static boolean isEenEnTwintigsteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-12.html#vs18")
                || isValidVerse(curFile, vs, "Hag-2.html#vs2");
    } // isEenEnTwintigsteDag

    public static boolean isDrieEnTwintigsteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("drieentwintigste dag", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "2Chr-07.html#vs10")
                    || isValidVerse(curFile, vs, "Esth-08.html#vs9");
        }
        return false;
    } // isDrieEnTwintigsteDag

    public static boolean isVierEnTwintigsteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Neh-09.html#vs1")
                || isValidVerse(curFile, vs, "Dan-10.html#vs4")
                || isValidVerse(curFile, vs, "Hag-2.html#vs1", 11, 19, 21)
                || isValidVerse(curFile, vs, "Zech-01.html#vs7");
    } // isVierEnTwintigsteDag

    public static boolean isVijfEnTwintigsteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Neh-06.html#vs15")
                || isValidVerse(curFile, vs, "Jer-52.html#vs31");
    } // isVijfEnTwintigsteDag

    public static boolean isZevenEnTwintigsteDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-08.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs27");
    } // isZevenEnTwintigsteDag

    public static boolean isDag(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isEenDag(curFile, vs)
                && !isDrieEnHalveDag(curFile, vs)
                && !isEersteDag(curFile, vs, keyArg, arg)
                && !isTweedeDag(curFile, vs, keyArg, arg)
                && !isDerdeDag(curFile, vs)
                && !isVierdeDag(curFile, vs)
                && !isVijfdeDag(curFile, vs, keyArg, arg)
                && !isZesdeDag(curFile, vs)
                && !isZevendeDag(curFile, vs, keyArg, arg)
                && !isAchtsteDag(curFile, vs)
                && !isNegendeDag(curFile, vs, keyArg, arg)
                && !isTiendeDag(curFile, vs, keyArg, arg)
                && !isElfdeDag(curFile, vs)
                && !isTwaalfdeDag(curFile, vs, keyArg, arg)
                && !isDertiendeDag(curFile, vs, keyArg, arg)
                && !isVeertiendeDag(curFile, vs, keyArg, arg)
                && !isVijftiendeDag(curFile, vs, keyArg, arg)
                && !isZestiendeDag(curFile, vs)
                && !isZeventiendeDag(curFile, vs)
                && !isEenEnTwintigsteDag(curFile, vs, keyArg, arg)
                && !isDrieEnTwintigsteDag(curFile, vs, keyArg, arg)
                && !isVierEnTwintigsteDag(curFile, vs, keyArg, arg)
                && !isVijfEnTwintigsteDag(curFile, vs, keyArg, arg)
                && !isZevenEnTwintigsteDag(curFile, vs, keyArg, arg);
    } // isDag


}
