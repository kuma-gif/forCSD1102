import javax.swing.*; 
import java.awt.*; 
public class pro1_2_Font extends JFrame {
     public static void main(String[] args) {
         new pro1_2_Font();
     } 
     
     public pro1_2_Font() {
        setTitle("Set Font");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        
        Font font = new Font("Microsoft Sans Serif", Font.PLAIN, 14); 
        JButton button;
        for (int i = 3; i <= 6; i++) {
            button = new JButton("Button" + i);
            button.setFont(font);
            add(button);
         } 
         
         // pack();
          setVisible(true);
    }
}