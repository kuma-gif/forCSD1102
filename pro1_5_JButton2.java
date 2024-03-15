import javax.swing.*;

public class pro1_5_JButton2 extends JFrame { // inheriting JFrame
  JFrame f;

  pro1_5_JButton2() {
    JButton b = new JButton("click"); // create button
    b.setBounds(130, 100, 100, 40); // setBounds (x, y, width, height);
    add(b); // adding button on frame
    setTitle("JButton Example");
    setSize(400, 500);
    setLayout(null);
    setDefaultCloseOperation(WindowConstant.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new pro1_5_JButton2();
  }
}
