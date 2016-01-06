/**
 * Created by h13002021 on 06/01/16.
 */
public class Photocopieur extends ImprimanteDecorateur {

    public Photocopieur(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        System.out.println("La fonction imprimer du Photocopieur est activer");
        imprimante.imprimer();
    }
}
