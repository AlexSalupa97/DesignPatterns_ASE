package comportamentale.State;

public class Scaun {

    private StareLoc stareLoc;

    public Scaun() {
        this.stareLoc = null;
    }

    public StareLoc getStareLoc() {
        return stareLoc;
    }

    public void setStareLoc(StareLoc stareLoc) {
        this.stareLoc = stareLoc;
    }
}
