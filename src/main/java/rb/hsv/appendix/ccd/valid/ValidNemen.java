package rb.hsv.appendix.ccd.valid;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.isValidVerse;

public class ValidNemen {

    public static boolean isValid(final String keyArg, final String arg, final File curFile, final String vs) {
        var isValid = true;

        if (keyArg.equals("aannemen")) {
            isValid = isAannemen(curFile, vs);
        } else if (keyArg.equals("afnemen")) {
            isValid = isAfnemen(curFile, vs);
        } else if (keyArg.equals("deelnemen")) {
            isValid = isDeelnemen(curFile, vs);
        } else if (keyArg.equals("eed afnemen")) {
            isValid = isEedAfnemen(curFile, vs);
        } else if (keyArg.equals("gevangennemen")) {
            isValid = isGevangennemen(curFile, vs);
        } else if (keyArg.equals("in acht nemen")) {
            isValid = isInAchtNemen(curFile, vs);
        } else if (keyArg.equals("innemen")) {
            isValid = isInnemen(curFile, vs);
        } else if (keyArg.equals("meenemen")) {
            isValid = isMeenemen(curFile, vs);
        } else if (keyArg.equals("opnemen")) {
            isValid = isOpnemen(curFile, vs);
        } else if (keyArg.equals("overnemen")) {
            isValid = isOvernemen(curFile, vs);
        } else if (keyArg.equals("plaatsnemen")) {
            isValid = isPlaatsnemen(curFile, vs);
        } else if (keyArg.equals("ten huwelijk nemen")) {
            isValid = isTenHuwelijkNemen(curFile, vs, keyArg, arg);
        } else if (keyArg.equals("terugnemen")) {
            isValid = isTerugnemen(curFile, vs);
        } else if (keyArg.equals("toenemen")) {
            isValid = isToenemen(curFile, vs);
        } else if (keyArg.equals("voornemen")) {
            isValid = isVoornemen(curFile, vs);
        } else if (keyArg.equals("waarnemen")) {
            isValid = isWaarnemen(curFile, vs);
        } else if (keyArg.equals("wegnemen")) {
            isValid = isWegnemen(curFile, vs);
        } else if (keyArg.equals("naam") && (arg.equals("namen"))) {
            isValid = isNaam(curFile, vs);
        } else if (keyArg.equals("liggen")) {
            isValid = (!isAannemen(curFile, vs)
                    && !isAfnemen(curFile, vs)
                    && !isDeelnemen(curFile, vs)
                    && !isEedAfnemen(curFile, vs)
                    && !isGevangennemen(curFile, vs)
                    && !isInAchtNemen(curFile, vs)
                    && !isInnemen(curFile, vs)
                    && !isMeenemen(curFile, vs)
                    && !isOpnemen(curFile, vs)
                    && !isOvernemen(curFile, vs)
                    && !isTenHuwelijkNemen(curFile, vs, keyArg, arg)
                    && !isTerugnemen(curFile, vs)
                    && !isToenemen(curFile, vs)
                    && !isVoornemen(curFile, vs)
                    && !isWaarnemen(curFile, vs)
                    && !isWegnemen(curFile, vs)
                    && !isNaam(curFile, vs))
                    || isValidVerse(curFile, vs, "Exod-28.html#vs9")
                    || isValidVerse(curFile, vs, "Num-01.html#vs17")
                    || isValidVerse(curFile, vs, "Num-26.html#vs55")
                    || isValidVerse(curFile, vs, "Deut-08.html#vs1")
                    || isValidVerse(curFile, vs, "Deut-11.html#vs8")
                    || isValidVerse(curFile, vs, "Deut-30.html#vs16")
                    || isValidVerse(curFile, vs, "Josh-19.html#vs47")
                    || isValidVerse(curFile, vs, "Judg-20.html#vs10")
                    || isValidVerse(curFile, vs, "1Kgs-11.html#vs34")
                    || isValidVerse(curFile, vs, "2Kgs-11.html#vs2", 19)
                    || isValidVerse(curFile, vs, "1Chr-28.html#vs8")
                    || isValidVerse(curFile, vs, "2Chr-22.html#vs11")
                    || isValidVerse(curFile, vs, "Neh-10.html#vs29")
                    || isValidVerse(curFile, vs, "Ps-016.html#vs4")
                    || isValidVerse(curFile, vs, "Prov-24.html#vs32")
                    || isValidVerse(curFile, vs, "Isa-47.html#vs2")
                    || isValidVerse(curFile, vs, "Jer-38.html#vs11")
                    || isValidVerse(curFile, vs, "Ezek-17.html#vs5", 13)
                    || isValidVerse(curFile, vs, "John-10.html#vs18");
        }

        return isValid;
    }

