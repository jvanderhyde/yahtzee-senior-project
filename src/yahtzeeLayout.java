
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
public class yahtzeeLayout 
{
    JFrame frame;
    int[] firstRoll;
    int[] firstRoll1;
    int counter = 0;


    Thread th;
    JFrame fframe;

    //dice pictures
    JLabel lbbbl = new JLabel();
    JLabel lbbbl2 = new JLabel();
    JLabel lbbbl3 = new JLabel();
    JLabel lbbbl4 = new JLabel();
    JLabel lbbbl5 = new JLabel();


    int[] retRoll;



    int numOneDie;
    int numTwoDie;
    int numThreeDie;
    int numFourDie;
    int numFiveDie;

    //import pictures of the dice
    ImageIcon die1 = new ImageIcon(this.getClass().getResource("die1.png"));
    ImageIcon die2 = new ImageIcon(this.getClass().getResource("die2.png"));
    ImageIcon die3 = new ImageIcon(this.getClass().getResource("die3.png"));
    ImageIcon die4 = new ImageIcon(this.getClass().getResource("die4.png"));
    ImageIcon die5 = new ImageIcon(this.getClass().getResource("die5.png"));
    ImageIcon die6 = new ImageIcon(this.getClass().getResource("die6.png"));

    



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
        final JButton jb13 = new JButton("Roll UnSelected");
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
        jp5.add(lbbbl);  //Die one jl2
        jp5.add(jcb8);
        jp5.add(jl3);
        jp5.add(lbbbl2);   //Die two jl4
        jp5.add(jcb9);
        jp5.add(jl5);
        jp5.add(lbbbl3);   //Die three jl6
        jp5.add(jcb10);
        jp5.add(jl7);
        jp5.add(lbbbl4);   //Die four jl8
        jp5.add(jcb11);
        jp5.add(jl9);
        jp5.add(lbbbl5);      //Die five jl10
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

                                 

                 //Display the dice rolling when all dice are rolled
                 retRoll = firstRoll;
                 StartDice();
                 dieFaces();

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
        

        


        if (counter != 3)
        {
         jb13.enable();

        jb13.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                if(!jcb7.isSelected())
                {
                    firstRoll[0] = Dice.rollOneDie();
                    numOneDie = firstRoll[0];
                }

                if(!jcb8.isSelected())
                {
                    firstRoll[1] = Dice.rollOneDie();
                    numTwoDie = firstRoll[1];
                }

                if(!jcb9.isSelected())
                {
                    firstRoll[2] = Dice.rollOneDie();
                    numThreeDie = firstRoll[2];
                }

                if(!jcb10.isSelected())
                {
                    firstRoll[3] = Dice.rollOneDie();
                    numFourDie = firstRoll[3];
                }

                if(!jcb11.isSelected())
                {
                    firstRoll[4] = Dice.rollOneDie();
                    numFiveDie = firstRoll[4];
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

            }
            });

        }
        else if (counter == 3)
        {
            jb13.disable();
            counter=0;

        }
        
     


        




        frame.add(jp);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }

    public void StartDice()
    {
        //fframe = new JFrame("Animation Frame");
        //th = new Thread();
        //lbbbl = new JLabel();
        //lbbbl2 = new JLabel();
        //lbbbl3 = new JLabel();
        //lbbbl4 = new JLabel();
        //lbbbl5 = new JLabel();

        //Panel panel = new Panel();
        //panel.add(lbbbl);
        //panel.add(lbbbl2);
        //panel.add(lbbbl3);
        //panel.add(lbbbl4);
        //panel.add(lbbbl5);

        //fframe.add(panel, BorderLayout.CENTER);
        //fframe.setSize(530, 126);
        //fframe.setVisible(true);
        //fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         for (int j = 1; j <= 15; j++)
        {
            SwingAnimator();
            if (j == 2)
            {
                //j = 0;
            }
        }
    }

    public void SwingAnimator()
    {    
        

        //add dice pictures into an array of images
        ImageIcon diceFace1[] = {die2, die1, die3, die5, die4, die6};
        ImageIcon diceFace2[] = {die3, die6, die2, die4, die1, die5};
        ImageIcon diceFace3[] = {die4, die3, die5, die2, die6, die1};
        ImageIcon diceFace4[] = {die5, die2, die6, die4, die1, die3};
        ImageIcon diceFace5[] = {die6, die4, die1, die5, die2, die3};

        try
        {
            int n = 0;

            
            int i = 0;
            while (i < diceFace1.length && n < 2) {
                ImageIcon images = diceFace1[i];
                lbbbl.setIcon(images);

                ImageIcon images2 = diceFace2[i];
                lbbbl2.setIcon(images2);

                ImageIcon images3 = diceFace3[i];
                lbbbl3.setIcon(images3);

                ImageIcon images4 = diceFace4[i];
                lbbbl4.setIcon(images4);

                ImageIcon images5 = diceFace5[i];
                lbbbl5.setIcon(images5);

                
                i++;
                n++;
                th.sleep(150);              
                                
            }
            
            
            


        } 
        catch (InterruptedException e)
        {
            System.out.println("Interrupt error");
        }
    }

    public void dieFaces()
    {
        int[] allDice = retRoll;

            //System.out.println(allDice.length);

            //For first dice
            if (allDice[0] == 1)
                lbbbl.setIcon(die1);
            if (allDice[0] == 2)
                lbbbl.setIcon(die2);
            if (allDice[0] == 3)
                lbbbl.setIcon(die3);
            if (allDice[0] == 4)
                lbbbl.setIcon(die4);
            if (allDice[0] == 5)
                lbbbl.setIcon(die5);
            if (allDice[0] == 6)
                lbbbl.setIcon(die6);


            //For second dice
            if (allDice[1] == 1)
                lbbbl2.setIcon(die1);
            if (allDice[1] == 2)
                lbbbl2.setIcon(die2);
            if (allDice[1] == 3)
                lbbbl2.setIcon(die3);
            if (allDice[1] == 4)
                lbbbl2.setIcon(die4);
            if (allDice[1] == 5)
                lbbbl2.setIcon(die5);
            if (allDice[1] == 6)
                lbbbl2.setIcon(die6);


            //For third dice
            if (allDice[2] == 1)
                lbbbl3.setIcon(die1);
            if (allDice[2] == 2)
                lbbbl3.setIcon(die2);
            if (allDice[2] == 3)
                lbbbl3.setIcon(die3);
            if (allDice[2] == 4)
                lbbbl3.setIcon(die4);
            if (allDice[2] == 5)
                lbbbl3.setIcon(die5);
            if (allDice[2] == 6)
                lbbbl3.setIcon(die6);


            //For fouth dice
            if (allDice[3] == 1)
                lbbbl4.setIcon(die1);
            if (allDice[3] == 2)
                lbbbl4.setIcon(die2);
            if (allDice[3] == 3)
                lbbbl4.setIcon(die3);
            if (allDice[3] == 4)
                lbbbl4.setIcon(die4);
            if (allDice[3] == 5)
                lbbbl4.setIcon(die5);
            if (allDice[3] == 6)
                lbbbl4.setIcon(die6);


            //For fifth dice
            if (allDice[4] == 1)
                lbbbl5.setIcon(die1);
            if (allDice[4] == 2)
                lbbbl5.setIcon(die2);
            if (allDice[4] == 3)
                lbbbl5.setIcon(die3);
            if (allDice[4] == 4)
                lbbbl5.setIcon(die4);
            if (allDice[4] == 5)
                lbbbl5.setIcon(die5);
            if (allDice[4] == 6)
                lbbbl5.setIcon(die6);
    }
}
