package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidSchreeuwen {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "schreeuw" -> isSchreeuw(curFile, vs);
            case "uitschreeuwen" -> isUitschreeuwen(curFile, vs);
            case "schreeuwen" -> isSchreeuwen(curFile, vs);
            default -> true;
        };
    }

    public static boolean isSchreeuw(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs34");
    } // isSchreeuw

    public static boolean isUitschreeuwen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-07.html#vs21")
                || isValidVerse(curFile, vs, "1Sam-04.html#vs13")
                || isValidVerse(curFile, vs, "2Kgs-06.html#vs5")
                || isValidVerse(curFile, vs, "Job-24.html#vs12")
                || isValidVerse(curFile, vs, "Job-35.html#vs9")
                || isValidVerse(curFile, vs, "Ps-038.html#vs9")
                || isValidVerse(curFile, vs, "Isa-14.html#vs31")
                || isValidVerse(curFile, vs, "Isa-15.html#vs4", 5)
                || isValidVerse(curFile, vs, "Isa-33.html#vs7")
                || isValidVerse(curFile, vs, "Jer-20.html#vs8")
                || isValidVerse(curFile, vs, "Jer-25.html#vs34")
                || isValidVerse(curFile, vs, "Jer-30.html#vs15")
                || isValidVerse(curFile, vs, "Jer-48.html#vs20")
                || isValidVerse(curFile, vs, "Jer-49.html#vs3")
                || isValidVerse(curFile, vs, "Lam-2.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs12")
                || isValidVerse(curFile, vs, "Mic-4.html#vs10")
                || isValidVerse(curFile, vs, "Rev-12.html#vs2");
    } // isUitschreeuwen

    public static boolean isSchreeuwen(final File curFile, final String vs) {
        return !isSchreeuw(curFile, vs)
                && !isUitschreeuwen(curFile, vs);
    } // isSchreeuwen


}
