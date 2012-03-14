/*
 * Yahtzee Score Controller class
 * John Bohovic
 * Started 1-25-12
 * Last Modified 2-8-12
 */

import java.util.Scanner;

//Keep track of what boxes are still open, no entry can be made more than once
public class ScoreController 
{

    private static Roll[] rolls = new Roll[13];

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

    
    /*
    public static void newScoreCard()
    {
        
    } 

    

    Roll all dice and
    public static int[] roll()
    {
        //int[] firstRoll = Dice.rollAllDice();
        
        //return firstRoll;


    }*/    


    public static void main(String[] args)
    {
        int n=1;
        ScoreController player = new ScoreController();

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
                System.out.println();
                System.out.println("Score Card: ");
                System.out.println();
                System.out.println("Upper Section");
                System.out.println("Aces: ");
                System.out.println("Twos: ");
                System.out.println("Threes: ");
                System.out.println("Fours: ");
                System.out.println("Fives: ");
                System.out.println("Sixes: ");
                System.out.println();
                
                System.out.println("Upper Total: ");
                System.out.println();
                System.out.println("Total:");
                System.out.println();

                System.out.print("Enter 1 to roll or 0 to quit: ");
                int roll = scan.nextInt();

                if (roll == 0)
                {
                    n = roll;
                }
                else if(roll == 1)
                {
                    int[] firstRoll = Dice.rollAllDice();
                    for (int i=0; i<firstRoll.length; i++)
                    {
                        System.out.println("Die " + (i+1) + ": " + firstRoll[i]);
                    }

                    
                    for (int i=0; i<rolls.length; i++)
                    {
                        System.out.println(player.rolls[i].checkValues(firstRoll));
                    }
                                       
                    


                }
                else
                {
                    System.out.print("invalid input");
                }



            }

        }
    }
}
