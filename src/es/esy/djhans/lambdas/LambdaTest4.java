package es.esy.djhans.lambdas;

/**
 * Created by kolokolov on 3/20/16.
 */
public class LambdaTest4 {



    public static int speed;

    public static void relocate(Movable movable) {
        movable.move(speed);
    }

    public static void printSpeed(int speed) {
        System.out.println("I'm running with " + speed + " km/h");
    }

    public static void main(String[] args) {
        speed = 10;
        relocate(System.out::println);
        relocate(speed -> System.out.println("I'm moving with " + speed + " m/h"));
        relocate(LambdaTest4::printSpeed);
    }
}
