import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane1 extends JFrame {

  public static void main(String[] args) {
    new JTabbedPane1();
  }

  public JTabbedPane1() {
    JFrame f = new JFrame("สหรัถ อินต๊ะวิรา ");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(800, 300);
    f.setVisible(true);

    JTabbedPane tp1 = new JTabbedPane();

    JPanel pa1;
    pa1 = new JPanel();
    pa1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));

    JLabel j1;
    j1 = new JLabel();
    j1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    j1.setText("สหรัถ อินต๊ะวิรา");
    pa1.add(j1);

    tp1.addTab("ชื่อ-นามสกุล", pa1);
    tp1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));

    f.add(tp1);
  }
}
