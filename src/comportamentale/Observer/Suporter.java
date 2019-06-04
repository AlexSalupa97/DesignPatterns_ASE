package comportamentale.Observer;

public class Suporter implements Observer {

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Suporterul a primit mesajul: "+mesaj);
    }
}
