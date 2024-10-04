import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        Valuta sek = new Valuta("sek", 1.04f);
        Valuta euro = new Valuta("euro", 11.8f);
        Valuta dollar = new Valuta("dollar", 13.9f);
        Scanner scanner = new Scanner(System.in);

        int errorCode = 0;
        int inpValutaType;
        int inpTilFraNok;
        int inpKronasje;
        Valuta valutaGjeldende = null;





        do{
            switch (errorCode) {
                case 1:
                    System.out.println("Vennligst skriv inne t tall mellom 1 og 4");
                    break;
                case 2:
                    System.out.println("Du avsluttet programmet.");
                    System.exit(0);
                default:
            }

            System.out.println("velg valuta:");
            System.out.println("1. sek");
            System.out.println("2. euro");
            System.out.println("3. dollar");
            System.out.println("4. avslutt");

            inpValutaType = scanner.nextInt();
            
            if(inpValutaType<1||inpValutaType>4){
                errorCode = 1;
            } else if(inpValutaType == 4){
                errorCode=2;
            } else{
                errorCode = 0;
            }
        } while(errorCode!=0);

        if(inpValutaType==1){
            valutaGjeldende=sek;
        }
        if(inpValutaType==2){
            valutaGjeldende=euro;
        }
        if(inpValutaType==3){
            valutaGjeldende=dollar;
        }





        do{
            switch (errorCode) {
                case 1:
                    System.out.println("Vennligst skriv inne t tall mellom 1 og 3");
                    break;
                case 2:
                    System.out.println("Du avsluttet programmet.");
                    System.exit(0);
                default:
            }

            System.out.println("Til eller fra nok?");
            System.out.println("1. til NOK");
            System.out.println("2. fra NOK");
            System.out.println("3. avslutt");

            inpTilFraNok = scanner.nextInt();
            
            if(inpTilFraNok<1||inpTilFraNok>3){
                errorCode = 1;
            } else if(inpTilFraNok == 3){
                errorCode=2;
            } else{
                errorCode = 0;
            }


        } while(errorCode!=0);






        do{
            switch (errorCode) {
                case 1:
                    System.out.println("Vennligst skriv inn et tall over 0");
                    break;

            }

            System.out.println("hvor mye skal omregnes?");


            inpKronasje = scanner.nextInt();
            
            if(inpKronasje<1){
                errorCode = 1;
            }
            else{
                errorCode = 0;
            }


        } while(errorCode!=0);

        if(inpTilFraNok==1){
            System.out.println(inpKronasje + " nok er verdt " + valutaGjeldende.fraNOK(inpKronasje) + " " + valutaGjeldende.getValutaNavn());
        }
        if(inpTilFraNok==2){
            System.out.println(inpKronasje + " " + valutaGjeldende.getValutaNavn() + " er verdt " + valutaGjeldende.tilNOK(inpKronasje) + "NOK");
        }


    }
}
