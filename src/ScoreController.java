/*
 * Yahtzee Score Controller class
 * John Bohovic
 * Started 1-25-12
 * Last Modified 1-25-12
 */


public class ScoreController
{
    private int d1;
    private int d2;
    private int d3;
    private int d4;
    private int d5;

    public void firstRoll()
    {
        int[] firstRoll = Dice.rollAllDice();

        d1 = firstRoll[0];
        d2 = firstRoll[1];
        d3 = firstRoll[2];
        d4 = firstRoll[3];
        d5 = firstRoll[4];

        
    }
}
