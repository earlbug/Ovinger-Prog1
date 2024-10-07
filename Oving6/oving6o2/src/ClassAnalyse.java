import java.util.Arrays;

public class ClassAnalyse {
    int[] antallTegn = new int[30];
    //lagde egen bokstavindeks så æøå kan kjøres i løkker
    final String[] arrBokstaver = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
    final int[] arrUnicode = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 230, 248, 229};

    public ClassAnalyse() {

    }

    public void leggTilTextIStatistikken(String inpText){
        String text = inpText.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            int index = 29;
            int gjeldendeTegn = text.codePointAt(i);
            for (int j = 0; j < antallTegn.length-1; j++){
                if (gjeldendeTegn == arrUnicode[j]){
                    index = j;
                }
            }
            antallTegn[index] ++;
        }
    }


    private int finnBokstavIndex(int uniIndex) {//trenger flere ganger, så lagde en funksjon
        int index = 29;
        for (int i = 0; i < arrUnicode.length; i++) {
            if (uniIndex == arrUnicode[i]) {
                index = i;
                break;
            }
        }
        return index;
    }


    public int antForskjelligeBokstaver() {// finner alle verdiene som ikke er 0
        int antall = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            if (antallTegn[i] != 0) {
                antall += 1;
            }
        }
        return antall;
    }

    public int antallBokstaver() { //løkke som summerer verdiene i verdiarrayet, untatt spesielle tegn.
        int antBokstaver = 0;
        for (int i = 0; i < antallTegn.length - 1; i++) {
            antBokstaver += antallTegn[i];
        }
        return antBokstaver;
    }

    public float prosentIkkeBokstaver() {//enkel brøkregning. må konvertere til float
        return (float) antallTegn[29] / ((float) antallBokstaver() + (float) antallTegn[29]) * 100;
    }

    public int bokstavForekomst(String bokstav) {// hvor mange ganger oppgitt bokstav forekommer
        int uniIndex = bokstav.codePointAt(0);//finner unicode til bokstav
        int index = finnBokstavIndex(uniIndex);//finner dette programmets index til bokstaven
        return antallTegn[index];
    }

    public String mestBruktBokstav() { // kunne bare kjørt en løkke som fant verdien, for så å printa alle indexer med samme verdi.
        StringBuilder mestBrukteBokstaver = new StringBuilder();
        boolean[] indexHogesteVerdi = new boolean[28]; // boolean status forteller om korrespnderende bokstav er den høgeste
        int hogesteVerdi = 0;//høgeste forekomsten av en bokstav
        for (int i = 0; i < indexHogesteVerdi.length; i++) {
            if (antallTegn[i] > hogesteVerdi) {//om ny høgeste verdi oppdaget
                // sett alle booleans til false
                Arrays.fill(indexHogesteVerdi, false);
                indexHogesteVerdi[i] = true;//sett ny bolean index til true
                hogesteVerdi = antallTegn[i];
            } else if (antallTegn[i] == hogesteVerdi) {// hvis tangerer høgeste verdi
                indexHogesteVerdi[i] = true;// sett denne boolean index også til true
            }
        }

        int flereBokstaver = 0;
        for (int i = 0; i < indexHogesteVerdi.length; i++) { //legg til alle bokstavene i return strengen
            if (indexHogesteVerdi[i]) {
                if (flereBokstaver > 0) {// legg til og hvis det er flere bokstaver
                    mestBrukteBokstaver.append(" og ");

                }
                mestBrukteBokstaver.append(arrBokstaver[i]);
                flereBokstaver++;
            }
        }
        return mestBrukteBokstaver.toString();

    }
}
