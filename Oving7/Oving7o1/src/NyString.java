public class NyString {
    private final String denneString;

    public NyString(String inpString){
        this.denneString = inpString;
    }

    public NyString forkort(){
        String[] ordIListe = denneString.split(" ");
        StringBuilder forkortetString = new StringBuilder();
        for (int i = 0; i < ordIListe.length; i++) {

            forkortetString.append(ordIListe[i].charAt(0));
        }

        return new NyString(forkortetString.toString());
    }

    public NyString fjernBokstav(char inpBokstav){
        StringBuilder textUtenBokstav = new StringBuilder();
        for (int i = 0; i < denneString.length(); i++) {
            if (!(denneString.charAt(i) == inpBokstav)){
                textUtenBokstav.append(denneString.charAt(i));
            }

        }
        return new NyString(textUtenBokstav.toString());
    }

    public String toString(){
        return denneString;
    }

}
