package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBetalen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "terugbetalen" -> isTerugbetalen(curFile, vs);
            case "uitbetalen" -> isUitbetalen(curFile, vs);
            case "betalen" -> isBetalen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isTerugbetalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-037.html#vs21");
    } // isTerugbetalen

    public static boolean isUitbetalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-12.html#vs11");
    } // isUitbetalen

    private static boolean isBetalen(final File curFile, final String vs) {
        return !isTerugbetalen(curFile, vs)
                && !isUitbetalen(curFile, vs);
    }  // isBetalen

}
