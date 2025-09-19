package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidEnige {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "enig" -> !isHoeveelheid(curFile, vs);
            case "enige" -> isHoeveelheid(curFile, vs);
            default -> false;
        };
    }

    public static boolean isHoeveelheid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-22.html#vs2")
                || isValidVerse(curFile, vs, "Gen-22.html#vs12")
                || isValidVerse(curFile, vs, "Gen-22.html#vs16")
                || isValidVerse(curFile, vs, "Deut-12.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs13")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs11")
                || isValidVerse(curFile, vs, "Esth-04.html#vs13")
                || isValidVerse(curFile, vs, "Job-01.html#vs15")
                || isValidVerse(curFile, vs, "Job-01.html#vs16")
                || isValidVerse(curFile, vs, "Job-01.html#vs17")
                || isValidVerse(curFile, vs, "Job-01.html#vs19")
                || isValidVerse(curFile, vs, "Song-6.html#vs9")
                || isValidVerse(curFile, vs, "Zech-14.html#vs9")
                || isValidVerse(curFile, vs, "Luke-24.html#vs18")
                || isValidVerse(curFile, vs, "Rom-11.html#vs17");
    }
}
