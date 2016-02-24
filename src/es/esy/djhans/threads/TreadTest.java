package es.esy.djhans.threads;

/**
 * Created by Administrator on 28.01.2016.
 */
public class TreadTest {
    static final Object one = new Object();
    static final Object two = new Object();

    static Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (one) {
                System.out.println("Begin first thread");
                Thread.yield();
                synchronized (two) {
                    System.out.println("First thread success!");
                }
            }
        }
    });

    static Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (two) {
                System.out.println("Begin second thread");
                synchronized (one) {
                    System.out.println("Second thread success!");
                }
            }
        }
    });

    public static void main(String[] args) {
        t1.start();
        t2.start();
    }
}
