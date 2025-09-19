package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSchorten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opschorten" -> isOpschorten(curFile, vs);
            case "schort" -> isSchort(curFile, vs);
            case "schorten" -> isSchorten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpschorten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-47.html#vs2");
    } // isOpschorten

    public static boolean isSchort(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-03.html#vs7");
    } // isSchort

    private static boolean isSchorten(final File curFile, final String vs) {
        return !isOpschorten(curFile, vs)
                && !isSchort(curFile, vs);
    }  // isSchorten

}
