package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGroot {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "grote (zelfstandig naamwoord)" -> isGrote(curFile, vs);
            case "Grote Beer" -> isGroteBeer(curFile, vs);
            case "grote Naam" -> isGroteNaam(curFile, vs);
            case "grote teen" -> isGroteTeen(curFile, vs);
            case "Grote Zee" -> isGroteZee(curFile, vs);
            case "groten der aarde" -> isGrotenDerAarde(curFile, vs);
            case "in groten getale" -> isInGrotenGetale(curFile, vs);
            case "groot" -> isGroot(curFile, vs);
            default -> true;
        };
    }

    public static boolean isGrote(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-01.html#vs17")
                || isValidVerse(curFile, vs, "Deut-25.html#vs13", 14)
                || isValidVerse(curFile, vs, "2Sam-07.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs31")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs14")
                || isValidVerse(curFile, vs, "Job-03.html#vs19")
                || isValidVerse(curFile, vs, "Job-35.html#vs9")
                || isValidVerse(curFile, vs, "Ps-022.html#vs30")
                || isValidVerse(curFile, vs, "Ps-104.html#vs25")
                || isValidVerse(curFile, vs, "Ps-115.html#vs13")
                || isValidVerse(curFile, vs, "Prov-18.html#vs16")
                || isValidVerse(curFile, vs, "Prov-25.html#vs6")
                || isValidVerse(curFile, vs, "Prov-26.html#vs10")
                || isValidVerse(curFile, vs, "Isa-05.html#vs9")
                || isValidVerse(curFile, vs, "Jer-16.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs14")
                || isValidVerse(curFile, vs, "Joel-2.html#vs31")
                || isValidVerse(curFile, vs, "Nah-3.html#vs10")
                || isValidVerse(curFile, vs, "Matt-20.html#vs25")
                || isValidVerse(curFile, vs, "Mark-10.html#vs42")
                || isValidVerse(curFile, vs, "Rev-06.html#vs15")
                || isValidVerse(curFile, vs, "Rev-11.html#vs18")
                || isValidVerse(curFile, vs, "Rev-13.html#vs16")
                || isValidVerse(curFile, vs, "Rev-19.html#vs5", 18);
    } // isGrote

    public static boolean isGroteBeer(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-09.html#vs9");
    } // isGroteBeer

    public static boolean isGroteNaam(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-07.html#vs9")
                || isValidVerse(curFile, vs, "1Sam-12.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs42")
                || isValidVerse(curFile, vs, "2Chr-06.html#vs32")
                || isValidVerse(curFile, vs, "Jer-44.html#vs26")
                || isValidVerse(curFile, vs, "Ezek-36.html#vs23");
    } // isGroteNaam

    public static boolean isGroteTeen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-29.html#vs20")
                || isValidVerse(curFile, vs, "Lev-08.html#vs23", 24)
                || isValidVerse(curFile, vs, "Lev-14.html#vs14", 17, 25, 28)
                || isValidVerse(curFile, vs, "Judg-01.html#vs6", 7);
    } // isGroteTeen

    public static boolean isGroteZee(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-34.html#vs6", 7)
                || isValidVerse(curFile, vs, "Josh-01.html#vs4")
                || isValidVerse(curFile, vs, "Josh-09.html#vs1")
                || isValidVerse(curFile, vs, "Josh-15.html#vs12", 47)
                || isValidVerse(curFile, vs, "Josh-23.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-47.html#vs10", 15, 19, 20)
                || isValidVerse(curFile, vs, "Ezek-48.html#vs28");
    } // isGroteZee

    public static boolean isGrotenDerAarde(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-022.html#vs30")
                || isValidVerse(curFile, vs, "Isa-23.html#vs8", 9)
                || isValidVerse(curFile, vs, "Rev-18.html#vs23");
    } // isGrotenDerAarde

    public static boolean isInGrotenGetale(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-15.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs24")
                || isValidVerse(curFile, vs, "Heb-07.html#vs23");
    } // isInGrotenGetale

    public static boolean isGroot(final File curFile, final String vs) {
        return !isGrote(curFile, vs)
                && !isGroteBeer(curFile, vs)
                && !isGroteNaam(curFile, vs)
                && !isGroteTeen(curFile, vs)
                && !isGroteZee(curFile, vs)
                && !isGrotenDerAarde(curFile, vs)
                && !isInGrotenGetale(curFile, vs);
    } // isGroot
}
