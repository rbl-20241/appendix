package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLaten {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "achterlaten" -> isAchterlaten(curFile, vs);
            case "inlaten" -> isInlaten(curFile, vs);
            case "in de steek laten" -> isInDeSteekLaten(curFile, vs, arg);
            case "in leven laten" -> isInLevenLaten(curFile, vs, keyArg, arg);
            case "laat" -> isLaat(curFile, vs);
            case "loslaten" -> isLoslaten(curFile, vs);
            case "met rust laten" -> isMetRustLaten(curFile, vs, arg);
            case "nalaten" -> isNalaten(curFile, vs);
            case "neerlaten" -> isNeerlaten(curFile, vs);
            case "openlaten" -> isOpenlaten(curFile, vs);
            case "overlaten" -> isOverlaten(curFile, vs);
            case "toelaten" -> isToelaten(curFile, vs);
            case "vrijlaten" -> isVrijlaten(curFile, vs);
            case "laten" -> isLaten(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAchterlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-39.html#vs12")
                || isValidVerse(curFile, vs, "Gen-50.html#vs8")
                || isValidVerse(curFile, vs, "Deut-07.html#vs4")
                || isValidVerse(curFile, vs, "Josh-08.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-05.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs37")
                || isValidVerse(curFile, vs, "Job-39.html#vs17")
                || isValidVerse(curFile, vs, "Ps-141.html#vs8")
                || isValidVerse(curFile, vs, "Prov-10.html#vs17")
                || isValidVerse(curFile, vs, "Jer-39.html#vs10")
                || isValidVerse(curFile, vs, "Jer-49.html#vs11")
                || isValidVerse(curFile, vs, "Jer-52.html#vs16")
                || isValidVerse(curFile, vs, "Matt-04.html#vs20", 22)
                || isValidVerse(curFile, vs, "Matt-05.html#vs24")
                || isValidVerse(curFile, vs, "Matt-26.html#vs44")
                || isValidVerse(curFile, vs, "Mark-01.html#vs18", 20)
                || isValidVerse(curFile, vs, "Mark-04.html#vs36")
                || isValidVerse(curFile, vs, "Mark-14.html#vs52")
                || isValidVerse(curFile, vs, "Luke-05.html#vs11", 28)
                || isValidVerse(curFile, vs, "Acts-18.html#vs19")
                || isValidVerse(curFile, vs, "Acts-24.html#vs27");
    } // isAchterlaten

    public static boolean isInDeSteekLaten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in de steek laten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-12.html#vs19")
                || isValidVerse(curFile, vs, "Deut-14.html#vs27")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs57")
                || isValidVerse(curFile, vs, "Ps-027.html#vs9")
                || isValidVerse(curFile, vs, "Ps-038.html#vs11")
                || isValidVerse(curFile, vs, "Ps-094.html#vs14")
                || isValidVerse(curFile, vs, "Jer-12.html#vs7")
                || isValidVerse(curFile, vs, "Jer-14.html#vs5")
                || isValidVerse(curFile, vs, "Zech-11.html#vs17")
                || isValidVerse(curFile, vs, "John-10.html#vs12");
    } // isInDeSteekLaten

    public static boolean isInlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-20.html#vs19")
                || isValidVerse(curFile, vs, "Prov-22.html#vs24")
                || isValidVerse(curFile, vs, "Prov-24.html#vs21")
                || isValidVerse(curFile, vs, "Matt-27.html#vs19");
    } // isInlaten

    public static boolean isInLevenLaten(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in leven laten", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Gen-12.html#vs12")
                    || isValidVerse(curFile, vs, "Exod-01.html#vs17", 18, 22)
                    || isValidVerse(curFile, vs, "Exod-22.html#vs18")
                    || isValidVerse(curFile, vs, "Num-31.html#vs18")
                    || isValidVerse(curFile, vs, "Deut-20.html#vs16")
                    || isValidVerse(curFile, vs, "Josh-06.html#vs25")
                    || isValidVerse(curFile, vs, "Josh-09.html#vs20")
                    || isValidVerse(curFile, vs, "Judg-21.html#vs14")
                    || isValidVerse(curFile, vs, "1Sam-27.html#vs9", 11)
                    || isValidVerse(curFile, vs, "2Sam-08.html#vs2")
                    || isValidVerse(curFile, vs, "1Kgs-20.html#vs32")
                    || isValidVerse(curFile, vs, "Dan-05.html#vs19");
        }

        return false;
    } // isInLevenLaten

    public static boolean isLaat(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-11.html#vs14")
                || isValidVerse(curFile, vs, "Job-29.html#vs23")
                || isValidVerse(curFile, vs, "Ps-127.html#vs2")
                || isValidVerse(curFile, vs, "Prov-16.html#vs15")
                || isValidVerse(curFile, vs, "Jer-03.html#vs3")
                || isValidVerse(curFile, vs, "Jer-05.html#vs24")
                || isValidVerse(curFile, vs, "Jer-11.html#vs7")
                || isValidVerse(curFile, vs, "Jer-25.html#vs3", 4)
                || isValidVerse(curFile, vs, "Jer-26.html#vs5")
                || isValidVerse(curFile, vs, "Jer-29.html#vs19")
                || isValidVerse(curFile, vs, "Jer-32.html#vs33")
                || isValidVerse(curFile, vs, "Jer-35.html#vs14", 15)
                || isValidVerse(curFile, vs, "Jer-44.html#vs4")
                || isValidVerse(curFile, vs, "Hos-06.html#vs3")
                || isValidVerse(curFile, vs, "Joel-2.html#vs23")
                || isValidVerse(curFile, vs, "Zech-10.html#vs1")
                || isValidVerse(curFile, vs, "Matt-28.html#vs1")
                || isValidVerse(curFile, vs, "Mark-06.html#vs35")
                || isValidVerse(curFile, vs, "Mark-11.html#vs19")
                || isValidVerse(curFile, vs, "Mark-13.html#vs35")
                || isValidVerse(curFile, vs, "Jas-5.html#vs7")
                || isValidVerse(curFile, vs, "Jude-1.html#vs12");
    } // isLaat

    public static boolean isLoslaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-08.html#vs7", 8, 10, 12)
                || isValidVerse(curFile, vs, "Exod-22.html#vs5")
                || isValidVerse(curFile, vs, "Job-37.html#vs3")
                || isValidVerse(curFile, vs, "Ps-105.html#vs20")
                || isValidVerse(curFile, vs, "Ps-138.html#vs8")
                || isValidVerse(curFile, vs, "Prov-04.html#vs13")
                || isValidVerse(curFile, vs, "Song-3.html#vs4")
                || isValidVerse(curFile, vs, "Jer-50.html#vs33")
                || isValidVerse(curFile, vs, "Matt-27.html#vs15", 26)
                || isValidVerse(curFile, vs, "Mark-15.html#vs6", 15)
                || isValidVerse(curFile, vs, "Luke-06.html#vs37")
                || isValidVerse(curFile, vs, "Luke-23.html#vs17", 18, 25)
                || isValidVerse(curFile, vs, "John-19.html#vs10", 12)
                || isValidVerse(curFile, vs, "Acts-16.html#vs35");
    } // isLoslaten

    public static boolean isMetRustLaten(final File curFile, final String vs, @NotNull final String arg) {
        if (arg.equals("met rust laten")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Exod-04.html#vs26")
                || isValidVerse(curFile, vs, "Exod-14.html#vs12")
                || isValidVerse(curFile, vs, "Exod-23.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs3")
                || isValidVerse(curFile, vs, "Esth-03.html#vs8")
                || isValidVerse(curFile, vs, "Job-07.html#vs16")
                || isValidVerse(curFile, vs, "Jer-17.html#vs4")
                || isValidVerse(curFile, vs, "Jer-38.html#vs27")
                || isValidVerse(curFile, vs, "Hos-04.html#vs17")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs11", 12)
                || isValidVerse(curFile, vs, "Mark-14.html#vs6");
    } // isMetRustLaten

    public static boolean isNalaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-07.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs10")
                || isValidVerse(curFile, vs, "Ps-017.html#vs14")
                || isValidVerse(curFile, vs, "Ps-036.html#vs4")
                || isValidVerse(curFile, vs, "Zech-11.html#vs12")
                || isValidVerse(curFile, vs, "Matt-22.html#vs25")
                || isValidVerse(curFile, vs, "Matt-23.html#vs23")
                || isValidVerse(curFile, vs, "Mark-12.html#vs20", 21, 22)
                || isValidVerse(curFile, vs, "Luke-20.html#vs31")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs21");
    } // isNalaten

    public static boolean isNeerlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-02.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs12")
                || isValidVerse(curFile, vs, "Jer-38.html#vs6")
                || isValidVerse(curFile, vs, "Mark-02.html#vs4")
                || isValidVerse(curFile, vs, "Luke-05.html#vs19")
                || isValidVerse(curFile, vs, "Acts-09.html#vs25");
    } // isNeerlaten

    public static boolean isOpenlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-08.html#vs17");
    } // isOpenlaten

    public static boolean isOverlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-16.html#vs20")
                || isValidVerse(curFile, vs, "Josh-10.html#vs28", 37, 39, 40)
                || isValidVerse(curFile, vs, "Josh-11.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs14")
                || isValidVerse(curFile, vs, "Job-39.html#vs14");
    } // isOverlaten

    public static boolean isToelaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs6")
                || isValidVerse(curFile, vs, "Num-22.html#vs13")
                || isValidVerse(curFile, vs, "Judg-01.html#vs34")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs17")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs1")
                || isValidVerse(curFile, vs, "Job-09.html#vs18")
                || isValidVerse(curFile, vs, "Ps-016.html#vs10")
                || isValidVerse(curFile, vs, "Ps-105.html#vs14")
                || isValidVerse(curFile, vs, "Matt-03.html#vs15")
                || isValidVerse(curFile, vs, "Matt-07.html#vs4")
                || isValidVerse(curFile, vs, "Mark-01.html#vs34")
                || isValidVerse(curFile, vs, "Mark-05.html#vs37")
                || isValidVerse(curFile, vs, "Mark-07.html#vs12")
                || isValidVerse(curFile, vs, "Mark-11.html#vs16")
                || isValidVerse(curFile, vs, "Luke-04.html#vs41")
                || isValidVerse(curFile, vs, "Luke-06.html#vs42")
                || isValidVerse(curFile, vs, "Acts-16.html#vs7")
                || isValidVerse(curFile, vs, "Acts-19.html#vs30");
    } // isToelaten

    public static boolean isVrijlaten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-105.html#vs20");
    } // isVrijlaten

    private static boolean isLaten(final File curFile, final String vs, final String keyArg, final String arg) {
        return !isAchterlaten(curFile, vs)
                && !isInDeSteekLaten(curFile, vs, arg)
                && !isInLevenLaten(curFile, vs, keyArg, arg)
                && !isInlaten(curFile, vs)
                && !isLaat(curFile, vs)
                && !isLoslaten(curFile, vs)
                && !isMetRustLaten(curFile, vs, arg)
                && !isNalaten(curFile, vs)
                && !isNeerlaten(curFile, vs)
                && !isOpenlaten(curFile, vs)
                && !isOverlaten(curFile, vs)
                && !isToelaten(curFile, vs)
                && !isVrijlaten(curFile, vs);
    }  // isLaten

}
