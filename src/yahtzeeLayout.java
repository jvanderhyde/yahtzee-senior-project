
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Class;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
    int[] firstRoll;
    int[] firstRoll1;
    int counter;


    public yahtzeeLayout()
    {
       frame = new JFrame();
       frame.setSize(1025,700);
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
        jp4.setLayout(new GridLayout(1,2));
        final JButton jb12= new JButton("Roll All");
        final JButton jb13 = new JButton("Roll Selected");
        jp4.add(jb12);
        jp4.add(jb13);
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
        final JCheckBox jcb7= new JCheckBox("Die 1",false);
        final JCheckBox jcb8= new JCheckBox("Die 2",false);
        final JCheckBox jcb9= new JCheckBox("Die 3",false);
        final JCheckBox jcb10= new JCheckBox("Die 4",false);
        final JCheckBox jcb11= new JCheckBox("Die 5",false);
        jp5.add(jcb7);
        jp5.add(jl1);
        jp5.add(jl2);
        jp5.add(jcb8);
        jp5.add(jl3);
        jp5.add(jl4);
        jp5.add(jcb9);
        jp5.add(jl5);
        jp5.add(jl6);
        jp5.add(jcb10);
        jp5.add(jl7);
        jp5.add(jl8);
        jp5.add(jcb11);
        jp5.add(jl9);
        jp5.add(jl10);
        jp3.add(jp5,BorderLayout.CENTER);
        
        
        
        
        
        

      
        jb12.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                 firstRoll = Dice.rollAllDice();
                 Arrays.sort(firstRoll);
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
                 counter++;
                 if (counter<3)
                     jb12.disable();

                 
            }
        });


        jb13.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                if(!jcb7.isSelected())
                {
                    firstRoll[0] = Dice.rollOneDie();
                }

                if(!jcb8.isSelected())
                {
                    firstRoll[1] = Dice.rollOneDie();
                }

                if(!jcb9.isSelected())
                {
                    firstRoll[2] = Dice.rollOneDie();
                }

                if(!jcb10.isSelected())
                {
                    firstRoll[3] = Dice.rollOneDie();
                }

                if(!jcb11.isSelected())
                {
                    firstRoll[4] = Dice.rollOneDie();
                }

                 jl2.setText(Integer.toString(firstRoll[0]));
                 jl4.setText(Integer.toString(firstRoll[1]));
                 jl6.setText(Integer.toString(firstRoll[2]));
                 jl8.setText(Integer.toString(firstRoll[3]));
                 jl10.setText(Integer.toString(firstRoll[4]));
                 firstRoll1 = firstRoll.clone();

                 for (int t=0; t<ScoreController.rolls.length; t++)
                 {
                     int test = ScoreController.rolls[t].checkValues(firstRoll1);
                     if(ScoreController.rolls[t].isPlayed != true)
                     {
                         ScoreController.score[t] = test;
                     }
                 }
                 counter++;
                 if(counter < 3)
                     jb13.disable();
                 


            }
            });
        




        frame.add(jp);
        frame.setVisible(true);
        
        
    }


}
