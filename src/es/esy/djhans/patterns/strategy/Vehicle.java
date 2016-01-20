package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public abstract class Vehicle {
    MovingManner movingManner;

    public void setMoveManer(MovingManner movingManner) {
        this.movingManner = movingManner;
    }

    public void move() {
        movingManner.move();
    }
}
