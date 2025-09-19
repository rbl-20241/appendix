package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidNet {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        var isValid = false;

        if (keyArg.equals("net (zelfstandig naamwoord)")) {
            isValid = isZelfstandigNaamwoord(curFile, vs);
        } else if (keyArg.equals("net (bijwoord)")) { // wordt vooralsnog niet meegenomen
            isValid = !isZelfstandigNaamwoord(curFile, vs)
                || isValidVerse(curFile, vs, "Eccl-09.html#vs12");
        }

        return isValid;
    }

    private static boolean isZelfstandigNaamwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-18.html#vs8")
                || isValidVerse(curFile, vs, "Ps-010.html#vs9")
                || isValidVerse(curFile, vs, "Ps-025.html#vs15")
                || isValidVerse(curFile, vs, "Ps-031.html#vs5")
                || isValidVerse(curFile, vs, "Ps-035.html#vs7")
                || isValidVerse(curFile, vs, "Ps-035.html#vs8")
                || isValidVerse(curFile, vs, "Ps-057.html#vs7")
                || isValidVerse(curFile, vs, "Ps-066.html#vs11")
                || isValidVerse(curFile, vs, "Ps-140.html#vs6")
                || isValidVerse(curFile, vs, "Ps-141.html#vs10")
                || isValidVerse(curFile, vs, "Prov-01.html#vs17")
                || isValidVerse(curFile, vs, "Prov-29.html#vs5")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs12")
                || isValidVerse(curFile, vs, "Isa-51.html#vs20")
                || isValidVerse(curFile, vs, "Lam-1.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs3")
                || isValidVerse(curFile, vs, "Hos-05.html#vs1")
                || isValidVerse(curFile, vs, "Hos-07.html#vs12")
                || isValidVerse(curFile, vs, "Mic-7.html#vs2")
                || isValidVerse(curFile, vs, "Matt-04.html#vs18",20, 21)
                || isValidVerse(curFile, vs, "Matt-13.html#vs47")
                || isValidVerse(curFile, vs, "Mark-01.html#vs16", 18, 19)
                || isValidVerse(curFile, vs, "Luke-05.html#vs2", 4, 5)
                || isValidVerse(curFile, vs, "Luke-05.html#vs6")
                || isValidVerse(curFile, vs, "John-21.html#vs6")
                || isValidVerse(curFile, vs, "John-21.html#vs8")
                || isValidVerse(curFile, vs, "John-21.html#vs11");
    }
}
