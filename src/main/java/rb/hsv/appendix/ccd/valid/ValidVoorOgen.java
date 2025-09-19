package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVoorOgen {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "voor ogen hebben" -> isVoorOgenHebben(curFile, vs, arg);
            case "voor ogen houden" -> isVoorOgenHouden(curFile, vs, arg);
            case "voor ogen komen" -> isVoorOgenKomen(curFile, vs, arg);
            case "voor ogen krijgen" -> isVoorOgenKrijgen(curFile, vs, arg);
            case "voor ogen schilderen" -> isVoorOgenSchilderen(curFile, vs, arg);
            case "voor ogen staan" -> isVoorOgenStaan(curFile, vs, arg);
            case "voor ogen stellen" -> isVoorOgenStellen(curFile, vs, arg);
            case "voor ogen zijn" -> isVoorOgenZijn(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isVoorOgenHebben(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("voor ogen hebben")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Prov-17.html#vs24")
                || isValidVerse(curFile, vs, "Heb-11.html#vs26");
    } // isVoorOgenHebben

    public static boolean isVoorOgenHouden(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen houden")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-22.html#vs23")
                || isValidVerse(curFile, vs, "Ps-018.html#vs23")
                || isValidVerse(curFile, vs, "Ps-026.html#vs3")
                || isValidVerse(curFile, vs, "Ps-050.html#vs8")
                || isValidVerse(curFile, vs, "Ps-054.html#vs5")
                || isValidVerse(curFile, vs, "Ps-086.html#vs14");
    } // isVoorOgenHouden

    public static boolean isVoorOgenKomen(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen komen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Dan-02.html#vs28")
                || isValidVerse(curFile, vs, "Dan-04.html#vs5", 10, 13)
                || isValidVerse(curFile, vs, "Dan-07.html#vs15");
    } // isVoorOgenKomen

    public static boolean isVoorOgenKrijgen(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen krijgen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Dan-07.html#vs1");
    } // isVoorOgenKrijgen

    public static boolean isVoorOgenSchilderen(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen schilderen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gal-3.html#vs1");
    } // isVoorOgenSchilderen

    public static boolean isVoorOgenStaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("voor ogen staan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-20.html#vs20")
                || isValidVerse(curFile, vs, "1Chr-28.html#vs12")
                || isValidVerse(curFile, vs, "Ps-036.html#vs2")
                || isValidVerse(curFile, vs, "Ps-051.html#vs5")
                || isValidVerse(curFile, vs, "Ps-109.html#vs15")
                || isValidVerse(curFile, vs, "Rom-03.html#vs18");
    } // isVoorOgenStaan

    public static boolean isVoorOgenStellen(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen stellen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Ps-016.html#vs8")
                || isValidVerse(curFile, vs, "Ps-101.html#vs3")
                || isValidVerse(curFile, vs, "Ps-119.html#vs30")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "");
    } // isVoorOgenStellen

    public static boolean isVoorOgenZijn(final File curFile, final String vs, final String arg) {
        if (arg.equals("voor ogen zijn")) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Sam-16.html#vs7")
                || isValidVerse(curFile, vs, "John-07.html#vs24");
    } // isVoorOgenZijn

}
