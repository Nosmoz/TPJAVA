/**
 * Created by h13002021 on 06/01/16.
 */
public class Fax extends ImprimanteDecorateur {

    public Fax(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        System.out.println("La fonctioen imprimer du Fax est activer");
        imprimante.imprimer();
    }
}
