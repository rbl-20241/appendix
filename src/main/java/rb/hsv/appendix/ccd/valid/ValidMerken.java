package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMerken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opmerken" -> isOpmerken(curFile, vs);
            case "merken" -> isMerken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpmerken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-14.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs33")
                || isValidVerse(curFile, vs, "Job-09.html#vs11")
                || isValidVerse(curFile, vs, "Job-10.html#vs14")
                || isValidVerse(curFile, vs, "Job-23.html#vs8", 15)
                || isValidVerse(curFile, vs, "Prov-07.html#vs7")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs21")
                || isValidVerse(curFile, vs, "Isa-42.html#vs25")
                || isValidVerse(curFile, vs, "Dan-09.html#vs2")
                || isValidVerse(curFile, vs, "Matt-07.html#vs3")
                || isValidVerse(curFile, vs, "Luke-06.html#vs41")
                || isValidVerse(curFile, vs, "Heb-07.html#vs4");
    } // isOpmerken

    public static boolean isMerken(final File curFile, final String vs) {
        return !isOpmerken(curFile, vs);
    } // isMerken

}
