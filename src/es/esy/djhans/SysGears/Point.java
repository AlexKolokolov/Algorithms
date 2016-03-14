package es.esy.djhans.SysGears;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Instance of the class is a point on the plane with two coordinates: x and y.
 * Implements Comparable interface, so we can compare any instance of the class
 * to another one and easily sort those instances in arrays and collections.
 */
public class Point implements Comparable<Point> {
    private Integer x;
    private Integer y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    /*
    * Implemented method of Comparable interface
    * which compares one instance of the class to another one.
    * It compares x-coordinates first, and if they are equal,
    * compares y-coordinates of class instances
    */
    @Override
    public int compareTo(Point o) {
        if (this.x.compareTo(o.x) != 0) return this.x.compareTo(o.x);
        return this.y.compareTo(o.y);
    }

    public static void main(String[] args) {

        //Creating initial list of points
        List<Point> points = new ArrayList<>();
        points.add(new Point(4, 0));
        points.add(new Point(0, 3));
        points.add(new Point(3, 2));
        points.add(new Point(0, 0));
        points.add(new Point(2, 5));
        points.add(new Point(5, 3));

        System.out.println("Array of points: " + points);

        //List sorting according to compareTo method of Point class is performed
        //to create sequence of points for the broken line of disjoint segments building
        Collections.sort(points);

        System.out.println("Path of broken line: " + points);
    }
}
// Out:
// Array of points: [(4,0), (0,3), (3,2), (0,0), (2,5), (5,3)]
// Path of broken line: [(0,0), (0,3), (2,5), (3,2), (4,0), (5,3)]