package guiApp.windowparts;

import guiApp.MainWindow;
import guiApp.windowparts.areas.GameControlArea;
import guiApp.windowparts.areas.GameInfoArea;
import guiApp.windowparts.areas.PlayerControlArea;
import guiApp.windowparts.areas.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private GameControlArea gameControlArea;
    private GameInfoArea gameInfoArea;
    private PlayerInfoArea playerInfoArea;
    public PlayerControlArea playerControlArea;

    private JTextArea logs;
    private JScrollPane scrollBox;
    private MainWindow mainWindow;



    public InfoPanel(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setLayout(new GridLayout(5,1));

        gameControlArea = new GameControlArea(this);
        gameInfoArea = new GameInfoArea(this);
        playerInfoArea = new PlayerInfoArea(this);
        playerControlArea = new PlayerControlArea(this);

        createLogArea();

        add(gameControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollBox);

    }
    private void createLogArea(){
        logs = new JTextArea();
        logs.setLineWrap(true);
        scrollBox = new JScrollPane(logs);
    }
}
