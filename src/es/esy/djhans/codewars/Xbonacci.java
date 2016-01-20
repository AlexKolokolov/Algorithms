package es.esy.djhans.codewars;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Administrator on 27.11.2015.
 */
public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {
        // hackonacci me
//        ArrayList<Long> list = new ArrayList<>();
//        for (double element : signature) list.add((long)element);
//        int initialListSize = list.size();
//        for (int i = 0; i < n - initialListSize ; i++) {
//            Long nextElement = 0L;
//            for (int j = 0; j < initialListSize; j++) {
//                nextElement += list.get(i + j);
//            }
//            list.add(nextElement);
//        }
//        double[] res = new double[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = (double)list.get(i);
//        }
//        return res;

        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < signature.length) res[i] = signature[i];
            else {
                double nextElement = 0;
                for (int j = signature.length - 1; j >= 0; j--) {
                    nextElement += res[i + j - signature.length];
                }
                res[i] = nextElement;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(xbonacci(new double[]{14, 13, 9, 19, 1, 14, 17, 14, 1}, 57)));
    }
}
