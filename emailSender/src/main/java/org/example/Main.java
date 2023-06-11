package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Staring to Send out Mail");

        MailHandler mailhandler = new MailHandler();
        mailhandler.sendMail();


    }
}
