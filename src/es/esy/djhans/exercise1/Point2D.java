package es.esy.djhans.exercise1;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;

import java.util.TreeSet;

/**
 * Created by User on 03.09.2015.
 */
public class Point2D {
    private double x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
    }

    public static void main(String[] args) {
        int numPoints = StdIn.readInt();
        StdDraw.setPenRadius(0.02);
        Point2D[] points = new Point2D[numPoints];
        for (int i = 0; i < numPoints; i++) {
            points[i] = new Point2D(Math.random(),Math.random());
            StdDraw.point(points[i].getX(),points[i].getY());
        }

        double minDistace = 10;
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = points[i].distance(points[j]);
                if (distance < minDistace) {
                    minDistace = distance;
                    x1 = points[i].getX();
                    y1 = points[i].getY();
                    x2 = points[j].getX();
                    y2 = points[j].getY();
                }

            }
        }
        StdDraw.setPenRadius(0.005);
        StdDraw.line(x1,y1,x2,y2);
        System.out.println(minDistace);
    }
}
