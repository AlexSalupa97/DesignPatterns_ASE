package Main;

import comportamentale.Command.ISuporter;
import comportamentale.Command.Steward;
import comportamentale.Command.Suporter;

public class ProgramCommand {

    public static void main(String[] args) {
        Steward steward = new Steward();
        ISuporter suporter = new Suporter();

        steward.trimitereComenzi(suporter,2);
        steward.trimitereComenzi(suporter,1);
        steward.trimitereComenzi(suporter,1);

        steward.procesareComenzi();

        steward.trimitereComenzi(suporter,2);
        System.out.println();
        steward.procesareComenzi();
    }

}
