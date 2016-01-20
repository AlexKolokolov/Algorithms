package es.esy.djhans.patterns.observer;

/**
 * Created by User on 15.09.2015.
 */
public class Index {
    public static void main(String[] args) throws Exception{
        Plane plane = new Plane();
        new Radar(plane);
        plane.setVelocity(100);
        Thread.sleep(500);
        plane.increaseVelocity();
        Thread.sleep(500);
        plane.increaseVelocity();
        Thread.sleep(500);
        plane.increaseVelocity();
        Thread.sleep(500);
        plane.increaseVelocity();
        Thread.sleep(500);
        plane.decreaseVelocity();
        Thread.sleep(500);
        plane.decreaseVelocity();
        Thread.sleep(500);
        plane.decreaseVelocity();
    }
}
