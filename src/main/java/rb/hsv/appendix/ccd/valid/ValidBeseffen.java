package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBeseffen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "besef" -> isBesef(curFile, vs);
            case "beseffen" -> isBeseffen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBesef(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-01.html#vs9")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs23");
    } // isBesef

    public static boolean isBeseffen(final File curFile, final String vs) {
        return !isBesef(curFile, vs);
    } // isBeseffen


}
