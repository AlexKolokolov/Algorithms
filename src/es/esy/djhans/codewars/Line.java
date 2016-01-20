package es.esy.djhans.codewars;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Administrator on 07.12.2015.
 */
public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        // Your code is here...
        int l = names.length;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            counter++;
            if (counter > l) {
                counter = 1;
                l *= 2;
            }
        }
        return names[(int)Math.ceil((double)counter * names.length / l) - 1];
    }

    public static void main(String[] args) {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//        for (int i = 1; i <= 36 ; i++) {
//            System.out.println("n = " + i + " name: " + WhoIsNext(names,i));
//        }
        System.out.println(WhoIsNext(names,1000000000));
    }
}
