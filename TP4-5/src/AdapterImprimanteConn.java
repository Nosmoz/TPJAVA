/**
 * Created by h13002021 on 06/01/16.
 */
public class AdapterImprimanteConn implements Connectable {

    private Imprimante imprimante;

    public AdapterImprimanteConn(Imprimante imprimante) {
        this.imprimante = imprimante;
    }

    @Override
    public void demarrer() {
        imprimante.imprimer();
    }
}
