import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random terning = new Random();
        Players player1 = new Players();
        Players player2 = new Players();
        int runder = 0;

        

        while(player1.getSumPoeng()<100 && player2.getSumPoeng()<100){
            player1.kastTerning();
            player2.kastTerning();
            runder +=1;
            
            System.out.println("RundeNr" + runder +":");
            System.out.println("Spiller 1 : " + player1.getSumPoeng() + " poeng.");
            System.out.println("Spiller 2 : " + player2.getSumPoeng() + " poeng."); 
        }
        if (player1.getSumPoeng() >= 100) {
            player1.erFerdig("1");
        }
        else{
            player2.erFerdig("2");
        }
    }
}
