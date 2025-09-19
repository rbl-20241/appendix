package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMaand {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "een maand" -> isEenMaand(curFile, vs);
            case "twee maanden" -> isTweeMaanden(curFile, vs);
            case "drie maanden" -> isDrieMaanden(curFile, vs);
            case "vier maanden" -> isVierMaanden(curFile, vs);
            case "vijf maanden" -> isVijfMaanden(curFile, vs);
            case "zes maanden" -> isZesMaanden(curFile, vs);
            case "zeven maanden" -> isZevenMaanden(curFile, vs);
            case "negen maanden" -> isNegenMaanden(curFile, vs);
            case "twaalf maanden" -> isTwaalfMaanden(curFile, vs);
            case "tweeenveertig maanden" -> isTweeEnVeertigmaanden(curFile, vs);
            case "eerste maand (abib, nisan)" -> isEersteMaand(curFile, vs, arg);
            case "tweede maand (ziv)" -> isTweedeMaand(curFile, vs, arg);
            case "derde maand (sivan)" -> isDerdeMaand(curFile, vs, arg);
            case "vierde maand (tammoez)" -> isVierdeMaand(curFile, vs, arg);
            case "vijfde maand (aaw)" -> isVijfdeMaand(curFile, vs, arg);
            case "zesde maand (elul)" -> isZesdeMaand(curFile, vs, arg);
            case "zevende maand (ethanim)" -> isZevendeMaand(curFile, vs, arg);
            case "achtste maand (bul)" -> isAchtsteMaand(curFile, vs, arg);
            case "negende maand (chisleu)" -> isNegendeMaand(curFile, vs, arg);
            case "tiende maand (tebeth)" -> isTiendeMaand(curFile, vs, arg);
            case "elfde maand (sjebat)" -> isElfdeMaand(curFile, vs, arg);
            case "twaalfde maand (adar)" -> isTwaalfdeMaand(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isEenMaand(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-27.html#vs6")
                || isValidVerse(curFile, vs, "Num-03.html#vs15", 22, 28, 34, 39, 40, 43)
                || isValidVerse(curFile, vs, "Num-09.html#vs22")
                || isValidVerse(curFile, vs, "Num-18.html#vs16")
                || isValidVerse(curFile, vs, "Num-26.html#vs62")
                || isValidVerse(curFile, vs, "Deut-21.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs7")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs14")
                || isValidVerse(curFile, vs, "Zech-11.html#vs8");
    } // isEenMaand

    public static boolean isTweeMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-11.html#vs37", 38, 39)
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs14");
    } // isTweeMaanden

    public static boolean isDrieMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs24")
                || isValidVerse(curFile, vs, "Exod-02.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs31")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs14")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs2", 9)
                || isValidVerse(curFile, vs, "Amos-4.html#vs7")
                || isValidVerse(curFile, vs, "Luke-01.html#vs56")
                || isValidVerse(curFile, vs, "Acts-07.html#vs20")
                || isValidVerse(curFile, vs, "Acts-19.html#vs8")
                || isValidVerse(curFile, vs, "Acts-20.html#vs3")
                || isValidVerse(curFile, vs, "Acts-28.html#vs11")
                || isValidVerse(curFile, vs, "Heb-11.html#vs23");
    } // isDrieMaanden

    public static boolean isVierMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-19.html#vs2")
                || isValidVerse(curFile, vs, "Judg-20.html#vs47")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs7")
                || isValidVerse(curFile, vs, "John-04.html#vs35");
    } // isVierMaanden

    public static boolean isVijfMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-01.html#vs24")
                || isValidVerse(curFile, vs, "Rev-09.html#vs5", 10);
    } // isVijfMaanden

    public static boolean isZesMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-02.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-05.html#vs5")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-03.html#vs4")
                || isValidVerse(curFile, vs, "Esth-02.html#vs12")
                || isValidVerse(curFile, vs, "Hag-1.html#vs1")
                || isValidVerse(curFile, vs, "Luke-04.html#vs25")
                || isValidVerse(curFile, vs, "Acts-18.html#vs11")
                || isValidVerse(curFile, vs, "Jas-5.html#vs17");
    } // isZesMaanden

    public static boolean isZevenMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-06.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs12", 14);
    } // isZevenMaanden

    public static boolean isNegenMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-24.html#vs8");
    } // isNegenMaanden

    public static boolean isTwaalfMaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-02.html#vs12")
                || isValidVerse(curFile, vs, "Dan-04.html#vs29");
    } // isTwaalfMaanden

    public static boolean isTweeEnVeertigmaanden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-11.html#vs2")
                || isValidVerse(curFile, vs, "Rev-13.html#vs5");
    } // isTweeEnVeertigmaanden

    public static boolean isEersteMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Abib") || arg.equalsIgnoreCase("Nisan")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-08.html#vs13")
                || isValidVerse(curFile, vs, "Exod-12.html#vs18")
                || isValidVerse(curFile, vs, "Exod-40.html#vs2", 17)
                || isValidVerse(curFile, vs, "Lev-23.html#vs5")
                || isValidVerse(curFile, vs, "Num-09.html#vs1", 5)
                || isValidVerse(curFile, vs, "Num-20.html#vs1")
                || isValidVerse(curFile, vs, "Num-28.html#vs16")
                || isValidVerse(curFile, vs, "Num-33.html#vs3")
                || isValidVerse(curFile, vs, "Josh-04.html#vs19")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs2", 3)
                || isValidVerse(curFile, vs, "2Chr-29.html#vs3", 17)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs19")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs9")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs31")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs17")
                || isValidVerse(curFile, vs, "Esth-03.html#vs7", 12)
                || isValidVerse(curFile, vs, "Ezek-29.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs18", 21)
                || isValidVerse(curFile, vs, "Dan-10.html#vs4")
                || isValidVerse(curFile, vs, "Joel-2.html#vs23");
    } // isEersteMaand

    public static boolean isTweedeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Ziv")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-07.html#vs11")
                || isValidVerse(curFile, vs, "Gen-08.html#vs14")
                || isValidVerse(curFile, vs, "Exod-16.html#vs1")
                || isValidVerse(curFile, vs, "Num-01.html#vs1", 18)
                || isValidVerse(curFile, vs, "Num-09.html#vs11")
                || isValidVerse(curFile, vs, "Num-10.html#vs11")
                || isValidVerse(curFile, vs, "Num-33.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-03.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs2", 13, 15)
                || isValidVerse(curFile, vs, "Ezra-03.html#vs8");
    } // isTweedeMaand

    public static boolean isDerdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Sivan")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Exod-19.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs7")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs19")
                || isValidVerse(curFile, vs, "Esth-08.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs1");
    } // isDerdeMaand

    public static boolean isVierdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Tammoez")) {
            return true;
        }
        return isValidVerse(curFile, vs, "2Kgs-25.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs7")
                || isValidVerse(curFile, vs, "Jer-39.html#vs2")
                || isValidVerse(curFile, vs, "Jer-52.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs1");
    } // isVierdeMaand

    public static boolean isVijfdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Aaw")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Num-33.html#vs38")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs8", 9)
                || isValidVerse(curFile, vs, "Jer-01.html#vs3")
                || isValidVerse(curFile, vs, "Jer-28.html#vs1")
                || isValidVerse(curFile, vs, "Jer-52.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs1")
                || isValidVerse(curFile, vs, "Zech-07.html#vs3", 5);
    } // isVijfdeMaand

    public static boolean isZesdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Elul")) {
            return true;
        }
        return isValidVerse(curFile, vs, "1Chr-27.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-08.html#vs1")
                || isValidVerse(curFile, vs, "Hag-1.html#vs1")
                || isValidVerse(curFile, vs, "Hag-2.html#vs1")
                || isValidVerse(curFile, vs, "Luke-01.html#vs26", 36);
    } // isZesdeMaand

    public static boolean isZevendeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Ethanim")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-08.html#vs4")
                || isValidVerse(curFile, vs, "Lev-16.html#vs29")
                || isValidVerse(curFile, vs, "Lev-23.html#vs24", 34, 39, 41)
                || isValidVerse(curFile, vs, "Lev-25.html#vs9")
                || isValidVerse(curFile, vs, "Num-29.html#vs1", 7, 12)
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs2")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs7")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs1", 6)
                || isValidVerse(curFile, vs, "Neh-08.html#vs1", 3, 15)
                || isValidVerse(curFile, vs, "Jer-28.html#vs17")
                || isValidVerse(curFile, vs, "Jer-41.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs25")
                || isValidVerse(curFile, vs, "Hag-2.html#vs2")
                || isValidVerse(curFile, vs, "Zech-07.html#vs5")
                || isValidVerse(curFile, vs, "Zech-08.html#vs19");
    } // isZevendeMaand

    public static boolean isAchtsteMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Bul")) {
            return true;
        }
        return isValidVerse(curFile, vs, "1Kgs-06.html#vs38")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs32", 33)
                || isValidVerse(curFile, vs, "1Chr-27.html#vs11")
                || isValidVerse(curFile, vs, "Zech-01.html#vs1");
    } // isAchtsteMaand

    public static boolean isNegendeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Chisleu")) {
            return true;
        }
        return isValidVerse(curFile, vs, "1Chr-27.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs16")
                || isValidVerse(curFile, vs, "Jer-36.html#vs9", 22)
                || isValidVerse(curFile, vs, "Hag-2.html#vs11", 19)
                || isValidVerse(curFile, vs, "Zech-07.html#vs1");
    } // isNegendeMaand

    public static boolean isTiendeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Tebeth")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-08.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs13")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs16")
                || isValidVerse(curFile, vs, "Esth-02.html#vs16")
                || isValidVerse(curFile, vs, "Jer-39.html#vs1")
                || isValidVerse(curFile, vs, "Jer-52.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs21")
                || isValidVerse(curFile, vs, "Zech-08.html#vs19");
    } // isTiendeMaand

    public static boolean isElfdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Sjebat")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Deut-01.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs14")
                || isValidVerse(curFile, vs, "Zech-01.html#vs7");
    } // isElfdeMaand

    public static boolean isTwaalfdeMaand(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equalsIgnoreCase("Adar")) {
            return !isValidVerse(curFile, vs, "Josh-15.html#vs3");
        }
        return isValidVerse(curFile, vs, "2Kgs-25.html#vs27")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs15")
                || isValidVerse(curFile, vs, "Esth-03.html#vs7", 13)
                || isValidVerse(curFile, vs, "Esth-08.html#vs12")
                || isValidVerse(curFile, vs, "Esth-09.html#vs1")
                || isValidVerse(curFile, vs, "Jer-52.html#vs31")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs1");
    } // isTwaalfdeMaand
}
