package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDragen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aandragen" -> isAandragen();
            case "afdragen" -> isAfdragen(curFile, vs);
            case "bijdragen" -> isBijdragen(curFile, vs);
            case "opdragen" -> isOpdragen(curFile, vs);
            case "overdragen" -> isOverdragen(curFile, vs);
            case "ronddragen" -> isRonddragen();
            case "uitdragen" -> isUitdragen(curFile, vs);
            case "voordragen" -> isVoordragen(curFile, vs);
            case "vruchtdragen" -> isVruchtdragen(curFile, vs);
            case "wegdragen" -> isWegdragen(curFile, vs);
            case "zorgdragen" -> isZorgdragen(curFile, vs);
            case "dragen" -> !isAandragen()
                    && !isAfdragen(curFile, vs)
                    && !isBijdragen(curFile, vs)
                    && !isOpdragen(curFile, vs)
                    && !isOverdragen(curFile, vs)
                    && !isRonddragen()
                    && !isUitdragen(curFile, vs)
                    && !isVoordragen(curFile, vs)
                    && !isVruchtdragen(curFile, vs)
                    && !isWegdragen(curFile, vs)
                    && !isZorgdragen(curFile, vs);
            default -> true;
        };
    }

    private static boolean isAandragen() {
        return false;
    }

    private static boolean isAfdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-17.html#vs3")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs35");
    }

    private static boolean isBijdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-35.html#vs29");
    }

    private static boolean isOpdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mark-06.html#vs39")
                || isValidVerse(curFile, vs, "Acts-14.html#vs23")
                || isValidVerse(curFile, vs, "Acts-20.html#vs32")
                || isValidVerse(curFile, vs, "Didache-07.html#vs4");
    }

    private static boolean isOverdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs25")
                || isValidVerse(curFile, vs, "Num-27.html#vs19", 23)
                || isValidVerse(curFile, vs, "Ezra-01.html#vs8")
                || isValidVerse(curFile, vs, "Acts-23.html#vs33")
                || isValidVerse(curFile, vs, "Acts-28.html#vs16");
    }

    private static boolean isRonddragen() {
        return false;
    }

    private static boolean isUitdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-48.html#vs20");
    }

    private static boolean isVoordragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-045.html#vs2");
    }

    private static boolean isVruchtdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-01.html#vs11", 12)
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs30")
                || isValidVerse(curFile, vs, "Ps-092.html#vs15")
                || isValidVerse(curFile, vs, "Isa-37.html#vs31")
                || isValidVerse(curFile, vs, "Jer-12.html#vs2")
                || isValidVerse(curFile, vs, "Jer-17.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs8")
                || isValidVerse(curFile, vs, "Hos-13.html#vs15")
                || isValidVerse(curFile, vs, "Joel-2.html#vs22")
                || isValidVerse(curFile, vs, "Matt-13.html#vs23")
                || isValidVerse(curFile, vs, "Mark-04.html#vs20")
                || isValidVerse(curFile, vs, "Luke-08.html#vs14")
                || isValidVerse(curFile, vs, "Luke-13.html#vs9")
                || isValidVerse(curFile, vs, "John-12.html#vs24")
                || isValidVerse(curFile, vs, "John-15.html#vs2", 4, 5, 8, 16)
                || isValidVerse(curFile, vs, "Rom-07.html#vs4", 5)
                || isValidVerse(curFile, vs, "Col-1.html#vs6", 10);
    }

    private static boolean isWegdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-10.html#vs4")
                || isValidVerse(curFile, vs, "Lev-16.html#vs22")
                || isValidVerse(curFile, vs, "Heb-09.html#vs28");
    }

    private static boolean isZorgdragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-03.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs16")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs7")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs32", 33, 34)
                || isValidVerse(curFile, vs, "1Cor-12.html#vs25")
                || isValidVerse(curFile, vs, "2Cor-08.html#vs19", 20)
                || isValidVerse(curFile, vs, "Phil-2.html#vs20")
                || isValidVerse(curFile, vs, "1Tim-3.html#vs5");
    }

}
