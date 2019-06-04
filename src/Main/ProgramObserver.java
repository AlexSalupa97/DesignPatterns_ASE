package Main;

import comportamentale.Observer.SalaSport;
import comportamentale.Observer.Suporter;

public class ProgramObserver {

    public static void main(String[] args){
        Suporter suporter=new Suporter();
        Suporter suporter1=new Suporter();
        Suporter suporter2=new Suporter();

        SalaSport salaSport=new SalaSport();

        salaSport.adaugareObserver(suporter);
        salaSport.adaugareObserver(suporter1);

        salaSport.trimitereNotificare("Este un nou meci disponibil de fotbal la sala noastra");

        salaSport.adaugareObserver(suporter2);
        System.out.println();
        salaSport.trimitereNotificare("Este un nou meci disponibil de handbal la sala noastra");

    }
}
