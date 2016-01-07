
import documents.CD;
import documents.Document;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;
import emprunteurs.EmprunteurCarteMusique;
import emprunteurs.EmprunteurOr;
import politiquesEmprunt.EmpruntSelonTypeDoc;
import politiquesEmprunt.PolitiqueEmprunt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by h13002021 on 07/01/16.
 */
public class Application {

    private static Map<String,Document> coteDocuments = new HashMap<>();
    private ArrayList<Document> panier = new ArrayList<>();

    public static void constitution() {
        coteDocuments.put("LI_ORW_1", new Livre("1984"));
        coteDocuments.put("LI_TOL_1", new Livre("Le seigneur des anneaux"));
        coteDocuments.put("CD_STO_1", new CD("Satisfaction"));
        coteDocuments.put("CD_BEA_1", new CD("Abbey Road"));
        coteDocuments.put("FI_KUB_1", new Film("2001 Odyssée de l'espace"));
        coteDocuments.put("FI_SCO_1", new Film("Taxi Driver"));
    } // Constitutionn

    public static void emprunt(ArrayList<Document> aEmprunter) {
        PolitiqueEmprunt politique = new EmpruntSelonTypeDoc();

        for (Document doc : aEmprunter) {
            doc.emprunter(politique);
        }
    }

    public static void main(String[] args) {
        Emprunteur or = new EmprunteurOr();
        Emprunteur carteMusique = new EmprunteurCarteMusique();

        Application.constitution();

        ArrayList<Document> panier = new ArrayList<>();
        panier.add(coteDocuments.get("LI_ORW_1"));
        panier.add(coteDocuments.get("CD_STO_1"));
        panier.add(coteDocuments.get("FI_KUB_1"));

        Application.emprunt(panier);

        for(Map.Entry<String, Document> entry : coteDocuments.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
