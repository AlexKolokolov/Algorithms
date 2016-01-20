package es.esy.djhans.std;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

/**
 * Created by User on 11.09.2015.
 */
public class InTest {
    public static void main(String[] args) {
        int[] mas = new int[3];
        for (int i = 0; i < 3; i++) {
            mas[i] = StdIn.readInt();
        }
        StdOut.println(mas[0] == mas[1] && mas[0] == mas[2] ? "равны" : "не равны");
    }
}
