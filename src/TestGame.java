import java.util.Scanner;


public class TestGame
{
    public static void main(String[] args)
    {
        int n=1;
        boolean aces = false;
        boolean twos = false;
        boolean threes = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play yahtzee!");

        while (n !=0)
        {
            
            System.out.print("Enter 1 to play or 0 to exit: ");
            int play = scan.nextInt();

            if (play == 0)
            {
                n = play;
                System.out.println("Thanks for playing");
            }
            else
            {
                System.out.println();
                System.out.println("Score Card: ");
                System.out.println();
                System.out.println("Upper Section");
                System.out.println("Aces: ");
                System.out.println("Twos: ");
                System.out.println("Threes: ");
                System.out.println("Fours: ");
                System.out.println("Fives: ");
                System.out.println("Sixes: ");
                System.out.println();
                System.out.println("Lower Section");
                System.out.println("3 of a kind: ");
                System.out.println("4 of a kind: ");
                System.out.println("Full House: ");
                System.out.println("Sm. Straight: ");
                System.out.println("Lg. Straight: ");
                System.out.println("Yahtzee: ");
                System.out.println("Chance: ");
                System.out.println();
                System.out.println("Upper Total: ");
                System.out.println("Lower Total: ");
                System.out.println();
                System.out.println("Total:");
                System.out.println();

                System.out.print("Enter 1 to roll or 0 to quit: ");
                int roll = scan.nextInt();

                if (roll == 0)
                {
                    n = roll;
                }
                else if(roll == 1)
                {
                    int[] firstRoll = Dice.rollAllDice();
                    for (int i=0; i<firstRoll.length; i++)
                    {
                        System.out.println("Die " + (i+1) + ": " + firstRoll[i]);
                    }

                    
                    
                }
                else
                {
                    System.out.print("Please enter a valid input: ");
                }

                

            }

        }
    }


}
