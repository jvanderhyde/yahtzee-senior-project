

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
public class soloPlayMenu
{
    JFrame frame;

     public soloPlayMenu()
    {

        frame = new JFrame("SoloPlay Menu");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Solo Game Menu");
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl, BorderLayout.NORTH);

        JLabel jl1 = new JLabel("User Name");
        JTextField jt = new JTextField();
        JButton jb = new JButton("Start Game");
        jb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                yahtzeeLayout yl = new yahtzeeLayout();
                ScoreController sc = new ScoreController();
                frame.setVisible(false);
            }
        });
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4,1));
        jp1.add(jl1);
        jp1.add(jt);
        jp1.add(jb);
        jp.add(jp1,BorderLayout.CENTER);


        frame.add(jp);
        frame.setVisible(true);

    }

}
