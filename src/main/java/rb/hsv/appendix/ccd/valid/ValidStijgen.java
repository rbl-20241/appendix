package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStijgen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "omhoog stijgen" -> isOmhoogStijgen(curFile, vs);
            case "opstijgen" -> isOpstijgen(curFile, vs);
            case "steeg" -> isSteeg(curFile, vs);
            case "stijgen" -> isStijgen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOmhoogStijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-02.html#vs23")
                || isValidVerse(curFile, vs, "Exod-19.html#vs18")
                || isValidVerse(curFile, vs, "Jer-14.html#vs2");
    } // isOmhoogStijgen

    public static boolean isOpstijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-02.html#vs6")
                || isValidVerse(curFile, vs, "Josh-08.html#vs20")
                || isValidVerse(curFile, vs, "Judg-06.html#vs21")
                || isValidVerse(curFile, vs, "Judg-20.html#vs40")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs9")
                || isValidVerse(curFile, vs, "Ps-018.html#vs9")
                || isValidVerse(curFile, vs, "Ps-074.html#vs23")
                || isValidVerse(curFile, vs, "Ps-139.html#vs8")
                || isValidVerse(curFile, vs, "Jer-49.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs23", 24)
                || isValidVerse(curFile, vs, "Dan-07.html#vs3")
                || isValidVerse(curFile, vs, "Joel-2.html#vs20")
                || isValidVerse(curFile, vs, "Amos-9.html#vs2")
                || isValidVerse(curFile, vs, "Rev-08.html#vs4")
                || isValidVerse(curFile, vs, "Rev-09.html#vs2")
                || isValidVerse(curFile, vs, "Rev-14.html#vs11")
                || isValidVerse(curFile, vs, "Rev-19.html#vs3");
    } // isOpstijgen

    public static boolean isSteeg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-14.html#vs21");
    } // isSteeg

    private static boolean isStijgen(final File curFile, final String vs) {
        return !isOmhoogStijgen(curFile, vs)
                && !isOpstijgen(curFile, vs)
                && !isSteeg(curFile, vs);
    }  // isStijgen

}
