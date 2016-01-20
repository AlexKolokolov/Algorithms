package es.esy.djhans.codewars;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 06.12.2015.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
        return String.format("%02d:%tM:%<tS",seconds / 3600, new Date((seconds - 7200) * 1000));
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));

    }
}
