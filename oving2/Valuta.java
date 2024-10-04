import java.util.Scanner;

public class Valuta {
    private final String valutanavn;
    private final double kurs;
    
    public Valuta(String valutanavn, double kurs){
        this.valutanavn = valutanavn;
        this.kurs = kurs;
    }

    public double tilNOK(double belop) {
        return belop * kurs;
    }

    public double fraNOK(double belop){
        return belop / kurs;
    }

    public string getValutaNavn(){
        return valutanavn;
    }
}
