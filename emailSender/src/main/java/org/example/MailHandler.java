package org.example;

import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.SQLOutput;
import java.util.Properties;

public class MailHandler {
    void sendMail(){
   Properties sysProperties = System.getProperties();
        System.out.println(sysProperties);

        sysProperties.put("mail.smtp.host", MailSendData.HostServer);
        sysProperties.put("mail.smtp.port", MailSendData.port);
        sysProperties.put(MailSendData.sslProperty, "true");
        sysProperties.put(MailSendData.authPerm, "true");

        Authenticator mailAuthenticator = new CustomMailAuth();

        Session mailsession = Session.getInstance(sysProperties.mailAuthenticator);

        MimeMessage mailMassage = new MimeMessage(mailsession);
        try {
            mailMassage.setFrom(MailSendData.myUserMail);
            mailMassage.setSubject("This is my Java Code Testing");
            mailMassage.setText("Hey this is Suraj who is trying to send mail using java");

            Address receiverEmail = new InternetAddress(MailSendData.receiverMail);
            mailMassage.setRecipient(message.RecipientType.TO, receiverEmail);
            Transport.send(mailMassage);
        }
        catch(Exception e){
            System.out.println(e.toString());

        }

    }
}
