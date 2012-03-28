/*
 * This class calculates the score for the Fours category.
 * The Fours class extends the Roll abstract class.
 */
public class Fours extends Roll
{
    public  int checkValues(int[] dice)
    {        
        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 4 then we add 4 to the sum
        if (d1 == 4)
            sum +=4;

        if (d2 == 4)
            sum +=4;

        if (d3 == 4)
            sum +=4;

        if (d4 == 4)
            sum +=4;

        if (d5 == 4)
            sum +=4;

        //Return the score for fours
        return sum;
    }
}
