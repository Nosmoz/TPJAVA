/**
 * Created by h13002021 on 07/01/16.
 */
public class EmpruntSelonTypeDoc implements PolitiqueEmprunt {

    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(3));
    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(7));
    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(21));
    }
}
