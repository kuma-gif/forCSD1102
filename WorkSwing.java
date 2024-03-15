import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkSwing extends JFrame implements ActionListener {
  JLabel radiusLabel, areaLabel;// JLabel เเสดงข้อความบนGUI
  JTextField radiusField, areaField;// JTextField ช่องให้ผู้ใช้ใส่ข้อมูล
  JButton calculateButton;// JButton พื้นที่สำหรับวางองค์ประกอบ GUI

  public WorkSwing() {
    setTitle("สหรัถ อินต๊ะวิรา");
    setSize(300, 150);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    radiusLabel = new JLabel("Radius:");
    radiusField = new JTextField(10);
    areaLabel = new JLabel("Area:");
    areaField = new JTextField(10);
    areaField.setEditable(false);

    calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);

    JPanel panel = new JPanel(new GridLayout(3, 2));
    panel.add(radiusLabel);
    panel.add(radiusField);
    panel.add(areaLabel);
    panel.add(areaField);
    panel.add(calculateButton);

    add(panel);
  }

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == calculateButton) {
      try {
        double radius = Double.parseDouble(radiusField.getText());
        double area = Math.PI * radius * radius;
        areaField.setText(String.format("%.2f", area));
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "InValid input", "Error!!", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  public static void main(String[] args) {
    WorkSwing frame = new WorkSwing();
    frame.setVisible(true);
  }
}
