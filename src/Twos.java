/*
 * This class calculates the score for the Twos category.
 * The Twos class extends the Roll abstract class.
 */
public class Twos extends Roll
{
    public  int checkValues(int[] dice)
    {
        int sum = 0;        

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 2 then we add 2 to the sum
        if (d1 == 2)
            sum +=2;

        if (d2 == 2)
            sum +=2;

        if (d3 == 2)
            sum +=2;

        if (d4 == 2)
            sum +=2;

        if (d5 == 2)
            sum +=2;

        //Return the score for aces
        return sum;
    }
}
