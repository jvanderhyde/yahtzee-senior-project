
public class Chance extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        for (int i=0; i<dice.length; i++)
        {
            sum += dice[i];
        }

        return sum;
    }
}
