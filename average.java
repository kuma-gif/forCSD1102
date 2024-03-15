
//โปรแกรมหาค่ารวมและค่าเฉลี่ย: จงเขียนโปรแกรมรับค่าจำนวน 5 จำนวน แล้วคลิกปุ่มคำนวณให้คำนวณค่ารวม และค่าเฉลี่ย แล้วแสดงผลลัพธ์ออกมา
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class average extends JFrame implements ActionListener {
  JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8;
  JButton b1;
  JTextField jf1, jf2, jf3, jf4, jf5, jf6, jf7;

  public average() {
    setTitle("โปรแกรมหาค่ารวมและค่าเฉลี่ย: สหรัถ ");
    setUIFont(
        new javax.swing.plaf.FontUIResource(
            "Microsoft Sans Serif",
            Font.PLAIN,
            14));

    lbl1 = new JLabel(" โปรแกรมหาค่ารวมและค่าเฉลี่ย: สหรัถ อินต๊ะวิรา");
    lbl1.setBounds(150, 70, 300, 20); // พื้นที่:เเนวนอน ,ตั้ง ,กว้าง ,สูง
    lbl2 = new JLabel(" จำนวนที่ 1 "); // รับค่าจำนวนที่1
    lbl2.setBounds(200, 140, 70, 20);
    lbl3 = new JLabel(" จำนวนที่ 2 "); // รับค่าจำนวนที่2
    lbl3.setBounds(200, 180, 70, 20);
    lbl4 = new JLabel(" จำนวนที่ 3 "); // รับค่าจำนวนที่3
    lbl4.setBounds(200, 220, 70, 20);
    lbl5 = new JLabel(" จำนวนที่ 4 "); // รับค่าจำนวนที่4
    lbl5.setBounds(200, 260, 70, 20);
    lbl6 = new JLabel(" จำนวนที่ 5 "); // รับค่าจำนวนที่5
    lbl6.setBounds(200, 300, 70, 20);
    lbl7 = new JLabel(" ค่ารวม ");
    lbl7.setBounds(200, 440, 50, 20);
    lbl8 = new JLabel(" ค่าเฉลี่ย ");
    lbl8.setBounds(200, 480, 50, 20);
    b1 = new JButton(" คำนวณ ");
    b1.setBounds(248, 350, 80, 50);
    jf1 = new JTextField();
    jf1.setBounds(300, 130, 60, 30);
    jf2 = new JTextField();
    jf2.setBounds(300, 170, 60, 30);
    jf3 = new JTextField();
    jf3.setBounds(300, 210, 60, 30);
    jf4 = new JTextField();
    jf4.setBounds(300, 250, 60, 30);
    jf5 = new JTextField();
    jf5.setBounds(300, 290, 60, 30);
    jf6 = new JTextField("");
    jf6.setBounds(300, 430, 60, 30);
    jf7 = new JTextField("");
    jf7.setBounds(300, 470, 60, 30);
    jf6.setEditable(false);
    jf7.setEditable(false);

    add(lbl1);
    add(lbl2);
    add(lbl3);
    add(lbl4);
    add(lbl5);
    add(lbl6);
    add(lbl7);
    add(lbl8);
    add(b1);
    add(jf1);
    add(jf2);
    add(jf3);
    add(jf4);
    add(jf5);
    add(jf6);
    add(jf7);

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
    n1 = Integer.parseInt(jf1.getText());
    n2 = Integer.parseInt(jf2.getText());
    n3 = Integer.parseInt(jf3.getText());
    n4 = Integer.parseInt(jf4.getText());
    n5 = Integer.parseInt(jf5.getText());
    sum = 0;
    avg = 0;

    if (e.getSource() == b1) {
      sum = n1 + n2 + n3 + n4 + n5;
      avg = sum / 5;
    }

    String result_sum = String.valueOf(sum);
    String result_avg = String.valueOf(avg);

    jf6.setText(result_sum);
    jf7.setText(result_avg);
  }

  public void setUIFont(javax.swing.plaf.FontUIResource f) {
    java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get(key);
      if (value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put(
            key,
            f);
    }
  }

  public static void main(String[] args) {
    new average();
  }
}
