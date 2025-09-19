package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBeslissen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "beslist" -> isBeslist(curFile, vs);
            case "beslissen" -> isBeslissen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBeslissen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-22.html#vs11")
                || isValidVerse(curFile, vs, "Mic-7.html#vs3")
                || isValidVerse(curFile, vs, "Luke-23.html#vs24")
                || isValidVerse(curFile, vs, "Acts-19.html#vs39");
    } // isBeslissen

    public static boolean isBeslist(final File curFile, final String vs) {
        return !isBeslissen(curFile, vs);
    }  // isBeslist

}
