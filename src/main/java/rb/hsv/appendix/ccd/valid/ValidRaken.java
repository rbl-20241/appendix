package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRaken {

    public static boolean isValid(final String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanraken" -> isAanraken(curFile, vs);
            case "in verwarring raken" -> isInVerwarringRaken(curFile, vs, arg);
            case "losraken" -> isLosraken(curFile, vs);
            case "opraken" -> isOpraken(curFile, vs);
            case "zoekraken" -> isZoekraken();
            case "raken" -> isRaken(curFile, vs, arg);
            default -> true;
        };
    }

    private static boolean isAanraken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-20.html#vs6")
                || isValidVerse(curFile, vs, "Gen-32.html#vs25")
                || isValidVerse(curFile, vs, "Num-16.html#vs26")
                || isValidVerse(curFile, vs, "Judg-06.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-19.html#vs5", 7)
                || isValidVerse(curFile, vs, "1Chr-16.html#vs22")
                || isValidVerse(curFile, vs, "Esth-05.html#vs2")
                || isValidVerse(curFile, vs, "Job-06.html#vs7")
                || isValidVerse(curFile, vs, "Ps-104.html#vs32")
                || isValidVerse(curFile, vs, "Ps-105.html#vs15")
                || isValidVerse(curFile, vs, "Ps-144.html#vs5")
                || isValidVerse(curFile, vs, "Isa-06.html#vs7")
                || isValidVerse(curFile, vs, "Isa-52.html#vs11")
                || isValidVerse(curFile, vs, "Jer-01.html#vs9")
                || isValidVerse(curFile, vs, "Lam-4.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs6")
                || isValidVerse(curFile, vs, "Dan-08.html#vs5", 18)
                || isValidVerse(curFile, vs, "Dan-09.html#vs21")
                || isValidVerse(curFile, vs, "Dan-10.html#vs10", 16, 18)
                || isValidVerse(curFile, vs, "Hag-2.html#vs13") // ?
                || isValidVerse(curFile, vs, "Zech-02.html#vs8")
                || isValidVerse(curFile, vs, "Matt-08.html#vs3", 15)
                || isValidVerse(curFile, vs, "Matt-09.html#vs20", 29)
                || isValidVerse(curFile, vs, "Matt-17.html#vs7")
                || isValidVerse(curFile, vs, "Matt-20.html#vs34")
                || isValidVerse(curFile, vs, "Mark-01.html#vs41")
                || isValidVerse(curFile, vs, "Mark-05.html#vs27")
                || isValidVerse(curFile, vs, "Mark-07.html#vs33")
                || isValidVerse(curFile, vs, "Luke-05.html#vs13")
                || isValidVerse(curFile, vs, "Luke-06.html#vs19")
                || isValidVerse(curFile, vs, "Luke-07.html#vs14")
                || isValidVerse(curFile, vs, "Luke-08.html#vs44")
                || isValidVerse(curFile, vs, "Luke-11.html#vs46")
                || isValidVerse(curFile, vs, "Luke-22.html#vs51")
                || isValidVerse(curFile, vs, "Luke-24.html#vs39")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs17")
                || isValidVerse(curFile, vs, "Col-2.html#vs21");
    } // isAanraken

    public static boolean isInVerwarringRaken(final File curFile, final String vs, final String arg) {
        if (arg.equals("in verwarring raken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Dan-05.html#vs9")
                || isValidVerse(curFile, vs, "Matt-02.html#vs3")
                || isValidVerse(curFile, vs, "Matt-14.html#vs26")
                || isValidVerse(curFile, vs, "Mark-06.html#vs50")
                || isValidVerse(curFile, vs, "Luke-01.html#vs12", 29)
                || isValidVerse(curFile, vs, "Acts-02.html#vs6");
    } // isInVerwarringRaken

    private static boolean isLosraken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-16.html#vs26");
    } // isLosraken

    private static boolean isOpraken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-17.html#vs16");
    } // isOpraken

    private static boolean isZoekraken() {
        return false;
    } // isZoekraken

    public static boolean isRaken(final File curFile, final String vs, final String arg) {
        return (!isAanraken(curFile, vs)
                && !isInVerwarringRaken(curFile, vs, arg)
                && !isLosraken(curFile, vs)
                && !isOpraken(curFile, vs)
                && !isZoekraken())
                || isValidVerse(curFile, vs, "Gen-32.html#vs25");
    } // isRaken
}
