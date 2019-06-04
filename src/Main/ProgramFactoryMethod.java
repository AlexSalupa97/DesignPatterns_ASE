package Main;

import creationale.FactoryMethod.*;

public class ProgramFactoryMethod {

    public static void afisareJucator(Factory factory){
        Jucator jucator=factory.createInstance();
        jucator.descriere();
    }

    public static void main(String[] args){
        afisareJucator(new FactoryAtacant());
    }
}
