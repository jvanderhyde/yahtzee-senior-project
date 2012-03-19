import java.util.Arrays;

public class FullHouse extends Roll
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

        //Check if first number in sorted array is 5
        if (d1==5)
        {
            if (d1==5 && d2==5)
            {
                //5,5,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==5 && d2==5 && d3==5)
            {
                //5,5,5,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
       


        //Check if first number in sorted array is 4
        if (d1==4)
        {
            if (d1==4 && d2==4)
            {
                //4,4,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }
                
                //4,4,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }

            }
            else if (d1==4 && d2==4 && d3==4)
            {
                //4,4,4,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //4,4,4,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        



        //Check if first number in sorted array is 3
        if (d1==3)
        {
            if (d1==3 && d2==3)
            {
                //3,3,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //3,3,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //3,3,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==3 && d2==3 && d3==3)
            {
                //3,3,3,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //3,3,3,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //3,3,3,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        


        //Check if first number in sorted array is 2
        if (d1==2)
        {
            if (d1==2 && d2==2)
            {
                //2,2,3,3,3
                if (d3==3 && d4==3 && d5==3)
                {
                    sum = 25;
                }

                //2,2,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //2,2,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //2,2,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==2 && d2==2 && d3==2)
            {
                //2,2,2,3,3
                if (d4==3 && d5==3)
                {
                    sum = 25;
                }

                //2,2,2,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //2,2,2,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //2,2,2,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        


        //Check if first number in sorted array is 1
        if (d1==1)
        {
            if (d1==1 && d2==1)
            {
                //1,1,2,2,2
                if (d3==2 && d4==2 && d5==2)
                {
                    sum = 25;
                }

                //1,1,3,3,3
                if (d3==3 && d4==3 && d5==3)
                {
                    sum = 25;
                }

                //1,1,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //1,1,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //1,1,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==1 && d2==1 && d3==1)
            {
                //1,1,1,2,2
                if (d4==2 && d5==2)
                {
                    sum = 25;
                }

                //1,1,1,3,3
                if (d4==3 && d5==3)
                {
                    sum = 25;
                }

                //1,1,1,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //1,1,1,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //1,1,1,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        


        return sum;
    }
}
