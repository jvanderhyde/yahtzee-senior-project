/**
 * Yahtzee dice class
 * John Bohovic
 * Started          1-18-2012
 * Last Modified    1-18-2012
 */


import java.util.Random;

public class Dice
{
    private static int die1;
    private static int die2;
    private static int die3;
    private static int die4;
    private static int die5;
    private static Random randNum = new Random();
    private static int[] allDice = new int[5];

    //
    public static int[] roleDice()
    {
        die1 = randNum.nextInt(6)+1;
        die2 = randNum.nextInt(6)+1;
        die3 = randNum.nextInt(6)+1;
        die4 = randNum.nextInt(6)+1;
        die5 = randNum.nextInt(6)+1;

        for (int i=0; i<5; i++)
        {
            allDice[i] = die1;
        }

        return allDice;
    }

    public static void main(String args[])
    {
        System.out.println(roleDice());
    }
}
