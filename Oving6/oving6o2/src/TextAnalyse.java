import java.util.Scanner;
public class TextAnalyse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ClassAnalyse textAnalyse = new ClassAnalyse();
        
        System.out.print("Skriv inn en setning du vil analysere: ");
        String setning = scanner.nextLine();
        
        System.out.print("Har du en favorittbokstav? ");
        String bokstav = scanner.nextLine();

        System.out.println("");
        System.out.println("Analyse av setning:");
        System.out.println("Teksten består av " + textAnalyse.antForskjelligeBokstaver() + " unike bokstaver.");
        System.out.println("Teksten består av " + textAnalyse.antallBokstaver() + " bokstaver totalt.");
        System.out.println("Setningen består av " + Math.round(textAnalyse.prosentIkkeBokstaver()) + "% ikke-bokstaver.");
        System.out.println("Bokstaven " + bokstav + " forekommer " + textAnalyse.bokstavForekomst(bokstav) + " ganger i teksten.");
        System.out.println("Bokstavene som forekommer flest ganger er " + textAnalyse.mestBruktBokstav());
        


    }
}
