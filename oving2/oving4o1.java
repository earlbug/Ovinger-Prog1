import java.util.Scanner;
public class oving4o1 {
    public static void main(String[] args){
        Valuta USD = new Valuta("USD", 10);
        Valuta euro = new Valuta("EUR", 11);
        Valuta SVK = new Valuta("SEK", 1);

        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println(
                    "Skriv inn tall som korrespunderer til hva du vil gjøre: " + 
                    "1. Fra NOK" + 
                    "2. Til NOK" + 
                    "3. Avslutt" 
                    );
        
            int inpFraTil = scanner.nextInt();

        
        } while(inpFraTil<=3 && inpFraTil>=1);
        if(inpFraTil == 3){
            System.out.println("du avsluttet programmet.");
            System.exit(0);
        }

        System.out.println(
            "Velg valuta:" +
            "1: dollar" +
            "2: euro" +
            "3: svenske kroner" +
            "4: avslutt"
            );
        
        int inpValuta = scanner.nextInt();
      
        System.out.println("skriv inn antall du vil konvertere:");
        
        int inpANtall = scanner.nextInt();
        double ferdigBelop = 0;

        switch (inpValuta) {
            case 1:
                if (inpFraTil==1) {
                    ferdigBelop = USD.fraNOK(inpANtall);
                } else {
                    ferdigBelop = USD.tilNOK(inpANtall);
                }
                break;

            case 2:
                if (inpFraTil==1) {
                    ferdigBelop = euro.fraNOK(inpANtall);
                } else {
                    ferdigBelop = euro.tilNOK(inpANtall);
                }
                break;            
                
        
            default:
                break;
        }

        System.out.println("nyt beløp er " + ferdigBelop);
       
        
    }

}


