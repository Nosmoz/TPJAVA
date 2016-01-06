package connectable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h13002021 on 06/01/16.
 */
public class Demarreur {

    private List<Connectable> connectedObject = new ArrayList<Connectable>();

    public Demarreur() {

    }

    public void attacher(Connectable c) {
        connectedObject.add(c);
    } // attacher()

    public boolean detacher(Connectable c) {
        return connectedObject.remove(c);
    } // detacher()

    public void demarrer() {
        for (Connectable con : connectedObject)
            con.demarrer();
    } // demarrer()

}
