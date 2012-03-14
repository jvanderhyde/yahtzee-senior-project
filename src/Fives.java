public class Fives extends Roll
{
    public  int checkValues(int dice[])
    {      
        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

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

        return sum;
    }
}
