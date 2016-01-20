package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Riding implements MovingManner {
    @Override
    public void move() {
        System.out.println("I'm riding!");
    }
}
