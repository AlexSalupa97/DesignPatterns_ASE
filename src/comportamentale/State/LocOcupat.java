package comportamentale.State;

public class LocOcupat implements StareLoc{

    @Override
    public void doAction(Scaun scaun) {
        if(scaun.getStareLoc() instanceof LocRezervat){
            scaun.setStareLoc(new LocOcupat());
            System.out.println("Stare - Ocupat");
        }
        else
            System.out.println("Nu se poate rezerva");
    }
}
