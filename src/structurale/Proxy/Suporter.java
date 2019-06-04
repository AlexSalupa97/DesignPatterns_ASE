package structurale.Proxy;

import structurale.Adapter.Bilete;

public class Suporter implements Bilete {

    private int varsta;

    public Suporter(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public void achizitionareBilete() {
        System.out.println("S-a achizitionat biletul");
    }
}
