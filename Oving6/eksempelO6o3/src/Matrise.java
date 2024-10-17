import java.util.Scanner;

public final class Matrise {
    private final double[][] m;
    private static Scanner in;


    private Matrise(double[][] var1) {
        this.m = var1;
    }

    public static Matrise fyllMatrise(double[][] var0) {
        return new Matrise(var0);
    }

    public double[][] getMatrise() {
        return this.m;
    }

    public static Matrise addereMatrise(Matrise var0, Matrise var1) {
        int var2 = var0.getAntallRader();
        int var3 = var0.getAntallKolonner();
        double[][] var4 = new double[var2][var3];

        for(int var5 = 0; var5 < var2; ++var5) {
            for(int var6 = 0; var6 < var3; ++var6) {
                var4[var5][var6] = var0.m[var5][var6] + var1.m[var5][var6];
            }
        }

        return new Matrise(var4);
    }

    public static Matrise multiplisereMatrise(Matrise var0, Matrise var1) {
        int var2 = var0.getMatrise().length;
        int var3 = var0.getMatrise()[0].length;
        int var4 = var1.getMatrise().length;
        int var5 = var1.getMatrise()[0].length;
        if (var3 != var4) {
            return null;
        } else {
            double[][] var6 = new double[var2][var5];

            for(int var7 = 0; var7 < var5; ++var7) {
                for(int var8 = 0; var8 < var2; ++var8) {
                    for(int var9 = 0; var9 < var3; ++var9) {
                        var6[var8][var7] += var0.getMatrise()[var8][var9] * var1.getMatrise()[var9][var7];
                    }
                }
            }

            return new Matrise(var6);
        }
    }

    public static Matrise transponereMatrise(Matrise var0) {
        int var1 = var0.getMatrise().length;
        int var2 = var0.getMatrise()[0].length;
        double[][] var3 = new double[var2][var1];

        for(int var4 = 0; var4 < var1; ++var4) {
            for(int var5 = 0; var5 < var2; ++var5) {
                var3[var5][var4] = var0.getMatrise()[var4][var5];
            }
        }

        return new Matrise(var3);
    }

    public int getAntallRader() {
        int var1 = this.m.length;
        return var1;
    }

    public int getAntallKolonner() {
        int var1 = this.m[0].length;
        return var1;
    }

    static {
        in = new Scanner(System.in);
    }
}


