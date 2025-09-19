package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVertrouwen {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "toevertrouwen" -> isToevertrouwen(curFile, vs);
            case "vertrouwen (zelfstandig naamwoord)" -> isVertrouwen_ZelfstandigNaamwoord(curFile, vs, arg);
            case "vertrouwen (werkwoord)" -> isVertrouwen_Werkwoord(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isToevertrouwen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-037.html#vs5")
                || isValidVerse(curFile, vs, "Prov-16.html#vs3")
                || isValidVerse(curFile, vs, "John-02.html#vs24")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs4")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs2");
    } // isToevertrouwen

    public static boolean isVertrouwen_ZelfstandigNaamwoord(final File curFile, final String vs, final @NotNull String arg) {
        return isValidVerse(curFile, vs, "2Kgs-18.html#vs19", 20)
                || isValidVerse(curFile, vs, "Job-06.html#vs20")
                || isValidVerse(curFile, vs, "Job-08.html#vs14")
                || isValidVerse(curFile, vs, "Job-18.html#vs14")
                || isValidVerse(curFile, vs, "Job-31.html#vs24")
                || isValidVerse(curFile, vs, "Ps-022.html#vs10")
                || isValidVerse(curFile, vs, "Ps-040.html#vs5")
                || isValidVerse(curFile, vs, "Ps-065.html#vs6")
                || isValidVerse(curFile, vs, "Ps-071.html#vs5")
                || isValidVerse(curFile, vs, "Prov-14.html#vs26")
                || isValidVerse(curFile, vs, "Prov-22.html#vs19")
                || isValidVerse(curFile, vs, "Isa-30.html#vs15")
                || isValidVerse(curFile, vs, "Isa-36.html#vs4", 5)
                || isValidVerse(curFile, vs, "Jer-07.html#vs4")
                || isValidVerse(curFile, vs, "Jer-17.html#vs5")
                || (arg.equals("vertrouwen") && isValidVerse(curFile, vs, "Jer-17.html#vs7"))
                || isValidVerse(curFile, vs, "Jer-48.html#vs7", 13)
                || isValidVerse(curFile, vs, "Ezek-29.html#vs16")
                || isValidVerse(curFile, vs, "Acts-14.html#vs3")
                || isValidVerse(curFile, vs, "Acts-24.html#vs10")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs4")
                || isValidVerse(curFile, vs, "2Cor-08.html#vs22")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs4")
                || isValidVerse(curFile, vs, "Eph-3.html#vs12")
                || isValidVerse(curFile, vs, "Phil-1.html#vs14")
                || isValidVerse(curFile, vs, "Heb-02.html#vs13");
    } // isVertrouwen_ZelfstandigNaamwoord

    private static boolean isVertrouwen_Werkwoord(final File curFile, final String vs, final @NotNull String arg) {
        return (!isToevertrouwen(curFile, vs)
                && !isVertrouwen_ZelfstandigNaamwoord(curFile, vs, arg))
                || isValidVerse(curFile, vs, "Ps-037.html#vs5")
                || (arg.equals("vertrouwt") && isValidVerse(curFile, vs, "Jer-17.html#vs7"));
    }  // isVertrouwen_Werkwoord

}
