package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRollen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "oprollen" -> isOprollen(curFile, vs);
            case "rol" -> isRol(curFile, vs);
            case "wegrollen" -> isWegrollen(curFile, vs);
            case "rollen" -> isRollen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOprollen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-02.html#vs8")
                || isValidVerse(curFile, vs, "Isa-22.html#vs17");
    } // isOprollen

    public static boolean isRol(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-17.html#vs18")
                || isValidVerse(curFile, vs, "Isa-22.html#vs17")
                || isValidVerse(curFile, vs, "Jer-36.html#vs6", 14, 20, 21, 23, 25, 27, 28, 29, 32)
                || isValidVerse(curFile, vs, "Ezek-03.html#vs1", 2, 3);
    } // isRol

    public static boolean isWegrollen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-28.html#vs2");
    } // isWegrollen

    public static boolean isRollen(final File curFile, final String vs) {
        return !isOprollen(curFile, vs)
                && !isRol(curFile, vs)
                && !isWegrollen(curFile, vs);
    } // isRollen


}
