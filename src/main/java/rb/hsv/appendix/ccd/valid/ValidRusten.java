package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidGaan.isTeRusteGaan;
import static rb.hsv.appendix.ccd.valid.ValidGeven.isRustGeven;
import static rb.hsv.appendix.ccd.valid.ValidKomen.isTotRustKomen;
import static rb.hsv.appendix.ccd.valid.ValidLaten.isMetRustLaten;
import static rb.hsv.appendix.ccd.valid.ValidLeggen.isTeRusteLeggen;
import static rb.hsv.appendix.ccd.valid.ValidStellen.isGeruststellen;
import static rb.hsv.appendix.ccd.valid.ValidVinden.isRustVinden;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRusten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "gerust" -> isGerust(curFile, vs);
            case "rust" -> isRust(curFile, vs, arg);
            case "toerusten" -> isToerusten(curFile, vs);
            case "uitrusten" -> isUitrusten(curFile, vs);
            case "rusten" -> isRusten(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isGerust(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-34.html#vs12")
                || isValidVerse(curFile, vs, "Job-03.html#vs26")
                || isValidVerse(curFile, vs, "Job-21.html#vs23")
                || isValidVerse(curFile, vs, "Isa-38.html#vs15")
                || isValidVerse(curFile, vs, "Jer-49.html#vs31")
                || isValidVerse(curFile, vs, "Lam-1.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs42")
                || isValidVerse(curFile, vs, "Zech-07.html#vs7");
    } // isGerust

    public static boolean isRust(final File curFile, final String vs, final @NotNull String arg) {
        return isRustGeven(curFile, vs)
                || isRustVinden(curFile, vs)
                || isMetRustLaten(curFile, vs, arg)
                || isTotRustKomen(curFile, vs, arg)
                || isValidVerse(curFile, vs, "Gen-49.html#vs15")
                || isValidVerse(curFile, vs, "Exod-31.html#vs15")
                || isValidVerse(curFile, vs, "Exod-35.html#vs2")
                || isValidVerse(curFile, vs, "Lev-16.html#vs31")
                || isValidVerse(curFile, vs, "Lev-23.html#vs3", 32)
                || isValidVerse(curFile, vs, "Lev-25.html#vs2", 4, 5)
                || isValidVerse(curFile, vs, "Deut-12.html#vs9")
                || isValidVerse(curFile, vs, "Judg-03.html#vs11", 30)
                || isValidVerse(curFile, vs, "Judg-05.html#vs31")
                || isValidVerse(curFile, vs, "Judg-08.html#vs28")
                || isValidVerse(curFile, vs, "Ruth-3.html#vs1")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs17")
                || isValidVerse(curFile, vs, "1Chr-28.html#vs2")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs5", 6)
                || isValidVerse(curFile, vs, "2Chr-23.html#vs21")
                || isValidVerse(curFile, vs, "Neh-09.html#vs28")
                || isValidVerse(curFile, vs, "Esth-02.html#vs18")
                || isValidVerse(curFile, vs, "Esth-09.html#vs16", 22)
                || isValidVerse(curFile, vs, "Job-03.html#vs13", 18)
                || isValidVerse(curFile, vs, "Job-07.html#vs19")
                || isValidVerse(curFile, vs, "Job-12.html#vs6")
                || isValidVerse(curFile, vs, "Job-14.html#vs6")
                || isValidVerse(curFile, vs, "Job-16.html#vs12")
                || isValidVerse(curFile, vs, "Job-20.html#vs20")
                || isValidVerse(curFile, vs, "Ps-030.html#vs7")
                || isValidVerse(curFile, vs, "Ps-073.html#vs12")
                || isValidVerse(curFile, vs, "Ps-095.html#vs11")
                || isValidVerse(curFile, vs, "Ps-116.html#vs7")
                || isValidVerse(curFile, vs, "Ps-122.html#vs7")
                || isValidVerse(curFile, vs, "Ps-131.html#vs2")
                || isValidVerse(curFile, vs, "Prov-01.html#vs32")
                || isValidVerse(curFile, vs, "Prov-17.html#vs1")
                || isValidVerse(curFile, vs, "Prov-29.html#vs9")
                || isValidVerse(curFile, vs, "Eccl-04.html#vs6")
                || isValidVerse(curFile, vs, "Eccl-06.html#vs5")
                || isValidVerse(curFile, vs, "Eccl-09.html#vs17")
                || isValidVerse(curFile, vs, "Isa-23.html#vs12")
                || isValidVerse(curFile, vs, "Isa-30.html#vs15")
                || isValidVerse(curFile, vs, "Isa-32.html#vs17", 18)
                || isValidVerse(curFile, vs, "Isa-62.html#vs6")
                || isValidVerse(curFile, vs, "Isa-66.html#vs1")
                || isValidVerse(curFile, vs, "Jer-12.html#vs1")
                || isValidVerse(curFile, vs, "Jer-22.html#vs21")
                || isValidVerse(curFile, vs, "Jer-30.html#vs10")
                || isValidVerse(curFile, vs, "Jer-31.html#vs2")
                || isValidVerse(curFile, vs, "Jer-46.html#vs27")
                || isValidVerse(curFile, vs, "Jer-47.html#vs6", 7)
                || isValidVerse(curFile, vs, "Jer-50.html#vs34")
                || isValidVerse(curFile, vs, "Lam-2.html#vs18")
                || isValidVerse(curFile, vs, "Lam-3.html#vs49")
                || isValidVerse(curFile, vs, "Lam-5.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs49")
                || isValidVerse(curFile, vs, "Dan-08.html#vs25")
                || isValidVerse(curFile, vs, "Dan-11.html#vs21", 24)
                || isValidVerse(curFile, vs, "Mic-2.html#vs10")
                || isValidVerse(curFile, vs, "Matt-12.html#vs43")
                || isValidVerse(curFile, vs, "Luke-11.html#vs24")
                || isValidVerse(curFile, vs, "Luke-12.html#vs19")
                || isValidVerse(curFile, vs, "Acts-07.html#vs49")
                || isValidVerse(curFile, vs, "2Cor-02.html#vs12")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs5")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs12")
                || isValidVerse(curFile, vs, "Heb-03.html#vs11", 18)
                || isValidVerse(curFile, vs, "Heb-04.html#vs1", 3, 4, 5, 6, 8, 10, 11)
                || isValidVerse(curFile, vs, "Rev-04.html#vs8")
                || isValidVerse(curFile, vs, "Rev-14.html#vs11");
    } // isRust

    public static boolean isToerusten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs38")
                || isValidVerse(curFile, vs, "Deut-03.html#vs28")
                || isValidVerse(curFile, vs, "Eph-4.html#vs12");
    } // isToerusten

    public static boolean isUitrusten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-18.html#vs4")
                || isValidVerse(curFile, vs, "Job-03.html#vs17")
                || isValidVerse(curFile, vs, "Mark-06.html#vs31");
    } // isUitrusten

    public static boolean isRusten(final File curFile, final String vs, final @NotNull String arg) {
        return (!isGerust(curFile, vs)
                && !isGeruststellen(curFile, vs)
                && !isMetRustLaten(curFile, vs, arg)
                && !isRust(curFile, vs, arg)
                && !isRustGeven(curFile, vs)
                && !isRustVinden(curFile, vs)
                && !isTeRusteGaan(curFile, vs, arg)
                && !isTeRusteLeggen(curFile, vs, arg)
                && !isToerusten(curFile, vs)
                && !isTotRustKomen(curFile, vs, arg)
                && !isUitrusten(curFile, vs))
                || (arg.equals("gerust") && isValidVerse(curFile, vs, "Heb-04.html#vs10"));
    } // isRusten

}
