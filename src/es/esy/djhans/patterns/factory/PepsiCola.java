package es.esy.djhans.patterns.factory;

/**
 * Created by User on 23.09.2015.
 */
public class PepsiCola implements Water{
    public PepsiCola() {
        System.out.println("Бадяжим пепси-колу");
    }

    @Override
    public String toString() {
        return "пепси-кола";
    }
}
