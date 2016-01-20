package es.esy.djhans.patterns.decorator;

/**
 * Created by User on 17.09.2015.
 */
public class LeatherInterior extends AdditionalOptions{

    public LeatherInterior(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + leather interior";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1200;
    }
}
