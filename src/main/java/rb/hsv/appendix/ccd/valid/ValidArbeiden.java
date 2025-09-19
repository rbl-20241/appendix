package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidArbeiden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "arbeid" -> isArbeid(curFile, vs);
            case "arbeiden" -> isArbeiden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isArbeid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Deut-15.html#vs19")
                || isValidVerse(curFile, vs, "Deut-28.html#vs33")
                || isValidVerse(curFile, vs, "Neh-05.html#vs13")
                || isValidVerse(curFile, vs, "Job-39.html#vs14")
                || isValidVerse(curFile, vs, "Ps-109.html#vs11")
                || isValidVerse(curFile, vs, "Isa-55.html#vs2")
                || isValidVerse(curFile, vs, "Jer-03.html#vs24")
                || isValidVerse(curFile, vs, "Jer-20.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs23")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs6");
    } // isArbeid

    public static boolean isArbeiden(final File curFile, final String vs) {
        return !isArbeid(curFile, vs);
    }  // isArbeiden

}
