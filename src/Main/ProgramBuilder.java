package Main;

import creationale.Builder.Client;
import creationale.Builder.ClientBuilder;

public class ProgramBuilder {

    public static void main(String[] args){
        Client client=new ClientBuilder("Client").setBauturaRacoritoare(true).setScaunErgonomic(true).build();

        System.out.println(client.toString());
    }
}
