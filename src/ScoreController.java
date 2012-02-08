/*
 * Yahtzee Score Controller class
 * John Bohovic
 * Started 1-25-12
 * Last Modified 2-8-12
 */

//Keep track of what boxes are still open, no entry can be made more than once
public class ScoreController
{
    private static int d1;
    private static int d2;
    private static int d3;
    private static int d4;
    private static int d5;

    private static int aces = 0;
    private static boolean acesB = true;

    private static int twos = 0;
    private static boolean twosB = true;

    private static int threes = 0;
    private static boolean threesB = true;

    private static int fours = 0;
    private static boolean foursB = true;

    private int fives;
    private boolean fivesB;

    private int sixes;
    private boolean sixesB;

    private int threeOfKind;
    private boolean threeOfKindB;

    private int fourOfKind;
    private boolean fourOfKindB;

    private int fullHouse;
    private boolean fullHouseB;
    
    private int smallStraight;
    private boolean smallStraightB;

    private int largeStraight;
    private boolean largeStraightB;

    private int yahtzee;
    private boolean yahtzeeB;

    private int chance;
    private boolean chanceB;

    private int bonus = 3;

    //Roll all dice and
    public static void firstRoll()
    {
        int[] firstRoll = Dice.rollAllDice();

        d1 = firstRoll[0];
        d2 = firstRoll[1];
        d3 = firstRoll[2];
        d4 = firstRoll[3];
        d5 = firstRoll[4];        
    }

    public static void main(String[] args)
    {
        firstRoll();


        System.out.println("You rolled: " + d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
        System.out.println();

        System.out.println("These slots are currently open:");
        
        if (acesB != false)
            System.out.println("Aces");
        if (twosB != false)
            System.out.println("Twos");
        if (threesB != false)
            System.out.println("Threes");
        if (foursB != false)
            System.out.println("Fours");

        System.out.println();

        twos = 4;
        twosB = false;
        System.out.println("You played twos.");

        System.out.println();

        System.out.println("These slots are currently open:");

        if (acesB != false)
            System.out.println("Aces");
        if (twosB != false)
            System.out.println("Twos");
        if (threesB != false)
            System.out.println("Threes");
        if (foursB != false)
            System.out.println("Fours");

        System.out.println();

        System.out.println("Score is:");
        System.out.println("Aces: " + aces);
        System.out.println("Twos: " + twos);
        System.out.println("Threes: " + threes);
        System.out.println("Fours: " + fours);
    }
}
