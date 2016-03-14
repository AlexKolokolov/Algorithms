package es.esy.djhans.threads.producerconsumer;

import java.util.LinkedList;

/**
 * Created by Administrator on 05.03.2016.
 */
public class ExchangeBuffer {
    private Integer buffer;

    public int getData() {
        synchronized (this) {
            while (buffer == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int result = buffer;
            buffer = null;
            notifyAll();
            return result;
        }
    }

    public void setData(int data) {
        synchronized (this) {
            while (buffer != null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer = data;
            notifyAll();
        }
    }
}
