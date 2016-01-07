/**
 * Created by h13002021 on 07/01/16.
 */
public class Livre extends Document {

    public Livre(String titre) {
        this.titre = titre;
    }



    @Override
    public String toString() {
        String str = "Livre " + titre +" : ";
        if (dateRetour != null)
            str += "rendre le : " + dateRetour.getTime();
        else
            str += "n'est pas emprunté.";
        return str;
    }

    @Override
    public void emprunter(PolitiqueEmprunt politique) {
        politique.emprunter(this);
    }
}
