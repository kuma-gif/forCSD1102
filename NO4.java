//เเบบฝึกหัด3.4
//โปรแกรมค่าทัวร์พร้อมแพคเกจเสริม: จงเขียนโปรแกรม คำนวณค่าบริการ ของบริษัททัวร์แห่งหนึ่ง
//โดยมีแพคเกจทัวร์ให้เลือกดังนี้
//1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน (3 วัน)
//2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน (4 วัน)
//3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน (5 วัน)
//4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน (6 วัน)
//5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน (6 วัน)
//จงเขียนโปรแกรมรับจำนวนคนที่เลือกแต่ละแพคเกจ เลือก เช่ารถ หรือ ห้องพักเพิ่มเติม
//แล้วคำนวณราคารวมทั้งหมดที่ต้องจ่าย
///สิ่งที่ต้องการเพิ่มเติมจากรายการต่อไปนี้
//1) ต้องการเช่ารถเพิ่มเติมหรือไม่ ถ้าเช่า คิดวันละ 2,000 บาท โดยใช้จำนวนวันตามแพคเกจทัวร์
//2) ห้องพักเพิ่มเติม โดยมีอัตราค่าบริการในแต่ละแพคเกจเพิ่มเติมดังนี้ โดยใช้จำนวนวันตามแพคเกจทัวร์
//2.1) สำหรับแพคเกจทัวร์ประเทศโปรตุเกส ราคา 2,000 บาท / ต่อวัน / ห้อง
//2.2) สำหรับแพคเกจทัวร์ประเทศบัลแกเรีย ราคา 1,500 บาท / ต่อวัน / ห้อง
//2.3) สำหรับแพคเกจทัวร์ประเทศโปแลนด์ ราคา 1,200 บาท / ต่อวัน / ห้อง
//2.4) สำหรับแพคเกจทัวร์ประเทศโมนาโก ราคา 1,600 บาท / ต่อวัน / ห้อง
//2.5) สำหรับแพคเกจทัวร์ประเทศสเปน ราคา 2,100 บาท / ต่อวัน / ห้อง
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;

public class NO4 implements ActionListener {
    private static final Font Serif = null;
    JLabel a, a1, a2, a3, a4, a5, b1, b2, b3, b4, b5, b6;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    JButton jb1;
    double a1_1 = 0;

