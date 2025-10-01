package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTasten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aantasten" -> isAantasten(curFile, vs);
            case "rondtasten" -> isRondtasten(curFile, vs);
            case "tasten" -> isTasten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAantasten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Hab-3.html#vs16");
    } // isAantasten

    public static boolean isRondtasten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-05.html#vs14")
                || isValidVerse(curFile, vs, "Job-12.html#vs25");
    } // isRondtasten

    public static boolean isTasten(final File curFile, final String vs) {
        return !isAantasten(curFile, vs)
                && !isRondtasten(curFile, vs);
    }  // isTasten

}
