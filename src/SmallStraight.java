/*
 * This class calculates the score for the Small Straight category.
 * A small straight is a sequence of 4 consecutive numbers. This sequence will
 * either be 1,2,3,4,? or 2,3,4,5,? or 3,4,5,6,?.
 * The Small Straight class extends the Roll abstract class.
 */

import java.util.Arrays;

public class SmallStraight extends Roll
{
    public  int checkValues(int[] dice)
    {
        int sum;

        //Sort the array of dice that is passed in
        Arrays.sort(dice);

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check if dice roll is 1,2,3,4
        if (d1==1 && d2==2 && d3==3 && d4==4)
        {
            sum = 30;
        }
        else if (d2==1 && d3==2 && d4==3 && d5==4)
        {
            sum = 30;
        }

        //Check if dice roll is 2,3,4,5
        else if (d1==2 && d2==3 && d3==4 && d4==5)
        {
            sum = 30;
        }
        else if (d2==2 && d3==3 && d4==4 && d5==5)
        {
            sum = 30;
        }

        //Dice roll is 3,4,5,6
        else if (d1==3 && d2==4 && d3==5 && d4==6)
        {
            sum = 30;
        }
        else if (d2==3 && d3==4 && d4==5 && d5==6)
        {
            sum = 30;
        }

        //Otherwise sum is zero
        else
            sum = 0;

        //Return the score for a small straight
        return sum;
    }    
}
