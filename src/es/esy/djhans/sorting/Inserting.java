package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 07.03.2016.
 */
public class Inserting {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            mas[i] = rnd.nextInt(100);
        }
        printArray(mas);

        for (int i = 1; i < mas.length - 1; i++) {
            int temp = mas[i];
            int j = i - 1;
            while (j >= 0 && mas[j] > temp) {
                mas[j + 1] = mas [j];
                j--;
            }
            mas[j + 1] = temp;
        }

        printArray(mas);


    }

    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int n : array) System.out.print(n + " ");
        System.out.println("]");
    }
}
