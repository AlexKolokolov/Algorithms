package es.esy.djhans.arguments;

/**
 * Created by User on 03.09.2015.
 */
public class ArgumentTest {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
        System.out.println(args[0]);

    }
}
