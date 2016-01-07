/**
 * Created by h13002021 on 07/01/16.
 */
public class EmpruntDateFixe implements PolitiqueEmprunt {

    private final int TIME_DAY = 15;

    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(TIME_DAY));
    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(TIME_DAY));
    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(TIME_DAY));
    }
}
