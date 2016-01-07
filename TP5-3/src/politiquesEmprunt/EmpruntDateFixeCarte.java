package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;
import emprunteurs.EmprunteurCarteMusique;

import java.util.Calendar;

/**
 * Created by h13002021 on 07/01/16.
 */
public class EmpruntDateFixeCarte implements PolitiqueEmprunt {

    private Emprunteur emprunteur;

    public EmpruntDateFixeCarte(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(EmpruntDateFixe.TIME_DAY));
    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(EmpruntDateFixe.TIME_DAY+emprunteur.getBonus(new AvantageCarteMusique())));
    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(EmpruntDateFixe.TIME_DAY+emprunteur.getBonus(new AvantageCarteLecture())));
    }
}
