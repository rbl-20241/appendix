package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStammen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afstammen" -> isAfstammen(curFile, vs);
            case "halve stam" -> isHalveStam(curFile, vs);
            case "stam (boomstam)" -> isBoomstam(curFile, vs);
            case "stam (volksstam)" -> isStam(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfstammen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-10.html#vs5", 32)
                || isValidVerse(curFile, vs, "Num-03.html#vs21", 33);
    } // isAfstammen

    public static boolean isBoomstam(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-080.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs6", 24)
                || isValidVerse(curFile, vs, "Ezek-31.html#vs3", 5, 10, 13, 14)
                || isValidVerse(curFile, vs, "Dan-04.html#vs15", 23, 26);
    } // isBoomstam

    public static boolean isHalveStam(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-32.html#vs33")
                || isValidVerse(curFile, vs, "Num-34.html#vs13", 14, 15)
                || isValidVerse(curFile, vs, "Deut-03.html#vs13")
                || isValidVerse(curFile, vs, "Deut-29.html#vs8")
                || isValidVerse(curFile, vs, "Josh-01.html#vs12")
                || isValidVerse(curFile, vs, "Josh-04.html#vs12")
                || isValidVerse(curFile, vs, "Josh-12.html#vs6")
                || isValidVerse(curFile, vs, "Josh-13.html#vs7",29)
                || isValidVerse(curFile, vs, "Josh-14.html#vs2", 3)
                || isValidVerse(curFile, vs, "Josh-18.html#vs7")
                || isValidVerse(curFile, vs, "Josh-21.html#vs5", 6, 25, 27)
                || isValidVerse(curFile, vs, "Josh-22.html#vs1", 9, 10, 11, 13, 15, 21)
                || isValidVerse(curFile, vs, "1Chr-05.html#vs18", 23, 26)
                || isValidVerse(curFile, vs, "1Chr-06.html#vs61", 70, 71)
                || isValidVerse(curFile, vs, "1Chr-12.html#vs31", 37)
                || isValidVerse(curFile, vs, "1Chr-26.html#vs32")
                || isValidVerse(curFile, vs, "1Chr-27.html#vs20");
    } // isHalveStam

    public static boolean isStam(final File curFile, final String vs) {
        return !isAfstammen(curFile, vs)
                && !isBoomstam(curFile, vs)
                && !isHalveStam(curFile, vs);
    } // isStam


}
