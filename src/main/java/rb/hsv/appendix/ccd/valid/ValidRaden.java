package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRaden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanraden" -> isAanraden(curFile, vs);
            case "raad (gezaghebbers)" -> isRaad_Gezag(curFile, vs);
            case "raad (advies)" -> isRaad_Advies(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAanraden(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Kgs-12.html#vs6", 9)
                || isValidVerse(curFile, vs, "2Chr-10.html#vs6", 9)
                || isValidVerse(curFile, vs, "Rev-03.html#vs18");
    } // isAanraden

    public static boolean isRaad_Gezag(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-058.html#vs2")
                || isValidVerse(curFile, vs, "Matt-05.html#vs22")
                || isValidVerse(curFile, vs, "Matt-26.html#vs59")
                || isValidVerse(curFile, vs, "Mark-14.html#vs55")
                || isValidVerse(curFile, vs, "Mark-15.html#vs1")
                || isValidVerse(curFile, vs, "Luke-22.html#vs66")
                || isValidVerse(curFile, vs, "John-11.html#vs47")
                || isValidVerse(curFile, vs, "Acts-04.html#vs15")
                || isValidVerse(curFile, vs, "Acts-05.html#vs21", 27, 34, 41)
                || isValidVerse(curFile, vs, "Acts-06.html#vs12", 15)
                || isValidVerse(curFile, vs, "Acts-22.html#vs5", 20)
                || isValidVerse(curFile, vs, "Acts-23.html#vs1", 6, 15, 20, 28)
                || isValidVerse(curFile, vs, "Acts-24.html#vs20")
                || isValidVerse(curFile, vs, "Acts-25.html#vs12")
                || isValidVerse(curFile, vs, "1Tim-4.html#vs14");
    } // isRaad_Gezag

    public static boolean isRaad_Advies(final File curFile, final String vs) {
        return !isAanraden(curFile, vs)
                && !isRaad_Gezag(curFile, vs);
    } // isRaad_Advies


}
