package comportamentale.State;

public class LocLiber implements StareLoc {
    @Override
    public void doAction(Scaun scaun) {
        if(!(scaun.getStareLoc() instanceof LocLiber))
        {
            scaun.setStareLoc(new LocLiber());
            System.out.println("Stare - Liber");
        }
        else
            System.out.println("Nu se poate rezerva");
    }
}
