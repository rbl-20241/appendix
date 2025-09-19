package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidIemand {

    public static boolean isValid(final File curFile, final String vs) {
        return !isValidVerse(curFile, vs, "Lev-22.html#vs10")
                && !isValidVerse(curFile, vs, "Deut-23.html#vs1")
                && !isValidVerse(curFile, vs, "Prov-27.html#vs7")
                && !isValidVerse(curFile, vs, "Eccl-06.html#vs2")
                && !isValidVerse(curFile, vs, "Matt-12.html#vs47")
                && !isValidVerse(curFile, vs, "Matt-21.html#vs28")
                && !isValidVerse(curFile, vs, "Mark-12.html#vs1")
                && !isValidVerse(curFile, vs, "Luke-08.html#vs46")
                && !isValidVerse(curFile, vs, "Luke-13.html#vs6")
                && !isValidVerse(curFile, vs, "Luke-20.html#vs9")
                && !isValidVerse(curFile, vs, "John-04.html#vs33");
    }

}
