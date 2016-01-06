/**
 * Created by h13002021 on 06/01/16.
 */
public class ImprimanteFabrique implements IFabriqueImprimante{

    @Override
    public AdapterImprimanteConn creerAvecOption(String type, String[] options) {
        Imprimante typeImp;
        if (type.equals("Reseau")) {
            typeImp = new ImprimanteReseau();
        } else if (type.equals("Locale")) {
            typeImp = new ImprimanteLocale();
        } else {
            throw new IllegalArgumentException();
        }

        Imprimante imprimante;
        for (int i = 0 ; i < options.length ; ++i) {
            if (options[i].equals("Fax")) {
                imprimante = new Fax(typeImp);
            } else if (options[i].equals("Scanner")) {
                imprimante = new Scanner(typeImp);
            } else if (options[i].equals("Photocopier")) {
                imprimante = new Photocopieur(typeImp);
            } else {
                throw new IllegalArgumentException();
            }

            typeImp = imprimante;
        }

        return new AdapterImprimanteConn(typeImp);
    }
}
