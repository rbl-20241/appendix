package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVallen {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanval" -> isAanval(curFile, vs);
            case "aanvallen" -> isAanvallen(curFile, vs);
            case "achterovervallen" -> isAchterovervallen(curFile, vs);
            case "afval" -> isAfval(curFile, vs);
            case "afvallen" -> isAfvallen(curFile, vs);
            case "bijvallen" -> isBijvallen(curFile, vs);
            case "binnenvallen" -> isBinnenvallen();
            case "droogvallen" -> isDroogvallen(curFile, vs);
            case "geval" -> isGeval(curFile, vs, arg);
            case "lastigvallen" -> isLastigvallen(curFile, vs);
            case "neervallen" -> isNeervallen(curFile, vs);
            case "opvallen" -> isOpvallen(curFile, vs);
            case "samenvallen" -> isSamenvallen(curFile, vs);
            case "tegenvallen" -> isTegenvallen();
            case "ten deel vallen" -> isTenDeelVallen(curFile, vs, keyArg, arg);
            case "uitvallen" -> isUitvallen(curFile, vs);
            case "val" -> isVal(curFile, vs);
            case "voorovervallen" -> isVoorovervallen();
            case "vallen" -> (!isAanvallen(curFile, vs)
                    && !isAchterovervallen(curFile, vs)
                    && !isAfval(curFile, vs)
                    && !isAfvallen(curFile, vs)
                    && !isBijvallen(curFile, vs)
                    && !isBinnenvallen()
                    && !isDroogvallen(curFile, vs)
                    && !isGeval(curFile, vs, arg)
                    && !isLastigvallen(curFile, vs)
                    && !isNeervallen(curFile, vs)
                    && !isOpvallen(curFile, vs)
                    && !isSamenvallen(curFile, vs)
                    && !isTegenvallen()
                    && !isTenDeelVallen(curFile, vs, keyArg, arg)
                    && !isUitvallen(curFile, vs)
                    && !isVal(curFile, vs)
                    && !isVoorovervallen())
                    || isValidVerse(curFile, vs, "Luke-08.html#vs23")
                    || isValidVerse(curFile, vs, "Esth-06.html#vs13");
            default -> true;
        };
    }

    public static boolean isAanval(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-18.html#vs24")
                || isValidVerse(curFile, vs, "Isa-36.html#vs9");
    }  // isAanval

    public static boolean isAanvallen(final File curFile, final String vs) {
        if (isAanval(curFile, vs)) {
            return false;
        }

        return isValidVerse(curFile, vs, "Judg-09.html#vs43")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs23");
    }  // isAanvallen

    public static boolean isAchterovervallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-04.html#vs18");
    }  // isAchterovervallen

    public static boolean isAfval(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lam-3.html#vs45")
                || isValidVerse(curFile, vs, "2Thess-2.html#vs3");
    }  // isAfval

    public static boolean isAfvallen(final File curFile, final String vs) {
        if (isAfval(curFile, vs)) {
            return false;
        }

        return isValidVerse(curFile, vs, "Isa-40.html#vs7", 8)
                || isValidVerse(curFile, vs, "Isa-64.html#vs6")
                || isValidVerse(curFile, vs, "Acts-12.html#vs7");
    }  // isAfvallen

    public static boolean isBijvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-07.html#vs16");
    }  // isBijvallen

    public static boolean isBinnenvallen() {
        return IS_NOT_FOUND;
    } // isBinnenvallen

    public static boolean isDroogvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-12.html#vs15")
                || isValidVerse(curFile, vs, "Job-14.html#vs11")
                || isValidVerse(curFile, vs, "Isa-19.html#vs6");
    }  // isDroogvallen

    public static boolean isGeval(final File curFile, final String vs, final String arg) {
        if (arg.equals("geval")) {
            return true;
        } else {
           return isValidVerse(curFile, vs, "1Cor-07.html#vs15");
        }
    }  // isGeval

    public static boolean isLastigvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-2.html#vs15")
                || isValidVerse(curFile, vs, "Matt-26.html#vs10")
                || isValidVerse(curFile, vs, "Mark-05.html#vs35")
                || isValidVerse(curFile, vs, "Mark-14.html#vs6")
                || isValidVerse(curFile, vs, "Luke-03.html#vs14")
                || isValidVerse(curFile, vs, "Luke-08.html#vs49")
                || isValidVerse(curFile, vs, "Luke-11.html#vs7")
                || isValidVerse(curFile, vs, "Luke-18.html#vs5");
    }  // isLastigvallen

    public static boolean isNeervallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-50.html#vs18")
                || isValidVerse(curFile, vs, "Judg-09.html#vs40")
                || isValidVerse(curFile, vs, "Judg-19.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs16")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs38")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs37")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs18")
                || isValidVerse(curFile, vs, "Esth-08.html#vs3")
                || isValidVerse(curFile, vs, "Job-01.html#vs16")
                || isValidVerse(curFile, vs, "Jer-25.html#vs27")
                || isValidVerse(curFile, vs, "Dan-03.html#vs7", 15)
                || isValidVerse(curFile, vs, "Matt-02.html#vs11")
                || isValidVerse(curFile, vs, "Matt-07.html#vs25", 27)
                || isValidVerse(curFile, vs, "Mark-03.html#vs11")
                || isValidVerse(curFile, vs, "Mark-07.html#vs25")
                || isValidVerse(curFile, vs, "Luke-05.html#vs8")
                || isValidVerse(curFile, vs, "Luke-08.html#vs23", 28)
                || isValidVerse(curFile, vs, "Acts-05.html#vs5", 10)
                || isValidVerse(curFile, vs, "Acts-16.html#vs29")
                || isValidVerse(curFile, vs, "Rev-16.html#vs21")
                || isValidVerse(curFile, vs, "Rev-19.html#vs10")
                || isValidVerse(curFile, vs, "Rev-22.html#vs8");
    }  // isNeervallen

    public static boolean isOpvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-19.html#vs11");
    }  // isOpvallen

    public static boolean isSamenvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-15.html#vs12");
    }  // isSamenvallen

    public static boolean isTegenvallen() {
        return IS_NOT_FOUND;
    }  // isTegenvallen

    public static boolean isTenDeelVallen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("ten deel vallen", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Num-32.html#vs19")
                    || isValidVerse(curFile, vs, "Job-20.html#vs29")
                    || isValidVerse(curFile, vs, "Matt-18.html#vs19")
                    || isValidVerse(curFile, vs, "Mark-11.html#vs24")
                    || isValidVerse(curFile, vs, "Luke-19.html#vs9")
                    || isValidVerse(curFile, vs, "John-15.html#vs7")
                    || isValidVerse(curFile, vs, "1Cor-09.html#vs15")
                    || isValidVerse(curFile, vs, "Eph-1.html#vs14");
        }

        return false;
    } // isTenDeelVallen

    public static boolean isUitvallen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ruth-3.html#vs18")
                || isValidVerse(curFile, vs, "Mark-14.html#vs5");
    }  // isUitvallen

    public static boolean isVal(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-23.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs10")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs19")
                || isValidVerse(curFile, vs, "Esth-06.html#vs13")
                || isValidVerse(curFile, vs, "Job-18.html#vs10")
                || isValidVerse(curFile, vs, "Ps-005.html#vs11")
                || isValidVerse(curFile, vs, "Ps-054.html#vs9")
                || isValidVerse(curFile, vs, "Ps-069.html#vs23")
                || isValidVerse(curFile, vs, "Ps-092.html#vs12")
                || isValidVerse(curFile, vs, "Ps-112.html#vs8")
                || isValidVerse(curFile, vs, "Prov-10.html#vs8", 10)
                || isValidVerse(curFile, vs, "Prov-11.html#vs5", 14, 28)
                || isValidVerse(curFile, vs, "Prov-16.html#vs18")
                || isValidVerse(curFile, vs, "Prov-28.html#vs18")
                || isValidVerse(curFile, vs, "Prov-29.html#vs16")
                || isValidVerse(curFile, vs, "Isa-08.html#vs14")
                || isValidVerse(curFile, vs, "Isa-54.html#vs15")
                || isValidVerse(curFile, vs, "Jer-49.html#vs21")
                || isValidVerse(curFile, vs, "Jer-51.html#vs49")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs15", 18)
                || isValidVerse(curFile, vs, "Ezek-27.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-31.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-32.html#vs10")
                || isValidVerse(curFile, vs, "Dan-11.html#vs19")
                || isValidVerse(curFile, vs, "Hos-04.html#vs14")
                || isValidVerse(curFile, vs, "Hos-07.html#vs7")
                || isValidVerse(curFile, vs, "Amos-3.html#vs5")
                || isValidVerse(curFile, vs, "Matt-07.html#vs27")
                || isValidVerse(curFile, vs, "Luke-02.html#vs34")
                || isValidVerse(curFile, vs, "Luke-06.html#vs49")
                || isValidVerse(curFile, vs, "Rom-11.html#vs11", 12)
                || isValidVerse(curFile, vs, "Heb-04.html#vs11");
    }  // isVal

    public static boolean isVoorovervallen() {
        return false;
    }  // isVoorovervallen

}
