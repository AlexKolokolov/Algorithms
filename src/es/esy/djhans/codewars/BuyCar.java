package es.esy.djhans.codewars;

import java.util.Arrays;

/**
 * Created by Administrator on 27.11.2015.
 */
public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew,
                                 int savingperMonth, double percentLossByMonth) {
        // your code
        int month = 0;
        int savings = 0;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        while (priceOld + savings < priceNew) {
            priceOld *= (1 - percentLossByMonth / 100);
            priceNew *= (1 - percentLossByMonth / 100);
            savings += savingperMonth;
            if (month % 2 == 0) percentLossByMonth += 0.5;
            month++;
        }
        return new int[]{month, (int) Math.round(priceOld + savings - priceNew)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));
    }
}
