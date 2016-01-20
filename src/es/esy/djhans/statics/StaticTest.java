package es.esy.djhans.statics;

/**
 * Created by User on 11.09.2015.
 */
public class StaticTest {
    public static int argument() {
        return 5 + 5;
    }

    public static int method(int arg) {
        return  10 - arg;
    }

    public static void main(String[] args) {
        System.out.println(method(argument()));
    }
}
