
public class Aces extends Roll
{
    public  int checkValues(int dice[])
    {                

        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5

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

        return sum;
    }
}
