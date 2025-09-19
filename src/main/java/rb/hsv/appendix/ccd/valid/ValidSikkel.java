package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSikkel {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "sikkel (gereedschap)" -> isGereedschap(curFile, vs);
            case "sikkel (gewicht)" -> !isGereedschap(curFile, vs);
            default -> true;
        };
    }

    private static boolean isGereedschap(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-16.html#vs9")
                || isValidVerse(curFile, vs, "Deut-23.html#vs25")
                || isValidVerse(curFile, vs, "Jer-50.html#vs16")
                || isValidVerse(curFile, vs, "Joel-3.html#vs13")
                || isValidVerse(curFile, vs, "Mark-04.html#vs29")
                || isValidVerse(curFile, vs, "Rev-14.html#vs14")
                || isValidVerse(curFile, vs, "Rev-14.html#vs15")
                || isValidVerse(curFile, vs, "Rev-14.html#vs16")
                || isValidVerse(curFile, vs, "Rev-14.html#vs17")
                || isValidVerse(curFile, vs, "Rev-14.html#vs18")
                || isValidVerse(curFile, vs, "Rev-14.html#vs18");
    }
}
