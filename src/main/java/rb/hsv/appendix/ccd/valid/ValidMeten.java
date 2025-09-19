package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidMeten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afmatten" -> isAfmatten(curFile, vs);
            case "afmeten" -> isAfmeten(curFile, vs);
            case "maat" -> isMaat(curFile, vs);
            case "opmeten" -> isOpmeten(curFile, vs);
            case "meten" -> isMeten(curFile, vs); // op gemeten?
            default -> true;
        };
    }

    public static boolean isAfmatten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-23.html#vs4")
                || isValidVerse(curFile, vs, "Jer-02.html#vs24");
    } // isAfmatten

    public static boolean isAfmeten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-3.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs2")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs12");
    } // isAfmeten

    public static boolean isMaat(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs16")
                || isValidVerse(curFile, vs, "Gen-18.html#vs6")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs15", 17)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs25")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs9", 11, 37)
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs1", 16, 18)
                || isValidVerse(curFile, vs, "2Chr-03.html#vs3")
                || isValidVerse(curFile, vs, "Job-28.html#vs25")
                || isValidVerse(curFile, vs, "Ps-039.html#vs5")
                || isValidVerse(curFile, vs, "Isa-40.html#vs12")
                || isValidVerse(curFile, vs, "Jer-51.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs3", 11)
                || isValidVerse(curFile, vs, "Ezek-46.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-48.html#vs30", 32, 33)
                || isValidVerse(curFile, vs, "Dan-08.html#vs23")
                || isValidVerse(curFile, vs, "Hag-2.html#vs17")
                || isValidVerse(curFile, vs, "Matt-07.html#vs2")
                || isValidVerse(curFile, vs, "Matt-13.html#vs33")
                || isValidVerse(curFile, vs, "Matt-23.html#vs32")
                || isValidVerse(curFile, vs, "Mark-04.html#vs24")
                || isValidVerse(curFile, vs, "Luke-06.html#vs38")
                || isValidVerse(curFile, vs, "Luke-13.html#vs21")
                || isValidVerse(curFile, vs, "John-03.html#vs34")
                || isValidVerse(curFile, vs, "Eph-4.html#vs7", 13)
                || isValidVerse(curFile, vs, "1Thess-2.html#vs16")
                || isValidVerse(curFile, vs, "Rev-06.html#vs6")
                || isValidVerse(curFile, vs, "Rev-18.html#vs7")
                || isValidVerse(curFile, vs, "Rev-21.html#vs17");
    } // isMaat

    public static boolean isOpmeten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-42.html#vs15", 19)
                || isValidVerse(curFile, vs, "Rev-21.html#vs15", 16, 17);
    } // isOpmeten

    private static boolean isMeten(final File curFile, final String vs) {
        return (!isAfmatten(curFile, vs)
                && !isAfmeten(curFile, vs)
                && !isMaat(curFile, vs)
                && !isOpmeten(curFile, vs))
                || isValidVerse(curFile, vs, "Job-28.html#vs25");
    }  // isMeten

}
