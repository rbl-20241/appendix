package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVrede {

    public static boolean isValid(final @NotNull String arg, final File curFile, final String vs) {
        return switch (arg) {
            case "Vrede" -> isVrede_Persoon(curFile, vs);
            case "vrede" -> isVrede(curFile, vs);
            default -> true;
        };
    }

    public static boolean isVrede_Persoon(final File curFile, final String vs) {

        return isValidVerse(curFile, vs, "Mic-5.html#vs4");
    } // isVrede_Persoon

    public static boolean isVrede(final File curFile, final String vs) {
        return !isVrede_Persoon(curFile, vs);
    } // isVrede

}
