package Main;

import creationale.SimpleFactory.Jucator;
import creationale.SimpleFactory.Pozitie;
import creationale.SimpleFactory.SimpleFactory;

public class ProgramSimpleFactory {

    public static void main(String[] args){

        Jucator portar= SimpleFactory.createInstance(Pozitie.portar);
        Jucator fundas=SimpleFactory.createInstance(Pozitie.fundas);

        portar.descriere();
        fundas.descriere();
    }
}
