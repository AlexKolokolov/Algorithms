package es.esy.djhans.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by User on 15.09.2015.
 */
public class Radar implements Observer {
    private int velocity;

    public Radar(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Plane) {
            Plane plane = (Plane) o;
            this.velocity = plane.getVelocity();
            displayVelocity();
        }
    }

    public void displayVelocity() {
        System.out.println("Velocity = " + velocity);
    }
}
