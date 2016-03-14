package es.esy.djhans.lambdas;

import java.util.Random;

/**
 * Created by Administrator on 10.03.2016.
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Thread " + Thread.currentThread().getId() + " runs");
            System.out.println("Thread " + Thread.currentThread().getId() + " produces number " + new Random().nextInt(100));
            System.out.println("Thread " + Thread.currentThread().getId() + " stops");
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }
}
