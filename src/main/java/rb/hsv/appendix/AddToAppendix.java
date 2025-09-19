package rb.hsv.appendix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static rb.hsv.appendix.Constants.APPENDIX;
import static rb.hsv.appendix.Util.getLineSeparator;

public class AddToAppendix {

    private BufferedWriter writer;

    public void run(String arg1, String arg2) {
        String prefix = arg1;
        String filename = arg2;
        boolean isWithBetekenis = prefix.equals("geo");

        try {
            writer = new BufferedWriter(new FileWriter(APPENDIX));
            Stream<String> lines = Files.lines(Paths.get(filename));
            lines.filter(line -> line.startsWith("+"))
                    .forEach(line -> {
                        createInstance(prefix, line, isWithBetekenis);
                    });
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createInstance(String prefix, String argument, boolean isWithBetekenis) {
        String basename = createBasename(argument);
        String id = createId(prefix, basename);
        String name = createAppendixName(basename);
        StringBuilder str = new StringBuilder();
        String sep = prefix.equals("") ? "" : " - ";
        str.append("\t").append("<div class=\"appendix\">\n");
        str.append("\t\t").append("<div class=\"appendix-header\"><a id=\"").append(id)
                .append("\"/><span class=\"appendix-name\">").append(name)
                .append("</span>").append(sep).append("</div>\n");
        if (isWithBetekenis) {
            str.append("\t\t").append("<div class=\"appendix-betekenis\">Betekenis: </div>\n");
        }
        if (prefix.equals("nm")) {
            str.append("\t\t").append("<ul class=\"bullist-nm1\">\n");
            str.append("\t\t\t").append("<li>\n");
            str.append("\t\t\t\t").append("<ul class=\"bullist-nm2\">\n");
            str.append("\t\t\t\t\t").append("<li><i>Stam</i>: </li>\n");
            str.append("\t\t\t\t\t").append("<li><i>Getrouwd met</i>: </li>\n");
            str.append("\t\t\t\t\t").append("<li><i>Voorvader</i>: </li>\n");
            str.append("\t\t\t\t\t").append("<li><i>Bijzonderheden</i>: </li>\n");
            str.append("\t\t\t\t").append("</ul>\n");
            str.append("\t\t\t").append("</li>\n");
            str.append("\t\t").append("</ul>\n");
        }

        String ch = name.substring(0, 1).toLowerCase();
        String file = prefix.equals("geo") ? "geografie-" : prefix.equals("nm") ? "namen-" : "";
        String cl = prefix.equals("nm") ? "appendix-nm" : "appendix";
        str.append("<a class=\"" + cl + "\" href=\"" + file+ ch + ".html#" + id + "\">" + name + "</a>\n");
        str.append("#" + id + "\"\n");

        str.append("\t").append("</div>\n");

        try {
            writer.write(str.toString());
            writer.write(getLineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str.toString());
    }

    private String createBasename(String argument) {
        int i = argument.indexOf('+');
        int j = argument.indexOf('(');
        return j > 0 ? argument.substring(i+1, j).trim() :  argument.substring(i+1).trim();
    }

    private String createAppendixName(String basename) {
        return convertStringFromHighAsciiToUnicode(basename);
    }

    private String createId(String prefix, String basename) {
        return prefix + convertStringToAscii(basename);
    }

    private String convertStringFromHighAsciiToUnicode(String name) {
        char[] chars = name.toCharArray();
        String result = "";
        for (char ch: chars) {
            result += convertCharFromHighAsciiToUnicode(ch);;
        }

        return result;
    }

    private String convertCharFromHighAsciiToUnicode(final char ch) {
        String str = Character.toString(ch);
        str = str.replaceAll("\u00E4" , "&#228;");
        str = str.replaceAll("\u00E9" , "&#233;");
        str = str.replaceAll("\u00EB" , "&#235;");
        str = str.replaceAll("\u00EF" , "&#239;");
        str = str.replaceAll("\u00FC" , "&#252;");

        return str;
    }

    private String convertStringToAscii(final String name) {
        String str = name.replaceAll("&#228;" , "a");
        str = str.replaceAll("&#233;" , "e");
        str = str.replaceAll("&#235;" , "e");
        str = str.replaceAll("&#239;" , "i");
        str = str.replaceAll("&#252;" , "u");

        str = str.replaceAll("\u00E4" , "a");
        str = str.replaceAll("\u00E9" , "e");
        str = str.replaceAll("\u00EB" , "e");
        str = str.replaceAll("\u00EF" , "i");
        str = str.replaceAll("\u00FC" , "u");

        str = str.replaceAll("-" , "");
        str = setCamelCase(str);
        str = str.replaceAll(" " , "");
        str = fromPluralToSingular(str);

        return str;
    }

    private String fromPluralToSingular(final String str) {
        String result = str;

        /** 5 letters */
        if (str.endsWith("aiten")) {
            return str.replaceAll("aiten", "aiet");
        }

        if (str.endsWith("einen")) {
            return str.replaceAll("einen", "ein");
        }

        if (str.endsWith("ieten")) {
            return str.replaceAll("ieten", "iet");
        }

        /** 4 letters */
        if (str.endsWith("anen")) {
            return str.replaceAll("anen", "aan");
        }

        if (str.endsWith("eten")) {
            return str.replaceAll("eten", "eet");
        }

        if (str.endsWith("then")) {
            return str.replaceAll("then", "th");
        }

        /** 3 letters */
        if (str.endsWith("ers")) {
            return str.replaceAll("ers", "er");
        }

        if (str.endsWith("zen")) {
            return str.replaceAll("zen", "s");
        }

        return str;
    }

    private String setCamelCase(final String s) {
        String result = "";

        char previousChar = '.';
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ') {
                String str = "" + currentChar;
                result += (previousChar == ' ') ? str.toUpperCase() : str;
            }
            previousChar = currentChar;

        }

        return result;
    }
}


