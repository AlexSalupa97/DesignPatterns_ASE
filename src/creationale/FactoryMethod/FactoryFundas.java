package creationale.FactoryMethod;

public class FactoryFundas implements Factory {

    @Override
    public Jucator createInstance() {
        return new Fundas();
    }
}
