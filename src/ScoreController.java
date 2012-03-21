/*
 * Yahtzee Score Controller class
 * John Bohovic
 * Started 1-25-12
 * Last Modified 2-8-12
 */

import java.util.Scanner;
import java.util.Arrays;

//Keep track of what boxes are still open, no entry can be made more than once
public class ScoreController 
{

    public static Roll[] rolls = new Roll[13];
    public static int[] score = new int[13];

    //All values initially set to false meaning the spaces are open
    public ScoreController()
    {
        rolls[0] = new Aces();
        rolls[1] = new Twos();
        rolls[2] = new Threes();
        rolls[3] = new Fours();
        rolls[4] = new Fives();
        rolls[5] = new Sixes();
        rolls[6] = new ThreeOfKind();
        rolls[7] = new FourOfKind();
        rolls[8] = new FullHouse();
        rolls[9] = new SmallStraight();
        rolls[10] = new LargeStraight();
        rolls[11] = new Yahtzee();
        rolls[12] = new Chance();

    }

            


    public static void main(String[] args)
    {
        int n=1;
        ScoreController player = new ScoreController();
        
        //initial scores
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int upTotal = 0;
        int lowTotal = 0;
        int total = 0;

        int d1;
        int d2;
        int d3;
        int d4;
        int d5;

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play yahtzee!");

        while (n !=0)
        {

            System.out.print("Enter 1 to play or 0 to exit: ");
            int play = scan.nextInt();

            if (play == 0)
            {
                n = play;
                System.out.println("Thanks for playing");
            }
            else
            {
                //Print out score card
                System.out.println();
                System.out.println("Score Card: ");
                System.out.println();
                System.out.println("Aces: " + a);
                System.out.println("Twos: " + b);
                System.out.println("Threes: " + c);
                System.out.println("Fours: " + d);
                System.out.println("Fives: " + e);
                System.out.println("Sixes: " + f);
                System.out.println();
                System.out.println("3 of a kind: " + g);
                System.out.println("4 of a kind: " + h);
                System.out.println("Full House: " +i);
                System.out.println("Sm. Straight: " + j);
                System.out.println("Lg. Straight: " + k);
                System.out.println("Yahtzee: " + l);
                System.out.println("Chance: " + m);
                System.out.println("Upper Total: " + upTotal);
                System.out.println("Lower Total: " + lowTotal);
                System.out.println();
                System.out.println("Total:" + total);
                System.out.println();

                int p=1;

                //while loop to keep rolling dice
                while (p!=0)
                {
                    System.out.println();
                    System.out.print("Enter 1 to roll or 0 to quit: ");
                    int roll = scan.nextInt();

                    //First roll
                    if (roll == 0)
                    {
                        p = roll;

                    }
                    else if(roll == 1)
                    {
                        int[] firstRoll = Dice.rollAllDice();
                        Arrays.sort(firstRoll);
                        for (int t=0; t<firstRoll.length; t++)
                        {
                            System.out.println("Die " + (t+1) + ": " + firstRoll[t]);
                        }
                        System.out.println();

                        System.out.println("Available Categories to play:");
                        for (int t=0; t<rolls.length; t++)
                        {
                            String label = "";
                            if (t==0)
                                label = " Aces: ";
                            else if (t==1)
                                label = " Twos: ";
                            else if (t==2)
                                label = " Threes: ";
                            else if (t==3)
                                label = " Fours: ";
                            else if (t==4)
                                label = " Fives: ";
                            else if (t==5)
                                label = " Sixes: ";
                            else if (t==6)
                                label = " 3 of a kind: ";
                            else if (t==7)
                                label = " 4 of kind: ";
                            else if (t==8)
                                label = " Full House: ";
                            else if (t==9)
                                label = " Sm. Straight: ";
                            else if (t==10)
                                label = " Lg. Straight: ";
                            else if (t==11)
                                label = " Yahtzee: ";
                            else if (t==12)
                                label = " Chance: ";
                            
                            int test = player.rolls[t].checkValues(firstRoll);
                            if (rolls[t].isPlayed != true)
                            {
                                System.out.println("#" + (t+1) + label + test);
                                score[t]=test;
                            }

                        }

                        System.out.println();
                        System.out.print("Enter 2 to score your dice now or 3 to roll again: ");
                        int nPlay = scan.nextInt();
                        System.out.println();

                        //Score now and print updated score card
                        if (nPlay==2)
                        {
                            System.out.print("Select the correspondong number of category you would like to use: ");
                            int catNum = scan.nextInt();

                            if (catNum==1)
                            {
                                a = score[0];
                                rolls[0].isPlayed=true;
                            }
                            if (catNum==2)
                            {
                                b = score[1];
                                rolls[1].isPlayed=true;
                            }
                            if (catNum==3)
                            {
                                c = score[2];
                                rolls[2].isPlayed=true;
                            }
                            if (catNum==4)
                            {
                                d = score[3];
                                rolls[3].isPlayed=true;
                            }
                            if (catNum==5)
                            {
                                e = score[4];
                                rolls[4].isPlayed=true;
                            }
                            if (catNum==6)
                            {
                                f = score[5];
                                rolls[5].isPlayed=true;
                            }
                            if (catNum==7)
                            {
                                g = score[6];
                                rolls[6].isPlayed=true;
                            }
                            if (catNum==8)
                            {
                                h = score[7];
                                rolls[7].isPlayed=true;
                            }
                            if (catNum==9)
                            {
                                i = score[8];
                                rolls[8].isPlayed=true;
                            }
                            if (catNum==10)
                            {
                                j = score[9];
                                rolls[9].isPlayed=true;
                            }
                            if (catNum==11)
                            {
                                k = score[10];
                                rolls[10].isPlayed=true;
                            }
                            if (catNum==12)
                            {
                                l = score[11];
                                rolls[11].isPlayed=true;
                            }
                            if (catNum==13)
                            {
                                m = score[12];
                                rolls[12].isPlayed=true;
                            }

                            upTotal = (a+b+c+d+e+f);
                            lowTotal = (g+h+i+j+k+l+m);
                            total = (upTotal+lowTotal);

                            //Print out score card
                            System.out.println();
                            System.out.println("Score Card: ");
                            System.out.println();
                            System.out.println("Aces: " + a);
                            System.out.println("Twos: " + b);
                            System.out.println("Threes: " + c);
                            System.out.println("Fours: " + d);
                            System.out.println("Fives: " + e);
                            System.out.println("Sixes: " + f);
                            System.out.println();
                            System.out.println("3 of a kind: " + g);
                            System.out.println("4 of a kind: " + h);
                            System.out.println("Full House: " +i);
                            System.out.println("Sm. Straight: " + j);
                            System.out.println("Lg. Straight: " + k);
                            System.out.println("Yahtzee: " + l);
                            System.out.println("Chance: " + m);
                            System.out.println();
                            System.out.println("Upper Total: " + upTotal);
                            System.out.println("Lower Total: " + lowTotal);
                            System.out.println();
                            System.out.println("Total:" + total);
                            System.out.println();

                        }
                        //Roll select dice again
                        else if (nPlay==3)
                        {
                            
                            int count=0;
                            int rollAgain=1;
                            while (count<2 && rollAgain != 0)
                            {

                                System.out.print("How many dice you want to roll again: ");
                                int amountDice = scan.nextInt();

                                System.out.println();
                                System.out.println("Select the corresponding number of the die. Repeat as necessary.");
                                
                                for (int v=0; v<amountDice; v++)
                                {
                                    System.out.print("Enter the die number you want to roll again: ");
                                    int dieNum = scan.nextInt();

                                    int newDice = Dice.rollOneDie();
                                    
                                    firstRoll[(dieNum-1)] = newDice;
                                }

                                for (int t=0; t<firstRoll.length; t++)
                                {
                                    System.out.println("Die " + (t+1) + ": " + firstRoll[t]);
                                }

                                System.out.println();
                                System.out.print("Enter 1 to roll again or 0 to score your roll: ");
                                rollAgain = scan.nextInt();

                                count++;
                            }

                            //Print available options
                            System.out.println("Available Categories to play:");
                            for (int t=0; t<rolls.length; t++)
                            {
                                String label = "";
                                if (t==0)
                                    label = " Aces: ";
                                else if (t==1)
                                    label = " Twos: ";
                                else if (t==2)
                                    label = " Threes: ";
                                else if (t==3)
                                    label = " Fours: ";
                                else if (t==4)
                                    label = " Fives: ";
                                else if (t==5)
                                    label = " Sixes: ";
                                else if (t==6)
                                    label = " 3 of a kind: ";
                                else if (t==7)
                                    label = " 4 of kind: ";
                                else if (t==8)
                                    label = " Full House: ";
                                else if (t==9)
                                    label = " Sm. Straight: ";
                                else if (t==10)
                                    label = " Lg. Straight: ";
                                else if (t==11)
                                    label = " Yahtzee: ";
                                else if (t==12)
                                    label = " Chance: ";

                                int test = player.rolls[t].checkValues(firstRoll);
                                if (rolls[t].isPlayed != true)
                                {
                                    System.out.println("#" + (t+1) + label + test);
                                    score[t]=test;
                                }

                            }

                            //Score the roll
                            System.out.print("Select the correspondong number of category you would like to use: ");
                            int catNum = scan.nextInt();

                            if (catNum==1)
                            {
                                a = score[0];
                                rolls[0].isPlayed=true;
                            }
                            if (catNum==2)
                            {
                                b = score[1];
                                rolls[1].isPlayed=true;
                            }
                            if (catNum==3)
                            {
                                c = score[2];
                                rolls[2].isPlayed=true;
                            }
                            if (catNum==4)
                            {
                                d = score[3];
                                rolls[3].isPlayed=true;
                            }
                            if (catNum==5)
                            {
                                e = score[4];
                                rolls[4].isPlayed=true;
                            }
                            if (catNum==6)
                            {
                                f = score[5];
                                rolls[5].isPlayed=true;
                            }
                            if (catNum==7)
                            {
                                g = score[6];
                                rolls[6].isPlayed=true;
                            }
                            if (catNum==8)
                            {
                                h = score[7];
                                rolls[7].isPlayed=true;
                            }
                            if (catNum==9)
                            {
                                i = score[8];
                                rolls[8].isPlayed=true;
                            }
                            if (catNum==10)
                            {
                                j = score[9];
                                rolls[9].isPlayed=true;
                            }
                            if (catNum==11)
                            {
                                k = score[10];
                                rolls[10].isPlayed=true;
                            }
                            if (catNum==12)
                            {
                                l = score[11];
                                rolls[11].isPlayed=true;
                            }
                            if (catNum==13)
                            {
                                m = score[12];
                                rolls[12].isPlayed=true;
                            }

                            upTotal = (a+b+c+d+e+f);
                            lowTotal = (g+h+i+j+k+l+m);
                            total = (upTotal+lowTotal);

                            //Print out score card
                            System.out.println();
                            System.out.println("Score Card: ");
                            System.out.println();
                            System.out.println("Aces: " + a);
                            System.out.println("Twos: " + b);
                            System.out.println("Threes: " + c);
                            System.out.println("Fours: " + d);
                            System.out.println("Fives: " + e);
                            System.out.println("Sixes: " + f);
                            System.out.println();
                            System.out.println("3 of a kind: " + g);
                            System.out.println("4 of a kind: " + h);
                            System.out.println("Full House: " +i);
                            System.out.println("Sm. Straight: " + j);
                            System.out.println("Lg. Straight: " + k);
                            System.out.println("Yahtzee: " + l);
                            System.out.println("Chance: " + m);
                            System.out.println();
                            System.out.println("Upper Total: " + upTotal);
                            System.out.println("Lower Total: " + lowTotal);
                            System.out.println();
                            System.out.println("Total:" + total);
                            System.out.println();


                        }

                    }
                }
                
                



            }

        }
    }


}
