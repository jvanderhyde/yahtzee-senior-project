import java.util.Arrays;

public class ThreeOfKind extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        Arrays.sort(dice);

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

        // Three ones
        if (d1==1 && d2==1 && d3==1)
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Three twos
        if ((d1==2 && d2==2 && d3==2) || (d2==2 && d3==2 && d4==2) || (d3==2 && d4==2 && d5==2))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Three threes
        if ((d1==3 && d2==3 && d3==3) || (d2==3 && d3==3 && d4==3) || (d3==3 && d4==3 && d5==3))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Three fours
        if ((d1==4 && d2==4 && d3==4) || (d2==4 && d3==4 && d4==4) || (d3==4 && d4==4 && d5==4))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        //Three fives
        if ((d1==5 && d2==5 && d3==5) || (d2==5 && d3==5 && d4==5) || (d3==5 && d4==5 && d5==5))
        {
            sum = (d1+d2+d3+d4+d5);
        }

        if ((d1==6 && d2==6 && d3==6) || (d2==6 && d3==6 && d4==6) || (d3==6 && d4==6 && d5==6))
        {
            sum = (d1+d2+d3+d4+d5);
        }



        return sum;
    }
}
