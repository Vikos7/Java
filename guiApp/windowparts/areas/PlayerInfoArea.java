package guiApp.windowparts.areas;

import guiApp.windowparts.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    public JLabel playerHealth;
    public JLabel playerExp;
    public JLabel playerCoins;
    private InfoPanel infoPanel;

    public PlayerInfoArea(InfoPanel infoPanel){
        this.infoPanel = infoPanel;
        setLayout(new GridLayout(4,1));
        playerHealth = new JLabel("Health: ");
        playerExp = new JLabel("Experience: ");
        playerCoins = new JLabel("Coins: ");

        add(new JLabel("= Player Info ="), SwingConstants.CENTER);

        add(playerHealth);
        add(playerExp);
        add(playerCoins);
    }


}
