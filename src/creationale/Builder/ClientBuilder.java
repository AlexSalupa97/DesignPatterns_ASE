package creationale.Builder;

public class ClientBuilder implements Builder {

    private Client client;

    public ClientBuilder(String nume) {
        client=new Client(nume);
    }

    public ClientBuilder setMancareInclusa(boolean mancareInclusa) {
        client.setMancareInclusa(mancareInclusa);
        return this;
    }

    public ClientBuilder setScaunErgonomic(boolean scaunErgonomic) {
        client.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public ClientBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        client.setBauturaRacoritoare( bauturaRacoritoare);
        return this;
    }

    public ClientBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        client.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    @Override
    public Client build() {
        return client;
    }
}
