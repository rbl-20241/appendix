package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidAmen {

    public static boolean isValid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Rev-03.html#vs14");
    }

}
