package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidUitbreiden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitgebreid" -> isUitgebreid(curFile, vs);
            case "uitbreiden" -> isUitbreiden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitgebreid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-04.html#vs19")
                || isValidVerse(curFile, vs, "Isa-08.html#vs8");
    } // isUitgebreid

    public static boolean isUitbreiden(final File curFile, final String vs) {
        return !isUitgebreid(curFile, vs);
    } // isUitbreiden
}
