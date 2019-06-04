package Main;

import structurale.Facade.Facade;
import structurale.Facade.Suporter;

public class ProgramFacade {

    public static void main(String[] args){
        Suporter suporter=new Suporter(true,true,true);
        Suporter suporter1=new Suporter(false,true,true);

        Facade.verificareBilet(suporter);
        Facade.verificareBilet(suporter1);
    }
}
