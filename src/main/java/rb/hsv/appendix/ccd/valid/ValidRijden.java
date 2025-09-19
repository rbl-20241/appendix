package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRijden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "reden" -> isReden(curFile, vs);
            case "wegrijden" -> isWegrijden(curFile, vs);
            case "rijden" -> isRijden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isReden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs8")
                || isValidVerse(curFile, vs, "Josh-05.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs29")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs31")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs31")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs20")
                || isValidVerse(curFile, vs, "Esth-01.html#vs18")
                || isValidVerse(curFile, vs, "Job-01.html#vs9")
                || isValidVerse(curFile, vs, "Job-02.html#vs3")
                || isValidVerse(curFile, vs, "Job-09.html#vs17")
                || isValidVerse(curFile, vs, "Job-22.html#vs6")
                || isValidVerse(curFile, vs, "Ps-007.html#vs5")
                || isValidVerse(curFile, vs, "Ps-025.html#vs3")
                || isValidVerse(curFile, vs, "Ps-035.html#vs7", 19)
                || isValidVerse(curFile, vs, "Ps-038.html#vs20")
                || isValidVerse(curFile, vs, "Ps-069.html#vs5")
                || isValidVerse(curFile, vs, "Ps-109.html#vs3")
                || isValidVerse(curFile, vs, "Ps-119.html#vs161")
                || isValidVerse(curFile, vs, "Prov-01.html#vs11")
                || isValidVerse(curFile, vs, "Prov-03.html#vs30")
                || isValidVerse(curFile, vs, "Prov-24.html#vs28")
                || isValidVerse(curFile, vs, "Prov-26.html#vs2")
                || isValidVerse(curFile, vs, "Lam-3.html#vs52")
                || isValidVerse(curFile, vs, "Ezek-05.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-06.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-14.html#vs23")
                || isValidVerse(curFile, vs, "Mal-1.html#vs10")
                || isValidVerse(curFile, vs, "Matt-05.html#vs32")
                || isValidVerse(curFile, vs, "Matt-19.html#vs3")
                || isValidVerse(curFile, vs, "Luke-08.html#vs47")
                || isValidVerse(curFile, vs, "John-15.html#vs25")
                || isValidVerse(curFile, vs, "Acts-10.html#vs21", 29)
                || isValidVerse(curFile, vs, "Acts-13.html#vs28")
                || isValidVerse(curFile, vs, "Acts-18.html#vs14")
                || isValidVerse(curFile, vs, "Acts-19.html#vs40")
                || isValidVerse(curFile, vs, "Acts-23.html#vs28")
                || isValidVerse(curFile, vs, "Acts-28.html#vs18", 20)
                || isValidVerse(curFile, vs, "Rom-13.html#vs4", 6)
                || isValidVerse(curFile, vs, "1Cor-09.html#vs16")
                || isValidVerse(curFile, vs, "Eph-3.html#vs1", 14)
                || isValidVerse(curFile, vs, "Phil-3.html#vs4")
                || isValidVerse(curFile, vs, "Col-2.html#vs18")
                || isValidVerse(curFile, vs, "Titus-1.html#vs5")
                || isValidVerse(curFile, vs, "Heb-12.html#vs11");
    } // isReden

    public static boolean isWegrijden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-13.html#vs29")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs45")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs16");
    } // isWegrijden

    public static boolean isRijden(final File curFile, final String vs) {
        return !isReden(curFile, vs)
                && !isWegrijden(curFile, vs);
    } // isRijden
}
