import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by h13002021 on 06/01/16.
 */
public class TestApplication {

    public static void main(String[] args) {

        IFabriqueImprimante fabriqueImp = new ImprimanteFabrique();
        String options[] = {"Fax","Scanner"};
        AdapterImprimanteConn imp1 = fabriqueImp.creerAvecOption("Locale",options);

        imp1.demarrer();
    } // main()
}
