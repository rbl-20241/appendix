package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSturen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afsturen" -> isAfsturen(curFile, vs);
            case "meesturen" -> isMeesturen(curFile, vs);
            case "rondsturen" -> isRondsturen(curFile, vs);
            case "terugsturen" -> isTerugsturen(curFile, vs);
            case "toesturen" -> IS_NOT_FOUND;
            case "uitsturen" -> isUitsturen(curFile, vs);
            case "wegsturen" -> isWegsturen(curFile, vs);
            case "sturen" -> isSturen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfsturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-28.html#vs48")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs37");
    } // isAfsturen

    public static boolean isMeesturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-42.html#vs4")
                || isValidVerse(curFile, vs, "Gen-43.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs27")
                || isValidVerse(curFile, vs, "Acts-15.html#vs22");
    } // isMeesturen

    public static boolean isRondsturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-31.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs9")
                || isValidVerse(curFile, vs, "Matt-14.html#vs35");
    } // isRondsturen

    public static boolean isTerugsturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-42.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs3", 8)
                || isValidVerse(curFile, vs, "2Sam-11.html#vs12")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs23")
                || isValidVerse(curFile, vs, "Luke-23.html#vs11")
                || isValidVerse(curFile, vs, "Acts-07.html#vs14");
    } // isTerugsturen

    public static boolean isUitsturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs17")
                || isValidVerse(curFile, vs, "Luke-09.html#vs52");
    } // isUitsturen

    public static boolean isWegsturen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-21.html#vs14")
                || isValidVerse(curFile, vs, "Gen-28.html#vs5")
                || isValidVerse(curFile, vs, "Num-05.html#vs4")
                || isValidVerse(curFile, vs, "Josh-24.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-05.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs16")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs19")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs3")
                || isValidVerse(curFile, vs, "Job-14.html#vs20")
                || isValidVerse(curFile, vs, "Jer-15.html#vs1")
                || isValidVerse(curFile, vs, "Matt-14.html#vs15", 22)
                || isValidVerse(curFile, vs, "Matt-15.html#vs23")
                || isValidVerse(curFile, vs, "Mark-01.html#vs43")
                || isValidVerse(curFile, vs, "Mark-05.html#vs40")
                || isValidVerse(curFile, vs, "Mark-06.html#vs36", 45)
                || isValidVerse(curFile, vs, "Mark-08.html#vs9")
                || isValidVerse(curFile, vs, "Mark-12.html#vs3", 4)
                || isValidVerse(curFile, vs, "Luke-08.html#vs38")
                || isValidVerse(curFile, vs, "Luke-09.html#vs12")
                || isValidVerse(curFile, vs, "Luke-20.html#vs10", 11)
                || isValidVerse(curFile, vs, "Acts-09.html#vs30")
                || isValidVerse(curFile, vs, "Acts-17.html#vs10", 14);
    } // isWegsturen

    public static boolean isSturen(final File curFile, final String vs) {
        return !isAfsturen(curFile, vs)
                && !isMeesturen(curFile, vs)
                && !isRondsturen(curFile, vs)
                && !isTerugsturen(curFile, vs)
                && !isUitsturen(curFile, vs)
                && !isWegsturen(curFile, vs);
    } // isSturen

}
