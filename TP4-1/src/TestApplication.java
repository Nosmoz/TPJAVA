import java.io.IOException;
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

        boolean boucleOn = true;
        while(boucleOn)
        {
            System.out.println("Saisir un entier entre 0, 1 et 2 :");
            int choix = sc.nextInt();
            switch (choix)
            {
                case 0:
                {
                    boucleOn = false;
                    break;
                }
                case 1:
                {
                    objetConnecte.add(new Radio());
                    break;
                }
                case 2:
                {
                    objetConnecte.add(new Cafetiere());
                    break;
                }
                default:
                {
                    System.err.println("Invalid int");
                }
            }
        }



    } // main()
}
