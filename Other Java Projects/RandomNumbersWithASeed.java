// Step 1: Import Java class Scanner and Java class Random
import java.util.Random;
import java.util.Scanner;

/**
 * Create a Random object with a specified seed,
 * ask the user for the count of random numbers,
 * and generate the specified count of random
 * numbers in a specified range.
 *
 * Step 2: Enter your name for @author and today's date for @version
 * @author  
 * @version 
 */
public class RandomNumbersWithASeed
{
    // The specified seed
    public static final int SEED = 146;
    
    // The specified range
    public static final int LOW_LIMIT = 45;
    public static final int HIGH_LIMIT = 55;
    
    public static void main(String[] args)
    {
        // Step 3: Create a Scanner object to input from the keyboard

        Scanner in = new Scanner(System.in);

        
        // Step 4: Create a Random object with the specified seed
        //         and store it in a variable
        Random generator = new Random();


        // Step 5: Ask for the count of random numbers using
        //         prompt "Enter the count of random numbers: "
        
        System.out.print("Enter the count of random numbers: ");
        // Step 6: Read an integer and store it in a variable
        int count = in.nextInt();
        int size = HIGH_LIMIT - LOW_LIMIT + 1;
        
        // Step 7: Use a for loop to generate the specified count
        //         of random numbers in the specified rang and 
        //         display them on one line with a width of 3 for 
        //         each number.
        // No Magic Numbers, except 3 in the format specifier.
        
        for (int i = 0; i < count; i++)
        {
            System.out.printf("%3d",generator.nextInt(size) + LOW_LIMIT);
        }

    } 
}
