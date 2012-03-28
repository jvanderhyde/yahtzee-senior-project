

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JPanel frame;


    public scoreSheet()
    {
        frame = new JPanel();
        frame.setSize(300,300);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Yahtzee");
        jp.add(jl, BorderLayout.NORTH);


        //West
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(22,1));
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

        JLabel j20 = new JLabel("Lower Section");
        jp1.add(j20);
        JLabel j21 = new JLabel("3 0f a Kind");
        jp1.add(j21);
        JLabel j22 = new JLabel("4 of a Kind");
        jp1.add(j22);
        JLabel j23 = new JLabel("Full House");
        jp1.add(j23);
        JLabel j24 = new JLabel("Sm Sraight");
        jp1.add(j24);
        JLabel j25 = new JLabel("Lg Straight");
        jp1.add(j25);
        JLabel j26 = new JLabel("YAHTZEE");
        jp1.add(j26);
        JLabel j27 = new JLabel("Chance");
        jp1.add(j27);
        JLabel j28 = new JLabel("Yahtzee Bonus");
        jp1.add(j28);
        JLabel j29 = new JLabel("Total Upper Section");
        jp1.add(j29);
        JLabel j30 = new JLabel("Total Lower Secton");
        jp1.add(j30);
        JLabel j31 = new JLabel("Grand Total");
        jp1.add(j31);

        jp.add(jp1,BorderLayout.WEST);


        //Center
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(22,1));
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
        JLabel jlh10 = new JLabel("");
        jp2.add(jlh10);
        JLabel jlh11 = new JLabel("   Add Total Of Dice");
        jp2.add(jlh11);
        JLabel jlh12 = new JLabel("   Add Total of Dice");
        jp2.add(jlh12);
        JLabel jlh13 = new JLabel("   Score 25");
        jp2.add(jlh13);
        JLabel jlh14 = new JLabel("   Score 30");
        jp2.add(jlh14);
        JLabel jlh15 = new JLabel("   Score 40");
        jp2.add(jlh15);
        JLabel jlh16 = new JLabel("   Score 50");
        jp2.add(jlh16);
        JLabel jlh17 = new JLabel("   Total Of All Dice");
        jp2.add(jlh17);
        JLabel jlh18 = new JLabel("   Score 100");
        jp2.add(jlh18);
        JLabel jlh19 = new JLabel("   Upper Section Score");
        jp2.add(jlh19);
        JLabel jlh20 = new JLabel("   Lower Section Score");
        jp2.add(jlh20);
        JLabel jlh21 = new JLabel("   --------------->");
        jp2.add(jlh21);

        jp.add(jp2,BorderLayout.CENTER);


        //East
        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(22,2));
        JLabel jls = new JLabel("Score");
        jp3.add(jls);
        JLabel jls1 = new JLabel(" ");
        jp3.add(jls1);
        JButton jb = new JButton("Score");
        jp3.add(jb);
        final JLabel jls2 = new JLabel("  0");
        jp3.add(jls2);
        JButton jb1 = new JButton("Score");
        jp3.add(jb1);
        final JLabel jls3 = new JLabel("  0");
        jp3.add(jls3);
         JButton jb2 = new JButton("Score");
        jp3.add(jb2);
        final JLabel jls4 = new JLabel("  0");
        jp3.add(jls4);
        JButton jb3 = new JButton("Score");
        jp3.add(jb3);
        final JLabel jls5 = new JLabel("  0");
        jp3.add(jls5);
        JButton jb4 = new JButton("Score");
        jp3.add(jb4);
        final JLabel jls6 = new JLabel("  0");
        jp3.add(jls6);
        JButton jb5 = new JButton("Score");
        jp3.add(jb5);
        final JLabel jls7 = new JLabel("  0");
        jp3.add(jls7);
        final JButton jb6 = new JButton("Score");
        jp3.add(jb6);
        final JLabel jls8 = new JLabel("  0");
        jp3.add(jls8);
        final JButton jb7 = new JButton("Score");
        jp3.add(jb7);
        final JLabel jls9 = new JLabel("  0");
        jp3.add(jls9);
        JButton jb8 = new JButton("Score");
        jp3.add(jb8);
        final JLabel jls10 = new JLabel("  0");
        jp3.add(jls10);
        JButton jb9 = new JButton("Score");
        jp3.add(jb9);
        final JLabel jls12 = new JLabel("  0");
        jp3.add(jls12);
        JButton jb10 = new JButton("Score");
        jp3.add(jb10);
        final JLabel jls13 = new JLabel("  0");
        jp3.add(jls13);
        JButton jb11 = new JButton("Score");
        jp3.add(jb11);
        final JLabel jls14 = new JLabel("  0");
        jp3.add(jls14);
        JButton jb12 = new JButton("Score");
        jp3.add(jb12);
        final JLabel jls15 = new JLabel("  0");
        jp3.add(jls15);
        JButton jb16 = new JButton("Score");
        jp3.add(jb16);
         final JLabel jls16 = new JLabel("  0");
        jp3.add(jls16);
        JButton jb17 = new JButton("Score");
        jp3.add(jb17);
        final JLabel jls17 = new JLabel("  0");
        jp3.add(jls17);
        JButton jb18 = new JButton("Score");
        jp3.add(jb18);
        final JLabel jls18 = new JLabel("  0");
        jp3.add(jls18);
        JButton jb19 = new JButton("Score");
        jp3.add(jb19);
        final JLabel jls19 = new JLabel("  0");
        jp3.add(jls19);
        final JButton jb20 = new JButton("Score");
        jp3.add(jb20);
        final JLabel jls20 = new JLabel("  0");
        jp3.add(jls20);
        final JButton jb21 = new JButton("Score");
        jp3.add(jb21);
        final JLabel jls21 = new JLabel("  0");
        jp3.add(jls21);
        final JButton jb22 = new JButton("Score");
        jp3.add(jb22);
        final JLabel jls22 = new JLabel("  0");
        jp3.add(jls22);
        final JButton jb23 = new JButton("Score");
        jp3.add(jb23);
        final JLabel jls23 = new JLabel("  0");
        jp3.add(jls23);
        
       jb.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls2.setText(Integer.toString(ScoreController.score[0]));
                ScoreController.rolls[0].isPlayed = true ;

            }
        });

        jb1.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls3.setText(Integer.toString(ScoreController.score[1]));
                ScoreController.rolls[1].isPlayed = true ;

            }
        });

        jb2.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls4.setText(Integer.toString(ScoreController.score[2]));
                ScoreController.rolls[2].isPlayed = true ;

            }
        });

        jb3.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls5.setText(Integer.toString(ScoreController.score[3]));
                ScoreController.rolls[3].isPlayed = true ;

            }
        });
        jb4.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls6.setText(Integer.toString(ScoreController.score[4]));
                ScoreController.rolls[4].isPlayed = true ;

            }
        });
        
        jb5.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls7.setText(Integer.toString(ScoreController.score[5]));
                ScoreController.rolls[5].isPlayed = true ;

            }
        });


                jb6.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                int i = Integer.parseInt(jls2.getText());
                int i1 = Integer.parseInt(jls3.getText());
                int i2 = Integer.parseInt(jls4.getText());
                int i3 = Integer.parseInt(jls5.getText());
                int i4 = Integer.parseInt(jls6.getText());
                int i5 = Integer.parseInt(jls7.getText());

                int total = i+i1+i2+i3+i4+i5;
                jls8.setText(Integer.toString(total));
                jb6.disable();
                

            }
        });
        
                jb7.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                if(Integer.parseInt(jls8.getText()) >= 63)
                {
                   int bonus = Integer.parseInt(jls8.getText()) + 35;
                   jls9.setText(Integer.toString(bonus));
                   jb7.disable();
                  
                }
                else
                {
                    int bonus = Integer.parseInt(jls8.getText()) + 0;
                    jls9.setText(Integer.toString(bonus));
                    jb7.disable();
                    
                    
                }
                

            }
        });
        
                jb8.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                jls10.setText(jls9.getText());
                jls10.disable();
                
            }
        });

        jb10.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls13.setText(Integer.toString(ScoreController.score[6]));
                ScoreController.rolls[6].isPlayed = true ;

            }
        });

        jb11.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls14.setText(Integer.toString(ScoreController.score[7]));
                ScoreController.rolls[7].isPlayed = true ;

            }
        });


        jb12.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls15.setText(Integer.toString(ScoreController.score[8]));
                ScoreController.rolls[8].isPlayed = true ;

            }
        });

        jb16.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls16.setText(Integer.toString(ScoreController.score[9]));
                ScoreController.rolls[9].isPlayed = true ;

            }
        });

         jb17.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls17.setText(Integer.toString(ScoreController.score[10]));
                ScoreController.rolls[10].isPlayed = true ;

            }
        });

        jb18.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls18.setText(Integer.toString(ScoreController.score[11]));
                ScoreController.rolls[11].isPlayed = true ;

            }
        });

         jb19.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls19.setText(Integer.toString(ScoreController.score[12]));
                ScoreController.rolls[12].isPlayed = true ;

            }
        });


        jb20.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                
                
                 if (ScoreController.rolls[11].isPlayed && ScoreController.score[11]==50)
                {
                    int total = 100;
                    jls20.setText(Integer.toString(total));
                    
                }
                
                 

            }
        });


                 jb21.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                jls21.setText(jls9.getText());
                jb21.disable();

            }
        });

                 jb22.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                int i = Integer.parseInt(jls14.getText());
                int i1 = Integer.parseInt(jls15.getText());
                int i2 = Integer.parseInt(jls16.getText());
                int i3 = Integer.parseInt(jls17.getText());
                int i4 = Integer.parseInt(jls18.getText());
                int i5 = Integer.parseInt(jls19.getText());
                int i6 = Integer.parseInt(jls13.getText());
                int i7 = Integer.parseInt(jls20.getText());

                int total = i+i1+i2+i3+i4+i5+i6+i7;
                jls22.setText(Integer.toString(total));
                jb22.disable();

            }
        });


                 jb23.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                int i =  Integer.parseInt(jls21.getText());
                int ii =  Integer.parseInt(jls22.getText());

                int grdTotal = i + ii;
                jls23.setText(Integer.toString(grdTotal));
                jb23.disable();

            }
        });


        jp.add(jp3,BorderLayout.EAST);

        frame.add(jp);
        frame.setVisible(true);
        
    }
}
