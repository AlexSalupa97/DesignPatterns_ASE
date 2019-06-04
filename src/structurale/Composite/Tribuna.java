package structurale.Composite;

import java.util.ArrayList;

public class Tribuna implements Sectiune {

    private ArrayList<Sectiune> listaSectiuni;

    public Tribuna() {
        this.listaSectiuni = new ArrayList<>();
    }

    @Override
    public void adaugareSectiune(Sectiune sectiune) {
        listaSectiuni.add(sectiune);
    }

    @Override
    public void stergereSectiune(Sectiune sectiune) {
        listaSectiuni.remove(sectiune);
    }

    @Override
    public void afisareSectiune() {
        System.out.println("Tribuna");
        for(Sectiune sectiune:listaSectiuni)
            sectiune.afisareSectiune();
    }
}
