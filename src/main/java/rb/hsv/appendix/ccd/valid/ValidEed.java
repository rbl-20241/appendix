package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidEed {

    public static boolean isValid(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-21.html#vs023")
                || isValidVerse(curFile, vs, "Hab-3.html#vs009")
                || isValidVerse(curFile, vs, "Hos-10.html#vs004")
                || isValidVerse(curFile, vs, "Jer-07.html#vs009")
                || isValidVerse(curFile, vs, "Mal-3.html#vs005")
                || isValidVerse(curFile, vs, "Mark-06.html#vs026")
                || isValidVerse(curFile, vs, "Matt-05.html#vs033")
                || isValidVerse(curFile, vs, "Matt-14.html#vs009");

    }

}
