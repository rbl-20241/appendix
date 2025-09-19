package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLuisteren {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "luister" -> isLuister(curFile, vs);
            case "luisteren" -> isLuisteren(curFile, vs);
            default -> true;
        };
    }

    public static boolean isLuister(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Chr-22.html#vs5")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs11")
                || isValidVerse(curFile, vs, "Esth-01.html#vs4")
                || isValidVerse(curFile, vs, "Esth-05.html#vs11")
                || isValidVerse(curFile, vs, "Ps-071.html#vs8")
                || isValidVerse(curFile, vs, "Ps-078.html#vs61")
                || isValidVerse(curFile, vs, "Ps-089.html#vs45")
                || isValidVerse(curFile, vs, "Ps-096.html#vs6")
                || isValidVerse(curFile, vs, "Isa-08.html#vs7")
                || isValidVerse(curFile, vs, "Isa-10.html#vs18")
                || isValidVerse(curFile, vs, "Isa-13.html#vs19")
                || isValidVerse(curFile, vs, "Isa-16.html#vs14")
                || isValidVerse(curFile, vs, "Isa-17.html#vs3", 4)
                || isValidVerse(curFile, vs, "Isa-21.html#vs16")
                || isValidVerse(curFile, vs, "Isa-35.html#vs2")
                || isValidVerse(curFile, vs, "Isa-46.html#vs13")
                || isValidVerse(curFile, vs, "Isa-60.html#vs13")
                || isValidVerse(curFile, vs, "Isa-61.html#vs6")
                || isValidVerse(curFile, vs, "Isa-62.html#vs2")
                || isValidVerse(curFile, vs, "Isa-66.html#vs11", 12)
                || isValidVerse(curFile, vs, "Jer-13.html#vs11")
                || isValidVerse(curFile, vs, "Jer-33.html#vs9")
                || isValidVerse(curFile, vs, "Jer-48.html#vs18")
                || isValidVerse(curFile, vs, "Lam-2.html#vs1")
                || isValidVerse(curFile, vs, "Ezek-24.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs7", 17)
                || isValidVerse(curFile, vs, "Ezek-31.html#vs18")
                || isValidVerse(curFile, vs, "Hos-09.html#vs11")
                || isValidVerse(curFile, vs, "Hos-10.html#vs5")
                || isValidVerse(curFile, vs, "Mic-1.html#vs15")
                || isValidVerse(curFile, vs, "Zech-12.html#vs7");
    } // isLuister

    public static boolean isLuisteren(final File curFile, final String vs) {
        return !isLuister(curFile, vs);
    } // isLuisteren


}
