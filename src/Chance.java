/*
 * This class calculates the score for the Chance category.
 * Chance is the sum of all 5 dice.
 * The Chance class extends the Roll abstract class.
 */

public class Chance extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        //Loop through the array of dice and add up the values for all the dice
        for (int i=0; i<dice.length; i++)
        {
            sum += dice[i];
        }

        //Return the score for a yahtzee
        return sum;
    }
}
