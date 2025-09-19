package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBlazen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opblazen" -> isOpblazen();
            case "uitblazen" -> isUitblazen(curFile, vs);
            case "wegblazen" -> isWegblazen(curFile, vs);
            case "blazen" -> isBlazen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpblazen() {
        return false;
    } // isOpblazen

    public static boolean isUitblazen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-15.html#vs9");
    } // isUitblazen

    public static boolean isWegblazen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-010.html#vs5")
                || isValidVerse(curFile, vs, "Ps-012.html#vs6");
    } // isWegblazen

    private static boolean isBlazen(final File curFile, final String vs) {
        return !isOpblazen()
                && !isUitblazen(curFile, vs)
                && !isWegblazen(curFile, vs);
    }  // isBlazen

}
