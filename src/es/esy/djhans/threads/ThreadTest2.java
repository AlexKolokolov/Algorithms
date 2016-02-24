package es.esy.djhans.threads;

/**
 * Created by Administrator on 24.02.2016.
 */
public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread printerA = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println("A     .");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            printerA.start();
            Thread printerB = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(".     B");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            printerB.start();
            printerA.join();
            printerB.join();

            Thread printerC = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println("  C");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            printerC.start();
//            printerC.join();
        }
    }
}
