//โปรแกรมค่าสินค้า: จงเขียนโปรแกรมรับค่าสินค้า แล้วนํามาคํานวณส่วนลดของสินค้าตามเงื่อนไข แล้วแสดงส่วนลดzและราคาสุทธิ

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class NO2 extends JFrame implements ActionListener{ 
    private static final Font Serif = null;

    JButton b;
    JLabel l1, l2,l3;
    JTextField t1,t2,t3;

    NO2(){ 
        Font quot;
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif",Font.PLAIN,14));
        JFrame f = new JFrame("โปรแกรมหาค่ารวมและค่าเฉลี่ย: เสถียร จันทร์ปลา");
        f.setBounds(500, 100, 400, 600);
         f.setSize(400, 600);
         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
         //JButton
         
        b = new JButton(" คำนวณ ");
        b.setBounds(125, 200, 100, 50);
        f.add(b);

        //JTextField
            t1=new JTextField ();
            t1.setBounds(210, 145, 70, 40);

            t2=new JTextField();
            t2.setBounds(210, 270, 70, 40);
            t2.setEditable(false);

            t3=new JTextField();
            t3.setBounds(210, 350, 70, 40);
            t3.setEditable(false);
            f.add(t1);
            f.add(t2);
            f.add(t3);
            


       //JLabel

       l1 = new JLabel("ราคาสินค้า");
         l1.setBounds(130, 150, 300, 20);
         
       l2 = new JLabel("ส่วนลด");
       l2.setBounds(130, 280, 300, 20);
       
       l3 = new JLabel("ราคาสุทธิ");
         l3.setBounds(130, 360, 300, 20);
         f.add(l1);
         f.add(l2);
         f.add(l3);
         b.addActionListener(this);
    }

         public void actionPerformed(ActionEvent e) {
       
            int price = Integer.parseInt(t1.getText());
            
           
            double c1 = 0 ;
            double c2 = 0 ;
            double c3 = 0 ;
            double c4 = 0 ;
            double c5 = 0 ;
            double c6 = 0 ;
            if (e.getSource() == b ) {

            if(price < 10000 ) {
                c1 = price-(price*3/100);
                c2 = price*3/100 ;
            }
            if ( price <= 10001 ){
                c3 = price-(price*5/100) ;
                c4 = price*5/100 ;
            }
            
             if(price  <= 100000) {
                c5 = price-(price*10/100) ;
                c6 = price*10/100 ;
            }
        
        }
        

            String result_c2 = String.valueOf(c2);
        t2.setText(result_c2);

        String result_c1 = String.valueOf(c1);
        t3.setText(result_c1);

        String result_c4 = String.valueOf(c4);
        t2.setText(result_c4);

        String result_c3 = String.valueOf(c3);
        t3.setText(result_c3);

        String result_c6 = String.valueOf(c6);
        t2.setText(result_c6);

        String result_c5 = String.valueOf(c5);
        t3.setText(result_c5);




            } 
    
    public static void main(String[] args) {
        new NO2();
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
  

   

    
        
    

