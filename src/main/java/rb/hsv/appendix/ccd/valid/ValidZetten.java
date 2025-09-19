package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.ValidKijken.isTeKijkZetten;
import static rb.hsv.appendix.ccd.valid.ValidZonderen.isZonderOpzet;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZetten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanzetten tot" -> isAanzettenTot(curFile, vs, keyArg, arg);
            case "afzetten" -> isAfzetten(curFile, vs);
            case "apart zetten" -> isApartZetten(curFile, vs);
            case "bijzetten" -> IS_NOT_FOUND;
            case "ertoe aanzetten" -> isErtoeAanzetten(curFile, vs);
            case "in vlam zetten" -> isInVlamZetten(curFile, vs, keyArg, arg);
            case "inzetten" -> isInzetten(curFile, vs);
            case "inzetten tegen" -> isInzettenTegen(curFile, vs);
            case "neerzetten" -> isNeerzetten(curFile, vs);
            case "openzetten" -> isOpenzetten(curFile, vs);
            case "opzetten" -> isOpzetten(curFile, vs);
            case "opzetten tegen" -> isOpzettenTegen(curFile, vs);
            case "uiteenzetten" -> isUiteenzetten(curFile, vs);
            case "uitzetten" -> isUitzetten(curFile, vs);
            case "vaart zetten" -> isVaartZetten(curFile, vs);
            case "vastzetten" -> isVastzetten(curFile, vs);
            case "wegzetten" -> isWegzetten(curFile, vs);
            case "zinnen zetten op" -> isZinnenZettenOp(curFile, vs, keyArg, arg);
            case "zetten" -> isZetten(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAanzettenTot(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("aanzetten tot", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Ps-139.html#vs20");
        }

        return false;
    } // isAanzettenTot

    public static boolean isAfzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-15.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-15.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs26")
                || isValidVerse(curFile, vs, "Dan-02.html#vs21");
    } // isAfzetten

    public static boolean isApartZetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-21.html#vs28", 29)
                || isValidVerse(curFile, vs, "Judg-07.html#vs5");
    } // isApartZetten

    public static boolean isErtoeAanzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-21.html#vs1")
                || isValidVerse(curFile, vs, "Jude-1.html#vs3");
    } // isErtoeAanzetten

    public static boolean isInVlamZetten(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("in vlam zetten", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Deut-32.html#vs22")
                    || isValidVerse(curFile, vs, "Ps-097.html#vs3")
                    || isValidVerse(curFile, vs, "Isa-42.html#vs25")
                    || isValidVerse(curFile, vs, "Mal-4.html#vs1")
                    || isValidVerse(curFile, vs, "Jas-3.html#vs6");
        }

        return false;
    } // isInVlamZetten

    public static boolean isInzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-31.html#vs5")
                || isValidVerse(curFile, vs, "Exod-35.html#vs33")
                || isValidVerse(curFile, vs, "Num-11.html#vs29")
                || isValidVerse(curFile, vs, "Josh-02.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs11")
                || isValidVerse(curFile, vs, "Prov-24.html#vs5")
                || isValidVerse(curFile, vs, "Nah-2.html#vs1")
                || isValidVerse(curFile, vs, "Zech-01.html#vs14");
    } // isInzetten

    public static boolean isInzettenTegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-51.html#vs27", 28)
                || isValidVerse(curFile, vs, "Ezek-04.html#vs2");
    } // isInzettenTegen

    public static boolean isNeerzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-33.html#vs22")
                || isValidVerse(curFile, vs, "2Sam-15.html#vs24")
                || isValidVerse(curFile, vs, "Isa-52.html#vs2")
                || isValidVerse(curFile, vs, "Isa-57.html#vs8")
                || isValidVerse(curFile, vs, "Jer-31.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs28")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs22")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs1");
    } // isNeerzetten

    public static boolean isOpenzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Cor-06.html#vs13");
    } // isOpenzetten

    public static boolean isOpzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs8")
                || isValidVerse(curFile, vs, "Gen-13.html#vs12", 18)
                || isValidVerse(curFile, vs, "Gen-26.html#vs25")
                || isValidVerse(curFile, vs, "Gen-31.html#vs28")
                || isValidVerse(curFile, vs, "Gen-33.html#vs18")
                || isValidVerse(curFile, vs, "Gen-35.html#vs21")
                || isValidVerse(curFile, vs, "Exod-33.html#vs7")
                || isValidVerse(curFile, vs, "Deut-01.html#vs33")
                || isValidVerse(curFile, vs, "Josh-18.html#vs1")
                || isValidVerse(curFile, vs, "1Chr-15.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs11")
                || isValidVerse(curFile, vs, "Jer-06.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs3");
    } // isOpzetten

    public static boolean isOpzettenTegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-26.html#vs19")
                || isValidVerse(curFile, vs, "Judg-09.html#vs31")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs1")
                || isValidVerse(curFile, vs, "Job-02.html#vs3")
                || isValidVerse(curFile, vs, "Ps-073.html#vs9")
                || isValidVerse(curFile, vs, "Ps-073.html#vs9")
                || isValidVerse(curFile, vs, "Isa-09.html#vs10")
                || isValidVerse(curFile, vs, "Isa-13.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs22")
                || isValidVerse(curFile, vs, "Dan-11.html#vs2")
                || isValidVerse(curFile, vs, "Obad-1.html#vs12")
                || isValidVerse(curFile, vs, "Mic-4.html#vs14")
                || isValidVerse(curFile, vs, "Zech-08.html#vs10")
                || isValidVerse(curFile, vs, "Zech-09.html#vs13");
    } // isOpzettenTegen

    public static boolean isUiteenzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Acts-11.html#vs4")
                || isValidVerse(curFile, vs, "Acts-17.html#vs3");
    } // isUiteenzetten

    public static boolean isUitzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-21.html#vs6");
    } // isUitzetten

    public static boolean isVaartZetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Isa-05.html#vs19");
    } // isVaartZetten

    public static boolean isVastzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-15.html#vs25")
                || isValidVerse(curFile, vs, "Isa-41.html#vs7")
                || isValidVerse(curFile, vs, "Jer-10.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-19.html#vs9")
                || isValidVerse(curFile, vs, "Acts-05.html#vs18")
                || isValidVerse(curFile, vs, "Acts-16.html#vs24");
    } // isVastzetten

    public static boolean isWegzetten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-04.html#vs4");
    } // isWegzetten

    public static boolean isZinnenZettenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("zinnen zetten op", keyArg)) {
            if (isEqual(keyArg, arg)) {
                return false;
            }
            return isValidVerse(curFile, vs, "Deut-05.html#vs21")
                    || isValidVerse(curFile, vs, "2Kgs-12.html#vs17")
                    || isValidVerse(curFile, vs, "2Chr-20.html#vs3")
                    || isValidVerse(curFile, vs, "2Chr-32.html#vs2")
                    || isValidVerse(curFile, vs, "Prov-31.html#vs16")
                    || isValidVerse(curFile, vs, "Jer-42.html#vs15", 17)
                    || isValidVerse(curFile, vs, "Jer-44.html#vs12")
                    || isValidVerse(curFile, vs, "Dan-11.html#vs17", 18);
        }

        return false;
    } // isZinnenZettenOp

    public static boolean isZetten(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isAanzettenTot(curFile, vs, keyArg, arg)
                && !isAfzetten(curFile, vs)
                && !isApartZetten(curFile, vs)
                && !isErtoeAanzetten(curFile, vs)
                && !isInVlamZetten(curFile, vs, keyArg, arg)
                && !isInzetten(curFile, vs)
                && !isInzettenTegen(curFile, vs)
                && !isNeerzetten(curFile, vs)
                && !isOpenzetten(curFile, vs)
                && !isOpzetten(curFile, vs)
                && !isOpzettenTegen(curFile, vs)
                && !isTeKijkZetten(curFile, vs, keyArg, arg)
                && !isUiteenzetten(curFile, vs)
                && !isUitzetten(curFile, vs)
                && !isVaartZetten(curFile, vs)
                && !isVastzetten(curFile, vs)
                && !isWegzetten(curFile, vs)
                && !isZinnenZettenOp(curFile, vs, keyArg, arg)
                && !isZonderOpzet(keyArg);
    }  // isZetten

}
