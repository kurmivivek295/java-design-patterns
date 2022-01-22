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

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("First Object: " + singleton1);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second Object: " + singleton2);
        // Both objects hashcode will be equal
    }
}
