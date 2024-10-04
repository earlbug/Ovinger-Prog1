import java.util.Scanner;

public class oving2o1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Er året skuddår?");
        System.out.print("Skriv inn årstall:");
        Double inpAarstall = scanner.nextDouble();

        if (inpAarstall % 100 == 0) {// hvis årstall er delelig på 100, så sjekk om det går opp i 400.
            if (inpAarstall % 400 == 0) {
                System.out.println("Året " + inpAarstall + " er et skuddår!");
            } else {
                System.out.println("Året " + inpAarstall + " er IKKE et skuddår!");
            }

        } else if (inpAarstall % 4 == 0) {// så lenge år ikke er delelig på 100, sjekk om delelig på 4
            System.out.println("Året " + inpAarstall + " er et skuddår!");
        } else {
            System.out.println("Året " + inpAarstall + " er IKKE et skuddår!");
        }

    }
}

class oving2o2 {
    public static void main(String[] args) {

        double vektA = 450;
        double prisA = 35.9;
        double vektB = 500;
        double prisB = 39.5;


        if (prisA / vektA < prisB / vektB) { // er pris per kg a mindre enn pris per kg b
            System.out.println("Kjøtt A er billigst.");
        } else if (prisA / vektA > prisB / vektB) {// er pris per kg b mindre enn pris per kg a
            System.out.println("Kjøtt B er billigst.");
        } else {
            System.out.println("prisen er den samme");
        }

    }
}