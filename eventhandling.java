import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class dialogbox{
    dialogbox(){
        JFrame window = new JFrame("EventHandling");
        JButton btn = new JButton("click");
        btn.setBounds(140, 180, 100, 40);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(btn,"Hello");
            }
        });
        window.add(btn);
        window.setSize(400,500);
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class eventhandling {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new dialogbox();
        });
    }
}
