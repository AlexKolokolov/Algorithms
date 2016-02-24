package es.esy.djhans.inheritance;

/**
 * Created by Administrator on 11.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Bar();
        f.addFive();
        System.out.println(f.a);
    }
}
