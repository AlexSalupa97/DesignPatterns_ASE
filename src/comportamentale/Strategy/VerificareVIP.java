package comportamentale.Strategy;

public class VerificareVIP implements ModVerificare {

    @Override
    public void verificare() {
        System.out.println("S-a facut verificarea biletului VIP");
    }
}
