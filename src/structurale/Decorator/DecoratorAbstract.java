package structurale.Decorator;

public abstract class DecoratorAbstract implements MesajBilet {

    private MesajBiletManager mesajBilet;

    public DecoratorAbstract(MesajBiletManager mesajBilet) {
        this.mesajBilet = mesajBilet;
    }

    @Override
    public void mesajBilet() {
        mesajBilet.mesajBilet();
    }

    public abstract void mesajBiletAcasa();
}
