package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTreden {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aantreden" -> isAantreden(curFile, vs);
            case "binnentreden" -> isBinnentreden(curFile, vs);
            case "buiten de oevers treden" -> isBuitenDeOeversTreden(curFile, vs);
            case "in dienst treden" -> isInDienstTreden(curFile, vs, keyArg, arg);
            case "naar voren treden" -> isNaarVorenTreden(curFile, vs);
            case "optreden" -> isOptreden(curFile, vs);
            case "tegemoet treden" -> isTegemoetTreden(curFile, vs);
            case "toetreden" -> isToetreden(curFile, vs);
            case "tred" -> isTred(curFile, vs);
            case "trede" -> isTrede(curFile, vs);
            case "treden" -> isTreden(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAantreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-01.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs9");
    } // isAantreden

    public static boolean isBinnentreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-22.html#vs15")
                || isValidVerse(curFile, vs, "Isa-26.html#vs20")
                || isValidVerse(curFile, vs, "Dan-02.html#vs16", 24)
                || isValidVerse(curFile, vs, "Dan-04.html#vs7")
                || isValidVerse(curFile, vs, "Dan-05.html#vs8", 10);
    } // isBinnentreden

    public static boolean isBuitenDeOeversTreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-03.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs15")
                || isValidVerse(curFile, vs, "Isa-08.html#vs7");
    } // isBuitenDeOeversTreden

    public static boolean isInDienstTreden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in dienst treden", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Gen-41.html#vs46")
                    || isValidVerse(curFile, vs, "Dan-01.html#vs5", 19);
        }
        return false;
    } // isInDienstTreden

    public static boolean isNaarVorenTreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-22.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs20")
                || isValidVerse(curFile, vs, "Isa-45.html#vs20")
                || isValidVerse(curFile, vs, "Zech-02.html#vs3")
                || isValidVerse(curFile, vs, "Zech-05.html#vs5")
                || isValidVerse(curFile, vs, "John-18.html#vs4");
    } // isNaarVorenTreden

    public static boolean isOptreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-03.html#vs1")
                || isValidVerse(curFile, vs, "Acts-26.html#vs11")
                || isValidVerse(curFile, vs, "2Cor-13.html#vs10");
    } // isOptreden

    public static boolean isTegemoetTreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-02.html#vs7")
                || isValidVerse(curFile, vs, "Job-41.html#vs2")
                || isValidVerse(curFile, vs, "Ps-017.html#vs13")
                || isValidVerse(curFile, vs, "Isa-21.html#vs14")
                || isValidVerse(curFile, vs, "Zech-02.html#vs3");
    } // isTegemoetTreden

    public static boolean isToetreden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-44.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs17", 18)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs13", 22)
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs3")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs1")
                || isValidVerse(curFile, vs, "Isa-41.html#vs5");
    } // isToetreden

    public static boolean isTred(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-30.html#vs29");
    } // isTred

    public static boolean isTrede(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-10.html#vs19", 20)
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-20.html#vs9", 10, 11)
                || isValidVerse(curFile, vs, "2Chr-09.html#vs18", 19)
                || isValidVerse(curFile, vs, "Isa-38.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-40.html#vs6", 22, 26, 31, 34, 37, 49);
    } // isTred

    public static boolean isTreden(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAantreden(curFile, vs)
                && !isBinnentreden(curFile, vs)
                && !isBuitenDeOeversTreden(curFile, vs)
                && !isInDienstTreden(curFile, vs, keyArg, arg)
                && !isNaarVorenTreden(curFile, vs)
                && !isOptreden(curFile, vs)
                && !isTegemoetTreden(curFile, vs)
                && !isToetreden(curFile, vs)
                && !isTred(curFile, vs)
                && !isTrede(curFile, vs);
    }  // isTreden

}
