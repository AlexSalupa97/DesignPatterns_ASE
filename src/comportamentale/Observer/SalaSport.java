package comportamentale.Observer;

import java.util.ArrayList;

public class SalaSport implements Subject {

    private ArrayList<Observer> listaObserveri;

    public SalaSport() {
        this.listaObserveri = new ArrayList<>();
    }

    @Override
    public void adaugareObserver(Observer observer) {
        listaObserveri.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
        listaObserveri.remove(observer);
    }

    @Override
    public void trimitereNotificare(String mesaj) {
        for(Observer observer:listaObserveri){
            observer.receptioneazaMesaj(mesaj);
        }
    }
}
