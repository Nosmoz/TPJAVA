package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by h13002021 on 07/01/16.
 */
public class AvantageCarteMusique implements AvantageEmprunteur {

    @Override
    public int emprunter(EmprunteurStandart emp) { return 0; }

    @Override
    public int emprunter(EmprunteurBronze emp) {
        return 0;
    }

    @Override
    public int emprunter(EmprunteurArgent emp) {
        return 0;
    }

    @Override
    public int emprunter(EmprunteurOr emp) {
        return 0;
    }

    @Override
    public int emprunter(EmprunteurCarteLecture emp) {
        return 0;
    }

    @Override
    public int emprunter(EmprunteurCarteMusique emp) {
        return 5;
    }
}
