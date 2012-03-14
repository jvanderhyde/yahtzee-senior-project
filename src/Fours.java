public class Fours extends Roll
{
    public  int checkValues(int[] dice)
    {        
        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

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

        return sum;
    }
}
