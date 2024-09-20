import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class listener_interface  {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JFrame f = new JFrame();

    listener_interface() {
        l1 = new JLabel("First Number:");
        l1.setBounds(10, 10, 200, 20);
        t1 = new JTextField();
        t1.setBounds(150, 10, 200, 20);
        l2 = new JLabel("Second Number:");
        l2.setBounds(10, 40, 200, 20);
        t2 = new JTextField();
        t2.setBounds(150, 40, 200, 20);
        l3 = new JLabel("Press any key");
        l3.setBounds(10, 70, 200, 20);
        t3 = new JTextField();
        t3.setBounds(150, 70, 200, 20);
        KeyListener kl = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                t3.setText(String.valueOf(sum));
            }
            public void keyReleased(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int diff = num1 - num2;
                t3.setText(String.valueOf(diff));
            }
            public void keyTyped(KeyEvent e) {}
        };
        t3.addKeyListener(kl);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new listener_interface();
    }
}
