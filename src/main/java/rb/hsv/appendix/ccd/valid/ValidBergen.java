package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBergen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "opbergen" -> isOpbergen(curFile, vs);
            case "borg" -> isBorg(curFile, vs);
            case "berg" -> isBerg(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBorg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-43.html#vs9")
                || isValidVerse(curFile, vs, "Gen-44.html#vs32")
                || isValidVerse(curFile, vs, "Job-17.html#vs3")
                || isValidVerse(curFile, vs, "Ps-119.html#vs122")
                || isValidVerse(curFile, vs, "Prov-06.html#vs1")
                || isValidVerse(curFile, vs, "Prov-11.html#vs15")
                || isValidVerse(curFile, vs, "Prov-17.html#vs18")
                || isValidVerse(curFile, vs, "Prov-20.html#vs16")
                || isValidVerse(curFile, vs, "Prov-22.html#vs26")
                || isValidVerse(curFile, vs, "Prov-27.html#vs13")
                || isValidVerse(curFile, vs, "Prov-27.html#vs13")
                || isValidVerse(curFile, vs, "Isa-38.html#vs14")
                || isValidVerse(curFile, vs, "Jer-30.html#vs21")
                || isValidVerse(curFile, vs, "Heb-07.html#vs22");
    } // isBorg

    public static boolean isOpbergen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-05.html#vs24")
                || isValidVerse(curFile, vs, "Prov-07.html#vs1")
                || isValidVerse(curFile, vs, "Prov-10.html#vs14");
    } // isOpbergen

    public static boolean isBerg(final File curFile, final String vs) {
        return !isBorg(curFile, vs)
                && !isOpbergen(curFile, vs);
    } // isBerg

}
