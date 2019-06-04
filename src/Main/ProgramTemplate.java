package Main;

import comportamentale.Template.*;

public class ProgramTemplate {
    public static void main(String[] args){
        PasiIntrareStadion intrareStadion=new AsezareCoada();
        intrareStadion.pasiIntrareStadion();

        intrareStadion=new PrezentareBilet();
        intrareStadion.pasiIntrareStadion();

        intrareStadion=new ControlCorporal();
        intrareStadion.pasiIntrareStadion();

        intrareStadion=new IntrareStadion();
        intrareStadion.pasiIntrareStadion();

        intrareStadion=new OcupareLoc();
        intrareStadion.pasiIntrareStadion();
    }
}
