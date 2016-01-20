package es.esy.djhans.codewars;

/**
 * Created by Administrator on 08.12.2015.
 */
public class Suite {
    public static double going(int n) {
        // your code
        double sum = 1;
        double addendum = 1.0;
        for (int i = 0; i < n - 1; i++) {
            addendum *= 1.0 / (n - i);
            sum += addendum;
        }
        return Math.floor(sum * 1000000) / 1000000;
    }

    public static void main(String[] args) {
        System.out.println(going(5));
        System.out.println(going(6));
        System.out.println(going(7));
        System.out.println(going(523));
    }
}
