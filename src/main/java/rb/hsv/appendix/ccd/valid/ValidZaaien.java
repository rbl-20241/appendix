package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZaaien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "inzaaien" -> isInzaaien(curFile, vs);
            case "verderf zaaien" -> isVerderfZaaien(curFile, vs);
            case "zaaien" -> isZaaien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isInzaaien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-107.html#vs37");
    } // isInzaaien

    public static boolean isVerderfZaaien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-09.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-25.html#vs15");
    } // isVerderfZaaien

    public static boolean isZaaien(final File curFile, final String vs) {
        return !isInzaaien(curFile, vs)
                && !isVerderfZaaien(curFile, vs);
    } // isZaaien
}
