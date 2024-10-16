import java.util.Scanner;
public class Main {
    private static Matrise matrise1 = null;


    private static Matrise matrise0 = null;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.println("Matrise prorgram:");

        System.out.println("Matrise 1:");

        //lager et nytt matriseobjekt
        matrise0 = Matrise/*referer til klassen, ikke objekt*/.fyllMatrise(lagIntMatrise());
        Matrise.skrivUtMatrise(matrise0);
        visMeny();
    }


    public static void visMeny(){

        System.out.println("tast 1 for å addere dene matrisen til en annen.");
        System.out.println("tast 2 for å matrisemultiplisere dene matrisen til en annen.");
        System.out.println("tast 3 for å transponere denne matrisen .");
        int menyInput = scanner.nextInt();
        switch (menyInput) {
            case 1: matrise1 = Matrise.fyllMatrise(lagIntMatrise());
                System.out.println("Matrise nr. 2:");
                Matrise.skrivUtMatrise(matrise1);
                Matrise a = Matrise.addereMatrise(matrise0, matrise1);
                System.out.println("Resultat:");
                Matrise.skrivUtMatrise(a);
                break;
            case 2: System.out.println("Lag matrise nr. 2 (antall rader må være lik " + matrise0.getAntallKolonner() + "):");
                matrise1 = Matrise.fyllMatrise(lagIntMatrise());
                System.out.println("Matrise nr. 2:");
                Matrise.skrivUtMatrise(matrise1);
                Matrise b = Matrise.multiplisereMatrise(matrise0, matrise1);
                if (b != null) {
                    System.out.println("Resultat:");
                    Matrise.skrivUtMatrise(b);
                } else {
                    System.out.println("Noe gikk galt, antall kolonner i matrise 1 må være lik antall rader i matrise 2");
                }
                break;
            case 3: Matrise c = Matrise.transponereMatrise(matrise0);
                System.out.println("Resultat:");
                Matrise.skrivUtMatrise(c);
                break;
            default:System.out.println("Du må taste inn et tall mellom 1 og 3");
                visMeny();
                break;
        }
    }



    public static int[][] lagIntMatrise(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("vennligst skrivinn hvor mange rader matrisen skal ha:");
        int rader = scanner.nextInt();
        System.out.print("vennligst skriv inn hvor mange kolonner matrisen skal ha:");
        int inpKolonner = scanner.nextInt();


        System.out.println("vannligst fyll ut matrisen:");
        int[][] nyIntMatrise = new int[rader][inpKolonner];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < inpKolonner; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]:");
                nyIntMatrise[i][j] = scanner.nextInt();
            }

        }
        return nyIntMatrise;

    }
    /*
    public static void skrivUtMatrise(Matrise inpMatrise){
        int rader = inpMatrise.getAntallRader();
        int kolonner = inpMatrise.getAntallKolonner();

        for (int i = 0; i < rader; i++) {
            System.out.print("[");

            for (int j = 0; j < kolonner; j++) {
                System.out.print(inpMatrise[i][j]);
            }
            System.out.println("]");
        }
    }
    */



}