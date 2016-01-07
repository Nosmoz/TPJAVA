package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

/**
 * Created by h13002021 on 07/01/16.
 */
public class EmprunteurCarteMusique implements Emprunteur {
    @Override
    public int getBonus(AvantageEmprunteur avEmp) {
        return avEmp.emprunter(this);
    }
}
