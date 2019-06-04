package comportamentale.Command;

public class ComandaRefuzare implements ComandaSteward {
    private ISuporter suporter;

    public ComandaRefuzare(ISuporter suporter) {
        this.suporter = suporter;
    }

    @Override
    public void execute() {
        suporter.refuzareBilet();
    }
}
