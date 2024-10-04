import java.util.Random;
public class MinRandom {
    Random randTall;
    public MinRandom(){
        randTall = new Random();
    }

    public int nesteHeltall(int nedre, int ovre){
        return randTall.nextInt(ovre + 1 - nedre) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        return (ovre - nedre) * randTall.nextDouble() + nedre;
    }

}
