package es.esy.djhans.patterns.decorator;

/**
 * Created by User on 17.09.2015.
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = new ToyotaCamry();
        System.out.println("Complectation: " + car1.getDescription() + ". Price: " + car1.getPrice());
        Car car2 = new LeatherInterior(new ToyotaCamry());
        System.out.println("Complectation: " + car2.getDescription() + ". Price: " + car2.getPrice());
        Car car3 = new LeatherInterior(new Conditioner(new ToyotaCamry()));
        System.out.println("Complectation: " + car3.getDescription() + ". Price: " + car3.getPrice());
    }
}
