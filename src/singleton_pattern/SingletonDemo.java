package singleton_pattern;

final class Singleton {
    private static Singleton instance;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

interface EmailSender {
     void sendEmail();
}

final class GmailSender implements EmailSender {
    private static GmailSender instance;

    private GmailSender() {}

    public static EmailSender getInstance() {
        if (instance == null) {
            instance = new GmailSender();
        }
        return instance;
    }

    @Override
    public synchronized void sendEmail() {
        System.out.println("Email sent via Gmail");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("First Object: " + singleton1);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second Object: " + singleton2);
        // Both objects hashcode will be equal

        //Gmail sender singleton
        EmailSender sender1 = GmailSender.getInstance();
        System.out.println("Sender1: " + sender1);
        EmailSender sender2 = GmailSender.getInstance();
        System.out.println("Sender2: " + sender2);
        sender1.sendEmail();
        sender2.sendEmail();
    }
}
