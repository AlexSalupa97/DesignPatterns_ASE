package structurale.Facade;

public class Facade {
    public static void verificareBilet(Suporter suporter){
        if(Politie.verificareAntecedente(suporter)&&Politie.esteCautatDePolitie(suporter)&&Bilete.areBiletPersonal(suporter))
            System.out.println("Bilet valabil");
        else
            System.out.println("Bilet invalid");
    }
}
