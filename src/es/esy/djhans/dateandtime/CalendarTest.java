package es.esy.djhans.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 05.03.2016.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar yearStart = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        System.out.println(yearStart.get(Calendar.DAY_OF_YEAR) % 2 != 0);
    }
}
