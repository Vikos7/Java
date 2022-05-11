package guiApp;

import guiApp.windowparts.GameMap;
import guiApp.windowparts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private int posX = 300;
    private int posY = 200;

    private  int widtW =  1024;
    private int heightW = 768;
    private GameMap gameMap;
    private InfoPanel infoPanel;


    public MainWindow() {
        setupWindow();
        gameMap = new GameMap();
        infoPanel = new InfoPanel(this);

        add(gameMap, BorderLayout.WEST);
        add(infoPanel, BorderLayout.EAST);

        setVisible(true);

    }
    private void setupWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(widtW, heightW);
        setLocation(posX,posY);
        setResizable(true);
        setTitle("First GUI-App");

    }
}
