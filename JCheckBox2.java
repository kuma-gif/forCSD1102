import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class JCheckBox2 {
    JCheckBox2() {
        JFrame f = new JFrame("1+1= ?");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JCheckBox checkbox1 = new JCheckBox("2");
        checkbox1.setBounds(150, 100, 80, 50);
        JCheckBox checkbox2 = new JCheckBox("1");
        checkbox2.setBounds(150, 150, 80, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);
        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Nice "
                        + (e.getStateChange() == 2 ? "True" : "True!"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("This's "
                        + (e.getStateChange() == 1 ? " false" : "false"));
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new JCheckBox2();
    }
}
 
