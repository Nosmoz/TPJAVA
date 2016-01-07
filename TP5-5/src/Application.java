import java.util.ArrayList;

/**
 * Created by h13002021 on 07/01/16.
 */
public class Application {

    public static void main(String[] args) {
        Thermometre thermometre = new Thermometre();

        thermometre.ajouterVue(new VueSlider(thermometre));
        thermometre.ajouterVue(new VueTexte(thermometre));
    }
}
