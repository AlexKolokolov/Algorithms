package es.esy.djhans.enumstest;

/**
 * Created by kolokolov on 14.03.16.
 */
public enum Dog implements Runnable{
    BOXER(20), PITBULL(10), BULLDOG(5), PEKINGESE(), AIREDALE(8);

    private int weight;

    Dog(int weight) {
        this.weight = weight;
    }

    Dog() {
        this.weight = 3;
    }

    @Override
    public void run() {
        System.out.println("I'm " + name() + "! My weight is " + weight + " kg!");
    }

    public static void main(String[] args) {
        Dog[] dogs = Dog.values();

        for (Dog dog : dogs) {
            new Thread(dog).start();
        }
    }
}
