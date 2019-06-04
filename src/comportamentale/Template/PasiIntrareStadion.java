package comportamentale.Template;

public abstract class PasiIntrareStadion {

    public abstract void asezareCoada();
    public abstract void prezentareBilet();
    public abstract void controlCorporal();
    public abstract void intrareStadion();
    public abstract void ocupareLoc();

    public void pasiIntrareStadion(){
        asezareCoada();
        prezentareBilet();
        controlCorporal();
        intrareStadion();
        ocupareLoc();
    }
}
