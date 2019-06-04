package structurale.Flyweight;

public class Suporter implements ISuporter{
    private int lungime;
    private int latime;

    public Suporter(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Suporter{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }

    @Override
    public void descriereOptionale(Optionale optionale) {
        System.out.println(this.toString()+" "+optionale.getCuloareTricou()+" "+optionale.getLocOcupat());
    }
}
