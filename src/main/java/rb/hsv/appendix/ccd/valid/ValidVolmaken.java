package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.Util.isEqual;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVolmaken {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "volmaakt" -> isVolmaakt(curFile, vs, arg);
            case "volmaken (tot volmaaktheid brengen)" -> isVolmaken_TotVolmaaktheidBrengen(curFile, vs);
            case "volmaken (vullen, voltooien)" -> isVolmaken_Vullen_Voltooien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isVolmaakt(final File curFile, final String vs, final @NotNull String arg) {
        if (isEqual("volmaakte", arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "Deut-32.html#vs4")
                || isValidVerse(curFile, vs, "2Sam-22.html#vs31")
                || isValidVerse(curFile, vs, "Job-37.html#vs16")
                || isValidVerse(curFile, vs, "Ps-018.html#vs31")
                || isValidVerse(curFile, vs, "Ps-019.html#vs8")
                || isValidVerse(curFile, vs, "Ps-119.html#vs96")
                || isValidVerse(curFile, vs, "Lam-2.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-27.html#vs3")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs12", 15)
                || isValidVerse(curFile, vs, "Matt-05.html#vs48")
                || isValidVerse(curFile, vs, "Matt-19.html#vs21")
                || isValidVerse(curFile, vs, "John-17.html#vs23")
                || isValidVerse(curFile, vs, "Phil-3.html#vs12")
                || isValidVerse(curFile, vs, "Col-1.html#vs28")
                || isValidVerse(curFile, vs, "Col-2.html#vs10")
                || isValidVerse(curFile, vs, "Col-4.html#vs12")
                || isValidVerse(curFile, vs, "2Tim-3.html#vs17")
                || isValidVerse(curFile, vs, "Heb-05.html#vs9")
                || isValidVerse(curFile, vs, "Heb-07.html#vs28")
                || isValidVerse(curFile, vs, "Jas-1.html#vs4", 17)
                || isValidVerse(curFile, vs, "Jas-2.html#vs22")
                || isValidVerse(curFile, vs, "Jas-3.html#vs2")
                || isValidVerse(curFile, vs, "1John-2.html#vs5")
                || isValidVerse(curFile, vs, "1John-4.html#vs12", 17, 18)
                || isValidVerse(curFile, vs, "Didache-01.html#vs4")
                || isValidVerse(curFile, vs, "Didache-06.html#vs2")
                || isValidVerse(curFile, vs, "Didache-16.html#vs2");
    } // isVolmaakt

    public static boolean isVolmaken_TotVolmaaktheidBrengen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Thess-3.html#vs10")
                || isValidVerse(curFile, vs, "Heb-10.html#vs14")
                || isValidVerse(curFile, vs, "Didache-10.html#vs5");
    } // isVolmaken_TotVolmaaktheidBrengen

    public static boolean isVolmaken_Vullen_Voltooien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-29.html#vs27", 28)
                || isValidVerse(curFile, vs, "Exod-23.html#vs26")
                || isValidVerse(curFile, vs, "Job-39.html#vs5")
                || isValidVerse(curFile, vs, "Isa-65.html#vs20")
                || isValidVerse(curFile, vs, "Dan-08.html#vs23")
                || isValidVerse(curFile, vs, "Matt-23.html#vs32")
                || isValidVerse(curFile, vs, "1Thess-2.html#vs16");
    } // isVolmaken_Vullen_Voltooien
}
