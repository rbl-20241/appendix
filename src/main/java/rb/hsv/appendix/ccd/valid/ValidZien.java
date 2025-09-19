package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZien {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanzien (werkwoord)" -> isAanzien_Werkwoord(curFile, vs);
            case "aanzien (zelfstandig naamwoord)" -> isAanzien_ZelfstandigNaamwoord(curFile, vs);
            case "aanzien des persoons" -> isAanzienDesPersoons(curFile, vs);
            case "aanzien voor" -> isAanzienVoor(curFile, vs);
            case "erop toezien" -> isEropToezien(curFile, vs);
            case "eruit zien" -> isEruitZien(curFile, vs);
            case "ervan afzien" -> isErvanAfzien(curFile, vs);
            case "inzien" -> isInzien(curFile, vs);
            case "neerzien" -> isNeerzien(curFile, vs);
            case "omzien" -> isOmzien(curFile, vs);
            case "over het hoofd zien" -> isOverHetHoofdZien(curFile, vs, keyArg, arg);
            case "ten aanzien van" -> isTenAanzienVan(curFile, vs);
            case "terugzien" -> isTerugzien();
            case "toezien" -> isToezien(curFile, vs);
            case "uitzien" -> isUitzien(curFile, vs);
            case "zaag" -> isZaag(curFile, vs);
            case "zagen" -> isZagen(curFile, vs);
            case "ziende" -> isZiende(curFile, vs);
            case "zien" -> isZien(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAanzien_Werkwoord(final File curFile, final String vs) {
        if (isAanzien_ZelfstandigNaamwoord(curFile, vs)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-33.html#vs13")
                || isValidVerse(curFile, vs, "Num-11.html#vs15")
                || isValidVerse(curFile, vs, "Num-16.html#vs15")
                || isValidVerse(curFile, vs, "Num-23.html#vs21")
                || isValidVerse(curFile, vs, "Deut-28.html#vs32")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs32")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-16.html#vs12")
                || isValidVerse(curFile, vs, "Esth-08.html#vs6")
                || isValidVerse(curFile, vs, "Job-10.html#vs15")
                || isValidVerse(curFile, vs, "Job-33.html#vs26")
                || isValidVerse(curFile, vs, "Job-37.html#vs24")
                || isValidVerse(curFile, vs, "Ps-009.html#vs14")
                || isValidVerse(curFile, vs, "Ps-013.html#vs4")
                || isValidVerse(curFile, vs, "Ps-022.html#vs18")
                || isValidVerse(curFile, vs, "Ps-069.html#vs17")
                || isValidVerse(curFile, vs, "Ps-119.html#vs153")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs1")
                || isValidVerse(curFile, vs, "Lam-4.html#vs16")
                || isValidVerse(curFile, vs, "Amos-5.html#vs22")
                || isValidVerse(curFile, vs, "Hab-1.html#vs13")
                || isValidVerse(curFile, vs, "Mal-2.html#vs9")
                || isValidVerse(curFile, vs, "Matt-22.html#vs16")
                || isValidVerse(curFile, vs, "Luke-23.html#vs49")
                || isValidVerse(curFile, vs, "Gal-2.html#vs6");
    } // isAanzien_Werkwoord

    public static boolean isAanzien_ZelfstandigNaamwoord(final File curFile, final String vs) {
        return isTenAanzienVan(curFile, vs)
                || isValidVerse(curFile, vs, "Gen-26.html#vs13")
                || isValidVerse(curFile, vs, "Gen-39.html#vs9")
                || isValidVerse(curFile, vs, "Gen-41.html#vs40")
                || isValidVerse(curFile, vs, "Gen-48.html#vs19")
                || isValidVerse(curFile, vs, "Exod-11.html#vs3")
                || isValidVerse(curFile, vs, "Exod-28.html#vs2", 40)
                || isValidVerse(curFile, vs, "1Sam-02.html#vs26")
                || isValidVerse(curFile, vs, "2Sam-05.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-04.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs9")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs27")
                || isValidVerse(curFile, vs, "Esth-09.html#vs4")
                || isValidVerse(curFile, vs, "Esth-10.html#vs3")
                || isValidVerse(curFile, vs, "Job-14.html#vs21")
                || isValidVerse(curFile, vs, "Ps-049.html#vs13", 21)
                || isValidVerse(curFile, vs, "Ps-071.html#vs21")
                || isValidVerse(curFile, vs, "Ps-149.html#vs4")
                || isValidVerse(curFile, vs, "Isa-02.html#vs9")
                || isValidVerse(curFile, vs, "Isa-03.html#vs3")
                || isValidVerse(curFile, vs, "Isa-05.html#vs15")
                || isValidVerse(curFile, vs, "Isa-60.html#vs7", 13)
                || isValidVerse(curFile, vs, "Jer-30.html#vs19")
                || isValidVerse(curFile, vs, "Rom-16.html#vs7")
                || isValidVerse(curFile, vs, "1Cor-06.html#vs4")
                || isValidVerse(curFile, vs, "Gal-2.html#vs2", 6);
    } // isAanzien_ZelfstandigNaamwoord

    public static boolean isAanzienDesPersoons(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rom-02.html#vs11")
                || isValidVerse(curFile, vs, "Eph-6.html#vs9")
                || isValidVerse(curFile, vs, "Col-3.html#vs25")
                || isValidVerse(curFile, vs, "Jas-2.html#vs1", 9)
                || isValidVerse(curFile, vs, "1Pet-1.html#vs17")
                || isValidVerse(curFile, vs, "Didache-04.html#vs10");
    } // isAanzienDesPersoons

    public static boolean isAanzienVoor(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-09.html#vs36");
    } // isAanzienVoor

    public static boolean isEropToezien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-04.html#vs21")
                || isValidVerse(curFile, vs, "Exod-25.html#vs40")
                || isValidVerse(curFile, vs, "Neh-04.html#vs14")
                || isValidVerse(curFile, vs, "Heb-03.html#vs12")
                || isValidVerse(curFile, vs, "Heb-08.html#vs5")
                || isValidVerse(curFile, vs, "Heb-12.html#vs15");
    } // isEropToezien

    public static boolean isEruitZien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-01.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-42.html#vs11")
                || isValidVerse(curFile, vs, "Rev-04.html#vs3")
                || isValidVerse(curFile, vs, "Rev-09.html#vs7");
    } // isEruitZien

    public static boolean isErvanAfzien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-23.html#vs22")
                || isValidVerse(curFile, vs, "Judg-20.html#vs28")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs6", 15)
                || isValidVerse(curFile, vs, "2Chr-18.html#vs5", 14)
                || isValidVerse(curFile, vs, "Jer-41.html#vs8");
    } // isErvanAfzien

    public static boolean isInzien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-32.html#vs39")
                || isValidVerse(curFile, vs, "Eccl-07.html#vs25")
                || isValidVerse(curFile, vs, "Jer-02.html#vs19", 23)
                || isValidVerse(curFile, vs, "Matt-15.html#vs17")
                || isValidVerse(curFile, vs, "Matt-16.html#vs9", 11)
                || isValidVerse(curFile, vs, "Mark-07.html#vs18")
                || isValidVerse(curFile, vs, "Mark-08.html#vs17")
                || isValidVerse(curFile, vs, "John-04.html#vs53")
                || isValidVerse(curFile, vs, "John-13.html#vs12")
                || isValidVerse(curFile, vs, "Acts-10.html#vs34")
                || isValidVerse(curFile, vs, "Rev-05.html#vs4");
    } // isInzien

    public static boolean isNeerzien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-26.html#vs15")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs30", 32)
                || isValidVerse(curFile, vs, "Ps-085.html#vs12")
                || isValidVerse(curFile, vs, "Ps-118.html#vs7")
                || isValidVerse(curFile, vs, "Prov-07.html#vs6")
                || isValidVerse(curFile, vs, "Song-1.html#vs6")
                || isValidVerse(curFile, vs, "Jer-06.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs17");
    } // isNeerzien

    public static boolean isOmzien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-21.html#vs1")
                || isValidVerse(curFile, vs, "Gen-39.html#vs23")
                || isValidVerse(curFile, vs, "Exod-02.html#vs25")
                || isValidVerse(curFile, vs, "1Sam-02.html#vs21")
                || isValidVerse(curFile, vs, "2Kgs-09.html#vs34")
                || isValidVerse(curFile, vs, "Ps-065.html#vs10")
                || isValidVerse(curFile, vs, "Ps-080.html#vs15")
                || isValidVerse(curFile, vs, "Ps-106.html#vs4")
                || isValidVerse(curFile, vs, "Ps-138.html#vs6")
                || isValidVerse(curFile, vs, "Jer-15.html#vs15")
                || isValidVerse(curFile, vs, "Jer-47.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs5");
    } // isOmzien

    public static boolean isOverHetHoofdZien(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Acts-06.html#vs1");
    } // isOverHetHoofdZien

    public static boolean isTenAanzienVan(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-47.html#vs26")
                || isValidVerse(curFile, vs, "Lev-06.html#vs7")
                || isValidVerse(curFile, vs, "Lev-20.html#vs4")
                || isValidVerse(curFile, vs, "Num-08.html#vs26")
                || isValidVerse(curFile, vs, "Deut-12.html#vs31")
                || isValidVerse(curFile, vs, "Judg-11.html#vs27", 37)
                || isValidVerse(curFile, vs, "2Sam-18.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs16")
                || isValidVerse(curFile, vs, "Esth-03.html#vs2")
                || isValidVerse(curFile, vs, "Jer-09.html#vs7")
                || isValidVerse(curFile, vs, "Jer-31.html#vs28")
                || isValidVerse(curFile, vs, "Dan-09.html#vs4")
                || isValidVerse(curFile, vs, "Luke-03.html#vs15")
                || isValidVerse(curFile, vs, "Rom-01.html#vs3")
                || isValidVerse(curFile, vs, "Rom-06.html#vs20")
                || isValidVerse(curFile, vs, "1Thess-3.html#vs5")
                || isValidVerse(curFile, vs, "1Thess-4.html#vs13");
    } // isTenAanzienVan

    public static boolean isTerugzien() {
        return false;
    } // isTerugzien

    public static boolean isToezien(final File curFile, final String vs) {
        return isEropToezien(curFile, vs)
                || isValidVerse(curFile, vs, "Ezra-04.html#vs14")
                || isValidVerse(curFile, vs, "Isa-41.html#vs28")
                || isValidVerse(curFile, vs, "Luke-11.html#vs35")
                || isValidVerse(curFile, vs, "Acts-20.html#vs28")
                || isValidVerse(curFile, vs, "1Cor-03.html#vs10")
                || isValidVerse(curFile, vs, "Didache-06.html#vs1");
    } // isToezien

    public static boolean isUitzien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-07.html#vs2")
                || isValidVerse(curFile, vs, "Ps-005.html#vs4")
                || isValidVerse(curFile, vs, "Ps-034.html#vs6")
                || isValidVerse(curFile, vs, "Isa-59.html#vs9", 11)
                || isValidVerse(curFile, vs, "Jer-05.html#vs3")
                || isValidVerse(curFile, vs, "Jer-08.html#vs15")
                || isValidVerse(curFile, vs, "Jer-14.html#vs19", 22)
                || isValidVerse(curFile, vs, "Jer-48.html#vs19")
                || isValidVerse(curFile, vs, "Hos-12.html#vs7")
                || isValidVerse(curFile, vs, "Mic-6.html#vs9")
                || isValidVerse(curFile, vs, "Luke-24.html#vs17")
                || isValidVerse(curFile, vs, "Acts-06.html#vs3");
    } // isUitzien

    public static boolean isZaag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-12.html#vs31")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs3")
                || isValidVerse(curFile, vs, "Isa-10.html#vs15");
    } // isZaag

    public static boolean isZagen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-07.html#vs9")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs3")
                || isValidVerse(curFile, vs, "Heb-11.html#vs37");
    } // isZagen

    public static boolean isZiende(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-04.html#vs11")
                || isValidVerse(curFile, vs, "Exod-23.html#vs8")
                || isValidVerse(curFile, vs, "Matt-11.html#vs5")
                || isValidVerse(curFile, vs, "Mark-10.html#vs51", 52)
                || isValidVerse(curFile, vs, "Luke-07.html#vs22")
                || isValidVerse(curFile, vs, "Luke-18.html#vs41", 42, 43)
                || isValidVerse(curFile, vs, "John-09.html#vs7", 11, 15, 18)
                || isValidVerse(curFile, vs, "Acts-09.html#vs120, 17, 18")
                || isValidVerse(curFile, vs, "Acts-22.html#vs13")
                || isValidVerse(curFile, vs, "Acts-28.html#vs26");
    } // isZiende

    public static boolean isZien(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAanzien_Werkwoord(curFile, vs)
                && !isAanzien_ZelfstandigNaamwoord(curFile, vs)
                && !isAanzienDesPersoons(curFile, vs)
                && !isAanzienVoor(curFile, vs)
                && !isEropToezien(curFile, vs)
                && !isEruitZien(curFile, vs)
                && !isErvanAfzien(curFile, vs)
                && !isInzien(curFile, vs)
                && !isNeerzien(curFile, vs)
                && !isOmzien(curFile, vs)
                && !isOverHetHoofdZien(curFile, vs, keyArg, arg)
                && !isTenAanzienVan(curFile, vs)
                && !isTerugzien()
                && !isToezien(curFile, vs)
                && !isUitzien(curFile, vs)
                && !isZaag(curFile, vs)
                && !isZagen(curFile, vs)
                && !isZiende(curFile, vs);
    }  // isZien

}
