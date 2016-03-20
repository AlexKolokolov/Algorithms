package es.esy.djhans.lambdas;

/**
 * Created by kolokolov on 3/20/16.
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        Thread newThread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getId() + " runs"));
        newThread.start();
    }
}
