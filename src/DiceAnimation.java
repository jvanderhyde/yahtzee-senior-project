

import java.awt.*;
import javax.swing.*;


public final class DiceAnimation
{

    Thread th;
    JFrame fframe;
    JLabel lbbbl;
    JLabel lbbbl2;
    JLabel lbbbl3;
    JLabel lbbbl4;
    JLabel lbbbl5;

    public static void main(String[] args)
    {
        DiceAnimation sa = new DiceAnimation();
        sa.StartDice();
        
    }

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
    

    public DiceAnimation()
    {
        

    }


    public void StartDice()
    {
        fframe = new JFrame("Animation Frame");
        th = new Thread();
        lbbbl = new JLabel();
        lbbbl2 = new JLabel();
        lbbbl3 = new JLabel();
        lbbbl4 = new JLabel();
        lbbbl5 = new JLabel();

        Panel panel = new Panel();
        panel.add(lbbbl);
        panel.add(lbbbl2);
        panel.add(lbbbl3);
        panel.add(lbbbl4);
        panel.add(lbbbl5);

        fframe.add(panel, BorderLayout.CENTER);
        fframe.setSize(530, 126);
        fframe.setVisible(true);
        fframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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
