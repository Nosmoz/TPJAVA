import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by h13002021 on 07/01/16.
 */
public class VueTexte extends Vue {

    private JTextField tField;

    public VueTexte(Thermometre thermo) {
        this.thermometre = thermo;
        JFrame frame = new JFrame("VueTexte");
        frame.setLayout(new BorderLayout());
        tField = new JTextField("10");
        tField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                VueTexte.this.thermometre.setTemperature(Integer.parseInt(tField.getText()));
            }
        });

        frame.add(tField);
        frame.setSize(50,50);
        frame.setVisible(true);
    }

    @Override
    public void mettreAjour() {
        tField.setText(String.valueOf(this.thermometre.getTemperature()));
        //this.thermometre.setTemperature(Integer.parseInt(tField.getText()));
    }
}
