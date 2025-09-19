package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidWaar {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "waar (echt)" -> isEcht(curFile, vs, arg);
            case "waar (goederen)" -> isGoederen(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isEcht(final File curFile, final String vs, final String arg) {
        if (arg.equals("waren")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Gen-42.html#vs15", 16)
                || isValidVerse(curFile, vs, "Num-14.html#vs21", 28)
                || isValidVerse(curFile, vs, "Deut-22.html#vs20")
                || isValidVerse(curFile, vs, "Deut-32.html#vs40")
                || isValidVerse(curFile, vs, "Josh-07.html#vs20")
                || isValidVerse(curFile, vs, "Judg-08.html#vs19")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs12", 13)
                || isValidVerse(curFile, vs, "1Sam-01.html#vs26")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs39", 45)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs55")
                || isValidVerse(curFile, vs, "1Sam-19.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs3", 21)
                || isValidVerse(curFile, vs, "1Sam-25.html#vs26", 34)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs10", 16)
                || isValidVerse(curFile, vs, "1Sam-28.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-29.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs27")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs11")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs5")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs11", 19)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs29")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs24")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs22", 23)
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs1", 12)
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs10", 15, 37)
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs2", 4, 6)
                || isValidVerse(curFile, vs, "2Kgs-03.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs30")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs16", 20)
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs13")
                || isValidVerse(curFile, vs, "Job-09.html#vs2")
                || isValidVerse(curFile, vs, "Job-12.html#vs2")
                || isValidVerse(curFile, vs, "Job-27.html#vs2")
                || isValidVerse(curFile, vs, "Prov-11.html#vs19")
                || isValidVerse(curFile, vs, "Isa-37.html#vs18")
                || isValidVerse(curFile, vs, "Isa-49.html#vs18")
                || isValidVerse(curFile, vs, "Jer-04.html#vs2")
                || isValidVerse(curFile, vs, "Jer-05.html#vs2")
                || isValidVerse(curFile, vs, "Jer-12.html#vs16")
                || isValidVerse(curFile, vs, "Jer-16.html#vs14", 15)
                || isValidVerse(curFile, vs, "Jer-22.html#vs24")
                || isValidVerse(curFile, vs, "Jer-23.html#vs7", 8)
                || isValidVerse(curFile, vs, "Jer-38.html#vs16")
                || isValidVerse(curFile, vs, "Jer-44.html#vs26")
                || isValidVerse(curFile, vs, "Jer-46.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-05.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-05.html#vs11", 18, 20)
                || isValidVerse(curFile, vs, "Ezek-16.html#vs48")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs16", 19)
                || isValidVerse(curFile, vs, "Ezek-18.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs3", 31, 33)
                || isValidVerse(curFile, vs, "Ezek-33.html#vs11", 27)
                || isValidVerse(curFile, vs, "Ezek-34.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-35.html#vs6", 11)
                || isValidVerse(curFile, vs, "Dan-02.html#vs45")
                || isValidVerse(curFile, vs, "Dan-03.html#vs14")
                || isValidVerse(curFile, vs, "Dan-07.html#vs19")
                || isValidVerse(curFile, vs, "Hos-04.html#vs15")
                || isValidVerse(curFile, vs, "Amos-8.html#vs14")
                || isValidVerse(curFile, vs, "Zeph-2.html#vs9")
                || isValidVerse(curFile, vs, "Luke-16.html#vs11")
                || isValidVerse(curFile, vs, "Luke-22.html#vs59")
                || isValidVerse(curFile, vs, "John-04.html#vs23", 37)
                || isValidVerse(curFile, vs, "John-05.html#vs31", 32)
                || isValidVerse(curFile, vs, "John-06.html#vs32", 55)
                || isValidVerse(curFile, vs, "John-08.html#vs13", 14, 16, 17)
                || isValidVerse(curFile, vs, "John-10.html#vs41")
                || isValidVerse(curFile, vs, "John-15.html#vs1")
                || isValidVerse(curFile, vs, "John-19.html#vs35")
                || isValidVerse(curFile, vs, "John-21.html#vs24")
                || isValidVerse(curFile, vs, "Acts-21.html#vs24")
                || isValidVerse(curFile, vs, "Acts-25.html#vs11")
                || isValidVerse(curFile, vs, "Rom-11.html#vs20")
                || isValidVerse(curFile, vs, "Rom-14.html#vs11")
                || isValidVerse(curFile, vs, "Eph-4.html#vs24")
                || isValidVerse(curFile, vs, "Phil-4.html#vs8")
                || isValidVerse(curFile, vs, "Titus-1.html#vs13")
                || isValidVerse(curFile, vs, "Heb-08.html#vs2")
                || isValidVerse(curFile, vs, "1Pet-5.html#vs12")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs22")
                || isValidVerse(curFile, vs, "1John-2.html#vs8", 27)
                || isValidVerse(curFile, vs, "3John-1.html#vs12")
                || isValidVerse(curFile, vs, "Didache-11.html#vs8")
                || isValidVerse(curFile, vs, "Didache-12.html#vs1");
    } // isEcht

    public static boolean isGoederen(final File curFile, final String vs, final String arg) {
        if (arg.equals("ware")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Neh-10.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs12", 14, 16, 22, 27, 33)
                || isValidVerse(curFile, vs, "Rev-18.html#vs11", 15);
    } // isGoederen

}
