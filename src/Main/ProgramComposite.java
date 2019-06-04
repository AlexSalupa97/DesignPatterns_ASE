package Main;

import structurale.Composite.LocScaun;
import structurale.Composite.Tribuna;

public class ProgramComposite {

    public static void main(String[] args) {

        Tribuna tribuna = new Tribuna();

        LocScaun locScaun1 = new LocScaun();
        LocScaun locScaun2 = new LocScaun();
        LocScaun locScaun3 = new LocScaun();

        tribuna.adaugareSectiune(locScaun1);
        tribuna.adaugareSectiune(locScaun3);

        tribuna.afisareSectiune();
        System.out.println();
        locScaun2.afisareSectiune();
    }
}
