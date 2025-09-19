package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSchuilen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "samenscholen" -> isSamenscholen(curFile, vs);
            case "school" -> isSchool(curFile, vs);
            case "schuil" -> isSchuil(curFile, vs);
            case "schuilgaan" -> isSchuilgaan(curFile, vs);
            case "schuilhouden" -> isSchuilhouden(curFile, vs);
            case "schuilen" -> isSchuilen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isSamenscholen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-056.html#vs7")
                || isValidVerse(curFile, vs, "Ps-059.html#vs4");
    } // isSamenscholen

    public static boolean isSchool(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-19.html#vs9");
    } // isSchool

    public static boolean isSchuil(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Hab-3.html#vs4");
    } // isSchuil

    public static boolean isSchuilgaan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Hab-3.html#vs4");
    } // isSchuilgaan

    public static boolean isSchuilhouden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-29.html#vs8");
    } // isSchuilhouden

    public static boolean isSchuilen(final File curFile, final String vs) {
        return !isSamenscholen(curFile, vs)
                && !isSchool(curFile, vs)
                && !isSchuil(curFile, vs)
                && !isSchuilgaan(curFile, vs)
                && !isSchuilhouden(curFile, vs);
    } // isSchuilen


}
