package es.esy.djhans.patterns.decorator;

/**
 * Created by User on 17.09.2015.
 */
public class Conditioner extends AdditionalOptions{

    public Conditioner(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + conditioner";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 750;
    }
}
