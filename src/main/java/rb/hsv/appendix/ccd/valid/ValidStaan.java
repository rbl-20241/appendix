package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidDoen.isDoenOpstaan;
import static rb.hsv.appendix.ccd.valid.ValidVoorOgen.isVoorOgenStaan;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStaan {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afstaan" -> isAfstaan(curFile, vs);
            case "beschaamd staan" -> isBeschaamdStaan(curFile, vs);
            case "bijstaan" -> isBijstaan(curFile, vs);
            case "borg staan" -> isBorgStaan(curFile, vs);
            case "buitenstaan" -> isBuitenstaan(curFile, vs);
            case "gereedstaan" -> isGereedstaan(curFile, vs);
            case "in aanzien staan" -> isInAanzienStaan(curFile, vs, keyArg, arg);
            case "in bloei staan" -> isInBloeiStaan(curFile, vs, keyArg, arg);
            case "in de schuld staan" -> isInDeSchuldStaan(curFile, vs, keyArg, arg);
            case "in dienst staan" -> isInDienstStaan(curFile, vs, keyArg, arg);
            case "in staat stellen" -> isInStaatStellen(curFile, vs, keyArg, arg);
            case "in staat zijn" -> isInStaatZijn(curFile, vs, keyArg, arg);
            case "klaarstaan" -> isKlaarstaan(curFile, vs);
            case "naar het leven staan" -> isNaarHetLevenStaan(curFile, vs, keyArg, arg);
            case "onder leiding staan" -> isOnderLeidingStaan(curFile, vs, keyArg, arg);
            case "op het punt staan" -> isOpHetPuntStaan(curFile, vs, keyArg, arg);
            case "op wacht staan" -> isOpWachtStaan(curFile, vs, keyArg, arg);
            case "openstaan" -> isOpenstaan(curFile, vs);
            case "opgesteld staan" -> isOpgesteldStaan(curFile, vs);
            case "opstaan" -> isOpstaan(curFile, vs);
            case "opstaan tegen" -> isOpstaanTegen(curFile, vs);
            case "staat (zelfstandig naamwoord)" -> isStaat(curFile, vs, keyArg, arg);
            case "stilstaan" -> isStilstaan(curFile, vs);
            case "ter beschikking staan" -> isTerBeschikkingStaan(curFile, vs, keyArg, arg);
            case "terechtstaan" -> isTerechtstaan(curFile, vs);
            case "terzijde staan" -> isTerzijdeStaan(curFile, vs);
            case "toestaan" -> isToestaan(curFile, vs);
            case "vaststaan" -> isVaststaan(curFile, vs);
            case "versteld staan" -> isVersteldStaan(curFile, vs);
            case "weerstaan" -> isWeerstaan();
            case "staan" -> isStaan(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAfstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-12.html#vs7");
    } // isAfstaan

    public static boolean isBeschaamdStaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-19.html#vs5")
                || isValidVerse(curFile, vs, "Isa-30.html#vs5")
                || isValidVerse(curFile, vs, "Isa-33.html#vs9")
                || isValidVerse(curFile, vs, "Jer-02.html#vs26")
                || isValidVerse(curFile, vs, "Jer-06.html#vs15")
                || isValidVerse(curFile, vs, "Jer-08.html#vs9", 12)
                || isValidVerse(curFile, vs, "Jer-46.html#vs24")
                || isValidVerse(curFile, vs, "Jer-48.html#vs1", 20)
                || isValidVerse(curFile, vs, "Jer-49.html#vs23")
                || isValidVerse(curFile, vs, "Jer-50.html#vs2", 12)
                || isValidVerse(curFile, vs, "Joel-1.html#vs11")
                || isValidVerse(curFile, vs, "Luke-13.html#vs17")
                || isValidVerse(curFile, vs, "Titus-2.html#vs8");
    } // isBeschaamdStaan

    public static boolean isBijstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-01.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs34")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "");
    } // isBijstaan

    public static boolean isBorgStaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-43.html#vs9")
                || isValidVerse(curFile, vs, "Prov-06.html#vs1")
                || isValidVerse(curFile, vs, "Prov-20.html#vs16")
                || isValidVerse(curFile, vs, "Prov-22.html#vs26")
                || isValidVerse(curFile, vs, "Prov-27.html#vs13");
    } // isBorgStaan

    public static boolean isBuitenstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs31")
                || isValidVerse(curFile, vs, "Deut-24.html#vs11")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs13")
                || isValidVerse(curFile, vs, "Matt-12.html#vs46", 47)
                || isValidVerse(curFile, vs, "Mark-03.html#vs31")
                || isValidVerse(curFile, vs, "Luke-08.html#vs20")
                || isValidVerse(curFile, vs, "Luke-13.html#vs25")
                || isValidVerse(curFile, vs, "John-18.html#vs16")
                || isValidVerse(curFile, vs, "John-20.html#vs11")
                || isValidVerse(curFile, vs, "Acts-05.html#vs23", 34);
    } // isBuitenstaan

    public static boolean isGereedstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-03.html#vs13")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs6")
                || isValidVerse(curFile, vs, "2Cor-12.html#vs14");
    } // isGereedstaan

    public static boolean isInAanzienStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-11.html#vs3")
                || isValidVerse(curFile, vs, "Esth-09.html#vs4")
                || isValidVerse(curFile, vs, "Esth-10.html#vs3");
    } // isInAanzienStaan

    public static boolean isInBloeiStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-17.html#vs5", 8)
                || isValidVerse(curFile, vs, "Prov-14.html#vs11")
                || isValidVerse(curFile, vs, "Isa-17.html#vs11")
                || isValidVerse(curFile, vs, "Isa-35.html#vs1", 2)
                || isValidVerse(curFile, vs, "Ezek-07.html#vs10")
                || isValidVerse(curFile, vs, "Hos-14.html#vs6", 8)
                || isValidVerse(curFile, vs, "Hab-3.html#vs17");
    } // isInBloeiStaan

    public static boolean isInDeSchuldStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-44.html#vs32")
                || isValidVerse(curFile, vs, "Rom-01.html#vs14");
    } // isInDeSchuldStaan

    public static boolean isInDienstStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-01.html#vs38")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs21", 22)
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs7")
                || isValidVerse(curFile, vs, "Neh-12.html#vs44")
                || isValidVerse(curFile, vs, "Esth-07.html#vs9")
                || isValidVerse(curFile, vs, "Jer-18.html#vs20")
                || isValidVerse(curFile, vs, "Jer-35.html#vs19")
                || isValidVerse(curFile, vs, "Jer-40.html#vs10")
                || isValidVerse(curFile, vs, "Jer-52.html#vs12");
    } // isInDienstStaan

    public static boolean isInStaatStellen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-04.html#vs21");
    } // isInStaatStellen

    public static boolean isInStaatZijn(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-45.html#vs3")
                || isValidVerse(curFile, vs, "Num-22.html#vs18", 37)
                || isValidVerse(curFile, vs, "Josh-17.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs33")
                || isValidVerse(curFile, vs, "1Sam-26.html#vs25")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs22")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs21")
                || isValidVerse(curFile, vs, "Neh-04.html#vs10")
                || isValidVerse(curFile, vs, "Neh-08.html#vs3", 4)
                || isValidVerse(curFile, vs, "Esth-08.html#vs6")
                || isValidVerse(curFile, vs, "Ps-021.html#vs12")
                || isValidVerse(curFile, vs, "Isa-07.html#vs1",15, 16)
                || isValidVerse(curFile, vs, "Jer-06.html#vs10")
                || isValidVerse(curFile, vs, "Jer-20.html#vs11")
                || isValidVerse(curFile, vs, "Dan-01.html#vs4")
                || isValidVerse(curFile, vs, "Dan-02.html#vs26")
                || isValidVerse(curFile, vs, "Dan-04.html#vs18", 37)
                || isValidVerse(curFile, vs, "Dan-05.html#vs8", 15)
                || isValidVerse(curFile, vs, "Hos-08.html#vs5")
                || isValidVerse(curFile, vs, "Mark-05.html#vs4")
                || isValidVerse(curFile, vs, "Mark-14.html#vs37")
                || isValidVerse(curFile, vs, "Luke-14.html#vs29")
                || isValidVerse(curFile, vs, "Acts-06.html#vs10")
                || isValidVerse(curFile, vs, "Acts-25.html#vs5")
                || isValidVerse(curFile, vs, "Rom-16.html#vs25")
                || isValidVerse(curFile, vs, "1Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "Gal-3.html#vs21")
                || isValidVerse(curFile, vs, "Heb-09.html#vs9");
    } // isInStaatZijn

    public static boolean isKlaarstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-03.html#vs14")
                || isValidVerse(curFile, vs, "Esth-08.html#vs13")
                || isValidVerse(curFile, vs, "Job-03.html#vs8")
                || isValidVerse(curFile, vs, "Job-18.html#vs12")
                || isValidVerse(curFile, vs, "Isa-03.html#vs13")
                || isValidVerse(curFile, vs, "Acts-23.html#vs15", 21);
    } // isKlaarstaan

    public static boolean isNaarHetLevenStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-04.html#vs19")
                || isValidVerse(curFile, vs, "Lev-19.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs29")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs11")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs10", 14)
                || isValidVerse(curFile, vs, "Ps-035.html#vs4")
                || isValidVerse(curFile, vs, "Ps-038.html#vs13")
                || isValidVerse(curFile, vs, "Ps-040.html#vs15")
                || isValidVerse(curFile, vs, "Ps-054.html#vs5")
                || isValidVerse(curFile, vs, "Ps-063.html#vs10")
                || isValidVerse(curFile, vs, "Ps-070.html#vs3")
                || isValidVerse(curFile, vs, "Ps-086.html#vs14")
                || isValidVerse(curFile, vs, "Jer-04.html#vs30")
                || isValidVerse(curFile, vs, "Jer-11.html#vs21")
                || isValidVerse(curFile, vs, "Jer-19.html#vs7", 9)
                || isValidVerse(curFile, vs, "Jer-21.html#vs7")
                || isValidVerse(curFile, vs, "Jer-22.html#vs25")
                || isValidVerse(curFile, vs, "Jer-34.html#vs20", 21)
                || isValidVerse(curFile, vs, "Jer-38.html#vs16")
                || isValidVerse(curFile, vs, "Jer-44.html#vs30")
                || isValidVerse(curFile, vs, "Jer-46.html#vs26")
                || isValidVerse(curFile, vs, "Jer-49.html#vs37")
                || isValidVerse(curFile, vs, "Matt-02.html#vs20")
                || isValidVerse(curFile, vs, "Rom-11.html#vs3");
    } // isNaarHetLevenStaan

    public static boolean isOnderLeidingStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Chr-25.html#vs3", 6);
    } // isOnderLeidingStaan

    public static boolean isOpHetPuntStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-12.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs3")
                || isValidVerse(curFile, vs, "Neh-05.html#vs3", 5)
                || isValidVerse(curFile, vs, "Neh-06.html#vs6")
                || isValidVerse(curFile, vs, "Job-12.html#vs5")
                || isValidVerse(curFile, vs, "Isa-26.html#vs17")
                || isValidVerse(curFile, vs, "Isa-37.html#vs3")
                || isValidVerse(curFile, vs, "Acts-20.html#vs3")
                || isValidVerse(curFile, vs, "Heb-08.html#vs13")
                || isValidVerse(curFile, vs, "Rev-10.html#vs4")
                || isValidVerse(curFile, vs, "Rev-12.html#vs4");
    } // isOpHetPuntStaan

    public static boolean isOpWachtStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Chr-09.html#vs18");
    } // isOpWachtStaan

    public static boolean isOpenstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-06.html#vs11");
    } // isOpenstaan

    public static boolean isOpgesteldStaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-03.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-25.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs26")
                || isValidVerse(curFile, vs, "Neh-04.html#vs16")
                || isValidVerse(curFile, vs, "Job-06.html#vs4");
    } // isOpgesteldStaan

    public static boolean isOpstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs17")
                || isValidVerse(curFile, vs, "Gen-18.html#vs16")
                || isValidVerse(curFile, vs, "Gen-19.html#vs1", 14, 15, 27, 35)
                || isValidVerse(curFile, vs, "Gen-20.html#vs8")
                || isValidVerse(curFile, vs, "Gen-21.html#vs14", 18, 32)
                || isValidVerse(curFile, vs, "Gen-22.html#vs3", 19)
                || isValidVerse(curFile, vs, "Gen-23.html#vs3", 7)
                || isValidVerse(curFile, vs, "Gen-24.html#vs10", 54, 61)
                || isValidVerse(curFile, vs, "Gen-25.html#vs34")
                || isValidVerse(curFile, vs, "Gen-26.html#vs31")
                || isValidVerse(curFile, vs, "Gen-27.html#vs43")
                || isValidVerse(curFile, vs, "Gen-28.html#vs2", 18)
                || isValidVerse(curFile, vs, "Gen-31.html#vs13", 17, 21, 55)
                || isValidVerse(curFile, vs, "Gen-32.html#vs22")
                || isValidVerse(curFile, vs, "Gen-35.html#vs1")
                || isValidVerse(curFile, vs, "Gen-37.html#vs7", 35)
                || isValidVerse(curFile, vs, "Gen-38.html#vs19")
                || isValidVerse(curFile, vs, "Gen-43.html#vs13", 15)
                || isValidVerse(curFile, vs, "Gen-44.html#vs4")
                || isValidVerse(curFile, vs, "Gen-46.html#vs5")
                || isValidVerse(curFile, vs, "Exod-02.html#vs17")
                || isValidVerse(curFile, vs, "Exod-08.html#vs20")
                || isValidVerse(curFile, vs, "Exod-09.html#vs13")
                || isValidVerse(curFile, vs, "Exod-10.html#vs23")
                || isValidVerse(curFile, vs, "Exod-12.html#vs30", 31)
                || isValidVerse(curFile, vs, "Exod-24.html#vs4", 13)
                || isValidVerse(curFile, vs, "Exod-32.html#vs1", 6)
                || isValidVerse(curFile, vs, "Exod-33.html#vs10")
                || isValidVerse(curFile, vs, "Exod-34.html#vs4")
                || isValidVerse(curFile, vs, "Num-10.html#vs35")
                || isValidVerse(curFile, vs, "Num-11.html#vs32")
                || isValidVerse(curFile, vs, "Num-14.html#vs40")
                || isValidVerse(curFile, vs, "Num-16.html#vs25")
                || isValidVerse(curFile, vs, "Num-22.html#vs13", 14, 20, 21)
                || isValidVerse(curFile, vs, "Num-23.html#vs18", 24)
                || isValidVerse(curFile, vs, "Num-24.html#vs25")
                || isValidVerse(curFile, vs, "Num-25.html#vs7")
                || isValidVerse(curFile, vs, "Deut-02.html#vs13", 24)
                || isValidVerse(curFile, vs, "Deut-09.html#vs12")
                || isValidVerse(curFile, vs, "Deut-10.html#vs11")
                || isValidVerse(curFile, vs, "Josh-01.html#vs2")
                || isValidVerse(curFile, vs, "Josh-03.html#vs1")
                || isValidVerse(curFile, vs, "Josh-06.html#vs12")
                || isValidVerse(curFile, vs, "Josh-07.html#vs10", 13, 16)
                || isValidVerse(curFile, vs, "Josh-08.html#vs1", 3, 10, 19)
                || isValidVerse(curFile, vs, "Judg-02.html#vs10")
                || isValidVerse(curFile, vs, "Judg-03.html#vs20")
                || isValidVerse(curFile, vs, "Judg-04.html#vs9", 14)
                || isValidVerse(curFile, vs, "Judg-05.html#vs12")
                || isValidVerse(curFile, vs, "Judg-06.html#vs38")
                || isValidVerse(curFile, vs, "Judg-07.html#vs1", 9, 15)
                || isValidVerse(curFile, vs, "Judg-08.html#vs20", 21)
                || isValidVerse(curFile, vs, "Judg-09.html#vs32", 34, 35)
                || isValidVerse(curFile, vs, "Judg-10.html#vs1", 3)
                || isValidVerse(curFile, vs, "Judg-13.html#vs11")
                || isValidVerse(curFile, vs, "Judg-16.html#vs3")
                || isValidVerse(curFile, vs, "Judg-18.html#vs9")
                || isValidVerse(curFile, vs, "Judg-19.html#vs3", 7, 9, 10, 28)
                || isValidVerse(curFile, vs, "Judg-20.html#vs5", 8, 18, 19, 33)
                || isValidVerse(curFile, vs, "Ruth-3.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs9", 19)
                || isValidVerse(curFile, vs, "1Sam-03.html#vs6", 8)
                || isValidVerse(curFile, vs, "1Sam-09.html#vs3", 26)
                || isValidVerse(curFile, vs, "1Sam-13.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs12", 13)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs20", 52)
                || isValidVerse(curFile, vs, "1Sam-18.html#vs27")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs25", 34, 41, 43)
                || isValidVerse(curFile, vs, "1Sam-21.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs4", 13, 16, 24)
                || isValidVerse(curFile, vs, "1Sam-24.html#vs5", 8, 9)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs1", 41, 42)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs2", 5)
                || isValidVerse(curFile, vs, "1Sam-27.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs23", 25)
                || isValidVerse(curFile, vs, "1Sam-29.html#vs10", 11)
                || isValidVerse(curFile, vs, "1Sam-31.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs17", 20)
                || isValidVerse(curFile, vs, "2Sam-13.html#vs15", 29, 31)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs7", 8)
                || isValidVerse(curFile, vs, "2Sam-23.html#vs10")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs49", 50)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs19", 40)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs40")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs2", 12, 17)
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs9", 10)
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs3", 5, 7, 8, 21)
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs7", 15, 18)
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs3", 15)
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs30")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs5", 12)
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs1", 21)
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs6", 17)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs12")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs16", 19)
                || isValidVerse(curFile, vs, "1Chr-28.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs41")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs19", 20)
                || isValidVerse(curFile, vs, "2Chr-21.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs12", 15)
                || isValidVerse(curFile, vs, "2Chr-29.html#vs12", 20)
                || isValidVerse(curFile, vs, "2Chr-30.html#vs14", 27)
                || isValidVerse(curFile, vs, "Ezra-01.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs2")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs2")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs4", 5, 6, 10, 15)
                || isValidVerse(curFile, vs, "Neh-02.html#vs12")
                || isValidVerse(curFile, vs, "Neh-03.html#vs1")
                || isValidVerse(curFile, vs, "Neh-04.html#vs14")
                || isValidVerse(curFile, vs, "Neh-09.html#vs5")
                || isValidVerse(curFile, vs, "Esth-07.html#vs7")
                || isValidVerse(curFile, vs, "Esth-08.html#vs4")
                || isValidVerse(curFile, vs, "Job-01.html#vs5", 20)
                || isValidVerse(curFile, vs, "Job-14.html#vs12")
                || isValidVerse(curFile, vs, "Job-20.html#vs27")
                || isValidVerse(curFile, vs, "Job-24.html#vs14")
                || isValidVerse(curFile, vs, "Job-29.html#vs8")
                || isValidVerse(curFile, vs, "Job-30.html#vs12", 28)
                || isValidVerse(curFile, vs, "Ps-003.html#vs2", 8)
                || isValidVerse(curFile, vs, "Ps-007.html#vs7")
                || isValidVerse(curFile, vs, "Ps-009.html#vs20")
                || isValidVerse(curFile, vs, "Ps-010.html#vs12")
                || isValidVerse(curFile, vs, "Ps-017.html#vs13")
                || isValidVerse(curFile, vs, "Ps-035.html#vs2")
                || isValidVerse(curFile, vs, "Ps-044.html#vs27")
                || isValidVerse(curFile, vs, "Ps-068.html#vs2")
                || isValidVerse(curFile, vs, "Ps-074.html#vs22")
                || isValidVerse(curFile, vs, "Ps-082.html#vs8")
                || isValidVerse(curFile, vs, "Ps-106.html#vs30")
                || isValidVerse(curFile, vs, "Ps-119.html#vs62")
                || isValidVerse(curFile, vs, "Ps-132.html#vs8")
                || isValidVerse(curFile, vs, "Prov-06.html#vs9")
                || isValidVerse(curFile, vs, "Prov-24.html#vs16")
                || isValidVerse(curFile, vs, "Prov-31.html#vs15", 28)
                || isValidVerse(curFile, vs, "Song-2.html#vs10", 13)
                || isValidVerse(curFile, vs, "Song-5.html#vs5")
                || isValidVerse(curFile, vs, "Isa-21.html#vs5")
                || isValidVerse(curFile, vs, "Isa-23.html#vs12")
                || isValidVerse(curFile, vs, "Isa-32.html#vs9")
                || isValidVerse(curFile, vs, "Isa-51.html#vs17")
                || isValidVerse(curFile, vs, "Isa-52.html#vs2")
                || isValidVerse(curFile, vs, "Isa-60.html#vs1")
                || isValidVerse(curFile, vs, "Jer-01.html#vs17")
                || isValidVerse(curFile, vs, "Jer-02.html#vs27")
                || isValidVerse(curFile, vs, "Jer-06.html#vs4", 5)
                || isValidVerse(curFile, vs, "Jer-13.html#vs4", 6)
                || isValidVerse(curFile, vs, "Jer-18.html#vs2")
                || isValidVerse(curFile, vs, "Jer-26.html#vs17")
                || isValidVerse(curFile, vs, "Jer-31.html#vs6")
                || isValidVerse(curFile, vs, "Jer-41.html#vs2")
                || isValidVerse(curFile, vs, "Jer-46.html#vs16")
                || isValidVerse(curFile, vs, "Jer-49.html#vs14", 28, 31)
                || isValidVerse(curFile, vs, "Lam-2.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs22", 23)
                || isValidVerse(curFile, vs, "Dan-03.html#vs24")
                || isValidVerse(curFile, vs, "Dan-06.html#vs20")
                || isValidVerse(curFile, vs, "Dan-07.html#vs5")
                || isValidVerse(curFile, vs, "Dan-08.html#vs27")
                || isValidVerse(curFile, vs, "Obad-1.html#vs1")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs2", 3, 6)
                || isValidVerse(curFile, vs, "Jonah-3.html#vs2", 3, 6)
                || isValidVerse(curFile, vs, "Mic-2.html#vs10")
                || isValidVerse(curFile, vs, "Mic-4.html#vs13")
                || isValidVerse(curFile, vs, "Mic-6.html#vs1")
                || isValidVerse(curFile, vs, "Matt-02.html#vs13", 14, 20, 21)
                || isValidVerse(curFile, vs, "Matt-08.html#vs15", 26)
                || isValidVerse(curFile, vs, "Matt-09.html#vs5", 6, 7, 9, 19, 25)
                || isValidVerse(curFile, vs, "Matt-17.html#vs7")
                || isValidVerse(curFile, vs, "Matt-25.html#vs7")
                || isValidVerse(curFile, vs, "Matt-26.html#vs46", 62)
                || isValidVerse(curFile, vs, "Mark-01.html#vs35")
                || isValidVerse(curFile, vs, "Mark-02.html#vs9", 11, 12, 14)
                || isValidVerse(curFile, vs, "Mark-03.html#vs3")
                || isValidVerse(curFile, vs, "Mark-05.html#vs41", 42)
                || isValidVerse(curFile, vs, "Mark-07.html#vs24")
                || isValidVerse(curFile, vs, "Mark-09.html#vs27")
                || isValidVerse(curFile, vs, "Mark-10.html#vs49", 50)
                || isValidVerse(curFile, vs, "Mark-14.html#vs42", 57)
                || isValidVerse(curFile, vs, "Luke-01.html#vs39")
                || isValidVerse(curFile, vs, "Luke-04.html#vs16", 29, 39)
                || isValidVerse(curFile, vs, "Luke-05.html#vs23", 24, 25, 28)
                || isValidVerse(curFile, vs, "Luke-06.html#vs8")
                || isValidVerse(curFile, vs, "Luke-07.html#vs14")
                || isValidVerse(curFile, vs, "Luke-08.html#vs24", 54, 55)
                || isValidVerse(curFile, vs, "Luke-10.html#vs25")
                || isValidVerse(curFile, vs, "Luke-15.html#vs20")
                || isValidVerse(curFile, vs, "Luke-17.html#vs19")
                || isValidVerse(curFile, vs, "Luke-22.html#vs46")
                || isValidVerse(curFile, vs, "Luke-23.html#vs1")
                || isValidVerse(curFile, vs, "Luke-24.html#vs12", 33)
                || isValidVerse(curFile, vs, "John-05.html#vs8")
                || isValidVerse(curFile, vs, "John-11.html#vs29")
                || isValidVerse(curFile, vs, "John-14.html#vs31")
                || isValidVerse(curFile, vs, "Acts-01.html#vs15")
                || isValidVerse(curFile, vs, "Acts-03.html#vs6")
                || isValidVerse(curFile, vs, "Acts-05.html#vs6", 17, 34, 36, 37)
                || isValidVerse(curFile, vs, "Acts-06.html#vs9")
                || isValidVerse(curFile, vs, "Acts-08.html#vs26", 27)
                || isValidVerse(curFile, vs, "Acts-09.html#vs6", 8, 11, 18, 34, 39, 40)
                || isValidVerse(curFile, vs, "Acts-10.html#vs13", 20, 26)
                || isValidVerse(curFile, vs, "Acts-11.html#vs7", 28)
                || isValidVerse(curFile, vs, "Acts-12.html#vs7")
                || isValidVerse(curFile, vs, "Acts-13.html#vs16")
                || isValidVerse(curFile, vs, "Acts-14.html#vs20")
                || isValidVerse(curFile, vs, "Acts-15.html#vs7")
                || isValidVerse(curFile, vs, "Acts-22.html#vs10", 16)
                || isValidVerse(curFile, vs, "Acts-23.html#vs9")
                || isValidVerse(curFile, vs, "Acts-26.html#vs30")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs7")
                || isValidVerse(curFile, vs, "Eph-5.html#vs14")
                || isValidVerse(curFile, vs, "Rev-11.html#vs1");
    } // isOpstaan

    public static boolean isOpstaanTegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-15.html#vs7")
                || isValidVerse(curFile, vs, "Deut-19.html#vs15", 16)
                || isValidVerse(curFile, vs, "Deut-33.html#vs11")
                || isValidVerse(curFile, vs, "Judg-20.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs40", 49)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs23")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs1")
                || isValidVerse(curFile, vs, "Job-20.html#vs27")
                || isValidVerse(curFile, vs, "Ps-003.html#vs2")
                || isValidVerse(curFile, vs, "Ps-017.html#vs7")
                || isValidVerse(curFile, vs, "Ps-018.html#vs40", 49)
                || isValidVerse(curFile, vs, "Ps-027.html#vs12")
                || isValidVerse(curFile, vs, "Ps-035.html#vs11")
                || isValidVerse(curFile, vs, "Ps-044.html#vs6")
                || isValidVerse(curFile, vs, "Ps-054.html#vs5")
                || isValidVerse(curFile, vs, "Ps-059.html#vs2")
                || isValidVerse(curFile, vs, "Ps-074.html#vs23")
                || isValidVerse(curFile, vs, "Ps-086.html#vs14")
                || isValidVerse(curFile, vs, "Ps-092.html#vs12")
                || isValidVerse(curFile, vs, "Ps-124.html#vs2")
                || isValidVerse(curFile, vs, "Ps-139.html#vs21")
                || isValidVerse(curFile, vs, "Isa-14.html#vs22")
                || isValidVerse(curFile, vs, "Isa-31.html#vs2")
                || isValidVerse(curFile, vs, "Isa-54.html#vs17")
                || isValidVerse(curFile, vs, "Dan-08.html#vs25")
                || isValidVerse(curFile, vs, "Dan-11.html#vs14")
                || isValidVerse(curFile, vs, "Amos-6.html#vs14")
                || isValidVerse(curFile, vs, "Amos-7.html#vs9")
                || isValidVerse(curFile, vs, "Obad-1.html#vs1")
                || isValidVerse(curFile, vs, "Mic-5.html#vs4")
                || isValidVerse(curFile, vs, "Mic-7.html#vs6")
                || isValidVerse(curFile, vs, "Matt-10.html#vs21")
                || isValidVerse(curFile, vs, "Matt-24.html#vs7")
                || isValidVerse(curFile, vs, "Mark-03.html#vs26")
                || isValidVerse(curFile, vs, "Mark-13.html#vs8", 12)
                || isValidVerse(curFile, vs, "Luke-21.html#vs10")
                || isValidVerse(curFile, vs, "Acts-18.html#vs12");
    } // isOpenstaanTegen

    public static boolean isStaat(final File curFile, final String vs, final String keyArg, final String arg) {
        if (isInStaatZijn(curFile, vs, keyArg, arg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Chr-24.html#vs13")
                || isValidVerse(curFile, vs, "Luke-01.html#vs48")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs24")
                || isValidVerse(curFile, vs, "Jas-1.html#vs9", 10);
    } // isStaat

    public static boolean isStilstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-03.html#vs8")
                || isValidVerse(curFile, vs, "Josh-10.html#vs12", 13, 19)
                || isValidVerse(curFile, vs, "1Sam-14.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs38")
                || isValidVerse(curFile, vs, "Job-32.html#vs16")
                || isValidVerse(curFile, vs, "Jer-04.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs17", 19)
                || isValidVerse(curFile, vs, "Hab-3.html#vs11")
                || isValidVerse(curFile, vs, "Matt-20.html#vs32")
                || isValidVerse(curFile, vs, "Mark-10.html#vs49")
                || isValidVerse(curFile, vs, "Luke-07.html#vs14");
    } // isStilstaan

    public static boolean isTerBeschikkingStaan(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Chr-19.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs11");
    } // isTerBeschikkingStaan

    public static boolean isTerechtstaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-20.html#vs6");
    } // isTerechtstaan

    public static boolean isTerzijdeStaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-31.html#vs15")
                || isValidVerse(curFile, vs, "Neh-11.html#vs24")
                || isValidVerse(curFile, vs, "Dan-11.html#vs1");
    } // isTerzijdeStaan

    public static boolean isToestaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-21.html#vs23")
                || isValidVerse(curFile, vs, "Judg-15.html#vs1")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs5")
                || isValidVerse(curFile, vs, "Eccl-06.html#vs2")
                || isValidVerse(curFile, vs, "Matt-08.html#vs21", 31)
                || isValidVerse(curFile, vs, "Mark-05.html#vs13", 19)
                || isValidVerse(curFile, vs, "Luke-08.html#vs32")
                || isValidVerse(curFile, vs, "Luke-09.html#vs59", 61)
                || isValidVerse(curFile, vs, "John-19.html#vs38")
                || isValidVerse(curFile, vs, "Acts-21.html#vs39")
                || isValidVerse(curFile, vs, "Acts-27.html#vs3")
                || isValidVerse(curFile, vs, "1Tim-2.html#vs12")
                || isValidVerse(curFile, vs, "Didache-10.html#vs7");
    } // isToestaan

    public static boolean isVaststaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-27.html#vs14", 17)
                || isValidVerse(curFile, vs, "Num-24.html#vs21")
                || isValidVerse(curFile, vs, "Deut-13.html#vs14")
                || isValidVerse(curFile, vs, "Deut-17.html#vs4")
                || isValidVerse(curFile, vs, "Deut-19.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs30")
                || isValidVerse(curFile, vs, "Job-11.html#vs15")
                || isValidVerse(curFile, vs, "Ps-030.html#vs8")
                || isValidVerse(curFile, vs, "Ps-039.html#vs6")
                || isValidVerse(curFile, vs, "Ps-065.html#vs7")
                || isValidVerse(curFile, vs, "Ps-089.html#vs3")
                || isValidVerse(curFile, vs, "Ps-093.html#vs1", 2)
                || isValidVerse(curFile, vs, "Ps-096.html#vs10")
                || isValidVerse(curFile, vs, "Ps-119.html#vs89")
                || isValidVerse(curFile, vs, "Ps-148.html#vs6")
                || isValidVerse(curFile, vs, "Isa-02.html#vs2")
                || isValidVerse(curFile, vs, "Jer-51.html#vs29")
                || isValidVerse(curFile, vs, "Dan-02.html#vs5")
                || isValidVerse(curFile, vs, "Dan-06.html#vs13")
                || isValidVerse(curFile, vs, "Hos-06.html#vs3")
                || isValidVerse(curFile, vs, "Mic-4.html#vs1")
                || isValidVerse(curFile, vs, "Nah-2.html#vs7")
                || isValidVerse(curFile, vs, "Rom-16.html#vs25")
                || isValidVerse(curFile, vs, "1Cor-16.html#vs13")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs24")
                || isValidVerse(curFile, vs, "Gal-5.html#vs1")
                || isValidVerse(curFile, vs, "2Thess-2.html#vs15");
    } // isVaststaan

    public static boolean isVersteldStaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-07.html#vs28")
                || isValidVerse(curFile, vs, "Matt-13.html#vs54")
                || isValidVerse(curFile, vs, "Matt-19.html#vs25")
                || isValidVerse(curFile, vs, "Matt-22.html#vs33")
                || isValidVerse(curFile, vs, "Mark-01.html#vs22")
                || isValidVerse(curFile, vs, "Mark-06.html#vs2")
                || isValidVerse(curFile, vs, "Mark-07.html#vs37")
                || isValidVerse(curFile, vs, "Mark-10.html#vs26")
                || isValidVerse(curFile, vs, "Mark-11.html#vs18")
                || isValidVerse(curFile, vs, "Luke-02.html#vs47", 48)
                || isValidVerse(curFile, vs, "Luke-04.html#vs32")
                || isValidVerse(curFile, vs, "Luke-09.html#vs43")
                || isValidVerse(curFile, vs, "Luke-24.html#vs22")
                || isValidVerse(curFile, vs, "Acts-08.html#vs9", 11, 13);
    } // isVersteldStaan

    public static boolean isWeerstaan() {
        return false;
    } // isWeerstaan

    public static boolean isStaan(final File curFile, final String vs, final String keyArg, final String arg) {
        return !isAfstaan(curFile, vs)
                && !isBeschaamdStaan(curFile, vs)
                && !isBijstaan(curFile, vs)
                && !isBorgStaan(curFile, vs)
                && !isBuitenstaan(curFile, vs)
                && !isDoenOpstaan(curFile, vs)
                && !isGereedstaan(curFile, vs)
                && !isInAanzienStaan(curFile, vs, keyArg, arg)
                && !isInBloeiStaan(curFile, vs, keyArg, arg)
                && !isInDeSchuldStaan(curFile, vs, keyArg, arg)
                && !isInDienstStaan(curFile, vs, keyArg, arg)
                && !isInStaatStellen(curFile, vs, keyArg, arg)
                && !isInStaatZijn(curFile, vs, keyArg, arg)
                && !isKlaarstaan(curFile, vs)
                && !isNaarHetLevenStaan(curFile, vs, keyArg, arg)
                && !isOnderLeidingStaan(curFile, vs, keyArg, arg)
                && !isOpHetPuntStaan(curFile, vs, keyArg, arg)
                && !isOpWachtStaan(curFile, vs, keyArg, arg)
                && !isOpenstaan(curFile, vs)
                && !isOpgesteldStaan(curFile, vs)
                && !isOpstaan(curFile, vs)
                && !isOpstaanTegen(curFile, vs)
                && !isStaat(curFile, vs, keyArg, arg)
                && !isStilstaan(curFile, vs)
                && !isTerBeschikkingStaan(curFile, vs, keyArg, arg)
                && !isTerechtstaan(curFile, vs)
                && !isTerzijdeStaan(curFile, vs)
                && !isToestaan(curFile, vs)
                && !isVaststaan(curFile, vs)
                && !isVersteldStaan(curFile, vs)
                && !isVoorOgenStaan(curFile, vs, arg)
                && !isWeerstaan();
    } // isStaan


}
