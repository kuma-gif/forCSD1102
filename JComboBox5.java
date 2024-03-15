
//เลือกสัตว์เลี้ยง
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JComboBox5 extends JFrame {
	JLabel l, resultLb1;

	// main program
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JComboBox5 frame = new JComboBox5();
				frame.setVisible(true);
			}
		});
	} // end main

	JComboBox5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 12));
		setBounds(100, 100, 343, 273);
		setTitle("สหรัถ อินต๊ะวิรา");
		l = new JLabel("โปรดเลือกสัตว์ที่ท่านเลี้ยง");
		l.setBounds(80, 30, 300, 20);
		getContentPane().add(l);
		getContentPane().setLayout(null);
		setVisible(true);
		// Combobox
		String[] petStrings = { "เเมว", "สุนัข", "นกเเก้ว", "หนูเเฮมเตอร์", "หมีเเพนด้า", "ปลาการ์ตูน", "ปลานีโม่" };
		final JComboBox comboBox = new JComboBox(petStrings);
		comboBox.setSelectedIndex(4);
		comboBox.setBounds(113, 76, 107, 20);
		getContentPane().add(comboBox);
		// Button
		JButton btn = new JButton("เลือก");
		btn.setBounds(126, 123, 81, 30);
		getContentPane().add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"คุณได้เลือก : " + comboBox.getSelectedItem());
			}
		});
	} // end JComboBox1()
		// setUIFont

	public static void setUIFont(javax.swing.plaf.FontUIResource f) { // นำเข้าตัวหนังสือไทย
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, f);
			}
		}
	} // end setUIFont
}
