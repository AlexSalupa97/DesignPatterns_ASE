package comportamentale.Command;

public class ComandaAcceptare implements ComandaSteward {

    private ISuporter suporter;

    public ComandaAcceptare(ISuporter suporter) {
        this.suporter = suporter;
    }

    @Override
    public void execute() {
        suporter.acceptareBilet();
    }
}
