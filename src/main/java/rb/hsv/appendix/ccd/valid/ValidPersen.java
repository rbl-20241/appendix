package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPersen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afpersen" -> isAfpersen(curFile, vs);
            case "pers" -> isPers(curFile, vs);
            case "uitpersen" -> isUitpersen(curFile, vs);
            case "persen" -> isPersen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfpersen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-22.html#vs29")
                || isValidVerse(curFile, vs, "Hos-12.html#vs8")
                || isValidVerse(curFile, vs, "Luke-03.html#vs14");
    } // isAfpersen

    public static boolean isPers(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-63.html#vs3");
    } // isPers

    public static boolean isUitpersen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-40.html#vs11")
                || isValidVerse(curFile, vs, "Judg-06.html#vs38")
                || isValidVerse(curFile, vs, "Job-24.html#vs11")
                || isValidVerse(curFile, vs, "Isa-59.html#vs5");
    } // isUitpersen

    public static boolean isPersen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-16.html#vs10");
    }  // isPersen


}
