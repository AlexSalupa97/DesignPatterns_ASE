package structurale.Flyweight;

public class Optionale {
    private String culoareTricou;
    private int locOcupat;

    public Optionale(String culoareTricou, int locOcupat) {
        this.culoareTricou = culoareTricou;
        this.locOcupat = locOcupat;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public void setCuloareTricou(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }

    public int getLocOcupat() {
        return locOcupat;
    }

    public void setLocOcupat(int locOcupat) {
        this.locOcupat = locOcupat;
    }
}

