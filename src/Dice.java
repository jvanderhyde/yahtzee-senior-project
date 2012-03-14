/**
 * Yahtzee dice class
 * John Bohovic
 * Started          1-18-2012
 * Last Modified    1-25-2012
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
            int die = randNum.nextInt(6)+1;
            allDice[i] = die;
        }

        return allDice;
    }

    /*
     * Roll one die at a time and return the value
     */
    public static int rollOneDie()
    {
        oneDie = randNum.nextInt(6)+1;

        return oneDie;
    }

    /*
    public static void main(String args[])
    {
        int[] test;
        int die;
        test = rollAllDice();
        
        for (int i=0; i<test.length; i++)
        {
            System.out.print(test[i] + " ");
        }

        System.out.println();
        System.out.println();

        die = rollOneDie();
        System.out.println(die);
        
        die = rollOneDie();
        System.out.println(die);

        die = rollOneDie();
        System.out.println(die);

        die = rollOneDie();
        System.out.println(die);
    }*/
}
