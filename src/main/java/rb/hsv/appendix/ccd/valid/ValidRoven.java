package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRoven {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "leegroven" -> isLeegroven();
            case "roof" -> isRoof(curFile, vs);
            case "wegroven" -> isWegroven(curFile, vs);
            case "roven" -> isRoven(curFile, vs);
            default -> true;
        };
    }

    public static boolean isLeegroven() {
        return false;
    } // isLeegroven

    public static boolean isRoof(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-062.html#vs11")
                || isValidVerse(curFile, vs, "Isa-10.html#vs6")
                || isValidVerse(curFile, vs, "Isa-61.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs12", 13)
                || isValidVerse(curFile, vs, "Dan-11.html#vs24")
                || isValidVerse(curFile, vs, "Phil-2.html#vs6");
    } // isRoof

    public static boolean isWegroven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-24.html#vs19");
    } // isWegroven

    public static boolean isRoven(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-34.html#vs29")
                || isValidVerse(curFile, vs, "Exod-22.html#vs10")
                || isValidVerse(curFile, vs, "Lev-06.html#vs2")
                || isValidVerse(curFile, vs, "Num-31.html#vs9", 32, 53)
                || isValidVerse(curFile, vs, "Deut-02.html#vs35")
                || isValidVerse(curFile, vs, "Deut-03.html#vs7")
                || isValidVerse(curFile, vs, "Deut-20.html#vs14")
                || isValidVerse(curFile, vs, "Josh-08.html#vs2", 27)
                || isValidVerse(curFile, vs, "Josh-11.html#vs14")
                || isValidVerse(curFile, vs, "Judg-21.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs8")
                || isValidVerse(curFile, vs, "Job-20.html#vs19")
                || isValidVerse(curFile, vs, "Job-24.html#vs2")
                || isValidVerse(curFile, vs, "Ps-069.html#vs5")
                || isValidVerse(curFile, vs, "Isa-03.html#vs14")
                || isValidVerse(curFile, vs, "Isa-10.html#vs6")
                || isValidVerse(curFile, vs, "Isa-33.html#vs23")
                || isValidVerse(curFile, vs, "Jer-20.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs29")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs12", 13)
                || isValidVerse(curFile, vs, "Mic-2.html#vs2")
                || isValidVerse(curFile, vs, "Nah-2.html#vs9")
                || isValidVerse(curFile, vs, "Nah-3.html#vs1")
                || isValidVerse(curFile, vs, "Mal-1.html#vs13")
                || isValidVerse(curFile, vs, "Matt-12.html#vs29")
                || isValidVerse(curFile, vs, "Mark-03.html#vs27");
    } // isRoven



}
