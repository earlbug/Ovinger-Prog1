import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vennligst skriv inn en setning du vil behandle:");
        String inpSetning = scanner.nextLine();
        Tekstbehandling tekstbehandling = new Tekstbehandling(inpSetning);
        System.out.println("vennligst tast hva du vil gjøre med teksten:");
        System.out.println("1: finne antall ord");
        System.out.println("2: finne gjennomsnttlig ordlengde");
        System.out.println("3: finne gjennomsnittlig antall ord per periode");
        System.out.println("4: skifte ut et ord med et annet");
        System.out.println("5: hente ut teksten slik den står");
        System.out.println("6: Hente ut teksten i store bokstaver");

        int valg = scanner.nextInt();
        scanner.nextLine();
        switch(valg){
            case 1:
                System.out.println("Antall ord i teksten: " + tekstbehandling.finnAntallOrd());
                break;
            case 2:
                System.out.println("Gjennomsnitlig ordlengde: " + tekstbehandling.finnGjenomsnitligOrdlengde());
                break;
            case 3:
                System.out.println("Gjennomsnitlig ord per periode: " + tekstbehandling.antallOrdPerPeriode());
                break;
            case 4:
                System.out.println("vennligst skriv inn hvilket ord du vil bytte fra: " );
                String inpOrdFra = scanner.nextLine();
                System.out.println("vennligst skriv inn hvilket ord du vil bytte til: " );
                String inpOrdtil = scanner.nextLine();
                System.out.println("ny Setning: " + tekstbehandling.erstattOrd(inpOrdFra, inpOrdtil).tilStreng());
                break;
            case 5:
                System.out.println(tekstbehandling.tilStreng());
                break;
            case 6:
                System.out.println(tekstbehandling.tilStoreBokstaver());
                break;

        }

    }
}