package Kunde;
//import Bank.LiveBank; bedre måte, så slipper man å skrrive Bank. flere gganger

public class Kunde {
    private String brukernavn;
    private String Passord;
    private Double Kroner;
    private boolean login;

    public boolean login(){

        Bank.LiveBank bank = new Bank.LiveBank();
        boolean loginResult = bank.validerKunde("admin", "admin");
        return loginResult;
    }
}

