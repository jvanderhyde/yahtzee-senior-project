/*
 * This class creates random values for the dice and returns and array of dice.
 */

import java.util.Random;

public class Dice
{
    private static int oneDie;    
    private static Random randNum = new Random();   
    private static int[] allDice = new int[5];



    /*
     * Roll all 5 dice at once and return
     * values as an array of ints.
     */
    public static int[] rollAllDice()
    {
                
        for (int i=0; i<5; i++)
        {
            //Find 5 random integers between 1 and 6
            int die = randNum.nextInt(6)+1;
            allDice[i] = die;
        }

        //Return the array of random integers
        return allDice;
    }




    /*
     * Roll one die at a time and return the value
     */
    public static int rollOneDie()
    {
        //Find a random integer between 1 and 6
        oneDie = randNum.nextInt(6)+1;

        //Return the random integer
        return oneDie;
    }    
}
