//แสดงข้อมูลพนักงานมีการตรวจจับการกระทำ
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.*;


public class JTable3 {


  public static void main(String[] a) {
    setUIFont(
      new javax.swing.plaf.FontUIResource(
        "Microsoft Sans Serif",
        Font.PLAIN,
        14
      )
    );
    JFrame f = new JFrame("การโปรแกรมคอมพิวเตอร์ชั้นสูง");


    String data[][] = {
      { "   014", "    สหรัถ อินต๊ะวิรา", "        50000" },
      { "   102", "    สุดหล่อ สุดสวย", "        500000" },
      { "   103", "    กอไก่ ไก่ขัน", "       700000" },
    };


    String column[] = { "รหัส", "ชื่อ", "เงินเดือน" };


    final JTable jt = new JTable(data, column);


    jt.setCellSelectionEnabled(true);
    ListSelectionModel select = jt.getSelectionModel();
    select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    select.addListSelectionListener(
      new ListSelectionListener() { //ตรวจสอบการกระทำ


        public void valueChanged(ListSelectionEvent e) {
          String Data = null;
          int[] row = jt.getSelectedRows(); //อ่าน Row ที่ถูกเลือก
          int[] columns = jt.getSelectedColumns(); //อ่าน Column ที่ถูกเลือก
          for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < columns.length; j++) {
              Data = (String) jt.getValueAt(row[i], columns[j]); 
			// นำข้อมูลที่เลือกมาใส่ในตัวแปร Data
            }
          }
          System.out.println("ส่วนของตารางที่ถูกเลือกคือ: " + Data); 
		// นำข้อมูลที่เลือกไปแสดงผล
        }
      }
    );
    JScrollPane sp = new JScrollPane(jt);
    f.add(sp);
    f.setSize(400, 200);
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.setVisible(true);
  } // end main


  public static void setUIFont(javax.swing.plaf.FontUIResource f) {
    java.util.Enumeration keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get(key);
      if (value instanceof javax.swing.plaf.FontUIResource) {
        UIManager.put(key, f);
      }
    }
  } // end SetUIFont
}
