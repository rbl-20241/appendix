package rb.hsv.appendix.ccd.valid;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.*;

public class ValidKoning {

    public static boolean isValid(final String arg, final String line, final File curFile, final String vs) {
        return (isNotValidNextWord(arg, line, "David") || isValidVerse(curFile, vs, "Jer-30.html#vs009"))
                && isNotValidNextWord(arg, line, "Salomo")
                && isNotValidNextWord(arg, line, "Asa")
                && isNotValidNextWord(arg, line, "Joram")
                && isNotValidNextWord(arg, line, "Josia")
                && isNotValidNextWord(arg, line, "Joas")
                && isNotValidNextWord(arg, line, "Uzzia")
                && isNotValidNextWord(arg, line, "Ahasveros")
                && isNotValidNextWord(arg, line, "Zedekia")
                && isNotValidNextWord(arg, line, "Nebukadnezar")
                && isNotValidNextWord(arg, line, "Belsazar")
                && isNotValidNextWord(arg, line, "Darius")
                && isNotValidNextWord(arg, line, "Agrippa")
                && isNotValidNextWord(arg, line, "Rehabeam")
                && !isValidVerse(curFile, vs, "2Chr-25.html#vs007");
    }

}
