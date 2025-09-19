package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_TOO_MUCH;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMeer {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "meer (wateroppervlak)" -> isMeer_Wateroppervlak(curFile, vs);
            case "meer" -> IS_TOO_MUCH;
            default -> true;
        };
    }

    public static boolean isMeer_Wateroppervlak(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-14.html#vs11")
                || isValidVerse(curFile, vs, "Luke-05.html#vs1", 2)
                || isValidVerse(curFile, vs, "Luke-08.html#vs22", 23, 33);
    }
}
