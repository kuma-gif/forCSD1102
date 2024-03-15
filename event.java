import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class event {
  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;

  public event() {
    prepareGUI();
  }

  public static void main(String[] args) {
    event event = new event();
    event.showButtonDemo();
  }

  private void prepareGUI() {
    mainFrame = new JFrame("สหรัถ อินต๊ะวิรา");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));

    mainFrame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
      }
    });
    headerLabel = new JLabel("", JLabel.CENTER);
    statusLabel = new JLabel("", JLabel.CENTER);
    statusLabel.setSize(350, 100);

    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());

    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);
  }

  private void showButtonDemo() {
    headerLabel.setText("Control in action: Button");

    JButton okButton = new JButton("OK");
    JButton javaButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");
    cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);

    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        statusLabel.setText("Ok Button clicked.");
      }
    });
    javaButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        statusLabel.setText("Submit Button clicked.");
      }
    });
    cancelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        statusLabel.setText("Cancel Button clicked.");
      }
    });
    controlPanel.add(okButton);
    controlPanel.add(javaButton);
    controlPanel.add(cancelButton);

    mainFrame.setVisible(true);
  }
}