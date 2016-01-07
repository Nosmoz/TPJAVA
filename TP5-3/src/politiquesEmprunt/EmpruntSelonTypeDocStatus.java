package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;

/**
 * Created by h13002021 on 07/01/16.
 */
public class EmpruntSelonTypeDocStatus implements PolitiqueEmprunt {

    private Emprunteur emprunteur;

    public EmpruntSelonTypeDocStatus(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(3+emprunteur.getBonus(new AvantageStatus())));
    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(7+emprunteur.getBonus(new AvantageStatus())));
    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(21+emprunteur.getBonus(new AvantageStatus())));
    }
}
