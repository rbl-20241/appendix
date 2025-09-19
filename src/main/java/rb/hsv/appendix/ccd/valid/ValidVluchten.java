package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVluchten {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "op de vlucht" -> isOpDeVlucht(curFile, vs);
            case "vlucht" -> isVlucht(curFile, vs);
            case "wegvluchten" -> isWegvluchten(curFile, vs);
            case "vluchten" -> isVluchten(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOpDeVlucht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-16.html#vs8")
                || isValidVerse(curFile, vs, "Exod-23.html#vs27")
                || isValidVerse(curFile, vs, "Lev-26.html#vs17", 36)
                || isValidVerse(curFile, vs, "Josh-07.html#vs4")
                || isValidVerse(curFile, vs, "Josh-08.html#vs5")
                || isValidVerse(curFile, vs, "Judg-09.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-22.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs13", 14, 18)
                || isValidVerse(curFile, vs, "2Sam-17.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs41")
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs24")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs14", 15, 18)
                || isValidVerse(curFile, vs, "2Chr-14.html#vs12")
                || isValidVerse(curFile, vs, "Job-41.html#vs19")
                || isValidVerse(curFile, vs, "Ps-018.html#vs41")
                || isValidVerse(curFile, vs, "Isa-10.html#vs29")
                || isValidVerse(curFile, vs, "Isa-21.html#vs15")
                || isValidVerse(curFile, vs, "Isa-30.html#vs17")
                || isValidVerse(curFile, vs, "Isa-52.html#vs12")
                || isValidVerse(curFile, vs, "Jer-04.html#vs29")
                || isValidVerse(curFile, vs, "Jer-39.html#vs4")
                || isValidVerse(curFile, vs, "Jer-46.html#vs5", 6, 21)
                || isValidVerse(curFile, vs, "Dan-10.html#vs7")
                || isValidVerse(curFile, vs, "Jonah-1.html#vs10")
                || isValidVerse(curFile, vs, "Nah-2.html#vs8")
                || isValidVerse(curFile, vs, "Heb-11.html#vs34")
                || isValidVerse(curFile, vs, "Rev-16.html#vs20");
    } // isOpDeVlucht

    public static boolean isVlucht(final File curFile, final String vs) {
        return isOpDeVlucht(curFile, vs)
                || isValidVerse(curFile, vs, "Matt-24.html#vs20")
                || isValidVerse(curFile, vs, "Mark-13.html#vs18");
    } // isVlucht

    public static boolean isWegvluchten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-16.html#vs34")
                || isValidVerse(curFile, vs, "Judg-07.html#vs21")
                || isValidVerse(curFile, vs, "Judg-09.html#vs40")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs24")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs3", 10)
                || isValidVerse(curFile, vs, "Ps-011.html#vs1")
                || isValidVerse(curFile, vs, "Ps-068.html#vs13")
                || isValidVerse(curFile, vs, "Isa-48.html#vs20")
                || isValidVerse(curFile, vs, "Jer-49.html#vs30")
                || isValidVerse(curFile, vs, "Jer-50.html#vs8")
                || isValidVerse(curFile, vs, "Jer-51.html#vs6")
                || isValidVerse(curFile, vs, "Mark-14.html#vs52")
                || isValidVerse(curFile, vs, "1Cor-06.html#vs18")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs14")
                || isValidVerse(curFile, vs, "Rev-20.html#vs11");
    } // isWegvluchten

    public static boolean isVluchten(final File curFile, final String vs) {
        return (!isOpDeVlucht(curFile, vs)
                && !isVlucht(curFile, vs)
                && !isWegvluchten(curFile, vs))
                || isValidVerse(curFile, vs, "Jer-49.html#vs30")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs4");
    } // isVluchten
}
