package rb.hsv.appendix.ccd;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static rb.hsv.appendix.Util.removeZero;

@Getter
@Setter
public class Ref {

    private String keyArg;
    private String argument;
    private String filename;
    private String verse;
    private int indexLine;
    private int nrOfArgsInLine;
    private List<String> argList;
    private boolean isSamengesteldWerkwoord;

    public static final boolean DEV_MODE = true;
    public static final boolean SHOW_ARG_LINE = false;
    public static final boolean SHOW_BIJLAGE_LINKS = false;
    public static final String ZIE_BF = "zie bf";
    public static final String ZIE_CM = "zie cm";
    public static final String ZIE_GD = "zie gd";
    public static final String ZIE_MD = "zie md";
    public static final String ZIE_MG = "zie mg";
    public static final String ZIE_ML = "zie ml";
    public static final String ZIE_MM = "zie mm";
    public static final String ZIE_MS = "zie ms";
    public static final String ZIE_OF = "zie of";
    public static final String ZIE_WB = "zie wb";


    public static final String CCD_CONTENT_DIR = "C:\\Temp\\hsv met bijlagen\\concordantie\\content";
    public static final String CCD_OPS_DIR = CCD_CONTENT_DIR + "\\OPS";

    public static final String CONTENT_DIR = "C:\\Temp\\hsv met bijlagen\\content";
    //public static  final String OPS_DIR = CONTENT_DIR + "\\OPS";

    public final static String OPEN_CON_SPAN = "<span class=\"con\">";
    public final static String CLOSE_CON_SPAN = "</span>";
    public final static String OPEN_ITALIC = "<i>";
    public final static String CLOSE_ITALIC = "</i>";
    public final static String OPEN_A_TAG = "\">";
    public final static String CLOSE_A_TAG = "</a>";
    public final static String CLOSE_P_TAG = "</p>";
    public final static String HREF_IS_NOTE = "<a href=\"#note\">";
    public final static String CLOSE_SUP_TAG = "</sup></a>";
    public final static String HREF = "href=\"";
    public final static String BEFORE_WB = ".html#";
    public final static String AFTER_WB = "\">";
    public final static String FOOTNOTE = "<p class=\"footnote";
    public final static String PERICOPE = "<h3 class=\"pericope\">";
    public final static String NEW_LINE = "<br/>";
    public final static String SPAN = "span";
    public final static String OPEN_TAG = "<";
    public final static String CLOSE_TAG = "</";
    public final static String POETRY = "<p class=\"poetry\">";
    public final static String QUOTE_OPEN = "&#8216;";
    public final static String QUOTE_CLOSE = "&#8217;";


    public Ref(final String keyArg, final String argument, final String filename, final String verse, final int indexLine, final int nrOfArgsInLine, final boolean isSamengesteldWerkwoord, final ArrayList<String> argList) {
        this.keyArg = keyArg;
        this.argument = argument;
        this.filename = filename;
        this.verse = verse;
        this.indexLine = indexLine;
        this.nrOfArgsInLine = nrOfArgsInLine;
        this.isSamengesteldWerkwoord = isSamengesteldWerkwoord;
        this.argList = argList;
    }

    public File getFile() {
        return Paths.get(CCD_OPS_DIR, filename).toFile();
    }

    public String getFileRef() {
        return filename + "#vs" + removeZero(verse);
    }

    public String getTextRef() {
        int pos1 = filename.indexOf("-")+1;
        int pos2 = filename.indexOf(".");
        String cap = removeZero(filename.substring(pos1, pos2));
        return cap + ":" + removeZero(verse);
    }
}
