import javax.swing.*;

public class textfield {
    public static void main(String[] args) {
        JFrame window = new JFrame("TextField");
        JTextField btn = new JTextField("Enter the Text");
        btn.setBounds(20, 180, 350, 40);
        window.setSize(400,500);
        window.add(btn);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
