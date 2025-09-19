package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMunt {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "munt (plant)" -> isMunt_Plant(curFile, vs);
            case "munt (geldstuk)" -> isMunt_Geldstuk(curFile, vs);
            default -> true;
        };
    }

    public static boolean isMunt_Plant(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-23.html#vs23")
                || isValidVerse(curFile, vs, "Luke-11.html#vs42");
    }

    public static boolean isMunt_Geldstuk(final File curFile, final String vs) {
        return !isMunt_Plant(curFile, vs);
    } // isMunt_Geldstuk



}
