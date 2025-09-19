package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBezorgen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bezorgd" -> isBezorgd(curFile, vs);
            case "bezorgen" -> isBezorgen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBezorgd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-09.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs2")
                || isValidVerse(curFile, vs, "Jer-42.html#vs16")
                || isValidVerse(curFile, vs, "Matt-06.html#vs25", 27, 28, 31, 34)
                || isValidVerse(curFile, vs, "Matt-10.html#vs19")
                || isValidVerse(curFile, vs, "Mark-13.html#vs11")
                || isValidVerse(curFile, vs, "Luke-10.html#vs41")
                || isValidVerse(curFile, vs, "Luke-12.html#vs11", 22, 25, 26)
                || isValidVerse(curFile, vs, "Phil-4.html#vs6");
    } // isBezorgd

    public static boolean isBezorgen(final File curFile, final String vs) {
        return !isBezorgd(curFile, vs);
    }  // isBezorgen

}
