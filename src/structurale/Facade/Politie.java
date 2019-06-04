package structurale.Facade;

public class Politie {
    public static boolean verificareAntecedente(Suporter suporter){
        return suporter.isAreAntecedente();
    }

    public static boolean esteCautatDePolitie(Suporter suporter){
        return suporter.isEsteCautatDePolitie();
    }
}
