package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLeveren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afleveren" -> isAfleveren(curFile, vs);
            case "bewijs leveren" -> isBewijsLeveren(curFile, vs);
            case "lever" -> isLever(curFile, vs);
            case "overleveren" -> isOverleveren(curFile, vs);
            case "uitleveren" -> isUitleveren(curFile, vs);
            case "leveren" -> isLeveren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfleveren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-18.html#vs27")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs19");
    } // isAfleveren

    public static boolean isBewijsLeveren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-17.html#vs31");
    } // isBewijsLeveren

    public static boolean isLever(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-29.html#vs13", 22)
                || isValidVerse(curFile, vs, "Lev-03.html#vs4", 10, 15)
                || isValidVerse(curFile, vs, "Lev-04.html#vs9")
                || isValidVerse(curFile, vs, "Lev-07.html#vs4")
                || isValidVerse(curFile, vs, "Lev-08.html#vs16", 25)
                || isValidVerse(curFile, vs, "Lev-09.html#vs10", 19)
                || isValidVerse(curFile, vs, "Prov-07.html#vs23")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs21");
    } // isLever

    public static boolean isOverleveren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-39.html#vs20")
                || isValidVerse(curFile, vs, "Judg-02.html#vs14")
                || isValidVerse(curFile, vs, "Judg-03.html#vs8")
                || isValidVerse(curFile, vs, "Judg-04.html#vs2")
                || isValidVerse(curFile, vs, "Judg-10.html#vs7")
                || isValidVerse(curFile, vs, "Judg-11.html#vs21")
                || isValidVerse(curFile, vs, "Judg-15.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs9")
                || isValidVerse(curFile, vs, "Ps-078.html#vs48", 50, 62)
                || isValidVerse(curFile, vs, "Zech-11.html#vs6")
                || isValidVerse(curFile, vs, "Matt-26.html#vs16")
                || isValidVerse(curFile, vs, "Matt-27.html#vs2")
                || isValidVerse(curFile, vs, "Mark-13.html#vs11")
                || isValidVerse(curFile, vs, "Mark-14.html#vs10", 11)
                || isValidVerse(curFile, vs, "Mark-15.html#vs1", 15)
                || isValidVerse(curFile, vs, "Luke-20.html#vs20")
                || isValidVerse(curFile, vs, "Luke-21.html#vs12")
                || isValidVerse(curFile, vs, "Luke-22.html#vs6")
                || isValidVerse(curFile, vs, "Luke-23.html#vs25")
                || isValidVerse(curFile, vs, "John-19.html#vs16")
                || isValidVerse(curFile, vs, "Acts-08.html#vs3")
                || isValidVerse(curFile, vs, "Acts-25.html#vs16");
    } // isOverleveren

    public static boolean isUitleveren(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-20.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs21")
                || isValidVerse(curFile, vs, "Amos-1.html#vs6");
    } // isUitleveren

    private static boolean isLeveren(final File curFile, final String vs) {
        return !isAfleveren(curFile, vs)
                && !isBewijsLeveren(curFile, vs)
                && !isLever(curFile, vs)
                && !isOverleveren(curFile, vs)
                && !isUitleveren(curFile, vs);
    }  // isLeveren

}
