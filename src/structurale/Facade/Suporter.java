package structurale.Facade;

public class Suporter {
    private boolean areBiletPersonal;
    private boolean esteCautatDePolitie;
    private boolean areAntecedente;

    public Suporter(boolean areBiletPersonal, boolean esteCautatDePolitie, boolean areAntecedente) {
        this.areBiletPersonal = areBiletPersonal;
        this.esteCautatDePolitie = esteCautatDePolitie;
        this.areAntecedente = areAntecedente;
    }

    public boolean isAreBiletPersonal() {
        return areBiletPersonal;
    }

    public void setAreBiletPersonal(boolean areBiletPersonal) {
        this.areBiletPersonal = areBiletPersonal;
    }

    public boolean isEsteCautatDePolitie() {
        return esteCautatDePolitie;
    }

    public void setEsteCautatDePolitie(boolean esteCautatDePolitie) {
        this.esteCautatDePolitie = esteCautatDePolitie;
    }

    public boolean isAreAntecedente() {
        return areAntecedente;
    }

    public void setAreAntecedente(boolean areAntecedente) {
        this.areAntecedente = areAntecedente;
    }
}
