package es.esy.djhans.patterns.factory;

/**
 * Created by User on 23.09.2015.
 */
public class CocaColaBottle implements Bottle {
    @Override
    public void fillWithWater(Water water) {
        System.out.println("Наливаем кока-колу в бутылку");
    }
}
