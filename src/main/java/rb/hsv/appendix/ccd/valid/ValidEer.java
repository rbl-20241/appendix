package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidEer {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "eer" -> (!isPersoon(curFile, vs) && !isWerkwoord(curFile, vs))
                    || isValidVerse(curFile, vs, "Rom-13.html#vs7");
            case "eren" -> isWerkwoord(curFile, vs);
            case "Eer" -> isPersoon(curFile, vs);
            default -> throw new IllegalStateException("Unexpected value: " + keyArg);
        };
    }

    private static boolean isPersoon(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Jer-02.html#vs011")
                || isValidVerse(curFile, vs, "Ps-106.html#vs020");
    }

    private static boolean isWerkwoord(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Exod-20.html#vs12")
                || isValidVerse(curFile, vs, "Deut-05.html#vs16")
                || isValidVerse(curFile, vs, "1Sam-15.html#vs30")
                || isValidVerse(curFile, vs, "Isa-24.html#vs15")
                || isValidVerse(curFile, vs, "Matt-15.html#vs4")
                || isValidVerse(curFile, vs, "Matt-19.html#vs19")
                || isValidVerse(curFile, vs, "Mark-07.html#vs10")
                || isValidVerse(curFile, vs, "Mark-10.html#vs19")
                || isValidVerse(curFile, vs, "Luke-02.html#vs14")
                || isValidVerse(curFile, vs, "Luke-18.html#vs20")
                || isValidVerse(curFile, vs, "John-08.html#vs49")
                || isValidVerse(curFile, vs, "Rom-13.html#vs7")
                || isValidVerse(curFile, vs, "Eph-6.html#vs2")
                || isValidVerse(curFile, vs, "1Pet-2.html#vs17")
                || isValidVerse(curFile, vs, "Didache-04.html#vs1");
    }

}
