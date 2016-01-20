package es.esy.djhans.codewars;

/**
 * Created by Administrator on 22.11.2015.
 */
public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        String[] arr = str.split("");
        for (String ch : arr) if (ch.matches("[aouei]")) vowelsCount++;
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("qwerfdavt"));
    }
}
