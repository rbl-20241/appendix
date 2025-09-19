package rb.hsv.appendix.ccd.valid.util;

import rb.hsv.appendix.ccd.valid.*;

import java.io.File;

import static rb.hsv.appendix.ccd.valid.util.ValidUtil.*;

public class Valid {

    private static final Boolean IS_VARIANT_TEST = true;
    public static boolean isValidNextWord(final String arg, final String line, final File curFile, final String vs) {
        var isValid = true;

        if (arg.equals("Koning")) {
            isValid = ValidKoning.isValid(arg, line, curFile, vs);
        }
        else if (arg.equals("haar") || arg.equals("haren")) {
            isValid = ValidHaar.isNotValidNextWord_Haar(arg, line);
        }
        return isValid;
    }

    public static boolean isValidVariant(final String keyArg, final String arg, final File curFile, final String vs, final boolean isSamengesteldWerkwoord) {
        var isValid = true;

        if (!IS_VARIANT_TEST) {
            return true;
        }

        if (isAchten(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidAchten.isValid(keyArg, arg, curFile, vs);
        } else if (isAmen(keyArg)) {
            isValid = ValidAmen.isValid(curFile, vs);
        } else if (isAntwoorden(keyArg)) {
            isValid = ValidAntwoorden.isValid(keyArg, curFile, vs);
        } else if (isArbeiden(keyArg)) {
            isValid = ValidArbeiden.isValid(keyArg, curFile, vs);
        } else if (isArm(arg)) {
            isValid = ValidArm.isValid(keyArg, curFile, vs);
        } else if (isBalken(arg)) {
            isValid = ValidBalken.isValid(keyArg, curFile, vs);
        } else if (isBarsten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBarsten.isValid(keyArg, curFile, vs);
        } else if (isBegin(arg)) {
            isValid = ValidBegin.isValid(keyArg, curFile, vs);
        } else if (isBergen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBergen.isValid(keyArg, curFile, vs);
        } else if (isBericht(arg)) {
            isValid = ValidBericht.isValid(keyArg, curFile, vs);
        } else if (isBeseffen(keyArg)) {
            isValid = ValidBeseffen.isValid(keyArg, curFile, vs);
        } else if (isBeslissen(keyArg)) {
            isValid = ValidBeslissen.isValid(keyArg, curFile, vs);
        } else if (isBetalen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBetalen.isValid(keyArg, curFile, vs);
        } else if (isBevelen(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidBevelen.isValid(keyArg, curFile, vs);
        } else if (isBezitten(keyArg)) {
            isValid = ValidBezitten.isValid(keyArg, arg, curFile, vs);
        } else if (isBezorgen(keyArg)) {
            isValid = ValidBezorgen.isValid(keyArg, curFile, vs);
        } else if (isBieden(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidBieden.isValid(keyArg, arg, curFile, vs);
        } else if (isBinden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBinden.isValid(keyArg, curFile, vs);
        } else if (isBlazen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBlazen.isValid(keyArg, curFile, vs);
        } else if (isBlijven(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBlijven.isValid(keyArg, arg, curFile, vs);
        } else if (isBouwen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBouwen.isValid(keyArg, curFile, vs);
        } else if (isBreken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBreken.isValid(keyArg, arg, curFile, vs);
        } else if (isBrengen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBrengen.isValid(keyArg, arg,  curFile, vs);
        } else if (isBuigen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBuigen.isValid(keyArg, curFile, vs);
        } else if (isBuiten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidBuiten.isValid(keyArg, curFile, vs);
        } else if (isDag(keyArg)) {
            isValid = ValidDag.isValid(keyArg, arg, curFile, vs);
        } else if (isDagen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDagen.isValid(keyArg, curFile, vs);
        } else if (isDalen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDalen.isValid(keyArg, curFile, vs);
        } else if (isDekken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDekken.isValid(keyArg, curFile, vs);
        } else if (isDenken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDenken.isValid(keyArg, curFile, vs);
        } else if (isDelen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDelen.isValid(keyArg, arg, curFile, vs);
        } else if (isDezelfde(arg)) {
            isValid = ValidDezelfde.isValid(curFile, vs);
        } else if (isDoen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDoen.isValid(keyArg, arg, curFile, vs);
        } else if (isDoden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDoden.isValid(keyArg, arg, curFile, vs);
        } else if (isDragen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDragen.isValid(keyArg, curFile, vs);
        } else if (isDrijven(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDrijven.isValid(keyArg, arg, curFile, vs);
        } else if (isDringen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDringen.isValid(keyArg, curFile, vs);
        } else if (isDrinken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidDrinken.isValid(keyArg, curFile, vs);
        } else if (isDwalende(arg)) {
            isValid = ValidDwalende.isValid(keyArg, curFile, vs);
        } else if (isEed(keyArg, arg)) {
            isValid = ValidEed.isValid(curFile, vs);
        } else if (isEer(keyArg, arg)) {
            isValid = ValidEer.isValid(keyArg, curFile, vs);
        } else if (isEnige(arg)) {
            isValid = ValidEnige.isValid(keyArg, curFile, vs);
        } else if (isEten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidEten.isValid(keyArg, curFile, vs);
        } else if (isGaan(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGaan.isValid(keyArg, arg, curFile, vs);
        } else if (isGebieden(keyArg)) {
            isValid = ValidGebieden.isValid(keyArg, arg, curFile, vs);
        } else if (isGelegen(keyArg)) {
            isValid = ValidGelegen.isValid(curFile, vs);
        } else if (isGevangen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGevangen.isValid(keyArg, curFile, vs);
        } else if (isGeven(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGeven.isValid(keyArg, arg, curFile, vs);
        } else if (isGooien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGooien.isValid(keyArg, curFile, vs);
        } else if (isGrijpen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGrijpen.isValid(keyArg, curFile, vs);
        } else if (isGroeien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidGroeien.isValid(keyArg, curFile, vs);
        } else if (isGroot(keyArg)) {
            isValid = ValidGroot.isValid(keyArg, curFile, vs);
        } else if (isHaar(keyArg)) {
            isValid = ValidHaar.isValid(curFile, vs);
        } else if (isHalen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHalen.isValid(keyArg, curFile, vs);
        } else if (isHakken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHakken.isValid(keyArg, arg, curFile, vs);
        } else if (isHandelen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHandelen.isValid(keyArg, curFile, vs);
        } else if (isHebben(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHebben.isValid(keyArg, arg, curFile, vs);
        } else if (isHeffen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHeffen.isValid(keyArg, curFile, vs);
        } else if (isHoofd(keyArg)) {
            isValid = ValidHoofd.isValid(keyArg, arg, curFile, vs);
        } else if (isHopen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHopen.isValid(keyArg, arg, curFile, vs);
        } else if (isHouden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHouden.isValid(keyArg, arg, curFile, vs);
        } else if (isHouwen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHouwen.isValid(keyArg, arg, curFile, vs);
        } else if (isHuren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHuren.isValid(keyArg, curFile, vs);
        } else if (isHuwelijk(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidHuwelijken.isValid(keyArg, curFile, vs);
        } else if (isIemand(arg)) {
            isValid = ValidIemand.isValid(curFile, vs);
        } else if (isJagen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidJagen.isValid(keyArg, curFile, vs);
        } else if (isKeren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKeren.isValid(keyArg, curFile, vs);
        } else if (isKiezen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKiezen.isValid(keyArg, curFile, vs);
        } else if (isKijken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKijken.isValid(keyArg, arg, curFile, vs);
        } else if (isKleden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKleden.isValid(keyArg, curFile, vs);
        } else if (isKlein(keyArg)) {
            isValid = ValidKlein.isValid(keyArg, curFile, vs);
        } else if (isKlimmen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKlimmen.isValid(keyArg, curFile, vs);
        } else if (isKloven(keyArg)) {
            isValid = ValidKloven.isValid(keyArg, curFile, vs);
        } else if (isKnielen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKnielen.isValid(keyArg, curFile, vs);
        } else if (isKomen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKomen.isValid(keyArg, arg, curFile, vs);
        } else if (isKosten(keyArg)) {
            isValid = ValidKosten.isValid(keyArg, curFile, vs);
        } else if (isKrijgen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidKrijgen.isValid(keyArg, curFile, vs);
        } else if (isKussen(keyArg)) {
            isValid = ValidKussen.isValid(keyArg, arg, curFile, vs);
        } else if (isLaten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLaten.isValid(keyArg, arg, curFile, vs);
        } else if (isLeggen(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidLeggen.isValid(keyArg, arg, curFile, vs);
        } else if (isLeiden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLeiden.isValid(keyArg, curFile, vs);
        } else if (isLeren(keyArg)) {
            isValid = ValidLeren.isValid(keyArg, arg, curFile, vs);
        } else if (isLeven(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidLeven.isValid(keyArg, arg, curFile, vs);
        } else if (isLeveren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLeveren.isValid(keyArg, curFile, vs);
        } else if (isLichten(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidLichten.isValid(keyArg, arg, curFile, vs);
        } else if (isLiggen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLiggen.isValid(keyArg, curFile, vs);
        } else if (isLikken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLikken.isValid(keyArg, curFile, vs);
        } else if (isLinker(keyArg, arg)) {
            isValid = ValidLinker.isValid(keyArg, curFile, vs);
        } else if (isLopen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidLopen.isValid(keyArg, arg, curFile, vs);
        } else if (isLuisteren(keyArg)) {
            isValid = ValidLuisteren.isValid(keyArg, curFile, vs);
        } else if (isLusten(keyArg)) {
            isValid = ValidLusten.isValid(keyArg, curFile, vs);
        } else if (isMaand(keyArg)) {
            isValid = ValidMaand.isValid(keyArg, arg, curFile, vs);
        } else if (isMaken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidMaken.isValid(keyArg, arg, curFile, vs);
        } else if (isMeer(arg)) {
            isValid = ValidMeer.isValid(keyArg, curFile, vs);
        } else if (isMens(arg)) {
            isValid = ValidMens.isValid(arg, curFile, vs);
        } else if (isMerken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidMerken.isValid(keyArg, curFile, vs);
        } else if (isMeten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidMeten.isValid(keyArg, curFile, vs);
        } else if (isMunt(keyArg)) {
            isValid = ValidMunt.isValid(keyArg, curFile, vs);
        } else if (isNemen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidNemen.isValid(keyArg, arg, curFile, vs);
        } else if (isNet(keyArg)) {
            isValid = ValidNet.isValid(keyArg, curFile, vs);
        } else if (isNodigen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidNodigen.isValid(keyArg, curFile, vs);
        } else if (isOefenen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidOefenen.isValid(keyArg, curFile, vs);
        } else if (isOntvangen(keyArg)) {
            isValid = ValidOntvangen.isValid(keyArg, curFile, vs);
        } else if (isOntzetten(keyArg)) {
            isValid = ValidOntzetten.isValid(keyArg, curFile, vs);
        } else if (isPakken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidPakken.isValid(keyArg, curFile, vs);
        } else if (isPlaatsen(keyArg)) {
            isValid = ValidPlaatsen.isValid(keyArg, arg, curFile, vs);
        } else if (isPlanten(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidPlanten.isValid(keyArg, arg, curFile, vs);
        } else if (isPlukken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidPlukken.isValid(keyArg, curFile, vs);
        } else if (isPriester(arg)) {
            isValid = ValidPriester.isValid(arg, curFile, vs);
        } else if (isPutten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidPutten.isValid(keyArg, arg, curFile, vs);
        } else if (isRaden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRaden.isValid(keyArg, curFile, vs);
        } else if (isRaken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRaken.isValid(keyArg, arg, curFile, vs);
        } else if (isRapen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRapen.isValid(keyArg, curFile, vs);
        } else if (isRechter(arg)) {
            isValid = ValidRechter.isValid(keyArg, curFile, vs);
        } else if (isRichten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRichten.isValid(keyArg, arg, curFile, vs);
        } else if (isRijden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRijden.isValid(keyArg, curFile, vs);
        } else if (isRijzen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRijzen.isValid(keyArg, arg, curFile, vs);
        } else if (isRoepen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRoepen.isValid(keyArg, curFile, vs);
        } else if (isRollen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRollen.isValid(keyArg, curFile, vs);
        } else if (isRoven(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRoven.isValid(keyArg, curFile, vs);
        } else if (isRuilen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRuilen.isValid(keyArg, curFile, vs);
        } else if (isRukken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRukken.isValid(keyArg, curFile, vs);
        } else if (isRusten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidRusten.isValid(keyArg, arg, curFile, vs);
        } else if (isScheiden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidScheiden.isValid(keyArg, curFile, vs);
        } else if (isScheren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidScheren.isValid(keyArg, curFile, vs);
        } else if (isSchorten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSchorten.isValid(keyArg, curFile, vs);
        } else if (isSchreeuwen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSchreeuwen.isValid(keyArg, curFile, vs);
        } else if (isSchrijven(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSchrijven.isValid(keyArg, arg, curFile, vs);
        } else if (isSchudden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSchudden.isValid(keyArg, curFile, vs);
        } else if (isSchuilen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSchuilen.isValid(keyArg, curFile, vs);
        } else if (isSikkel(keyArg)) {
            isValid = ValidSikkel.isValid(keyArg, curFile, vs);
        } else if (isSlaan(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSlaan.isValid(keyArg, arg, curFile, vs);
        } else if (isSlagen(keyArg)) {
            isValid = ValidSlagen.isValid(keyArg, arg, curFile, vs);
        } else if (isSlapen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSlapen.isValid(keyArg, arg, curFile, vs);
        } else if (isSlepen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSlepen.isValid(keyArg, curFile, vs);
        } else if (isSluiten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSluiten.isValid(keyArg, curFile, vs);
        } else if (isSnellen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSnellen.isValid(keyArg, curFile, vs);
        } else if (isSpannen(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidSpannen.isValid(keyArg, arg, curFile, vs, isSamengesteldWerkwoord);
        } else if (isSporen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSporen.isValid(keyArg, curFile, vs);
        } else if (isSpreiden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSpreiden.isValid(keyArg, curFile, vs);
        } else if (isSpreken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSpreken.isValid(keyArg, curFile, vs);
        } else if (isSpringen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSpringen.isValid(keyArg, curFile, vs);
        } else if (isStaan(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStaan.isValid(keyArg, arg, curFile, vs);
        } else if (isStammen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStammen.isValid(keyArg, curFile, vs);
        } else if (isSteken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSteken.isValid(keyArg, arg, curFile, vs);
        } else if (isStellen(keyArg, arg, isSamengesteldWerkwoord)) {
            isValid = ValidStellen.isValid(keyArg, arg, curFile, vs);
        } else if (isStijgen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStijgen.isValid(keyArg, curFile, vs);
        } else if (isStoppen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStoppen.isValid(keyArg, curFile, vs);
        } else if (isStorten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStorten.isValid(keyArg, arg, curFile, vs);
        } else if (isStoten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStoten.isValid(keyArg, curFile, vs);
        } else if (isStrooien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidStrooien.isValid(keyArg, curFile, vs);
        } else if (isSturen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidSturen.isValid(keyArg, curFile, vs);
        } else if (isTeSchande(keyArg)) {
            isValid = ValidTeSchande.isValid(keyArg, arg, curFile, vs);
        } else if (isTerAarde(keyArg)) {
            isValid = ValidTerAarde.isValid(keyArg, arg, curFile, vs);
        } else if (isTillen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidTillen.isValid(keyArg, curFile, vs);
        } else if (isToevallen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidToevallen.isValid(keyArg, curFile, vs);
        } else if (isTreden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidTreden.isValid(keyArg, arg, curFile, vs);
        } else if (isTreffen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidTreffen.isValid(keyArg, curFile, vs);
        } else if (isTrekken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidTrekken.isValid(keyArg, curFile, vs);
        } else if (isTwijfelen(keyArg)) {
            isValid = ValidTwijfelen.isValid(keyArg, curFile, vs);
        } else if (isUitDeWeg(keyArg)) {
            isValid = ValidUitDeWeg.isValid(keyArg, arg, curFile, vs);
        } else if (isUur(keyArg)) {
            isValid = ValidUur.isValid(keyArg, curFile, vs);
        } else if (isVallen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVallen.isValid(keyArg, arg, curFile, vs);
        } else if (isVangen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVangen.isValid(keyArg, curFile, vs);
        } else if (isVaren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVaren.isValid(keyArg, arg, curFile, vs);
        } else if (isVasten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVasten.isValid(keyArg, arg, curFile, vs);
        } else if (isVellen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVellen.isValid(keyArg, arg, curFile, vs);
        } else if (isVerbinden(keyArg)) {
            isValid = ValidVerbinden.isValid(keyArg, curFile, vs);
        } else if (isVerlichten(keyArg)) {
            isValid = ValidVerlichten.isValid(keyArg, arg, curFile, vs);
        } else if (isVerplichten(keyArg)) {
            isValid = ValidVerplichten.isValid(keyArg, curFile, vs);
        } else if (isVertrouwen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVertrouwen.isValid(keyArg, arg, curFile, vs);
        } else if (isVerwijten(keyArg)) {
            isValid = ValidVerwijten.isValid(keyArg, curFile, vs);
        } else if (isVieren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVieren.isValid(keyArg, curFile, vs);
        } else if (isVinden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVinden.isValid(keyArg, curFile, vs);
        } else if (isVliegen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVliegen.isValid(keyArg, curFile, vs);
        } else if (isVloeien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVloeien.isValid(keyArg, curFile, vs);
        } else if (isVluchten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVluchten.isValid(keyArg, curFile, vs);
        } else if (isVoeden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVoeden.isValid(keyArg, curFile, vs);
        } else if (isVoeren(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVoeren.isValid(keyArg, arg, curFile, vs);
        } else if (isVolmaken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVolmaken.isValid(keyArg, arg, curFile, vs);
        } else if (isVoorOgen(keyArg)) {
            isValid = ValidVoorOgen.isValid(keyArg, arg, curFile, vs);
        } else if (isVragen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidVragen.isValid(keyArg, curFile, vs);
        } else if (isVrede(arg)) {
            isValid = ValidVrede.isValid(arg, curFile, vs);
        } else if (isWaar(arg)) {
            isValid = ValidWaar.isValid(keyArg, arg, curFile, vs);
        } else if (isWaarachtige(arg)) {
            isValid = ValidWaarachtige.isValid(keyArg, arg, curFile, vs);
        } else if (isWassen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWassen.isValid(keyArg, curFile, vs);
        } else if (isWeg(arg)) {
            isValid = ValidWeg.isValid(curFile, vs);
        } else if (isWegen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWegen.isValid(keyArg, arg, curFile, vs);
        } else if (isWekken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWekken.isValid(keyArg, curFile, vs);
        } else if (isWerken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWerken.isValid(keyArg, arg, curFile, vs);
        } else if (isWerpen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWerpen.isValid(keyArg, curFile, vs);
        } else if (isWijden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWijden.isValid(keyArg, arg, curFile, vs);
        } else if (isWijken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWijken.isValid(keyArg, curFile, vs);
        } else if (isWijzen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWijzen.isValid(keyArg, arg, curFile, vs);
        } else if (isWikkelen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWikkelen.isValid(keyArg, arg, curFile, vs);
        } else if (isWissen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidWissen.isValid(keyArg, curFile, vs);
        } else if (isWonen(keyArg)) {
            isValid = IS_TOO_MUCH;
        } else if (isZaaien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZaaien.isValid(keyArg, curFile, vs);
        } else if (isZee(keyArg)) {
            isValid = ValidZee.isValid(keyArg, curFile, vs);
        } else if (isZeggen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZeggen.isValid(keyArg, curFile, vs);
        } else if (isZelf(arg)) {
            isValid = ValidZelf.isValid(curFile, vs);
        } else if (isZenden(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZenden.isValid(keyArg, arg, curFile, vs);
        } else if (isZetten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZetten.isValid(keyArg, arg, curFile, vs);
        } else if (isZien(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZien.isValid(keyArg, arg, curFile, vs);
        } else if (isZijn(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZijn.isValid(keyArg, arg, curFile, vs);
        } else if (isZitten(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZitten.isValid(keyArg, curFile, vs);
        } else if (isZoeken(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZoeken.isValid(keyArg, arg, curFile, vs);
        } else if (isZonderen(keyArg, isSamengesteldWerkwoord)) {
            isValid = ValidZonderen.isValid(keyArg, curFile, vs);
        } else if (isZwaaien(keyArg)) {
            isValid = ValidZwaaien.isValid(keyArg, curFile, vs);
        } else if (isZweren(keyArg)) {
            isValid = ValidZweren.isValid(keyArg, curFile, vs);
        }

        return isValid;
    }

    public static boolean isSameArgumentInCurrentVerse(final String curKeyArg, final String curArg, final File curFile, final String vs) {
        var isValid = true;

        isValid = isSameArgumentInCurrentVerse(isValid, "aanzien (werkwoord)", "aanzien", curKeyArg, curArg, curFile, vs,
                "Gal-2.html#vs6");
        isValid = isSameArgumentInCurrentVerse(isValid, "dal", "dalen", curKeyArg, curArg, curFile, vs,
                "Judg-01.html#vs34");
        isValid = isSameArgumentInCurrentVerse(isValid, "dalen", "daalden", curKeyArg, curArg, curFile, vs,
                "Ps-104.html#vs8");
        isValid = isSameArgumentInCurrentVerse(isValid, "delen", "deelden", curKeyArg, curArg, curFile, vs,
                "2Chr-35.html#vs13");
        isValid = isSameArgumentInCurrentVerse(isValid, "delen", "deelt", curKeyArg, curArg, curFile, vs,
                "Mic-2.html#vs4");
        isValid = isSameArgumentInCurrentVerse(isValid, "grijpen", "greep", curKeyArg, curArg, curFile, vs,
                "Exod-04.html#vs4");
        isValid = isSameArgumentInCurrentVerse(isValid, "grijpen", "grijpen", curKeyArg, curArg, curFile, vs,
                "Isa-64.html#vs7");
        isValid = isSameArgumentInCurrentVerse(isValid, "groeien", "groeit", curKeyArg, curArg, curFile, vs,
                "Job-08.html#vs11");
        isValid = isSameArgumentInCurrentVerse(isValid, "hoop (berg)", "hopen", curKeyArg, curArg, curFile, vs,
                "Acts-26.html#vs7", "Rom-08.html#vs24");
        isValid = isSameArgumentInCurrentVerse(isValid, "hoop (veel)", "hopen", curKeyArg, curArg, curFile, vs,
                "Acts-26.html#vs7", "Rom-08.html#vs24");
        isValid = isSameArgumentInCurrentVerse(isValid, "hoop (verwachting)", "hopen", curKeyArg, curArg, curFile, vs,
                "Acts-26.html#vs7", "Rom-08.html#vs24");
        isValid = isSameArgumentInCurrentVerse(isValid, "kleine (zelfstandig naamwoord)", "kleine", curKeyArg, curArg, curFile, vs,
                "Luke-18.html#vs16");
        isValid = isSameArgumentInCurrentVerse(isValid, "kus", "kussen", curKeyArg, curArg, curFile, vs,
                "Luke-07.html#vs45");
        isValid = isSameArgumentInCurrentVerse(isValid, "luister", "luisteren", curKeyArg, curArg, curFile, vs,
                "Jer-13.html#vs11");
        isValid = isSameArgumentInCurrentVerse(isValid, "opgroeien", "groeien", curKeyArg, curArg, curFile, vs,
                "Job-08.html#vs11");
        isValid = isSameArgumentInCurrentVerse(isValid, "rapen", "raapte", curKeyArg, curArg, curFile, vs,
                "Ruth-2.html#vs17");
        isValid = isSameArgumentInCurrentVerse(isValid, "rollen", "rolt", curKeyArg, curArg, curFile, vs,
                "Isa-22.html#vs17");
        isValid = isSameArgumentInCurrentVerse(isValid, "roven", "roof", curKeyArg, curArg, curFile, vs,
                "Isa-10.html#vs6", "Ezek-38.html#vs12", "Ezek-38.html#vs13");
        isValid = isSameArgumentInCurrentVerse(isValid, "schrijven (werkwoord)", "schrijven", curKeyArg, curArg, curFile, vs,
                "Esth-08.html#vs5");
        isValid = isSameArgumentInCurrentVerse(isValid, "slaap", "slapen", curKeyArg, curArg, curFile, vs,
                "Jer-51.html#vs39", "Jer-51.html#vs57");
        isValid = isSameArgumentInCurrentVerse(isValid, "slapen", "slaap", curKeyArg, curArg, curFile, vs,
                "1Sam-26.html#vs12", "Prov-04.html#vs16", "Jer-51.html#vs39",
                "Jer-51.html#vs57", "John-11.html#vs11");
        isValid = isSameArgumentInCurrentVerse(isValid, "uitdelen", "deel", curKeyArg, curArg, curFile, vs,
                "Mic-2.html#vs4");
        isValid = isSameArgumentInCurrentVerse(isValid, "uitdelen", "delen", curKeyArg, curArg, curFile, vs,
                "2Chr-35.html#vs13");
        isValid = isSameArgumentInCurrentVerse(isValid, "vastgrijpen", "grijp", curKeyArg, curArg, curFile, vs,
                "Exod-04.html#vs4");
        isValid = isSameArgumentInCurrentVerse(isValid, "vastgrijpen", "greep", curKeyArg, curArg, curFile, vs,
                "Isa-64.html#vs7");
        isValid = isSameArgumentInCurrentVerse(isValid, "vragen", "vraagt", curKeyArg, curArg, curFile, vs,
                "John-16.html#vs19");
        isValid = isSameArgumentInCurrentVerse(isValid, "vragen", "vraag", curKeyArg, curArg, curFile, vs,
                "Didache-01.html#vs5");
        isValid = isSameArgumentInCurrentVerse(isValid, "werk", "werken", curKeyArg, curArg, curFile, vs,
                "Heb-13.html#vs21");
        isValid = isSameArgumentInCurrentVerse(isValid, "werken", "werk", curKeyArg, curArg, curFile, vs,
                "2Kgs-12.html#vs11", "Heb-13.html#vs21");
        isValid = isSameArgumentInCurrentVerse(isValid, "zagen", "zaag", curKeyArg, curArg, curFile, vs,
                "1Kgs-07.html#vs9", "1Chr-20.html#vs3");
        return isValid;
    }

    public static boolean isSameArgumentsInCurrentVerse(final String curArg1, final String curArg2, final File curFile, final String vs) {
        var isValid = true;

        isValid = isSameArgumentsInCurrentVerse(isValid, "aanzien", "gegeven", curArg1, curArg2, curFile, vs,
                "Ezra-07.html#vs27");
        isValid = isSameArgumentsInCurrentVerse(isValid, "af", "boog", curArg1, curArg2, curFile, vs,
                "Josh-18.html#vs14");
        isValid = isSameArgumentsInCurrentVerse(isValid, "af", "doen", curArg1, curArg2, curFile, vs,
                "Exod-33.html#vs5");
        isValid = isSameArgumentsInCurrentVerse(isValid, "af", "maten", curArg1, curArg2, curFile, vs,
                "Ruth-3.html#vs15");
        isValid = isSameArgumentsInCurrentVerse(isValid, "af", "wist", curArg1, curArg2, curFile, vs,
                "John-06.html#vs64");
        isValid = isSameArgumentsInCurrentVerse(isValid, "antwoord", "gegeven", curArg1, curArg2, curFile, vs,
                "1Kgs-12.html#vs13");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bekend", "maken", curArg1, curArg2, curFile, vs,
                "2Sam-07.html#vs11");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bekwaam", "maakt", curArg1, curArg2, curFile, vs,
                "2Cor-03.html#vs6");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bevel", "geven", curArg1, curArg2, curFile, vs,
                "1Chr-22.html#vs12");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bevel", "gegeven", curArg1, curArg2, curFile, vs,
                "Matt-14.html#vs9", "Matt-27.html#vs58");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bevelen", "gaf", curArg1, curArg2, curFile, vs,
                "Gen-49.html#vs33");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bijeen", "was", curArg1, curArg2, curFile, vs,
                "John-21.html#vs2");
        isValid = isSameArgumentsInCurrentVerse(isValid, "bijeen", "zijn", curArg1, curArg2, curFile, vs,
                "Mark-08.html#vs1", "John-21.html#vs2");
        isValid = isSameArgumentsInCurrentVerse(isValid, "binnen", "brachten", curArg1, curArg2, curFile, vs,
                "Luke-05.html#vs18");
        isValid = isSameArgumentsInCurrentVerse(isValid, "binnen", "ging", curArg1, curArg2, curFile, vs,
                "Judg-19.html#vs15");
        isValid = isSameArgumentsInCurrentVerse(isValid, "borg", "sta", curArg1, curArg2, curFile, vs,
                "Gen-43.html#vs9");
        isValid = isSameArgumentsInCurrentVerse(isValid, "deel", "had", curArg1, curArg2, curFile, vs,
                "Heb-02.html#vs14");
        isValid = isSameArgumentsInCurrentVerse(isValid, "deel", "heeft", curArg1, curArg2, curFile, vs,
                "Col-1.html#vs12", "Heb-02.html#vs14");
        isValid = isSameArgumentsInCurrentVerse(isValid, "dienst", "deden", curArg1, curArg2, curFile, vs,
                "2Kgs-11.html#vs9", "2Chr-23.html#vs6");
        isValid = isSameArgumentsInCurrentVerse(isValid, "door", "trekt", curArg1, curArg2, curFile, vs,
                "Ezek-14.html#vs15");
        isValid = isSameArgumentsInCurrentVerse(isValid, "door", "trok", curArg1, curArg2, curFile, vs,
                "Num-21.html#vs23");
        isValid = isSameArgumentsInCurrentVerse(isValid, "duidelijk", "gemaakt", curArg1, curArg2, curFile, vs,
                "Heb-09.html#vs8");
        isValid = isSameArgumentsInCurrentVerse(isValid, "gebruik", "maak", curArg1, curArg2, curFile, vs,
                "1Cor-09.html#vs18");
        isValid = isSameArgumentsInCurrentVerse(isValid, "geest", "geven", curArg1, curArg2, curFile, vs,
                "Gen-49.html#vs33");
        isValid = isSameArgumentsInCurrentVerse(isValid, "genade", "gaven", curArg1, curArg2, curFile, vs,
                "Exod-12.html#vs36", "Gal-2.html#vs9");
        isValid = isSameArgumentsInCurrentVerse(isValid, "genade", "gevonden", curArg1, curArg2, curFile, vs,
                "Deut-24.html#vs1");
        isValid = isSameArgumentsInCurrentVerse(isValid, "genade", "vinden", curArg1, curArg2, curFile, vs,
                "Acts-07.html#vs46");
        isValid = isSameArgumentsInCurrentVerse(isValid, "getuigenis", "gaven", curArg1, curArg2, curFile, vs,
                "Heb-02.html#vs4");
        isValid = isSameArgumentsInCurrentVerse(isValid, "getuigenis", "geven", curArg1, curArg2, curFile, vs,
                "Acts-15.html#vs8", "3John-1.html#vs12");
        isValid = isSameArgumentsInCurrentVerse(isValid, "gezond", "maak", curArg1, curArg2, curFile, vs,
                "Acts-09.html#vs34");
        isValid = isSameArgumentsInCurrentVerse(isValid, "goed", "doet", curArg1, curArg2, curFile, vs,
                "Jas-4.html#vs17");
        isValid = isSameArgumentsInCurrentVerse(isValid, "groot", "maak", curArg1, curArg2, curFile, vs,
                "Jer-48.html#vs26");
        isValid = isSameArgumentsInCurrentVerse(isValid, "heen", "gingen", curArg1, curArg2, curFile, vs,
                "Ezek-01.html#vs20");
        isValid = isSameArgumentsInCurrentVerse(isValid, "in", "geschreven", curArg1, curArg2, curFile, vs,
                "Neh-07.html#vs5");
        isValid = isSameArgumentsInCurrentVerse(isValid, "in", "stortten", curArg1, curArg2, curFile, vs,
                "Matt-07.html#vs25");
        isValid = isSameArgumentsInCurrentVerse(isValid, "inzicht", "geeft", curArg1, curArg2, curFile, vs,
                "1Chr-22.html#vs12");
        isValid = isSameArgumentsInCurrentVerse(isValid, "kamp", "op", curArg1, curArg2, curFile, vs,
                "Num-01.html#vs53", "Num-02.html#vs2", "Num-02.html#vs17",
                "Josh-05.html#vs10", "1Sam-26.html#vs5", "2Sam-23.html#vs13",
                "1Chr-11.html#vs15");
        isValid = isSameArgumentsInCurrentVerse(isValid, "kennen", "gegeven", curArg1, curArg2, curFile, vs,
                "John-11.html#vs57");
        isValid = isSameArgumentsInCurrentVerse(isValid, "leiding", "geef", curArg1, curArg2, curFile, vs,
                "1Sam-08.html#vs6");
        isValid = isSameArgumentsInCurrentVerse(isValid, "levend", "gemaakt", curArg1, curArg2, curFile, vs,
                "2Cor-03.html#vs6");
        isValid = isSameArgumentsInCurrentVerse(isValid, "lief", "heb", curArg1, curArg2, curFile, vs,
                "Hos-11.html#vs1");
        isValid = isSameArgumentsInCurrentVerse(isValid, "lief", "hebt", curArg1, curArg2, curFile, vs,
                "John-16.html#vs27", "1Thess-4.html#vs9", "1Pet-1.html#vs22");
        isValid = isSameArgumentsInCurrentVerse(isValid, "lief", "heeft", curArg1, curArg2, curFile, vs,
                "Deut-10.html#vs15", "Deut-30.html#vs20", "Mark-12.html#vs6",
                "John-03.html#vs16", "Rom-13.html#vs8", "Eph-5.html#vs25");
        isValid = isSameArgumentsInCurrentVerse(isValid, "mee", "gebracht", curArg1, curArg2, curFile, vs,
                "Ezra-01.html#vs11");
        isValid = isSameArgumentsInCurrentVerse(isValid, "mee", "kom", curArg1, curArg2, curFile, vs,
                "Jer-40.html#vs4");
        isValid = isSameArgumentsInCurrentVerse(isValid, "mee", "komen", curArg1, curArg2, curFile, vs,
                "Gen-38.html#vs16", "Gen-38.html#vs20");
        isValid = isSameArgumentsInCurrentVerse(isValid, "mee", "kwamen", curArg1, curArg2, curFile, vs,
                "Mark-06.html#vs31");
        isValid = isSameArgumentsInCurrentVerse(isValid, "neer", "dalen", curArg1, curArg2, curFile, vs,
                "Ps-104.html#vs8");
        isValid = isSameArgumentsInCurrentVerse(isValid, "ogen", "gericht", curArg1, curArg2, curFile, vs,
                "Jer-40.html#vs4");
        isValid = isSameArgumentsInCurrentVerse(isValid, "ogen", "op", curArg1, curArg2, curFile, vs,
                "Judg-19.html#vs17");
        isValid = isSameArgumentsInCurrentVerse(isValid, "om", "doet", curArg1, curArg2, curFile, vs,
                "Mark-09.html#vs42");
        isValid = isSameArgumentsInCurrentVerse(isValid, "om", "keren", curArg1, curArg2, curFile, vs,
                "2Chr-20.html#vs27");
        isValid = isSameArgumentsInCurrentVerse(isValid, "onderscheid", "maakt", curArg1, curArg2, curFile, vs,
                "Lev-20.html#vs25");
        isValid = isSameArgumentsInCurrentVerse(isValid, "onrecht", "gedaan", curArg1, curArg2, curFile, vs,
                "Col-3.html#vs25");
        isValid = isSameArgumentsInCurrentVerse(isValid, "op", "gestaan", curArg1, curArg2, curFile, vs,
                "Gen-19.html#vs27");
        isValid = isSameArgumentsInCurrentVerse(isValid, "op", "rol", curArg1, curArg2, curFile, vs,
                "Isa-22.html#vs17");
        isValid = isSameArgumentsInCurrentVerse(isValid, "op", "staan", curArg1, curArg2, curFile, vs,
                "Exod-08.html#vs20", "Exod-09.html#vs13", "Exod-33.html#vs10",
                "Exod-37.html#vs7", "1Sam-24.html#vs8",
                "2Sam-15.html#vs2", "Esth-08.html#vs4", "Job-29.html#vs8", "Mark-03.html#vs3",
                "Luke-06.html#vs8", "Rev-11.html#vs1");
        isValid = isSameArgumentsInCurrentVerse(isValid, "op", "staat", curArg1, curArg2, curFile, vs,
                "Ezra-03.html#vs2");
        isValid = isSameArgumentsInCurrentVerse(isValid, "op", "stonden", curArg1, curArg2, curFile, vs,
                "Matt-02.html#vs20");
        isValid = isSameArgumentsInCurrentVerse(isValid, "opdracht", "geven", curArg1, curArg2, curFile, vs,
                "Gen-42.html#vs25", "Luke-08.html#vs55", "John-11.html#vs57");
        isValid = isSameArgumentsInCurrentVerse(isValid, "openbaar", "maakte", curArg1, curArg2, curFile, vs,
                "Heb-09.html#vs8");
        isValid = isSameArgumentsInCurrentVerse(isValid, "over", "kwam", curArg1, curArg2, curFile, vs,
                "Judg-09.html#vs26");
        isValid = isSameArgumentsInCurrentVerse(isValid, "raad", "gaf", curArg1, curArg2, curFile, vs,
                "1Kgs-12.html#vs8");
        isValid = isSameArgumentsInCurrentVerse(isValid, "rust", "geeft", curArg1, curArg2, curFile, vs,
                "Deut-25.html#vs19");
        isValid = isSameArgumentsInCurrentVerse(isValid, "rust", "geven", curArg1, curArg2, curFile, vs,
                "Deut-03.html#vs20");
        isValid = isSameArgumentsInCurrentVerse(isValid, "samen", "kwamen", curArg1, curArg2, curFile, vs,
                "1Cor-14.html#vs23");
        isValid = isSameArgumentsInCurrentVerse(isValid, "stil", "staan", curArg1, curArg2, curFile, vs,
                "Josh-10.html#vs13", "1Sam-14.html#vs9");
        isValid = isSameArgumentsInCurrentVerse(isValid, "tegemoet", "gekomen", curArg1, curArg2, curFile, vs,
                "Matt-08.html#vs28");
        isValid = isSameArgumentsInCurrentVerse(isValid, "tegemoet", "kwam", curArg1, curArg2, curFile, vs,
                "Judg-15.html#vs14");
        isValid = isSameArgumentsInCurrentVerse(isValid, "tegemoet", "kwamen", curArg1, curArg2, curFile, vs,
                "Judg-14.html#vs5", "1Sam-10.html#vs10");
        isValid = isSameArgumentsInCurrentVerse(isValid, "terug", "gebracht", curArg1, curArg2, curFile, vs,
                "Jer-28.html#vs3");
        isValid = isSameArgumentsInCurrentVerse(isValid, "terug", "gekomen", curArg1, curArg2, curFile, vs,
                "2Kgs-09.html#vs18");
        isValid = isSameArgumentsInCurrentVerse(isValid, "terug", "keerden", curArg1, curArg2, curFile, vs,
                "2Chr-20.html#vs27");
        isValid = isSameArgumentsInCurrentVerse(isValid, "terug", "vraagt", curArg1, curArg2, curFile, vs,
                "Didache-01.html#vs5");
        isValid = isSameArgumentsInCurrentVerse(isValid, "toe", "wierp", curArg1, curArg2, curFile, vs,
                "Zech-11.html#vs13");
        isValid = isSameArgumentsInCurrentVerse(isValid, "uit", "buiten", curArg1, curArg2, curFile, vs,
                "Col-4.html#vs5");
        isValid = isSameArgumentsInCurrentVerse(isValid, "uit", "trekken", curArg1, curArg2, curFile, vs,
                "Num-21.html#vs23");
        isValid = isSameArgumentsInCurrentVerse(isValid, "uit","zie", curArg1, curArg2, curFile, vs,
                "Isa-59.html#vs9", "Jer-08.html#vs15", "Jer-14.html#vs19");
        isValid = isSameArgumentsInCurrentVerse(isValid, "vast", "greep", curArg1, curArg2, curFile, vs,
                "Isa-64.html#vs7");
        isValid = isSameArgumentsInCurrentVerse(isValid, "vast", "maakte", curArg1, curArg2, curFile, vs,
                "Exod-36.html#vs18");
        isValid = isSameArgumentsInCurrentVerse(isValid, "vast", "staat", curArg1, curArg2, curFile, vs,
                "Rom-16.html#vs25");
        isValid = isSameArgumentsInCurrentVerse(isValid, "verder", "trekken", curArg1, curArg2, curFile, vs,
                "Josh-06.html#vs7");
        isValid = isSameArgumentsInCurrentVerse(isValid, "verzoening", "gedaan", curArg1, curArg2, curFile, vs,
                "Lev-05.html#vs18");
        isValid = isSameArgumentsInCurrentVerse(isValid, "vruchten", "geeft", curArg1, curArg2, curFile, vs,
                "Lev-26.html#vs20", "Rev-22.html#vs2");
        isValid = isSameArgumentsInCurrentVerse(isValid, "weg", "gedaan", curArg1, curArg2, curFile, vs,
                "2Kgs-24.html#vs3");
        isValid = isSameArgumentsInCurrentVerse(isValid, "weg", "stuurde", curArg1, curArg2, curFile, vs,
                "Mark-12.html#vs4", "Luke-20.html#vs11");
        isValid = isSameArgumentsInCurrentVerse(isValid, "weg", "varen", curArg1, curArg2, curFile, vs,
                "Acts-27.html#vs2");
        isValid = isSameArgumentsInCurrentVerse(isValid, "zegen", "gegeven", curArg1, curArg2, curFile, vs,
                "Gen-28.html#vs4");

        return isValid;
    }

    private static boolean isSameArgumentInCurrentVerse(final boolean isValid, final String keyArg, final String arg, final String curKeyArg, final String curArg, final File curFile, final String vs, final String... html) {
        boolean isValidVerse = isValid;
        if (keyArg.equals(curKeyArg) && arg.equals(curArg)) {
            for (int i = 0; i < html.length && isValidVerse; i++) {
                isValidVerse = !isValidVerse(curFile, vs, html[i]);
            }
        }

        return isValidVerse;
    }

    private static boolean isSameArgumentsInCurrentVerse(final boolean isValid, final String keyArg1, final String keyArg2, final String curArg1, final String curArg2, final File curFile, final String vs, final String... html) {
        boolean isValidVerse = isValid;
        if (argumentsFound(keyArg1, keyArg2, curArg1, curArg2)) {
            for (int i = 0; i < html.length && isValidVerse; i++) {
                isValidVerse = !isValidVerse(curFile, vs, html[i]);
            }
        }

        return isValidVerse;
    }

    public static boolean isValidWerkwoord(final String curKeyArg, final String curArg, final File curFile, final String vs) {
        var isValid = true;

        if (argumentFound("aanheffen", "aanhef", curKeyArg, curArg)) {
            isValid = !ValidHeffen.isAanhef(curFile, vs);
        } else if (argumentFound("heffen", "heft", curKeyArg, curArg)) {
            isValid = !ValidHeffen.isHeft(curFile, vs);
        } else if (argumentFound("wassen", "was", curKeyArg, curArg)) {
            isValid = !isValidVerse(curFile, vs, "2Sam-11.html#vs2")
                    && !isValidVerse(curFile, vs, "2Sam-19.html#vs24")
                    && !isValidVerse(curFile, vs, "2Chr-04.html#vs6");
        }

        return isValid;
    }

    private static boolean argumentFound(final String keyArg, final String arg, final String curKeyArg, final String curArg) {
        return keyArg.equals(curKeyArg) &&
                arg.equals(curArg);
    }

    private static boolean argumentsFound(final String arg1, final String arg2, final String curArg1, final String curArg2) {
        return (arg1.equals(curArg1) || arg1.equals(curArg2))
                && (arg2.equals(curArg1) || arg2.equals(curArg2));
    }

}
