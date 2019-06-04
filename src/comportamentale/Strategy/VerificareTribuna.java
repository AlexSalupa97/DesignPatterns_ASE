package comportamentale.Strategy;

public class VerificareTribuna implements ModVerificare {
    @Override
    public void verificare() {
        System.out.println("S-a facut verificarea bagajelor la tribuna");
    }
}
