import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class JTable1 extends JFrame {
    public static void main(String[] args) {
        new JTable1();
     }
      public JTable1() {
        int numRows = 3;
        int numCols = 4;
        setUIFont(new javax.swing.plaf.FontUIResource( "Microsoft Sans Serif",Font.PLAIN,14));
        setTitle("สหรัถ อินต๊ะวิรา");
            Object[] columns = { "สินค้า", "ราคา", "จำนวน", "รวม" }; //ชื่อคอลัมน์
            Object[][] rows = new Object[numRows][numCols];
        rows[0] = new Object[] { "รายการสินค้าที่1", 100, 200, 500 }; //แถวที่ 1
        rows[1] = new Object[] { "รายการสินค้าที่2", 200, 300, 400 }; //แถวที่ 2
        rows[2] = new Object[] { "รายการสินค้าที่3", 300, 100, 300 }; //แถวที่ 3
        
        JTable table = new JTable(rows, columns);
        JScrollPane scrollPane = new JScrollPane(table);
            setLayout(new GridLayout(1, 1));
            add(scrollPane);
            setSize(400, 150);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
        } // end JTable 1

        public static void setUIFont(javax.swing.plaf.FontUIResource f) {java.util.Enumeration keys = UIManager.getDefaults().keys(); while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
        if (value instanceof javax.swing.plaf.FontUIResource) { UIManager.put(key, f);
            }
        }
    } // end SetUIFont
} // end main
