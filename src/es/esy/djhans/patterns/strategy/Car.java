package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Car extends Vehicle {

    public Car() {
        movingManner = new Riding();
    }
}
