package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRuilen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "in ruil voor" -> isInRuilVoor(curFile, vs);
            case "inruilen" -> isInruilen(curFile, vs);
            case "omruilen" -> isOmruilen();
            case "ruil" -> isRuil(curFile, vs);
            case "ruilen" -> isRuilen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isInRuilVoor(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-30.html#vs15")
                || isValidVerse(curFile, vs, "Gen-47.html#vs14", 16, 17, 19)
                || isValidVerse(curFile, vs, "Job-28.html#vs15");
    } // isInRuilVoor

    public static boolean isInruilen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-28.html#vs17")
                || isValidVerse(curFile, vs, "Ps-106.html#vs20");
    } // isInruilen

    public static boolean isOmruilen() {
        return false;
    } // isOmruilen

    public static boolean isRuil(final File curFile, final String vs) {
        return isInRuilVoor(curFile, vs)
                || isValidVerse(curFile, vs, "Ruth-4.html#vs7");
    } // isRuil

    public static boolean isRuilen(final File curFile, final String vs) {
        return !isInRuilVoor(curFile, vs)
                && !isInruilen(curFile, vs)
                && !isOmruilen()
                && !isRuil(curFile, vs);
    } // isRuilen
}
