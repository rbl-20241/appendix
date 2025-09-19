package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTreffen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aantreffen" -> isAantreffen(curFile, vs);
            case "treffen" -> isTreffen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAantreffen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs15", 17)
                || isValidVerse(curFile, vs, "Exod-05.html#vs20")
                || isValidVerse(curFile, vs, "Num-15.html#vs32")
                || isValidVerse(curFile, vs, "Deut-22.html#vs23", 27)
                || isValidVerse(curFile, vs, "Josh-02.html#vs16")
                || isValidVerse(curFile, vs, "Judg-01.html#vs5")
                || isValidVerse(curFile, vs, "Judg-18.html#vs10")
                || isValidVerse(curFile, vs, "Judg-21.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs14", 24, 28)
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs36", 37)
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs13", 15)
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs15")
                || isValidVerse(curFile, vs, "Prov-27.html#vs16")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs15")
                || isValidVerse(curFile, vs, "Isa-37.html#vs8")
                || isValidVerse(curFile, vs, "Dan-06.html#vs12")
                || isValidVerse(curFile, vs, "Hos-13.html#vs8")
                || isValidVerse(curFile, vs, "Matt-18.html#vs28")
                || isValidVerse(curFile, vs, "Matt-26.html#vs40", 43)
                || isValidVerse(curFile, vs, "Matt-27.html#vs32")
                || isValidVerse(curFile, vs, "Mark-14.html#vs37", 40)
                || isValidVerse(curFile, vs, "Luke-24.html#vs24")
                || isValidVerse(curFile, vs, "John-02.html#vs14")
                || isValidVerse(curFile, vs, "Acts-05.html#vs10", 23)
                || isValidVerse(curFile, vs, "Acts-10.html#vs27")
                || isValidVerse(curFile, vs, "Acts-13.html#vs6")
                || isValidVerse(curFile, vs, "Acts-17.html#vs23")
                || isValidVerse(curFile, vs, "Acts-18.html#vs2")
                || isValidVerse(curFile, vs, "Acts-19.html#vs1")
                || isValidVerse(curFile, vs, "Acts-24.html#vs18");
    } // isAantreffen

    public static boolean isTreffen(final File curFile, final String vs) {
        return !isAantreffen(curFile, vs);
    }  // isTreffen

}
