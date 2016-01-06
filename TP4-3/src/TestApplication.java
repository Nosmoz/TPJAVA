import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by h13002021 on 06/01/16.
 */
public class TestApplication {

    public static void main(String[] args) {

        List<Connectable> objetConnecte = new ArrayList<Connectable>();

        Scanner sc = new Scanner(System.in);
        IFabriqueConnectable fabriqueConnecter = new FabriqueConnectable();

        while(true)
        {
            System.out.println("Saisir le nom de la classe");
            String className = sc.nextLine();

            if(className.equals("")) break;

            Connectable object = fabriqueConnecter.creer(className);
            objetConnecte.add(object);
        }

        Demarreur demarreur = new Demarreur();

        for (Connectable obj : objetConnecte) {
            System.out.println(obj);
            System.out.println("Voulez-vous l'attacher ? ");
            if(sc.nextLine().equals("oui")) {
                demarreur.attacher(obj);
            }
        }

        demarreur.demarrer();

        for (Connectable obj : objetConnecte) {
            System.out.println(obj);
            System.out.println("Voulez-vous le détacher ? ");
            if(sc.nextLine().equals("oui")) {
                demarreur.detacher(obj);
            }
        }

        demarreur.demarrer();


    } // main()
}
