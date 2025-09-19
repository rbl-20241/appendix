package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVerlichten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "verlicht" -> isVerlicht(curFile, vs, arg);
            case "verlichten" -> isVerlichten(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isVerlicht(final File curFile, final String vs, final @NotNull String arg) {
        if (isEqual("verlichte", arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "Job-33.html#vs30")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs2")
                || isValidVerse(curFile, vs, "Matt-06.html#vs22")
                || isValidVerse(curFile, vs, "Heb-06.html#vs4")
                || isValidVerse(curFile, vs, "Heb-10.html#vs32")
                || isValidVerse(curFile, vs, "Rev-18.html#vs1");
    } // isVerlicht

    public static boolean isVerlichten(final File curFile, final String vs, final @NotNull String arg) {
        return !isVerlicht(curFile, vs, arg);
    } // isVerlichten
}
