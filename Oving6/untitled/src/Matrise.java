import java.util.Scanner;

public final class Matrise {
    private final int[][] matrise0;
    private static Scanner scanner;


    private Matrise(int[][] inpMatrise){
        this.matrise0 = inpMatrise;
        System.out.print(inpMatrise);
    }

    public static Matrise fyllMatrise(int[][] inp0){
        return new Matrise (inp0);
    }
}
