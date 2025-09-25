package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVerkeren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "verkeerd" -> isVerkeerd(curFile, vs);
            case "verkeerde" -> isVerkeerde(curFile, vs);
            case "verkeren" -> isVerkeren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isVerkeerd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-11.html#vs27")
                || isValidVerse(curFile, vs, "Job-31.html#vs3")
                || isValidVerse(curFile, vs, "Job-33.html#vs17")
                || isValidVerse(curFile, vs, "Prov-02.html#vs12")
                || isValidVerse(curFile, vs, "Prov-08.html#vs13")
                || isValidVerse(curFile, vs, "Prov-12.html#vs8")
                || isValidVerse(curFile, vs, "Prov-17.html#vs20")
                || isValidVerse(curFile, vs, "Prov-19.html#vs1")
                || isValidVerse(curFile, vs, "Prov-28.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs2")
                || isValidVerse(curFile, vs, "Matt-09.html#vs4")
                || isValidVerse(curFile, vs, "John-18.html#vs23")
                || isValidVerse(curFile, vs, "Acts-02.html#vs40")
                || isValidVerse(curFile, vs, "Phil-2.html#vs15")
                || isValidVerse(curFile, vs, "Jas-2.html#vs4")
                || isValidVerse(curFile, vs, "Jas-4.html#vs3")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs18");
    } // isVerkeerd

    public static boolean isVerkeerde(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-16.html#vs11")
                || isValidVerse(curFile, vs, "Prov-11.html#vs20")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "")
                || isValidVerse(curFile, vs, "");
    } // isVerkeerde

    public static boolean isVerkeren(final File curFile, final String vs) {
        return !isVerkeerd(curFile, vs)
                && !isVerkeerde(curFile, vs);
    } // isVerkeren
}
