package es.esy.djhans.codewars;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 06.12.2015.
 */
public class Max {
    public static int sequence(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int n : arr) {
            sum += n;
            if (sum < 0) sum = 0;
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(sequence(new int[]{-2, -1, -3, 4, -1, 2, 1, 5, 4}));
    }
}
