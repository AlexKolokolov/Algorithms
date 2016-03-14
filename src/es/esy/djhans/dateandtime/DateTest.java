package es.esy.djhans.dateandtime;

import java.util.Date;

/**
 * Created by Administrator on 05.03.2016.
 */
public class DateTest {
    public static void main(String[] args) {
        Date yearStart = new Date("JAN 1 2016");
        yearStart.setDate(0);
        yearStart.setMonth(0);
        long sd = yearStart.getTime() / (24 * 60 * 60 * 1000);
        System.out.println(sd);
        Date date = new Date("JAN 2 2016");
        long d = date.getTime() / (24 * 60 * 60 * 1000);
        System.out.println(d);
        System.out.println(d - sd);
    }
}
