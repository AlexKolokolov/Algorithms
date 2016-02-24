package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 26.01.2016.
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = new Random().nextInt(100);
        }

        int n = 0;
        boolean end = false;
        while (!end) {
            end = true;
            for (int i = 0; i < mas.length - 1 - n; i++) {
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    end = false;
                }
            }
            n++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(mas[i]);
        }
        System.out.println("N = " + n);
    }

}
