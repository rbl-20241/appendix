package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidGelegen {

    public static boolean isValid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Cor-16.html#vs12")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs2");
    }
}
