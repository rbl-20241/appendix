package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLezen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aflezen" -> isAflezen(curFile, vs);
            case "voorlezen" -> isVoorlezen(curFile, vs);
            case "lezen" -> isLezen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAflezen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-24.html#vs6");
    } // isAflezen

    public static boolean isVoorlezen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-24.html#vs7")
                || isValidVerse(curFile, vs, "Josh-08.html#vs34")
                || isValidVerse(curFile, vs, "2Kgs-22.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs18")
                || isValidVerse(curFile, vs, "Neh-08.html#vs4", 9, 19)
                || isValidVerse(curFile, vs, "Neh-09.html#vs3")
                || isValidVerse(curFile, vs, "Jer-29.html#vs29")
                || isValidVerse(curFile, vs, "Jer-36.html#vs8", 10, 15, 21);
    } // isVoorlezen

    private static boolean isLezen(final File curFile, final String vs) {
        return !isAflezen(curFile, vs)
                && !isVoorlezen(curFile, vs);
    }  // isLezen


}
