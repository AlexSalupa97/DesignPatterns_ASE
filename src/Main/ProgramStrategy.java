package Main;

import comportamentale.Strategy.Suporter;
import comportamentale.Strategy.VerificarePeluza;
import comportamentale.Strategy.VerificareTribuna;
import comportamentale.Strategy.VerificareVIP;

public class ProgramStrategy {

    public static void main(String[] args){
        Suporter suporter=new Suporter(new VerificareVIP());
        suporter.stabilireVerificare();

        suporter=new Suporter(new VerificareTribuna());
        suporter.stabilireVerificare();

        suporter=new Suporter(new VerificarePeluza());
        suporter.stabilireVerificare();
    }

}
