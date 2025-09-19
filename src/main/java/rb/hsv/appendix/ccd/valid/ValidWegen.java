package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWegen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afwegen" -> isAfwegen(curFile, vs);
            case "gebaande weg" -> isGebaandeWeg(curFile, vs, arg);
            case "opwegen" -> isOpwegen();
            case "wegen" -> isWegen(curFile, vs, arg);
            case "weg" -> isWeg(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isAfwegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-23.html#vs16")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs25", 26)
                || isValidVerse(curFile, vs, "Ps-058.html#vs3")
                || isValidVerse(curFile, vs, "Isa-55.html#vs2")
                || isValidVerse(curFile, vs, "Jer-32.html#vs9");
    } // isAfwegen

    public static boolean isGebaandeWeg(final File curFile, final String vs, final String arg) {
        if (arg.equals("gebaande weg")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-22.html#vs33")
                || isValidVerse(curFile, vs, "Job-19.html#vs12")
                || isValidVerse(curFile, vs, "Ps-084.html#vs6")
                || isValidVerse(curFile, vs, "Prov-03.html#vs20")
                || isValidVerse(curFile, vs, "Prov-16.html#vs17")
                || isValidVerse(curFile, vs, "Isa-11.html#vs16")
                || isValidVerse(curFile, vs, "Isa-19.html#vs23")
                || isValidVerse(curFile, vs, "Isa-33.html#vs8")
                || isValidVerse(curFile, vs, "Isa-40.html#vs3")
                || isValidVerse(curFile, vs, "Isa-49.html#vs11")
                || isValidVerse(curFile, vs, "Isa-59.html#vs7")
                || isValidVerse(curFile, vs, "Isa-62.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs21");
    } // isGebaandeWeg

    public static boolean isOpwegen() {
        return false;
    } // isOpwegen

    public static boolean isWegen(final File curFile, final String vs, final String arg) {
        return isValidVerse(curFile, vs, "Num-07.html#vs85", 86)
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs16")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs3", 14)
                || isValidVerse(curFile, vs, "Ezra-08.html#vs25", 26)
                || isValidVerse(curFile, vs, "Job-06.html#vs2")
                || isValidVerse(curFile, vs, "Ps-062.html#vs10")
                || isValidVerse(curFile, vs, "Prov-05.html#vs21", arg, "weegt")
                || isValidVerse(curFile, vs, "Prov-27.html#vs3")
                || isValidVerse(curFile, vs, "Isa-40.html#vs12")
                || isValidVerse(curFile, vs, "Isa-46.html#vs6")
                || isValidVerse(curFile, vs, "Jer-52.html#vs20")
                || isValidVerse(curFile, vs, "Dan-05.html#vs27");
    } // isWegen

    private static boolean isWeg(final File curFile, final String vs, final String arg) {
        return !isAfwegen(curFile, vs)
                && !isGebaandeWeg(curFile, vs, arg)
                && !isOpwegen()
                && !isWegen(curFile, vs, arg);
    }  // isWeg

}
