package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDorst {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "dorsen" -> isDorsen(curFile, vs);
            case "dorsten" -> isDorsten(curFile, vs);
            case "dorst" -> isDorst(curFile, vs);
            default -> true;
        };
    }

    public static boolean isDorsen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-25.html#vs4")
                || isValidVerse(curFile, vs, "Judg-08.html#vs7")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs7")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs20")
                || isValidVerse(curFile, vs, "Isa-28.html#vs27", 28)
                || isValidVerse(curFile, vs, "Isa-41.html#vs15")
                || isValidVerse(curFile, vs, "Hos-10.html#vs11")
                || isValidVerse(curFile, vs, "Amos-1.html#vs3")
                || isValidVerse(curFile, vs, "Mic-4.html#vs13")
                || isValidVerse(curFile, vs, "1Cor-09.html#vs10");
    } // isDorsen

    public static boolean isDorsten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-042.html#vs3")
                || isValidVerse(curFile, vs, "Ps-063.html#vs2")
                || isValidVerse(curFile, vs, "Matt-05.html#vs6");
    } // isDorsten

    public static boolean isDorst(final File curFile, final String vs) {
        return !isDorsen(curFile, vs)
                && !isDorsten(curFile, vs);
    }  // isDorst

}
