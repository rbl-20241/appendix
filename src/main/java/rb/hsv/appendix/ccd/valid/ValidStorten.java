package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStorten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "in de strijd storten" -> isInDeStrijdStorten(curFile, vs, arg);
            case "in het ongeluk storten" -> isInHetOngelukStorten(curFile, vs, arg);
            case "in het onheil storten" -> isInHetOnheilStorten(curFile, vs, arg);
            case "in het verderf storten" -> isInHetVerderfStorten(curFile, vs, arg);
            case "instorten" -> isInstorten(curFile, vs);
            case "neerstorten" -> isNeerstorten(curFile, vs);
            case "uitstorten" -> isUitstorten(curFile, vs);
            case "storten" -> isStorten(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isInDeStrijdStorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in de strijd storten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Jer-08.html#vs6");
    } // isInDeStrijdStorten

    public static boolean isInHetOngelukStorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in het ongeluk storten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-34.html#vs30")
                || isValidVerse(curFile, vs, "Josh-06.html#vs18")
                || isValidVerse(curFile, vs, "Josh-07.html#vs25")
                || isValidVerse(curFile, vs, "Judg-11.html#vs35")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs29")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs17", 18)
                || isValidVerse(curFile, vs, "1Chr-02.html#vs7")
                || isValidVerse(curFile, vs, "Prov-11.html#vs17", 29)
                || isValidVerse(curFile, vs, "Prov-15.html#vs27");
    } // isInHetOngelukStorten

    public static boolean isInHetOnheilStorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in het onheil storten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Kgs-14.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs19")
                || isValidVerse(curFile, vs, "Prov-21.html#vs12");
    } // isInHetOnheilStorten

    public static boolean isInHetVerderfStorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("in het verderf storten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Job-12.html#vs19")
                || isValidVerse(curFile, vs, "Prov-13.html#vs6")
                || isValidVerse(curFile, vs, "Prov-22.html#vs12");
    } // isInHetVerderfStorten

    public static boolean isInstorten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-06.html#vs20")
                || isValidVerse(curFile, vs, "Matt-07.html#vs25", 27)
                || isValidVerse(curFile, vs, "Luke-06.html#vs49")
                || isValidVerse(curFile, vs, "Rev-11.html#vs13")
                || isValidVerse(curFile, vs, "Rev-16.html#vs19");
    } // isInstorten

    public static boolean isNeerstorten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-056.html#vs8")
                || isValidVerse(curFile, vs, "Ps-063.html#vs11")
                || isValidVerse(curFile, vs, "Isa-26.html#vs5")
                || isValidVerse(curFile, vs, "Jer-23.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs14");
    } // isNeerstorten

    public static boolean isUitstorten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-30.html#vs16")
                || isValidVerse(curFile, vs, "Ps-042.html#vs5")
                || isValidVerse(curFile, vs, "Ps-055.html#vs4")
                || isValidVerse(curFile, vs, "Ps-062.html#vs9")
                || isValidVerse(curFile, vs, "Ps-069.html#vs25")
                || isValidVerse(curFile, vs, "Ps-079.html#vs6")
                || isValidVerse(curFile, vs, "Ps-107.html#vs40")
                || isValidVerse(curFile, vs, "Ps-142.html#vs3")
                || isValidVerse(curFile, vs, "Jer-10.html#vs25")
                || isValidVerse(curFile, vs, "Jer-38.html#vs26")
                || isValidVerse(curFile, vs, "Jer-42.html#vs9")
                || isValidVerse(curFile, vs, "Lam-2.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs31")
                || isValidVerse(curFile, vs, "Ezek-36.html#vs18")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs8");
    } // isUitstorten

    public static boolean isStorten(final File curFile, final String vs, @NotNull final String arg) {
        return !isInDeStrijdStorten(curFile, vs, arg)
                && !isInHetOngelukStorten(curFile, vs, arg)
                && !isInHetOnheilStorten(curFile, vs, arg)
                && !isInHetVerderfStorten(curFile, vs, arg)
                && !isInstorten(curFile, vs)
                && !isNeerstorten(curFile, vs)
                && !isUitstorten(curFile, vs);
    } // isStorten
}
