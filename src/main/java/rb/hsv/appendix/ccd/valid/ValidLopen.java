package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidHopen.isTeHoopLopen;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLopen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanlopen" -> isAanlopen();
            case "achter [iemand] aan lopen" -> isAchterIemandAanLopen(curFile, vs);
            case "achternalopen" -> isAchternalopen();
            case "achteruitlopen" -> isAchteruitlopen(curFile, vs);
            case "binnenlopen" -> isBinnenlopen(curFile, vs);
            case "gevaar lopen" -> isGevaarLopen(curFile, vs);
            case "hardlopen" -> isHardlopen();
            case "loop" -> isLoop(curFile, vs);
            case "meelopen" -> isMeelopen(curFile, vs);
            case "nalopen" -> isNalopen();
            case "onder de voet lopen" -> isOnderDeVoetLopen(curFile, vs, arg);
            case "op de loop" -> isOpDeLoop(curFile, vs);
            case "oploop" -> isOploop(curFile, vs);
            case "oplopen" -> isOplopen();
            case "overlopen" -> isOverlopen(curFile, vs);
            case "rondlopen" -> isRondlopen(curFile, vs);
            case "tegemoetlopen" -> isTegemoetlopen(curFile, vs);
            case "uitlopen" -> isUitlopen(curFile, vs);
            case "voor [iets/iemand] uit lopen" -> isVoorIemandUitLopen(curFile, vs);
            case "voorbijlopen" -> isVoorbijlopen();
            case "weglopen" -> isWeglopen(curFile, vs);
            case "lopen" -> isLopen(curFile, vs, arg); // op gemeten?
            default -> true;
        };
    }

    public static boolean isAanlopen() {
        return IS_NOT_FOUND;
    } // isAanlopen

    public static boolean isAchterIemandAanLopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-03.html#vs16")
                || isValidVerse(curFile, vs, "John-12.html#vs19")
                || isValidVerse(curFile, vs, "Acts-16.html#vs17");
    } // isAchterAanLopen

    public static boolean isAchternalopen() {
        return IS_NOT_FOUND;
    } // isAchternalopen

    public static boolean isAchteruitlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-09.html#vs23");
    } // isAchteruitlopen

    public static boolean isBinnenlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-10.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs21");
    } // isBinnenlopen

    public static boolean isGevaarLopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-10.html#vs9")
                || isValidVerse(curFile, vs, "Acts-19.html#vs27", 40)
                || isValidVerse(curFile, vs, "1Cor-15.html#vs30");
    } // isGevaarLopen

    public static boolean isHardlopen() {
        return IS_NOT_FOUND;
    } // isHardlopen

    public static boolean isLoop(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-06.html#vs18")
                || isValidVerse(curFile, vs, "Job-10.html#vs1")
                || isValidVerse(curFile, vs, "Ps-104.html#vs10")
                || isValidVerse(curFile, vs, "Acts-13.html#vs25")
                || isValidVerse(curFile, vs, "Acts-20.html#vs24")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs7");
    } // isLoop

    public static boolean isMeelopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-050.html#vs18");
    } // isMeelopen

    public static boolean isNalopen() {
        return IS_NOT_FOUND;
    } // isNalopen

    public static boolean isOnderDeVoetLopen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("onder de voet lopen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Judg-20.html#vs43")
                || isValidVerse(curFile, vs, "Luke-12.html#vs1");
    } // isOnderDeVoetLopen

    public static boolean isOpDeLoop(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-07.html#vs21");
    } // isOpDeLoop

    public static boolean isOploop(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-14.html#vs5")
                || isValidVerse(curFile, vs, "Acts-17.html#vs5")
                || isValidVerse(curFile, vs, "Acts-19.html#vs40");
    } // isOploop

    public static boolean isOplopen() {
        return IS_NOT_FOUND;
    } // isOplopen

    public static boolean isOverlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-12.html#vs19", 20)
                || isValidVerse(curFile, vs, "Prov-10.html#vs31")
                || isValidVerse(curFile, vs, "Jer-41.html#vs14");
    } // isOverlopen

    public static boolean isRondlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-11.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs27")
                || isValidVerse(curFile, vs, "Job-24.html#vs10")
                || isValidVerse(curFile, vs, "Job-34.html#vs8")
                || isValidVerse(curFile, vs, "Ps-035.html#vs14")
                || isValidVerse(curFile, vs, "Ps-039.html#vs7")
                || isValidVerse(curFile, vs, "Jer-49.html#vs3")
                || isValidVerse(curFile, vs, "Luke-20.html#vs46")
                || isValidVerse(curFile, vs, "John-10.html#vs23")
                || isValidVerse(curFile, vs, "Acts-03.html#vs8")
                || isValidVerse(curFile, vs, "Acts-14.html#vs10");
    } // isRondlopen

    public static boolean isTegemoetlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs2")
                || isValidVerse(curFile, vs, "Gen-24.html#vs65")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs48")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs26");
    } // isTegemoetlopen

    public static boolean isUitlopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-14.html#vs7")
                || isValidVerse(curFile, vs, "Hos-10.html#vs4")
                || isValidVerse(curFile, vs, "Matt-03.html#vs5")
                || isValidVerse(curFile, vs, "Matt-08.html#vs34")
                || isValidVerse(curFile, vs, "Mark-01.html#vs5")
                || isValidVerse(curFile, vs, "Mark-05.html#vs14")
                || isValidVerse(curFile, vs, "Mark-08.html#vs11");
    } // isUitlopen

    public static boolean isVoorIemandUitLopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-08.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs41")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs30")
                || isValidVerse(curFile, vs, "Luke-22.html#vs47");
    } // isVoorIemandUitLopen

    public static boolean isVoorbijlopen() {
        return IS_NOT_FOUND;
    } // isVoorbijlopen

    public static boolean isWeglopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs28")
                || isValidVerse(curFile, vs, "Gen-29.html#vs12")
                || isValidVerse(curFile, vs, "Num-11.html#vs27")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs36")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs19")
                || isValidVerse(curFile, vs, "2Sam-17.html#vs18")
                || isValidVerse(curFile, vs, "Job-14.html#vs11")
                || isValidVerse(curFile, vs, "Zech-04.html#vs12");
    } // isWeglopen

    private static boolean isLopen(final File curFile, final String vs, final String arg) {
        return !isTeHoopLopen(curFile, vs, arg)
                && !isAanlopen()
                && !isAchterIemandAanLopen(curFile, vs)
                && !isAchternalopen()
                && !isAchteruitlopen(curFile, vs)
                && !isBinnenlopen(curFile, vs)
                && !isGevaarLopen(curFile, vs)
                && !isHardlopen()
                && !isLoop(curFile, vs)
                && !isMeelopen(curFile, vs)
                && !isNalopen()
                && !isOnderDeVoetLopen(curFile, vs, arg)
                && !isOpDeLoop(curFile, vs)
                && !isOploop(curFile, vs)
                && !isOplopen()
                && !isOverlopen(curFile, vs)
                && !isRondlopen(curFile, vs)
                && !isTegemoetlopen(curFile, vs)
                && !isUitlopen(curFile, vs)
                && !isVoorIemandUitLopen(curFile, vs)
                && !isVoorbijlopen()
                && !isWeglopen(curFile, vs);
    }  // isLopen

}
