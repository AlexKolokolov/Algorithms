package es.esy.djhans.std;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.util.Arrays;

/**
 * Created by User on 10.09.2015.
 */
public class DrawTest2 {
    public static void main(String[] args) {
        int N = 50;
        double[] a = new double[N];
        for (int i =0; i < N; i++){
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N+0.5/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}
