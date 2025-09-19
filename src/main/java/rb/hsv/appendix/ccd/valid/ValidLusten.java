package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLusten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "lust" -> isLust(curFile, vs);
            case "lusten" -> isLusten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isLust(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-03.html#vs6")
                || isValidVerse(curFile, vs, "Isa-57.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs16", 21, 25)
                || isValidVerse(curFile, vs, "1Tim-5.html#vs6", 11)
                || isValidVerse(curFile, vs, "Jas-5.html#vs5")
                || isValidVerse(curFile, vs, "Didache-01.html#vs4");
    } // isLust

    private static boolean isLusten(final File curFile, final String vs) {
        return !isLust(curFile, vs);
    }  // isLusten

}
