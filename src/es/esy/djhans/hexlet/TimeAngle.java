package es.esy.djhans.hexlet;

/**
 * Определить угол между минутной и часовой стрелками
 */
public class TimeAngle {

    public static double getTimeAngle(int hours, int minutes) {
        if (hours >= 12) hours -= 12;
        hours = hours >= 12 ? hours - 12 : hours;
        double doubleHours = hours + (minutes / 60d);
        double hourAngle = doubleHours * 30;
        double minAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minAngle);
        angle = angle > 180 ? 360 - angle : angle;
        return angle;
    }

    public static void main(String[] args) {
        System.out.println(getTimeAngle(8, 0));
        System.out.println(getTimeAngle(9, 30));
        System.out.println(getTimeAngle(3, 45));
        System.out.println(getTimeAngle(15, 15));
        System.out.println(getTimeAngle(10, 47));
        System.out.println(getTimeAngle(11, 0));
    }
}
