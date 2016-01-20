package es.esy.djhans.codewars;

/**
 * Created by Administrator on 28.11.2015.
 */
public class PiApprox {

    public static String iterPi2String(Double epsilon) {
        // your code
        double pi4 = 0;
        int den = 1;
        while (Math.abs(pi4 * 4 - Math.PI) > epsilon) {
            pi4 += 1.0 / den;
            den = den > 0 ? -(den + 2) : -den + 2;
        }
        return String.format("[%d, %.10f]", (Math.abs(den) - 1) / 2, pi4 * 4);
    }

    public static void main(String[] args) {
        System.out.println(iterPi2String(0.0002));
    }
}
