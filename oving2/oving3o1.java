import java.util.Scanner;

public class oving3o1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        // spørr etter tall til gangetabellen
        System.out.println("Gangetabellen");
        System.out.println("Skriv inn ditt tall, som gangetabellen skal starte fra:");
        int tallMin = scanner.nextInt();
        System.out.println("Skriv inn ditt tall, som gangetabellen skal slutte med:");
        int tallMax = scanner.nextInt();

        int i = tallMin;

        while (i <= tallMax) { // skriver ut overskrift til hver gangetabell, gjentar for antall heltall, fra
                               // tallmin til tallmax
            System.out.println(" ");
            System.out.println(i + "-gangen:");
            int j = 0;
            while (j <= 10) { // skriver ut hvert element i gangetabell i fra 1-10
                System.out.println(i + " x " + j + " = " + i * j);
                j++;
            }
            i++;

        }
    }
}

class oving3o2 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        boolean primtall = true; // er et primtall til det motsatte er bevist
        boolean godkjent = false;

        do {
            System.out.println("Skriv et tall du lurer på om er primtall:");
            int inpTall = scanner.nextInt();

            if (inpTall != ) {
                godkjent = true;
            }
            else {
                System.out.println("Vennligst skriv inn et heltall");
            }
        } 
        while (!godkjent);



       
        // gjenta til enten finner et tall som kan deles på, eller til alle tall er
        // prøvd
        for (int i = inpTall - 1; i > 1 && primtall; i--) {
            if (inpTall % i == 0) {
               primtall = false;// om tallet kan deles på noe, er det ikke primtall
            }   
        }

        if (primtall) {
            System.out.println(inpTall + " er et primtall");
        } 
        else { 
            System.out.println(inpTall + " er et IKKE primtall");
    

        }
    }
}
class oving3PrintPrimtall {
    public static void main(String[] args) {

        

        boolean primtall = true;

        for (int i = 3; i < 100; i++) {
            primtall = true;

            for (int j = 2; j < i && primtall; j++) {
                if (i % j == 0) {
                    primtall = false;
                }

            }
            if (primtall) {
                System.out.println(i);
            }

        }

    }

}
