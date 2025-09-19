package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZeggen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanzeggen" -> isAanzeggen(curFile, vs);
            case "dankzeggen" -> isDankzeggen(curFile, vs);
            case "toezeggen" -> isToezeggen(curFile, vs);
            case "waarzeggen" -> isWaarzeggen();
            case "zeggen" -> isZeggen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanzeggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-03.html#vs4");
    } // isAanzeggen

    public static boolean isDankzeggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Didache-14.html#vs1");
    } // isDankzeggen

    public static boolean isToezeggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-11.html#vs18");
    } // isToezeggen

    public static boolean isWaarzeggen() {
        return false;
    } // isWaarzeggen

    private static boolean isZeggen(final File curFile, final String vs) {
        return !isAanzeggen(curFile, vs)
                && !isDankzeggen(curFile, vs)
                && !isToezeggen(curFile, vs)
                && !isWaarzeggen();
    }  // isZeggen

}
