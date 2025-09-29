package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidDrinken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "dronken" -> isDronken(curFile, vs);
            case "indrinken" -> isIndrinken(curFile, vs);
            case "opdrinken" -> IS_NOT_FOUND;
            case "drinken" -> isDrinken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isIndrinken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-34.html#vs7")
                || isValidVerse(curFile, vs, "Prov-26.html#vs6");
    } // isIndrinken

    public static boolean isDronken(final File curFile, final String vs) {
        return isDrinkenEnDronken(curFile, vs)
                || isValidVerse(curFile, vs, "Deut-32.html#vs")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs13", 14)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs36")
                || isValidVerse(curFile, vs, "Ps-107.html#vs27")
                || isValidVerse(curFile, vs, "Prov-05.html#vs19")
                || isValidVerse(curFile, vs, "Prov-07.html#vs18")
                || isValidVerse(curFile, vs, "Isa-29.html#vs9")
                || isValidVerse(curFile, vs, "Isa-34.html#vs5")
                || isValidVerse(curFile, vs, "Isa-49.html#vs26")
                || isValidVerse(curFile, vs, "Isa-51.html#vs21")
                || isValidVerse(curFile, vs, "Isa-63.html#vs6")
                || isValidVerse(curFile, vs, "Jer-13.html#vs13")
                || isValidVerse(curFile, vs, "Jer-46.html#vs10")
                || isValidVerse(curFile, vs, "Jer-48.html#vs26")
                || isValidVerse(curFile, vs, "Jer-51.html#vs39", 57)
                || isValidVerse(curFile, vs, "Lam-4.html#vs21")
                || isValidVerse(curFile, vs, "Nah-1.html#vs10")
                || isValidVerse(curFile, vs, "Nah-3.html#vs11")
                || isValidVerse(curFile, vs, "Acts-02.html#vs15")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs21")
                || isValidVerse(curFile, vs, "Eph-5.html#vs18")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs7")
                || isValidVerse(curFile, vs, "Rev-17.html#vs2", 6);
    } // isDronken

    public static boolean isDrinkenEnDronken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-09.html#vs21")
                || isValidVerse(curFile, vs, "Gen-43.html#vs34")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs16")
                || isValidVerse(curFile, vs, "Prov-23.html#vs20")
                || isValidVerse(curFile, vs, "Song-5.html#vs1")
                || isValidVerse(curFile, vs, "Isa-56.html#vs12")
                || isValidVerse(curFile, vs, "Jer-25.html#vs27")
                || isValidVerse(curFile, vs, "Jer-51.html#vs7")
                || isValidVerse(curFile, vs, "Hab-2.html#vs15")
                || isValidVerse(curFile, vs, "Hag-1.html#vs6")
                || isValidVerse(curFile, vs, "Luke-12.html#vs45");
    } // isDrinkenEnDronken

    public static boolean isDrinken(final File curFile, final String vs) {
        return (!isIndrinken(curFile, vs)
                && !isDronken(curFile, vs))
                || isDrinkenEnDronken(curFile, vs);
    }  // isDrinken

}
