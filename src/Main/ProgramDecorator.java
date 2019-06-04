package Main;

import structurale.Decorator.DecoratorBiletAcasa;
import structurale.Decorator.MesajBiletManager;

public class ProgramDecorator {

    public static void main(String[] args) {
        MesajBiletManager bilet = new MesajBiletManager();
        bilet.mesajBilet();

        DecoratorBiletAcasa biletAcasa=new DecoratorBiletAcasa(bilet);
        biletAcasa.mesajBiletAcasa();
    }
}
