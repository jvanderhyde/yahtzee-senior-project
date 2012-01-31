

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author Jordan Ancar
 */
public class welcomeMenu
{
    JButton newGame;
    JButton loadGame;
    JButton quit;
    JFrame frame;

   public welcomeMenu()
    {
        frame = new JFrame("Welcome Menu");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
        
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Welcome Menu");
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl, BorderLayout.NORTH);

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4,1));
        newGame = new JButton("New Game");
        loadGame = new JButton("Load Game");
        quit = new JButton("Quit Game");
        jp1.add(newGame);
        jp1.add(loadGame);
        jp1.add(quit);
        jp.add(jp1, BorderLayout.CENTER);

        frame.add(jp);
        frame.setVisible(true);
    }


}
