import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistDate; // ปี พศ
import java.time.temporal.ChronoField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class JTabbedPane3 extends JFrame {

  public static void main(String[] args) {
    new JTabbedPane3();
  }

  public JTabbedPane3() {
    setSize(350, 150);
    setTitle("สหรัถ อินต๊ะวิรา : JTabbedPane");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JTabbedPane tabPane = new JTabbedPane();
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout(FlowLayout.CENTER));

    JLabel labelDate = new JLabel();
    ThaiBuddhistDate date = ThaiBuddhistDate.now(); //วันเดือนปี
    String[] thMonths = {
      "มกราคม",
      "กุมภาพันธ์",
      "มีนาคม",
      "เมษายน",
      "พฤษภาคม",
      "มิถุนายน",
      "กรกฎาคม",
      "สิงหาคม",
      "กันยายน",
      "ตุลาคม",
      "พฤศจิกายน",
      "ธันวาคม",
    };

    int d = date.get(ChronoField.DAY_OF_MONTH);
    int m = date.get(ChronoField.MONTH_OF_YEAR);
    int y = date.get(ChronoField.YEAR);

    // แท็บ Date แสดง วัน เดือน ปี
    labelDate.setText(d + " " + thMonths[m - 1] + " " + y);
    labelDate.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
    p1.add(labelDate);
    tabPane.addTab("Date", p1);

    //แท็บ Time แสดงเวลา ชั่วโมงโมง:นาที
    JPanel p2 = new JPanel();
    p2.setLayout(p1.getLayout()); //กำหนดค่า Layout เหมือนกับ p1
    JLabel labelTime = new JLabel();
    labelTime.setFont(labelDate.getFont()); //กำหนด font
    updateTime(labelTime); //เรียกเมธอด updateTime
    p2.add(labelTime);
    tabPane.add("Time", p2);
    tabPane.add("Settings", new JPanel()); // แท็บ Setting
    tabPane.addChangeListener(e -> updateTime(labelTime)); //ตรวจสอบการเปลี่ยนแปลง ให้เปลี่ยนค่าเวลา
    add(tabPane);
    setVisible(true);
  }

  private void updateTime(JLabel jLabel) {
    LocalTime time = LocalTime.now(); //สร้างออปเจ็คเวลาปัจจุบัน
    int h = time.getHour(); //อ่านค่าชั่วโมง
    int m = time.getMinute(); //อ่านค่านาที
    jLabel.setText(h + ":" + m); //เอาไปก าหนดให้กับ Jlabel
  }
}
