package es.esy.djhans.singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 16.08.2015.
 */
public class GamePanel extends JPanel {
    private GameButton[] gameButtons;

    public GamePanel() {
        setLayout(new GridLayout(10, 10));
        gameButtons = new GameButton[100];
        for (int i = 0; i < 100; i++) {
            gameButtons[i] = new GameButton("+", i);
            gameButtons[i].setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
            gameButtons[i].addActionListener(new GameButtonListener());
            add(gameButtons[i]);
        }
    }

    public void buttonReaction(ActionEvent event) {
        GameButton pressedButton = (GameButton) event.getSource();
        int buttonNumber = pressedButton.getNumber();
        gameButtons[buttonNumber].setBackground(Color.RED);
    }


    class GameButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            buttonReaction(event);
        }
    }
}
