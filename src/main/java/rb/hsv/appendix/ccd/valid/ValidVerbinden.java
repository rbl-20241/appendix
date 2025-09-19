package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVerbinden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "ark van het verbond" -> isArkVanHetVerbond(curFile, vs);
            case "eeuwig verbond" -> isEeuwigVerbond(curFile, vs);
            case "nieuw verbond" -> isNieuwVerbond(curFile, vs);
            case "verbond" -> isVerbond(curFile, vs);
            case "verbinden" -> isVerbinden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isArkVanHetVerbond(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-10.html#vs33")
                || isValidVerse(curFile, vs, "Num-14.html#vs44")
                || isValidVerse(curFile, vs, "Deut-10.html#vs8")
                || isValidVerse(curFile, vs, "Deut-31.html#vs9", 25, 26)
                || isValidVerse(curFile, vs, "Josh-03.html#vs3", 6, 8, 11, 14, 17)
                || isValidVerse(curFile, vs, "Josh-04.html#vs7", 9, 18)
                || isValidVerse(curFile, vs, "Josh-06.html#vs6", 8)
                || isValidVerse(curFile, vs, "Josh-08.html#vs33")
                || isValidVerse(curFile, vs, "Judg-20.html#vs27")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs3", 4, 5)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs24")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs15")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs19")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs1", 6)
                || isValidVerse(curFile, vs, "1Chr-15.html#vs25", 26, 28, 29)
                || isValidVerse(curFile, vs, "1Chr-16.html#vs6", 37)
                || isValidVerse(curFile, vs, "1Chr-17.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs19")
                || isValidVerse(curFile, vs, "1Chr-28.html#vs2", 18)
                || isValidVerse(curFile, vs, "2Chr-05.html#vs2", 7)
                || isValidVerse(curFile, vs, "Jer-03.html#vs16")
                || isValidVerse(curFile, vs, "Heb-09.html#vs4");
    } // isArkVanHetVerbond

    public static boolean isEeuwigVerbond(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-09.html#vs16")
                || isValidVerse(curFile, vs, "Gen-17.html#vs7", 13, 20)
                || isValidVerse(curFile, vs, "Exod-31.html#vs16")
                || isValidVerse(curFile, vs, "Lev-24.html#vs8")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-16.html#vs17")
                || isValidVerse(curFile, vs, "Ps-105.html#vs10")
                || isValidVerse(curFile, vs, "Isa-24.html#vs5")
                || isValidVerse(curFile, vs, "Isa-55.html#vs3")
                || isValidVerse(curFile, vs, "Isa-61.html#vs8")
                || isValidVerse(curFile, vs, "Jer-32.html#vs40")
                || isValidVerse(curFile, vs, "Jer-50.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs60")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs26")
                || isValidVerse(curFile, vs, "Heb-13.html#vs20");
    } // isEeuwigVerbond

    public static boolean isNieuwVerbond(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-31.html#vs31")
                || isValidVerse(curFile, vs, "Matt-26.html#vs28")
                || isValidVerse(curFile, vs, "Mark-14.html#vs24")
                || isValidVerse(curFile, vs, "Luke-22.html#vs20")
                || isValidVerse(curFile, vs, "1Cor-11.html#vs25")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs6")
                || isValidVerse(curFile, vs, "Heb-08.html#vs8", 13)
                || isValidVerse(curFile, vs, "Heb-09.html#vs15")
                || isValidVerse(curFile, vs, "Heb-12.html#vs24");
    } // isNieuwVerbond

    public static boolean isVerbinden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-44.html#vs30")
                || isValidVerse(curFile, vs, "Exod-26.html#vs17")
                || isValidVerse(curFile, vs, "Exod-36.html#vs22")
                || isValidVerse(curFile, vs, "Exod-38.html#vs17")
                || isValidVerse(curFile, vs, "Judg-20.html#vs11")
                || isValidVerse(curFile, vs, "1Sam-18.html#vs1")
                || isValidVerse(curFile, vs, "Job-05.html#vs18")
                || isValidVerse(curFile, vs, "Ps-147.html#vs3")
                || isValidVerse(curFile, vs, "Isa-01.html#vs6")
                || isValidVerse(curFile, vs, "Isa-30.html#vs26")
                || isValidVerse(curFile, vs, "Isa-61.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-34.html#vs4", 16)
                || isValidVerse(curFile, vs, "Hos-06.html#vs1")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs27")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs3")
                || isValidVerse(curFile, vs, "Phlm-1.html#vs12")
                || isValidVerse(curFile, vs, "Didache-03.html#vs9");
    } // isVerbinden

    public static boolean isVerbond(final File curFile, final String vs) {
        return !isArkVanHetVerbond(curFile, vs)
                && !isVerbinden(curFile, vs);
    }  // isVerbond

}
