package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTeSchande {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "te schande maken" -> isTeSchandeMaken(curFile, vs, keyArg, arg);
            case "te schande worden" -> isTeSchandeWorden(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isTeSchandeMaken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual(keyArg, arg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-10.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs5")
                || isValidVerse(curFile, vs, "Ps-004.html#vs3")
                || isValidVerse(curFile, vs, "Ps-044.html#vs10")
                || isValidVerse(curFile, vs, "Ps-053.html#vs6")
                || isValidVerse(curFile, vs, "Ps-057.html#vs4")
                || isValidVerse(curFile, vs, "Prov-25.html#vs8")
                || isValidVerse(curFile, vs, "Prov-28.html#vs7")
                || isValidVerse(curFile, vs, "Jer-14.html#vs21")
                || isValidVerse(curFile, vs, "Mic-7.html#vs6")
                || isValidVerse(curFile, vs, "Nah-3.html#vs6")
                || isValidVerse(curFile, vs, "Matt-01.html#vs19")
                || isValidVerse(curFile, vs, "Col-2.html#vs15")
                || isValidVerse(curFile, vs, "Heb-06.html#vs6");
    } // isTeSchandeMaken

    public static boolean isTeSchandeWorden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual(keyArg, arg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Num-12.html#vs14")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs6")
                || isValidVerse(curFile, vs, "Ps-035.html#vs4")
                || isValidVerse(curFile, vs, "Ps-040.html#vs15")
                || isValidVerse(curFile, vs, "Ps-069.html#vs7")
                || isValidVerse(curFile, vs, "Ps-070.html#vs3")
                || isValidVerse(curFile, vs, "Isa-41.html#vs11")
                || isValidVerse(curFile, vs, "Isa-45.html#vs16",17)
                || isValidVerse(curFile, vs, "Isa-45.html#vs16")
                || isValidVerse(curFile, vs, "Isa-54.html#vs4")
                || isValidVerse(curFile, vs, "Jer-14.html#vs3")
                || isValidVerse(curFile, vs, "Jer-22.html#vs22")
                || isValidVerse(curFile, vs, "Jer-31.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs27", 54, 61)
                || isValidVerse(curFile, vs, "Ezek-36.html#vs32");
    } // isTeSchandeWorden

}
