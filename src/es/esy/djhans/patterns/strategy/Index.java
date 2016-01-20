package es.esy.djhans.patterns.strategy;

/**
 * Created by User on 13.09.2015.
 */
public class Index {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        Boat boat = new Boat();
        car.move();
        plane.move();
        boat.move();
        car.setMoveManer(new Flying());
        car.move();
        Vehicle amphibia = new Car();
        amphibia.setMoveManer(new Swimming());
        amphibia.move();
    }
}
