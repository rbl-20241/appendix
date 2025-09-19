package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStoppen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "dichtstoppen" -> isDichtstoppen(curFile, vs);
            case "toestoppen" -> isToestoppen(curFile, vs);
            case "stoppen" -> isStoppen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isDichtstoppen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-26.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs3")
                || isValidVerse(curFile, vs, "Acts-07.html#vs57");
    } // isDichtstoppen

    public static boolean isToestoppen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-06.html#vs10")
                || isValidVerse(curFile, vs, "Zech-07.html#vs11");
    } // isToestoppen

    public static boolean isStoppen(final File curFile, final String vs) {
        return !isDichtstoppen(curFile, vs)
                && !isToestoppen(curFile, vs);
    } // isStoppen
}
