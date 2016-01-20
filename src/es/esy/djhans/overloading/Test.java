package es.esy.djhans.overloading;

/**
 * Created by Administrator on 15.12.2015.
 */
public class Test {

    public void execute(String s) {
        System.out.println("1");
    }

    public void execute(String... s) {
        System.out.println("*");
    }

    public void execute(String a, String b) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.execute("bla");
        test.execute("bla", "bla");
        test.execute("bla", "bla", "bla");
    }

}
