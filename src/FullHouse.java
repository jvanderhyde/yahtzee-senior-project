/*
 * This class calculates the score for the Full House category.
 * A full house is 3 of the same dice of a certain value and 2 of the same dice of another value
 * The 4 of a kind class extends the Roll abstract class.
 */


import java.util.Arrays;

public class FullHouse extends Roll
{
    public int checkValues(int[] dice)
    {
        int sum = 0;

        //Sort the array of dice that is passed in
        Arrays.sort(dice);

        int d1 = dice[0]; //die number 1
        int d2 = dice[1]; //die number 2
        int d3 = dice[2]; //die number 3
        int d4 = dice[3]; //die number 4
        int d5 = dice[4]; //die number 5

        //Check if the first number in sorted array is 5
        if (d1==5)
        {
            if (d1==5 && d2==5)
            {
                //Check if dice combination is 5,5,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==5 && d2==5 && d3==5)
            {
                //Check if dice combination is 5,5,5,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
       


        //Check if the first number in sorted array is 4
        if (d1==4)
        {
            if (d1==4 && d2==4)
            {
                //Check if dice combination is 4,4,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }
                
                //Check if dice combination is 4,4,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }

            }
            else if (d1==4 && d2==4 && d3==4)
            {
                //Check if dice combination is 4,4,4,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 4,4,4,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        



        //Check if the first number in sorted array is 3
        if (d1==3)
        {
            if (d1==3 && d2==3)
            {
                //Check if dice combination is 3,3,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 3,3,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 3,3,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==3 && d2==3 && d3==3)
            {
                //Check if dice combination is 3,3,3,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 3,3,3,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 3,3,3,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        


        //Check if the first number in sorted array is 2
        if (d1==2)
        {
            if (d1==2 && d2==2)
            {
                //Check if dice combination is 2,2,3,3,3
                if (d3==3 && d4==3 && d5==3)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==2 && d2==2 && d3==2)
            {
                //Check if dice combination is 2,2,2,3,3
                if (d4==3 && d5==3)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,2,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,2,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 2,2,2,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        


        //Check if the first number in sorted array is 1
        if (d1==1)
        {
            if (d1==1 && d2==1)
            {
                //Check if dice combination is 1,1,2,2,2
                if (d3==2 && d4==2 && d5==2)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,3,3,3
                if (d3==3 && d4==3 && d5==3)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,4,4,4
                if (d3==4 && d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,5,5,5
                if (d3==5 && d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,6,6,6
                if (d3==6 && d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
            else if (d1==1 && d2==1 && d3==1)
            {
                //Check if dice combination is 1,1,1,2,2
                if (d4==2 && d5==2)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,1,3,3
                if (d4==3 && d5==3)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,1,4,4
                if (d4==4 && d5==4)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,1,5,5
                if (d4==5 && d5==5)
                {
                    sum = 25;
                }

                //Check if dice combination is 1,1,1,6,6
                if (d4==6 && d5==6)
                {
                    sum = 25;
                }
            }
        }
        
        //Return the score for a full house
        return sum;
    }
}
