package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDenken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitdenken" -> isUitdenken(curFile, vs);
            case "denken" -> isDenken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitdenken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-14.html#vs14");
    } // isUitdenken

    public static boolean isDenken(final File curFile, final String vs) {
        return !isUitdenken(curFile, vs);
    }  // isDenken

}
