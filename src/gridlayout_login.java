import javax.swing.*;
import java.awt.*;

public class gridlayout_login {
    private JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordtext;
    private JButton loginButton;
    private JButton resetButton;
    gridlayout_login(){
        f=new JFrame();
        f.setTitle("Login Form");
        f.setLayout(new GridLayout(4,2,10,10));
         userLabel=new JLabel("Username");
         userLabel.setHorizontalAlignment(JLabel.CENTER);
         f.add(userLabel);
         userText=new JTextField();
         f.add(userText);

         passwordLabel=new JLabel("Password");
         passwordLabel.setHorizontalAlignment(JLabel.CENTER);
         f.add(passwordLabel);
         passwordtext=new JPasswordField();
         f.add(passwordtext);

         loginButton=new JButton("Login");
         f.add(loginButton);
         resetButton=new JButton("Reset");
         f.add(resetButton);
         f.setSize(300,300);
         f.setVisible(true);
    }
    public static void main(String[] args) {
        new gridlayout_login();
    }
}