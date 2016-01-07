package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by h13002021 on 07/01/16.
 */
public class AvantageStatus implements AvantageEmprunteur {

    @Override
    public int emprunter(EmprunteurStandart emp) { return 1; }

    @Override
    public int emprunter(EmprunteurBronze emp) {
        return 2;
    }

    @Override
    public int emprunter(EmprunteurArgent emp) {
        return 4;
    }

    @Override
    public int emprunter(EmprunteurOr emp) {
        return 8;
    }

    @Override
    public int emprunter(EmprunteurCarteLecture emp) {
        return 0;
    }

    @Override
    public int emprunter(EmprunteurCarteMusique emp) {
        return 0;
    }
}
