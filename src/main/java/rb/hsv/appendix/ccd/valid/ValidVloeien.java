package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidVloeien {

    public static boolean isValid(final @NotNull String keyArg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "overvloeien" -> isOvervloeien(curFile, vs);
            case "samenvloeien" -> isSamenvloeien();
            case "terugvloeien" -> isTerugvloeien(curFile, vs);
            case "wegvloeien" -> isWegvloeien(curFile, vs);
            case "vloeien" -> isVloeien(curFile, vs);
            default -> true;
        };
    }

    public static boolean isOvervloeien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-13.html#vs27")
                || isValidVerse(curFile, vs, "Ps-023.html#vs5")
                || isValidVerse(curFile, vs, "Ps-059.html#vs8")
                || isValidVerse(curFile, vs, "Ps-119.html#vs171")
                || isValidVerse(curFile, vs, "Prov-15.html#vs2", 28);
    } // isOvervloeien

    public static boolean isSamenvloeien() {
        return false;
    } // isSamenvloeien

    public static boolean isTerugvloeien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-08.html#vs3")
                || isValidVerse(curFile, vs, "Exod-14.html#vs27")
                || isValidVerse(curFile, vs, "Exod-15.html#vs19");
    } // isTerugvloeien

    public static boolean isWegvloeien(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Judg-05.html#vs5")
                || isValidVerse(curFile, vs, "Job-20.html#vs28");
    } // isWegvloeien

    public static boolean isVloeien(final File curFile, final String vs) {
        return !isOvervloeien(curFile, vs)
                && !isSamenvloeien()
                && !isTerugvloeien(curFile, vs)
                && !isWegvloeien(curFile, vs);
    }  // isVloeien

}
