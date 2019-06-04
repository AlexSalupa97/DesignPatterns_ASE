package structurale.Composite;

public interface Sectiune {
    void adaugareSectiune(Sectiune sectiune) throws Exception;
    void stergereSectiune(Sectiune sectiune) throws Exception;
    void afisareSectiune();
}
