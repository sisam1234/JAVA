import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class mail{
    public static void main(String[] args) throws Exception {
        // Get properties object
        Properties prop = new Properties();

        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);
        // get Session
        Session session = Session.getDefaultInstance(prop,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new

                PasswordAuthentication("sisamghaju72@gmail.com", "bzbq msxh tbqk rqmx");

                    }
                });
        try {
            // compose message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sisamghaju72@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("reeyaawal123@gmail.com"));
            message.setSubject("Hello Samriddhi");
            message.setText("Welcome to Samriddhi COllege");
            // send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}