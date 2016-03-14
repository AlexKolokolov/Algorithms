package es.esy.djhans.threads;

/**
 * Created by Administrator on 24.02.2016.
 */
public class ThreadTest4 {
    public synchronized void printer() {
        System.out.println(Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(500);
            this.notify();
            this.wait();
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    public static void main(String[] args) {

        ThreadTest4 tt4 = new ThreadTest4();
        final int x = 10;
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(x);
                tt4.printer();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tt4.printer();
            }
        });
        thread2.start();
    }
}
