package es.esy.djhans.singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by User on 01.09.2015.
 */
public class MainWindow extends JFrame {
    private GamePanel gamePanel;
    private static MainWindow thisWindow;

    private MainWindow() {
        super("My application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setControlPanel();
        setVisible(true);
    }

    public void setControlPanel() {
        JPanel controlPanel = new JPanel();
        JButton newGameButton = new JButton("New Game");
        newGameButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        newGameButton.addActionListener(new NewGameButtonListener());

        JButton exitButton = new JButton("Exit");
        exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitButton.addActionListener(new ExitButtonListener());

        controlPanel.setBackground(Color.CYAN);
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.add(newGameButton);
        controlPanel.add(exitButton);

        add(controlPanel, BorderLayout.WEST);
    }

    public static MainWindow getMainWindow() {
        if (thisWindow == null) {
            thisWindow = new MainWindow();
        }
        return thisWindow;
    }

    public void createNewGame() {
        if (gamePanel != null) {
            int worning = JOptionPane.showConfirmDialog(new JFrame(),
                    "Are you sure you want to start new game?",
                    "Worning", JOptionPane.YES_NO_OPTION);
            if (worning == JOptionPane.YES_OPTION) {
                remove(gamePanel);
                setGamePanel();
            }
        } else {
            setGamePanel();
        }
    }

    public void setGamePanel() {
        gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);
        gamePanel.revalidate();
    }

    public void quitGame() {
        int worning = JOptionPane.showConfirmDialog(new JFrame(),
                "Are you sure you want to quit the game?",
                "Worning", JOptionPane.YES_NO_OPTION);
        if (worning == JOptionPane.YES_OPTION) {
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }

    class NewGameButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            createNewGame();
        }
    }

    class ExitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            quitGame();
        }
    }
}
