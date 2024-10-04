public class Brok {
    public float teller;
    public float nevner;

    public Brok(float teller, float nevner){
        if(nevner == 0){
            throw new IllegalArgumentException("Nevneren kan ikke være null.");
        }
        this.teller = teller;
        this.nevner = nevner;

    }
    
    public Brok(float teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public float getTeller(){
        return teller;
    }
    public float getNevner(){
        return nevner;
    }
    
    //public void forkort(){
    //    lag array med faktorene til teller og nevner
    //    sjekk om de har noen til felles, slett om det er tilfflellet.
    //    sett teler og nevner til 
    //}
    public void pluss(Brok inpBrok){
        teller = teller * inpBrok.getNevner() + inpBrok.getTeller() * nevner;
        nevner = nevner * inpBrok.getNevner();
    }
    public void minus(Brok inpBrok){
        teller = teller * inpBrok.getNevner() - inpBrok.getTeller() * nevner;
        nevner = nevner * inpBrok.getNevner();
    }
    public void gange(Brok inpBrok){
        teller = teller * inpBrok.getTeller();
        nevner = nevner * inpBrok.getNevner();
    }
    public void dele(Brok inpBrok){
        teller = teller * inpBrok.getTeller();
        nevner = nevner * inpBrok.getNevner();
    }
}
