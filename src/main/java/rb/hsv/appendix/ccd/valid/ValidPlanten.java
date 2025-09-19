package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidPlanten {

    public static boolean isValid(final @NotNull String keyArg, final @NotNull String arg, final File curFile, final String vs) {
        if (arg.equals("Plant")) {
            return isPlant_persoon(curFile, vs);
        } else {
            return switch (keyArg) {
                case "plant" -> isPlant_gewas(curFile, vs);
                case "voortplanten" -> isVoortplanten();
                case "planten" -> isPlanten(curFile, vs);
                default -> true;
            };
        }
    }

    public static boolean isPlant_persoon(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Ezek-34.html#vs29");
    } // isPlant_persoon

    public static boolean isPlant_gewas(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Job-08.html#vs16")
                || isValidVerse(curFile, vs, "Job-14.html#vs9")
                || isValidVerse(curFile, vs, "Ps-144.html#vs12")
                || isValidVerse(curFile, vs, "Isa-17.html#vs10")
                || isValidVerse(curFile, vs, "Matt-15.html#vs13")
                || isValidVerse(curFile, vs, "Rom-06.html#vs5")
                || isValidVerse(curFile, vs, "Rev-09.html#vs4");
    } // isPlant_gewas

    public static boolean isVoortplanten() {
        return false;
    } // isVoortplanten

    public static boolean isPlanten(final File curFile, final String vs) {
        return !isPlant_persoon(curFile, vs)
                && !isPlant_gewas(curFile, vs)
                && !isVoortplanten();
    }  // isPlanten

}
