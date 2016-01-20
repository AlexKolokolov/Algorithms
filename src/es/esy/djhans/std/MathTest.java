package es.esy.djhans.std;

import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

/**
 * Created by User on 11.09.2015.
 */
public class MathTest {

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n - 2) + n;
    }


    public static void main(String[] args) {
        System.out.println(exR1(5));
    }
}
