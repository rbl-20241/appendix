package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBevelen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanbevelen" -> isAanbevelen(curFile, vs);
            case "bevel" -> isBevel(curFile, vs);
            case "bevelen" -> !isBevel(curFile, vs)
                    && !isAanbevelen(curFile, vs);
            default -> true;
        };
    }

    private static boolean isBevel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-49.html#vs33")
                || isValidVerse(curFile, vs, "Deut-03.html#vs28")
                || isValidVerse(curFile, vs, "Deut-31.html#vs14")
                || isValidVerse(curFile, vs, "Ps-019.html#vs9")
                || isValidVerse(curFile, vs, "Ps-103.html#vs18")
                || isValidVerse(curFile, vs, "Ps-111.html#vs7")
                || isValidVerse(curFile, vs, "Ps-119.html#vs4", 15, 27, 40, 45, 56, 63, 69, 78, 87, 93, 94, 100, 104, 110, 128, 134, 141, 159, 168, 173)
                || isValidVerse(curFile, vs, "Isa-45.html#vs12")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs2");
    }

    private static boolean isAanbevelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-16.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs2")
                || isValidVerse(curFile, vs, "2Cor-05.html#vs12");
    }
}
