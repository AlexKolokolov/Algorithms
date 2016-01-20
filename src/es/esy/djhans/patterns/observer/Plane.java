package es.esy.djhans.patterns.observer;

import java.util.Observable;

/**
 * Created by User on 15.09.2015.
 */
public class Plane extends Observable {
    private int velocity;

    public void velocityChanged() {
        setChanged();
        notifyObservers();
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
        velocityChanged();
    }

    public void increaseVelocity() {
        velocity += 50;
        velocityChanged();
    }

    public void decreaseVelocity() {
        velocity -= 50;
        velocityChanged();
    }

    public int getVelocity() {
        return velocity;
    }
}
