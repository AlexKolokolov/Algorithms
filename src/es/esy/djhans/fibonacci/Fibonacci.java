package es.esy.djhans.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 18.02.2016.
 */
public class Fibonacci {

    static long i = 0;

    static long j = 0;

    static long stackDepth = 0;

    public static long fib(int n) {
        if (n == 1) j++;
        i++;
        if (stackDepth < i) stackDepth = i;
        if (n == 1) {
            i--;
            return 1;
        }
        else if (n == 2) {
            i--;
            return 1;
        }
        else {
            long result = fib(n - 1) + fib(n - 2);
            i--;
            return result;
        }
    }

    public static long fib2(int n) {
        long[] mas = new long[n];
        mas[0] = mas[1] = 1;
        for (int k = 2; k < n; k++) {
            mas[k] = mas[k - 1] + mas[k - 2];
        }
        return mas[n - 1];
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter int n");
//        int n = Integer.parseInt(reader.readLine());
        int n = 100;
        long startTime = System.currentTimeMillis();
        System.out.println("fib(" + n + ") = " + fib2(n));
        System.out.println("Finding took " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println(i);
        System.out.println(j);
        System.out.println(stackDepth);
    }
}
