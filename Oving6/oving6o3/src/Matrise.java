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

    public int getAntallRader(){
        return this.matrise0.length;
    }
    public int getAntallKolonner(){
        return this.matrise0[0].length;
    }

    public static void skrivUtMatrise(Matrise inpMatrise){
        int rader = inpMatrise.getMatrise().length;
        int kolonner = inpMatrise.getMatrise()[0].length;

        for (int i = 0; i < rader; i++) {
            System.out.print("[ ");


            for (int j = 0; j < kolonner; j++) {
                System.out.print(inpMatrise.getMatrise()[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public int[][] getMatrise() {//returnerer et int matrise
        return this.matrise0;
    }

    //addere
    public static Matrise addereMatrise(Matrise inpMatrise1, Matrise inpMatrise2) {
        int rader = inpMatrise1.getAntallRader();
        int kolonner = inpMatrise1.getAntallKolonner();
        int[][] intMatrise = new int[rader][kolonner];

        for(int i = 0; i < rader; ++i) {
            for(int j = 0; j < kolonner; ++j) {
                intMatrise[i][j] = inpMatrise1.matrise0[i][j] + inpMatrise2.matrise0[i][j];
            }
        }

        return new Matrise(intMatrise);
    }

    //multiplisere
    public static Matrise multiplisereMatrise(Matrise matrise0, Matrise matrise1){
        int rad0 = matrise0.getMatrise().length;
        int kol0 = matrise0.getMatrise()[0].length;
        int rad1 = matrise1.getMatrise().length;
        int kol1 = matrise1.getMatrise()[0].length;

        if(kol0 == rad1){
            return null;
        }
        else{
            int[][] intMatrise = new int[rad0][kol1];//lager resultatmatrise
            //multipliserer
            for (int i = 0; i < kol1; i++) {
                for (int j = 0; j < rad0; j++) {
                    for (int k = 0; k < kol0; k++) {
                        intMatrise[j][i] += matrise0.getMatrise()[j][k] * matrise1.getMatrise()[k][i];
                    }

                }

            }
            return new Matrise(intMatrise);
        }

    }

    //transponere
    public static Matrise transponereMatrise(Matrise inpMatrise) {
        int rader = inpMatrise.getMatrise().length;
        int kolonner = inpMatrise.getMatrise()[0].length;
        int[][] intMatrise = new int[kolonner][rader];

        for(int i = 0; i < rader; ++i) {
            for(int j = 0; j < kolonner; ++j) {
                intMatrise[j][i] = inpMatrise.getMatrise()[i][j];
            }
        }

        return new Matrise(intMatrise);
    }

}
