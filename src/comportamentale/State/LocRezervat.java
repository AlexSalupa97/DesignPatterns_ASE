package comportamentale.State;

public class LocRezervat implements StareLoc{

    @Override
    public void doAction(Scaun scaun) {
        if(scaun.getStareLoc() instanceof LocLiber) {
            scaun.setStareLoc(new LocRezervat());
            System.out.println("Stare - Rezervat");
        }
        else
            System.out.println("Nu se poate rezerva");
    }
}
