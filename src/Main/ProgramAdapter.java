package Main;

import structurale.Adapter.BileteFirma;
import structurale.Adapter.eBilete;
import structurale.Adapter.eBileteAdaptor;

public class ProgramAdapter {

    public static void main(String[] args){

        BileteFirma bileteFirma=new BileteFirma();
        bileteFirma.achizitionareBilete();

        eBilete eBilete=new eBilete();

        eBileteAdaptor adaptor=new eBileteAdaptor(eBilete);
        System.out.println();
        adaptor.achizitionareBilete();
    }

}
