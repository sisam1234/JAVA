package actionevent_eg;
import java.awt.event.*;

import java.awt.*;
public class actionevent_eg implements ActionListener {
    TextField tf;
    Button b;
    actionevent_eg() {
        Frame f = new Frame();
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        b = new Button("Click");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello!!");
    }

    public static void main(String[] args) {
        new actionevent_eg();
    }
}
