package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZweren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "zweer" -> isZweer(curFile, vs);
            case "zweren" -> isZweren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isZweer(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs9", 10, 11)
                || isValidVerse(curFile, vs, "Lev-13.html#vs2", 18, 19, 20, 23)
                || isValidVerse(curFile, vs, "Lev-14.html#vs56")
                || isValidVerse(curFile, vs, "Deut-28.html#vs27", 35)
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs7")
                || isValidVerse(curFile, vs, "Job-02.html#vs7")
                || isValidVerse(curFile, vs, "Isa-38.html#vs21")
                || isValidVerse(curFile, vs, "Luke-16.html#vs20", 21)
                || isValidVerse(curFile, vs, "Rev-16.html#vs2", 11);
    } // isZweer

    public static boolean isZweren(final File curFile, final String vs) {
        return !isZweer(curFile, vs);
    } // isZweren


}
