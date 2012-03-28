public class Yahtzee extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

        for (int i=1; i<=6; i++)
        {
            if (d1==i && d2==i && d3==i && d4==i && d5==i)
            {
                sum = 50;
            }
            else
            {
                sum = 0;
            }
        }


        return sum;
    }
}
