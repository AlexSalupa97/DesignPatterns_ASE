package Main;

import structurale.Flyweight.FlyweightFactory;
import structurale.Flyweight.Optionale;
import structurale.Flyweight.Suporter;

public class ProgramFlyweight {
    public static void main(String[] args){
        Optionale optionale=new Optionale("Negru",10);
        Optionale optionale1=new Optionale("Negru",11);
        Optionale optionale2=new Optionale("Negru",12);
        FlyweightFactory factory=new FlyweightFactory();

        Suporter suporter=(Suporter)factory.getSuporter(1);
        suporter.descriereOptionale(optionale);
        suporter.descriereOptionale(optionale1);
        suporter.descriereOptionale(optionale2);

    }
}
