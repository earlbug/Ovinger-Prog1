import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv inn antall linjer:");
        int inpAntallLinjer = scanner.nextInt();

        for(int i = 0; i<=inpAntallLinjer; i++){
            for(int j = 0; j< i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        
    }
}


 class likebent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv inn antall linjer:");
        int inpAntallLinjer = scanner.nextInt();

        for(int i = 0; i<=inpAntallLinjer; i++){
            for(int k = inpAntallLinjer; k>i; k--){
                System.out.print(" ");
            }
            for(int j = 0; j< i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        
    }
}