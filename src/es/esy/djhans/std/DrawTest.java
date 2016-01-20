package es.esy.djhans.std;

import edu.princeton.cs.introcs.*;
/**
 * Created by User on 10.09.2015.
 */
public class DrawTest {
    public static void main(String[] args) {
       int N = 100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N ; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
}
