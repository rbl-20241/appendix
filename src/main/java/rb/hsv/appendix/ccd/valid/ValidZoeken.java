package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZoeken {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "op zoek naar" -> isOpZoekNaar(curFile, vs, keyArg, arg);
            case "opzoeken" -> isOpzoeken(curFile, vs);
            case "uitzoeken" -> isUitzoeken(curFile, vs);
            case "zoek" -> isZoek(curFile, vs);
            case "zoeken" -> isZoeken(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isOpZoekNaar(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("op zoek naar", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Gen-37.html#vs16")
                    || isValidVerse(curFile, vs, "Ps-037.html#vs25")
                    || isValidVerse(curFile, vs, "Ps-059.html#vs16")
                    || isValidVerse(curFile, vs, "Ps-064.html#vs7")
                    || isValidVerse(curFile, vs, "Prov-23.html#vs35")
                    || isValidVerse(curFile, vs, "Jer-03.html#vs13")
                    || isValidVerse(curFile, vs, "Lam-1.html#vs11")
                    || isValidVerse(curFile, vs, "Ezek-34.html#vs11", 12)
                    || isValidVerse(curFile, vs, "1Pet-5.html#vs8");
        }
        return false;
    } // isOpZoekNaar

    public static boolean isOpzoeken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-10.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs23")
                || isValidVerse(curFile, vs, "Didache-04.html#vs2");
    } // isOpzoeken

    public static boolean isUitzoeken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-40.html#vs20");
    } // isUitzoeken

    public static boolean isZoek(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-09.html#vs20");
    } // isZoek

    public static boolean isZoeken(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isOpZoekNaar(curFile, vs, keyArg, arg)
                && !isOpzoeken(curFile, vs)
                && !isUitzoeken(curFile, vs)
                && !isZoek(curFile, vs);
    } // isZoeken
}
