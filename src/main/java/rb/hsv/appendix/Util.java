package rb.hsv.appendix;

import java.util.Properties;

import static rb.hsv.appendix.Constants.*;

public class Util {

    final public static String LINE_SEPARATOR = "\n";

    public static String getBookName(final String name) {
        return name.substring(0, name.indexOf("-"));
    }

    public static String getChapter(final String name, final boolean without0) {
        String chapter = name.substring(name.indexOf("-")+1, name.indexOf("."));
        if (without0) {
            while (chapter.startsWith("0")) {
                chapter = chapter.substring(1);
            }
        }
        return chapter;
    }

    public static String getVerseNumber(final String line) {
        String t1 = line.substring(line.indexOf("id=\"vs")+6);
        String vsNumber = t1.substring(0, t1.indexOf("\""));

        return vsNumber;
    }

    public static int getVerseNumberAsInt(final String line) {
        String t1 = line.substring(line.indexOf("id=\"vs")+6);
        String vsNumber = t1.substring(0, t1.indexOf("\""));

        var integer = Integer.valueOf(vsNumber);
        return integer;
    }

    public static String getBookRef(String name) {
        if (name.startsWith("Gen")) return GEN;
        if (name.startsWith("Exod")) return EXOD;
        if (name.startsWith("Lev")) return LEV;
        if (name.startsWith("Num")) return NUM;
        if (name.startsWith("Deut")) return DEUT;
        if (name.startsWith("Josh")) return JOZ;
        if (name.startsWith("Ruth")) return RUTH;
        if (name.startsWith("Judg")) return RICHT;
        if (name.startsWith("1Sam")) return SAM_1;
        if (name.startsWith("2Sam")) return SAM_2;
        if (name.startsWith("1Kgs")) return KON_1;
        if (name.startsWith("2Kgs")) return KON_2;
        if (name.startsWith("1Chr")) return KRON_1;
        if (name.startsWith("2Chr")) return KRON_2;
        if (name.startsWith("Ezra")) return EZRA;
        if (name.startsWith("Neh")) return NEH;
        if (name.startsWith("Esth")) return ESTH;
        if (name.startsWith("Job")) return JOB;
        if (name.startsWith("Ps")) return PS;
        if (name.startsWith("Prov")) return SPR;
        if (name.startsWith("Eccl")) return PRED;
        if (name.startsWith("Song")) return HOOGL;
        if (name.startsWith("Isa")) return JES;
        if (name.startsWith("Jer")) return JER;
        if (name.startsWith("Lam")) return KLAAGL;
        if (name.startsWith("Ezek")) return EZECH;
        if (name.startsWith("Dan")) return DAN;
        if (name.startsWith("Hos")) return HOS;
        if (name.startsWith("Joel")) return JOEL;
        if (name.startsWith("Amos")) return AMOS;
        if (name.startsWith("Obad")) return OBADJA;
        if (name.startsWith("Jonah")) return JONA;
        if (name.startsWith("Mic")) return MICHA;
        if (name.startsWith("Nah")) return NAHUM;
        if (name.startsWith("Hab")) return HAB;
        if (name.startsWith("Zeph")) return ZEF;
        if (name.startsWith("Hag")) return HAGGAI;
        if (name.startsWith("Zech")) return ZACH;
        if (name.startsWith("Mal")) return MAL;
        if (name.startsWith("Matt")) return MATT;
        if (name.startsWith("Mark")) return MARK;
        if (name.startsWith("Luke")) return LUK;
        if (name.startsWith("John")) return JOH;
        if (name.startsWith("Acts")) return HAND;
        if (name.startsWith("Rom")) return ROM;
        if (name.startsWith("1Cor")) return KOR_1;
        if (name.startsWith("2Cor")) return KOR_2;
        if (name.startsWith("Gal")) return GAL;
        if (name.startsWith("Eph")) return EFEZ;
        if (name.startsWith("Phil")) return FILIPP;
        if (name.startsWith("Col")) return KOL;
        if (name.startsWith("1Thess")) return THESS_1;
        if (name.startsWith("2Thess")) return THESS_2;
        if (name.startsWith("1Tim")) return TIM_1;
        if (name.startsWith("2Tim")) return TIM_2;
        if (name.startsWith("Titus")) return TIT;
        if (name.startsWith("Phlm")) return FILEM;
        if (name.startsWith("Heb")) return HEBR;
        if (name.startsWith("Jas")) return JAK;
        if (name.startsWith("1Pet")) return PETR_1;
        if (name.startsWith("2Pet")) return PETR_2;
        if (name.startsWith("1John")) return JOH_1;
        if (name.startsWith("2John")) return JOH_2;
        if (name.startsWith("3John")) return JOH_3;
        if (name.startsWith("Jude")) return JUDAS;
        if (name.startsWith("Rev")) return OPENB;
        if (name.startsWith("Didache")) return DIDACHE;
        return null;
    }

