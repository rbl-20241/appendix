package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_TOO_MUCH;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHoren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanhoren" -> isAanhoren(curFile, vs);
            case "horen" -> IS_TOO_MUCH;
            default -> true;
        };
    }

    public static boolean isAanhoren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-04.html#vs23")
                || isValidVerse(curFile, vs, "Num-23.html#vs18")
                || isValidVerse(curFile, vs, "Deut-01.html#vs45")
                || isValidVerse(curFile, vs, "Deut-32.html#vs1")
                || isValidVerse(curFile, vs, "Judg-05.html#vs3")
                || isValidVerse(curFile, vs, "Job-33.html#vs1")
                || isValidVerse(curFile, vs, "Job-34.html#vs2")
                || isValidVerse(curFile, vs, "Job-37.html#vs14")
                || isValidVerse(curFile, vs, "Prov-17.html#vs4")
                || isValidVerse(curFile, vs, "Isa-51.html#vs4")
                || isValidVerse(curFile, vs, "Isa-62.html#vs11")
                || isValidVerse(curFile, vs, "Acts-22.html#vs22");
    } // isAanhoren

}
