package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidReiken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanreiken" -> isAanreiken(curFile, vs);
            case "reiken" -> isReiken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanreiken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-09.html#vs12", 13, 18)
                || isValidVerse(curFile, vs, "Ruth-2.html#vs14");
    } // isAanreiken

    public static boolean isReiken(final File curFile, final String vs) {
        return !isAanreiken(curFile, vs);
    }  // isReiken

}
