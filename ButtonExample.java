import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends JFrame implements ActionListener {
    private JButton okButton, submitButton, cancelButton;

    public ButtonExample() {
        setTitle("Button Example");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        okButton = new JButton("OK");
        okButton.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(okButton);
        panel.add(submitButton);
        panel.add(cancelButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == okButton) {
            JOptionPane.showMessageDialog(this, "OK Button Clicked");
        } else if (event.getSource() == submitButton) {
            JOptionPane.showMessageDialog(this, "Submit Button Clicked");
        } else if (event.getSource() == cancelButton) {
            JOptionPane.showMessageDialog(this, "Cancel Button Clicked");
        }
    }

    public static void main(String[] args) {
        ButtonExample frame = new ButtonExample();
        frame.setVisible(true);
    }
}
