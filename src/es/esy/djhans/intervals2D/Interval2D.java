package es.esy.djhans.intervals2D;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/**
 * Created by User on 12.09.2015.
 */
public class Interval2D {
    private double x1, x2, y1, y2;

    public Interval2D(double x, double y, double width, double height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public void draw() {
        StdDraw.rectangle((x1 + x2) / 2, (y1 + y2) / 2, (x2 - x1) / 2, (y2 - y1) / 2);
    }

    public boolean intersect(Interval2D interval) {
        if (this.x1 > interval.x2 || this.y1 > interval.y2 || this.x2 < interval.x1 || this.y2 < interval.y1) {
            return false;
        } else {
            if (this.contains(interval) || interval.contains(this)) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Interval2D inteval) {
        if (this.x1 <= inteval.x1 && this.x2 >= inteval.x2 && this.y1 <= inteval.y1 && this.y2 >= inteval.y2) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Intrval[" + x1 + " ," + x2 + " ," + y1 + " ," + y2 + "]";
    }

    public static void main(String[] args) {
        StdOut.print("Введите количество интервалов: ");
        int N = StdIn.readInt();
        StdOut.print("Введите минимальную и максимальную длину интервалов: ");
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
//        int N =3;
//        double min = 0.2;
//        double max = 0.8;
        Interval2D[] intervals = new Interval2D[N];
        for (int i = 0; i < N ; i++) {
            double width = StdRandom.uniform(min,max);
            double hight = StdRandom.uniform(min,max);
            double x = StdRandom.uniform(0,1 - width);
            double y = StdRandom.uniform(0,1 - hight);
            intervals[i] = new Interval2D(x,y,width,hight);
            StdDraw.setPenColor(StdRandom.uniform(0,256),StdRandom.uniform(0,256),StdRandom.uniform(0,256));
            intervals[i].draw();
            System.out.println(intervals[i]);
        }
        int intersectedNum = 0;
        int containedNum = 0;
        for (int i = 0; i < N - 1 ; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals[i].contains(intervals[j]) || intervals[j].contains(intervals[i])) containedNum++;
                if (intervals[i].intersect(intervals[j])) intersectedNum++;
            }
        }
        System.out.println("Пар пересекающихся интервалов " + intersectedNum + " шт.");
        System.out.println("Пар интервалов, содержащихся один в другом " + containedNum + " шт.");
    }
}
