package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBouwen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bouw" -> isBouw(curFile, vs);
            case "opbouwen" -> isOpbouwen(curFile, vs);
            case "uitbouwen" -> isUitbouwen(curFile, vs);
            case "bouwen" -> isBouwen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isBouw(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-03.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs38")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-28.html#vs2")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs16");
    } // isBouw

    public static boolean isOpbouwen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-01.html#vs51")
                || isValidVerse(curFile, vs, "Num-10.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs34")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs11", 13)
                || isValidVerse(curFile, vs, "Neh-02.html#vs5")
                || isValidVerse(curFile, vs, "Ps-051.html#vs20")
                || isValidVerse(curFile, vs, "Ps-147.html#vs2")
                || isValidVerse(curFile, vs, "Prov-14.html#vs1")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs3")
                || isValidVerse(curFile, vs, "Mal-1.html#vs4")
                || isValidVerse(curFile, vs, "Acts-20.html#vs32")
                || isValidVerse(curFile, vs, "1Cor-08.html#vs1")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs23")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs4")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs11")
                || isValidVerse(curFile, vs, "Jude-1.html#vs20");
    } // isOpbouwen

    public static boolean isUitbouwen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-12.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-15.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs1");
    } // isUitbouwen

    public static boolean isBouwen(final File curFile, final String vs) {
        return !isBouw(curFile, vs)
                && !isOpbouwen(curFile, vs)
                && !isUitbouwen(curFile, vs);
    } // isBouwen


}
