package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLijken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "lijk" -> isLijk(curFile, vs);
            case "lijken" -> isLijken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isLijk(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-14.html#vs19");
    } // isLijk

    public static boolean isLijken(final File curFile, final String vs) {
        return !isLijk(curFile, vs);
    } // isLijken
}
