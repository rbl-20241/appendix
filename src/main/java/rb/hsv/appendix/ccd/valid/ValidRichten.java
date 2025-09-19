package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidRichten {

    public static boolean isValid(final @NotNull String keyArg, final String arg, final File curFile, final String vs) {
        return switch (keyArg) {
            case "aanrichten" -> isAanrichten(curFile, vs);
            case "blik richten op" -> isBlikRichtenOp(curFile, vs, keyArg, arg);
            case "gericht" -> isGericht(curFile, vs);
            case "gericht oefenen" -> isGerichtOefenen(curFile, vs);
            case "hart richten op" -> isHartRichtenOp(curFile, vs, keyArg, arg);
            case "onderricht" -> isOnderricht(curFile, vs);
            case "onderrichten" -> isOnderrichten(curFile, vs);
            case "oog richten op" -> isOogRichtenOp(curFile, vs, keyArg, arg);
            case "oor richten op" -> isOorRichtenOp(curFile, vs, keyArg, arg);
            case "oprichten" -> isOprichten(curFile, vs);
            case "richten op" -> isRichtenOp(curFile, vs, keyArg, arg);
            case "te gronde richten" -> isTeGrondeRichten(curFile, vs, arg);
            case "richten" -> isRichten(curFile, vs, keyArg, arg);
            default -> true;
        };
    }

    public static boolean isAanrichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-19.html#vs3")
                || isValidVerse(curFile, vs, "Gen-21.html#vs8")
                || isValidVerse(curFile, vs, "Gen-26.html#vs30")
                || isValidVerse(curFile, vs, "Gen-29.html#vs22")
                || isValidVerse(curFile, vs, "Judg-14.html#vs10")
                || isValidVerse(curFile, vs, "Judg-20.html#vs21",  25)
                || isValidVerse(curFile, vs, "2Sam-03.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs16")
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs15")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs15")
                || isValidVerse(curFile, vs, "Esth-01.html#vs3", 5, 9)
                || isValidVerse(curFile, vs, "Esth-02.html#vs18")
                || isValidVerse(curFile, vs, "Job-01.html#vs4")
                || isValidVerse(curFile, vs, "Prov-10.html#vs10")
                || isValidVerse(curFile, vs, "Eccl-10.html#vs19")
                || isValidVerse(curFile, vs, "Isa-34.html#vs6")
                || isValidVerse(curFile, vs, "Jer-25.html#vs29")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs10")
                || isValidVerse(curFile, vs, "Dan-05.html#vs1")
                || isValidVerse(curFile, vs, "Acts-16.html#vs34")
                || isValidVerse(curFile, vs, "Didache-11.html#vs9");
    } // isAanrichten

    public static boolean isBlikRichtenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Isa-17.html#vs7", 8)
                || isValidVerse(curFile, vs, "Ezek-04.html#vs3", 7)
                || isValidVerse(curFile, vs, "Ezek-06.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-13.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-25.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs21")
                || isValidVerse(curFile, vs, "Ezek-29.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-35.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs2");
    } // isBlikRichtenOp

    public static boolean isGericht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-03.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs9", 12)
                || isValidVerse(curFile, vs, "Job-14.html#vs3")
                || isValidVerse(curFile, vs, "Job-22.html#vs4")
                || isValidVerse(curFile, vs, "Job-34.html#vs23")
                || isValidVerse(curFile, vs, "Ps-001.html#vs5")
                || isValidVerse(curFile, vs, "Ps-009.html#vs8")
                || isValidVerse(curFile, vs, "Ps-033.html#vs5")
                || isValidVerse(curFile, vs, "Ps-119.html#vs84")
                || isValidVerse(curFile, vs, "Ps-143.html#vs2")
                || isValidVerse(curFile, vs, "Prov-18.html#vs5")
                || isValidVerse(curFile, vs, "Eccl-11.html#vs9")
                || isValidVerse(curFile, vs, "Eccl-12.html#vs14")
                || isValidVerse(curFile, vs, "Isa-03.html#vs14")
                || isValidVerse(curFile, vs, "Isa-53.html#vs8")
                || isValidVerse(curFile, vs, "Isa-54.html#vs17")
                || isValidVerse(curFile, vs, "Isa-66.html#vs19")
                || isValidVerse(curFile, vs, "Hos-05.html#vs1");
    } // isGericht

    public static boolean isGerichtOefenen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-03.html#vs13")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs12")
                || isValidVerse(curFile, vs, "Ps-106.html#vs30")
                || isValidVerse(curFile, vs, "Ps-119.html#vs84");
    } // isGerichtOefenen

    public static boolean isHartRichtenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Josh-24.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-07.html#vs3")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs33")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs19")
                || isValidVerse(curFile, vs, "Ezra-07.html#vs10")
                || isValidVerse(curFile, vs, "Job-07.html#vs17")
                || isValidVerse(curFile, vs, "Ps-048.html#vs14")
                || isValidVerse(curFile, vs, "Ps-078.html#vs8")
                || isValidVerse(curFile, vs, "Prov-22.html#vs17")
                || isValidVerse(curFile, vs, "Prov-23.html#vs19")
                || isValidVerse(curFile, vs, "Prov-27.html#vs23")
                || isValidVerse(curFile, vs, "Jer-31.html#vs21")
                || isValidVerse(curFile, vs, "2Thess-3.html#vs5");
    } // isHartRichtenOp

    public static boolean isOnderricht(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Chr-17.html#vs7", 9)
                || isValidVerse(curFile, vs, "Job-22.html#vs22")
                || isValidVerse(curFile, vs, "Ps-078.html#vs1")
                || isValidVerse(curFile, vs, "Prov-01.html#vs8")
                || isValidVerse(curFile, vs, "Prov-03.html#vs1")
                || isValidVerse(curFile, vs, "Prov-04.html#vs2")
                || isValidVerse(curFile, vs, "Prov-06.html#vs20", 23)
                || isValidVerse(curFile, vs, "Prov-07.html#vs2")
                || isValidVerse(curFile, vs, "Prov-09.html#vs9")
                || isValidVerse(curFile, vs, "Prov-13.html#vs14")
                || isValidVerse(curFile, vs, "Prov-31.html#vs26")
                || isValidVerse(curFile, vs, "Isa-42.html#vs4")
                || isValidVerse(curFile, vs, "Matt-07.html#vs28")
                || isValidVerse(curFile, vs, "Matt-16.html#vs12")
                || isValidVerse(curFile, vs, "Matt-22.html#vs33")
                || isValidVerse(curFile, vs, "Mark-01.html#vs22")
                || isValidVerse(curFile, vs, "Mark-04.html#vs2")
                || isValidVerse(curFile, vs, "Mark-11.html#vs18")
                || isValidVerse(curFile, vs, "Mark-12.html#vs38")
                || isValidVerse(curFile, vs, "Luke-04.html#vs32")
                || isValidVerse(curFile, vs, "John-07.html#vs16", 17)
                || isValidVerse(curFile, vs, "John-18.html#vs19")
                || isValidVerse(curFile, vs, "Rom-16.html#vs17")
                || isValidVerse(curFile, vs, "1Cor-14.html#vs6")
                || isValidVerse(curFile, vs, "2Tim-4.html#vs2")
                || isValidVerse(curFile, vs, "Didache-06.html#vs1");
    } // isOnderricht

    public static boolean isOnderrichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Prov-21.html#vs11")
                || isValidVerse(curFile, vs, "Song-8.html#vs2")
                || isValidVerse(curFile, vs, "1Cor-02.html#vs16");
    } // isOnderrichten

    public static boolean isOogRichtenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Deut-33.html#vs28")
                || isValidVerse(curFile, vs, "Ruth-2.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs20")
                || isValidVerse(curFile, vs, "2Chr-20.html#vs12")
                || isValidVerse(curFile, vs, "Job-24.html#vs23")
                || isValidVerse(curFile, vs, "Ps-025.html#vs15")
                || isValidVerse(curFile, vs, "Ps-101.html#vs6")
                || isValidVerse(curFile, vs, "Ps-123.html#vs2")
                || isValidVerse(curFile, vs, "Ps-141.html#vs8")
                || isValidVerse(curFile, vs, "Prov-17.html#vs24")
                || isValidVerse(curFile, vs, "Jer-24.html#vs6")
                || isValidVerse(curFile, vs, "Jer-39.html#vs12")
                || isValidVerse(curFile, vs, "Jer-40.html#vs4")
                || isValidVerse(curFile, vs, "Amos-9.html#vs4", 8)
                || isValidVerse(curFile, vs, "Luke-22.html#vs56")
                || isValidVerse(curFile, vs, "Acts-03.html#vs5")
                || isValidVerse(curFile, vs, "Acts-06.html#vs15")
                || isValidVerse(curFile, vs, "Acts-10.html#vs4")
                || isValidVerse(curFile, vs, "2Cor-03.html#vs7", 13)
                || isValidVerse(curFile, vs, "2Cor-04.html#vs18")
                || isValidVerse(curFile, vs, "Phil-3.html#vs17")
                || isValidVerse(curFile, vs, "Heb-12.html#vs2");
    } // isOogRichtenOp

    public static boolean isOorRichtenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Neh-08.html#vs4")
                || isValidVerse(curFile, vs, "Ps-034.html#vs16")
                || isValidVerse(curFile, vs, "1Pet-3.html#vs12");
    } // isOorRichtenOp

    public static boolean isOprichten(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-27.html#vs19", 31)
                || isValidVerse(curFile, vs, "Gen-33.html#vs20")
                || isValidVerse(curFile, vs, "Gen-35.html#vs14", 20)
                || isValidVerse(curFile, vs, "Exod-24.html#vs4")
                || isValidVerse(curFile, vs, "Exod-40.html#vs18", 33)
                || isValidVerse(curFile, vs, "Num-23.html#vs24")
                || isValidVerse(curFile, vs, "Josh-04.html#vs9", 20)
                || isValidVerse(curFile, vs, "Josh-07.html#vs26")
                || isValidVerse(curFile, vs, "Josh-08.html#vs29")
                || isValidVerse(curFile, vs, "Josh-24.html#vs26")
                || isValidVerse(curFile, vs, "Judg-18.html#vs30", 31)
                || isValidVerse(curFile, vs, "2Sam-18.html#vs17", 18)
                || isValidVerse(curFile, vs, "2Sam-24.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-07.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-16.html#vs32", 34)
                || isValidVerse(curFile, vs, "2Kgs-21.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-03.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs3")
                || isValidVerse(curFile, vs, "Job-39.html#vs21")
                || isValidVerse(curFile, vs, "Ps-145.html#vs14")
                || isValidVerse(curFile, vs, "Ps-146.html#vs8")
                || isValidVerse(curFile, vs, "Isa-23.html#vs13")
                || isValidVerse(curFile, vs, "Isa-49.html#vs6", 8)
                || isValidVerse(curFile, vs, "Jer-31.html#vs21")
                || isValidVerse(curFile, vs, "Dan-03.html#vs1")
                || isValidVerse(curFile, vs, "Dan-07.html#vs5")
                || isValidVerse(curFile, vs, "Mark-01.html#vs31")
                || isValidVerse(curFile, vs, "Mark-09.html#vs27")
                || isValidVerse(curFile, vs, "John-08.html#vs7", 10)
                || isValidVerse(curFile, vs, "Acts-03.html#vs7")
                || isValidVerse(curFile, vs, "Acts-10.html#vs26")
                || isValidVerse(curFile, vs, "Acts-26.html#vs16");
    } // isOprichten

    public static boolean isRichtenOp(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (isOogRichtenOp(curFile, vs, keyArg, arg)
            || isBlikRichtenOp(curFile, vs, keyArg, arg)
            || isHartRichtenOp(curFile, vs, keyArg, arg)
            || isOorRichtenOp(curFile, vs, keyArg, arg)) {
            return true;
        }
        return isValidVerse(curFile, vs, "1Kgs-02.html#vs3")
                || isValidVerse(curFile, vs, "Ps-007.html#vs14")
                || isValidVerse(curFile, vs, "Ps-021.html#vs13")
                || isValidVerse(curFile, vs, "Ps-119.html#vs28")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs11", 12)
                || isValidVerse(curFile, vs, "Isa-10.html#vs25")
                || isValidVerse(curFile, vs, "Jer-50.html#vs5")
                || isValidVerse(curFile, vs, "Ezek-21.html#vs2")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs7")
                || isValidVerse(curFile, vs, "Hos-05.html#vs4")
                || isValidVerse(curFile, vs, "Luke-01.html#vs79")
                || isValidVerse(curFile, vs, "Rom-10.html#vs1")
                || isValidVerse(curFile, vs, "1Pet-1.html#vs21");
    } // isRichtenOp

    public static boolean isTeGrondeRichten(final File curFile, final String vs, final @NotNull String arg) {
        if (arg.equals("te gronde richten")) {
            return false;
        }

        return isValidVerse(curFile, vs, "Gen-06.html#vs13", 17)
                || isValidVerse(curFile, vs, "Gen-09.html#vs11", 15)
                || isValidVerse(curFile, vs, "Gen-13.html#vs10")
                || isValidVerse(curFile, vs, "Gen-18.html#vs28", 31)
                || isValidVerse(curFile, vs, "Gen-18.html#vs32")
                || isValidVerse(curFile, vs, "Gen-19.html#vs13", 14, 29)
                || isValidVerse(curFile, vs, "Exod-08.html#vs24")
                || isValidVerse(curFile, vs, "Num-32.html#vs15")
                || isValidVerse(curFile, vs, "Deut-04.html#vs31")
                || isValidVerse(curFile, vs, "Deut-09.html#vs26")
                || isValidVerse(curFile, vs, "Deut-10.html#vs10")
                || isValidVerse(curFile, vs, "Deut-20.html#vs19", 20)
                || isValidVerse(curFile, vs, "Josh-22.html#vs33")
                || isValidVerse(curFile, vs, "Ruth-4.html#vs6")
                || isValidVerse(curFile, vs, "1Sam-06.html#vs5")
                || isValidVerse(curFile, vs, "1Sam-23.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-11.html#vs1")
                || isValidVerse(curFile, vs, "2Sam-20.html#vs20")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs19")
                || isValidVerse(curFile, vs, "2Kgs-13.html#vs23")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs25")
                || isValidVerse(curFile, vs, "2Kgs-19.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-20.html#vs1")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs7", 12)
                || isValidVerse(curFile, vs, "2Chr-15.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-21.html#vs7")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-25.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-35.html#vs21")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs19")
                || isValidVerse(curFile, vs, "Job-17.html#vs1")
                || isValidVerse(curFile, vs, "Ps-057.html#vs1")
                || isValidVerse(curFile, vs, "Ps-058.html#vs1")
                || isValidVerse(curFile, vs, "Ps-059.html#vs1")
                || isValidVerse(curFile, vs, "Ps-075.html#vs1")
                || isValidVerse(curFile, vs, "Ps-078.html#vs38", 45)
                || isValidVerse(curFile, vs, "Ps-106.html#vs23")
                || isValidVerse(curFile, vs, "Prov-06.html#vs32")
                || isValidVerse(curFile, vs, "Prov-11.html#vs9")
                || isValidVerse(curFile, vs, "Prov-13.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-05.html#vs5")
                || isValidVerse(curFile, vs, "Song-2.html#vs15")
                || isValidVerse(curFile, vs, "Isa-10.html#vs27")
                || isValidVerse(curFile, vs, "Isa-13.html#vs5")
                || isValidVerse(curFile, vs, "Isa-14.html#vs20")
                || isValidVerse(curFile, vs, "Isa-32.html#vs7")
                || isValidVerse(curFile, vs, "Isa-36.html#vs10")
                || isValidVerse(curFile, vs, "Isa-37.html#vs12")
                || isValidVerse(curFile, vs, "Isa-51.html#vs13")
                || isValidVerse(curFile, vs, "Isa-54.html#vs16")
                || isValidVerse(curFile, vs, "Isa-65.html#vs8")
                || isValidVerse(curFile, vs, "Jer-05.html#vs10")
                || isValidVerse(curFile, vs, "Jer-06.html#vs5")
                || isValidVerse(curFile, vs, "Jer-11.html#vs19")
                || isValidVerse(curFile, vs, "Jer-12.html#vs10")
                || isValidVerse(curFile, vs, "Jer-13.html#vs14")
                || isValidVerse(curFile, vs, "Jer-15.html#vs3", 6)
                || isValidVerse(curFile, vs, "Jer-36.html#vs29")
                || isValidVerse(curFile, vs, "Jer-46.html#vs5")
                || isValidVerse(curFile, vs, "Jer-51.html#vs1", 11, 20, 25)
                || isValidVerse(curFile, vs, "Lam-2.html#vs5", 6, 8)
                || isValidVerse(curFile, vs, "Ezek-05.html#vs16")
                || isValidVerse(curFile, vs, "Ezek-09.html#vs6", 8)
                || isValidVerse(curFile, vs, "Ezek-16.html#vs47")
                || isValidVerse(curFile, vs, "Ezek-20.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-22.html#vs30")
                || isValidVerse(curFile, vs, "Ezek-26.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-28.html#vs17")
                || isValidVerse(curFile, vs, "Ezek-30.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs3")
                || isValidVerse(curFile, vs, "Dan-02.html#vs44")
                || isValidVerse(curFile, vs, "Dan-06.html#vs27")
                || isValidVerse(curFile, vs, "Dan-07.html#vs14", 25)
                || isValidVerse(curFile, vs, "Dan-08.html#vs24", 25)
                || isValidVerse(curFile, vs, "Dan-09.html#vs26")
                || isValidVerse(curFile, vs, "Dan-11.html#vs17")
                || isValidVerse(curFile, vs, "Hos-11.html#vs9")
                || isValidVerse(curFile, vs, "Nah-2.html#vs2")
                || isValidVerse(curFile, vs, "Zech-11.html#vs6")
                || isValidVerse(curFile, vs, "Mal-3.html#vs11")
                || isValidVerse(curFile, vs, "Matt-05.html#vs29", 30)
                || isValidVerse(curFile, vs, "Matt-10.html#vs28")
                || isValidVerse(curFile, vs, "Mark-01.html#vs24")
                || isValidVerse(curFile, vs, "Luke-04.html#vs34")
                || isValidVerse(curFile, vs, "Luke-09.html#vs56")
                || isValidVerse(curFile, vs, "Rom-14.html#vs15")
                || isValidVerse(curFile, vs, "1Cor-03.html#vs17")
                || isValidVerse(curFile, vs, "2Cor-04.html#vs9")
                || isValidVerse(curFile, vs, "2Cor-07.html#vs2")
                || isValidVerse(curFile, vs, "Eph-4.html#vs22")
                || isValidVerse(curFile, vs, "Jas-4.html#vs12")
                || isValidVerse(curFile, vs, "2Pet-2.html#vs12")
                || isValidVerse(curFile, vs, "Jude-1.html#vs5", 10)
                || isValidVerse(curFile, vs, "Rev-19.html#vs2");
    } // isTeGrondeRichten

    public static boolean isRichten(final File curFile, final String vs, final @NotNull String keyArg,  final @NotNull String arg) {
        return (!isAanrichten(curFile, vs)
                && !isBlikRichtenOp(curFile, vs, keyArg, arg)
                && !isGericht(curFile, vs)
                && !isGerichtOefenen(curFile, vs)
                && !isHartRichtenOp(curFile, vs, keyArg, arg)
                && !isOnderricht(curFile, vs)
                && !isOnderrichten(curFile, vs)
                && !isOogRichtenOp(curFile, vs, keyArg, arg)
                && !isOorRichtenOp(curFile, vs, keyArg, arg)
                && !isOprichten(curFile, vs)
                && !isRichtenOp(curFile, vs, keyArg, arg)
                && !isTeGrondeRichten(curFile, vs, arg))
                || isValidVerse(curFile, vs, "2Chr-20.html#vs12")
                || isValidVerse(curFile, vs, "Jer-31.html#vs21");
    } // isRichten


}
