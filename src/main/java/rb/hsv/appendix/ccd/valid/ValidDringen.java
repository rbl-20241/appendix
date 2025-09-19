package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDringen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aandringen" -> isAandringen(curFile, vs);
            case "binnendringen" -> isBinnendringen(curFile, vs);
            case "doordringen" -> isDoordringen(curFile, vs);
            case "terugdringen" -> isTerugdringen(curFile, vs);
            case "dringen" -> isDringen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAandringen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs3", 9, 15)
                || isValidVerse(curFile, vs, "Gen-33.html#vs11")
                || isValidVerse(curFile, vs, "Exod-12.html#vs33")
                || isValidVerse(curFile, vs, "Judg-19.html#vs4", 7)
                || isValidVerse(curFile, vs, "Ruth-1.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs16", 23)
                || isValidVerse(curFile, vs, "Prov-06.html#vs3")
                || isValidVerse(curFile, vs, "Isa-22.html#vs4")
                || isValidVerse(curFile, vs, "Jer-07.html#vs16")
                || isValidVerse(curFile, vs, "Luke-23.html#vs5", 23)
                || isValidVerse(curFile, vs, "Luke-24.html#vs29")
                || isValidVerse(curFile, vs, "Acts-13.html#vs42")
                || isValidVerse(curFile, vs, "Acts-16.html#vs15");
    } // isAandringen

    public static boolean isBinnendringen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-03.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs23");
    } // isBinnendringen

    public static boolean isDoordringen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-24.html#vs16")
                || isValidVerse(curFile, vs, "Isa-08.html#vs8")
                || isValidVerse(curFile, vs, "Amos-9.html#vs2")
                || isValidVerse(curFile, vs, "Heb-04.html#vs12");
    } // isDoordringen

    public static boolean isTerugdringen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-11.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs32");
    } // isTerugdringen

    public static boolean isDringen(final File curFile, final String vs) {
        return !isAandringen(curFile, vs)
                && !isBinnendringen(curFile, vs)
                && !isDoordringen(curFile, vs)
                && !isTerugdringen(curFile, vs);
    } // isDringen

}
