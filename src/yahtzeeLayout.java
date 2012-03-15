
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Class;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan Ancar
 */
public class yahtzeeLayout 
{
    JFrame frame;


    public yahtzeeLayout()
    {
       frame = new JFrame();
       frame.setSize(900,600);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Yahtzee");
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl,BorderLayout.NORTH);

        // add the score sheet to the west side of the boarder layout
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1,6));
        JButton jb2= new JButton("Player 2");
        JButton jb3= new JButton("Player 3");
        JButton jb4= new JButton("Player 4");
        JButton jb5= new JButton("Player 5");
        JButton jb6= new JButton("Player 6");
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp.add(jp1,BorderLayout.SOUTH);

        JPanel jp2 = new JPanel();
        jp2.add(new scoreSheet().frame);
        jp.add(jp2,BorderLayout.WEST);

        JPanel jp3 = new JPanel();
        jp3.setLayout(new BorderLayout());
        jp.add(jp3,BorderLayout.CENTER);

        JPanel jp4 = new JPanel();
        jp4.setLayout(new GridLayout(1,6));
        JButton jb7= new JButton("Die 1");
        JButton jb8= new JButton("Die 2");
        JButton jb9= new JButton("Die 3");
        JButton jb10= new JButton("Die 4");
        JButton jb11= new JButton("Die 5");
        JButton jb12= new JButton("Roll");
        jp4.add(jb7);
        jp4.add(jb8);
        jp4.add(jb9);
        jp4.add(jb10);
        jp4.add(jb11);
        jp4.add(jb12);
        jp3.add(jp4,BorderLayout.SOUTH);



        JPanel jp5 = new JPanel();
        jp5.setLayout(new GridLayout(5,2));
        JLabel jl1 = new JLabel("Die 1 :");
        final JLabel jl2 = new JLabel("0");
        JLabel jl3 = new JLabel("Die 2 :");
        final JLabel jl4 = new JLabel("0");
        JLabel jl5 = new JLabel("Die 3 :");
        final JLabel jl6 = new JLabel("0");
        JLabel jl7 = new JLabel("Die 4 :");
        final JLabel jl8 = new JLabel("0");
        JLabel jl9 = new JLabel("Die 5 :");
        final JLabel jl10 = new JLabel("0");
        jp5.add(jl1);
        jp5.add(jl2);
        jp5.add(jl3);
        jp5.add(jl4);
        jp5.add(jl5);
        jp5.add(jl6);
        jp5.add(jl7);
        jp5.add(jl8);
        jp5.add(jl9);
        jp5.add(jl10);
        jp3.add(jp5,BorderLayout.CENTER);

                jb12.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                 int[] firstRoll = Dice.rollAllDice();
                 jl2.setText(Integer.toString(firstRoll[0]));
                 jl4.setText(Integer.toString(firstRoll[1]));
                 jl6.setText(Integer.toString(firstRoll[2]));
                 jl8.setText(Integer.toString(firstRoll[3]));
                 jl10.setText(Integer.toString(firstRoll[4]));

                 for (int t=0; t<ScoreController.rolls.length; t++)
                 {
                     int test = ScoreController.rolls[t].checkValues(firstRoll);
                     if(ScoreController.rolls[t].isPlayed != true)
                     {
                         ScoreController.score[t] = test;
                     }
                 }


            }
        });






        frame.add(jp);
        frame.setVisible(true);
        
        
    }


}
