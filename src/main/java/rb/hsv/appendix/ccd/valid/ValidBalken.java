package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBalken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "balk" -> isBalk(curFile, vs);
            case "balken" -> isBalken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBalken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-06.html#vs5");
    } // isBalken

    public static boolean isBalk(final File curFile, final String vs) {
        return !isBalken(curFile, vs);
    }  // isBalk

}
