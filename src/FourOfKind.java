/*
 * This class calculates the score for the 4 of a kind category.
 * The 4 of a kind class extends the Roll abstract class.
 */

import java.util.Arrays;

public class FourOfKind extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        //Sort the array of dice that is passed in
        Arrays.sort(dice);

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5


        //Check if the roll is four ones
        if (d1==1 && d2==1 && d3==1 && d4==1)
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Check if the roll is four twos
        if ((d1==2 && d2==2 && d3==2 && d4==2) || (d2==2 && d3==2 && d4==2 && d5==2))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Check if the roll is four threes
        if ((d1==3 && d2==3 && d3==3 && d4==3) || (d2==3 && d3==3 && d4==3 && d5==3))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Check if the roll is four fours
        if ((d1==4 && d2==4 && d3==4 && d4==4) || (d2==4 && d3==4 && d4==4 && d5==4))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Check if the roll is four fives
        if ((d1==5 && d2==5 && d3==5 && d4==5) || (d2==5 && d3==5 && d4==5 && d5==5))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Check if the roll is four sixes
        if ((d1==6 && d2==6 && d3==6 && d4==6) || (d2==6 && d3==6 && d4==6 && d5==6))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Return the score for 4 of a kind
        return sum;
    }
}
