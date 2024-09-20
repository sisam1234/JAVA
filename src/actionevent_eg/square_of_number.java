package actionevent_eg;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class square_of_number implements ActionListener{
    Frame f;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1;
    square_of_number() {
        f = new Frame("Square Calculator");
        l1 = new JLabel("Enter any number:");
        l1.setBounds(20, 40, 150, 20); 
        t1 = new JTextField();
        t1.setBounds(170, 40, 100, 20); 
        b1 = new JButton("Calculate Square");
        b1.setBounds(20, 80, 150, 30); 
        l2 = new JLabel("Squared of number:");
        l2.setBounds(20, 120, 150, 20); 
        t2 = new JTextField();
        t2.setBounds(170, 120, 100, 20); 
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);
        f.add(t2);
        b1.addActionListener(this);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());    
            int sq = num1*num1;    
            t2.setText(String.valueOf(sq));    
       }
    } 
    public static void main(String[] args) {
        new square_of_number();
    }
}
