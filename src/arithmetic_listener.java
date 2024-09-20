import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class arithmetic_listener implements KeyListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;    
    arithmetic_listener(){
        Frame f = new Frame();
        l1 = new JLabel("First Number:");
        l1.setBounds(20,50,200,20);
        t1 = new JTextField();
        t1.setBounds(150,50,200,20);
        l2 = new JLabel("Second Number:");
        l2.setBounds(20,80,200,20);
        t2 = new JTextField();
        t2.setBounds(150,80,200,20);           
        l3 = new JLabel("Press any key");
        l3.setBounds(20,110,200,20);
        t3 = new JTextField();
        t3.setBounds(150,110,200,20);           
        t3.addKeyListener(this);  
        f.add(l1); f.add(t1); f.add(l2); f.add(t2);f.add(l3);f.add(t3);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        int num1 = Integer.parseInt(t1.getText());              
        int num2 = Integer.parseInt(t2.getText());              
        int sum = num1 + num2;        
        t3.setText(String.valueOf(sum));   
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int num1 = Integer.parseInt(t1.getText());              
        int num2 = Integer.parseInt(t2.getText());              
        int diff = num1 - num2;        
        t3.setText(String.valueOf(diff));
    }
    public static void main(String[] args) throws Exception{
        new arithmetic_listener();
    }
}