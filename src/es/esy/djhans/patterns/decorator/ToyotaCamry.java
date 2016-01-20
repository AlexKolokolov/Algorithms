package es.esy.djhans.patterns.decorator;

/**
 * Created by User on 17.09.2015.
 */
public class ToyotaCamry implements Car {
    private final int  PRICE = 25000;
    private final String DESCRIPTION = "Toyota Camry";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
