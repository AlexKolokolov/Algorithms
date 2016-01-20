package es.esy.djhans.codewars;

/**
 * Created by Administrator on 27.11.2015.
 */
public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        int gcd = Math.abs(gcd(x, y));
        int count = 0;
        for (int i = 0; i < 32 ; i++) {
            if (gcd % 2 != 0) count++;
            gcd >>>= 1;
        }
        return count;
    }

    public static int gcd(int x, int y) {
        if (y == 0) return x;
        int r = (x % y);
        return gcd(y, r);
    }

    public static void main(String[] args) {
//        System.out.println(gcdBinary(666666,333111));
//        System.out.println(gcdBinary(545034,5));
//        System.out.println(gcdBinary(0,0));
//        System.out.println(gcdBinary(0,76899299));
//        System.out.println(gcdBinary(-124, -16));
        System.out.println(gcd(-124,-16));
    }
}
