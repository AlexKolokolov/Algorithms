package es.esy.djhans.codewars;

/**
 * Created by Administrator on 27.11.2015.
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        // your code
//        double m = Math.sqrt(number * 8 + 1);
//        return Math.round(m) == m;
        return Math.sqrt(number * 8 + 1) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangleNumber(1));
        System.out.println(isTriangleNumber(2));
        System.out.println(isTriangleNumber(3));
        System.out.println(isTriangleNumber(4));
        System.out.println(isTriangleNumber(5));
        System.out.println(isTriangleNumber(6));
        System.out.println(isTriangleNumber(7));
        System.out.println(isTriangleNumber(8));
        System.out.println(isTriangleNumber(9));
        System.out.println(isTriangleNumber(10));
    }
}
