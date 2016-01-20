package es.esy.djhans.codewars;

/**
 * Created by Administrator on 07.12.2015.
 */
public class DeltaBits {
    public static int convertBits(int a, int b) {
//        int c = a ^ b;
//        int res = 0;
//        while (c > 0) {
//            if (c % 2 != 0) res++;
//            c >>>= 1;
//        }
//        return res;
        return Integer.bitCount(a ^ b);
    }

    public static void main(String[] args) {
        System.out.println(convertBits(31,14));
    }
}
