package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZee {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "zee (water)" -> !isWaterbekken(curFile, vs);
            case "zee (waterbekken)" -> isWaterbekken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isWaterbekken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-07.html#vs23")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs24")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs39")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs44")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs16")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-04.html#vs15")
                || isValidVerse(curFile, vs, "Jer-27.html#vs19")
                || isValidVerse(curFile, vs, "Jer-52.html#vs17")
                || isValidVerse(curFile, vs, "Jer-52.html#vs20");
    }

}
