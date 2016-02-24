package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 26.01.2016.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = new Random().nextInt(100);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            int min = mas[i];
            int minI = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    minI = j;
                }
            }
            if (minI != i) {
                int temp = mas[i];
                mas[i] = mas[minI];
                mas[minI] = temp;
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(mas[i]);
        }
    }

}
