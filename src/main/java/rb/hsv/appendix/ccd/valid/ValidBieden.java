package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBieden {

    public static boolean isValid(final String keyArg, final String arg, final File curFile, final String vs) {
        var isValid = true;

        switch (keyArg) {
            case "aanbieden" -> isValid = isAanbieden(curFile, vs);
            case "bode" -> isValid = isBode(curFile, vs);
            case "bieden" -> isValid = isBieden(curFile, vs, arg);
        }

        return isValid;
    }

    private static boolean isAanbieden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-07.html#vs38")
                || isValidVerse(curFile, vs, "Lev-09.html#vs2")
                || isValidVerse(curFile, vs, "Lev-17.html#vs4")
                || isValidVerse(curFile, vs, "Lev-21.html#vs6", 8, 17, 21)
                || isValidVerse(curFile, vs, "Lev-23.html#vs37")
                || isValidVerse(curFile, vs, "Num-07.html#vs2", 3, 10, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 78)
                || isValidVerse(curFile, vs, "Num-09.html#vs7")
                || isValidVerse(curFile, vs, "Num-15.html#vs13")
                || isValidVerse(curFile, vs, "Num-28.html#vs2")
                || isValidVerse(curFile, vs, "Judg-03.html#vs17")
                || isValidVerse(curFile, vs, "Judg-06.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs28")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs7", 15)
                || isValidVerse(curFile, vs, "Mal-1.html#vs8")
                || isValidVerse(curFile, vs, "Matt-05.html#vs39")
                || isValidVerse(curFile, vs, "Acts-08.html#vs18");
    }

    private static boolean isBode(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs4")
                || isValidVerse(curFile, vs, "Gen-32.html#vs3", 6)
                || isValidVerse(curFile, vs, "Gen-41.html#vs8", 14)
                || isValidVerse(curFile, vs, "Exod-09.html#vs27")
                || isValidVerse(curFile, vs, "Num-20.html#vs14")
                || isValidVerse(curFile, vs, "Num-21.html#vs21")
                || isValidVerse(curFile, vs, "Num-22.html#vs5", 37)
                || isValidVerse(curFile, vs, "Num-24.html#vs12")
                || isValidVerse(curFile, vs, "Deut-02.html#vs26")
                || isValidVerse(curFile, vs, "Deut-19.html#vs12")
                || isValidVerse(curFile, vs, "Josh-02.html#vs3")
                || isValidVerse(curFile, vs, "Josh-06.html#vs17", 25)
                || isValidVerse(curFile, vs, "Josh-07.html#vs22")
                || isValidVerse(curFile, vs, "Josh-10.html#vs3", 6)
                || isValidVerse(curFile, vs, "Judg-06.html#vs35")
                || isValidVerse(curFile, vs, "Judg-07.html#vs24")
                || isValidVerse(curFile, vs, "Judg-09.html#vs31")
                || isValidVerse(curFile, vs, "Judg-11.html#vs12", 13, 14, 17, 19)
                || isValidVerse(curFile, vs, "Judg-21.html#vs13")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs4")
                || isValidVerse(curFile, vs, "1Sam-05.html#vs8", 11)
                || isValidVerse(curFile, vs, "1Sam-06.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs3", 4, 7, 9)
                || isValidVerse(curFile, vs, "1Sam-16.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs11", 14, 15, 16, 20, 21)
                || isValidVerse(curFile, vs, "1Sam-22.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs14", 39, 42)
                || isValidVerse(curFile, vs, "2Sam-02.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs12", 14, 26)
                || isValidVerse(curFile, vs, "2Sam-05.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-09.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-10.html#vs2", 5, 6, 16)
                || isValidVerse(curFile, vs, "2Sam-11.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs27")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs10",  19, 20)
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs2",5, 7, 9)
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs2", 3, 5, 6, 16)
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs9", 13)
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs5", 21)
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs7")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs1", 16)
                || isValidVerse(curFile, vs, "1Chr-13.html#vs2")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-19.html#vs2", 5, 16)
                || isValidVerse(curFile, vs, "2Chr-02.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs29")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs15", 16)
                || isValidVerse(curFile, vs, "Neh-06.html#vs2", 3, 4)
                || isValidVerse(curFile, vs, "Job-01.html#vs4")
                || isValidVerse(curFile, vs, "Ps-078.html#vs49")
                || isValidVerse(curFile, vs, "Ps-105.html#vs20")
                || isValidVerse(curFile, vs, "Prov-16.html#vs14")
                || isValidVerse(curFile, vs, "Isa-18.html#vs2")
                || isValidVerse(curFile, vs, "Isa-44.html#vs26")
                || isValidVerse(curFile, vs, "Isa-66.html#vs19")
                || isValidVerse(curFile, vs, "Jer-02.html#vs10")
                || isValidVerse(curFile, vs, "Jer-09.html#vs17")
                || isValidVerse(curFile, vs, "Jer-16.html#vs16")
                || isValidVerse(curFile, vs, "Jer-38.html#vs14")
                || isValidVerse(curFile, vs, "Jer-39.html#vs13", 14)
                || isValidVerse(curFile, vs, "Hos-05.html#vs13")
                || isValidVerse(curFile, vs, "Luke-07.html#vs24")
                || isValidVerse(curFile, vs, "Luke-09.html#vs52")
                || isValidVerse(curFile, vs, "Jas-2.html#vs25");
    }

    public static boolean isGeboden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-01.html#vs10")
                || isValidVerse(curFile, vs, "Heb-13.html#vs2");
    } // isGeboden

    public static boolean isBieden(final File curFile, final String vs, final String arg) {
        if (arg.equals("geboden")) {
            return isGeboden(curFile, vs);
        } else {
            return !isAanbieden(curFile, vs)
                    && !isBode(curFile, vs);
        }
    } // isBieden


}
