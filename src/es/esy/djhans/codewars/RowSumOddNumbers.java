package es.esy.djhans.codewars;

/**
 * Created by Administrator on 22.11.2015.
 */
public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        //TODO
        int initial = 1;
        for (int i = 1; i < n ; i++) {
            initial += i * 2;
        }
        int sum = initial;
        for (int i = 1; i < n ; i++) {
            sum += i * 2 + initial;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(2));
        System.out.println(rowSumOddNumbers(3));
    }
}
