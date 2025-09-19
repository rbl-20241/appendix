package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHopen {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "hoop (berg)" -> isHoop_Berg(curFile, vs);
            case "hoop (veel)" -> isHoop_Veel(curFile, vs);
            case "hoop (verwachting)" -> isHoop_Verwachting(curFile, vs);
            case "hopen (stapelen)" -> isHopen_Stapelen(curFile, vs);
            case "ophopen" -> isOphopen(curFile, vs);
            case "te loop hopen" -> isTeHoopLopen(curFile, vs, arg);
            case "wanhoop" -> isWanhoop(curFile, vs);
            case "wanhopen" -> isWanhopen(curFile, vs);
            case "hopen (verwachten)" -> isHopen_Verwachten(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isHoop_Berg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs46")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs8")
                || isValidVerse(curFile, vs, "Song-7.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs18")
                || isValidVerse(curFile, vs, "Jas-3.html#vs5");
    } // isHoop_Berg

    public static boolean isHoop_Veel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-08.html#vs14")
                || isValidVerse(curFile, vs, "Judg-15.html#vs16")
                || isValidVerse(curFile, vs, "Neh-13.html#vs15");
    } // isHoop_Veel

    public static boolean isHoop_Verwachting(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-1.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-27.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs15")
                || isValidVerse(curFile, vs, "Ezra-10.html#vs2")
                || isValidVerse(curFile, vs, "Job-04.html#vs6")
                || isValidVerse(curFile, vs, "Job-05.html#vs16")
                || isValidVerse(curFile, vs, "Job-07.html#vs6")
                || isValidVerse(curFile, vs, "Job-08.html#vs13", 14)
                || isValidVerse(curFile, vs, "Job-11.html#vs18", 20)
                || isValidVerse(curFile, vs, "Job-14.html#vs7", 19)
                || isValidVerse(curFile, vs, "Job-17.html#vs15")
                || isValidVerse(curFile, vs, "Job-19.html#vs10")
                || isValidVerse(curFile, vs, "Job-27.html#vs8")
                || isValidVerse(curFile, vs, "Job-31.html#vs24")
                || isValidVerse(curFile, vs, "Ps-009.html#vs19")
                || isValidVerse(curFile, vs, "Ps-033.html#vs17")
                || isValidVerse(curFile, vs, "Ps-039.html#vs8")
                || isValidVerse(curFile, vs, "Ps-062.html#vs11")
                || isValidVerse(curFile, vs, "Ps-071.html#vs5")
                || isValidVerse(curFile, vs, "Ps-078.html#vs7")
                || isValidVerse(curFile, vs, "Ps-119.html#vs116")
                || isValidVerse(curFile, vs, "Prov-03.html#vs26")
                || isValidVerse(curFile, vs, "Prov-10.html#vs28")
                || isValidVerse(curFile, vs, "Prov-11.html#vs7", 23)
                || isValidVerse(curFile, vs, "Prov-19.html#vs18")
                || isValidVerse(curFile, vs, "Prov-23.html#vs18")
                || isValidVerse(curFile, vs, "Prov-24.html#vs14")
                || isValidVerse(curFile, vs, "Prov-26.html#vs12")
                || isValidVerse(curFile, vs, "Prov-29.html#vs20")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs4")
                || isValidVerse(curFile, vs, "Isa-57.html#vs10")
                || isValidVerse(curFile, vs, "Jer-02.html#vs25")
                || isValidVerse(curFile, vs, "Jer-18.html#vs12")
                || isValidVerse(curFile, vs, "Jer-23.html#vs16")
                || isValidVerse(curFile, vs, "Jer-29.html#vs11")
                || isValidVerse(curFile, vs, "Jer-31.html#vs17")
                || isValidVerse(curFile, vs, "Jer-50.html#vs7")
                || isValidVerse(curFile, vs, "Lam-3.html#vs29")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs11")
                || isValidVerse(curFile, vs, "Hos-02.html#vs14")
                || isValidVerse(curFile, vs, "Zech-09.html#vs12")
                || isValidVerse(curFile, vs, "John-05.html#vs45")
                || isValidVerse(curFile, vs, "Acts-02.html#vs26")
                || isValidVerse(curFile, vs, "Acts-16.html#vs19")
                || isValidVerse(curFile, vs, "Acts-23.html#vs6")
                || isValidVerse(curFile, vs, "Acts-24.html#vs15")
                || isValidVerse(curFile, vs, "Acts-26.html#vs6", 7)
                || isValidVerse(curFile, vs, "Acts-27.html#vs20")
                || isValidVerse(curFile, vs, "Acts-28.html#vs20")
                || isValidVerse(curFile, vs, "Rom-05.html#vs2", 4, 5)
                || isValidVerse(curFile, vs, "Rom-08.html#vs21", 24)
                || isValidVerse(curFile, vs, "Rom-12.html#vs12")
                || isValidVerse(curFile, vs, "Rom-15.html#vs4", 13)
                || isValidVerse(curFile, vs, "1Cor-09.html#vs10")
                || isValidVerse(curFile, vs, "1Cor-13.html#vs13")
                || isValidVerse(curFile, vs, "1Cor-15.html#vs19")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs7", 10)
                || isValidVerse(curFile, vs, "2Cor-03.html#vs12")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs15")
                || isValidVerse(curFile, vs, "Eph-1.html#vs12", 18)
                || isValidVerse(curFile, vs, "Eph-2.html#vs12")
                || isValidVerse(curFile, vs, "Eph-4.html#vs4")
                || isValidVerse(curFile, vs, "Phil-1.html#vs20")
                || isValidVerse(curFile, vs, "Col-1.html#vs5", 23, 27)
                || isValidVerse(curFile, vs, "1Thess-1.html#vs3")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs19")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs13")
                || isValidVerse(curFile, vs, "1Thess-5.html#vs8")
                || isValidVerse(curFile, vs, "2Thess-2.html#vs16")
                || isValidVerse(curFile, vs, "1Tim-1.html#vs1")
                || isValidVerse(curFile, vs, "1Tim-3.html#vs14")
                || isValidVerse(curFile, vs, "1Tim-4.html#vs10")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs17")
                || isValidVerse(curFile, vs, "Titus-1.html#vs2")
                || isValidVerse(curFile, vs, "Titus-2.html#vs13")
                || isValidVerse(curFile, vs, "Titus-3.html#vs7")
                || isValidVerse(curFile, vs, "Heb-03.html#vs6")
                || isValidVerse(curFile, vs, "Heb-06.html#vs11", 18, 19)
                || isValidVerse(curFile, vs, "Heb-07.html#vs19")
                || isValidVerse(curFile, vs, "Heb-10.html#vs23")
                || isValidVerse(curFile, vs, "1Pet-1.html#vs3", 21)
                || isValidVerse(curFile, vs, "1Pet-3.html#vs15")
                || isValidVerse(curFile, vs, "1John-3.html#vs3");
    } // isHoop_Verwachting

    public static boolean isHopen_Stapelen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-25.html#vs22")
                || isValidVerse(curFile, vs, "Isa-30.html#vs1")
                || isValidVerse(curFile, vs, "Hab-1.html#vs10")
                || isValidVerse(curFile, vs, "Rom-12.html#vs20");
    } // isHopen_Stapelen

    public static boolean isOphopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-36.html#vs13")
                || isValidVerse(curFile, vs, "Prov-25.html#vs22")
                || isValidVerse(curFile, vs, "Hab-1.html#vs10")
                || isValidVerse(curFile, vs, "Rom-02.html#vs5");
    } // isOphopen

    public static boolean isTeHoopLopen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te hoop lopen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-08.html#vs9")
                || isValidVerse(curFile, vs, "Jer-26.html#vs9")
                || isValidVerse(curFile, vs, "Luke-11.html#vs29")
                || isValidVerse(curFile, vs, "Acts-21.html#vs30");
    } // isTeHoopLopen

    public static boolean isWanhoop(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-09.html#vs23")
                || isValidVerse(curFile, vs, "Ezek-07.html#vs27");
    } // isWanhoop

    public static boolean isWanhopen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-02.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs7")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs8");
    } // isWanhopen

    public static boolean isHopen_Verwachten(final File curFile, final String vs, final String arg) {
        return !isHoop_Berg(curFile, vs)
                && !isHoop_Veel(curFile, vs)
                && !isHoop_Verwachting(curFile, vs)
                && !isHopen_Stapelen(curFile, vs)
                && !isOphopen(curFile, vs)
                && !isTeHoopLopen(curFile, vs, arg)
                && !isWanhoop(curFile, vs)
                && !isWanhopen(curFile, vs);
    } // isHopen_Verwachten
}
