import java.util.Random;

public class MainStatistikkk {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Random random = new Random();
        int[] antall = new int[10];
        for (int i = 0; i < 10000; i++) {
            int tall = random.nextInt(10);
            antall[tall] = antall[tall] + 1;

        }
        for (int i = 0; i < antall.length; i++) {
            StringBuilder stjerne = new StringBuilder();

            for (int j = 0; j < antall[i]/100; j++) {
                stjerne.append("*");
  
            }
            System.out.println(i + " : " + antall[i] + " " + stjerne.toString());
            
        }
    }
}
