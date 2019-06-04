package comportamentale.Strategy;

public class Suporter {
    private ModVerificare modVerificare;

    public Suporter(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void stabilireVerificare(){
        modVerificare.verificare();
    }
}
