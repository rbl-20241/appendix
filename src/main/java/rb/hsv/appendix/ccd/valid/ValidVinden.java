package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVinden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "genade vinden" -> isGenadeVinden(curFile, vs);
            case "goedvinden" -> isGoedvinden();
            case "plaatsvinden" -> isPlaatsvinden(curFile, vs);
            case "rust vinden" -> isRustVinden(curFile, vs);
            case "schuld vinden" -> isSchuldVinden(curFile, vs);
            case "troost vinden" -> isTroostVinden(curFile, vs);
            case "vreugde vinden" -> isVreugdeVinden(curFile, vs);
            case "vrijmoedigheid vinden" -> isVrijmoedigheidVinden(curFile, vs);
            case "vinden" -> isVinden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isGenadeVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-06.html#vs8")
                || isValidVerse(curFile, vs, "Gen-18.html#vs3")
                || isValidVerse(curFile, vs, "Gen-19.html#vs19")
                || isValidVerse(curFile, vs, "Gen-30.html#vs27")
                || isValidVerse(curFile, vs, "Gen-32.html#vs5")
                || isValidVerse(curFile, vs, "Gen-33.html#vs8", 10, 15)
                || isValidVerse(curFile, vs, "Gen-34.html#vs11")
                || isValidVerse(curFile, vs, "Gen-39.html#vs4")
                || isValidVerse(curFile, vs, "Gen-47.html#vs25", 29)
                || isValidVerse(curFile, vs, "Gen-50.html#vs4")
                || isValidVerse(curFile, vs, "Exod-33.html#vs12", 13, 16, 17)
                || isValidVerse(curFile, vs, "Exod-34.html#vs9")
                || isValidVerse(curFile, vs, "Num-11.html#vs11", 15)
                || isValidVerse(curFile, vs, "Num-32.html#vs5")
                || isValidVerse(curFile, vs, "Deut-24.html#vs1")
                || isValidVerse(curFile, vs, "Judg-06.html#vs17")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs2", 10, 13)
                || isValidVerse(curFile, vs, "1Sam-01.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs3", 29)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs25")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs4")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs19")
                || isValidVerse(curFile, vs, "Esth-05.html#vs2", 8)
                || isValidVerse(curFile, vs, "Esth-07.html#vs3")
                || isValidVerse(curFile, vs, "Esth-08.html#vs5")
                || isValidVerse(curFile, vs, "Prov-21.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs2")
                || isValidVerse(curFile, vs, "Luke-01.html#vs30")
                || isValidVerse(curFile, vs, "Acts-02.html#vs47")
                || isValidVerse(curFile, vs, "Acts-07.html#vs46")
                || isValidVerse(curFile, vs, "Heb-04.html#vs16");
    } // isGenadeVinden

    public static boolean isGoedvinden() {
        return false;
    } // isGoedvinden

    public static boolean isPlaatsvinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-14.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs6", 7)
                || isValidVerse(curFile, vs, "2Chr-29.html#vs28")
                || isValidVerse(curFile, vs, "Isa-29.html#vs15")
                || isValidVerse(curFile, vs, "Matt-28.html#vs2")
                || isValidVerse(curFile, vs, "Luke-02.html#vs2")
                || isValidVerse(curFile, vs, "Acts-16.html#vs26")
                || isValidVerse(curFile, vs, "Heb-07.html#vs12", 18)
                || isValidVerse(curFile, vs, "Heb-09.html#vs22")
                || isValidVerse(curFile, vs, "Rev-11.html#vs13")
                || isValidVerse(curFile, vs, "Didache-16.html#vs4");
    } // isPlaatsvinden

    public static boolean isRustVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-1.html#vs9")
                || isValidVerse(curFile, vs, "Jer-06.html#vs16")
                || isValidVerse(curFile, vs, "Jer-45.html#vs3")
                || isValidVerse(curFile, vs, "Lam-1.html#vs3")
                || isValidVerse(curFile, vs, "Matt-11.html#vs29");
    } // isRustVinden

    public static boolean isSchuldVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-23.html#vs4")
                || isValidVerse(curFile, vs, "John-18.html#vs38")
                || isValidVerse(curFile, vs, "John-19.html#vs4", 6);
    } // isSchuldVinden

    public static boolean isTroostVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs67")
                || isValidVerse(curFile, vs, "Gen-38.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs39");
    } // isTroostVinden

    public static boolean isVreugdeVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-18.html#vs25")
                || isValidVerse(curFile, vs, "Neh-01.html#vs11")
                || isValidVerse(curFile, vs, "Job-21.html#vs14", 21)
                || isValidVerse(curFile, vs, "Ps-001.html#vs2")
                || isValidVerse(curFile, vs, "Ps-005.html#vs5")
                || isValidVerse(curFile, vs, "Ps-016.html#vs3")
                || isValidVerse(curFile, vs, "Ps-034.html#vs13")
                || isValidVerse(curFile, vs, "Ps-035.html#vs27")
                || isValidVerse(curFile, vs, "Ps-037.html#vs23")
                || isValidVerse(curFile, vs, "Ps-040.html#vs7", 9, 15)
                || isValidVerse(curFile, vs, "Ps-051.html#vs8", 18, 21)
                || isValidVerse(curFile, vs, "Ps-068.html#vs31")
                || isValidVerse(curFile, vs, "Ps-070.html#vs3")
                || isValidVerse(curFile, vs, "Ps-073.html#vs25")
                || isValidVerse(curFile, vs, "Ps-109.html#vs17")
                || isValidVerse(curFile, vs, "Ps-111.html#vs2")
                || isValidVerse(curFile, vs, "Ps-112.html#vs1")
                || isValidVerse(curFile, vs, "Ps-119.html#vs35")
                || isValidVerse(curFile, vs, "Ps-147.html#vs10")
                || isValidVerse(curFile, vs, "Prov-18.html#vs2")
                || isValidVerse(curFile, vs, "Eccl-12.html#vs1")
                || isValidVerse(curFile, vs, "Isa-01.html#vs11")
                || isValidVerse(curFile, vs, "Isa-58.html#vs2")
                || isValidVerse(curFile, vs, "Isa-66.html#vs3")
                || isValidVerse(curFile, vs, "Jer-06.html#vs10")
                || isValidVerse(curFile, vs, "Jer-09.html#vs24")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs11")
                || isValidVerse(curFile, vs, "Hos-06.html#vs6")
                || isValidVerse(curFile, vs, "Mic-7.html#vs18")
                || isValidVerse(curFile, vs, "Mal-3.html#vs1");
    } // isVreugdeVinden

    public static boolean isVrijmoedigheidVinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-07.html#vs27")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs25");
    } // isVrijmoedigheidVinden

    public static boolean isVinden(final File curFile, final String vs) {
        return !isGenadeVinden(curFile, vs)
                && !isGoedvinden()
                && !isPlaatsvinden(curFile, vs)
                && !isRustVinden(curFile, vs)
                && !isSchuldVinden(curFile, vs)
                && !isTroostVinden(curFile, vs)
                && !isVreugdeVinden(curFile, vs)
                && !isVrijmoedigheidVinden(curFile, vs);
    } // isVinden
}
