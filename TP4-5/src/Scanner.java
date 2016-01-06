/**
 * Created by h13002021 on 06/01/16.
 */
public class Scanner extends ImprimanteDecorateur {

    public Scanner(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void imprimer() {
        System.out.println("La fonction imprimer du Scanner est activer");
        imprimante.imprimer();
    }
}
