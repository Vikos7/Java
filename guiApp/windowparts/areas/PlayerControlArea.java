package guiApp.windowparts.areas;

import guiApp.windowparts.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControlArea extends JPanel{

    public JButton playerMoveUp;
    public JButton playerMoveDown;
    public JButton playerMoveLeft;
    public JButton playerMoveRight;
    private InfoPanel infoPanel;

    public PlayerControlArea(InfoPanel infoPanel){
        this.infoPanel = infoPanel;
        setLayout(new FlowLayout(FlowLayout.CENTER));
        playerMoveUp = new JButton("Up ");
        playerMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Up");

            }
        });
        playerMoveDown = new JButton("Down");
        playerMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Down");

            }
        });
        playerMoveLeft = new JButton("Left");
        playerMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Left");

            }
        });
        playerMoveRight = new JButton("Right");
        playerMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Right");

            }
        });

//        add(new JLabel("= Control Area ="), SwingConstants.CENTER);
//        setLayout(new GridLayout(1,1));

        add(playerMoveUp);
        add(playerMoveDown);
        add(playerMoveLeft);
        add(playerMoveRight);

    }
}
