package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStrooien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitstrooien" -> isUitstrooien(curFile, vs);
            case "strooien" -> isStrooien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitstrooien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs10")
                || isValidVerse(curFile, vs, "Exod-32.html#vs20")
                || isValidVerse(curFile, vs, "Ps-147.html#vs16")
                || isValidVerse(curFile, vs, "Prov-15.html#vs7")
                || isValidVerse(curFile, vs, "Isa-28.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs2");
    } // isUitstrooien

    public static boolean isStrooien(final File curFile, final String vs) {
        return !isUitstrooien(curFile, vs);
    } // isStrooien



}
