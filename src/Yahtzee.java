public class Yahtzee extends Roll
{
    public  int checkValues(int[] dice)
    {
        int sum = 0;

        int d1 = dice[0]; //1
        int d2 = dice[1]; //2
        int d3 = dice[2]; //3
        int d4 = dice[3]; //4
        int d5 = dice[4]; //5


        if (d1==d2 && d2==d3 && d3==d4 && d4==d5)
        {
            sum = 50;
        }
        else
        {
            sum = 0;
        }


        


        return sum;
    }    
}
