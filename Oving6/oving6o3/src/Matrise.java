import java.util.Scanner;

public final class Matrise {
    private final int[][] matrise0;
    private static Scanner scanner;

    //kan kun kunstrueres fra seg seg selv
    private Matrise(int[][] inpIntMatrise){
        this.matrise0 = inpIntMatrise;

    }

    //lager og returnerer et matriseobjekt fra en int matrise
    public static Matrise fyllMatrise(int[][] inp0){
        return new Matrise (inp0);
    }

    public
}
