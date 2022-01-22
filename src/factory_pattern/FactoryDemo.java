package factory_pattern;

interface EmailSender {
    void sendEmail();
}

class GmailSender implements EmailSender {

    @Override
    public void sendEmail() {
        System.out.println("Email sent via Gmail");
    }
}

class OutlookSender implements EmailSender {

    @Override
    public void sendEmail() {
        System.out.println("Email sent via Outlook");
    }
}

class EmailServerFactory {
    public EmailSender gmailSender() {
        return new GmailSender();
    }
    public EmailSender outlookSender() {
        return new OutlookSender();
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        EmailServerFactory emailServerFactory = new EmailServerFactory();

        EmailSender gmailSender = emailServerFactory.gmailSender();
        gmailSender.sendEmail();

        EmailSender outlookSender = emailServerFactory.outlookSender();
        outlookSender.sendEmail();
    }
}
