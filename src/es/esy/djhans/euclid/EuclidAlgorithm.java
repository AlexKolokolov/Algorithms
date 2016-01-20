package es.esy.djhans.euclid;

/**
 * Created by User on 01.09.2015.
 */
public class EuclidAlgorithm {
    public static void main(String[] args) {
        System.out.println(gsd(3, 5));
    }

    public static int gsd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gsd(q, r);
    }
}
