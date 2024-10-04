import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String metodeTegn = "";
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("vennligst skriv inn teller for brøk en");
            float inpTeller1 = scanner.nextFloat();
            System.out.println("vennligst skriv inn nevner for brøk en");
            float inpNevner1 = scanner.nextFloat();
            Brok brok1 = new Brok(inpTeller1, inpNevner1);
            
            System.out.println("vennligst skriv inn teller for brøk to");
            float inpTeller2 = scanner.nextFloat();
            System.out.println("vennligst skriv inn nevner for brøk to");
            float inpNevner2 = scanner.nextFloat();
            Brok brok2 = new Brok(inpTeller2, inpNevner2);
            
            System.out.println("hva vil du gjøre med brøken?");
            System.out.println("1. gange");
            System.out.println("2. dele");
            System.out.println("3. addere");
            System.out.println("4. subtrakere");
            int inpMetode = scanner.nextInt(); 
            
            Brok brok1Foer = new Brok(brok1.getTeller(), brok1.getNevner());
            
            switch (inpMetode) {
            case 1:
            brok1.gange(brok2);
                metodeTegn = "*";
                break;
            case 2:
            brok1.dele(brok2);
            metodeTegn = "/";
            break;
            case 3:
            brok1.pluss(brok2);
                metodeTegn = "+";
                break;            
                case 4:
                brok1.minus(brok2);
                metodeTegn = "-";
                break;                
                
                default:
                break;
            }   
            
            System.out.println(brok1Foer.getTeller() + "/" + brok1Foer.getNevner() + " " + 
            metodeTegn + " " + brok2.getTeller() + "/" + brok2.getNevner() + " " +
            "=" + " " + brok1.getTeller() + "/" + brok1.getNevner());
        } catch (IllegalArgumentException e) {
            System.out.println("Feil: " + e.getMessage());
        }
    }
}