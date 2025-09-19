package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidScheren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afscheren" -> isAfscheren(curFile, vs);
            case "kaalscheren" -> isKaalscheren(curFile, vs);
            case "scheren" -> isScheren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfscheren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-10.html#vs4")
                || isValidVerse(curFile, vs, "Jer-07.html#vs29")
                || isValidVerse(curFile, vs, "Mic-1.html#vs16");
    } // isAfscheren

    public static boolean isKaalscheren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-27.html#vs31")
                || isValidVerse(curFile, vs, "Mic-1.html#vs16");
    } // isKaalscheren

    private static boolean isScheren(final File curFile, final String vs) {
        return !isAfscheren(curFile, vs)
                && !isKaalscheren(curFile, vs);
    }  // isScheren

}
