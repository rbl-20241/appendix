package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.ValidGeven.isAntwoordGeven;
import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidAntwoorden {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "antwoord" -> isAntwoord(curFile, vs);
            case "antwoorden" -> isAntwoorden(curFile, vs);
            default -> true;
        };
    }

    public static boolean isAntwoord(final File curFile, final String vs) {
        return isAntwoordGeven(curFile, vs)
                || isValidVerse(curFile, vs, "Exod-15.html#vs21")
                || isValidVerse(curFile, vs, "Judg-19.html#vs28")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs13")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs12")
                || isValidVerse(curFile, vs, "Ezra-04.html#vs17")
                || isValidVerse(curFile, vs, "Neh-05.html#vs8")
                || isValidVerse(curFile, vs, "Esth-01.html#vs17", 18)
                || isValidVerse(curFile, vs, "Job-19.html#vs7")
                || isValidVerse(curFile, vs, "Job-21.html#vs34")
                || isValidVerse(curFile, vs, "Job-32.html#vs3", 5)
                || isValidVerse(curFile, vs, "Job-34.html#vs36")
                || isValidVerse(curFile, vs, "Prov-15.html#vs1", 23)
                || isValidVerse(curFile, vs, "Prov-16.html#vs1")
                || isValidVerse(curFile, vs, "Prov-29.html#vs19")
                || isValidVerse(curFile, vs, "Mic-3.html#vs7")
                || isValidVerse(curFile, vs, "Luke-02.html#vs47")
                || isValidVerse(curFile, vs, "Luke-20.html#vs26")
                || isValidVerse(curFile, vs, "Rom-11.html#vs4");
    } // isAntwoord

    public static boolean isAntwoorden(final File curFile, final String vs) {
        return !isAntwoord(curFile, vs);
    }  // isAntwoorden

}
