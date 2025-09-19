package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidStellen {

    public static boolean isValid(final String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanstellen" -> isAanstellen(curFile, vs);
            case "gelijkstellen" -> isGelijkstellen();
            case "geruststellen" -> isGeruststellen(curFile, vs);
            case "instellen" -> isInstellen(curFile, vs);
            case "in bewaring stellen" -> isInBewaringStellen(curFile, vs, keyArg, arg);
            case "op de proef stellen" -> isOpDeProefStellen(curFile, vs, arg);
            case "opstellen" -> isOpstellen(curFile, vs);
            case "samenstellen" -> isSamenstellen();
            case "stel" -> isStel(curFile, vs);
            case "teleurstellen" -> isTeleurstellen();
            case "tentoonstellen" -> isTentoonstellen();
            case "uitstel" -> isUitstel(curFile, vs);
            case "uitstellen" -> isUitstellen(curFile, vs);
            case "vaststellen" -> isVaststellen(curFile, vs);
            case "voorstel" -> isVoorstel(curFile, vs);
            case "voorstellen" -> isVoorstellen(curFile, vs);
            case "vrijstellen" -> isVrijstellen();
            case "stellen" -> (!isAanstellen(curFile, vs)
                    && !isGelijkstellen()
                    && !isGeruststellen(curFile, vs)
                    && !isInstellen(curFile, vs)
                    && !isInBewaringStellen(curFile, vs, keyArg, arg)
                    && !isOpDeProefStellen(curFile, vs, arg)
                    && !isOpstellen(curFile, vs)
                    && !isSamenstellen()
                    && !isStel(curFile, vs)
                    && !isTeleurstellen()
                    && !isTentoonstellen()
                    && !isUitstel(curFile, vs)
                    && !isUitstellen(curFile, vs)
                    && !isVaststellen(curFile, vs)
                    && !isVoorstel(curFile, vs)
                    && !isVoorstellen(curFile, vs)
                    && !isVrijstellen())
                    || isValidVerse(curFile, vs, "1Chr-19.html#vs11");
            default -> true;
        };
    }

    public static boolean isAanstellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-39.html#vs4")
                || isValidVerse(curFile, vs, "Gen-40.html#vs4")
                || isValidVerse(curFile, vs, "Gen-41.html#vs41", 43)
                || isValidVerse(curFile, vs, "Gen-47.html#vs2")
                || isValidVerse(curFile, vs, "Exod-01.html#vs11")
                || isValidVerse(curFile, vs, "Exod-18.html#vs25")
                || isValidVerse(curFile, vs, "Num-01.html#vs50")
                || isValidVerse(curFile, vs, "Deut-01.html#vs15")
                || isValidVerse(curFile, vs, "Josh-10.html#vs18")
                || isValidVerse(curFile, vs, "Judg-11.html#vs11")
                || isValidVerse(curFile, vs, "Judg-20.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs5", 22)
                || isValidVerse(curFile, vs, "1Sam-10.html#vs19")
                || isValidVerse(curFile, vs, "1Sam-11.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs5", 13)
                || isValidVerse(curFile, vs, "2Sam-02.html#vs9")
                || isValidVerse(curFile, vs, "2Sam-06.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-18.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs23")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs35")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs31", 33)
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs33")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs22")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs18")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs2")
                || isValidVerse(curFile, vs, "1Chr-26.html#vs10", 32)
                || isValidVerse(curFile, vs, "2Chr-11.html#vs11", 22)
                || isValidVerse(curFile, vs, "2Chr-19.html#vs5", 8)
                || isValidVerse(curFile, vs, "2Chr-20.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs6", 14)
                || isValidVerse(curFile, vs, "2Chr-35.html#vs2")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs8")
                || isValidVerse(curFile, vs, "Ezra-06.html#vs18")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs25")
                || isValidVerse(curFile, vs, "Esth-08.html#vs2")
                || isValidVerse(curFile, vs, "Ps-105.html#vs21")
                || isValidVerse(curFile, vs, "Ps-109.html#vs6")
                || isValidVerse(curFile, vs, "Isa-03.html#vs7")
                || isValidVerse(curFile, vs, "Isa-60.html#vs17")
                || isValidVerse(curFile, vs, "Jer-01.html#vs10", 18)
                || isValidVerse(curFile, vs, "Jer-51.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs8")
                || isValidVerse(curFile, vs, "Dan-02.html#vs21", 48, 49)
                || isValidVerse(curFile, vs, "Dan-05.html#vs11")
                || isValidVerse(curFile, vs, "Dan-06.html#vs2", 4)
                || isValidVerse(curFile, vs, "Mark-03.html#vs14")
                || isValidVerse(curFile, vs, "Acts-07.html#vs10")
                || isValidVerse(curFile, vs, "Acts-26.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-06.html#vs4")
                || isValidVerse(curFile, vs, "Heb-07.html#vs28");
    }  // isAanstellen

    public static boolean isGelijkstellen() {
        return false;
    }  // isGelijkstellen

    public static boolean isGeruststellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-33.html#vs14");
    }  // isGeruststellen

    public static boolean isInBewaringStellen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in bewaring stellen", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Acts-23.html#vs35");
        }
        return false;
    } // isInBewaringStellen

    public static boolean isInstellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-14.html#vs17")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs18");
    }  // isInstellen

    public static boolean isOpDeProefStellen(final File curFile, final String vs, final String arg) {
        if (arg.equals("op de proef stellen")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Gen-22.html#vs1")
                || isValidVerse(curFile, vs, "Exod-15.html#vs25")
                || isValidVerse(curFile, vs, "Exod-16.html#vs4")
                || isValidVerse(curFile, vs, "Exod-17.html#vs2", 7)
                || isValidVerse(curFile, vs, "Exod-20.html#vs20")
                || isValidVerse(curFile, vs, "Num-14.html#vs22")
                || isValidVerse(curFile, vs, "Deut-06.html#vs16")
                || isValidVerse(curFile, vs, "Deut-08.html#vs16")
                || isValidVerse(curFile, vs, "Deut-13.html#vs3")
                || isValidVerse(curFile, vs, "Deut-33.html#vs8")
                || isValidVerse(curFile, vs, "Judg-02.html#vs22")
                || isValidVerse(curFile, vs, "Judg-03.html#vs1", 4)
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-09.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs31")
                || isValidVerse(curFile, vs, "Ps-026.html#vs2")
                || isValidVerse(curFile, vs, "Ps-078.html#vs18", 41, 56)
                || isValidVerse(curFile, vs, "Ps-095.html#vs9")
                || isValidVerse(curFile, vs, "Ps-106.html#vs14")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs1")
                || isValidVerse(curFile, vs, "Isa-07.html#vs12")
                || isValidVerse(curFile, vs, "Dan-01.html#vs12", 14)
                || isValidVerse(curFile, vs, "John-06.html#vs6")
                || isValidVerse(curFile, vs, "Heb-03.html#vs9")
                || isValidVerse(curFile, vs, "Heb-11.html#vs17")
                || isValidVerse(curFile, vs, "Rev-02.html#vs2");
    }  // isOpDeProefStellen

    public static boolean isOpstellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-14.html#vs8")
                || isValidVerse(curFile, vs, "Num-11.html#vs24")
                || isValidVerse(curFile, vs, "Num-16.html#vs18")
                || isValidVerse(curFile, vs, "Josh-08.html#vs13")
                || isValidVerse(curFile, vs, "Josh-24.html#vs1")
                || isValidVerse(curFile, vs, "Judg-08.html#vs27")
                || isValidVerse(curFile, vs, "Judg-20.html#vs20", 22, 30, 33)
                || isValidVerse(curFile, vs, "1Sam-04.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs7")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs2", 8, 16, 21)
                || isValidVerse(curFile, vs, "2Sam-10.html#vs8", 9, 17)
                || isValidVerse(curFile, vs, "2Sam-18.html#vs30")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs12")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs24")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs17", 28)
                || isValidVerse(curFile, vs, "1Chr-11.html#vs14")
                || isValidVerse(curFile, vs, "1Chr-12.html#vs33", 36)
                || isValidVerse(curFile, vs, "1Chr-15.html#vs16", 17)
                || isValidVerse(curFile, vs, "1Chr-19.html#vs9", 10, 11, 17)
                || isValidVerse(curFile, vs, "2Chr-14.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs10")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs5")
                || isValidVerse(curFile, vs, "Ezra-03.html#vs10")
                || isValidVerse(curFile, vs, "Neh-04.html#vs13")
                || isValidVerse(curFile, vs, "Neh-12.html#vs31", 40)
                || isValidVerse(curFile, vs, "Job-01.html#vs17")
                || isValidVerse(curFile, vs, "Job-10.html#vs17")
                || isValidVerse(curFile, vs, "Job-33.html#vs5")
                || isValidVerse(curFile, vs, "Ps-002.html#vs2")
                || isValidVerse(curFile, vs, "Ps-074.html#vs4")
                || isValidVerse(curFile, vs, "Eccl-12.html#vs9")
                || isValidVerse(curFile, vs, "Isa-36.html#vs2", 13)
                || isValidVerse(curFile, vs, "Jer-46.html#vs4", 14)
                || isValidVerse(curFile, vs, "Jer-51.html#vs12")
                || isValidVerse(curFile, vs, "Ezek-04.html#vs2")
                || isValidVerse(curFile, vs, "Dan-06.html#vs9")
                || isValidVerse(curFile, vs, "Mic-2.html#vs8")
                || isValidVerse(curFile, vs, "Matt-05.html#vs25")
                || isValidVerse(curFile, vs, "Luke-01.html#vs1")
                || isValidVerse(curFile, vs, "Acts-04.html#vs26");
    }  // isOpstellen

    public static boolean isSamenstellen() {
        return false;
    }  // isSamenstellen

    public static boolean isStel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-45.html#vs22")
                || isValidVerse(curFile, vs, "Exod-26.html#vs4", 5, 10)
                || isValidVerse(curFile, vs, "Exod-36.html#vs11", 12, 17)
                || isValidVerse(curFile, vs, "Lev-11.html#vs21")
                || isValidVerse(curFile, vs, "Judg-14.html#vs12", 13, 19)
                || isValidVerse(curFile, vs, "Judg-17.html#vs10")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs5", 22, 23)
                || isValidVerse(curFile, vs, "Matt-10.html#vs10")
                || isValidVerse(curFile, vs, "Mark-06.html#vs9")
                || isValidVerse(curFile, vs, "Luke-03.html#vs11")
                || isValidVerse(curFile, vs, "Luke-09.html#vs3");
    }  // isStel

    public static boolean isTeleurstellen() {
        return false;
    }  // isTeleurstellen

    public static boolean isTentoonstellen() {
        return false;
    }  // isTentoonstellen

    public static boolean isUitstel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-09.html#vs38")
                || isValidVerse(curFile, vs, "Acts-25.html#vs17");
    }  // isUitstel

    public static boolean isUitstellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-05.html#vs3")
                || isValidVerse(curFile, vs, "Isa-48.html#vs9");
    }  // isUitstellen

    public static boolean isVaststellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-24.html#vs25")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-08.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs2")
                || isValidVerse(curFile, vs, "Neh-13.html#vs30")
                || isValidVerse(curFile, vs, "Esth-09.html#vs27", 32)
                || isValidVerse(curFile, vs, "Job-14.html#vs13")
                || isValidVerse(curFile, vs, "Job-28.html#vs27")
                || isValidVerse(curFile, vs, "Dan-01.html#vs5")
                || isValidVerse(curFile, vs, "Acts-05.html#vs23");
    }  // isVaststellen

    public static boolean isVoorstel(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Esth-01.html#vs21");
    }  // isVoorstel

    public static boolean isVoorstellen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-47.html#vs2", 7)
                || isValidVerse(curFile, vs, "Isa-38.html#vs13")
                || isValidVerse(curFile, vs, "Luke-02.html#vs22")
                || isValidVerse(curFile, vs, "Acts-01.html#vs23")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs2");
    }  // isVoorstellen

    public static boolean isVrijstellen() {
        return false;
    }  // isVrijstellen

}
