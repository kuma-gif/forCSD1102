import java.awt.*;
import javax.swing.*;

public class pro1_8_JPanel extends JFrame {

  public static void main(String[] args) {
    new pro1_8_JPanel();
  }

  public pro1_8_JPanel() {
    setSize(250, 250);
    JTextField jText = new JTextField();
    jText.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
    setTitle("การสร้าง Subcontainer ด้วยJPanel");

    jText.setBackground(new Color(225, 225, 225));
    add(jText, BorderLayout.NORTH);

    JPanel jPanel = new JPanel();
    jPanel.setLayout(new GridLayout(5, 3));
    String[] ops = { "0", "+", "-", "*", "/", "=" };

    for (int i = 1; i <= 9; i++) {
      jPanel.add(new JButton(i + ""));
    }

    for (int i = 0; i < ops.length; i++) {
      jPanel.add(new JButton(ops[i]));
    }

    add(jPanel, BorderLayout.CENTER);

    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
