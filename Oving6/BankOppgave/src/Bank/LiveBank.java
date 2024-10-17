package Bank;



public class LiveBank {
    public LiveBank(){

    }

    public boolean validerKunde(String brukernavn, String passord){
        if (brukernavn == "admin" && passord == "admin"){
            return true;
        }
        else {
            return false;
        }
    }
}
