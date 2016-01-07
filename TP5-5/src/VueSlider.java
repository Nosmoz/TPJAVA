import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by h13002021 on 07/01/16.
 */
public class VueSlider extends Vue {

    private JSlider slider;

    public VueSlider(Thermometre thermo) {
        this.thermometre = thermo;
        JFrame frame = new JFrame("VueSlider");
        frame.setLayout(new BorderLayout());
        slider = new JSlider();
        slider.setValue(10);
        slider.setMaximum(70);
        slider.setMinimum(-70);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                VueSlider.this.thermometre.setTemperature(slider.getValue());
            }
        });

        frame.add(slider);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void mettreAjour() {
        slider.setValue(this.thermometre.getTemperature());
        //this.thermometre.setTemperature(slider.getValue());
    }
}