    public static int getBookIndex(String bookRef) {
        if (bookRef.equals(GEN)) return 1;
        if (bookRef.equals(EXOD)) return 2;
        if (bookRef.equals(LEV)) return 3;
        if (bookRef.equals(NUM)) return 4;
        if (bookRef.equals(DEUT)) return 5;
        if (bookRef.equals(JOZ)) return 6;
        if (bookRef.equals(RICHT)) return 7;
        if (bookRef.equals(RUTH)) return 8;
        if (bookRef.equals(SAM_1)) return 9;
        if (bookRef.equals(SAM_2)) return 10;
        if (bookRef.equals(KON_1)) return 11;
        if (bookRef.equals(KON_2)) return 12;
        if (bookRef.equals(KRON_1)) return 13;
        if (bookRef.equals(KRON_2)) return 14;
        if (bookRef.equals(EZRA)) return 15;
        if (bookRef.equals(NEH)) return 16;
        if (bookRef.equals(ESTH)) return 17;
        if (bookRef.equals(JOB)) return 18;
        if (bookRef.equals(PS)) return 19;
        if (bookRef.equals(SPR)) return 20;
        if (bookRef.equals(PRED)) return 21;
        if (bookRef.equals(HOOGL)) return 22;
        if (bookRef.equals(JES)) return 23;
        if (bookRef.equals(JER)) return 24;
        if (bookRef.equals(KLAAGL)) return 25;
        if (bookRef.equals(EZECH)) return 26;
        if (bookRef.equals(DAN)) return 27;
        if (bookRef.equals(HOS)) return 28;
        if (bookRef.equals(JOEL)) return 29;
        if (bookRef.equals(AMOS)) return 30;
        if (bookRef.equals(OBADJA)) return 31;
        if (bookRef.equals(JONA)) return 32;
        if (bookRef.equals(MICHA)) return 33;
        if (bookRef.equals(NAHUM)) return 34;
        if (bookRef.equals(HAB)) return 35;
        if (bookRef.equals(ZEF)) return 36;
        if (bookRef.equals(HAGGAI)) return 37;
        if (bookRef.equals(ZACH)) return 38;
        if (bookRef.equals(MAL)) return 39;
        if (bookRef.equals(MATT)) return 40;
        if (bookRef.equals(MARK)) return 41;
        if (bookRef.equals(LUK)) return 42;
        if (bookRef.equals(JOH)) return 43;
        if (bookRef.equals(HAND)) return 44;
        if (bookRef.equals(ROM)) return 45;
        if (bookRef.equals(KOR_1)) return 46;
        if (bookRef.equals(KOR_2)) return 47;
        if (bookRef.equals(GAL)) return 48;
        if (bookRef.equals(EFEZ)) return 49;
        if (bookRef.equals(FILIPP)) return 50;
        if (bookRef.equals(KOL)) return 51;
        if (bookRef.equals(THESS_1)) return 52;
        if (bookRef.equals(THESS_2)) return 53;
        if (bookRef.equals(TIM_1)) return 54;
        if (bookRef.equals(TIM_2)) return 55;
        if (bookRef.equals(TIT)) return 56;
        if (bookRef.equals(FILEM)) return 57;
        if (bookRef.equals(HEBR)) return 58;
        if (bookRef.equals(JAK)) return 59;
        if (bookRef.equals(PETR_1)) return 60;
        if (bookRef.equals(PETR_2)) return 61;
        if (bookRef.equals(JOH_1)) return 62;
        if (bookRef.equals(JOH_2)) return 63;
        if (bookRef.equals(JOH_3)) return 64;
        if (bookRef.equals(JUDAS)) return 65;
        if (bookRef.equals(OPENB)) return 66;
        if (bookRef.equals(DIDACHE)) return 67;
        return 0;
    }

    public static boolean isOneChapterBook(String bookRef) {
        return bookRef.equals(OBADJA) ||
                bookRef.equals(FILEM) ||
                bookRef.equals(JOH_2) ||
                bookRef.equals(JOH_3) ||
                bookRef.equals(JUDAS);
    }

    public static boolean checkFile(String fileName) {
        return !(fileName.equals("cip.html") ||
                fileName.equals("cover.html") ||
                fileName.equals("feesten.html") ||
                fileName.equals("fm.html") ||
                fileName.equals("geografie.html") ||
                fileName.equals("gewichten.html") ||
                fileName.equals("goden.html") ||
                fileName.equals("halftitle.html") ||
                fileName.equals("inhoud.html") ||
                fileName.equals("inhoudsmaten.html") ||
                fileName.equals("lengtematen.html") ||
                fileName.equals("maanden.html") ||
                fileName.equals("munten.html") ||
                fileName.equals("offers.html") ||
                fileName.equals("oppervlaktematen.html") ||
                fileName.equals("part01.html") ||
                fileName.equals("part02.html") ||
                fileName.equals("part03.html") ||
                fileName.equals("title.html") ||
                fileName.startsWith("geografie") ||
                fileName.startsWith("namen") ||
                fileName.startsWith("woordenboek"));
    }

    public static String removeZero(String s) {
        String result = s;
        while (result.startsWith("0")) {
            result = result.substring(1);
        }

        return result;
    }

    public static void delay(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public static void setLineSeparator() {
        System.setProperty("line.separator", "\n");
    }

    public static String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}
