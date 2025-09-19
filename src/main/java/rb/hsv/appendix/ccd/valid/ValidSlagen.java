package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSlagen {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "slag" -> isSlag(curFile, vs, arg);
            case "slagen" -> isSlagen(curFile, vs, arg);
            default -> true;
        };
    }

    public static boolean isSlag(final File curFile, final String vs, final String arg) {
        if (arg.equals("slag")) {
            return true;
        }
        return isValidVerse(curFile, vs, "Gen-12.html#vs17")
                || isValidVerse(curFile, vs, "Deut-25.html#vs2", 3)
                || isValidVerse(curFile, vs, "2Sam-07.html#vs14")
                || isValidVerse(curFile, vs, "Ps-089.html#vs33")
                || isValidVerse(curFile, vs, "Prov-18.html#vs6")
                || isValidVerse(curFile, vs, "Prov-19.html#vs29")
                || isValidVerse(curFile, vs, "Prov-20.html#vs30")
                || isValidVerse(curFile, vs, "Isa-14.html#vs6")
                || isValidVerse(curFile, vs, "Mark-14.html#vs65")
                || isValidVerse(curFile, vs, "Luke-10.html#vs30")
                || isValidVerse(curFile, vs, "Luke-12.html#vs47", 48)
                || isValidVerse(curFile, vs, "John-19.html#vs3")
                || isValidVerse(curFile, vs, "Acts-16.html#vs23")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs23")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs20");
    } // isSlag

    public static boolean isSlagen(final File curFile, final String vs, final @NotNull String arg) {
        return !isSlag(curFile, vs, arg);
    } // isSlagen

}
