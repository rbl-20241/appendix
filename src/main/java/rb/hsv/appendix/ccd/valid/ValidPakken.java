package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPakken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "beetpakken" -> isBeetpakken(curFile, vs);
            case "oppakken" -> isOppakken(curFile, vs);
            case "pak" -> isPak(curFile, vs);
            case "vastpakken" -> isVastpakken(curFile, vs);
            case "pakken" -> isPakken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBeetpakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-18.html#vs28");
    } // isBeetpakken

    public static boolean isOppakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-12.html#vs34")
                || isValidVerse(curFile, vs, "Judg-09.html#vs48")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs25", 26)
                || isValidVerse(curFile, vs, "Ezek-10.html#vs7")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs12", 15)
                || isValidVerse(curFile, vs, "John-10.html#vs31");
    } // isOppakken

    public static boolean isPak(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-46.html#vs1")
                || isValidVerse(curFile, vs, "Gal-6.html#vs5");
    } // isPak

    public static boolean isVastpakken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-21.html#vs11");
    } // isVastpakken

    public static boolean isPakken(final File curFile, final String vs) {
        return !isBeetpakken(curFile, vs)
                && !isOppakken(curFile, vs)
                && !isPak(curFile, vs)
                && !isVastpakken(curFile, vs);
    }  // isPakken

}
