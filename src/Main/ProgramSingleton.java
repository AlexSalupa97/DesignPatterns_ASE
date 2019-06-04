package Main;

import creationale.Singleton.Antrenor;

public class ProgramSingleton {

    public static void main(String[] args){
        Antrenor antrenor=Antrenor.getInstance();
        Antrenor antrenor1=Antrenor.getInstance();

        System.out.println(antrenor.toString());
        System.out.println(antrenor1.toString());
    }
}
