package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidBezitten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "bezeten" -> isBezeten(curFile, vs);
            case "bezitten" -> isBezitten(curFile, vs, keyArg, arg);
            case "bezit" -> isBezit(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isBezeten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-04.html#vs24")
                || isValidVerse(curFile, vs, "Matt-08.html#vs16", 28)
                || isValidVerse(curFile, vs, "Matt-09.html#vs32")
                || isValidVerse(curFile, vs, "Matt-12.html#vs22")
                || isValidVerse(curFile, vs, "Matt-15.html#vs22")
                || isValidVerse(curFile, vs, "Mark-01.html#vs32")
                || isValidVerse(curFile, vs, "Mark-05.html#vs18")
                || isValidVerse(curFile, vs, "Luke-08.html#vs27")
                || isValidVerse(curFile, vs, "John-07.html#vs20")
                || isValidVerse(curFile, vs, "John-08.html#vs48",49, 52)
                || isValidVerse(curFile, vs, "John-10.html#vs20");
    } // isBezeten

    public static boolean isBezitten(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isEqual("bezitten", keyArg)) {
            if (isEqual("bezat", arg)
                    || isEqual("bezaten", arg)
                    || isEqual("bezitten", arg)) {
                return true;
            }
        }
        return isValidVerse(curFile, vs, "Gen-14.html#vs19", 22)
                || isValidVerse(curFile, vs, "Gen-23.html#vs9")
                || isValidVerse(curFile, vs, "Num-35.html#vs2")
                || isValidVerse(curFile, vs, "Job-42.html#vs10")
                || isValidVerse(curFile, vs, "Ps-082.html#vs8")
                || isValidVerse(curFile, vs, "Prov-01.html#vs17")
                || isValidVerse(curFile, vs, "Prov-30.html#vs3")
                || isValidVerse(curFile, vs, "Eccl-10.html#vs20")
                || isValidVerse(curFile, vs, "Luke-18.html#vs12")
                || isValidVerse(curFile, vs, "John-05.html#vs42")
                || isValidVerse(curFile, vs, "Rom-14.html#vs16")
                || isValidVerse(curFile, vs, "1Cor-08.html#vs10")
                || isValidVerse(curFile, vs, "2Cor-09.html#vs8")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs16")
                || isValidVerse(curFile, vs, "Didache-04.html#vs6");
    } // isBezitten

    public static boolean isBezit(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        return !isBezeten(curFile, vs)
                && !isBezitten(curFile, vs, keyArg, arg);
    }  // isBezit

}
