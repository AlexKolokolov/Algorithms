package es.esy.djhans.patterns.factory;

/**
 * Created by User on 23.09.2015.
 */
public class PepsiFactory implements SodaFactory {
    @Override
    public Bottle createBottle() {
        return new PepsiBottle();
    }

    @Override
    public Water crateWater() {
        return new PepsiCola();
    }
}
