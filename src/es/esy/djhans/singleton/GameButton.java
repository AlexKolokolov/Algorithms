package es.esy.djhans.singleton;

import javax.swing.*;

/**
 * Created by User on 16.08.2015.
 */
public class GameButton extends JButton {
    private int number;

    public GameButton(String text, int number) {
        super(text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
