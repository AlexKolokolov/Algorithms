package es.esy.djhans.stackoverflow;

/**
 * Created by Administrator on 15.02.2016.
 */
public class C {
    int getValue() {
        return (true ? null : 0);
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getValue());
    }
}
