 import java.awt.*;
import java.awt.event.*;

public class AWT_Form extends Frame implements ActionListener {
    TextField nameField, emailField;
    TextArea aboutMeArea;
    Choice genderChoice;
    List hobbiesList;
    Button submitButton, cancelButton;
    public AWT_Form(){
        // Set the layout of the frame
        setLayout(new FlowLayout());

        // Create and add Name label and text field
        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);
        add(nameLabel);
        add(nameField);

        // Create and add Email label and text field
        Label emailLabel = new Label("Email:");
        emailField = new TextField(20);
        add(emailLabel);
        add(emailField);

        // Create and add About Me label and text area
        Label aboutMeLabel = new Label("About Me:");
        aboutMeArea = new TextArea(3, 20);
        add(aboutMeLabel);
        add(aboutMeArea);

        // Create and add Gender label and choice dropdown
        Label genderLabel = new Label("Gender:");
        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");
        add(genderLabel);
        add(genderChoice);

        // Create and add Hobbies label and list
        Label hobbiesLabel = new Label("Hobbies:");
        hobbiesList = new List(4, true); // Multiple selection enabled
        hobbiesList.add("Reading");
        hobbiesList.add("Traveling");
        hobbiesList.add("Gaming");
        hobbiesList.add("Cooking");
        hobbiesList.add("Sports");
        add(hobbiesLabel);
        add(hobbiesList);

        // Create and add Submit button
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        // Create and add Cancel button
        cancelButton = new Button("Cancel");
        cancelButton.addActionListener(this);
        add(cancelButton);

        // Set Frame properties
        setTitle("Simple Form");
        setSize(300, 400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("Form Submitted");
            System.out.println("Name: " + nameField.getText());
            System.out.println("Email: " + emailField.getText());
            System.out.println("About Me: " + aboutMeArea.getText());
            System.out.println("Gender: " + genderChoice.getSelectedItem());
            System.out.println("Hobbies: " + String.join(", ", hobbiesList.getSelectedItems()));
        } else if (e.getSource() == cancelButton) {
            System.out.println("Form Cancelled");
            nameField.setText("");
            emailField.setText("");
            aboutMeArea.setText("");
            genderChoice.select(0);
            for (int i = 0; i < hobbiesList.getItemCount(); i++) {
                hobbiesList.deselect(i);
            }
        }
    }
    public static void main(String[] args) {
        new AWT_Form();
    }
} 
    

