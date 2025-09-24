package rb.hsv.appendix.ccd.valid.util;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class ValidUtil {
    public static boolean IS_TOO_MUCH = false;
    public static boolean IS_NOT_FOUND = false;

    public static boolean isNotValidBeforeWord(final String arg, final @NotNull String line, final String beforeWord) {
        var before = line.substring(0, line.indexOf(arg)).trim();
        return !before.endsWith(beforeWord);
    }

    public static boolean isNotValidNextWord(final String arg, final @NotNull String line, final String nextWord) {
        var after = line.substring(line.indexOf(arg)+arg.length()+1);
        return !after.startsWith(nextWord);
    }

    public static boolean isValidVerse(final File curFile, final String vs, final String html, final @NotNull String arg, final String curArg) {
        if (arg.equals(curArg)) {
            return isValidVerse(curFile, vs, html);
        }

        return false;
    }

    public static boolean isValidVerse(final File curFile, final String vs, final @NotNull String html) {
        if (html.isEmpty()) {
            return false;
        }
        var curVerse1 = curFile.getName() + "#vs" + vs;
        var htmlFilename = html.split("#")[0];
        if (!isValidBookname(htmlFilename)) {
            throw new RuntimeException("Verkeerde bestandsnaam " + htmlFilename);
        }
        var htmlVs = checkVerse(html.split("#")[1]);
        if (htmlFilename.startsWith("/") || !htmlVs.startsWith("vs") || htmlVs.endsWith("vs")) {
            throw new RuntimeException("Verkeerde opmaak van html-filename " + html);
        }
        var curVerse2 = htmlFilename + "#" + htmlVs;
        return curVerse1.equals(curVerse2);
    }

    public static boolean isValidVerse(final @NotNull File curFile, final String vs, final @NotNull String html, final int... verses) {
        var isValid = false;
        var curVerse1 = curFile.getName() + "#vs" + vs;
        var allVerses = verses;
        String htmlFilename;

        if (!html.contains("html#vs") || html.endsWith("vs")) {
            throw new RuntimeException("Verkeerde opmaak van html-filename " + html);
        }

        if (html.contains("#vs")) {
            var firstVs = Integer.parseInt(html.substring(html.indexOf("#vs")+3));
            var n = verses.length;
            allVerses = new int[n+1];
            allVerses[0] = firstVs;
            System.arraycopy(verses, 0, allVerses, 1, n);
            htmlFilename = html.split("#")[0];
            if (!isValidBookname(htmlFilename)) {
                throw new RuntimeException("Verkeerde bestandsnaam " + htmlFilename);
            }
        } else {
            htmlFilename = html;
        }

        for (int i: allVerses) {
            var htmlVs = checkVerse("vs" + i);
            var curVerse2 = htmlFilename + "#" + htmlVs;
            if (curVerse1.equals(curVerse2)) {
                isValid = true;
                break;
            }
        }
        return isValid;

    }

    private static Boolean isValidBookname(final @NotNull String bookname) {
        boolean isValid = false;
        String filename = bookname.substring(0, bookname.indexOf("-"));

        for (Books book: Books.values()) {
            if (book.value.equals(filename)) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    public static @NotNull String checkVerse(final String htmlVs) {
        StringBuilder vs = new StringBuilder(htmlVs);
        while (vs.length() < 5) {
            vs.insert(2, "0");
        }
        return vs.toString();
    }

    public static boolean isArgumentFromList(String arg, String... values) {
        boolean isFound = false;
        for (int i = 0; i < values.length && !isFound; i++) {
            isFound = values[i].equals(arg);
        }

        return isFound;
    }


    public static boolean isAmen(final @NotNull  String keyArg) {
        return keyArg.equals("Amen");
    }

    public static boolean isAchten(final @NotNull String keyArg, final String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("acht geven")
                || keyArg.equals("acht slaan op")
                || keyArg.equals("hoogachten")
                || keyArg.equals("in acht nemen");

        var isTeCheckenString = keyArg.equals("acht");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("achten")) {
            isValid = arg.equals("acht")
                    || arg.equals("achten")
                    || arg.equals("achtte")
                    || arg.equals("achtten")
                    || arg.equals("geacht");
        }

        return isValid;
    }

    public static boolean isArbeiden(final @NotNull String keyArg) {
        return keyArg.equals("arbeiden")
                || keyArg.equals("arbeid");
    } // isArbeiden

    public static boolean isAntwoorden(final @NotNull String keyArg) {
        return keyArg.equals("antwoorden")
                || keyArg.equals("antwoord");
    } // isArbeiden

    public static boolean isArm(final @NotNull String arg) {
        return arg.equals("arm")
                || arg.equals("arme")
                || arg.equals("armen");
    }

    public static boolean isBalken(final @NotNull String arg) {
        return arg.equals("balk")
                || arg.equals("balken");
    } // isBalken

    public static boolean isBarsten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("losbarsten")
                || keyArg.equals("openbarsten");
        var isTeCheckenString = keyArg.equals("barsten");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBarsten

    public static boolean isBegin(final @NotNull String arg) {
        return arg.equals("begin");
    }

    public static boolean isBergen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opbergen");
        var isTeCheckenString = keyArg.equals("berg")
                || keyArg.equalsIgnoreCase("borg");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBergen

    public static boolean isBericht(final @NotNull String arg) {
        return arg.equals("bericht")
                || arg.equals("berichten");
    }

    public static boolean isBeseffen(final @NotNull String keyArg) {
        return keyArg.equals("beseffen")
                || keyArg.equals("besef");
    } // isBeseffen

    public static boolean isBeslissen(final @NotNull String keyArg) {
        return keyArg.equals("beslissen")
                || keyArg.equals("beslist");
    } // isBeslissen

    public static boolean isBetalen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("terugbetalen")
                || keyArg.equals("uitbetalen");
        var isTeCheckenString = keyArg.equals("betalen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBetalen

    public static boolean isBevelen(final @NotNull String keyArg, final String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanbevelen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("bevel")) {
            isValid = arg.equals("bevelen");
        } else if (keyArg.equals("bevelen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isBezitten(final @NotNull String keyArg) {
        return keyArg.equals("bezitten")
                || keyArg.equals("bezeten")
                || keyArg.equals("bezit")
                || keyArg.equals("erfelijk bezit");
    } // isBezitten

    public static boolean isBezorgen(final @NotNull String keyArg) {
        return keyArg.equals("bezorgen")
                || keyArg.equals("bezorgd");
    } // isBeslissen

    public static boolean isBieden(final @NotNull String keyArg, final String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanbieden");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("bode")) {
            isValid = arg.equals("boden");
        } else if (keyArg.equals("bieden")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isBinden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanbinden")
                || keyArg.equals("ombinden")
                || keyArg.equals("samenbinden")
                || keyArg.equals("vastbinden");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("binden")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isBlazen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opblazen")
                || keyArg.equals("uitblazen")
                || keyArg.equals("wegblazen");
        var isTeCheckenString = keyArg.equals("blazen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBlazen

    public static boolean isBlijven(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("achterblijven")
                || keyArg.equals("afblijven")
                || keyArg.equals("overblijven")
                || keyArg.equals("staande blijven")
                || keyArg.equals("uitblijven")
                || keyArg.equals("wegblijven");

        var isTeCheckenString = keyArg.equals("blijven")
                || keyArg.equals("in leven blijven");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isBouwen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opbouwen")
                || keyArg.equals("uitbouwen");

        var isTeCheckenString = keyArg.equals("bouw");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("bouwen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isBreken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanbreken")
                || keyArg.equals("afbreken")
                || keyArg.equals("doorbreken")
                || keyArg.equals("inbreken")
                || keyArg.equals("losbreken")
                || keyArg.equals("opbreken")
                || keyArg.equals("openbreken")
                || keyArg.equals("stukbreken")
                || keyArg.equals("uitbreken");

        var isTeCheckenString = keyArg.equals("in stukken breken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("breken")) {
            isValid = true;
        }

        return isValid;
    } //isBreken

    public static boolean isBrengen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanbrengen")
                || keyArg.equals("afbrengen")
                || keyArg.equals("bijbrengen")
                || keyArg.equals("bijeenbrengen")
                || keyArg.equals("binnenbrengen")
                || keyArg.equals("doorbrengen")
                || keyArg.equals("grootbrengen")
                || keyArg.equals("meebrengen")
                || keyArg.equals("ombrengen")
                || keyArg.equals("onderbrengen")
                || keyArg.equals("opbrengen")
                || keyArg.equals("overbrengen")
                || keyArg.equals("terechtbrengen")
                || keyArg.equals("terugbrengen")
                || keyArg.equals("teweegbrengen")
                || keyArg.equals("toebrengen")
                || keyArg.equals("uitbrengen")
                || keyArg.equals("volbrengen")
                || keyArg.equals("voortbrengen")
                || keyArg.equals("wegbrengen");

        var isTeCheckenString = keyArg.equals("aan het licht brengen")
                || keyArg.equals("bij elkaar brengen")
                || keyArg.equals("in verwarring brengen")
                || keyArg.equals("om het leven brengen")
                || keyArg.equals("omkeer brengen")
                || keyArg.equals("ten uitvoer brengen")
                || keyArg.equals("ter dood brengen")
                || keyArg.equals("tot stand brengen")
                || keyArg.equals("tot zwijgen brengen")
                || keyArg.equals("verslag uitbrengen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("brengen")) {
            isValid = true;
        }

        return isValid;
    } // isBrengen

    public static boolean isBuigen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afbuigen")
                || keyArg.equals("neerbuigen")
                || keyArg.equals("ombuigen")
                || keyArg.equals("vooroverbuigen");

        var isTeCheckenString = keyArg.equals("boog (kromming)")
                || keyArg.equals("boog (regenboog)")
                || keyArg.equals("boog (wapen)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("buigen")) {
            isValid = true;
        }

        return isValid;
    } // isBuigen

    public static boolean isBuiten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitbuiten");
        var isTeCheckenString = keyArg.equals("buiten")
                || keyArg.equals("buit")
                || keyArg.equals("buiten zinnen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBuiten

    public static boolean isDag(final @NotNull String keyArg) {
        return keyArg.equals("dag")
                || keyArg.equals("een dag")
                || keyArg.equals("twee dagen")
                || keyArg.equals("drie dagen")
                || keyArg.equals("drieënhalve dag")
                || keyArg.equals("vier dagen")
                || keyArg.equals("vijf dagen")
                || keyArg.equals("zes dagen")
                || keyArg.equals("zeven dagen")
                || keyArg.equals("acht dagen")
                || keyArg.equals("tien dagen")
                || keyArg.equals("elf dagen")
                || keyArg.equals("twaalf dagen")
                || keyArg.equals("veertien dagen")
                || keyArg.equals("vijftien dagen")
                || keyArg.equals("twintig dagen")
                || keyArg.equals("eenentwintig dagen")
                || keyArg.equals("dertig dagen")
                || keyArg.equals("drieendertig dagen")
                || keyArg.equals("veertig dagen")
                || keyArg.equals("vijftig dagen")
                || keyArg.equals("tweeenvijftig dagen")
                || keyArg.equals("zesenzestig dagen")
                || keyArg.equals("honderdvijftig dagen")
                || keyArg.equals("honderdtachtig dagen")
                || keyArg.equals("driehonderdnegentig dagen")
                || keyArg.equals("twaalfhonderdzestig dagen")
                || keyArg.equals("duizend tweehonderdnegentig dagen")
                || keyArg.equals("duizend driehonderdvijfendertig dagen")
                || keyArg.equals("eerste dag")
                || keyArg.equals("tweede dag")
                || keyArg.equals("derde dag")
                || keyArg.equals("vierde dag")
                || keyArg.equals("vijfde dag")
                || keyArg.equals("zesde dag")
                || keyArg.equals("zevende dag")
                || keyArg.equals("achtste dag")
                || keyArg.equals("negende dag")
                || keyArg.equals("tiende dag")
                || keyArg.equals("elfde dag")
                || keyArg.equals("twaalfde dag")
                || keyArg.equals("dertiende dag")
                || keyArg.equals("veertiende dag")
                || keyArg.equals("vijftiende dag")
                || keyArg.equals("zestiende dag")
                || keyArg.equals("zeventiende dag")
                || keyArg.equals("eenentwintigste dag")
                || keyArg.equals("drieentwintigste dag")
                || keyArg.equals("vierentwintigste dag")
                || keyArg.equals("vijfentwintigste dag")
                || keyArg.equals("zevenentwintigste dag");
    } // isDag

    public static boolean isDagen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opdagen")
                || keyArg.equals("uitdagen");
        var isTeCheckenString = keyArg.equals("dagen (werkwoord)")
                || keyArg.equals("op dagen komen")
                || keyArg.equals("Oude van dagen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isDagen

    public static boolean isDalen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afdalen")
                || keyArg.equals("neerdalen");

        var isTeCheckenString = keyArg.equals("dal");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("dalen")) {
            isValid = true;
        }

        return isValid;
    } // isDalen

    public static boolean isDekken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afdekken")
                || keyArg.equals("overdekken")
                || keyArg.equals("toedekken");

        var isTeCheckenString = keyArg.equals("dekken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isDekken

    public static boolean isDenken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitdenken");

        var isTeCheckenString = keyArg.equals("denken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isDekken

    public static boolean isDelen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("indelen")
                || keyArg.equals("meedelen")
                || keyArg.equals("toedelen")
                || keyArg.equals("uitdelen");

        var isTeCheckenString = keyArg.equals("delen")
                || keyArg.equals("deel");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    }

    public static boolean isDezelfde(final @NotNull String arg) {
        return arg.equals("Dezelfde");
    }

    public static boolean isDoden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("doodslaan");

        var isTeCheckenString = keyArg.equals("dode")
                || keyArg.equals("dood (bijvoeglijk naamwoord)")
                || keyArg.equals("dood (zelfstandig naamwoord)")
                || keyArg.equals("poorten van de dood")
                || keyArg.equals("rijk van de dood")
                || keyArg.equals("schaduw van de dood")
                || keyArg.equals("ten dode opschrijven")
                || keyArg.equals("ter dood brengen")
                || keyArg.equals("ter dood veroordelen")
                || keyArg.equals("tweede dood");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("doden")) {
            isValid = true;
        }

        return isValid;
    } // isDoden

    public static boolean isDoen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aandoen")
                || keyArg.equals("afdoen")
                || keyArg.equals("dichtdoen")
                || keyArg.equals("dienst doen")
                || keyArg.equals("doen opstaan")
                || keyArg.equals("gestand doen")
                || keyArg.equals("goeddoen")
                || keyArg.equals("goeds doen")
                || keyArg.equals("kwaaddoen")
                || keyArg.equals("kwaads doen")
                || keyArg.equals("omdoen")
                || keyArg.equals("onrecht doen")
                || keyArg.equals("opendoen")
                || keyArg.equals("recht doen")
                || keyArg.equals("tekortdoen")
                || keyArg.equals("tenietdoen")
                || keyArg.equals("uitdoen")
                || keyArg.equals("verzoening doen")
                || keyArg.equals("wegdoen")
                || keyArg.equals("weldoen")
                || keyArg.equals("zaken doen");

        var isTeCheckenString = keyArg.equals("goed aan doen")
                || keyArg.equals("te goed doen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("doen")) {
            isValid = true;
        }

        return isValid;
    } // isDoen

    public static boolean isDragen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aandragen")
                || keyArg.equals("afdragen")
                || keyArg.equals("bijdragen")
                || keyArg.equals("opdragen")
                || keyArg.equals("overdragen")
                || keyArg.equals("ronddragen")
                || keyArg.equals("uitdragen")
                || keyArg.equals("voordragen")
                || keyArg.equals("vruchtdragen")
                || keyArg.equals("wegdragen")
                || keyArg.equals("zorgdragen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("dragen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isDrijven(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aandrijven")
                || keyArg.equals("bij elkaar drijven")
                || keyArg.equals("bijeendrijven")
                || keyArg.equals("handeldrijven")
                || keyArg.equals("in het nauw drijven")
                || keyArg.equals("spot drijven")
                || keyArg.equals("terugdrijven")
                || keyArg.equals("uitdrijven")
                || keyArg.equals("uiteendrijven")
                || keyArg.equals("wegdrijven");
        var isTeCheckenString = keyArg.equals("drijven")
                || keyArg.equals("gedreven");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isDrijven

    public static boolean isDringen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aandringen")
                || keyArg.equals("binnendringen")
                || keyArg.equals("doordringen")
                || keyArg.equals("terugdringen");

        var isTeCheckenString = keyArg.equals("dringen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    }

    public static boolean isDrinken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("indrinken");
        var isTeCheckenString = keyArg.equals("drinken")
                || keyArg.equals("dronken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isBarsten

    public static boolean isDwalende(final @NotNull String arg) {
        return arg.equals("dwalende");
    }

    public static boolean isEed(final @NotNull String keyArg, final @NotNull String arg) {
        return keyArg.equals("eed")
                && arg.equals("eden");
    }

    public static boolean isEer(final @NotNull String keyArg, final @NotNull String arg) {
        if (keyArg.equals("eer geven")) {
            return false;
        }
        return arg.equalsIgnoreCase("eer");
    }

    public static boolean isEnige(final @NotNull String arg) {
        return arg.equalsIgnoreCase("enige");
    }

    public static boolean isEten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opeten");

        var isTeCheckenString = keyArg.equals("eten (zelfstandig naamwoord)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("eten (werkwoord)")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isGaan(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("achternagaan")
                || keyArg.equals("binnengaan")
                || keyArg.equals("doorgaan")
                || keyArg.equals("heengaan")
                || keyArg.equals("langsgaan")
                || keyArg.equals("meegaan")
                || keyArg.equals("nagaan")
                || keyArg.equals("omgaan")
                || keyArg.equals("omhooggaan")
                || keyArg.equals("omlaaggaan")
                || keyArg.equals("opgaan")
                || keyArg.equals("rondgaan")
                || keyArg.equals("tekeergaan")
                || keyArg.equals("teruggaan")
                || keyArg.equals("verdergaan")
                || keyArg.equals("voorbijgaan")
                || keyArg.equals("voorgaan")
                || keyArg.equals("voortgaan")
                || keyArg.equals("weggaan");

        var isTeCheckenString = keyArg.equals("door het vuur gaan")
                || keyArg.equals("te boven gaan")
                || keyArg.equals("te gronde gaan")
                || keyArg.equals("te ruste gaan")
                || keyArg.equals("ten onder gaan");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("gaan")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isGebieden(final @NotNull String keyArg) {
        var isValid = false;

        var isTeCheckenString = keyArg.equals("gebied")
                || keyArg.equals("gebod");

        if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("gebieden")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isGelegen(final @NotNull String keyArg) {
        return keyArg.equals("gelegen");
    }

    public static boolean isGevangen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("gevangennemen")
                || keyArg.equals("gevangenzitten");

        var isTeCheckenString = keyArg.equals("gevangen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    } // isGevangen

    public static boolean isGeven(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanleiding geven")
                || keyArg.equals("aanstoot geven")
                || keyArg.equals("aanzien geven")
                || keyArg.equals("antwoord geven")
                || keyArg.equals("bevel geven")
                || keyArg.equals("de borst geven")
                || keyArg.equals("de geest geven")
                || keyArg.equals("doorgeven")
                || keyArg.equals("eer geven")
                || keyArg.equals("gehoor geven")
                || keyArg.equals("genade geven")
                || keyArg.equals("getuigenis geven")
                || keyArg.equals("in bewaring geven")
                || keyArg.equals("inzicht geven")
                || keyArg.equals("leiding geven")
                || keyArg.equals("licht geven")
                || keyArg.equals("meegeven")
                || keyArg.equals("onderricht geven")
                || keyArg.equals("onderwijs geven")
                || keyArg.equals("opdracht geven")
                || keyArg.equals("opgeven")
                || keyArg.equals("overgeven")
                || keyArg.equals("prijsgeven")
                || keyArg.equals("raad geven")
                || keyArg.equals("ruimte geven")
                || keyArg.equals("rust geven")
                || keyArg.equals("te kennen geven")
                || keyArg.equals("teruggeven")
                || keyArg.equals("uitleg geven")
                || keyArg.equals("vrucht geven")
                || keyArg.equals("weggeven")
                || keyArg.equals("zegen geven");

        var isTeCheckenString = keyArg.equals("geven")
                || keyArg.equals("gaaf")
                || keyArg.equals("gave")
                || keyArg.equals("ten huwelijk geven");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isGeven

    public static boolean isGooien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("weggooien");
        var isTeCheckenString = keyArg.equals("gooien");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isGooien

    public static boolean isGrijpen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aangrijpen")
                || keyArg.equals("ingrijpen")
                || keyArg.equals("moed grijpen")
                || keyArg.equals("vastgrijpen");
        var isTeCheckenString = keyArg.equals("grijpen")
                || keyArg.equals("greep");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isGrijpen

    public static boolean isGroeien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aangroeien")
                || keyArg.equals("opgroeien");

        var isTeCheckenString = keyArg.equals("groei (zelfstandig naamwoord)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("groeien")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isGroot(final @NotNull String keyArg) {
        return keyArg.equals("groot")
                || keyArg.equals("grote (zelfstandig naamwoord)")
                || keyArg.equals("Grote Beer")
                || keyArg.equals("grote Naam")
                || keyArg.equals("grote teen")
                || keyArg.equals("Grote Zee")
                || keyArg.equals("groten der aarde")
                || keyArg.equals("in groten getale");
    } // isGroot

    public static boolean isHaar(final @NotNull String keyArg) {
        return keyArg.equals("haar");
    } // isHaar

    public static boolean isHalen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afhalen")
                || keyArg.equals("binnenhalen")
                || keyArg.equals("eruit halen")
                || keyArg.equals("inhalen")
                || keyArg.equals("leeghalen")
                || keyArg.equals("neerhalen")
                || keyArg.equals("omverhalen")
                || keyArg.equals("ophalen")
                || keyArg.equals("overhalen")
                || keyArg.equals("terughalen")
                || keyArg.equals("tevoorschijn halen")
                || keyArg.equals("weghalen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("halen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isHakken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afhakken")
                || keyArg.equals("omhakken")
                || keyArg.equals("uithakken");

        var isTeCheckenString = keyArg.equals("in stukken hakken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("hakken")) {
            isValid = true;
        }

        return isValid;
    } // isHakken

    public static boolean isHandelen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afhandelen");
        var isTeCheckenString = keyArg.equals("handelen")
                || keyArg.equals("handel");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHandelen

    public static boolean isHebben(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("deelhebben")
                || keyArg.equals("leiding hebben")
                || keyArg.equals("liefhebben")
                || keyArg.equals("plaatshebben");


        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("hebben")) {
            isValid = true;
        }

        return isValid;
    } // isHebben

    public static boolean isHeffen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanheffen")
                || keyArg.equals("omhoogheffen")
                || keyArg.equals("opheffen");

        var isTeCheckenString = keyArg.equals("aanhef")
                || keyArg.equals("heft");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("heffen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isHoofd(final @NotNull String keyArg) {
        return keyArg.equals("Hoofd")
                || keyArg.equals("hoofd (hoogste of voorste deel)")
                || keyArg.equals("hoofd (leider)")
                || keyArg.equals("hoofd (lichaamsdeel)");
    } // isHoofd

    public static boolean isHopen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("ophopen");

        var isTeCheckenString = keyArg.equals("hoop (berg)")
                || keyArg.equals("hoop (veel)")
                || keyArg.equals("hoop (verwachting)")
                || keyArg.equals("hopen (stapelen)")
                || keyArg.equals("te hoop lopen")
                || keyArg.equals("wanhoop")
                || keyArg.equals("wanhopen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("hopen (verwachten)")) {
            isValid = true;
        }

        return isValid;
    } // isHopen

    public static boolean isHoren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aanhoren");
        var isTeCheckenString = keyArg.equals("horen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHoren

    public static boolean isHouden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanhouden")
                || keyArg.equals("achterhouden")
                || keyArg.equals("afhouden")
                || keyArg.equals("bezighouden")
                || keyArg.equals("bijeenhouden")
                || keyArg.equals("geheim houden")
                || keyArg.equals("gereedhouden")
                || keyArg.equals("gevangen houden")
                || keyArg.equals("houden aan")
                || keyArg.equals("inhouden")
                || keyArg.equals("oog gericht houden op")
                || keyArg.equals("ophouden")
                || keyArg.equals("overhouden")
                || keyArg.equals("rekening houden met")
                || keyArg.equals("staande houden")
                || keyArg.equals("standhouden")
                || keyArg.equals("tegenhouden")
                || keyArg.equals("toezicht houden")
                || keyArg.equals("vasthouden")
                || keyArg.equals("ver houden van")
                || keyArg.equals("volhouden")
                || keyArg.equals("voor [iets] houden")
                || keyArg.equals("voorhouden")
                || keyArg.equals("woord houden")
                || keyArg.equals("zitting houden");

        var isTeCheckenString = keyArg.equals("de wacht houden")
                || keyArg.equals("inhoud")
                || keyArg.equals("in bedwang houden")
                || keyArg.equals("in bewaring houden")
                || keyArg.equals("in ere houden")
                || keyArg.equals("in gedachten houden")
                || keyArg.equals("in het oog houden")
                || keyArg.equals("in leven houden")
                || keyArg.equals("in stand houden")
                || keyArg.equals("in toom houden");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("houden")) {
            isValid = true;
        }

        return isValid;
    } // isHouden

    public static boolean isHouwen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uithouwen");
        var isTeCheckenString = keyArg.equals("houwen")
                || keyArg.equals("in stukken houwen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHouwen

    public static boolean isHuren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("inhuren");
        var isTeCheckenString = keyArg.equals("huren")
                || keyArg.equals("huur");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHuren

    public static boolean isHuwelijk(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uithuwlijken");
        var isTeCheckenString = keyArg.equals("huwelijk");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHuwelijk

    public static boolean isIemand(final @NotNull String arg) {
        return arg.equals("Iemand");
    }

    public static boolean isJagen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanjagen")
                || keyArg.equals("najagen")
                || keyArg.equals("opjagen")
                || keyArg.equals("voortjagen")
                || keyArg.equals("wegjagen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("jagen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isKeren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afkeren")
                || keyArg.equals("omkeren")
                || keyArg.equals("ondersteboven keren")
                || keyArg.equals("tegen [iets] keren")
                || keyArg.equals("terugkeren")
                || keyArg.equals("toekeren")
                || keyArg.equals("uitkeren");

        var isTeCheckenString = keyArg.equals("afkeer")
                || keyArg.equals("keer")
                || keyArg.equals("omkeer")
                || keyArg.equals("terugkeer");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("keren")) {
            isValid = true;
        }

        return isValid;
    } // isKeren

    public static boolean isKiezen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitkiezen");
        var isTeCheckenString = keyArg.equals("kiezen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isKiezen

    public static boolean isKijken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aankijken")
                || keyArg.equals("nakijken")
                || keyArg.equals("neerkijken")
                || keyArg.equals("omkijken")
                || keyArg.equals("om zich heen kijken")
                || keyArg.equals("opkijken")
                || keyArg.equals("rondkijken")
                || keyArg.equals("toekijken")
                || keyArg.equals("uitkijken");
        var isTeCheckenString = keyArg.equals("kijken")
                || keyArg.equals("te kijk zetten")
                || keyArg.equals("uitkijk");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isKijken

    public static boolean isKleden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitkleden");
        var isTeCheckenString = keyArg.equals("kleden")
                || keyArg.equals("kleed");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isKleden

    public static boolean isKlein(final @NotNull String keyArg) {
        return keyArg.equals("klein")
                || keyArg.equals("kleine (zelfstandig naamwoord)");
    } // isKlein

    public static boolean isKlimmen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("binnenklimmen")
                || keyArg.equals("opklimmen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("klimmen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isKloven(final @NotNull String keyArg) {
        return keyArg.equals("kloof")
                || keyArg.equals("kloven");
    } // isKloven

    public static boolean isKnielen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("neerknielen");

        var isTeCheckenString = keyArg.equals("geknield");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("knielen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isKomen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aankomen")
                || keyArg.equals("achternakomen")
                || keyArg.equals("afkomen")
                || keyArg.equals("bijeenkomen")
                || keyArg.equals("binnenkomen")
                || keyArg.equals("einde komen aan")
                || keyArg.equals("langskomen")
                || keyArg.equals("meekomen")
                || keyArg.equals("nakomen")
                || keyArg.equals("nabijkomen")
                || keyArg.equals("naderbijkomen")
                || keyArg.equals("neerkomen")
                || keyArg.equals("omkomen")
                || keyArg.equals("opkomen")
                || keyArg.equals("overkomen")
                || keyArg.equals("overeenkomen")
                || keyArg.equals("samenkomen")
                || keyArg.equals("tegemoetkomen")
                || keyArg.equals("tegenkomen")
                || keyArg.equals("tekortkomen")
                || keyArg.equals("terugkomen")
                || keyArg.equals("thuiskomen")
                || keyArg.equals("toekomen")
                || keyArg.equals("uitkomen")
                || keyArg.equals("voorbijkomen")
                || keyArg.equals("voortkomen")
                || keyArg.equals("vooruitkomen")
                || keyArg.equals("vrijkomen");

        var isTeCheckenString = keyArg.equals("in aanraking komen")
                || keyArg.equals("in opstand komen")
                || keyArg.equals("kom")
                || keyArg.equals("naar voren komen")
                || keyArg.equals("onder ogen komen")
                || keyArg.equals("op adem komen")
                || keyArg.equals("te boven komen")
                || keyArg.equals("te hulp komen")
                || keyArg.equals("te weten komen")
                || keyArg.equals("ten goede komen")
                || keyArg.equals("ten val komen")
                || keyArg.equals("tot geloof komen")
                || keyArg.equals("tot inzicht komen")
                || keyArg.equals("tot rust komen")
                || keyArg.equals("tot stand komen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("komen")) {
            isValid = true;
        }

        return isValid;
    } // isKomen

    public static boolean isKosten(final @NotNull String keyArg) {
        return keyArg.equals("kost")
                || keyArg.equals("kosten");
    } // isKosten

    public static boolean isKrijgen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("deel krijgen")
                || keyArg.equals("klaarkrijgen")
                || keyArg.equals("overhand krijgen")
                || keyArg.equals("terugkrijgen")
                || keyArg.equals("vat krijgen")
                || keyArg.equals("weet krijgen");
        var isTeCheckenString = keyArg.equals("krijgen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isKrijgen

    public static boolean isKussen(final @NotNull String keyArg) {
        var isValid = false;

        var isTeCheckenString = keyArg.equals("kus")
                || keyArg.equals("kussen (zelfstandig naamwoord)")
                || keyArg.equals("kust");

        if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("kussen (werkwoord)")) {
            isValid = true;
        }

        return isValid;
    } // isKussen

    public static boolean isLaten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("achterlaten")
                || keyArg.equals("inlaten")
                || keyArg.equals("loslaten")
                || keyArg.equals("nalaten")
                || keyArg.equals("neerlaten")
                || keyArg.equals("openlaten")
                || keyArg.equals("overlaten")
                || keyArg.equals("toelaten")
                || keyArg.equals("vrijlaten");

        var isTeCheckenString = keyArg.equals("in de steek laten")
                || keyArg.equals("in leven laten")
                || keyArg.equals("laat")
                || keyArg.equals("met rust laten");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("laten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLeggen(final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanleggen")
                || keyArg.equals("afleggen")
                || keyArg.equals("beslag leggen")
                || keyArg.equals("blootleggen")
                || keyArg.equals("droogleggen")
                || keyArg.equals("eed afleggen")
                || keyArg.equals("gelofte afleggen")
                || keyArg.equals("in de mond leggen")
                || keyArg.equals("getuigenis afleggen")
                || keyArg.equals("klaarleggen")
                || keyArg.equals("neerleggen")
                || keyArg.equals("opleggen")
                || keyArg.equals("opzijleggen")
                || keyArg.equals("overleggen")
                || keyArg.equals("terugleggen")
                || keyArg.equals("toeleggen")
                || keyArg.equals("uitleggen")
                || keyArg.equals("vastleggen")
                || keyArg.equals("verantwoording afleggen")
                || keyArg.equals("voorleggen")
                || keyArg.equals("weerleggen")
                || keyArg.equals("wegleggen");

        var isTeCheckenString = (keyArg.equals("overleg") || arg.equals("overleg"))
                || (keyArg.equals("uitleg") || arg.equals("uitleg"))
                || keyArg.equals("te ruste leggen")
                || keyArg.equals("te slapen leggen")
                || keyArg.equals("ten grondslag leggen")
                || keyArg.equals("ten laste leggen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("leggen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLeiden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitleiden")
                || keyArg.equals("voorleiden")
                || keyArg.equals("wegleiden");
        var isTeCheckenString = keyArg.equals("leiden");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isLeiden

    public static boolean isLeren(final @NotNull String keyArg) {
        var isValid = false;

        var isTeCheckenString = keyArg.equals("gezonde leer")
                || keyArg.equals("leer (onderwijs)")
                || keyArg.equals("leer (stof)")
                || keyArg.equals("wind van leer");

        if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("leren")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLeven(final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("naleven");
        var isTeCheckenString = keyArg.equals("leven")
                || arg.equals("Leven");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    }

    public static boolean isLeveren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afleveren")
                || keyArg.equals("bewijs leveren")
                || keyArg.equals("overleveren")
                || keyArg.equals("uitleveren");

        var isTeCheckenString = keyArg.equals("lever");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("leveren")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLezen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aflezen")
                || keyArg.equals("voorlezen");
        var isTeCheckenString = keyArg.equals("lezen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isHoren

    public static boolean isLichten(final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("anker lichten")
                || keyArg.equals("inlichten")
                || keyArg.equals("oplichten");

        var isTeCheckenString = arg.equals("Licht")
                || keyArg.equals("licht (niet donker)")
                || keyArg.equals("licht (niet zwaar)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("lichten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLiggen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanliggen")
                || keyArg.equals("gereedliggen")
                || keyArg.equals("neerliggen")
                || keyArg.equals("openliggen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("liggen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLikken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("oplikken");
        var isTeCheckenString = keyArg.equals("likken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isLikken

    public static boolean isLinker(final @NotNull String keyArg, final @NotNull String arg) {
        if (keyArg.startsWith("linker")) {
            return arg.equals("linker");
        }
        return false;
    }

    public static boolean isLopen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanlopen")
                || keyArg.equals("achter [iemand] aan lopen")
                || keyArg.equals("achternalopen")
                || keyArg.equals("achteruitlopen")
                || keyArg.equals("binnenlopen")
                || keyArg.equals("gevaar lopen")
                || keyArg.equals("hardlopen")
                || keyArg.equals("meelopen")
                || keyArg.equals("nalopen")
                || keyArg.equals("oplopen")
                || keyArg.equals("overlopen")
                || keyArg.equals("rondlopen")
                || keyArg.equals("tegemoetlopen")
                || keyArg.equals("uitlopen")
                || keyArg.equals("voor [iets/iemand] uit lopen")
                || keyArg.equals("voorbijlopen")
                || keyArg.equals("weglopen");

        var isTeCheckenString = keyArg.equals("loop")
                || keyArg.equals("onder de voet lopen")
                || keyArg.equals("op de loop")
                || keyArg.equals("oploop")
                || keyArg.equals("te hoop lopen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("lopen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isLuisteren(final @NotNull String keyArg) {
        return keyArg.equals("luisteren")
                || keyArg.equals("luister");
    } // isLuisteren

    public static boolean isLusten(final @NotNull String keyArg) {
        var isValid = false;

        var isTeCheckenString = keyArg.equals("lust");

        if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("lusten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isMaand(final @NotNull String keyArg) {
        return keyArg.equals("maand")
                || keyArg.equals("een maand")
                || keyArg.equals("twee maanden")
                || keyArg.equals("drie maanden")
                || keyArg.equals("vier maanden")
                || keyArg.equals("vijf maanden")
                || keyArg.equals("zes maanden")
                || keyArg.equals("zeven maanden")
                || keyArg.equals("negen maanden")
                || keyArg.equals("twaalf maanden")
                || keyArg.equals("tweeenveertig maanden")
                || keyArg.equals("eerste maand (abib, nisan)")
                || keyArg.equals("tweede maand (ziv)")
                || keyArg.equals("derde maand (sivan)")
                || keyArg.equals("vierde maand (tammoez)")
                || keyArg.equals("vijfde maand (aaw)")
                || keyArg.equals("zesde maand (elul)")
                || keyArg.equals("zevende maand (ethanim)")
                || keyArg.equals("achtste maand (bul)")
                || keyArg.equals("negende maand (chisleu)")
                || keyArg.equals("tiende maand (tebeth)")
                || keyArg.equals("elfde maand (sjebat)")
                || keyArg.equals("twaalfde maand (adar)");
    } // isMaand

    public static boolean isMaken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("bekendmaken")
                || keyArg.equals("bekwaam maken")
                || keyArg.equals("beschaamd maken")
                || keyArg.equals("duidelijk maken")
                || keyArg.equals("einde maken aan")
                || keyArg.equals("gebruikmaken")
                || keyArg.equals("gelijkmaken")
                || keyArg.equals("gereedmaken")
                || keyArg.equals("gezond maken")
                || keyArg.equals("goedmaken")
                || keyArg.equals("grootmaken")
                || keyArg.equals("haast maken")
                || keyArg.equals("klaarmaken")
                || keyArg.equals("leegmaken")
                || keyArg.equals("levend maken")
                || keyArg.equals("losmaken")
                || keyArg.equals("naam maken")
                || keyArg.equals("natmaken")
                || keyArg.equals("onderscheid maken")
                || keyArg.equals("openbaar maken")
                || keyArg.equals("opmaken")
                || keyArg.equals("overvloedig maken")
                || keyArg.equals("plaatsmaken")
                || keyArg.equals("rechtmaken")
                || keyArg.equals("ruzie maken")
                || keyArg.equals("sterk maken")
                || keyArg.equals("vastmaken")
                || keyArg.equals("volkomen maken")
                || keyArg.equals("vrijmaken")
                || keyArg.equals("zalig maken");

        var isTeCheckenString = keyArg.equals("met de grond gelijkmaken")
                || keyArg.equals("te gelde maken")
                || keyArg.equals("tot leugenaar maken")
                || keyArg.equals("tot slaaf maken")
                || keyArg.equals("tot zonde maken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("maken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isMeer(final @NotNull String keyArg) {
        return keyArg.equals("meer")
                || keyArg.equals("meer (wateroppervlak)");
    } // isMeer

    public static boolean isMens(final @NotNull String arg) {
        return arg.equals("Mens");
    }

    public static boolean isMerken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opmerken");
        var isTeCheckenString = keyArg.equals("merken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isMerken

    public static boolean isMunt(final @NotNull String keyArg) {
        return keyArg.equals("munt (geldstuk)")
                || keyArg.equals("munt (plant)");
    }

    public static boolean isMeten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afmatten")
                || keyArg.equals("afmeten")
                || keyArg.equals("opmeten");

        var isTeCheckenString = keyArg.equals("maat");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("meten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isNemen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aannemen")
                || keyArg.equals("afnemen")
                || keyArg.equals("deelnemen")
                || keyArg.equals("eed afnemen")
                || keyArg.equals("gevangennemen")
                || keyArg.equals("innemen")
                || keyArg.equals("meenemen")
                || keyArg.equals("opnemen")
                || keyArg.equals("overnemen")
                || keyArg.equals("plaatsnemen")
                || keyArg.equals("terugnemen")
                || keyArg.equals("toenemen")
                || keyArg.equals("voornemen")
                || keyArg.equals("waarnemen")
                || keyArg.equals("wegnemen");

        var isTeCheckenString = keyArg.equals("nemen")
                || keyArg.equals("in acht nemen")
                || keyArg.equals("ten huwelijk nemen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    }

    public static boolean isNet(final @NotNull String keyArg) {
        return keyArg.equals("net (bijwoord)")
                || keyArg.equals("net (zelfstandig naamwoord)");
    }

    public static boolean isNodigen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitnodigen");
        var isTeCheckenString = keyArg.equals("nodigen")
                || keyArg.equals("nodig");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isNodigen

    public static boolean isOefenen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitoefenen")
                || keyArg.equals("wraak oefenen");
        var isTeCheckenString = keyArg.equals("oefenen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    }

    public static boolean isOntvangen(final @NotNull String keyArg) {
        return keyArg.equals("ontvangen")
                || (keyArg.equals("onderwijs ontvangen"));
    } // isOntvangen

    public static boolean isOntzetten(final @NotNull String keyArg) {
        return keyArg.equals("ontzet")
                || (keyArg.equals("ontzetten"));
    } // isOntzetten

    public static boolean isPakken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("beetpakken")
                || keyArg.equals("oppakken")
                || keyArg.equals("vastpakken");

        var isTeCheckenString = keyArg.equals("pakken")
                || keyArg.equals("pak");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isPakken

    public static boolean isPlaatsen(final @NotNull String keyArg) {
        return keyArg.equals("plaatsen");
    } // isPlaatsen

    public static boolean isPlanten(final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("voortplanten");

        var isTeCheckenString = keyArg.equals("planten")
                || arg.equals("Plant")
                || keyArg.equals("plant");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isPlanten

    public static boolean isPlukken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afplukken")
                || keyArg.equals("leegplukken")
                || keyArg.equals("uitplukken");
        var isTeCheckenString = keyArg.equals("plukken")
                || keyArg.equals("verderf zaaien");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isPlukken

    public static boolean isPriester(final @NotNull String arg) {
        return arg.equals("Priester");
    } // isPriester

    public static boolean isPutten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("uitputten")
                || keyArg.equals("put van de afgrond")
                || keyArg.equals("put van het verderf");

        var isTeCheckenString = keyArg.equals("putten")
                || keyArg.equals("put");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isPutten

    public static boolean isRaden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aanraden");
        var isTeCheckenString = keyArg.equals("raad (advies)")
                || keyArg.equals("raad (gezaghebbers)");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isGooien

    public static boolean isRaken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanraken")
                || keyArg.equals("losraken")
                || keyArg.equals("opraken")
                || keyArg.equals("zoekraken");

        var isTeCheckenString = keyArg.equals("in verwarring raken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("raken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRapen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("bijeenrapen")
                || keyArg.equals("oprapen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("rapen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRechter(final @NotNull String arg) {
        return arg.equals("rechter-");
    } // isRechter

    public static boolean isRichten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("blik richten op")
                || keyArg.equals("aanrichten")
                || keyArg.equals("gericht oefenen")
                || keyArg.equals("hart richten op")
                || keyArg.equals("oog richten op")
                || keyArg.equals("oor richten op")
                || keyArg.equals("oprichten")
                || keyArg.equals("richten op");

        var isTeCheckenString = keyArg.equals("gericht")
                || keyArg.equals("onderricht")
                || keyArg.equals("onderrichten")
                || keyArg.equals("te gronde richten");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("richten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRijden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("wegrijden");
        var isTeCheckenString = keyArg.equals("rijden")
                || (keyArg.equals("reden"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isRoven

    public static boolean isRijzen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("oprijzen");
        var isTeCheckenString = keyArg.equals("rijzen")
                || keyArg.equals("te berge rijzen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isRijzen

    public static boolean isRoepen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanroepen")
                || keyArg.equals("afroepen")
                || keyArg.equals("bijeenroepen")
                || keyArg.equals("naroepen")
                || keyArg.equals("oproepen")
                || keyArg.equals("samenroepen")
                || keyArg.equals("uitroepen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("roep")) {
            isValid = true;
        } else if (keyArg.equals("roepen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRollen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("oprollen")
                || keyArg.equals("wegrollen");

        var isTeCheckenString = keyArg.equals("rol");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("rollen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRoven(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("leegroven")
                || keyArg.equals("wegroven");
        var isTeCheckenString = keyArg.equals("roven")
                || (keyArg.equals("roof"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isRoven

    public static boolean isRuilen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("inruilen")
                || keyArg.equals("omruilen");

        var isTeCheckenString = keyArg.equals("in ruil voor")
                || keyArg.equals("ruil");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("ruilen")) {
            isValid = true;
        }

        return isValid;
    } // isRuilen

    public static boolean isRukken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afrukken")
                || keyArg.equals("losrukken")
                || keyArg.equals("oprukken")
                || keyArg.equals("uiteenrukken")
                || keyArg.equals("uitrukken")
                || keyArg.equals("wegrukken");

        var isTeCheckenString = keyArg.equals("ruk");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("rukken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isRusten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("toerusten")
                || keyArg.equals("uitrusten");

        var isTeCheckenString = keyArg.equals("rusten")
                || keyArg.equals("gerust")
                || keyArg.equals("rust");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isRusten

    public static boolean isScheiden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afscheiden")
                || keyArg.equals("vaneenscheiden");
        var isTeCheckenString = keyArg.equals("scheiden")
                || keyArg.equals("afscheid");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isScheiden

    public static boolean isScheren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afscheren")
                || keyArg.equals("kaalscheren");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("scheren")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSchorten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opschorten");
        var isTeCheckenString = keyArg.equals("schorten")
                || keyArg.equals("schort");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    }

    public static boolean isSchreeuwen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("uitschreeuwen");

        var isTeCheckenString = keyArg.equals("schreeuwen")
                || keyArg.equals("schreeuw");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isSchreeuwen

    public static boolean isSchrijven(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("inschrijven")
                || keyArg.equals("opschrijven")
                || keyArg.equals("toeschrijven")
                || keyArg.equals("voorschrijven");

        var isTeCheckenString = keyArg.equals("geschreven (bijvoeglijk naamwoord)")
                || keyArg.equals("schrijven (zelfstandig naamwoord)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("schrijven (werkwoord)")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSchudden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afschudden")
                || keyArg.equals("leegschudden")
                || keyArg.equals("uitschudden");
        var isTeCheckenString = keyArg.equals("schudden");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isSchudden

    public static boolean isSchuilen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("samenscholen")
                || keyArg.equals("schuilgaan")
                || keyArg.equals("schuilhouden");

        var isTeCheckenString = keyArg.equals("schuilen")
                || keyArg.equals("school")
                || keyArg.equals("schuil");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isSchuilen

    public static boolean isSikkel(final @NotNull String keyArg) {
        return keyArg.equals("sikkel (gereedschap)");
    } // isSikkel

    public static boolean isSlaan(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afslaan")
                || keyArg.equals("alarm slaan")
                || keyArg.equals("bres slaan")
                || keyArg.equals("doodslaan")
                || keyArg.equals("hand slaan aan")
                || keyArg.equals("kamp opslaan")
                || keyArg.equals("losslaan")
                || keyArg.equals("neerslaan")
                || keyArg.equals("oog opslaan")
                || keyArg.equals("openslaan")
                || keyArg.equals("opslaan")
                || keyArg.equals("overslaan")
                || keyArg.equals("platslaan")
                || keyArg.equals("stukslaan")
                || keyArg.equals("toeslaan");

        var isTeCheckenString = keyArg.equals("gade slaan")
                || keyArg.equals("in stukken slaan")
                || keyArg.equals("met de ban slaan");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("slaan")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSlagen(final @NotNull String keyArg) {
        return keyArg.equals("slagen")
                || keyArg.equals("slag");
    } // isSlagen

    public static boolean isSlapen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("in slaap vallen");

        var isTeCheckenString = keyArg.equals("slapen")
                || keyArg.equals("slaap");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isSlapen

    public static boolean isSlepen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("meeslepen")
                || keyArg.equals("wegslepen");
        var isTeCheckenString = keyArg.equals("slepen")
                || keyArg.equals("slijpen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isSlepen

    public static boolean isSluiten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aansluiten")
                || keyArg.equals("afsluiten")
                || keyArg.equals("insluiten")
                || keyArg.equals("ogen sluiten")
                || keyArg.equals("opsluiten")
                || keyArg.equals("toesluiten")
                || keyArg.equals("uitsluiten")
                || keyArg.equals("verbond sluiten")
                || keyArg.equals("verdrag sluiten")
                || keyArg.equals("vrede sluiten");

        var isTeCheckenString = keyArg.equals("gesloten (bijvoeglijk naamwoord)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("sluiten")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSnellen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("toesnellen");

        var isTeCheckenString = keyArg.equals("snellen")
                || keyArg.equals("snel")
                || keyArg.equals("snelle");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isSnellen

    public static boolean isSpannen(final @NotNull String keyArg, final @NotNull String arg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aanspannen")
                || keyArg.equals("inspannen")
                || keyArg.equals("omspannen")
                || keyArg.equals("samenspannen")
                || keyArg.equals("uitspannen");
        var isTeCheckenString = keyArg.equals("spannen")
                || keyArg.equals("gespannen")
                || keyArg.equals("ingespannen")
                || (keyArg.equals("inspannen") && arg.equals("ingespannen"))
                || keyArg.equals("span");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isSpannen

    public static boolean isStammen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afstammen");
        var isTeCheckenString = keyArg.equals("halve stam")
                || keyArg.equals("stam (boomstam)")
                || keyArg.equals("stam (volksstam)");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isStammen

    public static boolean isStoppen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("dichtstoppen")
                || keyArg.equals("toestoppen");
        var isTeCheckenString = keyArg.equals("stoppen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isStoppen

    public static boolean isSporen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aansporen")
                || keyArg.equals("opsporen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("spoor")) {
            isValid = true;
        } else if (keyArg.equals("sporen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSpreken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanspreken")
                || keyArg.equals("afspreken")
                || keyArg.equals("in raadselen spreken")
                || keyArg.equals("juist spreken")
                || keyArg.equals("kwaadspreken")
                || keyArg.equals("naar het hart spreken")
                || keyArg.equals("rechtspreken")
                || keyArg.equals("tegenspreken")
                || keyArg.equals("toespreken")
                || keyArg.equals("uitspreken")
                || keyArg.equals("vrijmoedig spreken")
                || keyArg.equals("vrijuit spreken")
                || keyArg.equals("waarheid spreken")
                || keyArg.equals("weerspreken")
                || keyArg.equals("zaligspreken");

        var isTeCheckenString = keyArg.equals("stof tot spreken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("spreken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSpreiden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitspreiden");
        var isTeCheckenString = keyArg.equals("spreiden");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isSpreiden

    public static boolean isSpringen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opspringen");

        var isTeCheckenString = keyArg.equals("sprong");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("springen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isStaan(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afstaan")
                || keyArg.equals("beschaamd staan")
                || keyArg.equals("bijstaan")
                || keyArg.equals("buitenstaan")
                || keyArg.equals("gereedstaan")
                || keyArg.equals("in aanzien staan")
                || keyArg.equals("in de schuld staan")
                || keyArg.equals("in dienst staan")
                || keyArg.equals("klaarstaan")
                || keyArg.equals("onder leiding staan")
                || keyArg.equals("openstaan")
                || keyArg.equals("opgesteld staan")
                || keyArg.equals("opstaan")
                || keyArg.equals("opstaan tegen")
                || keyArg.equals("stilstaan")
                || keyArg.equals("ter beschikking staan")
                || keyArg.equals("terechtstaan")
                || keyArg.equals("terzijde staan")
                || keyArg.equals("toestaan")
                || keyArg.equals("vaststaan")
                || keyArg.equals("versteld staan")
                || keyArg.equals("weerstaan");

        var isTeCheckenString = keyArg.equals("staan")
                || keyArg.equals("borg staan")
                || keyArg.equals("in bloei staan")
                || keyArg.equals("in de waarheid staan")
                || keyArg.equals("in staat stellen")
                || keyArg.equals("in staat zijn")
                || keyArg.equals("naar het leven staan")
                || keyArg.equals("op het punt staan")
                || keyArg.equals("op wacht staan")
                || keyArg.equals("staat (zelfstandig naamwoord)");
        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isSteken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aansteken")
                || keyArg.equals("doodsteken")
                || keyArg.equals("doorsteken")
                || keyArg.equals("insteken")
                || keyArg.equals("neersteken")
                || keyArg.equals("opsteken")
                || keyArg.equals("omhoogsteken")
                || keyArg.equals("oversteken")
                || keyArg.equals("uitsteken");

        var isTeCheckenString = keyArg.equals("doodsteek")
                || keyArg.equals("in brand steken")
                || keyArg.equals("in de steek laten")
                || keyArg.equals("staak")
                || keyArg.equals("staken");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("steken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isStellen(final @NotNull String keyArg, final String arg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenSamengesteldWerkwoord = keyArg.equals("aanstellen")
                || keyArg.equals("gelijkstellen")
                || keyArg.equals("geruststellen")
                || keyArg.equals("instellen")
                || keyArg.equals("opstellen")
                || keyArg.equals("samenstellen")
                || keyArg.equals("teleurstellen")
                || keyArg.equals("tentoonstellen")
                || keyArg.equals("uitstellen")
                || keyArg.equals("vaststellen")
                || keyArg.equals("voorstellen")
                || keyArg.equals("vrijstellen");


        var isTeCheckenString = keyArg.equals("stel")
                || keyArg.equals("in bewaring stellen")
                || keyArg.equals("op de proef stellen")
                || keyArg.equals("uitstel")
                || keyArg.equals("voorstel");

        var isTeCheckenWerkwoordString =
                (keyArg.equals("voorstellen") && arg.equals("voorstel")) ||
                (keyArg.equals("uitstellen") && arg.equals("uitstel"));

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenSamengesteldWerkwoord;
        } else if (isTeCheckenString || isTeCheckenWerkwoordString) {
            isValid = true;
        } else if (keyArg.equals("stellen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isStijgen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("omhoog stijgen")
                || keyArg.equals("opstijgen");

        var isTeCheckenString = keyArg.equals("stijgen")
                || keyArg.equals("steeg");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isStorten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("instorten")
                || keyArg.equals("neerstorten")
                || keyArg.equals("uitstorten");

        var isTeCheckenString = keyArg.equals("in de strijd storten")
                || keyArg.equals("in het ongeluk storten")
                || keyArg.equals("in het onheil storten")
                || keyArg.equals("in het verderf storten");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("storten")) {
            isValid = true;
        }

        return isValid;
    } // isStorten

    public static boolean isStoten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("neerstoten")
                || keyArg.equals("uitstoten");
        var isTeCheckenString = keyArg.equals("stoten");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isStoten

    public static boolean isStrooien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("uitstrooien");
        var isTeCheckenString = keyArg.equals("strooien");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isStrooien

    public static boolean isSturen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("terugsturen")
                || keyArg.equals("afsturen")
                || keyArg.equals("meesturen")
                || keyArg.equals("rondsturen")
                || keyArg.equals("toesturen")
                || keyArg.equals("uitsturen")
                || keyArg.equals("wegsturen");

        var isTeCheckenString = keyArg.equals("sturen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isSturen

    public static boolean isTekenen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aftekenen")
                || keyArg.equals("optekenen");
        var isTeCheckenString = keyArg.equals("teken")
                || keyArg.equals("tekenen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isTekenen

    public static boolean isTeSchande(final @NotNull String keyArg) {
        return keyArg.equals("te schande maken")
                || (keyArg.equals("te schande worden"));
    } // isTeSchande

    public static boolean isTerAarde(final @NotNull String keyArg) {
        return keyArg.startsWith("ter aarde");
    }

    public static boolean isTillen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("omhoogtillen")
                || keyArg.equals("optillen");

        var isTeCheckenString = keyArg.equals("tillen")
                || keyArg.equals("til");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isTillen

    public static boolean isToevallen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("toevallen");
        var isTeCheckenString = keyArg.equals("toeval");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isToevallen

    public static boolean isTonen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aantonen");
        var isTeCheckenString = keyArg.equals("tonen")
                || keyArg.equals("toon");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isTonen

    public static boolean isTreden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aantreden")
                || keyArg.equals("binnentreden")
                || keyArg.equals("buiten de oevers treden")
                || keyArg.equals("in dienst treden")
                || keyArg.equals("naar voren treden")
                || keyArg.equals("optreden")
                || keyArg.equals("tegemoet treden")
                || keyArg.equals("toetreden");
        var isTeCheckenString = keyArg.equals("treden")
                || keyArg.equals("tred")
                || keyArg.equals("trede");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isTreden

    public static boolean isTreffen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aantreffen");
        var isTeCheckenString = keyArg.equals("treffen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isTreffen

    public static boolean isTrekken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aantrekken")
                || keyArg.equals("aftrekken")
                || keyArg.equals("binnentrekken")
                || keyArg.equals("doortrekken")
                || keyArg.equals("heentrekken")
                || keyArg.equals("intrekken")
                || keyArg.equals("lostrekken")
                || keyArg.equals("meetrekken")
                || keyArg.equals("omhoogtrekken")
                || keyArg.equals("optrekken")
                || keyArg.equals("overtrekken")
                || keyArg.equals("rondtrekken")
                || keyArg.equals("terugtrekken")
                || keyArg.equals("uittrekken")
                || keyArg.equals("verdertrekken")
                || keyArg.equals("voorbijtrekken")
                || keyArg.equals("voortrekken")
                || keyArg.equals("wegtrekken");

        var isTeCheckenString = keyArg.equals("intrek");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("trekken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isTwijfelen(final @NotNull String keyArg) {
        return keyArg.equals("twijfel")
                || keyArg.equals("twijfelen");
    } //isTwijfelen

    public static boolean isUitDeWeg(final @NotNull String keyArg) {
        return keyArg.equals("uit de weg gaan")
                || keyArg.equals("uit de weg ruimen");
    } //isTwijfelen

    public static boolean isUur(final @NotNull String keyArg) {
        return keyArg.equals("uur")
                || keyArg.equals("half uur")
                || keyArg.equals("een uur")
                || keyArg.equals("twee uur")
                || keyArg.equals("drie uur")
                || keyArg.equals("twaalf uur")
                || keyArg.equals("derde uur")
                || keyArg.equals("zesde uur")
                || keyArg.equals("zevende uur")
                || keyArg.equals("negende uur")
                || keyArg.equals("tiende uur")
                || keyArg.equals("elfde uur");
    } // isUur

    public static boolean isVallen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanvallen")
                || keyArg.equals("achterovervallen")
                || keyArg.equals("afvallen")
                || keyArg.equals("bijvallen")
                || keyArg.equals("binnenvallen")
                || keyArg.equals("droogvallen")
                || keyArg.equals("lastigvallen")
                || keyArg.equals("neervallen")
                || keyArg.equals("opvallen")
                || keyArg.equals("samenvallen")
                || keyArg.equals("tegenvallen")
                || keyArg.equals("uitvallen")
                || keyArg.equals("voorovervallen");

        var isTeCheckenString = keyArg.equals("aanval")
                || (keyArg.equals("geval"))
                || keyArg.equals("afval")
                || keyArg.equals("ten deel vallen")
                || keyArg.equals("val");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("vallen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVangen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opvangen");

        var isTeCheckenString = keyArg.equals("vangen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVasten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("vastklampen");
        var isTeCheckenString = keyArg.equals("vasten")
                || keyArg.equals("vast")
                || keyArg.equals("vast en zeker");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVasten

    public static boolean isVaren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opvaren")
                || keyArg.equals("overvaren")
                || keyArg.equals("vaart zetten")
                || keyArg.equals("uitvaren tegen")
                || keyArg.equals("wegvaren");

        var isTeCheckenString = keyArg.equals("varen");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVellen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("neervellen")
                || keyArg.equals("oordeel vellen")
                || keyArg.equals("vonnis vellen");
        var isTeCheckenString = keyArg.equals("vellen")
                || keyArg.equals("vel")
                || keyArg.equals("veld");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVellen

    public static boolean isVerbinden(final @NotNull String keyArg) {
        return keyArg.equals("ark van het verbond")
                || keyArg.equals("eeuwig verbond")
                || keyArg.equals("nieuw verbond")
                || keyArg.equals("verbond")
                || keyArg.equals("verbinden");
    } // isVerbinden

    public static boolean isVerlichten(final @NotNull String keyArg) {
        return keyArg.equals("verlichten")
                || (keyArg.equals("verlicht"));
    } // isVerlichten

    public static boolean isVerplichten(final @NotNull String keyArg) {
        return keyArg.equals("verplichten")
                || keyArg.equals("verplicht");
    } // isVerplichten

    public static boolean isVertrouwen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("toevertrouwen");
        var isTeCheckenString = keyArg.equals("vertrouwen (werkwoord)")
                || keyArg.equals("vertrouwen (zelfstandig naamwoord)");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVertrouwen

    public static boolean isVerwijten(final @NotNull String keyArg) {
        return keyArg.equals("verwijten")
                || (keyArg.equals("verwijt"));
    } // isVerwijten

    public static boolean isVieren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("feestvieren");

        var isTeCheckenString = keyArg.equals("vier");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("vieren")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVinden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("genade vinden")
                || keyArg.equals("goedvinden")
                || keyArg.equals("plaatsvinden")
                || keyArg.equals("rust vinden")
                || keyArg.equals("schuld vinden")
                || keyArg.equals("troost vinden")
                || keyArg.equals("vreugde vinden")
                || keyArg.equals("vrijmoedigheid vinden");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (keyArg.equals("vinden")) {
            isValid = true;
        }

        return isValid;
    } // isVinden

    public static boolean isVliegen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanvliegen")
                || keyArg.equals("wegvliegen");

        var isTeCheckenString = keyArg.equals("vlieg");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("vliegen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVloeien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("overvloeien")
                || keyArg.equals("samenvloeien")
                || keyArg.equals("terugvloeien")
                || keyArg.equals("wegvloeien");

        var isTeCheckenString = keyArg.equals("vloeien");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = isTeCheckenString;
        }

        return isValid;
    } // isVloeien

    public static boolean isVluchten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("wegvluchten");
        var isTeCheckenString = keyArg.equals("vluchten")
                || (keyArg.equals("op de vlucht"))
                || (keyArg.equals("vlucht"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVluchten

    public static boolean isVoeden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("opvoeden");

        var isTeCheckenString = keyArg.equals("voeden");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVoeren(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanvoeren")
                || keyArg.equals("afvoeren")
                || keyArg.equals("bevel voeren")
                || keyArg.equals("heerschappij voeren")
                || keyArg.equals("het woord voeren")
                || keyArg.equals("in ballingschap voeren")
                || keyArg.equals("meevoeren")
                || keyArg.equals("oorlog voeren")
                || keyArg.equals("overleg voeren")
                || keyArg.equals("rechtszaak voeren")
                || keyArg.equals("strijd voeren")
                || keyArg.equals("uitvoeren")
                || keyArg.equals("wegvoeren");

        var isTeCheckenString = keyArg.equals("voeren")
                || keyArg.equals("voer");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isVolmaken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("volmaken (vullen, voltooien)");
        var isTeCheckenString = keyArg.equals("volmaakt")
                || keyArg.equals("volmaken (tot volmaaktheid brengen)");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVolmaken

    public static boolean isVoorOgen(final @NotNull String keyArg) {
        return keyArg.equals("voor ogen hebben")
                || keyArg.equals("voor ogen houden")
                || keyArg.equals("voor ogen komen")
                || keyArg.equals("voor ogen krijgen")
                || keyArg.equals("voor ogen schilderen")
                || keyArg.equals("voor ogen staan")
                || keyArg.equals("voor ogen stellen")
                || keyArg.equals("voor ogen zijn");
    } // isVoorOgen

    public static boolean isVragen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afvragen")
                || keyArg.equals("navragen")
                || keyArg.equals("terugvragen");
        var isTeCheckenString = keyArg.equals("vragen")
                || keyArg.equals("navraag")
                || keyArg.equals("vraag")
                || keyArg.equals("vroeg");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isVragen

    public static boolean isVrede(final @NotNull String arg) {
        return arg.equalsIgnoreCase("vrede");
    } // isVrede

    public static boolean isWaar(final @NotNull String arg) {
        return arg.equals("waar")
                || arg.equals("ware")
                || arg.equals("waren");
    }

    public static boolean isWaarachtige(final @NotNull String arg) {
        return arg.equalsIgnoreCase("waarachtige")
                || arg.equals("waarachtig");
    } // isWaarachtige

    public static boolean isWassen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afwassen")
                || keyArg.equals("schoonwassen");

        var isTeCheckenString = keyArg.equals("was");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("wassen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isWeg(final @NotNull String arg) {
        return arg.equals("Weg");
    }

    public static boolean isWegen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afwegen")
                || keyArg.equals("opwegen");

        var isTeCheckenString = keyArg.equals("gebaande weg")
                || keyArg.equals("weg");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else {
            isValid = keyArg.equals("wegen");
        }

        return isValid;
    }

    public static boolean isWekken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opwekken");
        var isTeCheckenString = keyArg.equals("wekken");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isWekken

    public static boolean isWerken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afwerken")
                || keyArg.equals("samenwerken");
        var isTeCheckenString = keyArg.equals("werken")
                || (keyArg.equals("goed werk"))
                || (keyArg.equals("te werk gaan"))
                || (keyArg.equals("werk"))
                || (keyArg.equals("werken van de wet"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isWerken

    public static boolean isWerpen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afwerpen")
                || keyArg.equals("buitenwerpen")
                || keyArg.equals("lot werpen")
                || keyArg.equals("neerwerpen")
                || keyArg.equals("omverwerpen")
                || keyArg.equals("opwerpen")
                || keyArg.equals("toewerpen")
                || keyArg.equals("uitwerpen")
                || keyArg.equals("wegwerpen");


        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else {
            isValid = keyArg.equals("werpen (baren)")
                || keyArg.equals("werpen (gooien)");
        }

        return isValid;
    }

    public static boolean isWijden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("inwijden");
        var isTeCheckenString = keyArg.equals("wijden")
                || (keyArg.equals("door de ban wijden"))
                || (keyArg.equals("met de ban wijden"))
                || (keyArg.equals("wijd"))
                || (keyArg.equals("wijd en zijd"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isWijden

    public static boolean isWijken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afwijken")
                || keyArg.equals("terugwijken")
                || keyArg.equals("uitwijken");

        var isTeCheckenString = keyArg.equals("week (7 dagen)")
                || (keyArg.equals("week (toestand)"));

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("wijken")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isWijzen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanwijzen")
                || keyArg.equals("afwijzen")
                || keyArg.equals("terechtwijzen")
                || keyArg.equals("toewijzen");

        var isTeCheckenString = keyArg.equals("wees")
                || (keyArg.equals("wezen"))
                || (keyArg.equals("wijs"))
                || keyArg.equals("wijze (manier)")
                || keyArg.equals("wijze (persoon)");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("wijzen")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isWikkelen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("inwikkelen")
                || keyArg.equals("omwikkelen");
        var isTeCheckenString = keyArg.equals("wikkelen")
                || keyArg.equals("in strijd gewikkeld");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isWikkelen

    public static boolean isWissen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afwissen")
                || keyArg.equals("uitwissen");
        var isTeCheckenString = keyArg.equals("wissen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isWissen

    public static boolean isWonen(final @NotNull String arg) {
        return arg.equals("wonen");
    }

    public static boolean isZaaien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("inzaaien")
                || keyArg.equals("verderf zaaien");
        var isTeCheckenString = keyArg.equals("zaaien");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isZaaien

    public static boolean isZee(final @NotNull String keyArg) {
        return keyArg.equals("zee (water)")
                || (keyArg.equals("zee (waterbekken)"));
    } // isZee

    public static boolean isZeggen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aanzeggen")
                || keyArg.equals("dankzeggen")
                || keyArg.equals("toezeggen")
                || keyArg.equals("waarzeggen");
        var isTeCheckenString = keyArg.equals("zeggen");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isZeggen

    public static boolean isZelf(final @NotNull String arg) {
        return arg.equals("Zelf");
    } // isZelf

    public static boolean isZenden(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("afzenden")
                || keyArg.equals("meezenden")
                || keyArg.equals("uitzenden")
                || keyArg.equals("wegzenden");
        var isTeCheckenString = keyArg.equals("zenden")
                || (keyArg.equals("zonde"));

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isZenden

    public static boolean isZetten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("aanzetten tot")
                || keyArg.equals("afzetten")
                || keyArg.equals("apart zetten")
                || keyArg.equals("bijzetten")
                || keyArg.equals("ertoe aanzetten")
                || keyArg.equals("inzetten")
                || keyArg.equals("inzetten tegen")
                || keyArg.equals("neerzetten")
                || keyArg.equals("openzetten")
                || keyArg.equals("opzetten")
                || keyArg.equals("opzetten tegen")
                || keyArg.equals("uiteenzetten")
                || keyArg.equals("uitzetten")
                || keyArg.equals("vaart zetten")
                || keyArg.equals("vastzetten")
                || keyArg.equals("wegzetten")
                || keyArg.equals("zinnen zetten op");
        var isTeCheckenString = keyArg.equals("zetten")
                || keyArg.equals("in vlam zetten");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isZetten

    public static boolean isZien(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanzien (werkwoord)")
                || keyArg.equals("aanzien voor")
                || keyArg.equals("erop toezien")
                || keyArg.equals("eruit zien")
                || keyArg.equals("ervan afzien")
                || keyArg.equals("inzien")
                || keyArg.equals("neerzien")
                || keyArg.equals("omzien")
                || keyArg.equals("over het hoofd zien")
                || keyArg.equals("terugzien")
                || keyArg.equals("toezien")
                || keyArg.equals("uitzien");

        var isTeCheckenString = keyArg.equals("aanzien (zelfstandig naamwoord)")
                || keyArg.equals("aanzien des persoons")
                || keyArg.equals("ten aanzien van")
                || keyArg.equals("zaag")
                || keyArg.equals("zagen")
                || keyArg.equals("ziende");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        } else if (keyArg.equals("zien")) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isZin(final @NotNull String keyArg) {
        return keyArg.equals("zin");
    } // isZin

    public static boolean isZijn(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("bijeenzijn");

        var isTeCheckenString = keyArg.equals("bij machte zijn")
                || keyArg.equals("in leven zijn")
                || keyArg.equals("in verwarring zijn");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    } // isZijn

    public static boolean isZitten(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("aanzitten")
                || keyArg.equals("gevangenzitten")
                || keyArg.equals("vastzitten");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        }

        return isValid;
    }

    public static boolean isZoeken(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isTeCheckenWerkwoord = keyArg.equals("opzoeken")
                || keyArg.equals("uitzoeken");
        var isTeCheckenString = keyArg.equals("zoeken")
                || keyArg.equals("op zoek naar")
                || keyArg.equals("zoek");

        return (isSamengesteldWerkwoord && isTeCheckenWerkwoord) || isTeCheckenString;
    } // isZoeken

    public static boolean isZonderen(final @NotNull String keyArg, final boolean isSamengesteldWerkwoord) {
        var isValid = false;

        var isTeCheckenWerkwoord = keyArg.equals("afzonderen")
                || keyArg.equals("uitzonderen");

        var isTeCheckenString = keyArg.equals("zonder")
                || keyArg.equals("zonder enig gebrek")
                || keyArg.equals("zonder ophouden")
                || keyArg.equals("zonder opzet");

        if (isSamengesteldWerkwoord) {
            isValid = isTeCheckenWerkwoord;
        } else if (isTeCheckenString) {
            isValid = true;
        }

        return isValid;
    }

    public static boolean isZwaaien(final @NotNull String keyArg) {
        return keyArg.equals("zwaai")
                || (keyArg.equals("zwaaien"));
    } // isZweren

    public static boolean isZweren(final @NotNull String keyArg) {
        return keyArg.equals("zweren")
                || (keyArg.equals("zweer"));
    } // isZweren

}
