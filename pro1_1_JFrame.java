import javax.swing.*;

public class pro1_1_JFrame extends JFrame {

  public static void main(String[] args) {
    new pro1_1_JFrame();
  }

  public pro1_1_JFrame() {
    setTitle("JFrame Example");
    setSize(400, 280);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
