/*
 * This class calculates the score for the Aces category.
 * The Aces class extends the Roll abstract class.
 */
public class Aces extends Roll
{
    public  int checkValues(int dice[])
    {                

        int sum = 0;

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check each die, if the die is equal to 1 then we add 1 to the sum
        if (d1 == 1)
            sum +=1;

        if (d2 == 1)
            sum +=1;

        if (d3 == 1)
            sum +=1;

        if (d4 == 1)
            sum +=1;

        if (d5 == 1)
            sum +=1;

        //Return the score for aces
        return sum;
    }
}
