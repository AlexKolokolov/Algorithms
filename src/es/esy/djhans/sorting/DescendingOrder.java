package es.esy.djhans.sorting;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Administrator on 21.11.2015.
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        int n = num;
        ArrayList<Integer> DigsList= new ArrayList<>();
        while (n > 0) {
            DigsList.add(n % 10);
            n /= 10;
        }
        Collections.sort(DigsList);
        int res = 0;
        for (int i = 0; i < DigsList.size(); i++) {
            res += DigsList.get(i) * Math.pow(10,i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(1532434));
    }
}
