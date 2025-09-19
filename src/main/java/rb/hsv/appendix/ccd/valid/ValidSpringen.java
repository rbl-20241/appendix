package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSpringen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opspringen" -> isOpspringen(curFile, vs);
            case "sprong" -> isSprong(curFile, vs);
            case "springen" -> isSpringen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpspringen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-21.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs20")
                || isValidVerse(curFile, vs, "Job-37.html#vs1")
                || isValidVerse(curFile, vs, "Ps-028.html#vs7")
                || isValidVerse(curFile, vs, "Ps-068.html#vs4", 5)
                || isValidVerse(curFile, vs, "Ps-114.html#vs4")
                || isValidVerse(curFile, vs, "Prov-11.html#vs10")
                || isValidVerse(curFile, vs, "Jer-11.html#vs15")
                || isValidVerse(curFile, vs, "Jer-15.html#vs17")
                || isValidVerse(curFile, vs, "Amos-3.html#vs5")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs14")
                || isValidVerse(curFile, vs, "Luke-01.html#vs44")
                || isValidVerse(curFile, vs, "Luke-06.html#vs23")
                || isValidVerse(curFile, vs, "Acts-14.html#vs10");
    } // isOpspringen

    public static boolean isSprong(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-03.html#vs8");
    } // isSprong

    public static boolean isSpringen(final File curFile, final String vs) {
        return !isOpspringen(curFile, vs)
                && !isSprong(curFile, vs);
    } // isSpringen


}
