package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSpreken {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanspreken" -> isAanspreken(curFile, vs);
            case "afspreken" -> isAfspreken(curFile, vs);
            case "in raadselen spreken" -> isInRaadselenSpreken(curFile, vs);
            case "juist spreken" -> isJuistSpreken(curFile, vs);
            case "kwaadspreken" -> isKwaadspreken(curFile, vs);
            case "naar het hart spreken" -> isNaarHetHartSpreken(curFile, vs);
            case "rechtspreken" -> isRechtspreken(curFile, vs);
            case "stof tot spreken" -> isStofTotSpreken(curFile, vs);
            case "tegenspreken" -> isTegenspreken(curFile, vs);
            case "toespreken" -> isToespreken(curFile, vs);
            case "uitspreken" -> isUitspreken(curFile, vs);
            case "vrijmoedig spreken" -> isVrijmoedigSpreken(curFile, vs);
            case "vrijuit spreken" -> isVrijuitSpreken(curFile, vs);
            case "waarheid spreken" -> isWaarheidSpreken(curFile, vs);
            case "weerspreken" -> isWeerspreken();
            case "zaligspreken" -> isZaligspreken(curFile, vs);
            case "spreken" -> isSpreken(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-43.html#vs19")
                || isValidVerse(curFile, vs, "Judg-19.html#vs22")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs21")
                || isValidVerse(curFile, vs, "Matt-14.html#vs27");
    } // isAanspreken

    public static boolean isAfspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-02.html#vs11")
                || isValidVerse(curFile, vs, "Ps-064.html#vs6");
    } // isAfspreken

    public static boolean isInRaadselenSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-20.html#vs49");
    } // isInRaadselenSpreken

    public static boolean isJuistSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-10.html#vs29")
                || isValidVerse(curFile, vs, "Job-42.html#vs8")
                || isValidVerse(curFile, vs, "Luke-20.html#vs21");
    } // isJuistSpreken

    public static boolean isKwaadspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-041.html#vs6")
                || isValidVerse(curFile, vs, "Ps-050.html#vs20")
                || isValidVerse(curFile, vs, "Mark-09.html#vs39")
                || isValidVerse(curFile, vs, "Acts-23.html#vs5")
                || isValidVerse(curFile, vs, "Jas-4.html#vs11")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs16")
                || isValidVerse(curFile, vs, "Didache-02.html#vs3");
    } // isKwaadspreken

    public static boolean isNaarHetHartSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-50.html#vs21")
                || isValidVerse(curFile, vs, "Judg-19.html#vs3")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-19.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs22")
                || isValidVerse(curFile, vs, "2Chr-32.html#vs6")
                || isValidVerse(curFile, vs, "Isa-40.html#vs2")
                || isValidVerse(curFile, vs, "Hos-02.html#vs13");
    } // isNaarHetHartSpreken

    public static boolean isRechtspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-18.html#vs13")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs32")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs23")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs25")
                || isValidVerse(curFile, vs, "Job-36.html#vs31")
                || isValidVerse(curFile, vs, "Ps-037.html#vs30")
                || isValidVerse(curFile, vs, "Ps-050.html#vs4")
                || isValidVerse(curFile, vs, "Ps-058.html#vs2")
                || isValidVerse(curFile, vs, "Ps-110.html#vs6")
                || isValidVerse(curFile, vs, "Isa-03.html#vs13")
                || isValidVerse(curFile, vs, "Isa-28.html#vs6")
                || isValidVerse(curFile, vs, "Mic-3.html#vs11");
    } // isRechtspreken

    public static boolean isStofTotSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-068.html#vs12");
    } // isStofTotSpreken

    public static boolean isTegenspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-19.html#vs18")
                || isValidVerse(curFile, vs, "Acts-13.html#vs45")
                || isValidVerse(curFile, vs, "Acts-19.html#vs36")
                || isValidVerse(curFile, vs, "Titus-2.html#vs9");
    } // isTegenspreken

    public static boolean isToespreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-09.html#vs21")
                || isValidVerse(curFile, vs, "Luke-23.html#vs20")
                || isValidVerse(curFile, vs, "Acts-20.html#vs7")
                || isValidVerse(curFile, vs, "Acts-21.html#vs39", 40);
    } // isToespreken

    public static boolean isUitspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-11.html#vs29")
                || isValidVerse(curFile, vs, "Judg-12.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-17.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs6")
                || isValidVerse(curFile, vs, "Neh-06.html#vs12")
                || isValidVerse(curFile, vs, "Prov-01.html#vs21")
                || isValidVerse(curFile, vs, "Jer-26.html#vs8", 15)
                || isValidVerse(curFile, vs, "Jer-39.html#vs5")
                || isValidVerse(curFile, vs, "Jer-52.html#vs9")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs7")
                || isValidVerse(curFile, vs, "Luke-11.html#vs53")
                || isValidVerse(curFile, vs, "Luke-19.html#vs11")
                || isValidVerse(curFile, vs, "Acts-02.html#vs4")
                || isValidVerse(curFile, vs, "Acts-07.html#vs6")
                || isValidVerse(curFile, vs, "Acts-19.html#vs13")
                || isValidVerse(curFile, vs, "Acts-23.html#vs3")
                || isValidVerse(curFile, vs, "2Cor-12.html#vs4");
    } // isUitspreken

    public static boolean isVrijmoedigSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-09.html#vs27", 29)
                || isValidVerse(curFile, vs, "Acts-14.html#vs3")
                || isValidVerse(curFile, vs, "Acts-18.html#vs26")
                || isValidVerse(curFile, vs, "Acts-19.html#vs8")
                || isValidVerse(curFile, vs, "Acts-26.html#vs26")
                || isValidVerse(curFile, vs, "Eph-6.html#vs20");
    } // isVrijmoedigSpreken

    public static boolean isVrijuitSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Mark-08.html#vs32")
                || isValidVerse(curFile, vs, "John-07.html#vs26");
    } // isVrijuitSpreken

    public static boolean isWaarheidSpreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-42.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs15")
                || isValidVerse(curFile, vs, "Ps-015.html#vs2")
                || isValidVerse(curFile, vs, "Jer-09.html#vs5")
                || isValidVerse(curFile, vs, "Jer-23.html#vs28")
                || isValidVerse(curFile, vs, "Amos-5.html#vs10")
                || isValidVerse(curFile, vs, "Zech-08.html#vs16")
                || isValidVerse(curFile, vs, "John-08.html#vs40", 45, 46)
                || isValidVerse(curFile, vs, "John-19.html#vs35")
                || isValidVerse(curFile, vs, "Acts-26.html#vs25")
                || isValidVerse(curFile, vs, "Rom-09.html#vs1")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-12.html#vs6")
                || isValidVerse(curFile, vs, "Eph-4.html#vs25");
    } // isWaarheidSpreken

    public static boolean isWeerspreken() {
        return false;
    } // isWeerspreken

    public static boolean isZaligspreken(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Luke-01.html#vs48")
                || isValidVerse(curFile, vs, "Rom-04.html#vs6");
    } // isZaligspreken

    public static boolean isSpreken(final File curFile, final String vs) {
        return !isAanspreken(curFile, vs)
                && !isAfspreken(curFile, vs)
                && !isInRaadselenSpreken(curFile, vs)
                && !isJuistSpreken(curFile, vs)
                && !isKwaadspreken(curFile, vs)
                && !isNaarHetHartSpreken(curFile, vs)
                && !isRechtspreken(curFile, vs)
                && !isStofTotSpreken(curFile, vs)
                && !isTegenspreken(curFile, vs)
                && !isToespreken(curFile, vs)
                && !isUitspreken(curFile, vs)
                && !isVrijmoedigSpreken(curFile, vs)
                && !isVrijuitSpreken(curFile, vs)
                && !isWaarheidSpreken(curFile, vs)
                && !isWeerspreken()
                && !isZaligspreken(curFile, vs);
    } // isSpreken
}
