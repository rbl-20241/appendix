package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidZelf {

    public static boolean isValid(final File curFile, final String vs) {
        return !isValidVerse(curFile, vs, "Ezek-12.html#vs004")
                && !isValidVerse(curFile, vs, "Judg-03.html#vs019")
                && !isValidVerse(curFile, vs, "Ps-009.html#vs009")
                && !isValidVerse(curFile, vs, "Prov-23.html#vs014")
                && !isValidVerse(curFile, vs, "Isa-38.html#vs010")
                && !isValidVerse(curFile, vs, "Jer-39.html#vs004")
                && !isValidVerse(curFile, vs, "Mic-6.html#vs014")
                && !isValidVerse(curFile, vs, "Mic-6.html#vs015")
                && !isValidVerse(curFile, vs, "Mic-7.html#vs007")
                && !isValidVerse(curFile, vs, "Hab-1.html#vs010")
                && !isValidVerse(curFile, vs, "Luke-11.html#vs052");
    }
}
