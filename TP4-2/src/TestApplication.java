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

        for (Connectable obj : objetConnecte)
            System.out.println(obj);


    } // main()
}
