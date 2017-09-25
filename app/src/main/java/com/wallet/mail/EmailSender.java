package com.wallet.mail;

/**
 * Created by Madhusudhan Reddy on 8/20/2017.
 */

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    public EmailSender() {
    }

    public void sendHtmlEmail(String host, String port, final String userName, final String password, String toAddress, String subject, String message) throws AddressException, MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = new InternetAddress[]{new InternetAddress(toAddress)};
        msg.setRecipients(RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setContent(message, "text/html");
        Transport.send(msg);
    }

    public void sendRegistrationEmail(String userName, String to, String sub) {
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "mkreddy.kalathur@gmail.com";
        String password = "xctqtnenqngncmix";
        String mailTo = to;
        String subject = sub;
        String message = ""+userName;
        EmailSender mailer = new EmailSender();
        System.out.println(""+mailer);

        try {
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo, subject, message);
            System.out.println("Email sent.");
        } catch (Exception var13) {
            System.out.println("Failed to sent email.");
            var13.printStackTrace();
        }

    }
}
