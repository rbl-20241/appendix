package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.*;

public class ValidHaar {

    public static boolean isValid(final File curFile, final String vs) {
        return isHaar(curFile, vs);
    }

    public static boolean isHaar(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-25.html#vs25")
                || isValidVerse(curFile, vs, "Gen-42.html#vs38")
                || isValidVerse(curFile, vs, "Gen-44.html#vs29", 31)
                || isValidVerse(curFile, vs, "Lev-13.html#vs3", 4, 10, 20, 21, 23, 25, 26, 28, 30, 31, 32, 36, 37)
                || isValidVerse(curFile, vs, "Lev-14.html#vs8", 9)
                || isValidVerse(curFile, vs, "Lev-19.html#vs32")
                || isValidVerse(curFile, vs, "Num-06.html#vs19")
                || isValidVerse(curFile, vs, "Deut-32.html#vs42")
                || isValidVerse(curFile, vs, "Judg-16.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs45")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs11")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs52")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs6", 9)
                || isValidVerse(curFile, vs, "2Kgs-01.html#vs8")
                || isValidVerse(curFile, vs, "Neh-13.html#vs25")
                || isValidVerse(curFile, vs, "Job-41.html#vs23")
                || isValidVerse(curFile, vs, "Ps-040.html#vs13")
                || isValidVerse(curFile, vs, "Ps-069.html#vs5")
                || isValidVerse(curFile, vs, "Song-4.html#vs1")
                || isValidVerse(curFile, vs, "Song-6.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-05.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs35")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs10")
                || isValidVerse(curFile, vs, "Dan-03.html#vs27")
                || isValidVerse(curFile, vs, "Dan-04.html#vs33")
                || isValidVerse(curFile, vs, "Dan-07.html#vs9")
                || isValidVerse(curFile, vs, "Hos-07.html#vs9")
                || isValidVerse(curFile, vs, "Mic-1.html#vs16")
                || isValidVerse(curFile, vs, "Zech-13.html#vs4")
                || isValidVerse(curFile, vs, "Matt-05.html#vs36")
                || isValidVerse(curFile, vs, "Matt-10.html#vs30")
                || isValidVerse(curFile, vs, "Luke-07.html#vs38", 44)
                || isValidVerse(curFile, vs, "Luke-12.html#vs7")
                || isValidVerse(curFile, vs, "Luke-21.html#vs18")
                || isValidVerse(curFile, vs, "John-11.html#vs")
                || isValidVerse(curFile, vs, "John-12.html#vs3")
                || isValidVerse(curFile, vs, "Acts-27.html#vs34")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs14", 15)
                || isValidVerse(curFile, vs, "1Tim-2.html#vs9")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs3")
                || isValidVerse(curFile, vs, "Rev-01.html#vs14")
                || isValidVerse(curFile, vs, "Rev-06.html#vs12")
                || isValidVerse(curFile, vs, "Rev-09.html#vs8");
    } // isHaar

    public static boolean isNotValidNextWord_Haar(final String arg, final String line) {
        return isNotValidNextWord(arg, line, "hoofd")
                && isNotValidNextWord(arg, line, "broer")
                && isNotValidBeforeWord(arg, line, "haar");

    }

}