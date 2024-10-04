import java.util.Scanner;

public class OvingTest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);//lager en scanner med navn scanner

        System.out.print("Skriv antall tommer: ");//skriver
        double tommer = scanner.nextDouble(); //lager variablen tommer og henter vardien fra scanner
        double cm = tommer * 2.54;//formel
        
    
        System.out.println(tommer + " tommer er  " + cm + " cm.");

        scanner.close();

    }
}

class OvingTest2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("omregning til sekunder.");
        System.out.println("Skriv kun inn antall timer: ");
        double inpTimer = scanner.nextDouble();
        System.out.println("Skriv kun inn antall minutter: ");
        double inpMinutter = scanner.nextDouble();
        System.out.println("Skriv kun inn antall sekunder: ");
        double inpSekunder = scanner.nextDouble();

        double sekunder = inpTimer * 60 * 60 + inpMinutter * 60 + inpSekunder;

        System.out.println(inpTimer + " timer, " + inpMinutter + " minutter og " +  inpSekunder + " sekunder er tilsammen " + sekunder + " sekunder");
        
    }
}

class OvingTest3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("omregning til sekunder");
        System.out.println("skriv inn antall sekunder: ");
        int inpSekunder = scanner.nextInt();
        int antTimer = inpSekunder / 60 / 60;
        int antMinutter = inpSekunder / 60 % 60;
        int antSekunder = inpSekunder % 60;

        System.out.println(inpSekunder + " sekunder er lik " + antTimer + " timer, " + antMinutter + " minutter og " + antSekunder + " sekunder.");


    }
}