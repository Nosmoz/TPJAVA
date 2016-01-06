package connectable;

/**
 * Created by h13002021 on 06/01/16.
 */
public class Radio implements Connectable {
    @Override
    public String toString() {
        return "Radio{}";
    }

    @Override
    public void demarrer() {
        System.out.println("La radio est démarrer");
    }
}
