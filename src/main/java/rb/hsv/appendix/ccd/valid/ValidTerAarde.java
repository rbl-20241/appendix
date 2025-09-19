package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidTerAarde {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "ter aarde buigen" -> isTerAardeBuigen(curFile, vs, arg);
            case "ter aarde hangen" -> isTerAardeHangen(curFile, vs, arg);
            case "ter aarde knielen" -> isTerAardeKnielen(curFile, vs, arg);
            case "ter aarde liggen" -> isTerAardeLiggen(curFile, vs, arg);
            case "ter aarde neerbuigen" -> isTerAardeNeerbuigen(curFile, vs, arg);
            case "ter aarde neerdalen" -> isTerAardeNeerdalen(curFile, vs, arg);
            case "ter aarde neerstorten" -> isTerAardeNeerstorten(curFile, vs, arg);
            case "ter aarde neervallen" -> isTerAardeNeervallen(curFile, vs, arg);
            case "ter aarde slaan" -> isTerAardeSlaan(curFile, vs, arg);
            case "ter aarde storten" -> isTerAardeStorten(curFile, vs, arg);
            case "ter aarde uitstorten" -> isTerAardeUitstorten(curFile, vs, arg);
            case "ter aarde vallen" -> isTerAardeVallen(curFile, vs, arg);
            case "ter aarde werpen" -> isTerAardeWerpen(curFile, vs, arg);
            case "ter aarde zinken" -> isTerAardeZinken(curFile, vs, arg);
            case "ter aarde" -> isTerAarde(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isTerAardeBuigen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde buigen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-18.html#vs2")
                || isValidVerse(curFile, vs, "Gen-19.html#vs1")
                || isValidVerse(curFile, vs, "Gen-43.html#vs26")
                || isValidVerse(curFile, vs, "Gen-48.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs23", 41)
                || isValidVerse(curFile, vs, "2Sam-18.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs42")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs37")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs18");
    } // isTerAardeBuigen

    public static boolean isTerAardeHangen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde hangen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lam-2.html#vs10");
    } // isTerAardeHangen

    public static boolean isTerAardeKnielen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde knielen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Exod-34.html#vs8")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-28.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs31")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs3");
    } // isTerAardeKnielen

    public static boolean isTerAardeLiggen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde liggen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Josh-07.html#vs10")
                || isValidVerse(curFile, vs, "Jer-14.html#vs2")
                || isValidVerse(curFile, vs, "Lam-2.html#vs21")
                || isValidVerse(curFile, vs, "Amos-5.html#vs7");
    } // isTerAardeLiggen

    public static boolean isTerAardeNeerbuigen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde neerbuigen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-24.html#vs52")
                || isValidVerse(curFile, vs, "Gen-33.html#vs3")
                || isValidVerse(curFile, vs, "Gen-37.html#vs10")
                || isValidVerse(curFile, vs, "Gen-42.html#vs6")
                || isValidVerse(curFile, vs, "Num-22.html#vs31")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs33")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs20")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-02.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs21")
                || isValidVerse(curFile, vs, "Neh-08.html#vs7")
                || isValidVerse(curFile, vs, "Ps-017.html#vs11")
                || isValidVerse(curFile, vs, "Isa-49.html#vs23");
    } // isTerAardeNeerbuigen

    public static boolean isTerAardeNeerdalen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde neerdalen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-63.html#vs6");
    } //

    public static boolean isTerAardeNeerstorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde neerstorten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-25.html#vs12");
    } // isTerAardeNeerstorten

    public static boolean isTerAardeNeervallen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde neervallen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Chr-20.html#vs24");
    } // isTerAardeNeervallen

    public static boolean isTerAardeSlaan(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde slaan")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-02.html#vs22");
    } // isTerAardeSlaan

    public static boolean isTerAardeStorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde storten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "2Sam-20.html#vs10")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs11");
    } // isTerAardeStorten

    public static boolean isTerAardeUitstorten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde uitstorten")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lam-2.html#vs11");
    } // isTerAardeUitstorten

    public static boolean isTerAardeVallen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde vallen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Judg-20.html#vs21", 25)
                || isValidVerse(curFile, vs, "1Sam-05.html#vs3", 4)
                || isValidVerse(curFile, vs, "1Sam-17.html#vs49")
                || isValidVerse(curFile, vs, "2Kgs-10.html#vs10")
                || isValidVerse(curFile, vs, "Dan-08.html#vs10");
    } // isTerAardeVallen

    public static boolean isTerAardeWerpen(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde werpen")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Gen-17.html#vs3", 17)
                || isValidVerse(curFile, vs, "Lev-09.html#vs24")
                || isValidVerse(curFile, vs, "Num-14.html#vs5")
                || isValidVerse(curFile, vs, "Num-16.html#vs4", 22, 45)
                || isValidVerse(curFile, vs, "Num-20.html#vs6")
                || isValidVerse(curFile, vs, "Josh-05.html#vs14")
                || isValidVerse(curFile, vs, "Josh-07.html#vs6")
                || isValidVerse(curFile, vs, "Judg-13.html#vs20")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-20.html#vs41")
                || isValidVerse(curFile, vs, "2Sam-01.html#vs2")
                || isValidVerse(curFile, vs, "2Sam-09.html#vs6")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs4", 22)
                || isValidVerse(curFile, vs, "1Kgs-18.html#vs7", 39)
                || isValidVerse(curFile, vs, "1Chr-21.html#vs16")
                || isValidVerse(curFile, vs, "Isa-28.html#vs2")
                || isValidVerse(curFile, vs, "Lam-2.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-01.html#vs28")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs23")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs8")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs4")
                || isValidVerse(curFile, vs, "Dan-02.html#vs46")
                || isValidVerse(curFile, vs, "Dan-08.html#vs12", 17)
                || isValidVerse(curFile, vs, "Matt-17.html#vs6")
                || isValidVerse(curFile, vs, "Matt-26.html#vs39")
                || isValidVerse(curFile, vs, "Mark-14.html#vs35")
                || isValidVerse(curFile, vs, "Luke-05.html#vs12")
                || isValidVerse(curFile, vs, "Luke-17.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs25")
                || isValidVerse(curFile, vs, "Rev-07.html#vs11")
                || isValidVerse(curFile, vs, "Rev-11.html#vs16");
    } // isTerAardeWerpen

    public static boolean isTerAardeZinken(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("ter aarde zinken")) {
            return false;
        }
        return isValidVerse(curFile, vs, "Lam-2.html#vs9");
    } // isTerAardeZinken

    private static boolean isTerAarde(final File curFile, final String vs, final String arg) {
        return !isTerAardeBuigen(curFile, vs, arg)
                && !isTerAardeHangen(curFile, vs, arg)
                && !isTerAardeKnielen(curFile, vs, arg)
                && !isTerAardeLiggen(curFile, vs, arg)
                && !isTerAardeNeerbuigen(curFile, vs, arg)
                && !isTerAardeNeerdalen(curFile, vs, arg)
                && !isTerAardeNeervallen(curFile, vs, arg)
                && !isTerAardeNeerstorten(curFile, vs, arg)
                && !isTerAardeSlaan(curFile, vs, arg)
                && !isTerAardeStorten(curFile, vs, arg)
                && !isTerAardeUitstorten(curFile, vs, arg)
                && !isTerAardeVallen(curFile, vs, arg)
                && !isTerAardeWerpen(curFile, vs, arg)
                && !isTerAardeZinken(curFile, vs, arg);
    }  // isTerAarde

}
