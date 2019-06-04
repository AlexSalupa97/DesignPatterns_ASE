package structurale.Composite;

public class LocScaun implements Sectiune {

    @Override
    public void adaugareSectiune(Sectiune sectiune) throws Exception {
        throw new Exception("Metoda neimplementata");
    }

    @Override
    public void stergereSectiune(Sectiune sectiune) throws Exception {
        throw new Exception("Metoda neimplementata");
    }

    @Override
    public void afisareSectiune() {
        System.out.println("Scaun");
    }
}
