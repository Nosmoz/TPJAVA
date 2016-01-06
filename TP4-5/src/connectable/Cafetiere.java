package connectable;

/**
 * Created by h13002021 on 06/01/16.
 */
public class Cafetiere implements Connectable {
    @Override
    public String toString() {
        return "Cafetiere{}";
    }

    @Override
    public void demarrer() {
        System.out.println("La cafetière est démarrer");
    }
}
