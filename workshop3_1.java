import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class workshop3_1 implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    /**
     *
     */
    workshop3_1() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        JFrame f = new JFrame();
        // Label 1

        JLabel label1 = new JLabel("จำนวน 1: ");
        label1.setBounds(5, 50, 80, 20);
        tf1 = new JTextField();
        tf1.setBounds(80, 50, 150, 20);

        JLabel label2 = new JLabel("จำนวน 2: ");
        label2.setBounds(5, 100, 80, 20);
        tf2 = new JTextField();
        tf2.setBounds(80, 100, 150, 20);

        b1 = new JButton("คำนวณ");
        b1.setBounds(50, 200, 150, 50);

        b1.addActionListener(this);

        f.add(label1);
        f.add(tf1);
        f.add(label2);
        f.add(tf2);

        f.add(b1);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;

            String result = String.valueOf(c);
            // tf3.setText(result);
        }
    }

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }

    public static void main(String[] args) {
        new workshop3_1();
    }
}
