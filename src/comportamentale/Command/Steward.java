package comportamentale.Command;

import java.util.ArrayList;

public class Steward {

    private ArrayList<ComandaSteward> listaComenzi;

    public Steward() {
        listaComenzi=new ArrayList<>();
    }

    public void trimitereComenzi(ISuporter suporter, int idComanda){
        if(idComanda==1)
            listaComenzi.add(new ComandaAcceptare(suporter));
        if(idComanda==2)
            listaComenzi.add(new ComandaRefuzare(suporter));
    }

    public void procesareComenzi(){
        for(ComandaSteward comandaSteward:listaComenzi)
            comandaSteward.execute();
        listaComenzi.clear();
    }
}
