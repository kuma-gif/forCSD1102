import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class NO1 extends JFrame implements ActionListener {
  JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
  JButton b1;
  JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;

  public NO1() {
    setTitle("โปรแกรมคำนวณค่ารวมและค่าเฉลี่ย : สหรัถ ");
    setUIFont(
      new javax.swing.plaf.FontUIResource(
        "Microsoft Sans Serif",
        Font.PLAIN,
        14
      )
    );

    lbl1 = new JLabel(" โปรเเกรมหาค่าเฉลี่ย: สหรัถ");
    lbl1.setBounds(150, 70, 300, 20);
    lbl2 = new JLabel(" จำนวนที่ 1 ");
    lbl2.setBounds(200, 140, 70, 20);
    lbl3 = new JLabel(" จำนวนที่ 2 ");
    lbl3.setBounds(200, 180, 70, 20);
    lbl4 = new JLabel(" จำนวนที่ 3 ");
    lbl4.setBounds(200, 220, 70, 20);
    lbl5 = new JLabel(" จำนวนที่ 4 ");
    lbl5.setBounds(200, 260, 70, 20);
    lbl6 = new JLabel(" จำนวนที่ 5 ");
    lbl6.setBounds(200, 300, 70, 20);
    lbl7 = new JLabel(" ค่ารวม");
    lbl7.setBounds(200, 440, 50, 20);
    lbl8 = new JLabel(" ค่าเฉลี่ย ");
    lbl8.setBounds(200, 480, 50, 20);
    b1 = new JButton(" คำนวณ ");
    b1.setBounds(248, 350, 80, 50);
    tf1 = new JTextField();
    tf1.setBounds(300, 130, 60, 30);
    tf2 = new JTextField();
    tf2.setBounds(300, 170, 60, 30);
    tf3 = new JTextField();
    tf3.setBounds(300, 210, 60, 30);
    tf4 = new JTextField();
    tf4.setBounds(300, 250, 60, 30);
    tf5 = new JTextField();
    tf5.setBounds(300, 290, 60, 30);
    tf6 = new JTextField("");
    tf6.setBounds(300, 430, 60, 30);
    tf7 = new JTextField("");
    tf7.setBounds(300, 470, 60, 30);
    tf6.setEditable(false);
    tf7.setEditable(false);

    add(lbl1);
    add(lbl2);
    add(lbl3);
    add(lbl4);
    add(lbl5);
    add(lbl6);
    add(lbl7);
    add(lbl8);
    add(b1);
    add(tf1);
    add(tf2);
    add(tf3);
    add(tf4);
    add(tf5);
    add(tf6);
    add(tf7);

    b1.addActionListener(this);

    setSize(600, 600);
    setLayout(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {

    int n1, n2, n3, n4, n5;
    double sum, avg;
    n1 = Integer.parseInt(tf1.getText());
    n2 = Integer.parseInt(tf2.getText());
    n3 = Integer.parseInt(tf3.getText());
    n4 = Integer.parseInt(tf4.getText());
    n5 = Integer.parseInt(tf5.getText());
    sum = 0;
    avg = 0;

    if (e.getSource() == b1) {
        sum = n1 + n2 + n3 + n4 + n5;
        avg = sum / 5;
    }

    String result_sum = String.valueOf(sum);
    String result_avg = String.valueOf(avg);

    tf6.setText(result_sum);
    tf7.setText(result_avg);
  }

  public void setUIFont(javax.swing.plaf.FontUIResource f) {
    java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get(key);
      if (value instanceof javax.swing.plaf.FontUIResource)
      UIManager.put(key, f);
    }
  }
  public static void main(String[] args) {
    new NO1();
  }
}
