package structurale.Decorator;

public class DecoratorBiletAcasa extends DecoratorAbstract {

    public DecoratorBiletAcasa(MesajBiletManager mesajBilet) {
        super(mesajBilet);
    }

    @Override
    public void mesajBiletAcasa() {
        System.out.println("Mesaj bilet acasa");
    }
}
