import javax.swing.*;
import java.awt.*;
public class gridbag_form {
    private JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JTextField passText;
    private JButton loginButton;
    private JButton resetButton;
    gridbag_form(){
        f =new JFrame();
        f.setTitle("Login Form");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(5, 5, 5, 5);
        // gbc.fill = GridBagConstraints.HORIZONTAL;
        userLabel = new JLabel("UserName");
        gbc.gridx = 0;
        gbc.gridy = 0;
        f.add(userLabel,gbc);

        userText = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        f.add(userText,gbc);

        passLabel = new JLabel("Password");
        gbc.gridx = 0;
        gbc.gridy = 1;
        f.add(passLabel,gbc);
        
        passText = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        f.add(passText,gbc);


        loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        f.add(loginButton,gbc);

        resetButton = new JButton("Reset");
        gbc.gridx = 1;
        gbc.gridy = 2;
        f.add(resetButton,gbc);
        

        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args){
        gridbag_form g  = new gridbag_form();
    }

    
}
