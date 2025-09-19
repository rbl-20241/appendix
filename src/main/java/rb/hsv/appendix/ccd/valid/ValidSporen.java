package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSporen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aansporen" -> isAansporen(curFile, vs);
            case "opsporen" -> isOpsporen(curFile, vs);
            case "spoor" -> isSpoor(curFile, vs);
            case "sporen" -> !isAansporen(curFile, vs)
                    && !isOpsporen(curFile, vs)
                    && !isSpoor(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAansporen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-18.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs2")
                || isValidVerse(curFile, vs, "Luke-15.html#vs28")
                || isValidVerse(curFile, vs, "Acts-02.html#vs40")
                || isValidVerse(curFile, vs, "Acts-07.html#vs26")
                || isValidVerse(curFile, vs, "Acts-11.html#vs23")
                || isValidVerse(curFile, vs, "Acts-13.html#vs43")
                || isValidVerse(curFile, vs, "Acts-14.html#vs22")
                || isValidVerse(curFile, vs, "Acts-27.html#vs33", 34)
                || isValidVerse(curFile, vs, "2Cor-09.html#vs5")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs12")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs1")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs2")
                || isValidVerse(curFile, vs, "Titus-2.html#vs6")
                || isValidVerse(curFile, vs, "Phlm-1.html#vs9");
    } // isAansporen

    public static boolean isOpsporen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-23.html#vs23");
    } // isOpsporen

    public static boolean isSpoor(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-06.html#vs12")
                || isValidVerse(curFile, vs, "Job-23.html#vs11")
                || isValidVerse(curFile, vs, "Ps-017.html#vs5")
                || isValidVerse(curFile, vs, "Ps-023.html#vs3")
                || isValidVerse(curFile, vs, "Prov-02.html#vs9", 15, 18)
                || isValidVerse(curFile, vs, "Prov-04.html#vs11", 26)
                || isValidVerse(curFile, vs, "Prov-05.html#vs6", 21)
                || isValidVerse(curFile, vs, "Prov-12.html#vs28")
                || isValidVerse(curFile, vs, "Song-1.html#vs8")
                || isValidVerse(curFile, vs, "Isa-26.html#vs7")
                || isValidVerse(curFile, vs, "Isa-59.html#vs8")
                || isValidVerse(curFile, vs, "Dan-02.html#vs35")
                || isValidVerse(curFile, vs, "Titus-3.html#vs11")
                || isValidVerse(curFile, vs, "Heb-12.html#vs13");
    } // isSpoor

}
