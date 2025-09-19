package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBuigen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afbuigen" -> isAfbuigen(curFile, vs);
            case "boog (kromming)" -> isBoog_Kromming(curFile, vs);
            case "boog (regenboog)" -> isRegenboog(curFile, vs);
            case "boog (wapen)" -> isBoog_Wapen(curFile, vs);
            case "neerbuigen" -> isNeerbuigen(curFile, vs);
            case "ombuigen" -> isOmbuigen();
            case "vooroverbuigen" -> isVooroverbuigen(curFile, vs);
            case "buigen" -> isBuigen(curFile, vs); // op gemeten?
            default -> true;
        };
    }

    public static boolean isAfbuigen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-15.html#vs3", 7, 10)
                || isValidVerse(curFile, vs, "Josh-16.html#vs6")
                || isValidVerse(curFile, vs, "Josh-18.html#vs14");
    } // isAfbuigen

    public static boolean isBoog_Kromming(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-15.html#vs9", 11)
                || isValidVerse(curFile, vs, "Josh-18.html#vs14", 17);
    } // isBoog_Kromming

    public static boolean isBoog_Wapen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-21.html#vs16")
                || isValidVerse(curFile, vs, "Gen-27.html#vs3")
                || isValidVerse(curFile, vs, "Gen-48.html#vs22")
                || isValidVerse(curFile, vs, "Gen-49.html#vs24")
                || isValidVerse(curFile, vs, "Josh-24.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs3")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs18", 22)
                || isValidVerse(curFile, vs, "2Sam-22.html#vs35")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs34")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs22")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs15", 16)
                || isValidVerse(curFile, vs, "1Chr-05.html#vs18")
                || isValidVerse(curFile, vs, "1Chr-08.html#vs40")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-17.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-26.html#vs14")
                || isValidVerse(curFile, vs, "Neh-04.html#vs13", 16)
                || isValidVerse(curFile, vs, "Job-20.html#vs24")
                || isValidVerse(curFile, vs, "Job-29.html#vs20")
                || isValidVerse(curFile, vs, "Ps-007.html#vs13")
                || isValidVerse(curFile, vs, "Ps-011.html#vs2")
                || isValidVerse(curFile, vs, "Ps-018.html#vs35")
                || isValidVerse(curFile, vs, "Ps-021.html#vs13")
                || isValidVerse(curFile, vs, "Ps-037.html#vs14", 15)
                || isValidVerse(curFile, vs, "Ps-044.html#vs7")
                || isValidVerse(curFile, vs, "Ps-046.html#vs10")
                || isValidVerse(curFile, vs, "Ps-076.html#vs4")
                || isValidVerse(curFile, vs, "Ps-078.html#vs57")
                || isValidVerse(curFile, vs, "Isa-05.html#vs28")
                || isValidVerse(curFile, vs, "Isa-07.html#vs24")
                || isValidVerse(curFile, vs, "Isa-13.html#vs18")
                || isValidVerse(curFile, vs, "Isa-21.html#vs15")
                || isValidVerse(curFile, vs, "Isa-41.html#vs2")
                || isValidVerse(curFile, vs, "Jer-06.html#vs23")
                || isValidVerse(curFile, vs, "Jer-09.html#vs3")
                || isValidVerse(curFile, vs, "Jer-46.html#vs9")
                || isValidVerse(curFile, vs, "Jer-49.html#vs35")
                || isValidVerse(curFile, vs, "Jer-50.html#vs14", 29, 42)
                || isValidVerse(curFile, vs, "Jer-51.html#vs3", 56)
                || isValidVerse(curFile, vs, "Lam-2.html#vs4")
                || isValidVerse(curFile, vs, "Lam-3.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-39.html#vs3", 9)
                || isValidVerse(curFile, vs, "Hos-01.html#vs5", 7)
                || isValidVerse(curFile, vs, "Hos-02.html#vs17")
                || isValidVerse(curFile, vs, "Hos-07.html#vs16")
                || isValidVerse(curFile, vs, "Hos-07.html#vs16")
                || isValidVerse(curFile, vs, "Hab-3.html#vs9")
                || isValidVerse(curFile, vs, "Zech-09.html#vs13")
                || isValidVerse(curFile, vs, "Rev-06.html#vs2");
    } // isBoog_Wapen

    public static boolean isNeerbuigen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs26", 48)
                || isValidVerse(curFile, vs, "Gen-33.html#vs6", 7)
                || isValidVerse(curFile, vs, "Gen-37.html#vs7", 9, 10)
                || isValidVerse(curFile, vs, "Gen-42.html#vs6")
                || isValidVerse(curFile, vs, "Gen-43.html#vs28")
                || isValidVerse(curFile, vs, "Gen-47.html#vs31")
                || isValidVerse(curFile, vs, "Exod-04.html#vs31")
                || isValidVerse(curFile, vs, "Exod-12.html#vs27")
                || isValidVerse(curFile, vs, "Exod-24.html#vs1")
                || isValidVerse(curFile, vs, "Exod-32.html#vs8")
                || isValidVerse(curFile, vs, "Exod-33.html#vs10")
                || isValidVerse(curFile, vs, "Exod-34.html#vs8")
                || isValidVerse(curFile, vs, "Lev-26.html#vs1")
                || isValidVerse(curFile, vs, "Num-22.html#vs31")
                || isValidVerse(curFile, vs, "Num-25.html#vs2")
                || isValidVerse(curFile, vs, "Deut-04.html#vs19")
                || isValidVerse(curFile, vs, "Deut-30.html#vs17")
                || isValidVerse(curFile, vs, "Josh-05.html#vs14")
                || isValidVerse(curFile, vs, "Judg-02.html#vs12", 17, 19)
                || isValidVerse(curFile, vs, "1Sam-01.html#vs3", 19, 28)
                || isValidVerse(curFile, vs, "1Sam-02.html#vs36")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs31")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-09.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs33")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs16", 23, 31, 53)
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs54")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs18")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs16")
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs3", 21)
                || isValidVerse(curFile, vs, "1Chr-16.html#vs29")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs28", 29)
                || isValidVerse(curFile, vs, "2Chr-33.html#vs3")
                || isValidVerse(curFile, vs, "Neh-08.html#vs7")
                || isValidVerse(curFile, vs, "Neh-09.html#vs3", 6)
                || isValidVerse(curFile, vs, "Esth-03.html#vs2")
                || isValidVerse(curFile, vs, "Job-01.html#vs20")
                || isValidVerse(curFile, vs, "Ps-017.html#vs11")
                || isValidVerse(curFile, vs, "Ps-029.html#vs2")
                || isValidVerse(curFile, vs, "Ps-042.html#vs6", 7, 12)
                || isValidVerse(curFile, vs, "Ps-043.html#vs5")
                || isValidVerse(curFile, vs, "Ps-045.html#vs12")
                || isValidVerse(curFile, vs, "Ps-096.html#vs9")
                || isValidVerse(curFile, vs, "Ps-097.html#vs7")
                || isValidVerse(curFile, vs, "Ps-099.html#vs5", 9)
                || isValidVerse(curFile, vs, "Ps-106.html#vs19")
                || isValidVerse(curFile, vs, "Isa-02.html#vs8", 20)
                || isValidVerse(curFile, vs, "Isa-44.html#vs15", 17)
                || isValidVerse(curFile, vs, "Isa-46.html#vs6")
                || isValidVerse(curFile, vs, "Isa-66.html#vs23")
                || isValidVerse(curFile, vs, "Jer-07.html#vs2")
                || isValidVerse(curFile, vs, "Jer-13.html#vs10")
                || isValidVerse(curFile, vs, "Jer-25.html#vs6")
                || isValidVerse(curFile, vs, "Jer-26.html#vs2")
                || isValidVerse(curFile, vs, "Lam-3.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-08.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-46.html#vs9")
                || isValidVerse(curFile, vs, "Zech-14.html#vs16", 17)
                || isValidVerse(curFile, vs, "Heb-11.html#vs21");
    } // isNeerbuigen

    public static boolean isOmbuigen() {
        return false;
    } // isOmbuigen

    public static boolean isRegenboog(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-09.html#vs13", 14, 16);
    } // isRegenboog

    public static boolean isVooroverbuigen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-18.html#vs42")
                || isValidVerse(curFile, vs, "John-20.html#vs11");
    } // isVooroverbuigen

    private static boolean isBuigen(final File curFile, final String vs) {
        return !isAfbuigen(curFile, vs)
                && !isBoog_Kromming(curFile, vs)
                && !isBoog_Wapen(curFile, vs)
                && !isNeerbuigen(curFile, vs)
                && !isOmbuigen()
                && !isRegenboog(curFile, vs)
                && !isVooroverbuigen(curFile, vs);
    }  // isBuigen

}
