package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidBinden.isVastbinden;
import static rb.hsv.appendix.ccd.valid.ValidGrijpen.isVastgrijpen;
import static rb.hsv.appendix.ccd.valid.ValidHouden.isVasthouden;
import static rb.hsv.appendix.ccd.valid.ValidLeggen.isVastleggen;
import static rb.hsv.appendix.ccd.valid.ValidMaken.isVastmaken;
import static rb.hsv.appendix.ccd.valid.ValidPakken.isVastpakken;
import static rb.hsv.appendix.ccd.valid.ValidStaan.isVaststaan;
import static rb.hsv.appendix.ccd.valid.ValidStellen.isVaststellen;
import static rb.hsv.appendix.ccd.valid.ValidZetten.isVastzetten;
import static rb.hsv.appendix.ccd.valid.ValidZitten.isVastzitten;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isArgumentFromList;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVasten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "vast" -> isVast(curFile, vs, arg);
            case "vast en zeker" -> isVastEnZeker(curFile, vs);
            case "vastklampen" -> isVastklampen(curFile, vs);
            case "vasten" -> isVasten(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isVastEnZeker(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-44.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs11")
                || isValidVerse(curFile, vs, "Isa-25.html#vs1")
                || isValidVerse(curFile, vs, "Acts-28.html#vs4")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs19");
    } // isVastEnZeker

    public static boolean isVasten(final File curFile, final String vs, final @NotNull String arg) {
        if (isArgumentFromList(arg, "vasten", "vastte", "vastten", "gevast")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Esth-04.html#vs16")
                || isValidVerse(curFile, vs, "Isa-58.html#vs4")
                || isValidVerse(curFile, vs, "Matt-06.html#vs16", 17, 18)
                || isValidVerse(curFile, vs, "Luke-18.html#vs12")
                || isValidVerse(curFile, vs, "Didache-01.html#vs3")
                || isValidVerse(curFile, vs, "Didache-08.html#vs1");
    } // isVasten

    public static boolean isVastklampen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-1.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs22")
                || isValidVerse(curFile, vs, "Job-24.html#vs8")
                || isValidVerse(curFile, vs, "Ps-063.html#vs9");
    } // isVastklampen

    public static boolean isVast(final File curFile, final String vs, final @NotNull String arg) {
        return !isVastbinden(curFile, vs)
                && !isVastgrijpen(curFile, vs)
                && !isVasthouden(curFile, vs)
                && !isVastleggen(curFile, vs)
                && !isVastmaken(curFile, vs)
                && !isVastpakken(curFile, vs)
                && !isVaststaan(curFile, vs)
                && !isVaststellen(curFile, vs)
                && !isVastzetten(curFile, vs)
                && !isVastzitten(curFile, vs)
                && !isVasten(curFile, vs, arg)
                && !isVastEnZeker(curFile, vs)
                && !isVastklampen(curFile, vs);
    }  // isVast

}