   NO4() {
        Font quot;
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        JFrame q = new JFrame();
        q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        q.setTitle("โปรแกรมค่าทัวร์พร้อมแพคเกจเสริม: สหรัถ อินต๊ะวิรา");
        a = new JLabel("โปรแกรมค่าทัวร์พร้อมแพคเกจเสริม: สหรัถ อินต๊ะวิรา ");
        a.setBounds(130, 10, 450, 31);
        a1 = new JLabel(
                "1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท/คน        จํานวน           คน                    เช่ารถ                 ห้องพักเพิ่มเติม");
        a1.setBounds(10, 40, 700, 30); //ตำเเหน่งข้อความ
        t1 = new JTextField();
        t1.setBounds(385, 40, 30, 20);
        cb1 = new JCheckBox();
        cb1.setBounds(482, 40, 20, 20);
        cb2 = new JCheckBox();
        cb2.setBounds(590, 40, 20, 20);
        a2 = new JLabel(
                "2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท/คน        จํานวน           คน                    เช่ารถ                 ห้องพักเพิ่มเติม");
        a2.setBounds(10, 70, 700, 20);
        t2 = new JTextField();
        t2.setBounds(385, 70, 30, 20);
        cb3 = new JCheckBox();
        cb3.setBounds(482, 70, 20, 20);
        cb4 = new JCheckBox();
        cb4.setBounds(590, 70, 20, 20);
        a3 = new JLabel(
                "3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท/คน         จํานวน           คน                    เช่ารถ                 ห้องพักเพิ่มเติม");
        a3.setBounds(10, 100, 700, 20);
        t3 = new JTextField();
        t3.setBounds(385, 100, 30, 20);
        cb5 = new JCheckBox();
        cb5.setBounds(482, 100, 20, 20);
        cb6 = new JCheckBox();
        cb6.setBounds(590, 100, 20, 20);
        a4 = new JLabel(
                "4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท/คน          จํานวน           คน                    เช่ารถ                 ห้องพักเพิ่มเติม");
        a4.setBounds(10, 130, 700, 20); 
        t4 = new JTextField();
        t4.setBounds(385, 130, 30, 20);
        cb7 = new JCheckBox();
        cb7.setBounds(482, 130, 20, 20);
        cb8 = new JCheckBox();
        cb8.setBounds(590, 130, 20, 20);
        a5 = new JLabel(
                "5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท/คน             จํานวน           คน                    เช่ารถ                 ห้องพักเพิ่มเติม");
        a5.setBounds(10, 160, 700, 20); 
        t5 = new JTextField();
        t5.setBounds(385, 160, 30, 20);
        cb9 = new JCheckBox();
        cb9.setBounds(482, 160, 20, 20); //ตำเเหน่งช่องติ๊ก
        cb10 = new JCheckBox();
        cb10.setBounds(590, 160, 20, 20);
        jb1 = new JButton("คำนวณค่าทัวร์");
        jb1.setBounds(150, 200, 200, 50);
        jb1.addActionListener(this);
        b1 = new JLabel("");
        b1.setBounds(10, 280, 850, 20);
        b2 = new JLabel("");
        b2.setBounds(10, 310, 850, 20);
        b3 = new JLabel("");
        b3.setBounds(10, 340, 850, 20);
        b4 = new JLabel("");
        b4.setBounds(10, 370, 850, 20);
        b5 = new JLabel("");
        b5.setBounds(10, 430, 850, 20);
        b6 = new JLabel("");
        b6.setBounds(10, 450, 850, 20);
        q.add(a);
        q.add(a1);
        q.add(t1);
        q.add(a2);
        q.add(t2);
        q.add(a3);
        q.add(t3);
        q.add(a4);
        q.add(t4);
        q.add(a5);
        q.add(t5);
        q.add(b1);
        q.add(b2);
        q.add(b3);
        q.add(b4);
        q.add(b5);
        q.add(b6);
        q.add(cb1);
        q.add(cb2);
        q.add(cb3);
        q.add(cb4);
        q.add(cb5);
        q.add(cb6);
        q.add(cb7);
        q.add(cb8);
        q.add(cb9);
        q.add(cb10);
        q.add(jb1);
        q.setSize(820, 520);
        q.setLayout(null);
        q.setVisible(true);
    }

   	
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        String s4 = t4.getText();
        String s5 = t5.getText();
        double a = Integer.parseInt(s1);
        double b = Integer.parseInt(s2);
        double c = Integer.parseInt(s3);
        double d = Integer.parseInt(s4);
        double f = Integer.parseInt(s5);
        double g = 0, a_1, b_1, c_1, d_1, f_1, car1 = 0, car2 = 0, car3 = 0, car4 = 0, car5 = 0, room1 = 0, room2 = 0,
                room3 = 0, room4 = 0, room5 = 0;
        if (e.getSource() == jb1) {
            if (cb1.isSelected()) {
                car1 = 2000 * Math.ceil(a / 4) * 3;
            }
            if (cb2.isSelected()) {
                room1 = 2000 * Math.ceil(a / 2) * 3;
            }
            if (cb3.isSelected()) {
                car2 = 2000 * Math.ceil(b / 4) * 4;
            }
            if (cb4.isSelected()) {
                room2 = 1500 * Math.ceil(b / 2) * 4;
            }
            if (cb5.isSelected()) {
                car3 = 2000 * Math.ceil(c / 4) * 5;
            }
            if (cb6.isSelected()) {
                room3 = 1200 * Math.ceil(c / 2) * 5;
            }
            if (cb7.isSelected()) {
                car4 = 2000 * Math.ceil(a / 4) * 6;
            }
            if (cb8.isSelected()) {
                room4 = 1600 * Math.ceil(a / 2) * 6;
            }
            if (cb9.isSelected()) {
                car5 = 2000 * Math.ceil(a / 4) * 6;
            }
            if (cb10.isSelected()) {
                room5 = 2100 * Math.ceil(a / 2) * 6;
            }
            a_1 = 50000 * a;
            b_1 = 49000 * b;
            c_1 = 48000 * c;
            d_1 = 47000 * d;
            f_1 = 46000 * f;
            g = a_1 + b_1 + c_1 + d_1 + f_1 + car1 + car2 + car3 + car4 + car5 + room1 + room2 + room3 + room4 + room5;
            String a3 = String.valueOf(a_1);
            b1.setText("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท/คน      จำนวน " + a + " คน " + "= " + a3
                    + " บาท เช่ารถ " + car1 + " บาท ห้องพัก " + room1 + " บาท");
            String b3 = String.valueOf(b_1);
            b2.setText("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท/คน      จำนวน " + b + " คน " + "= " + b3
                    + " บาท เช่ารถ " + car2 + " บาท ห้องพัก " + room2 + " บาท");
            String c3 = String.valueOf(c_1);
            b3.setText("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท/คน       จำนวน " + c + " คน " + "= " + c3
                    + " บาท เช่ารถ " + car3 + " บาท ห้องพัก " + room3 + " บาท");
            String d3 = String.valueOf(d_1);
            b4.setText("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท/คน       จำนวน " + d + " คน " + "= " + d3
                    + " บาท เช่ารถ " + car4 + " บาท ห้องพัก " + room4 + " บาท");
            String f3 = String.valueOf(f_1);
            b5.setText("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท/คน             จำนวน " + f + " คน " + "= " + f3
                    + " บาท เช่ารถ " + car5 + " บาท ห้องพัก " + room5 + " บาท");
            String gm = String.valueOf(g);
            b6.setText("รวมทั้งสิ้น = " + gm + " บาท");
        }
    }

    public static void main(String[] args) {
        new NO4();
    }

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }

    }

}
