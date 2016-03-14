package es.esy.djhans.threads;

import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 26.02.2016.
 */
public class ThreadTest5 {
    //Парковочное место занято - true, свободно - false
    private static final boolean[] PARKING_PLACES = new boolean[5];
    //Устанавливаем флаг "справедливый", в таком случае метод
    //aсquire() будет раздавать разрешения в порядке очереди
    private static final Semaphore SEMAPHORE = new Semaphore(5, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 7; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }

    public static class Car implements Runnable {
        private int carNumber;

        public Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.printf("Автомобиль №%d подъехал к парковке.\n", carNumber);
            try {
                //acquire() запрашивает доступ к следующему за вызовом этого метода блоку кода,
                //если доступ не разрешен, нить вызвавшая этот метод блокируется до тех пор,
                //пока семафор не разрешит доступ
                SEMAPHORE.acquire();

                //Ищем свободное место и паркуемся
                for (int i = 0; i < 5; i++)
                    if (!PARKING_PLACES[i]) {     //Если место свободно
                        PARKING_PLACES[i] = true;  //занимаем его
                        System.out.printf("Автомобиль №%d припарковался на месте %d.\n", carNumber, i);
                        Thread.sleep(5000);       //Уходим за покупками, к примеру
                        PARKING_PLACES[i] = false;//Освобождаем место
                        break;
                    }

                //release(), напротив, освобождает ресурс
                SEMAPHORE.release();
                System.out.printf("Автомобиль №%d покинул парковку.\n", carNumber);
            } catch (InterruptedException e) {
            }
        }
    }
}
