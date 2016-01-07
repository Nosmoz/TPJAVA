package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by h13002021 on 07/01/16.
 */
public interface AvantageEmprunteur {

    int emprunter(EmprunteurStandart emp);
    int emprunter(EmprunteurBronze emp);
    int emprunter(EmprunteurArgent emp);
    int emprunter(EmprunteurOr emp);
    int emprunter(EmprunteurCarteLecture emp);
    int emprunter(EmprunteurCarteMusique emp);

}
