

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.GridLayout;
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
    frame = new JFrame("Welcome Menu");
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
        compPlay = new JButton("Vs. Computer");
        networkPlay = new JButton("Network Play");
        back = new JButton("Back");
        jp1.add(soloPlay);
        jp1.add(compPlay);
        jp1.add(networkPlay);
        jp1.add(back);
        jp.add(jp1, BorderLayout.CENTER);

        frame.add(jp);
        frame.setVisible(true);
    }

}
