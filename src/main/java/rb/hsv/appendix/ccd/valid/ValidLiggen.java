package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidLiggen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanliggen" -> isAanliggen(curFile, vs);
            case "gereedliggen" -> isGereedliggen();
            case "neerliggen" -> isNeerliggen(curFile, vs);
            case "openliggen" -> isOpenliggen(curFile, vs);
            case "liggen" -> (!isAanliggen(curFile, vs)
                    && !isGereedliggen()
                    && !isNeerliggen(curFile, vs)
                    && !isOpenliggen(curFile, vs))
                    || isValidVerse(curFile, vs, "1Kgs-06.html#vs36")
                    || isValidVerse(curFile, vs, "1Kgs-07.html#vs12")
                    || isValidVerse(curFile, vs, "Song-4.html#vs4");
            default -> true;
        };
    }

    private static boolean isAanliggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Matt-09.html#vs10")
                || isValidVerse(curFile, vs, "Matt-26.html#vs20")
                || isValidVerse(curFile, vs, "Luke-07.html#vs36")
                || isValidVerse(curFile, vs, "John-13.html#vs23");
    }

    public static boolean isGereedliggen() {
        return false;
    }

    private static boolean isNeerliggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-003.html#vs6")
                || isValidVerse(curFile, vs, "Isa-43.html#vs17")
                || isValidVerse(curFile, vs, "Isa-56.html#vs10");
    }

    private static boolean isOpenliggen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-13.html#vs9")
                || isValidVerse(curFile, vs, "Gen-20.html#vs15")
                || isValidVerse(curFile, vs, "Gen-34.html#vs10")
                || isValidVerse(curFile, vs, "Gen-47.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs7")
                || isValidVerse(curFile, vs, "Ps-038.html#vs10")
                || isValidVerse(curFile, vs, "Ps-119.html#vs168")
                || isValidVerse(curFile, vs, "Prov-15.html#vs11");
    }

}
