public class Sixes extends Roll
{
    public  int checkValues(int[] dice)
    {       
        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

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

        return sum;
    }
}
