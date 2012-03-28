/*
 * This is an abstract class for the score categories.
 * The Roll class sets the boolean value that checks if that category has been
 * used or not.
 * This boolean value is initially set to false for all the score categories.
 */

public abstract class Roll
{
    //boolean to check if a category has been played or not
    boolean isPlayed = false;

    public abstract int checkValues(int dice[]);    
}
