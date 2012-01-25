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
    public static int[] rollAllDice()
    {
                
        for (int i=0; i<5; i++)
        {
            int die = randNum.nextInt(6)+1;
            allDice[i] = die;
        }

        return allDice;
    }

    public static int rollDie1()
    {
        die1 = randNum.nextInt(6)+1;

        return die1;
    }

    public static int rollDie2()
    {
        die2 = randNum.nextInt(6)+1;

        return die2;
    }

    public static int rollDie3()
    {
        die3 = randNum.nextInt(6)+1;

        return die3;
    }

    public static int rollDie4()
    {
        die4 = randNum.nextInt(6)+1;

        return die4;
    }

    public static int rollDie5()
    {
        die5 = randNum.nextInt(6)+1;

        return die5;
    }

    public static void main(String args[])
    {
        System.out.println(rollAllDice());
    }
}
