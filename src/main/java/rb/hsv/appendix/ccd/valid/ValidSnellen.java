package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSnellen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "snel" -> isSnel(curFile, vs);
            case "snelle" -> isSnelle(curFile, vs);
            case "toesnellen" -> isToesnellen(curFile, vs);
            case "snellen" -> isSnellen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isSnel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs2", 7)
                || isValidVerse(curFile, vs, "Gen-24.html#vs17", 20, 28, 29, 64)
                || isValidVerse(curFile, vs, "Gen-27.html#vs20")
                || isValidVerse(curFile, vs, "Gen-29.html#vs12", 13)
                || isValidVerse(curFile, vs, "Gen-41.html#vs14")
                || isValidVerse(curFile, vs, "Exod-02.html#vs18")
                || isValidVerse(curFile, vs, "Exod-12.html#vs33")
                || isValidVerse(curFile, vs, "Exod-32.html#vs8")
                || isValidVerse(curFile, vs, "Num-11.html#vs27")
                || isValidVerse(curFile, vs, "Num-16.html#vs47")
                || isValidVerse(curFile, vs, "Deut-04.html#vs26")
                || isValidVerse(curFile, vs, "Deut-07.html#vs4")
                || isValidVerse(curFile, vs, "Deut-09.html#vs3", 12, 16)
                || isValidVerse(curFile, vs, "Josh-02.html#vs5")
                || isValidVerse(curFile, vs, "Josh-08.html#vs19")
                || isValidVerse(curFile, vs, "Judg-02.html#vs17")
                || isValidVerse(curFile, vs, "Judg-09.html#vs54")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs17", 48)
                || isValidVerse(curFile, vs, "1Sam-20.html#vs6", 36)
                || isValidVerse(curFile, vs, "1Sam-23.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs18")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-17.html#vs16", 21)
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs22", 26)
                || isValidVerse(curFile, vs, "2Chr-18.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs13")
                || isValidVerse(curFile, vs, "Esth-08.html#vs10", 14)
                || isValidVerse(curFile, vs, "Job-24.html#vs18")
                || isValidVerse(curFile, vs, "Job-26.html#vs13")
                || isValidVerse(curFile, vs, "Job-27.html#vs22")
                || isValidVerse(curFile, vs, "Ps-018.html#vs11")
                || isValidVerse(curFile, vs, "Ps-019.html#vs6")
                || isValidVerse(curFile, vs, "Ps-037.html#vs2")
                || isValidVerse(curFile, vs, "Ps-090.html#vs10")
                || isValidVerse(curFile, vs, "Ps-147.html#vs15")
                || isValidVerse(curFile, vs, "Prov-14.html#vs17")
                || isValidVerse(curFile, vs, "Prov-20.html#vs21")
                || isValidVerse(curFile, vs, "Prov-25.html#vs8")
                || isValidVerse(curFile, vs, "Eccl-04.html#vs12")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs1")
                || isValidVerse(curFile, vs, "Eccl-07.html#vs9")
                || isValidVerse(curFile, vs, "Eccl-08.html#vs11")
                || isValidVerse(curFile, vs, "Isa-05.html#vs26")
                || isValidVerse(curFile, vs, "Isa-16.html#vs5")
                || isValidVerse(curFile, vs, "Isa-18.html#vs2")
                || isValidVerse(curFile, vs, "Isa-19.html#vs1")
                || isValidVerse(curFile, vs, "Isa-27.html#vs1")
                || isValidVerse(curFile, vs, "Isa-30.html#vs16")
                || isValidVerse(curFile, vs, "Isa-40.html#vs31")
                || isValidVerse(curFile, vs, "Isa-51.html#vs14")
                || isValidVerse(curFile, vs, "Isa-58.html#vs8")
                || isValidVerse(curFile, vs, "Isa-66.html#vs20")
                || isValidVerse(curFile, vs, "Jer-27.html#vs16")
                || isValidVerse(curFile, vs, "Jer-49.html#vs30")
                || isValidVerse(curFile, vs, "Dan-09.html#vs21")
                || isValidVerse(curFile, vs, "Dan-11.html#vs10", 13)
                || isValidVerse(curFile, vs, "Joel-3.html#vs4")
                || isValidVerse(curFile, vs, "Mic-1.html#vs13")
                || isValidVerse(curFile, vs, "Hab-2.html#vs2")
                || isValidVerse(curFile, vs, "Zeph-1.html#vs14")
                || isValidVerse(curFile, vs, "Zech-02.html#vs4")
                || isValidVerse(curFile, vs, "Mal-3.html#vs5")
                || isValidVerse(curFile, vs, "Matt-05.html#vs25")
                || isValidVerse(curFile, vs, "Luke-14.html#vs21")
                || isValidVerse(curFile, vs, "Luke-16.html#vs6")
                || isValidVerse(curFile, vs, "John-11.html#vs29", 31)
                || isValidVerse(curFile, vs, "John-13.html#vs27")
                || isValidVerse(curFile, vs, "Acts-12.html#vs7")
                || isValidVerse(curFile, vs, "Acts-21.html#vs32")
                || isValidVerse(curFile, vs, "Rom-03.html#vs15")
                || isValidVerse(curFile, vs, "Rom-09.html#vs28")
                || isValidVerse(curFile, vs, "Gal-1.html#vs6")
                || isValidVerse(curFile, vs, "2Thess-2.html#vs2")
                || isValidVerse(curFile, vs, "2Pet-1.html#vs14")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs1");
    } // isSnel

    public static boolean isSnelle(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-09.html#vs11")
                || isValidVerse(curFile, vs, "Jer-46.html#vs6")
                || isValidVerse(curFile, vs, "Amos-2.html#vs14");
    } // isSnelle

    public static boolean isToesnellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-27.html#vs48")
                || isValidVerse(curFile, vs, "Mark-15.html#vs36");
    } // isToesnellen

    public static boolean isSnellen(final File curFile, final String vs) {
        return !isSnel(curFile, vs)
                && !isSnelle(curFile, vs)
                && !isToesnellen(curFile, vs);
    } // isSlagen

}
