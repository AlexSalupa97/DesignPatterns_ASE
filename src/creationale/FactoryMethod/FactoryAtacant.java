package creationale.FactoryMethod;

public class FactoryAtacant implements Factory {

    @Override
    public Jucator createInstance() {
        return new Atacant();
    }
}
