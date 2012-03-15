

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Jordan Ancar
 */
public class gameModeMenu
{
    JFrame frame;
    JButton soloPlay;
    JButton compPlay;
    JButton networkPlay;
    JButton back;

public gameModeMenu()
{
    frame = new JFrame("Gamemode Menu");
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("GameMode Menu");
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl, BorderLayout.NORTH);

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4,1));
        soloPlay = new JButton("Solo Play");
        soloPlay.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                soloPlayMenu s = new soloPlayMenu();
                frame.setVisible(false);
            }
        });
        compPlay = new JButton("Vs. Computer");
        networkPlay = new JButton("Network Play");
        back = new JButton("Back");
        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               welcomeMenu wm = new welcomeMenu();
               frame.setVisible(false);
               frame.dispose();
            }
        });
        jp1.add(soloPlay);
        jp1.add(compPlay);
        jp1.add(networkPlay);
        jp1.add(back);
        jp.add(jp1, BorderLayout.CENTER);

        frame.add(jp);
        frame.setVisible(true);
    }

}
