package creationale.SimpleFactory;

public class SimpleFactory {

    public static Jucator createInstance(Pozitie pozitie) {
        switch (pozitie) {
            case portar:
                return new Portar();
            case fundas:
                return new Fundas();
            case atacant:
                return new Atacant();
            default:
                return null;
        }
    }

}
