/*
 * This class calculates the score for the Yahtzee category.
 * A yahtzee is 5 dice all with the same value.
 * The Yahtzee class extends the Roll abstract class.
 */

public class Yahtzee extends Roll
{
    public  int checkValues(int[] dice)
    {
        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check if all the dice are the same value
        if (d1==d2 && d2==d3 && d3==d4 && d4==d5)
        {
            sum = 50;
        }
        else
        {
            sum = 0;
        }       

        //Return the score for a yahtzee
        return sum;
    }    
}
