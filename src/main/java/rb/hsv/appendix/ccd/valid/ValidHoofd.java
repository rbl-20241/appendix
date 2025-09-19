package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidZien.isOverHetHoofdZien;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHoofd {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "Hoofd" -> isHoofd(curFile, vs);
            case "hoofd (hoogste of voorste deel)" -> isHoofd_hoogsteOfVoorsteDeel(curFile, vs);
            case "hoofd (leider)" -> isHoofd_leider(curFile, vs);
            case "hoofd (lichaamsdeel)" -> isHoofd_lichaamsdeel(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isHoofd(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-29.html#vs11")
                || isValidVerse(curFile, vs, "Hos-01.html#vs11")
                || isValidVerse(curFile, vs, "Eph-4.html#vs15")
                || isValidVerse(curFile, vs, "Eph-5.html#vs23")
                || isValidVerse(curFile, vs, "Col-2.html#vs10");
    } // isHoofd

    public static boolean isHoofd_hoogsteOfVoorsteDeel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-09.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-21.html#vs9", 12);
    } // isHoofd_hoogsteOfVoorsteDeel

    public static boolean isHoofd_leider(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-37.html#vs36")
                || isValidVerse(curFile, vs, "Gen-39.html#vs1", 21, 22, 23)
                || isValidVerse(curFile, vs, "Gen-40.html#vs2", 3, 4, 9, 16, 17, 20, 21, 22, 23)
                || isValidVerse(curFile, vs, "Gen-41.html#vs9", 10, 12)
                || isValidVerse(curFile, vs, "Exod-18.html#vs25")
                || isValidVerse(curFile, vs, "Num-01.html#vs4", 16)
                || isValidVerse(curFile, vs, "Num-07.html#vs2")
                || isValidVerse(curFile, vs, "Num-10.html#vs4")
                || isValidVerse(curFile, vs, "Num-13.html#vs3")
                || isValidVerse(curFile, vs, "Num-14.html#vs4")
                || isValidVerse(curFile, vs, "Num-17.html#vs3")
                || isValidVerse(curFile, vs, "Num-25.html#vs4")
                || isValidVerse(curFile, vs, "Num-30.html#vs1")
                || isValidVerse(curFile, vs, "Deut-01.html#vs13", 15)
                || isValidVerse(curFile, vs, "Deut-20.html#vs9")
                || isValidVerse(curFile, vs, "Deut-33.html#vs5", 21)
                || isValidVerse(curFile, vs, "Josh-11.html#vs10")
                || isValidVerse(curFile, vs, "Josh-22.html#vs14", 21, 30)
                || isValidVerse(curFile, vs, "Judg-10.html#vs18")
                || isValidVerse(curFile, vs, "Judg-11.html#vs8", 9, 11)
                || isValidVerse(curFile, vs, "Judg-20.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs44")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs27")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs14", 15, 17, 19)
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs18", 37)
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs2")
                || isValidVerse(curFile, vs, "1Chr-04.html#vs42")
                || isValidVerse(curFile, vs, "1Chr-05.html#vs7", 12, 15, 24)
                || isValidVerse(curFile, vs, "1Chr-07.html#vs40")
                || isValidVerse(curFile, vs, "1Chr-08.html#vs28")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs13", 17)
                || isValidVerse(curFile, vs, "1Chr-11.html#vs6", 10, 20, 42)
                || isValidVerse(curFile, vs, "1Chr-12.html#vs3", 9, 14, 18, 19, 20, 23, 32)
                || isValidVerse(curFile, vs, "1Chr-16.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-23.html#vs8", 11, 16, 17, 18, 19, 20)
                || isValidVerse(curFile, vs, "1Chr-24.html#vs4", 21)
                || isValidVerse(curFile, vs, "1Chr-26.html#vs10", 12, 26, 31)
                || isValidVerse(curFile, vs, "1Chr-27.html#vs1", 3)
                || isValidVerse(curFile, vs, "1Chr-29.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-01.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs12")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs27")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs10")
                || isValidVerse(curFile, vs, "Ezra-08.html#vs17", 29)
                || isValidVerse(curFile, vs, "Neh-03.html#vs9", 12, 14, 15, 16, 17, 18, 19)
                || isValidVerse(curFile, vs, "Neh-09.html#vs17")
                || isValidVerse(curFile, vs, "Neh-10.html#vs14")
                || isValidVerse(curFile, vs, "Neh-11.html#vs3", 16, 17)
                || isValidVerse(curFile, vs, "Neh-12.html#vs7", 24, 46)
                || isValidVerse(curFile, vs, "Ps-018.html#vs44")
                || isValidVerse(curFile, vs, "Ps-140.html#vs10")
                || isValidVerse(curFile, vs, "Isa-07.html#vs8", 9)
                || isValidVerse(curFile, vs, "Isa-22.html#vs15")
                || isValidVerse(curFile, vs, "Isa-36.html#vs3", 22)
                || isValidVerse(curFile, vs, "Isa-37.html#vs2")
                || isValidVerse(curFile, vs, "Jer-13.html#vs21")
                || isValidVerse(curFile, vs, "Jer-31.html#vs7")
                || isValidVerse(curFile, vs, "Lam-1.html#vs5")
                || isValidVerse(curFile, vs, "Dan-01.html#vs3", 7, 8, 9, 10, 11, 18)
                || isValidVerse(curFile, vs, "Dan-02.html#vs14", 48)
                || isValidVerse(curFile, vs, "Dan-04.html#vs9")
                || isValidVerse(curFile, vs, "Dan-05.html#vs11")
                || isValidVerse(curFile, vs, "Mic-3.html#vs1", 9, 11)
                || isValidVerse(curFile, vs, "Mark-05.html#vs22", 35, 36, 38)
                || isValidVerse(curFile, vs, "Luke-08.html#vs49")
                || isValidVerse(curFile, vs, "Luke-13.html#vs14")
                || isValidVerse(curFile, vs, "Acts-13.html#vs15")
                || isValidVerse(curFile, vs, "Acts-18.html#vs8", 17);
    } // isHoofd_leider

    public static boolean isHoofd_lichaamsdeel(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isHoofd(curFile, vs)
                && !isHoofd_hoogsteOfVoorsteDeel(curFile, vs)
                && !isHoofd_leider(curFile, vs)
                && !isOverHetHoofdZien(curFile, vs, keyArg, arg);
    }  // isHoofd_lichaamsdeel

}
