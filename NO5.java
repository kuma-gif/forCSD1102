import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
	public class NO5 extends JFrame implements ActionListener{
    private static final Font Serif = null;

    JTextField f1; 
    JLabel r1,r2,r3;           
    JButton u1 ;          
    JCheckBox c1,c2,c3,c4,c5;  


    NO5(){ 
        Font quot;
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif",Font.PLAIN,14));
        JFrame f = new JFrame("โปรแกรมหาค่ารวมและค่าเฉลี่ย: เสถียร จันทร์ปลา");
        f.setBounds(400, 100, 600, 600);
         f.setSize(500, 400);
         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);


        //ปุ่ม

         u1 = new JButton("submit");
         u1.setBounds(100, 300, 100, 40);

         f.add(u1);
         
        //ใส้ข้อความ

         f1 =new JTextField(); 
         f1.setBounds(265 ,65, 70,30);
         
         f.add(f1);
       

      //ข้อความ

      r1=new JLabel("โปรแกรมคำนวณภาษี");
      r1.setBounds(100, -20, 200, 100);
      r2=new JLabel("จำนวนเงินที่จะคำนวณภาษี");
      r2.setBounds(100, 30, 200, 100);
      r3=new JLabel("เลือกประเภทกิจการ");
      r3.setBounds(100,50, 200, 100);
         f.add(r1);
         f.add(r2);
         f.add(r3);



      //ตัวเช็ค
      c1=new JCheckBox("ธนาคาร");
      c1.setBounds(100, 120,100, 30);
      c2=new JCheckBox("ประกันชีวิต");
      c2.setBounds(100, 150, 100, 30);
      c3=new JCheckBox("ตลาดหลักทรัพย์");
      c3.setBounds(100, 180, 100, 30);
      c4=new JCheckBox("อสังหาริมทรัพย์");
      c4.setBounds(100, 210, 100, 30);
      c5=new JCheckBox("ประเภทอื่นๆ");
      c5.setBounds(100, 240, 100, 30);
      
      f.add(c1);
      f.add(c2);
      f.add(c3);
      f.add(c4);
      f.add(c5);
      u1.addActionListener(this);

        


    }

    
           
      
    

    public void actionPerformed(ActionEvent e) {
    
    
	String goe = "" ;
    String o = "" ;
    double so = 0 ;
    
    int price = Integer.parseInt(f1.getText());

    if (c1.isSelected()) {
        goe += "ธนาคาร";
        so = price  * 3/100;
        o = "ภาษีร้อยละ 3 = " +so ;

    }
    if (c2.isSelected()) {
        goe += "ประกันชีวิต";
        so = price * 2.5/100;
        o = "ภาษีร้อยละ 2.5 = " + so;
    }
    if (c3.isSelected()) {
        goe += "ตลาดหลักทรัพย์";
        so = price * 0.1/100;
        o = "ภาษีร้อยละ 0.1 = " + so;
    }
    if (c4.isSelected()) {
        goe += "อสังหาริมทรัพย์";
        so = price * 1/100;
        o = "ภาษีร้อยละ 1 = " + so;
    }
    if (c5.isSelected()) {
        goe += "ประเภทอื่นๆ";
        so = price * 5/100;
        o = "ภาษีร้อยละ 5 = " + so;
    }
    JOptionPane.showMessageDialog(this, "โปรแกรมคำนวณภาษี\n" + "จำนวนเงินที่จะคำนวณภาษี = "
     + price + "\nประเภทกิจการ = " + goe + "\n"+"ภาษีร้อยละ" + so +"="
      +(price-(price*so/100)-price));


    }

        
    
    public static void main(String[] args) {
        new NO5();
    }


    
        
    


     public static void setUIFont(javax.swing.plaf.FontUIResource f) { //นำเข้าตัวหนังสือไทย
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