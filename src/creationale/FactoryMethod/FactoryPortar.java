package creationale.FactoryMethod;

public class FactoryPortar implements Factory {

    @Override
    public Jucator createInstance() {
        return new Portar();
    }
}
