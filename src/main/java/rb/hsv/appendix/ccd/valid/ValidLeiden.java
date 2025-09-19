package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLeiden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "uitleiden" -> isUitleiden(curFile, vs);
            case "voorleiden" -> isVoorleiden(curFile, vs);
            case "wegleiden" -> isWegleiden(curFile, vs);
            case "leiden" -> isLeiden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isUitleiden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-15.html#vs7")
                || isValidVerse(curFile, vs, "Gen-19.html#vs29")
                || isValidVerse(curFile, vs, "Exod-03.html#vs8", 10, 11, 12, 17)
                || isValidVerse(curFile, vs, "Exod-06.html#vs12, 25, 26")
                || isValidVerse(curFile, vs, "Exod-12.html#vs17", 42, 51)
                || isValidVerse(curFile, vs, "Exod-13.html#vs9", 14, 16)
                || isValidVerse(curFile, vs, "Exod-14.html#vs11")
                || isValidVerse(curFile, vs, "Exod-16.html#vs6", 32)
                || isValidVerse(curFile, vs, "Exod-18.html#vs1")
                || isValidVerse(curFile, vs, "Exod-19.html#vs17")
                || isValidVerse(curFile, vs, "Exod-20.html#vs2")
                || isValidVerse(curFile, vs, "Exod-29.html#vs46")
                || isValidVerse(curFile, vs, "Exod-32.html#vs1", 4, 7, 8, 11, 23)
                || isValidVerse(curFile, vs, "Exod-33.html#vs1")
                || isValidVerse(curFile, vs, "Lev-19.html#vs36")
                || isValidVerse(curFile, vs, "Lev-22.html#vs33")
                || isValidVerse(curFile, vs, "Lev-23.html#vs43")
                || isValidVerse(curFile, vs, "Lev-25.html#vs38", 42, 55)
                || isValidVerse(curFile, vs, "Lev-26.html#vs13", 45)
                || isValidVerse(curFile, vs, "Num-14.html#vs13")
                || isValidVerse(curFile, vs, "Num-15.html#vs41")
                || isValidVerse(curFile, vs, "Num-16.html#vs13")
                || isValidVerse(curFile, vs, "Num-20.html#vs16")
                || isValidVerse(curFile, vs, "Num-23.html#vs22")
                || isValidVerse(curFile, vs, "Num-24.html#vs8")
                || isValidVerse(curFile, vs, "Deut-01.html#vs27")
                || isValidVerse(curFile, vs, "Deut-04.html#vs20", 37)
                || isValidVerse(curFile, vs, "Deut-05.html#vs6")
                || isValidVerse(curFile, vs, "Deut-06.html#vs12", 21)
                || isValidVerse(curFile, vs, "Deut-08.html#vs14")
                || isValidVerse(curFile, vs, "Deut-09.html#vs12", 26, 28)
                || isValidVerse(curFile, vs, "Deut-13.html#vs5", 10)
                || isValidVerse(curFile, vs, "Deut-16.html#vs1")
                || isValidVerse(curFile, vs, "Deut-20.html#vs1")
                || isValidVerse(curFile, vs, "Deut-26.html#vs8")
                || isValidVerse(curFile, vs, "Deut-29.html#vs25")
                || isValidVerse(curFile, vs, "Josh-24.html#vs6")
                || isValidVerse(curFile, vs, "Judg-02.html#vs1", 12)
                || isValidVerse(curFile, vs, "Judg-06.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-10.html#vs18")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs16", 21, 51, 53)
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs7", 36)
                || isValidVerse(curFile, vs, "2Chr-06.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs22")
                || isValidVerse(curFile, vs, "Ps-018.html#vs20")
                || isValidVerse(curFile, vs, "Ps-081.html#vs11")
                || isValidVerse(curFile, vs, "Ps-105.html#vs37", 43)
                || isValidVerse(curFile, vs, "Ps-107.html#vs14", 28)
                || isValidVerse(curFile, vs, "Ps-142.html#vs8")
                || isValidVerse(curFile, vs, "Ps-143.html#vs11")
                || isValidVerse(curFile, vs, "Isa-42.html#vs7")
                || isValidVerse(curFile, vs, "Jer-02.html#vs6")
                || isValidVerse(curFile, vs, "Jer-07.html#vs22")
                || isValidVerse(curFile, vs, "Jer-11.html#vs4", 7)
                || isValidVerse(curFile, vs, "Jer-16.html#vs14", 15)
                || isValidVerse(curFile, vs, "Jer-23.html#vs7", 8)
                || isValidVerse(curFile, vs, "Jer-31.html#vs32")
                || isValidVerse(curFile, vs, "Jer-32.html#vs21")
                || isValidVerse(curFile, vs, "Jer-34.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs6", 9, 10, 14, 22, 34, 38, 41)
                || isValidVerse(curFile, vs, "Dan-09.html#vs15")
                || isValidVerse(curFile, vs, "Hos-12.html#vs14")
                || isValidVerse(curFile, vs, "Amos-2.html#vs10")
                || isValidVerse(curFile, vs, "Amos-3.html#vs1")
                || isValidVerse(curFile, vs, "Mic-6.html#vs4")
                || isValidVerse(curFile, vs, "Mark-08.html#vs23")
                || isValidVerse(curFile, vs, "Acts-07.html#vs40")
                || isValidVerse(curFile, vs, "Acts-12.html#vs17")
                || isValidVerse(curFile, vs, "Heb-08.html#vs9");
    } // isUitleiden

    public static boolean isVoorleiden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-10.html#vs18")
                || isValidVerse(curFile, vs, "Luke-21.html#vs12")
                || isValidVerse(curFile, vs, "Acts-05.html#vs27")
                || isValidVerse(curFile, vs, "Acts-22.html#vs30")
                || isValidVerse(curFile, vs, "Acts-25.html#vs6", 17);
    } // isVoorleiden

    public static boolean isWegleiden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-25.html#vs11")
                || isValidVerse(curFile, vs, "Matt-26.html#vs57")
                || isValidVerse(curFile, vs, "Matt-27.html#vs2", 31)
                || isValidVerse(curFile, vs, "Mark-14.html#vs44", 53)
                || isValidVerse(curFile, vs, "Luke-13.html#vs15")
                || isValidVerse(curFile, vs, "Luke-23.html#vs26")
                || isValidVerse(curFile, vs, "John-18.html#vs13")
                || isValidVerse(curFile, vs, "John-19.html#vs16")
                || isValidVerse(curFile, vs, "Acts-12.html#vs19");
    } // isWegleiden

    public static boolean isLeiden(final File curFile, final String vs) {
        return !isUitleiden(curFile, vs)
                && !isVoorleiden(curFile, vs)
                && !isWegleiden(curFile, vs);
    } // isLeiden


}
