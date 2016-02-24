package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 26.01.2016.
 */
public class OddEven {
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = new Random().nextInt(100);
        }

        int i = 0;
        int j = mas.length - 1;
        while (i < j) {
            while (mas[i] % 2 == 0) i++;
            while (mas[j] % 2 != 0) j--;
            if (i < j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
            }
        }

        for (int k = 0; k < 20; k++) {
            System.out.println(mas[k]);
        }
    }

}
