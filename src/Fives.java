/*
 * This class calculates the score for the Fives category.
 * The Fives class extends the Roll abstract class.
 */
public class Fives extends Roll
{
    public  int checkValues(int dice[])
    {      
        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 5 then we add 5 to the sum
        if (d1 == 5)
            sum +=5;

        if (d2 == 5)
            sum +=5;

        if (d3 == 5)
            sum +=5;

        if (d4 == 5)
            sum +=5;

        if (d5 == 5)
            sum +=5;

        //Return the score for fives
        return sum;
    }
}
