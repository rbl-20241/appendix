package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLinker {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        var isValid = false;

        if (keyArg.equals("linkervoet")) {
            isValid = isValidVerse(curFile, vs, "Rev-10.html#vs2");
        } else if (keyArg.equals("linkerpilaar")) {
            isValid = isValidVerse(curFile, vs, "2Chr-03.html#vs17");
        }
        return isValid;
    }

}
