import java.util.ArrayList;
import java.util.List;

/**
 * Created by h13002021 on 07/01/16.
 */
public class Thermometre {

    private int temperature;
    private List<Vue> vues = new ArrayList<>();

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
