package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidJagen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanjagen" -> isAanjagen(curFile, vs);
            case "najagen" -> isNajagen(curFile, vs);
            case "opjagen" -> isOpjagen();
            case "voortjagen" -> isVoortjagen(curFile, vs);
            case "wegjagen" -> isWegjagen(curFile, vs);
            case "jagen" -> !isAanjagen(curFile, vs)
                    && !isNajagen(curFile, vs)
                    && !isOpjagen()
                    && !isVoortjagen(curFile, vs)
                    && !isWegjagen(curFile, vs);
            default -> true;
        };
    }

    private static boolean isAanjagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-08.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs14", 15)
                || isValidVerse(curFile, vs, "2Sam-22.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs18")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs4")
                || isValidVerse(curFile, vs, "Job-04.html#vs14")
                || isValidVerse(curFile, vs, "Job-07.html#vs14")
                || isValidVerse(curFile, vs, "Job-13.html#vs11")
                || isValidVerse(curFile, vs, "Job-18.html#vs11")
                || isValidVerse(curFile, vs, "Job-31.html#vs23")
                || isValidVerse(curFile, vs, "Ps-009.html#vs21")
                || isValidVerse(curFile, vs, "Ps-018.html#vs5")
                || isValidVerse(curFile, vs, "Ps-083.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs9")
                || isValidVerse(curFile, vs, "Zech-01.html#vs21");
    }

    private static boolean isNajagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-04.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs20")
                || isValidVerse(curFile, vs, "Ps-034.html#vs15")
                || isValidVerse(curFile, vs, "Ps-071.html#vs11")
                || isValidVerse(curFile, vs, "Isa-01.html#vs23")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs1")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs15")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs11")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs22")
                || isValidVerse(curFile, vs, "Heb-12.html#vs14");
    }

    private static boolean isOpjagen() {
        return false;
    }

    private static boolean isVoortjagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-18.html#vs11");
    }

    private static boolean isWegjagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs11")
                || isValidVerse(curFile, vs, "Gen-21.html#vs10")
                || isValidVerse(curFile, vs, "Exod-02.html#vs17")
                || isValidVerse(curFile, vs, "Judg-11.html#vs2")
                || isValidVerse(curFile, vs, "Neh-13.html#vs28")
                || isValidVerse(curFile, vs, "Acts-18.html#vs16")
                || isValidVerse(curFile, vs, "Gal-4.html#vs30");
    }
}
