package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHalen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afhalen" -> isAfhalen(curFile, vs);
            case "binnenhalen" -> isBinnenhalen();
            case "eruit halen" -> isEruitHalen(curFile, vs);
            case "inhalen" -> isInhalen(curFile, vs);
            case "leeghalen" -> isLeeghalen(curFile, vs);
            case "neerhalen" -> isNeerhalen(curFile, vs);
            case "omverhalen" -> isOmverhalen(curFile, vs);
            case "ophalen" -> isOphalen(curFile, vs);
            case "overhalen" -> isOverhalen(curFile, vs);
            case "terughalen" -> isTerughalen(curFile, vs);
            case "tevoors uitchijn halen" -> isTevoorschijnHalen(curFile, vs);
            case "weghalen" -> isWeghalen(curFile, vs);
            case "halen" -> isHalen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfhalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-10.html#vs27")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs17");
    } // isAfhalen

    public static boolean isBinnenhalen() {
        return false;
    } // isBinnenhalen

    public static boolean isEruitHalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-12.html#vs31")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs3")
                || isValidVerse(curFile, vs, "Luke-06.html#vs42");
    } // isEruitHalen

    public static boolean isInhalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs19")
                || isValidVerse(curFile, vs, "Gen-31.html#vs23", 25)
                || isValidVerse(curFile, vs, "Gen-44.html#vs6")
                || isValidVerse(curFile, vs, "Exod-14.html#vs9")
                || isValidVerse(curFile, vs, "Exod-15.html#vs9")
                || isValidVerse(curFile, vs, "Judg-18.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs5")
                || isValidVerse(curFile, vs, "Ps-018.html#vs38")
                || isValidVerse(curFile, vs, "Jer-39.html#vs5")
                || isValidVerse(curFile, vs, "Jer-52.html#vs8")
                || isValidVerse(curFile, vs, "Lam-1.html#vs3");
    } // isInhalen

    public static boolean isLeeghalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-28.html#vs21");
    } // isLeeghalen

    public static boolean isNeerhalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-137.html#vs7")
                || isValidVerse(curFile, vs, "Prov-21.html#vs22")
                || isValidVerse(curFile, vs, "Isa-26.html#vs5")
                || isValidVerse(curFile, vs, "Hos-07.html#vs12");
    } // isNeerhalen

    public static boolean isOmverhalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-22.html#vs5")
                || isValidVerse(curFile, vs, "Jer-01.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs28");
    } // isOmverhalen

    public static boolean isOphalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-45.html#vs18")
                || isValidVerse(curFile, vs, "Deut-24.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs2")
                || isValidVerse(curFile, vs, "1Chr-13.html#vs6")
                || isValidVerse(curFile, vs, "1Chr-15.html#vs3", 12, 14)
                || isValidVerse(curFile, vs, "1Chr-15.html#vs3")
                || isValidVerse(curFile, vs, "Hab-1.html#vs15")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs11");
    } // isOphalen

    public static boolean isOverhalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-14.html#vs15")
                || isValidVerse(curFile, vs, "Prov-07.html#vs21")
                || isValidVerse(curFile, vs, "Matt-27.html#vs20")
                || isValidVerse(curFile, vs, "Acts-18.html#vs13");
    } // isOverhalen

    public static boolean isTerughalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs45")
                || isValidVerse(curFile, vs, "Judg-19.html#vs3")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs10", 11, 12, 43);
    } // isTerughalen

    public static boolean isTevoorschijnHalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs53")
                || isValidVerse(curFile, vs, "Exod-04.html#vs6")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs14")
                || isValidVerse(curFile, vs, "Hab-3.html#vs9")
                || isValidVerse(curFile, vs, "Matt-13.html#vs52")
                || isValidVerse(curFile, vs, "Luke-10.html#vs35")
                || isValidVerse(curFile, vs, "Luke-15.html#vs22");
    } // isTevoorschijnHalen

    public static boolean isWeghalen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-20.html#vs2")
                || isValidVerse(curFile, vs, "Deut-04.html#vs34")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs13")
                || isValidVerse(curFile, vs, "Amos-9.html#vs3");
    } // isWeghalen

    public static boolean isHalen(final File curFile, final String vs) {
        return !isAfhalen(curFile, vs)
                && !isBinnenhalen()
                && !isEruitHalen(curFile, vs)
                && !isInhalen(curFile, vs)
                && !isLeeghalen(curFile, vs)
                && !isNeerhalen(curFile, vs)
                && !isOmverhalen(curFile, vs)
                && !isOphalen(curFile, vs)
                && !isOverhalen(curFile, vs)
                && !isTerughalen(curFile, vs)
                && !isTevoorschijnHalen(curFile, vs)
                && !isWeghalen(curFile, vs);
    } // isHalen


}
