package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSchudden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afschudden" -> isAfschudden(curFile, vs);
            case "leegschudden" -> isLeegschudden(curFile, vs);
            case "uitschudden" -> isUitschudden(curFile, vs);
            case "schudden" -> isSchudden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfschudden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-33.html#vs9")
                || isValidVerse(curFile, vs, "Isa-52.html#vs2")
                || isValidVerse(curFile, vs, "Mark-06.html#vs11")
                || isValidVerse(curFile, vs, "Luke-09.html#vs5")
                || isValidVerse(curFile, vs, "Luke-10.html#vs11")
                || isValidVerse(curFile, vs, "Acts-13.html#vs51")
                || isValidVerse(curFile, vs, "Acts-28.html#vs5");
    } // isAfschudden

    public static boolean isLeegschudden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-13.html#vs9");
    } // isLeegschudden

    public static boolean isUitschudden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-05.html#vs13");
    } // isUitschudden

    public static boolean isSchudden(final File curFile, final String vs) {
        return !isAfschudden(curFile, vs)
                && !isLeegschudden(curFile, vs)
                && !isUitschudden(curFile, vs);
    }  // isSchudden

}
