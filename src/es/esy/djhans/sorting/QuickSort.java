package es.esy.djhans.sorting;

import java.util.Random;

/**
 * Created by Administrator on 26.01.2016.
 */
public class QuickSort {
    static int[] mas = new int[20];

    public static void initMas() {
        for (int i = 0; i < 20; i++) {
            mas[i] = new Random().nextInt(100);
        }
    }

    static void quickSort() {
        int start = 0;
        int end = mas.length - 1;
        doSort(start, end);
    }

    private static void doSort(int start, int end) {
        if (start >= end) return;
        int i = start;
        int j = end;
        int c = i + (j - i) / 2;
        while (i < j) {
            while (i < c && mas[i] <= mas[c]) i++;
            while (j > c && mas[j] >= mas[c]) j--;
            if (i < j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                if (i == c) c = j;
                else if (j == c) c = i;
            }
        }
        doSort(start, c);
        doSort(c + 1, end);
    }

    private static void printMas() {
        for (int i = 0; i < 20; i++) {
            System.out.println(mas[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        initMas();
        printMas();
        quickSort();
        printMas();
    }

}
