import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane4 extends JFrame {

  public static void main(String[] args) {
    new JTabbedPane4();
  }

  public JTabbedPane4() {
    JFrame f = new JFrame("สหรัถ อินต๊ะวิรา ");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(800, 300);
    f.setVisible(true);

    JTabbedPane tp1 = new JTabbedPane();

    JPanel pa1, pa2, pa3, pa4, pa5;
    pa1 = new JPanel();
    pa2 = new JPanel();
    pa3 = new JPanel();
    pa4 = new JPanel();
    pa5 = new JPanel();

    pa1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    pa2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    pa3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    pa4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    pa5.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));

    JLabel j1, j2, j3, j4, j5;
    j1 = new JLabel();
    j2 = new JLabel();
    j3 = new JLabel();
    j4 = new JLabel();
    j5 = new JLabel();

    j1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    j2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    j3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    j4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
    j5.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));

    j1.setText("สหรัถ อินต๊ะวิรา");
    pa1.add(j1);

    j2.setText(
        "1. อาร์เซนอล เอฟซี     " +
            "   2.แมนเชสเตอร์ ซิตี้   " +
            " 3.แมนเชสเตอร์ ยูไนเต็ด ");
    pa2.add(j2);

    j3.setText(" 1.อั้ม พัชราภา" + "  2. เน๊ก ชาลี" + "  3. บอย ปกรณ์");
    pa3.add(j3);

    j4.setText(
        "กะหล่ำปลี ," +
            "ผักกาด ," +
            "ผักบุ้ง ," +
            "ผักคะน้า ," +
            "ผักกระเฉด ," +
            "สะระเเหน่ ," +
            "ตะไคร้ ," +
            "ขึ้นช่าย ," +
            "ผักชี ," +
            "ผักชีลาว");
    pa4.add(j4);

    j5.setText(
        "มะม่วง ," +
            "ส้ม ," +
            "ส้มโอ ," +
            "มะเฟือง ," +
            "มะพร้าว ," +
            "ส้ม ," +
            "โอ ," +
            "ฟัก ," +
            "เเตงโม");
    pa5.add(j5);

    tp1.addTab("ชื่อ-นามสกุล", pa1);
    tp1.addTab("แสดงรายชื่อทีมฟุตบอล 3 ทีม ", pa2);
    tp1.addTab("แสดงชื่อดารา 3 ชื่อ", pa3);
    tp1.addTab("แสดงชื่อผัก 5-10 ชื่อ ", pa4);
    tp1.addTab("แสดงชื่อผลไม้ 5-10 ชื่อ", pa5);
    tp1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));

    f.add(tp1);
  }
}
