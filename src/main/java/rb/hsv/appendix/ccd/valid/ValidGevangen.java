package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidNemen.isGevangennemen;
import static rb.hsv.appendix.ccd.valid.ValidZitten.isGevangenzitten;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGevangen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "gevangennemen" -> isGevangennemen(curFile, vs);
            case "gevangenzitten" -> isGevangenzitten(curFile, vs);
            case "gevangen" -> isGevangen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isGevangen(final File curFile, final String vs) {
        return isGevangennemen(curFile, vs)
                || isValidVerse(curFile, vs, "Gen-42.html#vs16", 19)
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs15")
                || isValidVerse(curFile, vs, "Job-36.html#vs8")
                || isValidVerse(curFile, vs, "Ps-009.html#vs16")
                || isValidVerse(curFile, vs, "Ps-059.html#vs13")
                || isValidVerse(curFile, vs, "Ps-107.html#vs10")
                || isValidVerse(curFile, vs, "Ps-137.html#vs3")
                || isValidVerse(curFile, vs, "Prov-11.html#vs6")
                || isValidVerse(curFile, vs, "Eccl-07.html#vs26")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs12")
                || isValidVerse(curFile, vs, "Isa-08.html#vs15")
                || isValidVerse(curFile, vs, "Isa-14.html#vs2")
                || isValidVerse(curFile, vs, "Isa-28.html#vs13")
                || isValidVerse(curFile, vs, "Jer-08.html#vs9")
                || isValidVerse(curFile, vs, "Jer-13.html#vs17")
                || isValidVerse(curFile, vs, "Jer-48.html#vs44")
                || isValidVerse(curFile, vs, "Jer-50.html#vs24", 33)
                || isValidVerse(curFile, vs, "Lam-4.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-12.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs4", 8)
                || isValidVerse(curFile, vs, "Amos-3.html#vs4", 5)
                || isValidVerse(curFile, vs, "Luke-05.html#vs5")
                || isValidVerse(curFile, vs, "John-21.html#vs10")
                || isValidVerse(curFile, vs, "Acts-04.html#vs3")
                || isValidVerse(curFile, vs, "Acts-24.html#vs27")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs26")
                || isValidVerse(curFile, vs, "Heb-13.html#vs3")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs12");
    } // isGevangen

}
