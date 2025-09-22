package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTekenen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aftekenen" -> isAftekenen(curFile, vs);
            case "optekenen" -> isOptekenen(curFile, vs);
            case "teken" -> isTeken(curFile, vs);
            case "tekenen" -> isTekenen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAftekenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-44.html#vs13");
    } // isAftekenen

    public static boolean isOptekenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-30.html#vs8");
    } // isOptekenen

    public static boolean isTekenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-34.html#vs7", 8)
                || isValidVerse(curFile, vs, "Ezek-04.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs19", 20)
                || isValidVerse(curFile, vs, "Ezek-23.html#vs14");
    } // isTekenen

    private static boolean isTeken(final File curFile, final String vs) {
        return !isAftekenen(curFile, vs)
                && !isOptekenen(curFile, vs)
                && !isTekenen(curFile, vs);
    }  // isTeken


}