    public static boolean isAannemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-23.html#vs13")
                || isValidVerse(curFile, vs, "Gen-33.html#vs10")
                || isValidVerse(curFile, vs, "Exod-32.html#vs4")
                || isValidVerse(curFile, vs, "Exod-34.html#vs4")
                || isValidVerse(curFile, vs, "Exod-36.html#vs3")
                || isValidVerse(curFile, vs, "Num-07.html#vs5")
                || isValidVerse(curFile, vs, "Num-31.html#vs51", 54)
                || isValidVerse(curFile, vs, "1Sam-02.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-08.html#vs3")
                || isValidVerse(curFile, vs, "1Sam-25.html#vs35")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs15", 16, 23, 26)
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs7", 8)
                || isValidVerse(curFile, vs, "1Chr-12.html#vs18")
                || isValidVerse(curFile, vs, "2Chr-29.html#vs16")
                || isValidVerse(curFile, vs, "Esth-04.html#vs4")
                || isValidVerse(curFile, vs, "Job-42.html#vs9")
                || isValidVerse(curFile, vs, "Prov-01.html#vs3")
                || isValidVerse(curFile, vs, "Prov-08.html#vs10")
                || isValidVerse(curFile, vs, "Prov-10.html#vs8")
                || isValidVerse(curFile, vs, "Prov-19.html#vs20")
                || isValidVerse(curFile, vs, "Prov-24.html#vs32")
                || isValidVerse(curFile, vs, "Isa-33.html#vs15")
                || isValidVerse(curFile, vs, "Ezek-10.html#vs7")
                || isValidVerse(curFile, vs, "Hos-14.html#vs3")
                || isValidVerse(curFile, vs, "Amos-5.html#vs12")
                || isValidVerse(curFile, vs, "Mark-04.html#vs20")
                || isValidVerse(curFile, vs, "Luke-24.html#vs43")
                || isValidVerse(curFile, vs, "John-03.html#vs11",  32)
                || isValidVerse(curFile, vs, "John-05.html#vs41",  43)
                || isValidVerse(curFile, vs, "Acts-15.html#vs14")
                || isValidVerse(curFile, vs, "1Cor-02.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs8")
                || isValidVerse(curFile, vs, "Eph-6.html#vs13")
                || isValidVerse(curFile, vs, "Phil-2.html#vs7")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs11", 19)
                || isValidVerse(curFile, vs, "Phlm-1.html#vs12")
                || isValidVerse(curFile, vs, "Heb-02.html#vs16")
                || isValidVerse(curFile, vs, "Heb-11.html#vs35")
                || isValidVerse(curFile, vs, "3John-1.html#vs7");
    } // isAannemen

    public static boolean isAfnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "1Sam-06.html#vs15")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-02.html#vs23")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs4")
                || isValidVerse(curFile, vs, "Song-5.html#vs7")
                || isValidVerse(curFile, vs, "Isa-47.html#vs2")
                || isValidVerse(curFile, vs, "Jer-28.html#vs10")
                || isValidVerse(curFile, vs, "Mic-2.html#vs2")
                || isValidVerse(curFile, vs, "Matt-25.html#vs28")
                || isValidVerse(curFile, vs, "Luke-11.html#vs22")
                || isValidVerse(curFile, vs, "Luke-19.html#vs24")
                || isValidVerse(curFile, vs, "John-10.html#vs18")
                || isValidVerse(curFile, vs, "Acts-13.html#vs29");
    } // isAfnemen

    public static boolean isDeelnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Eph-5.html#vs11");
    } // isDeelnemen

    public static boolean isEedAfnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-11.html#vs4");
    } // isEedAfnemen

    public static boolean isGevangennemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Josh-11.html#vs17")
                || isValidVerse(curFile, vs, "Judg-05.html#vs12")
                || isValidVerse(curFile, vs, "Judg-07.html#vs25")
                || isValidVerse(curFile, vs, "Judg-08.html#vs12", 14)
                || isValidVerse(curFile, vs, "2Sam-08.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-24.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-18.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs11")
                || isValidVerse(curFile, vs, "Prov-05.html#vs22")
                || isValidVerse(curFile, vs, "Jer-06.html#vs11")
                || isValidVerse(curFile, vs, "Jer-18.html#vs22")
                || isValidVerse(curFile, vs, "Jer-36.html#vs26")
                || isValidVerse(curFile, vs, "Jer-39.html#vs5")
                || isValidVerse(curFile, vs, "Jer-51.html#vs56")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs12")
                || isValidVerse(curFile, vs, "Mark-14.html#vs48")
                || isValidVerse(curFile, vs, "Luke-22.html#vs54")
                || isValidVerse(curFile, vs, "John-18.html#vs12")
                || isValidVerse(curFile, vs, "Acts-09.html#vs14")
                || isValidVerse(curFile, vs, "2Cor-10.html#vs5")
                || isValidVerse(curFile, vs, "2Cor-11.html#vs32")
                || isValidVerse(curFile, vs, "Eph-4.html#vs8")
                || isValidVerse(curFile, vs, "Didache-01.html#vs5");
    } // isGevangennemen

    public static boolean isInAchtNemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-17.html#vs9")
                || isValidVerse(curFile, vs, "Gen-18.html#vs19")
                || isValidVerse(curFile, vs, "Gen-26.html#vs5")
                || isValidVerse(curFile, vs, "Exod-12.html#vs17", 25)
                || isValidVerse(curFile, vs, "Exod-13.html#vs10")
                || isValidVerse(curFile, vs, "Exod-15.html#vs26")
                || isValidVerse(curFile, vs, "Exod-16.html#vs28")
                || isValidVerse(curFile, vs, "Exod-19.html#vs5")
                || isValidVerse(curFile, vs, "Exod-20.html#vs6")
                || isValidVerse(curFile, vs, "Exod-23.html#vs15")
                || isValidVerse(curFile, vs, "Exod-31.html#vs13", 14, 16)
                || isValidVerse(curFile, vs, "Exod-34.html#vs18")
                || isValidVerse(curFile, vs, "Lev-08.html#vs35")
                || isValidVerse(curFile, vs, "Lev-18.html#vs4", 5, 26, 30)
                || isValidVerse(curFile, vs, "Lev-19.html#vs3", 19, 30, 37)
                || isValidVerse(curFile, vs, "Lev-20.html#vs14")
                || isValidVerse(curFile, vs, "Lev-22.html#vs9", 31)
                || isValidVerse(curFile, vs, "Lev-25.html#vs18")
                || isValidVerse(curFile, vs, "Lev-26.html#vs2", 3)
                || isValidVerse(curFile, vs, "Num-09.html#vs19", 23)
                || isValidVerse(curFile, vs, "Deut-04.html#vs2",6, 9, 40)
                || isValidVerse(curFile, vs, "Deut-05.html#vs1", 10, 12, 29)
                || isValidVerse(curFile, vs, "Deut-06.html#vs2", 3, 17, 25)
                || isValidVerse(curFile, vs, "Deut-07.html#vs8", 9, 11, 12)
                || isValidVerse(curFile, vs, "Deut-08.html#vs1", 2, 6, 11)
                || isValidVerse(curFile, vs, "Deut-10.html#vs13")
                || isValidVerse(curFile, vs, "Deut-11.html#vs1", 8, 22, 32)
                || isValidVerse(curFile, vs, "Deut-12.html#vs1", 32)
                || isValidVerse(curFile, vs, "Deut-13.html#vs4", 18)
                || isValidVerse(curFile, vs, "Deut-15.html#vs5")
                || isValidVerse(curFile, vs, "Deut-16.html#vs1", 12)
                || isValidVerse(curFile, vs, "Deut-17.html#vs19")
                || isValidVerse(curFile, vs, "Deut-26.html#vs16", 17, 18)
                || isValidVerse(curFile, vs, "Deut-27.html#vs1")
                || isValidVerse(curFile, vs, "Deut-28.html#vs1",9, 13, 45)
                || isValidVerse(curFile, vs, "Deut-30.html#vs10", 16)
                || isValidVerse(curFile, vs, "Deut-33.html#vs9")
                || isValidVerse(curFile, vs, "Josh-22.html#vs2", 3, 5, 6)
                || isValidVerse(curFile, vs, "Judg-02.html#vs22")
                || isValidVerse(curFile, vs, "Judg-13.html#vs14")
                || isValidVerse(curFile, vs, "1Sam-13.html#vs13", 14)
                || isValidVerse(curFile, vs, "2Sam-22.html#vs22")
                || isValidVerse(curFile, vs, "1Kgs-02.html#vs3", 43)
                || isValidVerse(curFile, vs, "1Kgs-03.html#vs14")
                || isValidVerse(curFile, vs, "1Kgs-06.html#vs12")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs58", 61)
                || isValidVerse(curFile, vs, "1Kgs-09.html#vs4", 6)
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs11", 34, 38)
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs21")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs13", 19, 37)
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs3")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs13")
                || isValidVerse(curFile, vs, "1Chr-22.html#vs12",  13)
                || isValidVerse(curFile, vs, "1Chr-28.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-29.html#vs19")
                || isValidVerse(curFile, vs, "2Chr-07.html#vs17")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-34.html#vs21", 31)
                || isValidVerse(curFile, vs, "Neh-01.html#vs5", 7, 9)
                || isValidVerse(curFile, vs, "Neh-09.html#vs32")
                || isValidVerse(curFile, vs, "Neh-10.html#vs29")
                || isValidVerse(curFile, vs, "Ps-025.html#vs10")
                || isValidVerse(curFile, vs, "Ps-078.html#vs7", 10, 56)
                || isValidVerse(curFile, vs, "Ps-089.html#vs32")
                || isValidVerse(curFile, vs, "Ps-099.html#vs7")
                || isValidVerse(curFile, vs, "Ps-103.html#vs18")
                || isValidVerse(curFile, vs, "Ps-105.html#vs45")
                || isValidVerse(curFile, vs, "Ps-119.html#vs2", 4, 5, 8, 17, 22, 33, 34, 44, 55, 56, 57, 60, 63, 67, 69, 88, 100, 106, 115, 129, 134, 136, 145, 167, 168)
                || isValidVerse(curFile, vs, "Ps-132.html#vs12")
                || isValidVerse(curFile, vs, "Prov-02.html#vs8", 20)
                || isValidVerse(curFile, vs, "Prov-03.html#vs1", 21)
                || isValidVerse(curFile, vs, "Prov-04.html#vs4", 10, 13)
                || isValidVerse(curFile, vs, "Prov-05.html#vs2")
                || isValidVerse(curFile, vs, "Prov-06.html#vs20")
                || isValidVerse(curFile, vs, "Prov-07.html#vs1", 2)
                || isValidVerse(curFile, vs, "Prov-08.html#vs32")
                || isValidVerse(curFile, vs, "Prov-10.html#vs17")
                || isValidVerse(curFile, vs, "Prov-13.html#vs18")
                || isValidVerse(curFile, vs, "Prov-15.html#vs5")
                || isValidVerse(curFile, vs, "Prov-16.html#vs17")
                || isValidVerse(curFile, vs, "Prov-19.html#vs16")
                || isValidVerse(curFile, vs, "Prov-28.html#vs4", 7)
                || isValidVerse(curFile, vs, "Eccl-08.html#vs5")
                || isValidVerse(curFile, vs, "Isa-56.html#vs1", 2, 4, 6)
                || isValidVerse(curFile, vs, "Jer-08.html#vs7")
                || isValidVerse(curFile, vs, "Jer-16.html#vs11")
                || isValidVerse(curFile, vs, "Jer-35.html#vs18")
                || isValidVerse(curFile, vs, "Ezek-11.html#vs20")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs14")
                || isValidVerse(curFile, vs, "Ezek-18.html#vs9", 19, 21)
                || isValidVerse(curFile, vs, "Ezek-20.html#vs18", 19)
                || isValidVerse(curFile, vs, "Ezek-36.html#vs27")
                || isValidVerse(curFile, vs, "Ezek-37.html#vs24")
                || isValidVerse(curFile, vs, "Ezek-43.html#vs11")
                || isValidVerse(curFile, vs, "Ezek-44.html#vs24")
                || isValidVerse(curFile, vs, "Dan-09.html#vs4")
                || isValidVerse(curFile, vs, "Amos-2.html#vs4")
                || isValidVerse(curFile, vs, "Mal-2.html#vs2")
                || isValidVerse(curFile, vs, "Matt-19.html#vs17", 20)
                || isValidVerse(curFile, vs, "Matt-28.html#vs19")
                || isValidVerse(curFile, vs, "Mark-10.html#vs20")
                || isValidVerse(curFile, vs, "Luke-18.html#vs21")
                || isValidVerse(curFile, vs, "John-08.html#vs51", 52, 55)
                || isValidVerse(curFile, vs, "John-09.html#vs16")
                || isValidVerse(curFile, vs, "John-14.html#vs15", 21, 23, 24)
                || isValidVerse(curFile, vs, "John-15.html#vs10", 20)
                || isValidVerse(curFile, vs, "John-17.html#vs6")
                || isValidVerse(curFile, vs, "Acts-07.html#vs53")
                || isValidVerse(curFile, vs, "Acts-15.html#vs5")
                || isValidVerse(curFile, vs, "Acts-16.html#vs4")
                || isValidVerse(curFile, vs, "Acts-21.html#vs24", 25)
                || isValidVerse(curFile, vs, "Rom-02.html#vs26")
                || isValidVerse(curFile, vs, "1Cor-07.html#vs19")
                || isValidVerse(curFile, vs, "Gal-6.html#vs13")
                || isValidVerse(curFile, vs, "1Tim-5.html#vs21")
                || isValidVerse(curFile, vs, "1Tim-6.html#vs14")
                || isValidVerse(curFile, vs, "2Tim-2.html#vs5")
                || isValidVerse(curFile, vs, "Jas-2.html#vs10")
                || isValidVerse(curFile, vs, "1John-2.html#vs3", 4, 5)
                || isValidVerse(curFile, vs, "1John-3.html#vs22", 24)
                || isValidVerse(curFile, vs, "1John-5.html#vs3")
                || isValidVerse(curFile, vs, "Rev-01.html#vs3")
                || isValidVerse(curFile, vs, "Rev-02.html#vs26")
                || isValidVerse(curFile, vs, "Rev-03.html#vs8")
                || isValidVerse(curFile, vs, "Rev-12.html#vs17")
                || isValidVerse(curFile, vs, "Rev-14.html#vs12")
                || isValidVerse(curFile, vs, "Rev-22.html#vs7", 9);
    } // isInAchtNemen

    public static boolean isInnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-21.html#vs25", 32)
                || isValidVerse(curFile, vs, "Num-32.html#vs39",  41, 42)
                || isValidVerse(curFile, vs, "Deut-02.html#vs24")
                || isValidVerse(curFile, vs, "Deut-03.html#vs4", 14)
                || isValidVerse(curFile, vs, "Deut-20.html#vs5")
                || isValidVerse(curFile, vs, "Josh-06.html#vs20")
                || isValidVerse(curFile, vs, "Josh-08.html#vs19")
                || isValidVerse(curFile, vs, "Josh-10.html#vs28", 32, 35, 37, 39)
                || isValidVerse(curFile, vs, "Josh-11.html#vs10", 12, 16, 19, 23)
                || isValidVerse(curFile, vs, "Josh-15.html#vs17")
                || isValidVerse(curFile, vs, "Josh-19.html#vs47")
                || isValidVerse(curFile, vs, "Judg-01.html#vs13", 18)
                || isValidVerse(curFile, vs, "Judg-03.html#vs28")
                || isValidVerse(curFile, vs, "Judg-09.html#vs45", 50)
                || isValidVerse(curFile, vs, "2Sam-05.html#vs7")
                || isValidVerse(curFile, vs, "2Sam-12.html#vs28", 29)
                || isValidVerse(curFile, vs, "2Kgs-12.html#vs17")
                || isValidVerse(curFile, vs, "2Kgs-15.html#vs29")
                || isValidVerse(curFile, vs, "2Kgs-16.html#vs9")
                || isValidVerse(curFile, vs, "2Kgs-17.html#vs6")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs10", 13)
                || isValidVerse(curFile, vs, "1Chr-11.html#vs5")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-13.html#vs19")
                || isValidVerse(curFile, vs, "Jer-32.html#vs23")
                || isValidVerse(curFile, vs, "Hab-1.html#vs10")
                || isValidVerse(curFile, vs, "Hab-2.html#vs1")
                || isValidVerse(curFile, vs, "Luke-14.html#vs9")
                || isValidVerse(curFile, vs, "2Cor-06.html#vs12");
    } // isInnemen

    public static boolean isMeenemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-12.html#vs19")
                || isValidVerse(curFile, vs, "Gen-14.html#vs11", 12)
                || isValidVerse(curFile, vs, "Gen-22.html#vs2")
                || isValidVerse(curFile, vs, "Gen-24.html#vs52", 61)
                || isValidVerse(curFile, vs, "Gen-31.html#vs23")
                || isValidVerse(curFile, vs, "Gen-32.html#vs23")
                || isValidVerse(curFile, vs, "Gen-34.html#vs26", 28, 29)
                || isValidVerse(curFile, vs, "Gen-42.html#vs24")
                || isValidVerse(curFile, vs, "Gen-43.html#vs11", 12, 13, 15, 19)
                || isValidVerse(curFile, vs, "Gen-46.html#vs6")
                || isValidVerse(curFile, vs, "Gen-48.html#vs1")
                || isValidVerse(curFile, vs, "Exod-02.html#vs9")
                || isValidVerse(curFile, vs, "Exod-12.html#vs32")
                || isValidVerse(curFile, vs, "Exod-13.html#vs19")
                || isValidVerse(curFile, vs, "Exod-14.html#vs6", 7)
                || isValidVerse(curFile, vs, "Exod-17.html#vs5")
                || isValidVerse(curFile, vs, "Num-13.html#vs20", 23)
                || isValidVerse(curFile, vs, "Num-23.html#vs14", 28)
                || isValidVerse(curFile, vs, "Deut-01.html#vs25")
                || isValidVerse(curFile, vs, "Deut-24.html#vs10")
                || isValidVerse(curFile, vs, "Josh-07.html#vs21")
                || isValidVerse(curFile, vs, "Josh-08.html#vs1")
                || isValidVerse(curFile, vs, "Josh-09.html#vs11")
                || isValidVerse(curFile, vs, "Judg-04.html#vs6")
                || isValidVerse(curFile, vs, "Judg-05.html#vs19")
                || isValidVerse(curFile, vs, "Judg-07.html#vs8")
                || isValidVerse(curFile, vs, "Judg-20.html#vs10")
                || isValidVerse(curFile, vs, "1Sam-01.html#vs24")
                || isValidVerse(curFile, vs, "1Sam-09.html#vs3", 22)
                || isValidVerse(curFile, vs, "1Sam-10.html#vs23")
                || isValidVerse(curFile, vs, "1Sam-16.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs18", 57)
                || isValidVerse(curFile, vs, "1Sam-18.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-21.html#vs8",9)
                || isValidVerse(curFile, vs, "1Sam-26.html#vs11", 12)
                || isValidVerse(curFile, vs, "1Sam-30.html#vs20")
                || isValidVerse(curFile, vs, "2Sam-04.html#vs7", 12)
                || isValidVerse(curFile, vs, "2Sam-05.html#vs21")
                || isValidVerse(curFile, vs, "2Sam-08.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-01.html#vs33")
                || isValidVerse(curFile, vs, "1Kgs-05.html#vs9")
                || isValidVerse(curFile, vs, "1Kgs-10.html#vs28")
                || isValidVerse(curFile, vs, "1Kgs-11.html#vs18")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-20.html#vs6")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs1")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-07.html#vs8")
                || isValidVerse(curFile, vs, "2Kgs-08.html#vs8", 9)
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs4")
                || isValidVerse(curFile, vs, "2Kgs-14.html#vs14")
                || isValidVerse(curFile, vs, "2Kgs-23.html#vs34")
                || isValidVerse(curFile, vs, "2Kgs-25.html#vs14", 15, 18, 19, 20)
                || isValidVerse(curFile, vs, "1Chr-18.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-01.html#vs16")
                || isValidVerse(curFile, vs, "2Chr-16.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-18.html#vs25")
                || isValidVerse(curFile, vs, "2Chr-23.html#vs8", 20)
                || isValidVerse(curFile, vs, "2Chr-25.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-36.html#vs1")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs15")
                || isValidVerse(curFile, vs, "Esth-02.html#vs13", 15, 16)
                || isValidVerse(curFile, vs, "Job-01.html#vs15", 17)
                || isValidVerse(curFile, vs, "Jer-13.html#vs6")
                || isValidVerse(curFile, vs, "Jer-19.html#vs1")
                || isValidVerse(curFile, vs, "Jer-38.html#vs6", 11)
                || isValidVerse(curFile, vs, "Jer-39.html#vs12")
                || isValidVerse(curFile, vs, "Jer-41.html#vs12", 16)
                || isValidVerse(curFile, vs, "Jer-43.html#vs5")
                || isValidVerse(curFile, vs, "Jer-52.html#vs18", 19, 24, 25, 26)
                || isValidVerse(curFile, vs, "Ezek-17.html#vs3", 5)
                || isValidVerse(curFile, vs, "Ezek-22.html#vs25")
                || isValidVerse(curFile, vs, "Ezek-38.html#vs13")
                || isValidVerse(curFile, vs, "Hos-14.html#vs3")
                || isValidVerse(curFile, vs, "Matt-02.html#vs13", 14, 20, 21)
                || isValidVerse(curFile, vs, "Matt-04.html#vs5", 8)
                || isValidVerse(curFile, vs, "Matt-12.html#vs45")
                || isValidVerse(curFile, vs, "Matt-16.html#vs5")
                || isValidVerse(curFile, vs, "Matt-17.html#vs1")
                || isValidVerse(curFile, vs, "Matt-18.html#vs16")
                || isValidVerse(curFile, vs, "Matt-22.html#vs13")
                || isValidVerse(curFile, vs, "Matt-25.html#vs3", 4)
                || isValidVerse(curFile, vs, "Matt-26.html#vs37")
                || isValidVerse(curFile, vs, "Matt-27.html#vs27")
                || isValidVerse(curFile, vs, "Mark-04.html#vs36")
                || isValidVerse(curFile, vs, "Mark-05.html#vs40")
                || isValidVerse(curFile, vs, "Mark-06.html#vs8")
                || isValidVerse(curFile, vs, "Mark-08.html#vs14")
                || isValidVerse(curFile, vs, "Mark-09.html#vs2")
                || isValidVerse(curFile, vs, "Mark-14.html#vs33")
                || isValidVerse(curFile, vs, "Luke-09.html#vs3", 10)
                || isValidVerse(curFile, vs, "Luke-10.html#vs4")
                || isValidVerse(curFile, vs, "Luke-11.html#vs26")
                || isValidVerse(curFile, vs, "Luke-17.html#vs31")
                || isValidVerse(curFile, vs, "John-06.html#vs15")
                || isValidVerse(curFile, vs, "John-19.html#vs16")
                || isValidVerse(curFile, vs, "Acts-09.html#vs25")
                || isValidVerse(curFile, vs, "Acts-12.html#vs25")
                || isValidVerse(curFile, vs, "Acts-15.html#vs30")
                || isValidVerse(curFile, vs, "Acts-16.html#vs33")
                || isValidVerse(curFile, vs, "Acts-17.html#vs19")
                || isValidVerse(curFile, vs, "Acts-21.html#vs26", 32)
                || isValidVerse(curFile, vs, "Acts-23.html#vs18", 31)
                || isValidVerse(curFile, vs, "1Cor-09.html#vs5")
                || isValidVerse(curFile, vs, "Gal-2.html#vs1");
    } // isMeenemen

    public static boolean isOpnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-03.html#vs40")
                || isValidVerse(curFile, vs, "Num-04.html#vs2", 22)
                || isValidVerse(curFile, vs, "Num-31.html#vs26")
                || isValidVerse(curFile, vs, "Josh-04.html#vs8")
                || isValidVerse(curFile, vs, "Judg-16.html#vs31")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs32")
                || isValidVerse(curFile, vs, "1Kgs-08.html#vs3")
                || isValidVerse(curFile, vs, "1Kgs-13.html#vs29")
                || isValidVerse(curFile, vs, "1Kgs-17.html#vs23")
                || isValidVerse(curFile, vs, "2Sam-02.html#vs32")
                || isValidVerse(curFile, vs, "2Kgs-04.html#vs20", 36, 37)
                || isValidVerse(curFile, vs, "1Chr-27.html#vs23")
                || isValidVerse(curFile, vs, "2Chr-05.html#vs4")
                || isValidVerse(curFile, vs, "2Chr-24.html#vs11")
                || isValidVerse(curFile, vs, "Neh-10.html#vs35")
                || isValidVerse(curFile, vs, "Isa-22.html#vs6")
                || isValidVerse(curFile, vs, "Ezek-03.html#vs10")
                || isValidVerse(curFile, vs, "Matt-09.html#vs6")
                || isValidVerse(curFile, vs, "Matt-11.html#vs29")
                || isValidVerse(curFile, vs, "Mark-02.html#vs9", 11)
                || isValidVerse(curFile, vs, "Mark-10.html#vs21")
                || isValidVerse(curFile, vs, "Luke-05.html#vs24")
                || isValidVerse(curFile, vs, "John-05.html#vs8", 9, 11, 12)
                || isValidVerse(curFile, vs, "John-08.html#vs59")
                || isValidVerse(curFile, vs, "Acts-07.html#vs21")
                || isValidVerse(curFile, vs, "Eph-6.html#vs16");
    } // isOpnemen

    public static boolean isOvernemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Kgs-05.html#vs24");
    } // isOvernemen

    public static boolean isPlaatsnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "2Sam-07.html#vs18")
                || isValidVerse(curFile, vs, "Judg-06.html#vs11")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs19")
                || isValidVerse(curFile, vs, "1Chr-17.html#vs16")
                || isValidVerse(curFile, vs, "Ps-007.html#vs8");
    } // isPlaatsnemen

    public static boolean isTenHuwelijkNemen(final File curFile, final String vs, final @NotNull String keyArg, final @NotNull String arg) {
        if (arg.equals(keyArg)) {
            return false;
        }
        return isValidVerse(curFile, vs, "Ezra-09.html#vs12")
                || isValidVerse(curFile, vs, "Matt-22.html#vs30")
                || isValidVerse(curFile, vs, "Luke-17.html#vs27");
    } // isTenHuwelijkNemen

    public static boolean isTerugnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-31.html#vs32")
                || isValidVerse(curFile, vs, "1Kgs-22.html#vs3")
                || isValidVerse(curFile, vs, "Isa-31.html#vs2");
    } // isTerugnemen

    public static boolean isToenemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-07.html#vs17", 18)
                || isValidVerse(curFile, vs, "2Sam-15.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-11.html#vs9")
                || isValidVerse(curFile, vs, "Ps-144.html#vs13")
                || isValidVerse(curFile, vs, "Eccl-02.html#vs9")
                || isValidVerse(curFile, vs, "Luke-02.html#vs52")
                || isValidVerse(curFile, vs, "Acts-06.html#vs7")
                || isValidVerse(curFile, vs, "Acts-07.html#vs17")
                || isValidVerse(curFile, vs, "Acts-09.html#vs31")
                || isValidVerse(curFile, vs, "Acts-12.html#vs24")
                || isValidVerse(curFile, vs, "Acts-16.html#vs5")
                || isValidVerse(curFile, vs, "Acts-19.html#vs20");
    } // isToenemen

    public static boolean isVoornemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Dan-01.html#vs8")
                || isValidVerse(curFile, vs, "Luke-21.html#vs14")
                || isValidVerse(curFile, vs, "Acts-19.html#vs21")
                || isValidVerse(curFile, vs, "2Cor-01.html#vs17");
    } // isVoornemen

    public static boolean isWaarnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Num-23.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-19.html#vs7");
    } // isWaarnemen

    public static boolean isWegnemen(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-05.html#vs24")
                || isValidVerse(curFile, vs, "Gen-08.html#vs13")
                || isValidVerse(curFile, vs, "Judg-18.html#vs17")
                || isValidVerse(curFile, vs, "1Sam-24.html#vs12")
                || isValidVerse(curFile, vs, "1Sam-31.html#vs12")
                || isValidVerse(curFile, vs, "2Sam-03.html#vs10")
                || isValidVerse(curFile, vs, "2Sam-14.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-24.html#vs10")
                || isValidVerse(curFile, vs, "1Kgs-14.html#vs26")
                || isValidVerse(curFile, vs, "2Kgs-05.html#vs5")
                || isValidVerse(curFile, vs, "2Kgs-11.html#vs2")
                || isValidVerse(curFile, vs, "2Kgs-18.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-07.html#vs21")
                || isValidVerse(curFile, vs, "1Chr-10.html#vs12")
                || isValidVerse(curFile, vs, "1Chr-21.html#vs8")
                || isValidVerse(curFile, vs, "2Chr-12.html#vs9")
                || isValidVerse(curFile, vs, "2Chr-14.html#vs3", 5)
                || isValidVerse(curFile, vs, "2Chr-17.html#vs6")
                || isValidVerse(curFile, vs, "2Chr-22.html#vs11")
                || isValidVerse(curFile, vs, "2Chr-30.html#vs14")
                || isValidVerse(curFile, vs, "2Chr-33.html#vs15")
                || isValidVerse(curFile, vs, "Esth-08.html#vs3")
                || isValidVerse(curFile, vs, "Job-09.html#vs12")
                || isValidVerse(curFile, vs, "Job-12.html#vs20", 24)
                || isValidVerse(curFile, vs, "Job-15.html#vs4")
                || isValidVerse(curFile, vs, "Ps-025.html#vs18")
                || isValidVerse(curFile, vs, "Ps-026.html#vs9")
                || isValidVerse(curFile, vs, "Ps-039.html#vs11")
                || isValidVerse(curFile, vs, "Ps-051.html#vs13")
                || isValidVerse(curFile, vs, "Ps-102.html#vs25")
                || isValidVerse(curFile, vs, "Ps-104.html#vs29")
                || isValidVerse(curFile, vs, "Isa-04.html#vs1")
                || isValidVerse(curFile, vs, "Isa-40.html#vs24")
                || isValidVerse(curFile, vs, "Jer-13.html#vs7")
                || isValidVerse(curFile, vs, "Ezek-17.html#vs13")
                || isValidVerse(curFile, vs, "Ezek-33.html#vs4", 6)
                || isValidVerse(curFile, vs, "Hos-02.html#vs8")
                || isValidVerse(curFile, vs, "Hos-13.html#vs11")
                || isValidVerse(curFile, vs, "Hos-14.html#vs3")
                || isValidVerse(curFile, vs, "Jonah-4.html#vs3")
                || isValidVerse(curFile, vs, "Mic-1.html#vs11")
                || isValidVerse(curFile, vs, "Mic-2.html#vs3", 4)
                || isValidVerse(curFile, vs, "Matt-14.html#vs12")
                || isValidVerse(curFile, vs, "Mark-04.html#vs15")
                || isValidVerse(curFile, vs, "Mark-06.html#vs29")
                || isValidVerse(curFile, vs, "Mark-14.html#vs36")
                || isValidVerse(curFile, vs, "Luke-01.html#vs25")
                || isValidVerse(curFile, vs, "Luke-08.html#vs12")
                || isValidVerse(curFile, vs, "Luke-22.html#vs42")
                || isValidVerse(curFile, vs, "John-02.html#vs16")
                || isValidVerse(curFile, vs, "John-11.html#vs39",  41)
                || isValidVerse(curFile, vs, "John-15.html#vs2")
                || isValidVerse(curFile, vs, "John-19.html#vs38")
                || isValidVerse(curFile, vs, "Acts-08.html#vs39")
                || isValidVerse(curFile, vs, "Heb-10.html#vs9")
                || isValidVerse(curFile, vs, "1John-3.html#vs5")
                || isValidVerse(curFile, vs, "Rev-06.html#vs4");
    } // isWegnemen

    public static boolean isNaam(final File curFile, final String vs) {
        return isValidVerse(curFile, vs, "Gen-25.html#vs13",  16)
                || isValidVerse(curFile, vs, "Gen-26.html#vs18")
                || isValidVerse(curFile, vs, "Gen-36.html#vs10", 40)
                || isValidVerse(curFile, vs, "Gen-46.html#vs8")
                || isValidVerse(curFile, vs, "Exod-01.html#vs1")
                || isValidVerse(curFile, vs, "Exod-06.html#vs15")
                || isValidVerse(curFile, vs, "Exod-28.html#vs9", 10, 11, 12, 21, 29)
                || isValidVerse(curFile, vs, "Exod-39.html#vs6", 14)
                || isValidVerse(curFile, vs, "Num-01.html#vs2", 17, 18, 20, 22, 24, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42)
                || isValidVerse(curFile, vs, "Num-03.html#vs2", 3, 17, 18, 40, 43)
                || isValidVerse(curFile, vs, "Num-04.html#vs32")
                || isValidVerse(curFile, vs, "Num-13.html#vs4", 16)
                || isValidVerse(curFile, vs, "Num-26.html#vs33", 53, 55)
                || isValidVerse(curFile, vs, "Num-27.html#vs1")
                || isValidVerse(curFile, vs, "Num-32.html#vs38")
                || isValidVerse(curFile, vs, "Num-34.html#vs17", 19)
                || isValidVerse(curFile, vs, "Josh-17.html#vs3")
                || isValidVerse(curFile, vs, "Ruth-1.html#vs2")
                || isValidVerse(curFile, vs, "1Sam-14.html#vs49")
                || isValidVerse(curFile, vs, "1Sam-17.html#vs13")
                || isValidVerse(curFile, vs, "2Sam-05.html#vs14")
                || isValidVerse(curFile, vs, "2Sam-23.html#vs8")
                || isValidVerse(curFile, vs, "1Kgs-04.html#vs8")
                || isValidVerse(curFile, vs, "1Chr-06.html#vs17")
                || isValidVerse(curFile, vs, "1Chr-08.html#vs38")
                || isValidVerse(curFile, vs, "1Chr-09.html#vs44")
                || isValidVerse(curFile, vs, "1Chr-14.html#vs4")
                || isValidVerse(curFile, vs, "1Chr-23.html#vs24")
                || isValidVerse(curFile, vs, "2Chr-28.html#vs15")
                || isValidVerse(curFile, vs, "2Chr-31.html#vs19")
                || isValidVerse(curFile, vs, "Ezra-05.html#vs4", 10)
                || isValidVerse(curFile, vs, "Ezra-08.html#vs13")
                || isValidVerse(curFile, vs, "Ps-016.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-23.html#vs4")
                || isValidVerse(curFile, vs, "Ezek-48.html#vs1", 31)
                || isValidVerse(curFile, vs, "Dan-01.html#vs7")
                || isValidVerse(curFile, vs, "Hos-02.html#vs16")
                || isValidVerse(curFile, vs, "Zech-13.html#vs2")
                || isValidVerse(curFile, vs, "Matt-10.html#vs2")
                || isValidVerse(curFile, vs, "Luke-10.html#vs20")
                || isValidVerse(curFile, vs, "Acts-18.html#vs15")
                || isValidVerse(curFile, vs, "Phil-4.html#vs3")
                || isValidVerse(curFile, vs, "Rev-13.html#vs8")
                || isValidVerse(curFile, vs, "Rev-17.html#vs3")
                || isValidVerse(curFile, vs, "Rev-21.html#vs12", 14);
    } // isNaam

}
