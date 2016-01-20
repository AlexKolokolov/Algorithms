package es.esy.djhans.patterns.factory;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 * Created by User on 23.09.2015.
 */
public class Client {
    private Bottle bottle;
    private Water water;

    public Client(SodaFactory factory) {
        this.bottle = factory.createBottle();
        this.water = factory.crateWater();
    }

    public void createProduct() {
        bottle.fillWithWater(water);
        System.out.println("Получите бутылку " + water);
    }

    public static void main(String[] args) {
        Client client = new Client(new CocaColaFactory());
        client.createProduct();
        System.out.println();
        client = new Client(new PepsiFactory());
        client.createProduct();
    }
}
