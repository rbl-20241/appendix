package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidScheiden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afscheid" -> isAfscheid(curFile, vs);
            case "afscheiden" -> isAfscheiden(curFile, vs);
            case "vaneenscheiden" -> isVaneenscheiden();
            case "scheiden" -> isScheiden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfscheid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mark-06.html#vs46")
                || isValidVerse(curFile, vs, "Luke-09.html#vs61")
                || isValidVerse(curFile, vs, "Acts-15.html#vs30")
                || isValidVerse(curFile, vs, "Acts-18.html#vs18", 21)
                || isValidVerse(curFile, vs, "2Cor-02.html#vs13");
    } // isAfscheid

    public static boolean isAfscheiden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs9")
                || isValidVerse(curFile, vs, "Gen-30.html#vs40")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs8");
    } // isAfscheiden

    public static boolean isVaneenscheiden() {
        return IS_NOT_FOUND;
    } // isVaneenscheiden

    public static boolean isScheiden(final File curFile, final String vs) {
        return !isAfscheid(curFile, vs)
                && !isAfscheiden(curFile, vs)
                && !isVaneenscheiden();
    } // isScheiden


}
