package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLeven {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        if (arg.equals("Leven")) {
            return is_Leven(curFile, vs);
        }

        return switch (keyArg) {
            case "naleven" -> isNaleven(curFile, vs);
            case "leven" -> isLeven(curFile, vs);
            default -> true;
        };
    }

    public static boolean is_Leven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "John-11.html#vs25")
                || isValidVerse(curFile, vs, "John-14.html#vs6");
    } // is_Leven

    public static boolean isNaleven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-23.html#vs6");
    } // isNaleven

    public static boolean isLeven(final File curFile, final String vs) {
        return !is_Leven(curFile, vs)
                && !isNaleven(curFile, vs);
    } // isLeven



}
