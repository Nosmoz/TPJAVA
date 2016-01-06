/**
 * Created by h13002021 on 06/01/16.
 */
public class Radiateur implements Connectable {
    @Override
    public String toString() {
        return "Radiateur{}";
    }

    @Override
    public void demarrer() {
        System.out.println("La radiateur est démarrer");
    }
}
