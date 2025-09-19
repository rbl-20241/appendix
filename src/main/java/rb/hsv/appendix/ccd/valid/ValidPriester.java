package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPriester {

    public static boolean isValid(final @NotNull String arg, final File curFile, final String vs) {
        if (arg.equals("Priester")) {
            return isPriester(curFile, vs);
        }

        return true;
    }

    public static boolean isPriester(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-110.html#vs4")
                || isValidVerse(curFile, vs, "Zech-06.html#vs13")
                || isValidVerse(curFile, vs, "Heb-05.html#vs6")
                || isValidVerse(curFile, vs, "Heb-07.html#vs11", 15, 17, 20, 21)
                || isValidVerse(curFile, vs, "Heb-10.html#vs12", 21);
    } // isPriester



}