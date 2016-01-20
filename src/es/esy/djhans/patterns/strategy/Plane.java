package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Plane extends Vehicle {
    public Plane() {
        movingManner = new Flying();
    }
}
