import java.util.Calendar;

/**
 * Created by h13002021 on 07/01/16.
 */
public abstract class Document {

    protected Calendar dateRetour;
    protected String titre;

    public Document() {
        this.dateRetour = null;
    } // Document()

    public Calendar getDateRetour() {
        return dateRetour;
    } // getDateRetour()

    public abstract void emprunter(PolitiqueEmprunt politique);

    public void setDateRetour(Calendar dateRetour) {
        this.dateRetour = dateRetour;
    } // setDateRetour()
}
