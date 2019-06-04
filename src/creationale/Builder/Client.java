package creationale.Builder;

public class Client {

    private String nume;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoare=" + bauturaRacoritoare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                '}';
    }
}
