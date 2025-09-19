package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidVoorOgen.isVoorOgenHebben;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidHebben {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "deelhebben" -> isDeelhebben(curFile, vs);
            case "leiding hebben" -> isLeidingHebben(curFile, vs);
            case "liefhebben" -> isLiefhebben(curFile, vs);
            case "plaatshebben" -> isPlaatshebben();
            case "hebben" -> isHebben(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isDeelhebben(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-22.html#vs25", 27)
                || isValidVerse(curFile, vs, "Josh-18.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs1")
                || isValidVerse(curFile, vs, "1Kgs-12.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-10.html#vs16")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs16")
                || isValidVerse(curFile, vs, "Neh-02.html#vs20")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs6")
                || isValidVerse(curFile, vs, "John-13.html#vs8")
                || isValidVerse(curFile, vs, "1Cor-10.html#vs17")
                || isValidVerse(curFile, vs, "Col-1.html#vs12")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs22")
                || isValidVerse(curFile, vs, "Heb-02.html#vs14")
                || isValidVerse(curFile, vs, "2John-1.html#vs11")
                || isValidVerse(curFile, vs, "Rev-20.html#vs6");
    } // isDeelhebben

    public static boolean isLeidingHebben(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-10.html#vs14", 15, 16, 18, 19, 20, 22, 23, 24, 25, 26, 27)
                || isValidVerse(curFile, vs, "Judg-05.html#vs2")
                || isValidVerse(curFile, vs, "Judg-16.html#vs31")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-08.html#vs10");
    } // isLeidingHebben

    public static boolean isLiefhebben(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-24.html#vs67")
                || isValidVerse(curFile, vs, "Gen-25.html#vs28")
                || isValidVerse(curFile, vs, "Gen-29.html#vs18", 30)
                || isValidVerse(curFile, vs, "Gen-34.html#vs3")
                || isValidVerse(curFile, vs, "Gen-37.html#vs3")
                || isValidVerse(curFile, vs, "Gen-44.html#vs20")
                || isValidVerse(curFile, vs, "Exod-21.html#vs5")
                || isValidVerse(curFile, vs, "Deut-10.html#vs12", 15)
                || isValidVerse(curFile, vs, "Deut-11.html#vs13", 22)
                || isValidVerse(curFile, vs, "Deut-19.html#vs9")
                || isValidVerse(curFile, vs, "Deut-30.html#vs6", 16, 20)
                || isValidVerse(curFile, vs, "Deut-33.html#vs3")
                || isValidVerse(curFile, vs, "Judg-16.html#vs15")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs17")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs24")
                || isValidVerse(curFile, vs, "2Sam-13.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-11.html#vs21")
                || isValidVerse(curFile, vs, "Esth-02.html#vs17")
                || isValidVerse(curFile, vs, "Ps-011.html#vs7")
                || isValidVerse(curFile, vs, "Ps-018.html#vs2")
                || isValidVerse(curFile, vs, "Ps-026.html#vs8")
                || isValidVerse(curFile, vs, "Ps-031.html#vs24")
                || isValidVerse(curFile, vs, "Ps-033.html#vs5")
                || isValidVerse(curFile, vs, "Ps-037.html#vs28")
                || isValidVerse(curFile, vs, "Ps-045.html#vs8")
                || isValidVerse(curFile, vs, "Ps-052.html#vs5", 6)
                || isValidVerse(curFile, vs, "Ps-087.html#vs2")
                || isValidVerse(curFile, vs, "Ps-116.html#vs1")
                || isValidVerse(curFile, vs, "Ps-119.html#vs97", 113, 119, 127, 140, 163, 167)
                || isValidVerse(curFile, vs, "Ps-146.html#vs8")
                || isValidVerse(curFile, vs, "Prov-04.html#vs6")
                || isValidVerse(curFile, vs, "Prov-08.html#vs17", 36)
                || isValidVerse(curFile, vs, "Prov-12.html#vs1")
                || isValidVerse(curFile, vs, "Prov-15.html#vs9")
                || isValidVerse(curFile, vs, "Prov-16.html#vs13")
                || isValidVerse(curFile, vs, "Prov-17.html#vs17", 19)
                || isValidVerse(curFile, vs, "Prov-19.html#vs8")
                || isValidVerse(curFile, vs, "Prov-20.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-03.html#vs8")
                || isValidVerse(curFile, vs, "Song-1.html#vs3", 4)
                || isValidVerse(curFile, vs, "Isa-48.html#vs14")
                || isValidVerse(curFile, vs, "Isa-56.html#vs6", 9)
                || isValidVerse(curFile, vs, "Isa-57.html#vs8")
                || isValidVerse(curFile, vs, "Isa-61.html#vs8")
                || isValidVerse(curFile, vs, "Jer-02.html#vs25")
                || isValidVerse(curFile, vs, "Hos-09.html#vs1")
                || isValidVerse(curFile, vs, "Hos-11.html#vs1")
                || isValidVerse(curFile, vs, "Amos-5.html#vs15")
                || isValidVerse(curFile, vs, "Mic-3.html#vs2")
                || isValidVerse(curFile, vs, "Mic-6.html#vs8")
                || isValidVerse(curFile, vs, "Zech-08.html#vs17", 19)
                || isValidVerse(curFile, vs, "Matt-05.html#vs44")
                || isValidVerse(curFile, vs, "Mark-10.html#vs21", 33)
                || isValidVerse(curFile, vs, "Luke-06.html#vs27", 32, 35)
                || isValidVerse(curFile, vs, "Luke-07.html#vs5", 47)
                || isValidVerse(curFile, vs, "Luke-11.html#vs43")
                || isValidVerse(curFile, vs, "John-03.html#vs16", 35)
                || isValidVerse(curFile, vs, "John-05.html#vs20")
                || isValidVerse(curFile, vs, "John-10.html#vs17")
                || isValidVerse(curFile, vs, "John-11.html#vs5", 36)
                || isValidVerse(curFile, vs, "John-12.html#vs43")
                || isValidVerse(curFile, vs, "John-16.html#vs27")
                || isValidVerse(curFile, vs, "John-21.html#vs15", 16)
                || isValidVerse(curFile, vs, "Rom-12.html#vs10")
                || isValidVerse(curFile, vs, "Rom-13.html#vs8")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs7")
                || isValidVerse(curFile, vs, "Eph-5.html#vs25", 28)
                || isValidVerse(curFile, vs, "Col-3.html#vs19")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs9")
                || isValidVerse(curFile, vs, "Titus-2.html#vs4")
                || isValidVerse(curFile, vs, "Heb-01.html#vs9")
                || isValidVerse(curFile, vs, "1Pet-1.html#vs8", 22)
                || isValidVerse(curFile, vs, "1Pet-2.html#vs17")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs8")
                || isValidVerse(curFile, vs, "1John-2.html#vs15")
                || isValidVerse(curFile, vs, "1John-4.html#vs10", 19, 20)
                || isValidVerse(curFile, vs, "1John-5.html#vs1");
    } // isLiefhebben

    public static boolean isPlaatshebben() {
        return IS_NOT_FOUND;
    } // isPlaatshebben

    public static boolean isHebben(final File curFile, final String vs, final String arg) {
        return !isDeelhebben(curFile, vs)
                && !isLeidingHebben(curFile, vs)
                && !isLiefhebben(curFile, vs)
                && !isPlaatshebben()
                && !isVoorOgenHebben(curFile, vs, arg);
    } // isHebben
}
