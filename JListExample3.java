//โปรแกรมเลือก ภาษาโปรแกรม
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class JListExample3 {
   JListExample3() {
      JFrame f = new JFrame("สหรัถ อินต๊ะวิรา");
      setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 12)); // ภาษาไทย
      final JLabel label = new JLabel();
      label.setSize(500, 100);
      JButton b = new JButton("เเสดง");
      b.setBounds(200, 150, 80, 20); // ขนาดปุ่ม
      final DefaultListModel<String> l1 = new DefaultListModel<>();
      l1.addElement("กา");
      l1.addElement("หมู");
      l1.addElement("หมา");
      l1.addElement("ไก่");
      l1.addElement("หมีเเพนด้า");
      l1.addElement("หมีโคอาล่า");
      l1.addElement("กวาง");

      final JList<String> list1 = new JList<>(l1);
      list1.setBounds(100, 100, 75, 100);// ขนาดช่อง
      f.add(list1);
      f.add(b);
      f.add(label);
      f.setSize(450, 450);
      f.setLayout(null);
      f.setVisible(true);
      b.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String data = "";
            if (list1.getSelectedIndex() != -1) {
               //set data location

               data = "                                  ท่านได้เลือก: " + list1.getSelectedValue();
               label.setText(data);
            }
         }
      });
   }

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

   public static void main(String args[]) {
      new JListExample3();
   }
}