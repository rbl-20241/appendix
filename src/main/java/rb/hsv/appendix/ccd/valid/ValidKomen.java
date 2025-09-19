package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.*;

public class ValidKomen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aankomen" -> isAankomen(curFile, vs);
            case "achternakomen" -> isAchternakomen();
            case "afkomen" -> isAfkomen(curFile, vs);
            case "bijeenkomen" -> isBijeenkomen(curFile, vs);
            case "binnenkomen" -> isBinnenkomen(curFile, vs);
            case "einde komen aan" -> isEindeKomenAan(curFile, vs, keyArg, arg);
            case "in aanraking komen" -> isInAanrakingKomen(curFile, vs, arg);
            case "in opstand komen" -> isInOpstandKomen(curFile, vs, arg);
            case "kom" -> isKom(curFile, vs);
            case "langskomen" -> IS_NOT_FOUND;
            case "meekomen" -> isMeekomen(curFile, vs);
            case "naar voren komen" -> isNaarVorenKomen(curFile, vs, arg);
            case "nakomen" -> isNakomen(curFile, vs);
            case "nabijkomen" -> isNabijkomen(curFile, vs);
            case "naderbijkomen" -> isNaderbijkomen(curFile, vs);
            case "neerkomen" -> isNeerkomen(curFile, vs);
            case "omkomen" -> isOmkomen(curFile, vs);
            case "onder ogen komen" -> isOnderOgenKomen(curFile, vs, arg);
            case "op adem komen" -> isOpAdemKomen(curFile, vs, arg);
            case "opkomen" -> isOpkomen(curFile, vs);
            case "overeenkomen" -> isOvereenkomen(curFile, vs);
            case "overkomen" -> isOverkomen(curFile, vs);
            case "samenkomen" -> isSamenkomen(curFile, vs);
            case "te boven komen" -> isTeBovenKomen(curFile, vs, arg);
            case "te hulp komen" -> isTeHulpKomen(curFile, vs, arg);
            case "te weten komen" -> isTeWetenKomen(curFile, vs, arg);
            case "tegemoetkomen" -> isTegemoetkomen(curFile, vs);
            case "tegenkomen" -> isTegenkomen(curFile, vs);
            case "tekortkomen" -> isTekortkomen(curFile, vs);
            case "ten goede komen" -> isTenGoedeKomen(curFile, vs, arg);
            case "ten val komen" -> isTenValKomen(curFile, vs, arg);
            case "terugkomen" -> isTerugkomen(curFile, vs);
            case "thuiskomen" -> isThuiskomen(curFile, vs);
            case "toekomen" -> isToekomen(curFile, vs);
            case "tot geloof komen" -> isTotGeloofKomen(curFile, vs, arg);
            case "tot inzicht komen" -> isTotInzichtKomen(curFile, vs, arg);
            case "tot rust komen" -> isTotRustKomen(curFile, vs, arg);
            case "tot stand komen" -> isTotStandKomen(curFile, vs, arg);
            case "uitkomen" -> isUitkomen(curFile, vs);
            case "voorbijkomen" -> isVoorbijkomen(curFile, vs);
            case "voortkomen" -> isVoortkomen(curFile, vs);
            case "vooruitkomen" -> isVooruitkomen();
            case "vrijkomen" -> isVrijkomen(curFile, vs);
            case "komen" -> isKomen(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAankomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs1")
                || isValidVerse(curFile, vs, "Gen-24.html#vs63")
                || isValidVerse(curFile, vs, "Gen-29.html#vs6")
                || isValidVerse(curFile, vs, "Gen-33.html#vs18")
                || isValidVerse(curFile, vs, "Gen-37.html#vs19")
                || isValidVerse(curFile, vs, "Gen-46.html#vs6")
                || isValidVerse(curFile, vs, "Num-13.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs20")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs28")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs9")
                || isValidVerse(curFile, vs, "Neh-02.html#vs9", 11)
                || isValidVerse(curFile, vs, "Job-30.html#vs14")
                || isValidVerse(curFile, vs, "Prov-26.html#vs2")
                || isValidVerse(curFile, vs, "Jer-04.html#vs12")
                || isValidVerse(curFile, vs, "Dan-08.html#vs5")
                || isValidVerse(curFile, vs, "Matt-02.html#vs1")
                || isValidVerse(curFile, vs, "Matt-26.html#vs47")
                || isValidVerse(curFile, vs, "Mark-06.html#vs33")
                || isValidVerse(curFile, vs, "Luke-14.html#vs27")
                || isValidVerse(curFile, vs, "Acts-10.html#vs24")
                || isValidVerse(curFile, vs, "Acts-13.html#vs13")
                || isValidVerse(curFile, vs, "Acts-16.html#vs1")
                || isValidVerse(curFile, vs, "Acts-18.html#vs19", 24)
                || isValidVerse(curFile, vs, "Acts-20.html#vs6", 15)
                || isValidVerse(curFile, vs, "Acts-21.html#vs3", 7)
                || isValidVerse(curFile, vs, "Acts-25.html#vs13")
                || isValidVerse(curFile, vs, "Acts-27.html#vs3", 5)
                || isValidVerse(curFile, vs, "Acts-28.html#vs13");
    } // isAankomen

    public static boolean isAchternakomen() {
        return IS_NOT_FOUND;
    } // isAchternakomen

    public static boolean isAfkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs11")
                || isValidVerse(curFile, vs, "Gen-34.html#vs27")
                || isValidVerse(curFile, vs, "Josh-11.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs20")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs2", 12)
                || isValidVerse(curFile, vs, "Song-4.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs19")
                || isValidVerse(curFile, vs, "Matt-27.html#vs40")
                || isValidVerse(curFile, vs, "Mark-15.html#vs30")
                || isValidVerse(curFile, vs, "Luke-11.html#vs22")
                || isValidVerse(curFile, vs, "Acts-04.html#vs1")
                || isValidVerse(curFile, vs, "Acts-06.html#vs12")
                || isValidVerse(curFile, vs, "Acts-17.html#vs5")
                || isValidVerse(curFile, vs, "Acts-24.html#vs7");
    } // isAfkomen

    public static boolean isBijeenkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs2")
                || isValidVerse(curFile, vs, "Exod-32.html#vs1")
                || isValidVerse(curFile, vs, "Num-20.html#vs2")
                || isValidVerse(curFile, vs, "Josh-22.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs26")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs7", 9)
                || isValidVerse(curFile, vs, "Ps-102.html#vs23")
                || isValidVerse(curFile, vs, "Isa-48.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs17", 27)
                || isValidVerse(curFile, vs, "Dan-03.html#vs3", 27)
                || isValidVerse(curFile, vs, "Matt-02.html#vs4")
                || isValidVerse(curFile, vs, "Matt-22.html#vs34")
                || isValidVerse(curFile, vs, "Matt-26.html#vs3")
                || isValidVerse(curFile, vs, "Matt-28.html#vs12")
                || isValidVerse(curFile, vs, "Mark-03.html#vs20")
                || isValidVerse(curFile, vs, "Mark-14.html#vs53")
                || isValidVerse(curFile, vs, "Luke-05.html#vs15")
                || isValidVerse(curFile, vs, "Luke-22.html#vs66")
                || isValidVerse(curFile, vs, "Acts-15.html#vs6")
                || isValidVerse(curFile, vs, "Acts-22.html#vs30");
    } // isBijeenkomen

    public static boolean isBinnenkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs31")
                || isValidVerse(curFile, vs, "Exod-12.html#vs23")
                || isValidVerse(curFile, vs, "Deut-23.html#vs10", 11)
                || isValidVerse(curFile, vs, "2Sam-05.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs37")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs3", 5)
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs22", 23, 42)
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs10")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs18")
                || isValidVerse(curFile, vs, "Neh-02.html#vs15")
                || isValidVerse(curFile, vs, "Esth-09.html#vs11")
                || isValidVerse(curFile, vs, "Jer-17.html#vs25")
                || isValidVerse(curFile, vs, "Jer-39.html#vs3")
                || isValidVerse(curFile, vs, "Jer-43.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs39")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs4")
                || isValidVerse(curFile, vs, "Joel-2.html#vs9")
                || isValidVerse(curFile, vs, "Mark-06.html#vs22")
                || isValidVerse(curFile, vs, "Mark-11.html#vs11")
                || isValidVerse(curFile, vs, "Mark-15.html#vs43")
                || isValidVerse(curFile, vs, "Luke-14.html#vs23")
                || isValidVerse(curFile, vs, "Luke-19.html#vs1")
                || isValidVerse(curFile, vs, "Acts-20.html#vs6")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs23", 24);
    } // isBinnenkomen

    public static boolean isEindeKomenAan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("einde komen aan", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Ps-077.html#vs9")
                    || isValidVerse(curFile, vs, "Ps-102.html#vs28")
                    || isValidVerse(curFile, vs, "Eccl-04.html#vs8", 16)
                    || isValidVerse(curFile, vs, "Eccl-12.html#vs12")
                    || isValidVerse(curFile, vs, "Isa-02.html#vs7")
                    || isValidVerse(curFile, vs, "Isa-09.html#vs6")
                    || isValidVerse(curFile, vs, "Isa-60.html#vs20")
                    || isValidVerse(curFile, vs, "Dan-12.html#vs6", 7)
                    || isValidVerse(curFile, vs, "Mic-2.html#vs6")
                    || isValidVerse(curFile, vs, "Nah-2.html#vs9")
                    || isValidVerse(curFile, vs, "Nah-3.html#vs3", 9)
                    || isValidVerse(curFile, vs, "Luke-01.html#vs33")
                    || isValidVerse(curFile, vs, "Heb-10.html#vs2");
        }

        return false;
    } // isEindeKomenAan

    public static boolean isInAanrakingKomen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in aanraking komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lev-07.html#vs19", 21)
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs21")
                || isValidVerse(curFile, vs, "Lam-2.html#vs2");
    } // isInAanrakingKomen

    public static boolean isInOpstandKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("in opstand komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-14.html#vs4")
                || isValidVerse(curFile, vs, "Num-14.html#vs9")
                || isValidVerse(curFile, vs, "Num-16.html#vs2")
                || isValidVerse(curFile, vs, "Num-26.html#vs9")
                || isValidVerse(curFile, vs, "Josh-22.html#vs16", 18, 19, 29)
                || isValidVerse(curFile, vs, "Judg-09.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs31", 32)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs26", 27)
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs5", 7)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs20", 22)
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs7", 20)
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs1", 20)
                || isValidVerse(curFile, vs, "2Chr-13.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs8", 10)
                || isValidVerse(curFile, vs, "2Chr-36.html#vs13")
                || isValidVerse(curFile, vs, "Neh-02.html#vs19")
                || isValidVerse(curFile, vs, "Neh-06.html#vs6")
                || isValidVerse(curFile, vs, "Neh-09.html#vs26")
                || isValidVerse(curFile, vs, "Isa-01.html#vs2")
                || isValidVerse(curFile, vs, "Isa-36.html#vs5")
                || isValidVerse(curFile, vs, "Isa-43.html#vs27")
                || isValidVerse(curFile, vs, "Isa-66.html#vs24")
                || isValidVerse(curFile, vs, "Jer-02.html#vs8", 29)
                || isValidVerse(curFile, vs, "Jer-03.html#vs13")
                || isValidVerse(curFile, vs, "Jer-33.html#vs8")
                || isValidVerse(curFile, vs, "Jer-52.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-02.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs38")
                || isValidVerse(curFile, vs, "Dan-09.html#vs5", 9)
                || isValidVerse(curFile, vs, "Hos-07.html#vs13")
                || isValidVerse(curFile, vs, "Hos-08.html#vs1")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs11");
    } // isInOpstandKomen

    public static boolean isKom(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-25.html#vs29")
                || isValidVerse(curFile, vs, "Exod-37.html#vs16")
                || isValidVerse(curFile, vs, "Num-04.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs50")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs22")
                || isValidVerse(curFile, vs, "Jer-52.html#vs19");
    } // isKom

    public static boolean isMeekomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs16")
                || isValidVerse(curFile, vs, "Num-23.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs7", 15)
                || isValidVerse(curFile, vs, "Jer-40.html#vs4")
                || isValidVerse(curFile, vs, "Mark-06.html#vs31");
        // 2Sam-19.html#vs16
    } // isMeekomen

    public static boolean isNaarVorenKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("naar voren komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-33.html#vs6", 7)
                || isValidVerse(curFile, vs, "Exod-12.html#vs48")
                || isValidVerse(curFile, vs, "Exod-16.html#vs9")
                || isValidVerse(curFile, vs, "Exod-29.html#vs4")
                || isValidVerse(curFile, vs, "Exod-34.html#vs32")
                || isValidVerse(curFile, vs, "Exod-36.html#vs2")
                || isValidVerse(curFile, vs, "Lev-08.html#vs6")
                || isValidVerse(curFile, vs, "Lev-09.html#vs5", 7, 8)
                || isValidVerse(curFile, vs, "Lev-10.html#vs4", 5)
                || isValidVerse(curFile, vs, "Lev-21.html#vs17", 18)
                || isValidVerse(curFile, vs, "Num-05.html#vs16")
                || isValidVerse(curFile, vs, "Num-09.html#vs6")
                || isValidVerse(curFile, vs, "Num-12.html#vs5")
                || isValidVerse(curFile, vs, "Num-16.html#vs40")
                || isValidVerse(curFile, vs, "Num-18.html#vs2")
                || isValidVerse(curFile, vs, "Num-27.html#vs1")
                || isValidVerse(curFile, vs, "Num-31.html#vs48")
                || isValidVerse(curFile, vs, "Num-36.html#vs1")
                || isValidVerse(curFile, vs, "Deut-01.html#vs22")
                || isValidVerse(curFile, vs, "Deut-04.html#vs11")
                || isValidVerse(curFile, vs, "Deut-05.html#vs23")
                || isValidVerse(curFile, vs, "Deut-20.html#vs2")
                || isValidVerse(curFile, vs, "Deut-21.html#vs5")
                || isValidVerse(curFile, vs, "Josh-07.html#vs14")
                || isValidVerse(curFile, vs, "Josh-07.html#vs17", 18)
                || isValidVerse(curFile, vs, "Josh-10.html#vs24")
                || isValidVerse(curFile, vs, "Josh-17.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs20", 21)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs16", 48)
                || isValidVerse(curFile, vs, "2Sam-01.html#vs15")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs21", 30, 36)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs27")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs23", 31)
                || isValidVerse(curFile, vs, "Esth-05.html#vs2")
                || isValidVerse(curFile, vs, "Isa-34.html#vs1")
                || isValidVerse(curFile, vs, "Isa-41.html#vs1", 21)
                || isValidVerse(curFile, vs, "Ezek-09.html#vs1")
                || isValidVerse(curFile, vs, "Dan-03.html#vs8")
                || isValidVerse(curFile, vs, "Dan-06.html#vs13")
                || isValidVerse(curFile, vs, "Acts-19.html#vs33");
    } // isNaarVorenkomen

    public static boolean isNakomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-23.html#vs21")
                || isValidVerse(curFile, vs, "Ps-050.html#vs14")
                || isValidVerse(curFile, vs, "Ps-061.html#vs9")
                || isValidVerse(curFile, vs, "Ps-076.html#vs12")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs3")
                || isValidVerse(curFile, vs, "Nah-1.html#vs15");
    } // isNakomen

    public static boolean isNabijkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-13.html#vs12");
    } // isNabijkomen

    public static boolean isNaderbijkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-47.html#vs29")
                || isValidVerse(curFile, vs, "Exod-24.html#vs2")
                || isValidVerse(curFile, vs, "Exod-29.html#vs8", 10)
                || isValidVerse(curFile, vs, "Exod-40.html#vs14")
                || isValidVerse(curFile, vs, "Lev-07.html#vs35")
                || isValidVerse(curFile, vs, "Lev-08.html#vs13", 18, 22, 24)
                || isValidVerse(curFile, vs, "Lev-16.html#vs20")
                || isValidVerse(curFile, vs, "Lev-21.html#vs21")
                || isValidVerse(curFile, vs, "Num-03.html#vs6")
                || isValidVerse(curFile, vs, "Num-08.html#vs9", 10)
                || isValidVerse(curFile, vs, "Num-17.html#vs13")
                || isValidVerse(curFile, vs, "Deut-25.html#vs11")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs1")
                || isValidVerse(curFile, vs, "Ps-119.html#vs150")
                || isValidVerse(curFile, vs, "Eccl-04.html#vs17")
                || isValidVerse(curFile, vs, "Isa-41.html#vs5", 21)
                || isValidVerse(curFile, vs, "Isa-57.html#vs3")
                || isValidVerse(curFile, vs, "Jer-30.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-36.html#vs8")
                || isValidVerse(curFile, vs, "Acts-07.html#vs17");
    } // isNaderbijkomen

    public static boolean isNeerkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-01.html#vs10", 12)
                || isValidVerse(curFile, vs, "2Chr-07.html#vs1");
    } // isNeerkomen

    public static boolean isOmkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-17.html#vs12")
                || isValidVerse(curFile, vs, "Deut-07.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs9")
                || isValidVerse(curFile, vs, "Esth-04.html#vs16")
                || isValidVerse(curFile, vs, "Job-04.html#vs9", 11, 20)
                || isValidVerse(curFile, vs, "Job-34.html#vs20")
                || isValidVerse(curFile, vs, "Job-36.html#vs12")
                || isValidVerse(curFile, vs, "Ps-037.html#vs20")
                || isValidVerse(curFile, vs, "Ps-068.html#vs3")
                || isValidVerse(curFile, vs, "Ps-073.html#vs19")
                || isValidVerse(curFile, vs, "Ps-080.html#vs17")
                || isValidVerse(curFile, vs, "Prov-31.html#vs6")
                || isValidVerse(curFile, vs, "Isa-57.html#vs1")
                || isValidVerse(curFile, vs, "Luke-06.html#vs9")
                || isValidVerse(curFile, vs, "Luke-15.html#vs17")
                || isValidVerse(curFile, vs, "Luke-17.html#vs27");
    } // isOmkomen

    public static boolean isOnderOgenKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("onder ogen komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-32.html#vs20")
                || isValidVerse(curFile, vs, "Gen-43.html#vs3", 5)
                || isValidVerse(curFile, vs, "Gen-44.html#vs23", 26)
                || isValidVerse(curFile, vs, "Exod-10.html#vs28", 29)
                || isValidVerse(curFile, vs, "2Sam-03.html#vs13");
    } // isOnderOgenKomen

    public static boolean isOpAdemKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("op adem komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-23.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs14")
                || isValidVerse(curFile, vs, "Job-09.html#vs18");
    } // isOpAdemKomen

    public static boolean isOpkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs23")
                || isValidVerse(curFile, vs, "Gen-41.html#vs2", 3, 5, 6, 18, 19, 22, 23)
                || isValidVerse(curFile, vs, "Exod-10.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs14")
                || isValidVerse(curFile, vs, "Esth-08.html#vs11")
                || isValidVerse(curFile, vs, "Job-05.html#vs6")
                || isValidVerse(curFile, vs, "Job-14.html#vs2")
                || isValidVerse(curFile, vs, "Ps-085.html#vs12")
                || isValidVerse(curFile, vs, "Ps-090.html#vs6")
                || isValidVerse(curFile, vs, "Jer-46.html#vs9")
                || isValidVerse(curFile, vs, "Jer-49.html#vs14")
                || isValidVerse(curFile, vs, "Jer-50.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs6")
                || isValidVerse(curFile, vs, "Amos-7.html#vs1")
                || isValidVerse(curFile, vs, "Matt-03.html#vs16")
                || isValidVerse(curFile, vs, "Matt-13.html#vs7")
                || isValidVerse(curFile, vs, "Mark-04.html#vs5", 7, 8, 32)
                || isValidVerse(curFile, vs, "Luke-24.html#vs38")
                || isValidVerse(curFile, vs, "Acts-07.html#vs23")
                || isValidVerse(curFile, vs, "Rev-20.html#vs9");
    } // isOpkomen

    public static boolean isOvereenkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-22.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs7")
                || isValidVerse(curFile, vs, "Luke-22.html#vs5")
                || isValidVerse(curFile, vs, "Gal-4.html#vs25");
    } // isOvereenkomen

    public static boolean isOverkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-23.html#vs15")
                || isValidVerse(curFile, vs, "Judg-09.html#vs26")
                || isValidVerse(curFile, vs, "Acts-16.html#vs9");
    } // isOverkomen

    public static boolean isSamenkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-16.html#vs10")
                || isValidVerse(curFile, vs, "Mark-06.html#vs30")
                || isValidVerse(curFile, vs, "Mark-10.html#vs1")
                || isValidVerse(curFile, vs, "Acts-02.html#vs6")
                || isValidVerse(curFile, vs, "Acts-05.html#vs21")
                || isValidVerse(curFile, vs, "Acts-13.html#vs44")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs23")
                || isValidVerse(curFile, vs, "Didache-14.html#vs1")
                || isValidVerse(curFile, vs, "Didache-16.html#vs2");
    } // isSamenkomen

    public static boolean isTeBovenKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("te boven komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-38.html#vs15");
    } // isTeBovenKomen

    public static boolean isTeHulpKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("te hulp komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Judg-05.html#vs23")
                || isValidVerse(curFile, vs, "Ps-022.html#vs20")
                || isValidVerse(curFile, vs, "Ps-038.html#vs23")
                || isValidVerse(curFile, vs, "Ps-040.html#vs14")
                || isValidVerse(curFile, vs, "Ps-059.html#vs11")
                || isValidVerse(curFile, vs, "Ps-070.html#vs2")
                || isValidVerse(curFile, vs, "Ps-071.html#vs12")
                || isValidVerse(curFile, vs, "Ps-079.html#vs8")
                || isValidVerse(curFile, vs, "Ps-119.html#vs173")
                || isValidVerse(curFile, vs, "Mark-09.html#vs24")
                || isValidVerse(curFile, vs, "Rom-08.html#vs26")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs11")
                || isValidVerse(curFile, vs, "Heb-02.html#vs18")
                || isValidVerse(curFile, vs, "Rev-12.html#vs16");
    } // isTeHulpKomen

    public static boolean isTeWetenKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("te weten komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-09.html#vs24")
                || isValidVerse(curFile, vs, "Gen-24.html#vs21")
                || isValidVerse(curFile, vs, "Gen-35.html#vs22")
                || isValidVerse(curFile, vs, "Gen-42.html#vs33")
                || isValidVerse(curFile, vs, "Exod-02.html#vs4")
                || isValidVerse(curFile, vs, "Lev-05.html#vs1", 3, 4)
                || isValidVerse(curFile, vs, "1Sam-14.html#vs38")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs9", 23)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs2")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs15")
                || isValidVerse(curFile, vs, "Neh-04.html#vs11")
                || isValidVerse(curFile, vs, "Neh-13.html#vs10")
                || isValidVerse(curFile, vs, "Esth-04.html#vs1", 5)
                || isValidVerse(curFile, vs, "Ezek-38.html#vs14")
                || isValidVerse(curFile, vs, "Dan-06.html#vs11")
                || isValidVerse(curFile, vs, "Matt-09.html#vs30")
                || isValidVerse(curFile, vs, "Mark-05.html#vs43")
                || isValidVerse(curFile, vs, "Mark-06.html#vs38")
                || isValidVerse(curFile, vs, "Luke-07.html#vs37")
                || isValidVerse(curFile, vs, "Luke-23.html#vs7")
                || isValidVerse(curFile, vs, "John-12.html#vs9")
                || isValidVerse(curFile, vs, "Acts-09.html#vs30")
                || isValidVerse(curFile, vs, "Acts-17.html#vs13")
                || isValidVerse(curFile, vs, "Acts-21.html#vs34")
                || isValidVerse(curFile, vs, "Acts-24.html#vs8")
                || isValidVerse(curFile, vs, "Acts-28.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-02.html#vs9")
                || isValidVerse(curFile, vs, "1Thess-3.html#vs5");
    } // isTeWetenKomen

    public static boolean isTegemoetkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs65")
                || isValidVerse(curFile, vs, "Gen-32.html#vs6")
                || isValidVerse(curFile, vs, "Josh-08.html#vs22")
                || isValidVerse(curFile, vs, "Judg-04.html#vs18", 22)
                || isValidVerse(curFile, vs, "Judg-11.html#vs34")
                || isValidVerse(curFile, vs, "Judg-14.html#vs5")
                || isValidVerse(curFile, vs, "Judg-15.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs34")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs32")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs16", 24)
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs7")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs6", 7)
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-19.html#vs2")
                || isValidVerse(curFile, vs, "Ps-021.html#vs4")
                || isValidVerse(curFile, vs, "Ps-059.html#vs5")
                || isValidVerse(curFile, vs, "Ps-088.html#vs14")
                || isValidVerse(curFile, vs, "Prov-07.html#vs10")
                || isValidVerse(curFile, vs, "Matt-08.html#vs28")
                || isValidVerse(curFile, vs, "Matt-28.html#vs9")
                || isValidVerse(curFile, vs, "Mark-05.html#vs2")
                || isValidVerse(curFile, vs, "Luke-08.html#vs27")
                || isValidVerse(curFile, vs, "Luke-09.html#vs37")
                || isValidVerse(curFile, vs, "John-04.html#vs51")
                || isValidVerse(curFile, vs, "Acts-28.html#vs15");
    } // isTegemoetkomen

    public static boolean isTegenkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-10.html#vs5");
    } // isTegenkomen

    public static boolean isTekortkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mic-2.html#vs7");
    } // isTekortkomen

    public static boolean isTenGoedeKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("ten goede komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lev-01.html#vs4")
                || isValidVerse(curFile, vs, "Lev-07.html#vs18")
                || isValidVerse(curFile, vs, "Lev-19.html#vs7")
                || isValidVerse(curFile, vs, "Lev-22.html#vs20", 21, 21, 23, 25, 27, 29)
                || isValidVerse(curFile, vs, "Prov-05.html#vs10");
    } // isTenGoedeKomen

    public static boolean isTenValKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("ten val komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Kgs-14.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs19")
                || isValidVerse(curFile, vs, "Esth-06.html#vs13")
                || isValidVerse(curFile, vs, "Ps-005.html#vs11")
                || isValidVerse(curFile, vs, "Prov-10.html#vs8", 10)
                || isValidVerse(curFile, vs, "Prov-11.html#vs5", 14, 28)
                || isValidVerse(curFile, vs, "Prov-28.html#vs18")
                || isValidVerse(curFile, vs, "Isa-54.html#vs15")
                || isValidVerse(curFile, vs, "Dan-11.html#vs19")
                || isValidVerse(curFile, vs, "Hos-04.html#vs14")
                || isValidVerse(curFile, vs, "Hos-07.html#vs7")
                || isValidVerse(curFile, vs, "Heb-04.html#vs11");
    } // isTenValKomen

    public static boolean isTerugkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-32.html#vs6")
                || isValidVerse(curFile, vs, "Gen-37.html#vs29")
                || isValidVerse(curFile, vs, "Exod-19.html#vs7")
                || isValidVerse(curFile, vs, "Exod-24.html#vs3")
                || isValidVerse(curFile, vs, "Exod-35.html#vs21")
                || isValidVerse(curFile, vs, "Lev-27.html#vs24")
                || isValidVerse(curFile, vs, "Num-22.html#vs14")
                || isValidVerse(curFile, vs, "Josh-18.html#vs8", 9)
                || isValidVerse(curFile, vs, "Judg-15.html#vs19")
                || isValidVerse(curFile, vs, "Judg-18.html#vs8")
                || isValidVerse(curFile, vs, "Judg-19.html#vs16", 26)
                || isValidVerse(curFile, vs, "Judg-21.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-30.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs5")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs5", 12)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs22", 35, 39)
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs18", 20, 36)
                || isValidVerse(curFile, vs, "1Chr-19.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs5", 12)
                || isValidVerse(curFile, vs, "Esth-04.html#vs9")
                || isValidVerse(curFile, vs, "Job-39.html#vs7")
                || isValidVerse(curFile, vs, "Ps-035.html#vs13")
                || isValidVerse(curFile, vs, "Prov-03.html#vs28")
                || isValidVerse(curFile, vs, "Jer-34.html#vs11")
                || isValidVerse(curFile, vs, "Dan-04.html#vs34", 36)
                || isValidVerse(curFile, vs, "Zech-04.html#vs1")
                || isValidVerse(curFile, vs, "Matt-05.html#vs24")
                || isValidVerse(curFile, vs, "Matt-25.html#vs19")
                || isValidVerse(curFile, vs, "Mark-09.html#vs25")
                || isValidVerse(curFile, vs, "Luke-14.html#vs21")
                || isValidVerse(curFile, vs, "John-09.html#vs7")
                || isValidVerse(curFile, vs, "John-14.html#vs3")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs35");
    } // isTerugkomen

    public static boolean isThuiskomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-17.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs4")
                || isValidVerse(curFile, vs, "Mark-03.html#vs20");
    } // isThuiskomen

    public static boolean isToekomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-27.html#vs21")
                || isValidVerse(curFile, vs, "Deut-32.html#vs35")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs18")
                || isValidVerse(curFile, vs, "Jer-10.html#vs7")
                || isValidVerse(curFile, vs, "Luke-06.html#vs32", 33, 34)
                || isValidVerse(curFile, vs, "Acts-01.html#vs7")
                || isValidVerse(curFile, vs, "Rom-12.html#vs19")
                || isValidVerse(curFile, vs, "Heb-10.html#vs30")
                || isValidVerse(curFile, vs, "1Pet-4.html#vs11")
                || isValidVerse(curFile, vs, "Didache-10.html#vs5");
    } // isToekomen

    public static boolean isTotGeloofKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("tot geloof komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "John-04.html#vs41")
                || isValidVerse(curFile, vs, "John-07.html#vs31")
                || isValidVerse(curFile, vs, "Acts-16.html#vs34")
                || isValidVerse(curFile, vs, "Acts-19.html#vs2")
                || isValidVerse(curFile, vs, "Rom-13.html#vs11")
                || isValidVerse(curFile, vs, "1Cor-03.html#vs5")
                || isValidVerse(curFile, vs, "Eph-1.html#vs13")
                || isValidVerse(curFile, vs, "Heb-04.html#vs3");
    } // isTotGeloofKomen

    public static boolean isTotInzichtKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("tot inzicht komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-29.html#vs24")
                || isValidVerse(curFile, vs, "Isa-56.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs28");
    } //

    public static boolean isTotRustKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("tot rust komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-28.html#vs65")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs23")
                || isValidVerse(curFile, vs, "Isa-14.html#vs7")
                || isValidVerse(curFile, vs, "Isa-34.html#vs14")
                || isValidVerse(curFile, vs, "Isa-51.html#vs4")
                || isValidVerse(curFile, vs, "Isa-57.html#vs20")
                || isValidVerse(curFile, vs, "Jer-47.html#vs6")
                || isValidVerse(curFile, vs, "Jer-49.html#vs23")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs42")
                || isValidVerse(curFile, vs, "Rom-15.html#vs32");
    } // isTotRustKomen

    public static boolean isTotStandKomen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("tot stand komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Job-22.html#vs28")
                || isValidVerse(curFile, vs, "Prov-15.html#vs22")
                || isValidVerse(curFile, vs, "Prov-20.html#vs18")
                || isValidVerse(curFile, vs, "Isa-08.html#vs10")
                || isValidVerse(curFile, vs, "Isa-14.html#vs24");
    } // isTotStandKomen

    public static boolean isUitkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-18.html#vs22")
                || isValidVerse(curFile, vs, "Josh-15.html#vs4", 9, 11)
                || isValidVerse(curFile, vs, "Josh-16.html#vs1", 2, 6, 7)
                || isValidVerse(curFile, vs, "Josh-18.html#vs15", 17)
                || isValidVerse(curFile, vs, "Josh-19.html#vs1", 12, 13, 17, 24, 27, 32, 34, 40)
                || isValidVerse(curFile, vs, "Josh-21.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-24.html#vs7")
                || isValidVerse(curFile, vs, "1Chr-25.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-26.html#vs14", 15)
                || isValidVerse(curFile, vs, "Ezek-41.html#vs11")
                || isValidVerse(curFile, vs, "Acts-19.html#vs19");
    } // isUitkomen

    public static boolean isVoorbijkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-33.html#vs19")
                || isValidVerse(curFile, vs, "Ruth-4.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-29.html#vs2")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs6", 8)
                || isValidVerse(curFile, vs, "Luke-10.html#vs31", 32)
                || isValidVerse(curFile, vs, "Luke-19.html#vs4");
    } // isVoorbijkomen

    public static boolean isVoortkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-02.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs14")
                || isValidVerse(curFile, vs, "Job-05.html#vs6")
                || isValidVerse(curFile, vs, "Job-28.html#vs5")
                || isValidVerse(curFile, vs, "Matt-15.html#vs18", 19)
                || isValidVerse(curFile, vs, "Mark-07.html#vs21")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs3")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs4")
                || isValidVerse(curFile, vs, "Jas-3.html#vs10")
                || isValidVerse(curFile, vs, "Didache-03.html#vs2", 3, 4, 5, 6);
    } // isVoortkomen

    public static boolean isVooruitkomen() {
        return IS_NOT_FOUND;
    } // isVooruitkomen

    public static boolean isVrijkomen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-25.html#vs28", 31);
    } // isVrijkomen

    private static boolean isKomen(final File curFile, final String vs, final String keyArg, final String arg) {
        return !isAankomen(curFile, vs)
                && !isAchternakomen()
                && !isAfkomen(curFile, vs)
                && !isBijeenkomen(curFile, vs)
                && !isBinnenkomen(curFile, vs)
                && !isEindeKomenAan(curFile, vs, keyArg, arg)
                && !isInAanrakingKomen(curFile, vs, arg)
                && !isInOpstandKomen(curFile, vs, arg)
                && !isKom(curFile, vs)
                && !isMeekomen(curFile, vs)
                && !isNaarVorenKomen(curFile, vs, arg)
                && !isNakomen(curFile, vs)
                && !isNabijkomen(curFile, vs)
                && !isNaderbijkomen(curFile, vs)
                && !isNeerkomen(curFile, vs)
                && !isOmkomen(curFile, vs)
                && !isOnderOgenKomen(curFile, vs, arg)
                && !isOpAdemKomen(curFile, vs, arg)
                && !isOpkomen(curFile, vs)
                && !isOvereenkomen(curFile, vs)
                && !isOverkomen(curFile, vs)
                && !isSamenkomen(curFile, vs)
                && !isTeBovenKomen(curFile, vs, arg)
                && !isTeHulpKomen(curFile, vs, arg)
                && !isTeWetenKomen(curFile, vs, arg)
                && !isTegemoetkomen(curFile, vs)
                && !isTegenkomen(curFile, vs)
                && !isTekortkomen(curFile, vs)
                && !isTenGoedeKomen(curFile, vs, arg)
                && !isTenValKomen(curFile, vs, arg)
                && !isTerugkomen(curFile, vs)
                && !isThuiskomen(curFile, vs)
                && !isToekomen(curFile, vs)
                && !isTotGeloofKomen(curFile, vs, arg)
                && !isTotInzichtKomen(curFile, vs, arg)
                && !isTotRustKomen(curFile, vs, arg)
                && !isTotStandKomen(curFile, vs, arg)
                && !isUitkomen(curFile, vs)
                && !isVoorbijkomen(curFile, vs)
                && !isVooruitkomen()
                && !isVrijkomen(curFile, vs)
                && !isVoortkomen(curFile, vs);
    }  // isGaan

}
