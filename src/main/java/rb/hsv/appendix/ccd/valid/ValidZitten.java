package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_TOO_MUCH;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZitten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanzitten" -> isAanzitten(curFile, vs);
            case "gevangenzitten" -> isGevangenzitten(curFile, vs);
            case "vastzitten" -> isVastzitten(curFile, vs);
            case "zitten" -> IS_TOO_MUCH;
            default -> true;
        };
    }

    public static boolean isAanzitten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-16.html#vs8");
    } // isAanzitten

    public static boolean isGevangenzitten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Song-7.html#vs5");
    } // isGevangenzitten

    public static boolean isVastzitten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-18.html#vs9");
    } // isVastzitten

}
