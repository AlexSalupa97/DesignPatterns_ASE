package creationale.Singleton;

public class Antrenor {

    private String nume;

    private static Antrenor instantaAntrenor=null;

    private Antrenor(String nume) {
        this.nume = nume;
    }

    public static synchronized Antrenor getInstance(){
        if(instantaAntrenor==null) {
            instantaAntrenor = new Antrenor("Antrenor");
            return instantaAntrenor;
        }
        return instantaAntrenor;
    }

    @Override
    public String toString() {
        return "Antrenor{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
