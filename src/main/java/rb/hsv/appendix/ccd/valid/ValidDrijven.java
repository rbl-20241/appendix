package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDrijven {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aandrijven" -> isAandrijven(curFile, vs);
            case "bij elkaar drijven" -> isBijElkaarDrijven(curFile, vs, keyArg, arg);
            case "bijeendrijven" -> isBijeendrijven();
            case "gedreven" -> isGedreven(curFile, vs);
            case "handeldrijven" -> isHandeldrijven(curFile, vs);
            case "in het nauw drijven" -> isInHetNauwDrijven(curFile, vs, keyArg, arg);
            case "spot drijven" -> isSpotDrijven(curFile, vs);
            case "terugdrijven" -> isTerugdrijven(curFile, vs);
            case "uitdrijven" -> isUitdrijven(curFile, vs);
            case "uiteendrijven" -> isUiteendrijven(curFile, vs);
            case "wegdrijven" -> isWegdrijven(curFile, vs);
            case "drijven" -> isDrijven(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAandrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-04.html#vs24");
    } // isAandrijven

    public static boolean isBijElkaarDrijven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("bij elkaar drijven", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Gen-29.html#vs3", 7, 8);
        }
        return false;
    } // isBijElkaarDrijven

    public static boolean isBijeendrijven() {
        return IS_NOT_FOUND;
    } // isBijeendrijven

    public static boolean isGedreven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-25.html#vs18", 31, 36)
                || isValidVerse(curFile, vs, "Exod-37.html#vs7", 17, 22)
                || isValidVerse(curFile, vs, "Num-08.html#vs4")
                || isValidVerse(curFile, vs, "Num-10.html#vs2")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs16", 17)
                || isValidVerse(curFile, vs, "2Chr-09.html#vs15", 16);
    } // isGedreven

    public static boolean isHandeldrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-27.html#vs9", 15, 23, 27);
    } // isHandeldrijven

    public static boolean isInHetNauwDrijven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in het nauw drijven", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "1Sam-13.html#vs6")
                    || isValidVerse(curFile, vs, "2Chr-28.html#vs20", 22)
                    || isValidVerse(curFile, vs, "Isa-03.html#vs5")
                    || isValidVerse(curFile, vs, "Isa-11.html#vs13")
                    || isValidVerse(curFile, vs, "Isa-29.html#vs2", 7)
                    || isValidVerse(curFile, vs, "Amos-5.html#vs12");
        }

        return false;
    } // isInHetNauwDrijven

    public static boolean isSpotDrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-39.html#vs14", 17)
                || isValidVerse(curFile, vs, "Num-22.html#vs29")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs23")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs4")
                || isValidVerse(curFile, vs, "Jer-38.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs31")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs5")
                || isValidVerse(curFile, vs, "Hab-1.html#vs10");
    } // isSpotDrijven

    public static boolean isTerugdrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-22.html#vs23");
    } // isTerugdrijven

    public static boolean isUitdrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-39.html#vs6")
                || isValidVerse(curFile, vs, "Matt-08.html#vs16")
                || isValidVerse(curFile, vs, "Matt-09.html#vs34")
                || isValidVerse(curFile, vs, "Matt-10.html#vs1", 8)
                || isValidVerse(curFile, vs, "Matt-12.html#vs24", 27)
                || isValidVerse(curFile, vs, "Mark-01.html#vs12", 34, 39)
                || isValidVerse(curFile, vs, "Mark-03.html#vs15", 22)
                || isValidVerse(curFile, vs, "Mark-06.html#vs13")
                || isValidVerse(curFile, vs, "Mark-07.html#vs26")
                || isValidVerse(curFile, vs, "Luke-04.html#vs29")
                || isValidVerse(curFile, vs, "Luke-09.html#vs40")
                || isValidVerse(curFile, vs, "Luke-11.html#vs14", 15, 19)
                || isValidVerse(curFile, vs, "Luke-13.html#vs32")
                || isValidVerse(curFile, vs, "Luke-19.html#vs45")
                || isValidVerse(curFile, vs, "John-02.html#vs15")
                || isValidVerse(curFile, vs, "1John-4.html#vs18");
    } // isUitdrijven

    public static boolean isUiteendrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1John-4.html#vs18")
                || isValidVerse(curFile, vs, "Matt-12.html#vs30")
                || isValidVerse(curFile, vs, "Luke-11.html#vs23")
                || isValidVerse(curFile, vs, "John-10.html#vs12");
    } // isUiteendrijven

    public static boolean isWegdrijven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-10.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs5")
                || isValidVerse(curFile, vs, "Job-24.html#vs3")
                || isValidVerse(curFile, vs, "Ps-018.html#vs13")
                || isValidVerse(curFile, vs, "Acts-27.html#vs15");
    } // isWegdrijven

    public static boolean isDrijven(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAandrijven(curFile, vs)
                && !isBijElkaarDrijven(curFile, vs, keyArg, arg)
                && !isBijeendrijven()
                && !isGedreven(curFile, vs)
                && !isHandeldrijven(curFile, vs)
                && !isInHetNauwDrijven(curFile, vs, keyArg, arg)
                && !isSpotDrijven(curFile, vs)
                && !isUitdrijven(curFile, vs)
                && !isUiteendrijven(curFile, vs)
                && !isWegdrijven(curFile, vs);
    } // isDrijven


}
