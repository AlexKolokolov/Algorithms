package es.esy.djhans.stackoverflow;

/**
 * Created by Administrator on 15.02.2016.
 */
public class A {
    static int a = 10;
    static int b;
    static
//    {
//        a = a-- - --a;
//    }
    {
        a = a++ + ++a;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
