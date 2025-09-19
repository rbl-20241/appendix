package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKlimmen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "binnenklimmen" -> isBinnenklimmen(curFile, vs);
            case "opklimmen" -> isOpklimmen(curFile, vs);
            case "klimmen" -> isKlimmen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBinnenklimmen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-10.html#vs1");
    } // isBinnenklimmen

    public static boolean isOpklimmen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-19.html#vs24")
                || isValidVerse(curFile, vs, "Josh-04.html#vs17")
                || isValidVerse(curFile, vs, "Job-20.html#vs6")
                || isValidVerse(curFile, vs, "Isa-57.html#vs7")
                || isValidVerse(curFile, vs, "Jer-51.html#vs53");
    } // isOpklimmen

    public static boolean isKlimmen(final File curFile, final String vs) {
        return !isBinnenklimmen(curFile, vs)
                && !isOpklimmen(curFile, vs);
    } // isKlimmen


}
