package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVliegen {

    public static boolean isValid(final String keyArg, final File curFile, final String vs) {

        return switch (keyArg) {
            case "aanvliegen" -> isAanvliegen(curFile, vs);
            case "vlieg" -> isVlieg(curFile, vs);
            case "wegvliegen" -> isWegvliegen(curFile, vs);
            case "vliegen" -> isVliegen(curFile, vs);
            default -> true;
        };
    }

    private static boolean isAanvliegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ps-091.html#vs5");
    }  // isAanvliegen

    private static boolean isVlieg(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eccl-10.html#vs1")
                || isValidVerse(curFile, vs, "Isa-07.html#vs18");
    }  // isVlieg

    private static boolean isVliegen(final File curFile, final String vs) {
        return (!isAanvliegen(curFile, vs)
                && !isVlieg(curFile, vs)
                && !isWegvliegen(curFile, vs))
                || isValidVerse(curFile, vs, "Prov-23.html#vs5");
    }  // isVliegen

    private static boolean isWegvliegen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Lev-14.html#vs7")
                || isValidVerse(curFile, vs, "Prov-23.html#vs5")
                || isValidVerse(curFile, vs, "Nah-3.html#vs17");
    }  // isWegvliegen

}
