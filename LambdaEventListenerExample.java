import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LambdaEventListenerExample {
    public static void main(String[] args) {

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 250, 20);
        JButton b = new JButton("click");
        b.setBounds(80, 100, 70, 30);
        JLabel l1 = new JLabel("Lambda Expression: Event Listener: SAHARAT INTAVIRA");
        l1.setBounds(50, 10, 500, 30);

        // lambda expression implementing here.
        b.addActionListener(e -> {
            tf.setText("hello swing");
        });

        JFrame f = new JFrame("Lambda Expression: Event Listener: SAHARAT INTAVIRA");
        f.add(tf);
        f.add(b);
        f.add(l1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 200);
        f.setVisible(true);

    }

}
