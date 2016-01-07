package politiquesEmprunt;

import documents.*;
/**
 * Created by h13002021 on 07/01/16.
 */
public interface PolitiqueEmprunt {

    void emprunter(Film film);
    void emprunter(CD cd);
    void emprunter(Livre livre);

}
