package es.esy.djhans.exceptions;

import java.io.FileNotFoundException;

/**
 * Created by Administrator on 10.03.2016.
 */
public class ExceptionTest {
    public static void doSomething() throws FileNotFoundException {
        System.out.println("Do something before exception");
        if (Math.random() >= 0.5) {
            System.out.println("Error occurred");
            throw new FileNotFoundException();
        }
        System.out.println("Do something after exception");
    }

    public static boolean useSomeMethod() {
        System.out.println("Open resources");
        try {
            doSomething();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            System.out.println("Closing resources in the finally block");
        }
        System.out.println("Closing resources outside the finally block");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(useSomeMethod());
    }
}
