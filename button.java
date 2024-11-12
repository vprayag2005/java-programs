import javax.swing.*;
public class button {
    public static void main(String[] args) {
        JFrame window = new JFrame("Button");
        JButton btn = new JButton("click");
        btn.setBounds(140, 180, 100, 40);
        window.setSize(400,500);
        window.add(btn);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
