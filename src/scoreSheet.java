

import java.awt.*;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan Ancar
 */
public class scoreSheet
{
    JFrame frame;

    public scoreSheet()
    {
        frame = new JFrame();
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Yahtzee");
        jp.add(jl, BorderLayout.NORTH);


        //West
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(12,1));
        JLabel jl0 = new JLabel("Upper Section");
        jp1.add(jl0);
        JLabel jl1 = new JLabel("Aces");
        jp1.add(jl1);
        JLabel jl2 = new JLabel("Twos");
        jp1.add(jl2);
        JLabel jl3 = new JLabel("Threes");
        jp1.add(jl3);
        JLabel jl4 = new JLabel("Fours");
        jp1.add(jl4);
        JLabel jl5 = new JLabel("Fives");
        jp1.add(jl5);
        JLabel jl6 = new JLabel("Sixes");
        jp1.add(jl6);
        JLabel jl7 = new JLabel("Total Score");
        jp1.add(jl7);
        JLabel jl8 = new JLabel("Bonus");
        jp1.add(jl8);
        JLabel jl9 = new JLabel("Total");
        jp1.add(jl9);
        jp.add(jp1,BorderLayout.WEST);


        //Center
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(12,1));
        JLabel jlh = new JLabel("   How To Score");
        jp2.add(jlh);
        JLabel jlh1 = new JLabel("   Add Aces Only");
        jp2.add(jlh1);
        JLabel jlh2 = new JLabel("   Add Twos Only");
        jp2.add(jlh2);
        JLabel jlh3 = new JLabel("   Add Threes Only");
        jp2.add(jlh3);
        JLabel jlh4 = new JLabel("   Add Fours Only");
        jp2.add(jlh4);
        JLabel jlh5 = new JLabel("   Add Fives Only");
        jp2.add(jlh5);
        JLabel jlh6 = new JLabel("   Add Sixes Only");
        jp2.add(jlh6);
        JLabel jlh7 = new JLabel("   ------------->");
        jp2.add(jlh7);
        JLabel jlh8 = new JLabel("   Score 35");
        jp2.add(jlh8);
        JLabel jlh9 = new JLabel("   ------------->");
        jp2.add(jlh9);
        jp.add(jp2,BorderLayout.CENTER);


        //East
        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(12,2));
        JLabel jls = new JLabel("Score");
        jp3.add(jls);
        JLabel jls1 = new JLabel("  0");
        jp3.add(jls1);
        JLabel jls2 = new JLabel("  0");
        jp3.add(jls2);
        JLabel jls3 = new JLabel("  0");
        jp3.add(jls3);
        JLabel jls4 = new JLabel("  0");
        jp3.add(jls4);
        JLabel jls5 = new JLabel("  0");
        jp3.add(jls5);
        JLabel jls6 = new JLabel("  0");
        jp3.add(jls6);
        JLabel jls7 = new JLabel("  0");
        jp3.add(jls7);
        JLabel jls8 = new JLabel("  0");
        jp3.add(jls8);
        JLabel jls9 = new JLabel("  0");
        jp3.add(jls9);
        jp.add(jp3,BorderLayout.EAST);


  




        frame.add(jp);
        frame.pack();
        frame.setVisible(true);
    }
}
