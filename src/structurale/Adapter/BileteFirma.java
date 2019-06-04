package structurale.Adapter;

public class BileteFirma implements Bilete{

    public void rezervareBilet(){
        System.out.println("Biletul a fost rezervat prin firma");
    }
    @Override
    public void achizitionareBilete() {
        rezervareBilet();
        System.out.println("Biletul a fost achizitionat prin firma");
    }
}
