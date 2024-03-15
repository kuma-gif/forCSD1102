import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JTextFile1 extends JFrame implements ActionListener {
  static JTextField tf1, tf2, tf3;
  static JFrame f;
  static JLabel l1, l2, l3, l4;
  static JButton b;

  JTextFile1() {}

  public static void main(String[] args) throws IOException {
    JFrame f = new JFrame();
    f.setTitle("สหรัถ อินต๊ะวิรา ");

    l1 = new JLabel("Product Name");
    l1.setBounds(100, 30, 100, 30);
    l2 = new JLabel("Quantity");
    l2.setBounds(200, 30, 100, 30);
    l3 = new JLabel("Price");
    l3.setBounds(300, 30, 100, 30);
    l4 = new JLabel("Sale Product Item ");
    l4.setBounds(170, 20, 200, 30); //Xนอน

    tf2 = new JTextField();
    tf2.setBounds(100, 50, 80, 20); //กล่องซ้าย //ใหญ่เพิ่มwidht
    tf1 = new JTextField();
    tf1.setBounds(200, 50, 80, 20); //กล่องตรงกลาง
    tf3 = new JTextField();
    tf3.setBounds(300, 50, 80, 20); //กล่องขวา

    b = new JButton("Add Data");
    b.setBounds(180, 150, 100, 50);

    JTextFile1 jf = new JTextFile1();

    f.add(b);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);

    f.setSize(600, 550);
    f.setLayout(null);
    f.setVisible(true);
    b.addActionListener(jf);
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    if (s.equals("Add Data")) {
      try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Kxmx.txt"));
        bw.write(tf1.getText());
        bw.newLine();
        bw.write(tf2.getText());
        bw.newLine();
        bw.write(tf3.getText());
        bw.close();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
