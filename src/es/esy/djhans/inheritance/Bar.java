package es.esy.djhans.inheritance;

/**
 * Created by Administrator on 11.02.2016.
 */
public class Bar extends Foo {
    public int a = 8;
    public void addFive() {
        a += 5;
        System.out.print("b ");
    }
}
