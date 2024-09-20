import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class operation_option extends Frame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;
    JComboBox c1;

    operation_option() {
        l1 = new JLabel("First Number:");
        l1.setBounds(20, 100, 100, 20); // x, y, width, height
        t1 = new JTextField();
        t1.setBounds(120, 100, 100, 20);
        l2 = new JLabel("Second Number:");
        l2.setBounds(20, 140, 100, 20);

        l3 = new JLabel("Select Option:");
        l3.setBounds(20, 170, 100, 20);

        String[] s1 = new String[] { "Add", "Substract", "Multiply", "Divide" };
        c1 = new JComboBox(s1);
        c1.setBounds(120, 170, 100, 20);

        t2 = new JTextField();
        t2.setBounds(120, 140, 100, 20);
        b1 = new JButton("Calculate");
        b1.setBounds(20, 200, 80, 20);
        t3 = new JTextField();
        t3.setBounds(120, 200, 100, 20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);
        add(l3);

        add(c1);
        // register listener
        b1.addActionListener(this);// passing current instance
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (c1.getSelectedItem() == "Add") {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                t3.setText(String.valueOf(sum));
            } else if (c1.getSelectedItem() == "Substract") {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sub = num1 - num2;
                t3.setText(String.valueOf(sub));
            } else if (c1.getSelectedItem() == "Multiply") {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int mul = num1 * num2;
                t3.setText(String.valueOf(mul));
            } else if (c1.getSelectedItem() == "Divide") {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int div = num1 / num2;
                t3.setText(String.valueOf(div));
            }
        }

    }

    public static void main(String[] args) {
        new operation_option();
    }

}
