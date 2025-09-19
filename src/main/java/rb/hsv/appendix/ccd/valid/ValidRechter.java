package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRechter {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "rechterhand" -> isRechterhand(curFile, vs);
            case "rechterzijde" -> isRechterzijde(curFile, vs);
            case "rechterkant" -> isRechterkant(curFile, vs);
            default -> false;
        };
    }

    public static boolean isRechterhand(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-12.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs6")
                || isValidVerse(curFile, vs, "Dan-12.html#vs7")
                || isValidVerse(curFile, vs, "Exod-14.html#vs22", 29)
                || isValidVerse(curFile, vs, "Jonah-4.html#vs11")
                || isValidVerse(curFile, vs, "Matt-20.html#vs21", 23)
                || isValidVerse(curFile, vs, "Mark-10.html#vs37", 40);
    } // isRechterhand

    public static boolean isRechterzijde(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-22.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs18")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs7")
                || isValidVerse(curFile, vs, "Luke-23.html#vs33")
                || isValidVerse(curFile, vs, "Matt-27.html#vs38")
                || isValidVerse(curFile, vs, "Mark-15.html#vs27");
    } // isRechterzijde

    public static boolean isRechterkant(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-03.html#vs17");
    } // isRechterkant
}
