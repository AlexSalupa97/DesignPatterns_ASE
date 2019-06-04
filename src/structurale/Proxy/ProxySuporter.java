package structurale.Proxy;

import structurale.Adapter.Bilete;

public class ProxySuporter implements Bilete {

    private Suporter suporter;

    public ProxySuporter(Suporter suporter) {
        this.suporter = suporter;
    }

    @Override
    public void achizitionareBilete() {
        if(suporter.getVarsta()>13)
            System.out.println("S-a achizitionat biletul");
        else
            System.out.println("Nu aveti varsta necesara");
    }
}
