//โปรแกรมค่าทัวร์: จงเขียนโปรแกรม คํานวณค่าบริการ ของบริษัททัวร์แห่งหนึ่ง โดยมีแพคเกจทัวร์ให้เลือกดังนี้
//1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน
//2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน
//3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน
//4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน
//5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน
//จงเขียนโปรแกรมรับจํานวนคนที่เลือกแต่ละแพคเกจแล้วคํานวณราคารวมทั้งหมดที่ต้องจ่าย
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class NO3 extends JFrame implements ActionListener{
    

    private static final Font Serif = null;

    JButton jb1 ;
    JTextField j1,j2,j3,j4,t5 ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12 ;
        NO3(){ 
            Font quot;
            setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif",Font.PLAIN,14));
            JFrame f = new JFrame("โปรแกรมหาค่ารวมและค่าเฉลี่ย: เสถียร จันทร์ปลา");
            f.setBounds(400, 100, 600, 600);
             f.setSize(700, 600);
             f.setLayout(null);
             f.setVisible(true);
             f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    //JButton ปุ่ม
     jb1=new JButton("คำนวณค่าทัวร์");
     jb1.setBounds(150, 400, 120, 60);
     f.add(jb1);
     
    
    //JTextField ช่องเขียน    
    j1 =new JTextField();
    j1.setBounds(400, 100, 120, 50);
    j2 =new JTextField();
    j2.setBounds(400, 160, 120, 50);
    j3 =new JTextField();
    j3.setBounds(400, 220, 120, 50);
    j4 =new JTextField();
    j4.setBounds(400, 280, 120, 50);
    t5 =new JTextField();
    t5.setBounds(400, 340, 120, 50);
    
    f.add(j1);
    f.add(j2);
    f.add(j3);
    f.add(j4);
    f.add(t5);
    
    //JLabel คำบรรยาย    
    l1 =new JLabel("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน");
    l1.setBounds(50, 105, 305, 20);
    l2 =new JLabel("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน");
    l2.setBounds(50, 165, 305, 20);
    l3 =new JLabel("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน");
    l3.setBounds(50, 225, 305, 20);
    l4 =new JLabel("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน");
    l4.setBounds(50, 285, 305, 20);
    l5 =new JLabel("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน");
    l5.setBounds(50, 345, 300, 20);
    l6 =new JLabel("โปรแกรมค่าทัวร์: เสถียร จันทร์ปลา");
    l6.setBounds(230, 20, 300, 20);

    //ด้านล่าง
    l7 = new JLabel("s");
    l7.setBounds(200, 505, 600, 20);
    l8 = new JLabel("s");
    l8.setBounds(200, 565, 600, 20);
    l9 = new JLabel("s");
    l9.setBounds(200, 625, 600, 20);
    l10 = new JLabel("s");
    l10.setBounds(200, 685, 600, 20);
    l11 = new JLabel("s");
    l11.setBounds(200, 745, 600, 20);
    l12 = new JLabel("s");
    l12.setBounds(200, 805, 600, 20);




    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(l6);
    jb1.addActionListener(this);
    f.add(l7);
    f.add(l8);
    f.add(l9);
    f.add(l10);
    f.add(l11);
    f.add(l12);
    
        }
    
        public void actionPerformed(ActionEvent e) {
           
            int a1 = Integer.parseInt(j1.getText());
            int a2 = Integer.parseInt(j2.getText());
            int a3 = Integer.parseInt(j3.getText());
            int a4 = Integer.parseInt(j4.getText());
            int a5 = Integer.parseInt(t5.getText());
            
           
            int m = 0, f1, f2, f3, f4, f5;

    
            if (e.getSource() == jb1) {
                f1 = 50000 * a1;
                f2 = 49000 * a2;
                f3 = 48000 * a3;
                f4 = 47000 * a4;
                f5 = 46000 * a5;
                m= f1+f2+f3+f4+f5 ;

                String o1 = String.valueOf(f1);
                l7.setText("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท/คน	จำนวน " + a1 + " คน " + "ราคา " + o1 + " บาท");
                String o2 = String.valueOf(f2);
                l8.setText("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท/คน	จำนวน " + a2 + " คน " + "ราคา " + o2 + " บาท");
                String o3 = String.valueOf(f3);
                l9.setText("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท/คน	จำนวน " + a3 + " คน " + "ราคา " + o3 + " บาท");
                String o4 = String.valueOf(f4);
                l10.setText("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท/คน	จำนวน " + a4 + " คน " + "ราคา " + o4 + " บาท");
                String o5 = String.valueOf(f5);
                l11.setText("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท/คน		จำนวน " + a5 + " คน " + "ราคา " + o5 + " บาท");
                String m1 = String.valueOf(m);
                l12.setText("รวมทั้งสิ้น = " + m1 + " บาท");


                }
                
    
            }

        
        public static void main(String[] args) {
            new NO3();
        }
    
        
        public static void setUIFont(javax.swing.plaf.FontUIResource f) {
            Enumeration<Object> keys = UIManager.getDefaults().keys();
            while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
            UIManager.put(key, f);
            }
        }
    

}

}


