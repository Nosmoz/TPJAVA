/**
 * Created by h13002021 on 06/01/16.
 */
public class FabriqueConnectable implements IFabriqueConnectable {

    @Override
    public Connectable creer(String className) {
        if(className.equals("Cafetiere")) {
            return new Cafetiere();
        } else if(className.equals("Radio")) {
            return new Radio();
        } else if(className.equals("Radiateur")) {
            return new Radiateur();
        } else {
            return null;
        }
    } // creer()

}
