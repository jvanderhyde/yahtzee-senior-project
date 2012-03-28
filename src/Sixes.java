/*
 * This class calculates the score for the Fives category.
 * The Fives class extends the Roll abstract class.
 */
public class Sixes extends Roll
{
    public  int checkValues(int[] dice)
    {       
        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 6 then we add 6 to the sum
        if (d1 == 6)
            sum +=6;

        if (d2 == 6)
            sum +=6;

        if (d3 == 6)
            sum +=6;

        if (d4 == 6)
            sum +=6;

        if (d5 == 6)
            sum +=6;

        //Return the score for fives
        return sum;
    }
}
