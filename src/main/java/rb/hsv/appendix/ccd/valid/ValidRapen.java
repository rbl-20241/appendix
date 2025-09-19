package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRapen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bijeenrapen" -> isBijeenrapen(curFile, vs);
            case "oprapen" -> isOprapen(curFile, vs);
            case "rapen" -> isRapen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBijeenrapen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-10.html#vs14");
    } // isBijeenrapen

    public static boolean isOprapen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-01.html#vs7")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs16", 17)
                || isValidVerse(curFile, vs, "1Sam-20.html#vs21", 38)
                || isValidVerse(curFile, vs, "Matt-14.html#vs20")
                || isValidVerse(curFile, vs, "Matt-15.html#vs37")
                || isValidVerse(curFile, vs, "Mark-06.html#vs43")
                || isValidVerse(curFile, vs, "Mark-08.html#vs8");
    } // isOprapen

    public static boolean isRapen(final File curFile, final String vs) {
        return (!isBijeenrapen(curFile, vs)
                && !isOprapen(curFile, vs))
                || isValidVerse(curFile, vs, "Ruth-2.html#vs17")
                ;
    } // isRapen


}
