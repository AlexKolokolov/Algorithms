package es.esy.djhans.threads.producerconsumer;

import java.util.Random;

/**
 * Created by Administrator on 05.03.2016.
 */
public class Main {

    private static ExchangeBuffer buffer = new ExchangeBuffer();

    private static Runnable producer = new Runnable() {
        @Override
        public void run() {
            Random rnd = new Random();
            for (int i = 0; i < 3; i++) {
                int data = rnd.nextInt(100);
                buffer.setData(data);
                System.out.println("Producer " + Thread.currentThread().getName() + " put " + data + " to the buffer at " + System.currentTimeMillis());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private static Runnable consumer = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                int result = buffer.getData();
                System.out.println("Consumer " + Thread.currentThread().getName() + " got " + result + " from the buffer " + System.currentTimeMillis());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public static void main(String[] args) {
        Thread producer1 = new Thread(producer, "P1");
        Thread producer2 = new Thread(producer, "P2");
        Thread producer3 = new Thread(producer, "P3");
        Thread consumer1 = new Thread(consumer, "C1");
        Thread consumer2 = new Thread(consumer, "C2");
        Thread consumer3 = new Thread(consumer, "C3");
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}
