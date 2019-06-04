package structurale.Adapter;

public class eBileteAdaptor implements Bilete {

    private eBilete eBilete;

    public eBileteAdaptor(structurale.Adapter.eBilete eBilete) {
        this.eBilete = eBilete;
    }

    @Override
    public void achizitionareBilete() {
        eBilete.cumparaBilet();
    }
}
