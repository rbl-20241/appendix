package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTillen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "omhoogtillen" -> isOmhoogtillen(curFile, vs);
            case "optillen" -> isOptillen(curFile, vs);
            case "til" -> isTil(curFile, vs);
            case "tillen" -> isTillen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOmhoogtillen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-13.html#vs26");
    } // isOmhoogtillen

    public static boolean isOptillen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-10.html#vs19")
                || isValidVerse(curFile, vs, "Zech-05.html#vs9");
    } // isOptillen

    public static boolean isTil(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-60.html#vs8");
    } // isTil

    public static boolean isTillen(final File curFile, final String vs) {
        return !isOmhoogtillen(curFile, vs)
                && !isOptillen(curFile, vs)
                && !isTil(curFile, vs);
    } // isTillen

}
