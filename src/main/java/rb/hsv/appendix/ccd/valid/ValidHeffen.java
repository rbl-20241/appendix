package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHeffen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanhef" -> isAanhef(curFile, vs);
            case "aanheffen" -> isAanheffen(curFile, vs);
            case "heft" -> isHeft(curFile, vs);
            case "omhoogheffen" -> isOmhoogheffen(curFile, vs);
            case "opheffen" -> isOpheffen(curFile, vs);
            case "heffen" -> isHeffen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanhef(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Neh-11.html#vs17");
    } // isAanhef

    public static boolean isAanheffen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-23.html#vs7", 18)
                || isValidVerse(curFile, vs, "Num-24.html#vs3", 15, 20, 21, 23)
                || isValidVerse(curFile, vs, "2Sam-01.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs33")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs11", 13)
                || isValidVerse(curFile, vs, "Job-27.html#vs1")
                || isValidVerse(curFile, vs, "Job-29.html#vs1")
                || isValidVerse(curFile, vs, "Ps-081.html#vs3")
                || isValidVerse(curFile, vs, "Isa-15.html#vs5")
                || isValidVerse(curFile, vs, "Jer-07.html#vs16", 29)
                || isValidVerse(curFile, vs, "Jer-11.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs2");
    } // isAanheffen

    public static boolean isHeft(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-03.html#vs22");
    } // isHeft

    public static boolean isOmhoogheffen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs17")
                || isValidVerse(curFile, vs, "Ps-003.html#vs4")
                || isValidVerse(curFile, vs, "Ps-027.html#vs6")
                || isValidVerse(curFile, vs, "Ps-075.html#vs6")
                || isValidVerse(curFile, vs, "Ps-110.html#vs7")
                || isValidVerse(curFile, vs, "Isa-13.html#vs2")
                || isValidVerse(curFile, vs, "Jer-04.html#vs6")
                || isValidVerse(curFile, vs, "Jer-50.html#vs2")
                || isValidVerse(curFile, vs, "Jer-51.html#vs12", 27)
                || isValidVerse(curFile, vs, "John-11.html#vs41");
    } // isOmhoofheffen

    public static boolean isOpheffen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-07.html#vs20")
                || isValidVerse(curFile, vs, "Exod-14.html#vs16")
                || isValidVerse(curFile, vs, "Lev-09.html#vs22")
                || isValidVerse(curFile, vs, "Num-20.html#vs11")
                || isValidVerse(curFile, vs, "Deut-32.html#vs40")
                || isValidVerse(curFile, vs, "Judg-08.html#vs28")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs34")
                || isValidVerse(curFile, vs, "1Chr-25.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-09.html#vs6")
                || isValidVerse(curFile, vs, "Job-30.html#vs22")
                || isValidVerse(curFile, vs, "Ps-010.html#vs12")
                || isValidVerse(curFile, vs, "Ps-024.html#vs7", 9)
                || isValidVerse(curFile, vs, "Ps-025.html#vs1")
                || isValidVerse(curFile, vs, "Ps-060.html#vs6")
                || isValidVerse(curFile, vs, "Ps-075.html#vs5")
                || isValidVerse(curFile, vs, "Ps-086.html#vs4")
                || isValidVerse(curFile, vs, "Ps-106.html#vs26")
                || isValidVerse(curFile, vs, "Ps-119.html#vs48")
                || isValidVerse(curFile, vs, "Ps-134.html#vs2")
                || isValidVerse(curFile, vs, "Ps-143.html#vs8")
                || isValidVerse(curFile, vs, "Isa-40.html#vs15")
                || isValidVerse(curFile, vs, "Isa-63.html#vs9")
                || isValidVerse(curFile, vs, "Lam-2.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs12", 14)
                || isValidVerse(curFile, vs, "Ezek-08.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs19")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs1", 22, 24)
                || isValidVerse(curFile, vs, "Ezek-20.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-45.html#vs9")
                || isValidVerse(curFile, vs, "Dan-12.html#vs7")
                || isValidVerse(curFile, vs, "Hab-3.html#vs10")
                || isValidVerse(curFile, vs, "Luke-21.html#vs28")
                || isValidVerse(curFile, vs, "Luke-24.html#vs50")
                || isValidVerse(curFile, vs, "Heb-12.html#vs12")
                || isValidVerse(curFile, vs, "Rev-10.html#vs5")
                || isValidVerse(curFile, vs, "Rev-18.html#vs21");
    } // isOpheffen

    public static boolean isHeffen(final File curFile, final String vs) {
        return !isAanhef(curFile, vs)
                && !isAanheffen(curFile, vs)
                && !isHeft(curFile, vs)
                && !isOmhoogheffen(curFile, vs)
                && !isOpheffen(curFile, vs);
    } // isHeffen


}
