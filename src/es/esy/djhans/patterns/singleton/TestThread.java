package es.esy.djhans.patterns.singleton;

/**
 * Created by Administrator on 14.01.2016.
 */
public class TestThread extends Thread {

    public TestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Tread " + this.getName() + ", iteration " + i
                    + " " + Singleton.getInstance().getMessage());
//            try{
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {
        TestThread first = new TestThread("First");
        TestThread second = new TestThread("Second");
        TestThread third = new TestThread("Third");
        first.start();
        second.start();
        third.start();
    }
}
