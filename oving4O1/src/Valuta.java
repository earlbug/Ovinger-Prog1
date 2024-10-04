public class Valuta {
    private final String valutanavn;
    private final double kurs;

    public Valuta(String valutanavn, double kurs){
        this.valutanavn = valutanavn;
        this.kurs = kurs;
    }

    public double tilNOK(double inpKronasje){
        return inpKronasje * kurs;
    }

    public double fraNOK(double inpKronasje){
        return inpKronasje / kurs;
    }

    public String getValutaNavn(){
        return valutanavn;
    }

}
