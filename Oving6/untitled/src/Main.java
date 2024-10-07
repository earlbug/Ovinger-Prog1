import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        System.out.println("Matrise prorgram:");
        System.out.print("vennligst skri vinn hvor mange rader matrisen skal ha:");
        int inpRader = scanner.nextInt();
        System.out.print("vennligst skri vinn hvor mange kolonner matrisen skal ha:");
        int inpKolonner = scanner.nextInt();
        int[][] nyMatrise = new int[inpRader][inpKolonner];

        System.out.println("Matrise 1:");


        System.out.println("Handlinger:");








        public static int[][] lagMatrise(int rader, int kolonner){


            System.out.print("vannligst fyll ut matrisen:");
            for (int i = 0; i < inpRader; i++) {
                for (int j = 0; j < inpKolonner; j++) {
                    System.out.print("[" + i + "]" + "[" + j + "]");
                    nyMatrise[i][j] = scanner.nextInt();
                }

            }
            return nyMatrise;

        }



    }
}