import java.util.Random;


public class Players {
    public int sumPoeng;
    Random terning = new Random();

    public Players(){
        this.sumPoeng = 0;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public void kastTerning(){
        int terningkast = terning.nextInt(6) + 1;
        if(terningkast==1){
            sumPoeng = 0;
        }else{
            sumPoeng += terningkast;
        }
    }

    
    public void erFerdig(String spillerNr){
        System.out.println("Sipller " + spillerNr + " Vant!");
    }
}
