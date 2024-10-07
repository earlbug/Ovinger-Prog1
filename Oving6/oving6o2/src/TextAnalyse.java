import java.util.Scanner;
public class TextAnalyse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ClassAnalyse textAnalyse = new ClassAnalyse();

        while(true){


            System.out.print("Skriv inn en setning du vil analysere: ");
            String setning = scanner.nextLine();

            System.out.print("Har du en favorittbokstav? ");
            String bokstav = scanner.nextLine();

            textAnalyse.leggTilTextIStatistikken(setning);

            System.out.println("");
            System.out.println("Analyse av setninger:");
            System.out.println("Tekstene består av " + textAnalyse.antForskjelligeBokstaver() + " unike bokstaver.");
            System.out.println("Tekstene består av " + textAnalyse.antallBokstaver() + " bokstaver totalt.");
            System.out.println("Setningene består av " + Math.round(textAnalyse.prosentIkkeBokstaver()) + "% ikke-bokstaver.");
            System.out.println("Bokstaven " + bokstav + " forekommer " + textAnalyse.bokstavForekomst(bokstav) + " ganger i tekstene.");
            System.out.println("Bokstavene som forekommer flest ganger er " + textAnalyse.mestBruktBokstav());
        }
    }
}
