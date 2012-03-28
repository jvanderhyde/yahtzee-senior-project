/*
 * This class calculates the score for the Threes category.
 * The Threes class extends the Roll abstract class.
 */
public class Threes extends Roll
{
    public  int checkValues(int[] dice)
    {        
        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 3 then we add 3 to the sum
        if (d1 == 3)
            sum +=3;

        if (d2 == 3)
            sum +=3;

        if (d3 == 3)
            sum +=3;

        if (d4 == 3)
            sum +=3;

        if (d5 == 3)
            sum +=3;

        //Return the score for threes
        return sum;
    }


}
