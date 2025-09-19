package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWekken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opwekken" -> isOpwekken(curFile, vs);
            case "wekken" -> isWekken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpwekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-05.html#vs26")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs22")
                || isValidVerse(curFile, vs, "Ezra-01.html#vs1")
                || isValidVerse(curFile, vs, "Ps-078.html#vs38")
                || isValidVerse(curFile, vs, "Ps-080.html#vs3")
                || isValidVerse(curFile, vs, "Prov-10.html#vs12")
                || isValidVerse(curFile, vs, "Prov-15.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs8")
                || isValidVerse(curFile, vs, "Joel-3.html#vs7", 9)
                || isValidVerse(curFile, vs, "Hag-1.html#vs14")
                || isValidVerse(curFile, vs, "Matt-10.html#vs8")
                || isValidVerse(curFile, vs, "John-11.html#vs11")
                || isValidVerse(curFile, vs, "Rom-13.html#vs14")
                || isValidVerse(curFile, vs, "Eph-6.html#vs4")
                || isValidVerse(curFile, vs, "Heb-11.html#vs18")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs13")
                || isValidVerse(curFile, vs, "2Pet-3.html#vs1")
                || isValidVerse(curFile, vs, "Didache-02.html#vs2");
    } // isOpwekken

    public static boolean isWekken(final File curFile, final String vs) {
        return !isOpwekken(curFile, vs);
    } // isWekken
}
