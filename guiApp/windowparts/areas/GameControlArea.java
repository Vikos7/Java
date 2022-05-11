package guiApp.windowparts.areas;

import guiApp.windowparts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameControlArea extends JPanel{

    private JButton startGame;
    private JButton exitGame;

    private InfoPanel infoPanel;

    public GameControlArea(InfoPanel infoPanel){
        this.infoPanel = infoPanel;
        setLayout(new FlowLayout(FlowLayout.CENTER));

        startGame =  new JButton("Start Game");
        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Start");

            }
        });
        exitGame = new JButton("Exit Game");
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");
            }
        });

        add(startGame);
        add(exitGame);

    }
}
