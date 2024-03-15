import javax.swing.*;

public class JComboBox2 {
    JFrame f;

    JComboBox2() {
        f = new JFrame("สหรัถ อินต๊ะวิรา");
        String country[] = { "India", "Australia", "U.S.A", "England", "Newzelaand","Poland","Japan"};
		JComboBox cb = new JComboBox(country);
        cb.setBounds(150, 70, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBox2();
    }
}
