import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable2 {
    public static void main(String[] args) {
        // ข้อมูลสินค้า
        Object[][] data = {
            {"Product number 1", 100},
            {"Product number 2", 200},
            {"Product number 3", 300},
            {"Product number 4", 400},
            {"Product number 5", 500}
        };

        // หัวข้อคอลัมน์
        Object[] columns = {"Product name", "Price"};

        // สร้างตาราง
        JTable table = new JTable(data, columns);

        // สร้างเฟรม
        JFrame frame = new JFrame();
        frame.setTitle("Product List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // เพิ่มตารางลงใน JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // ตั้งค่าขนาดของเฟรม
        frame.setSize(400, 300);

        // แสดงเฟรม
        frame.setVisible(true);
        
    }
}
