package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 26.01.2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = new Random().nextInt(100);
        }

        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(mas[i]);
        }
    }

}
