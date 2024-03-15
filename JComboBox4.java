import javax.swing.*;

public class JComboBox4 {
    JFrame f;

    JComboBox4() {
        f = new JFrame("สหรัถ อินต๊ะวิรา");
        String motorcycle[] = { "X-Max", "CBR-300", "YZF R-3", "z300", "Vespa300", "Z300", "ninja300", "Forza300" };
        JComboBox cb = new JComboBox(motorcycle);
        cb.setBounds(150, 70, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBox4();
    }
}
