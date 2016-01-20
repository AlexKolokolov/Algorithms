package es.esy.djhans.patterns.factory;

/**
 * Created by User on 23.09.2015.
 */
public class CocaColaFactory implements SodaFactory {

    @Override
    public Bottle createBottle() {
        return new CocaColaBottle();
    }

    @Override
    public Water crateWater() {
        return new CocaCola();
    }
}
