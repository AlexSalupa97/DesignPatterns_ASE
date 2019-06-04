package comportamentale.Command;

public class Suporter implements ISuporter {
    @Override
    public void acceptareBilet() {
        System.out.println("A fost acceptat biletul");
    }

    @Override
    public void refuzareBilet() {
        System.out.println("A fost refuzat biletul");
    }
}
