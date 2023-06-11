package org.example;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class CustomMailAuth extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailSendData.myUserMail, MailSendData.password);
    }
}
