package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBinden {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanbinden" -> isAanbinden(curFile, vs);
            case "ombinden" -> isOmbinden(curFile, vs);
            case "samenbinden" -> isSamenbinden(curFile, vs);
            case "vastbinden" -> isVastbinden(curFile, vs);
            case "binden" -> !isAanbinden(curFile, vs)
                    && !isOmbinden(curFile, vs)
                    && !isSamenbinden(curFile, vs)
                    && !isVastbinden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanbinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-17.html#vs8")
                || isValidVerse(curFile, vs, "Exod-17.html#vs9")
                || isValidVerse(curFile, vs, "Exod-17.html#vs10")
                || isValidVerse(curFile, vs, "Num-21.html#vs1")
                || isValidVerse(curFile, vs, "Num-21.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs13")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs3")
                || isValidVerse(curFile, vs, "Jer-46.html#vs3")
                || isValidVerse(curFile, vs, "Acts-12.html#vs8");
    }

    public static boolean isOmbinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs28")
                || isValidVerse(curFile, vs, "Lev-08.html#vs7")
                || isValidVerse(curFile, vs, "Lev-08.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs32")
                || isValidVerse(curFile, vs, "Job-12.html#vs18")
                || isValidVerse(curFile, vs, "Prov-03.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs17");
    }

    public static boolean isSamenbinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-23.html#vs4");
    }

    public static boolean isVastbinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-15.html#vs13")
                || isValidVerse(curFile, vs, "Judg-16.html#vs5")
                || isValidVerse(curFile, vs, "Judg-16.html#vs8")
                || isValidVerse(curFile, vs, "Judg-16.html#vs11")
                || isValidVerse(curFile, vs, "Judg-16.html#vs12")
                || isValidVerse(curFile, vs, "Ps-118.html#vs27");
    }
}
