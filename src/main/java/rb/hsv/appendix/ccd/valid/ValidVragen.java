package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVragen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "afvragen" -> isAfvragen(curFile, vs);
            case "navraag" -> isNavraag(curFile, vs);
            case "navragen" -> isNavragen();
            case "terugvragen" -> isTerugvragen(curFile, vs);
            case "vraag" -> isVraag(curFile, vs);
            case "vroeg" -> isVroeg(curFile, vs);
            case "vragen" -> isVragen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAfvragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-01.html#vs29")
                || isValidVerse(curFile, vs, "Luke-22.html#vs23")
                || isValidVerse(curFile, vs, "John-16.html#vs19")
                || isValidVerse(curFile, vs, "Acts-05.html#vs24");
    } // isAfvragen

    public static boolean isNavraag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-06.html#vs29")
                || isValidVerse(curFile, vs, "Job-08.html#vs8")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs25", 27);
    } // isNavraag

    public static boolean isNavragen() {
        return IS_NOT_FOUND;
    } // isNavragen

    public static boolean isTerugvragen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Didache-01.html#vs4", 5);
    } // isTerugvragen

    public static boolean isVraag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-02.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs2")
                || isValidVerse(curFile, vs, "Esth-05.html#vs6", 7, 8)
                || isValidVerse(curFile, vs, "Esth-07.html#vs2", 3)
                || isValidVerse(curFile, vs, "Esth-09.html#vs12")
                || isValidVerse(curFile, vs, "Mark-09.html#vs10")
                || isValidVerse(curFile, vs, "Mark-11.html#vs29")
                || isValidVerse(curFile, vs, "Mark-14.html#vs61")
                || isValidVerse(curFile, vs, "Mark-15.html#vs4")
                || isValidVerse(curFile, vs, "Luke-02.html#vs46")
                || isValidVerse(curFile, vs, "Luke-07.html#vs19", 20)
                || isValidVerse(curFile, vs, "Luke-09.html#vs45", 46)
                || isValidVerse(curFile, vs, "Luke-20.html#vs3", 21)
                || isValidVerse(curFile, vs, "Luke-22.html#vs68")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs21");
    } // isVraag

    public static boolean isVroeg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs27")
                || isValidVerse(curFile, vs, "Gen-20.html#vs8")
                || isValidVerse(curFile, vs, "Gen-21.html#vs14")
                || isValidVerse(curFile, vs, "Gen-22.html#vs3")
                || isValidVerse(curFile, vs, "Gen-26.html#vs31")
                || isValidVerse(curFile, vs, "Gen-28.html#vs18")
                || isValidVerse(curFile, vs, "Gen-31.html#vs55")
                || isValidVerse(curFile, vs, "Exod-08.html#vs20")
                || isValidVerse(curFile, vs, "Exod-09.html#vs13")
                || isValidVerse(curFile, vs, "Exod-13.html#vs14")
                || isValidVerse(curFile, vs, "Exod-24.html#vs4")
                || isValidVerse(curFile, vs, "Exod-32.html#vs6")
                || isValidVerse(curFile, vs, "Exod-34.html#vs4")
                || isValidVerse(curFile, vs, "Num-14.html#vs40")
                || isValidVerse(curFile, vs, "Deut-11.html#vs14")
                || isValidVerse(curFile, vs, "Josh-03.html#vs1")
                || isValidVerse(curFile, vs, "Josh-06.html#vs12", 15)
                || isValidVerse(curFile, vs, "Josh-07.html#vs16")
                || isValidVerse(curFile, vs, "Josh-08.html#vs10", 14)
                || isValidVerse(curFile, vs, "Judg-06.html#vs28", 38)
                || isValidVerse(curFile, vs, "Judg-07.html#vs1")
                || isValidVerse(curFile, vs, "Judg-09.html#vs3")
                || isValidVerse(curFile, vs, "Judg-19.html#vs5", 8, 9)
                || isValidVerse(curFile, vs, "1Sam-01.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-05.html#vs3", 4)
                || isValidVerse(curFile, vs, "1Sam-09.html#vs26")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs16", 20)
                || isValidVerse(curFile, vs, "1Sam-29.html#vs10", 11)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs2")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs22")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs35")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs15")
                || isValidVerse(curFile, vs, "Job-01.html#vs5")
                || isValidVerse(curFile, vs, "Ps-127.html#vs2")
                || isValidVerse(curFile, vs, "Prov-27.html#vs14")
                || isValidVerse(curFile, vs, "Song-7.html#vs12")
                || isValidVerse(curFile, vs, "Isa-05.html#vs11")
                || isValidVerse(curFile, vs, "Isa-28.html#vs4")
                || isValidVerse(curFile, vs, "Isa-37.html#vs36")
                || isValidVerse(curFile, vs, "Jer-05.html#vs24")
                || isValidVerse(curFile, vs, "Jer-07.html#vs13", 25)
                || isValidVerse(curFile, vs, "Jer-11.html#vs7")
                || isValidVerse(curFile, vs, "Jer-24.html#vs2")
                || isValidVerse(curFile, vs, "Jer-25.html#vs3", 4)
                || isValidVerse(curFile, vs, "Jer-26.html#vs5")
                || isValidVerse(curFile, vs, "Jer-29.html#vs19")
                || isValidVerse(curFile, vs, "Jer-32.html#vs33")
                || isValidVerse(curFile, vs, "Jer-35.html#vs14", 15)
                || isValidVerse(curFile, vs, "Jer-44.html#vs4")
                || isValidVerse(curFile, vs, "Dan-06.html#vs20")
                || isValidVerse(curFile, vs, "Hos-06.html#vs4")
                || isValidVerse(curFile, vs, "Hos-09.html#vs10")
                || isValidVerse(curFile, vs, "Hos-13.html#vs3")
                || isValidVerse(curFile, vs, "Joel-2.html#vs23")
                || isValidVerse(curFile, vs, "Mic-7.html#vs1")
                || isValidVerse(curFile, vs, "Zeph-3.html#vs7")
                || isValidVerse(curFile, vs, "Matt-20.html#vs1")
                || isValidVerse(curFile, vs, "Matt-21.html#vs18")
                || isValidVerse(curFile, vs, "Mark-01.html#vs35")
                || isValidVerse(curFile, vs, "Mark-11.html#vs20")
                || isValidVerse(curFile, vs, "Mark-13.html#vs35")
                || isValidVerse(curFile, vs, "Mark-16.html#vs2", 9)
                || isValidVerse(curFile, vs, "Luke-21.html#vs7")
                || isValidVerse(curFile, vs, "Luke-24.html#vs1", 22)
                || isValidVerse(curFile, vs, "John-08.html#vs2")
                || isValidVerse(curFile, vs, "John-18.html#vs28")
                || isValidVerse(curFile, vs, "John-20.html#vs1")
                || isValidVerse(curFile, vs, "Acts-28.html#vs23")
                || isValidVerse(curFile, vs, "Jas-5.html#vs7");
    } // isVroeg

    private static boolean isVragen(final File curFile, final String vs) {
        return (!isAfvragen(curFile, vs)
                && !isNavraag(curFile, vs)
                && !isNavragen()
                && !isTerugvragen(curFile, vs)
                && !isVraag(curFile, vs)
                && !isVroeg(curFile, vs))
                || isValidVerse(curFile, vs, "John-16.html#vs19")
                || isValidVerse(curFile, vs, "Didache-01.html#vs5");
    }  // isVroeg

}
