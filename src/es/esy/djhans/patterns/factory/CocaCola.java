package es.esy.djhans.patterns.factory;

/**
 * Created by User on 23.09.2015.
 */
public class CocaCola implements Water {
    public CocaCola() {
        System.out.println("Бадяжим кока-колу");
    }

    @Override
    public String toString() {
        return "кока-кола";
    }
}
