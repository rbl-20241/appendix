package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidKrijgen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "deel krijgen" -> isDeelKrijgen(curFile, vs);
            case "klaarkrijgen" -> isKlaarkrijgen();
            case "overhand krijgen" -> isOverhandKrijgen(curFile, vs);
            case "terugkrijgen" -> isTerugkrijgen(curFile, vs);
            case "vat krijgen" -> isVatKrijgen(curFile, vs);
            case "weet krijgen" -> isWeetKrijgen(curFile, vs);
            case "krijgen" -> isKrijgen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isDeelKrijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-01.html#vs17", 25)
                || isValidVerse(curFile, vs, "Rom-11.html#vs17")
                || isValidVerse(curFile, vs, "Rom-15.html#vs27")
                || isValidVerse(curFile, vs, "Heb-03.html#vs14")
                || isValidVerse(curFile, vs, "Heb-12.html#vs8", 10)
                || isValidVerse(curFile, vs, "2Pet-1.html#vs4");
    } // isDeelKrijgen

    public static boolean isKlaarkrijgen() {
        return IS_NOT_FOUND;
    } // isKlaarkrijgen

    public static boolean isOverhandKrijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-03.html#vs10")
                || isValidVerse(curFile, vs, "Judg-06.html#vs2")
                || isValidVerse(curFile, vs, "Luke-23.html#vs23");
    } // isOverhandKrijgen

    public static boolean isTerugkrijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-38.html#vs20")
                || isValidVerse(curFile, vs, "Luke-06.html#vs35")
                || isValidVerse(curFile, vs, "Eph-6.html#vs8")
                || isValidVerse(curFile, vs, "Heb-11.html#vs19");
    } // isTerugkrijgen

    public static boolean isVatKrijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-03.html#vs27");
    } // isVatKrijgen

    public static boolean isWeetKrijgen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-38.html#vs24");
    } // isWeetKrijgen

    public static boolean isKrijgen(final File curFile, final String vs) {
        return !isDeelKrijgen(curFile, vs)
                && !isKlaarkrijgen()
                && !isOverhandKrijgen(curFile, vs)
                && !isTerugkrijgen(curFile, vs)
                && !isVatKrijgen(curFile, vs)
                && !isWeetKrijgen(curFile, vs);
    }  // isKrijgen

}
