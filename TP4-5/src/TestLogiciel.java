/**
 * Created by h13002021 on 06/01/16.
 */
public class TestLogiciel {

    public static void main(String[] args) {

        Imprimante reseauAllOptions = new Scanner(new Fax(new Photocopieur(new ImprimanteReseau())));
        Imprimante localFaxScanOnly = new Fax(new Scanner(new ImprimanteLocale()));

        reseauAllOptions.imprimer();
        localFaxScanOnly.imprimer();
    }

}
