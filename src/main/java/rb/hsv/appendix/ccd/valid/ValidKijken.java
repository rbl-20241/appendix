package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKijken {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aankijken" -> isAankijken(curFile, vs);
            case "nakijken" -> isNakijken(curFile, vs);
            case "neerkijken" -> isNeerkijken(curFile, vs);
            case "omkijken" -> isOmkijken(curFile, vs);
            case "om zich heen kijken" -> isOmZichHeenKijken(curFile, vs, keyArg, arg);
            case "opkijken" -> isOpkijken(curFile, vs);
            case "rondkijken" -> isRondkijken(curFile, vs);
            case "te kijk zetten" -> isTeKijkZetten(curFile, vs, keyArg, arg);
            case "toekijken" -> isToekijken(curFile, vs);
            case "uitkijk" -> isUitkijk(curFile, vs);
            case "uitkijken" -> isUitkijken(curFile, vs);
            case "kijken" -> isKijken(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAankijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-40.html#vs6")
                || isValidVerse(curFile, vs, "Gen-42.html#vs1")
                || isValidVerse(curFile, vs, "Exod-03.html#vs6")
                || isValidVerse(curFile, vs, "Exod-34.html#vs30")
                || isValidVerse(curFile, vs, "Isa-14.html#vs16")
                || isValidVerse(curFile, vs, "Matt-19.html#vs26")
                || isValidVerse(curFile, vs, "Mark-10.html#vs21", 27)
                || isValidVerse(curFile, vs, "Mark-14.html#vs67")
                || isValidVerse(curFile, vs, "Luke-20.html#vs17")
                || isValidVerse(curFile, vs, "Luke-22.html#vs61")
                || isValidVerse(curFile, vs, "John-01.html#vs43")
                || isValidVerse(curFile, vs, "John-13.html#vs22")
                || isValidVerse(curFile, vs, "Acts-03.html#vs4", 12)
                || isValidVerse(curFile, vs, "Acts-13.html#vs9")
                || isValidVerse(curFile, vs, "Acts-14.html#vs9");
    } // isAankijken

    public static boolean isNakijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-11.html#vs12");
    } // isNakijken

    public static boolean isNeerkijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-41.html#vs25")
                || isValidVerse(curFile, vs, "Ps-080.html#vs15")
                || isValidVerse(curFile, vs, "Isa-63.html#vs15");
    } // isNeerkijken

    public static boolean isOmkijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-22.html#vs13");
    } // isOmkijken

    public static boolean isOmZichHeenKijken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("om zich heen kijken", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Gen-29.html#vs2")
                    || isValidVerse(curFile, vs, "Exod-02.html#vs12")
                    || isValidVerse(curFile, vs, "Isa-49.html#vs18")
                    || isValidVerse(curFile, vs, "Isa-60.html#vs4")
                    || isValidVerse(curFile, vs, "Mark-05.html#vs32")
                    || isValidVerse(curFile, vs, "Mark-09.html#vs8");
        }

        return false;
    } // isOmZichHeenKijken

    public static boolean isOpkijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-19.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs21")
                || isValidVerse(curFile, vs, "Mark-06.html#vs41")
                || isValidVerse(curFile, vs, "Mark-08.html#vs24")
                || isValidVerse(curFile, vs, "Luke-09.html#vs16")
                || isValidVerse(curFile, vs, "Luke-19.html#vs5");
    } // isOpkijken

    public static boolean isRondkijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-63.html#vs5")
                || isValidVerse(curFile, vs, "Amos-6.html#vs2");
    } // isRondkijken

    public static boolean isTeKijkZetten(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("te kijk zetten", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Nah-3.html#vs6");
        }
        return false;
    } // isTeKijkZetten

    public static boolean isToekijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-03.html#vs2")
                || isValidVerse(curFile, vs, "Deut-09.html#vs16")
                || isValidVerse(curFile, vs, "Dan-02.html#vs31")
                || isValidVerse(curFile, vs, "Dan-04.html#vs10", 13)
                || isValidVerse(curFile, vs, "Dan-07.html#vs2", 4, 7, 9, 11, 13)
                || isValidVerse(curFile, vs, "Luke-23.html#vs35");
    } // isToekijken

    public static boolean isUitkijk(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-04.html#vs13");
    } // isUitkijk

    public static boolean isUitkijken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs28")
                || isValidVerse(curFile, vs, "Exod-10.html#vs10")
                || isValidVerse(curFile, vs, "Judg-05.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs42")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs43")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs2")
                || isValidVerse(curFile, vs, "Job-06.html#vs19")
                || isValidVerse(curFile, vs, "Job-08.html#vs17")
                || isValidVerse(curFile, vs, "Lam-4.html#vs17")
                || isValidVerse(curFile, vs, "Hab-2.html#vs1")
                || isValidVerse(curFile, vs, "Matt-09.html#vs30")
                || isValidVerse(curFile, vs, "Matt-16.html#vs6")
                || isValidVerse(curFile, vs, "Mark-08.html#vs15")
                || isValidVerse(curFile, vs, "Luke-12.html#vs15");
    } // isUitkijken

    public static boolean isKijken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAankijken(curFile, vs)
                && !isNakijken(curFile, vs)
                && !isNeerkijken(curFile, vs)
                && !isOmkijken(curFile, vs)
                && !isOmZichHeenKijken(curFile, vs, keyArg, arg)
                && !isOpkijken(curFile, vs)
                && !isRondkijken(curFile, vs)
                && !isTeKijkZetten(curFile, vs, keyArg, arg)
                && !isToekijken(curFile, vs)
                && !isUitkijk(curFile, vs)
                && !isUitkijken(curFile, vs);
    } // isKijken


}
