package Main;


import structurale.Proxy.ProxySuporter;
import structurale.Proxy.Suporter;

public class ProgramProxy {

    public static void main(String[] args){
        Suporter suporter=new Suporter(18);
        ProxySuporter proxySuporter=new ProxySuporter(suporter);
        proxySuporter.achizitionareBilete();
    }
}
