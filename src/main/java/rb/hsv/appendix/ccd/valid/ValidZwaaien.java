package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZwaaien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "zwaai" -> isZwaai(curFile, vs);
            case "zwaaien" -> isZwaaien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isZwaai(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-19.html#vs5");
    } // isZwaai

    public static boolean isZwaaien(final File curFile, final String vs) {
        return !isZwaai(curFile, vs);
    }  // isZwaaien

}
