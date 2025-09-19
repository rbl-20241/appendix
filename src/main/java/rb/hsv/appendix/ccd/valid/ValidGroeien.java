package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.IS_NOT_FOUND;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGroeien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aangroeien" -> isAangroeien();
            case "groei" -> isGroei(curFile, vs);
            case "opgroeien" -> isOpgroeien(curFile, vs);
            case "groeien" -> isGroeien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAangroeien() {
        return IS_NOT_FOUND;
    } // isAangroeien

    public static boolean isGroei(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eph-4.html#vs16")
                || isValidVerse(curFile, vs, "Col-2.html#vs19");
    } // isGroei

    public static boolean isOpgroeien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-08.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-16.html#vs7")
                || isValidVerse(curFile, vs, "Luke-01.html#vs80")
                || isValidVerse(curFile, vs, "Luke-02.html#vs40")
                || isValidVerse(curFile, vs, "Luke-13.html#vs19");
    } // isOpgroeien

    public static boolean isGroeien(final File curFile, final String vs) {
        return (!isGroei(curFile, vs)
                && !isAangroeien()
                && !isOpgroeien(curFile, vs))
                || isValidVerse(curFile, vs, "Ezek-16.html#vs7");
    } // isGroeien


}
