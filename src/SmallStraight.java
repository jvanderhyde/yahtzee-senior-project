import java.util.Arrays;

public class SmallStraight extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum;

        Arrays.sort(dice);

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

        if (d1==1 && d2==2 && d3==3 && d4==4)
        {
            sum = 30;
        }
        else if (d1==2 && d2==3 && d3==4 && d4==5)
        {
            sum = 30;
        }
        else if (d1==3 && d2==4 && d3==5 && d4==6)
        {
            sum = 30;
        }
        else
            sum = 0;



        return sum;
    }
}
