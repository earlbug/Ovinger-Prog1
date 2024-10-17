public class Tekstbehandling {
    private String behandletTekst;

    public Tekstbehandling(String inpTekst){
        this.behandletTekst = inpTekst;
    }
    //splitter for hvert mellomrom
    public int finnAntallOrd(){
        String[] ordListe = behandletTekst.split(" ");
        int antallOrd = ordListe.length;
        return antallOrd;
    }

    public float finnGjenomsnitligOrdlengde(){
        String[] ordListe = behandletTekst.split(" ");
        int bokstaverPerOrd = 0;
        for (int i = 0; i < ordListe.length; i++) {
            bokstaverPerOrd += ordListe[i].length();
        }

        return (float)bokstaverPerOrd/(float)ordListe.length;
    }

    public float antallOrdPerPeriode(){
        String[] setningerAdskiltAvPerioder = behandletTekst.split("[.!:?]");
        String[] ordAdskiltAvPerioderOgMellomrom = behandletTekst.split("[.!:? ]");
        float ordPerPeriode = (float)ordAdskiltAvPerioderOgMellomrom.length/(float)setningerAdskiltAvPerioder.length;
        return ordPerPeriode;

    }

    public Tekstbehandling erstattOrd(String ordErstattFra, String ordErstattTil){
        String[] stringOrd = behandletTekst.split(" ");
        StringBuilder nySetning = new StringBuilder();
        for (int i = 0; i < stringOrd.length; i++) {
            if (stringOrd[i].equals(ordErstattFra)){
                nySetning.append(ordErstattTil);
            } else {
                nySetning.append(stringOrd[i]);
            }
            nySetning.append(" ");
        }
        return new Tekstbehandling(nySetning.toString());
    }

    public String tilStoreBokstaver(){
        return this.behandletTekst.toUpperCase();
    }

    public String tilStreng(){
        return this.behandletTekst;
    }
}
