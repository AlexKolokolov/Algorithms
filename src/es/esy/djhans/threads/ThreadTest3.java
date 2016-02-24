package es.esy.djhans.threads;

/**
 * Created by Administrator on 24.02.2016.
 */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
        Object o = new Object();
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    System.out.println("new Thread");
                    o.notify();
                }
            }
        });
        newThread.start();

        synchronized (o) {
            System.out.println("main thread begin");
            o.wait();
            System.out.println("main thread die");
        }
    }
}
