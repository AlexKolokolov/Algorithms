package es.esy.djhans.codewars;

/**
 * Created by Administrator on 22.11.2015.
 */
public class NthSeries {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
