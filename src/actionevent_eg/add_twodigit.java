package actionevent_eg;
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class add_twodigit extends Frame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1; 
    add_twodigit()
    {  
        l1 = new JLabel("First Number:");
        l1.setBounds(20, 100, 100, 20);          
        t1 = new JTextField();      
        t1.setBounds(120, 100, 100, 20);      
        l2 = new JLabel("Second Number:");      
        l2.setBounds(20, 140, 100, 20);
        t2 = new JTextField();      
        t2.setBounds(120, 140, 100, 20);      
        b1 = new JButton("Sum");      
        b1.setBounds(20, 170, 80, 20);      
        t3 = new JTextField();      
        t3.setBounds(120, 170, 100, 20);      
        add(l1);      
        add(t1);      
        add(l2);      
        add(t2);      
        add(b1);      
        add(t3);        
        b1.addActionListener(this);
        setSize(400,300);
        setLayout(null);      
        setVisible(true);     
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());    
            int num2 = Integer.parseInt(t2.getText());    
            int sum = num1 + num2;    
            t3.setText(String.valueOf(sum));    
       }
    } 
    public static void main(String[] args) {
        add_twodigit ap=new add_twodigit();
    }
}

