package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHakken {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afhakken" -> isAfhakken(curFile, vs);
            case "in stukken hakken" -> isInStukkenHakken(curFile, vs, keyArg, arg);
            case "omhakken" -> isOmhakken(curFile, vs);
            case "uithakken" -> isUithakken(curFile, vs);
            case "hakken" -> isHakken(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAfhakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-01.html#vs6")
                || isValidVerse(curFile, vs, "Judg-09.html#vs49")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs51")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs7", 12)
                || isValidVerse(curFile, vs, "2Sam-20.html#vs22")
                || isValidVerse(curFile, vs, "Matt-05.html#vs30")
                || isValidVerse(curFile, vs, "Matt-18.html#vs8")
                || isValidVerse(curFile, vs, "Mark-09.html#vs43", 45);
    } // isAfhakken

    public static boolean isInStukkenHakken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "1Sam-11.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs24");
    } // isInStukkenHakken

    public static boolean isOmhakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-19.html#vs5")
                || isValidVerse(curFile, vs, "Josh-17.html#vs15")
                || isValidVerse(curFile, vs, "Judg-06.html#vs25", 26)
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs1")
                || isValidVerse(curFile, vs, "Isa-14.html#vs8")
                || isValidVerse(curFile, vs, "Isa-37.html#vs24")
                || isValidVerse(curFile, vs, "Isa-44.html#vs14")
                || isValidVerse(curFile, vs, "Jer-06.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs12")
                || isValidVerse(curFile, vs, "Luke-13.html#vs7");
    } // isOmhakken

    public static boolean isUithakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-22.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs10")
                || isValidVerse(curFile, vs, "Job-28.html#vs4", 10)
                || isValidVerse(curFile, vs, "Isa-05.html#vs2")
                || isValidVerse(curFile, vs, "Isa-22.html#vs16")
                || isValidVerse(curFile, vs, "Jer-02.html#vs13")
                || isValidVerse(curFile, vs, "Jer-22.html#vs14");
    } // isUithakken

    public static boolean isHakken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAfhakken(curFile, vs)
                && !isInStukkenHakken(curFile, vs, keyArg, arg)
                && !isOmhakken(curFile, vs)
                && !isUithakken(curFile, vs);
    }  // isHakken

}
