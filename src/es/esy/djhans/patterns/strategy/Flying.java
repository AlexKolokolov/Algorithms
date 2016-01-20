package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Flying implements MovingManner {
    @Override
    public void move() {
        System.out.println("I'm flying!");
    }
}
