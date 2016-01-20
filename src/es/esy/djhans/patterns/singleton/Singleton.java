package es.esy.djhans.patterns.singleton;

/**
 * Created by Administrator on 14.01.2016.
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private String message;

    private Singleton() {
        message = "Success!";
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void printMessage() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        Singleton.getInstance().printMessage();
    }
}
