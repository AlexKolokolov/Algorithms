package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Boat extends Vehicle {
    public Boat() {
        movingManner = new Swimming();
    }
}
