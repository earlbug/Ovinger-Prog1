import java.util.Scanner;
public class Main {
    //private static Matrise[] matrise = new Matrise[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.println("Matrise prorgram:");

        System.out.println("Matrise 1:");


         Matrise matrise0 = Matrise.fyllMatrise(lagIntMatrise());
         skrivUtMatrise();

        System.out.println("Handlinger:");





    }


    public static int[][] lagIntMatrise(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("vennligst skrivinn hvor mange rader matrisen skal ha:");
        int rader = scanner.nextInt();
        System.out.print("vennligst skriv inn hvor mange kolonner matrisen skal ha:");
        int inpKolonner = scanner.nextInt();


        System.out.println("vannligst fyll ut matrisen:");
        int[][] nyMatrise = new int[rader][inpKolonner];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < inpKolonner; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]:");
                nyMatrise[i][j] = scanner.nextInt();
            }

        }
        return nyMatrise;

    }

    public static void skrivUtMatrise(Matrise inpMatrise){
        int rader = inpMatrise.getAntallRader();
        int kolonner = inpMatrise.getAntallKolonner();

        for (int i = 0; i < inpMatrise.length; i++) {
            System.out.print("[");

            for (int j = 0; j < inpMatrise[0].length; j++) {
                System.out.print(inpMatrise[i][j]);
            }
            System.out.println("]");
        }
    }




}