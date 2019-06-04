package Main;

import comportamentale.State.LocLiber;
import comportamentale.State.LocOcupat;
import comportamentale.State.LocRezervat;
import comportamentale.State.Scaun;

public class ProgramState {

    public static void main(String[] args){
        Scaun scaun=new Scaun();
        new LocLiber().doAction(scaun);
        new LocLiber().doAction(scaun);
        new LocRezervat().doAction(scaun);
        new LocOcupat().doAction(scaun);
    }

}
