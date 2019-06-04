package structurale.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<Integer,ISuporter> mapSuporteri;

    public FlyweightFactory() {
        mapSuporteri=new HashMap<>();
    }

    public int getNrSuporteri(){
        return mapSuporteri.size();
    }

    public ISuporter getSuporter(int id){
        ISuporter suporter=mapSuporteri.get(id);
        if(suporter==null){
            suporter=new Suporter(180,200);
            mapSuporteri.put(id,suporter);
        }
        return suporter;
    }
}
