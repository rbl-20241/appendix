package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSpreiden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitspreiden" -> isUitspreiden(curFile, vs);
            case "spreiden" -> isSpreiden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitspreiden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-09.html#vs33")
                || isValidVerse(curFile, vs, "Exod-40.html#vs19")
                || isValidVerse(curFile, vs, "Num-11.html#vs32")
                || isValidVerse(curFile, vs, "Judg-08.html#vs25")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-21.html#vs10")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs27")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs7", 22)
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-03.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs12", 13)
                || isValidVerse(curFile, vs, "Ezra-09.html#vs5")
                || isValidVerse(curFile, vs, "Job-08.html#vs16")
                || isValidVerse(curFile, vs, "Job-11.html#vs13")
                || isValidVerse(curFile, vs, "Job-12.html#vs23")
                || isValidVerse(curFile, vs, "Job-26.html#vs9")
                || isValidVerse(curFile, vs, "Job-36.html#vs30")
                || isValidVerse(curFile, vs, "Job-37.html#vs11")
                || isValidVerse(curFile, vs, "Job-41.html#vs21")
                || isValidVerse(curFile, vs, "Ps-105.html#vs39")
                || isValidVerse(curFile, vs, "Ps-143.html#vs6")
                || isValidVerse(curFile, vs, "Prov-31.html#vs20")
                || isValidVerse(curFile, vs, "Isa-37.html#vs14")
                || isValidVerse(curFile, vs, "Isa-57.html#vs7")
                || isValidVerse(curFile, vs, "Jer-04.html#vs31")
                || isValidVerse(curFile, vs, "Jer-49.html#vs22")
                || isValidVerse(curFile, vs, "Lam-1.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-02.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs8")
                || isValidVerse(curFile, vs, "Hos-07.html#vs12")
                || isValidVerse(curFile, vs, "Matt-21.html#vs8")
                || isValidVerse(curFile, vs, "Mark-11.html#vs8")
                || isValidVerse(curFile, vs, "Luke-19.html#vs36");
    } // isUitspreiden

    public static boolean isSpreiden(final File curFile, final String vs) {
        return !isUitspreiden(curFile, vs);
    } // isSpreiden



}
